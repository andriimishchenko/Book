package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1004 extends AppCompatActivity {
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
            "<p>Идея «мозгового центра» Эндрю Карнеги – краеугольный камень его личного и делового успеха. Теперь она Ваша – пользуйтесь! Это способ преобразования организованного, направляемого интеллекта во власть.\n" +
            "<p>Человеческий ум – это тоже энергия. Сотрудничая, интеллекты образуют «энергетический банк». Не считая третьей, невидимой силы Промысла.\n" +
            "<p>Богатство – результат плана и организации. А быть бедным – это так просто! Нищете что планировать?\n" +
            "<p>Три основных источника силы накопленного интеллекта готовы прийти к Вам на помощь. Нужна лишь Ваша воля. Нужно лишь знать как. Но ведь Вы уже знаете…\n" +
            "<p>Счастье не во владении, а в овладении.\n\n</div>";
}
