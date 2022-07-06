package me.dio.soccernews;

import android.app.Application;

public class App extends Application {

    private static App instance;

    // O ideal seria usar uma solução de injeção de dependências
    public static App getInstance() { return instance; }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
