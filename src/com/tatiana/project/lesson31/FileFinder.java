package com.tatiana.project.lesson31;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;
// задача для ForkJoinPool
// Future контейнер
// ForkJoinTask - тип
// RecursiveTask<return type> | RecursiveAction - два подтипа
public class FileFinder extends RecursiveTask<File> /* RecursiveAction */ {
   //наш другой тип задач
    private File file;
    private File directory;

    public FileFinder(File file, File directory) {
        if (file == null)
            throw new IllegalArgumentException("file is null");
        this.file = file;
        if (directory == null || !directory.isDirectory())
            throw new IllegalArgumentException("error in directory");
        this.directory = directory;
    }

    //начинается поиск файла в директории, если сначала находит директорию, то задача переходит другому потоку, задача
    //на поиск файла в этой директории

    @Override
    protected File compute() {
        File[] subFiles = directory.listFiles(); //поток смотрит вдиректорию и получает список того, что там есть
        List<FileFinder> fileFinders = new ArrayList<>(); //смотрит на то, что там есть
        if (subFiles != null){
            for (File subFile : subFiles) {
                if (subFile.isDirectory()){ //если натыкается на директорию, то поток создает подзадачу искать файл в директории, на которую он наткнулся
                    FileFinder subFinder = new FileFinder(file, subFile);  //subFinder - это подзадача для пула(для нас подзача, а для пула она просто новая задача
                    subFinder.fork();
                    fileFinders.add(subFinder); //подзадачу кладет в свой список, у каждого потока список свой
                } else {
                    if (file.getName().equals(subFile.getName())){
                        return subFile.getAbsoluteFile(); //возвращает абсолютный путь на этот файл
                    }
                }
            }
        } //каждый поток должен собрать инфу о том, справились ли с задачей найти файл от всех своих созданнных подзадач и потоков
        for (FileFinder fileFinder : fileFinders) { //каждый поток перебирает список созданных им подзадач
            //каждую подчадачу опрашивает нашла она файл или нет
            File found = fileFinder.join();
            if (found != null && found.getName().equals(file.getName())){
                return found.getAbsoluteFile(); //если нашла файл, то получим его
            }
        }

        return null; //если не нашла подзадача файл, то вернет нал ссылку
    }
}
