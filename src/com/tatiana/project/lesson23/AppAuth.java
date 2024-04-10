package com.tatiana.project.lesson23;

class AppAuth implements Auth {
    @Override
    public boolean auth(String login, String password) {
        return false;
    }
}