package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page303 extends AppCompatActivity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
 ActionBar actionBar = getSupportActionBar();
actionBar.setHomeButtonEnabled(true);
actionBar.setDisplayHomeAsUpEnabled(true);
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>«Мысль без веры мертва есть»</h4>\n"+
            "<div class=\"text\">"+
            "<p>На протяжении веков жрецы от религии увещевали человечество верить в тот или иной догмат, но не могли сказать людям, как приобрести эту веру. Однако никто никогда не формулировал мысли таким образом: «Вера – это такое состояние сознания, которое может быть вызвано самовнушением».\n" +
            "<p>На Языке, доступном для понимания всякому нормальному человеку, обобщим все, что известно о принципах, посредством которых вера может быть усовершенствована даже там, где ее, казалось бы, нет.\n" +
            "<p>Верьте в себя: вера – в Бесконечном. Вера – «эликсир вечности», дающий жизненную силу и действенность порыву мысли! Вера – это точка опоры для накопления богатства! Вера – это основание «чудес» и всех тех тайн, которые не могут быть открыты по правилам науки. Вера – единственное противоядие от неудачи! Вера – это «химический элемент», в соединении с молитвой устанавливающий прямую связь с Высшим Разумом. Вера – это элемент, трансформирующий обычное движение мысли в конечном, смертном сознании человека в его духовный эквивалент, в молитвенный трепет сознания. Вера – единственный посредник, с помощью которого можно использовать космические силы Высшего Разума.\n\n</div>";
}
