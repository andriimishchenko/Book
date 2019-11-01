package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page104 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Успех за шаг до поражения</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Желание можно превратить в золото. С тех пор как мистер Дерби сделал это открытие, он многократно возместил свои потери.\n" +
            "<p>Занявшись страхованием жизни, он решил извлечь урок из печального опыта своей юности. Простой урок: «Я бросил дело, когда золото было буквально под ногами. Но Я уже никогда не откажусь от намеченного из за того, что кто то не желает купить у меня страховой полис».\n" +
            "<p>И Дерби стал одним из немногих, продававших страховки на миллионы долларов в год.\n" +
            "<p>…Перед тем как в Вашу жизнь придет успех, сколько же временных неудач и даже поражений Вам придется перенести! И действительно, когда неудачи преследуют нас, самое простое и логичное – бросить дело. Как, собственно, большинство из нас и поступает. Не так ли?\n" +
            "<p>Автор этой книги проинтервьюировал 500 человек из числа наиболее удачливых, кого когда либо давала миру Америка. Так вот, все они говорили, что самая сумасшедшая удача приходила к ним за шаг до поражения. Ах, поражение… Пройдоха с невинным взглядом и тонким, но жестоким чувством юмора. И особое удовольствие доставляет ему подловить человека на грани успеха!..\n</div>";
}
