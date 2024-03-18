package com.tatiana.project.lesson13;

public sealed interface IAuth /*extends Runnable*/ permits Auth01, Auth02 {
    boolean authenticate(String username);
}
