package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page808 extends AppCompatActivity {
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
            "<p>Нерешительность – существенная причина неудач. Ваш, а не чужой мозг управляет Вашим миром. Так же как решение, принятое в 1776 году в Филадельфии, до сих пор придает Америке силы и уверенности.\n" +
            "<p>Дух, делающий себя сам, настроен на волну сил, управляющих миром.\n" +
            "<p>Будьте решительны с нерешительностью – своей и чужой.\n" +
            "<p>Чтобы принимать эффективные решения, анализируйте, как это делали другие.\n" +
            "<p>Страстное желание свободы приносит свободу. Страстное желание богатства приводит к богатству.\n" +
            "<p>В основе могущества лежит могущество личности.\n\n</div>";
}
