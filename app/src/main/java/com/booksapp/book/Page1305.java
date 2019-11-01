package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1305 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Мысли на заметку<h4>\n" +
            "<div class=\"text\">" +
            "<p>Отныне три простых принципа руководят Вашим интеллектом и движением по жизни. В Вашей власти, словно в тисках, невидимые силы. Они дают влияние, неизвестное большинству.\n" +
            "<p>Отныне открытия науки о мозге – инструменты Вашего самосовершенствования. Вам известна главная тайна – тайна «круглого стола».\n" +
            "<p>Десять триллионов маленьких слуг – каждая клетка мозга – формируют модели мысли, воображения и воли. Десять триллионов частиц знания, как делать деньги.\n" +
            "<p>Многие хотят богатства. Немногие его страстно желают и осмысленно движутся ему навстречу.\n</div>";
}
