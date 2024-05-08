package com.tatiana.project.lesson29;

import com.tatiana.project.lesson28.Product;

import java.io.File;
import java.util.List;
import java.util.Map;

public class TopOfWords {
     /*
    Реализовать многопоточный подсчет ТОП-10 слов.
    Текст хранится в файле.
    Main поток читает текст из файла и объединяет результаты работы вспомогательных потоков.
    Вспомогательные потоки обрабатывают информацию, прочитанную main потоком.
    Вспомогательные потоки создаются по количеству доступных ядер процессора:
    int numberOfThreads = Runtime.getRuntime().availableProcessors();
     */
     private Map<String, Integer> words;
     private final File file = new File("words.txt");
     private int max;

     public TopOfWords(Map<String, Integer> words) {
          this.words = words;
     }

     public Map<String, Integer> getWords() {
          return words;
     }

     public void setWords(Map<String, Integer> words) {
          this.words = words;
     }

     public File getFile() {
          return file;
     }

     public int getMax() {
          return max;
     }

     public void setMax(int max) {
          this.max = max;
     }

     @Override
     public void run() {
          synchronized (words) {

          }
}
