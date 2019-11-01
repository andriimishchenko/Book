package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page1524 extends AppCompatActivity {
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
            "<p>Страхи есть у всех, и некоторые из них оправданы. Но иные страхи зарождаются и растут без нашего ведома. Они растут из нерешительности и сомнения. Вон их!\n" +
            "<p>Расскажите мне Ваше алиби – и Я расскажу о Вас. Алиби не нужно тому, кто думает – и (стало быть!) богатеет.\n" +
            "<p>Не в деньгах счастье? Но именно деньги помогают обрести счастье, долголетие, наслаждение и душевный покой.\n" +
            "<p>Здоровье – величайшее богатство. Победите страх – и Вы избавитесь от болезней, вызываемых страхом. Величайшие сокровища ждут, чтобы Вы их взяли!\n" +
            "<p>Смелость города берет.\n</div>";
}
