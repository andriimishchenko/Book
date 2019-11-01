package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page109 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Поэт, прозревший истину</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Когда Хенли написал пророческие строки: «Я верховожу своей судьбой, Я капитан своей души», – он, должно быть, хотел сказать, что мы верховодим своими судьбами и Являемся капитанами наших душ постольку, поскольку в силах контролировать свои мысли.\n" +
            "<p>Он, вероятно, знал, что мысли, доминирующие в сознании, магнетизируют его. Что путями, воистину неисповедимыми, эти «магниты» притягивают к нам силы, людей, обстоятельства, приводя их в состояние гармонии с доминирующими мыслями.\n" +
            "<p>Он, может быть, хотел объяснить, что до того, как мы накопим неисчислимые богатства, надо магнетизировать сознание желанием богатства, начать мыслить категориями денег, пока жажда денег не приведет к созданию конкретных планов по их приобретению.\n</div>";
}
