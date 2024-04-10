package com.tatiana.project.lesson23;

public class Main {
    public static void main(String[] args) {
        String auth = "google";
        String login = "QWERTY";
        String password = "524ddd";

        //   [Войти через Google] -> "google"
        //   [Войти через App] -> "app"
        //   [Войти через Github] -> "github"

        boolean isAuth = Auth.provider(auth).auth(login, password);

        /*
        Auth authProvider;
        if (auth.equals("google")) {
            authProvider = new GoogleAuth();

        } else if (auth.equals("github")) {
            authProvider = new GithubAuth();

        } else if (auth.equals("app")) {
            authProvider = new AppAuth();
           // boolean isAuth = appAuth.auth(login, password);
        } else {
            throw new IllegalArgumentException(
                    "Тип авторизации не может быть обработан");
        }
        boolean isAuth = authProvider.auth(login, password);
        */

        //у нас есть логика по созданию объектов authProvider
        //в тот тип данных, который создается, в тот тип(класс) и заворачивается эта логика
    }

}
