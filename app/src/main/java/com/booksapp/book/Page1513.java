package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1513 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Боязнь старости, четыре симптома<h4>\n" +
            "<div class=\"text\">" +
            "<p>Наиболее распространенными Являются следующие симптомы боязни старости:" +
            "<ol>\n" +
            "\t<li>Преждевременный спад. Имеется в виду тенденция к спаду в возрасте сорока лет (на самом деле это возраст интеллектуальной зрелости) с развитием комплекса неполноценности и ложного убеждения, что с возрастом человеческая личность деградирует.</li>\n" +
            "\t<li>«Простите мне, старику…» Именно так, извинительно, говорят многие люди, достигшие возраста сорока или пятидесяти лет. Вместо этого следовало бы произносить слова благодарности за счастье жить в возрасте мудрости и понимания.</li>\n" +
            "\t<li>Безынициативность. Инициатива, воображение, уверенность в себе пропадают у того, кто почему то решил, что уже слишком стар для проявления этих качеств.</li>\n" +
            "\t<li>Стремление молодиться. Подражание в одежде и поведении молодежи, что, естественно, выглядит нелепым в глазах окружающих, близких и дальних.</li>\n" +
            "</ol>" +
            "</div>";
}
