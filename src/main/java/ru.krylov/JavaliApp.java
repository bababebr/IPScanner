package ru.krylov;

import io.javalin.Javalin;

public class JavaliApp {

    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.start(7000);
        app.get("/hello", ctx -> ctx.html("Hello, Javalin!"));
    }

}

