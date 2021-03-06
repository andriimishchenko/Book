package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page111 extends AppCompatActivity {
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private String PAGE_HTML = "<h4>Мысли на заметку</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Неважно, как Вы сегодня одеты и сколько у Вас денег. Ибо, как Эдвин Барнс, успеха добивается только тот, кто к нему стремится.\n" +
            "<p>Чем дольше Вы идете к успеху, тем он становится ближе. Слишком многие бросают дело за шаг до победы. Запомните: этот шаг сделают другие.\n" +
            "<p>Целеустремленность – пробный камень любого достижения, большого или малого. Сильный мужчина будет побежден целеустремленным ребенком. Измените представления о своем предназначении – и Вы достигнете того, что сегодня кажется Вам неосуществимым.\n" +
            "<p>Внушите Вашу веру и настойчивость другим, как это сделал Генри Форд, и Вы добьетесь исполнения невозможного.\n" +
            "<p>Все, что желаемо и представимо, – достижимо.\n</div>";
}
