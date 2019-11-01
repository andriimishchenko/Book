package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1204 extends AppCompatActivity {
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
            "<div class=\"text\">" +
            "<p>Подсознанию все равно – работать на успех или на поражение. Выбор – за Вами. Вы сами исцелите или испепелите себя.\n" +
            "<p>Теперь Вам известны семь отрицательных чувств. Сделайте все, чтобы для них не было места в Вашем сознании. Впрягите в дело семь положительных чувств. Крепко держите вожжи!\n" +
            "<p>Ваш разум мал – настройте его на Мировой Разум. Подсознание – выше радио: посылайте молитвы и принимайте ответы. Энергия всей Вселенной поможет молитвам сбыться.\n" +
            "<p>Подсознание могущественно – не жалейте усилий и Вы овладеете им. В Вашей власти будет желание – то, что лежит в основе всего.\n" +
            "<p>Масштаб человека равен масштабу его ума.\n</div>";
}
