package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page702 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Продать можно все</h4>\n" +
            "<div class=\"text\">"+
            "<p>Для успеха в любом деле существенным Является разумное планирование. Ниже следуют подробные инструкции для начинающих карьеру с предложения своих услуг. Продаются как услуги, так и нетривиальные идеи. Когда нет другой собственности, что может быть лучше идей и способностей? Продайте ка их получше! Все огромные состояния начинались именно с этого.\n</div>";
}
