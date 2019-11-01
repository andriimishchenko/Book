package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page715 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Каковы Ваши условия?</h4>\n" +
            "<div class=\"text\">"+
            "<p>Если Вы продаете свои услуги, то подведение итогов за год, с тщательным самоанализом, для Вас так же существенно, как инвентаризация в конце года для торговца. Более того, ежегодный анализ позволит снизить количество ошибок и повысить самоотдачу, воспитывая нужные качества. Вы сразу же заметите, продвинулись Вы, стоите ли на месте или опустились на несколько ступенек. Естественно, преуспевающий человек всегда служит хорошим примером. Ежегодный анализ позволит увидеть все Ваши успехи и если в чем то есть прогресс, то каков он на деле. Если Вы хотите преуспеть в продаже своих услуг, то ежегодное движение вперед, даже очень медленное, жизненно необходимо.\n" +
            "<p>Вы можете заняться подведением итогов в самом конце года, чтобы иметь возможность поздравить себя с какими нибудь достижениями, хотя бы и мысленно. Помочь Вам в таком самоанализе призваны вопросы, которые Вы найдете ниже. Просмотрите их, и пусть кто нибудь, кто не позволит Вам обманывать самого себя, проверит ответы.\n\n</div>";
}
