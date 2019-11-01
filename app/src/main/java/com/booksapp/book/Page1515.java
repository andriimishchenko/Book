package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1515 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Боязнь смерти: три симптома<h4>\n" +
            "<div class=\"text\">" +
            "<ol>\n" +
            "\t<li>Мысли о смерти. Эта привычка более распространена среди пожилых людей, но даже молодые часто думают о небытии, вместо того чтобы наслаждаться жизнью. Нередко это происходит из за отсутствия цели существования либо из за неспособности (впрочем, второе слишком связано с первым) отыскать подходящую профессию. Наилучшее лекарство от страха смерти – страстное желание достичь чего либо, подкрепленное осмысленным служением другим. Занятой человек о смерти не думает.</li>\n" +
            "\t<li>Связь со страхом нищеты. Боязнь приближения собственной нищеты либо нищеты, приходящей вследствие чьей либо смерти.</li>\n" +
            "\t<li>Связь с болезнью или неуравновешенностью. Болезнь может привести к депрессии. Разочарование в любви, религиозный фанатизм, сильный невроз или невменяемость также могут стать причиной страха смерти.</li>\n" +
            "</ol>" +
            "</div>";
}
