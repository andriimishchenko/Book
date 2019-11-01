package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page913 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Мысли на заметку</h4>\n" +
            "<div class=\"text\">"+
            "<p>Настойчивость переплавляет человека так же, как уголь превращает руду в высококачественную сталь. Настойчивость поможет Вам развить до совершенства умение мыслить категориями денег, а Ваше подсознание станет «монетной фабрикой», их печатающей.\n" +
            "<p>Повторите восемь пунктов, рассказывающих, как воспитать в себе настойчивость. Повесьте их перечень на стену, пусть он будет вроде постоянной мишени для Вашей целеустремленности.\n" +
            "<p>Люди типа Фэнни Херст, Кэйт Смит, Л.М. Филдс дают нам бесценный урок абсолютной необходимости настойчивости. Магомет и другие показывают, как настойчивость меняет весь ход истории.\n" +
            "<p>Четыре простых шага ведут к привычке быть настойчивым, а также устраняют нежелательные влияния на Ваше сознание и подсознание, влияния, от которых, Вы, может быть, еще не до конца освободились.\n" +
            "<p>Если гора не идет к Магомету – Магомет идет к горе.\n\n</div>";
}
