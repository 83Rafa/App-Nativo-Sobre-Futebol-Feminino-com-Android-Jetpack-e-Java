package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO remover mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Corinthians Terá Time Completo Para Final", "É um fato conhecido de todos que um leitor se distrairá com o conteúdo de texto legível de uma página quando estiver examinando sua diagramação."));
        news.add(new News("Timão Chegou à Final Invícto.", "É um fato conhecido de todos que um leitor se distrairá com o conteúdo de texto legível de uma página quando estiver examinando sua diagramação."));
        news.add(new News("Final Será No Próximo Domingo", "É um fato conhecido de todos que um leitor se distrairá com o conteúdo de texto legível de uma página quando estiver examinando sua diagramação."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}