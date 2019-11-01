package com.booksapp.book;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page102 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Случай Является с черного хода</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Случай, однако, пришел оттуда, откуда Барнс меньше всего ожидал. Это вообще одно из основных свойств случая. Он имеет коварное обыкновение пользоваться черным ходом и часто скрывается под маской временной неудачи или даже поражения. Возможно, поэтому столько людей не могут распознать его.\n" +
            "<p>Как раз в то время мистер Эдисон усовершенствовал новый аппарат, известный как Диктующее Устройство Эдисона. Торговые агенты, правда, не были в восторге. Они не верили, что его удастся прождать без огромных усилий.\n" +
            "<p>Барнс понял, что сможет сбыть этот аппарат. Он предложил свои услуги Эдисону и тут же получил шанс. И он продал! Продал так скоро, что Эдисон подписал с ним контракт на распространение и сбыт товара по всей стране. Это деловое сотрудничество принесло деньги, но дало и неизмеримо большее: Барнс убедился в том, что каждый может стать богатым, если научится думать.\n" +
            "<p>Я не знаю, какие первоначальные дивиденды принесло желание Барнса. Может быть, два или три миллиона долларов, но эта сумма, какова бы она ни была, ничтожна в сравнении с твердым знанием: мысль, при соблюдении известных принципов, можно превратить в материальные ценности.\n</div>";
}
