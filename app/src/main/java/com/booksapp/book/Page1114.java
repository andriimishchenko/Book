package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1114 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Поверьте в свою гениальность</h4>\n" +
            "<div class=\"text\">"+
            "<p>Секс сам по себе – великая побудительная сила, но сила его подобна циклону – она стихийна и трудно поддается контролю. Когда же сексуальное влечение смешано с чувством любви, стремления становятся более уравновешенными, суждения более спокойными, переживания гармонируют с внутренним миром. Кто из тех, кому уже исполнилось сорок, настолько неудачлив, что не способен проанализировать это утверждение и подтвердить его собственным опытом?\n" +
            "<p>Когда, движимый страстью, основанной только на сексуальном чувстве, мужчина хочет понравиться женщине, он может добиться всего. Однако его действия импульсивны, а иногда и разрушительны. Тот, кто находится под влиянием всепоглощающего влечения, в истоках которого лежит секс и только, способен и украсть, и смошенничать, и совершить убийство. Но если сексуальные чувства возникают в результате любви, если любовь и секс сливаются в одно, тот же самый человек ведет себя разумно, взвешенно и достойно.\n" +
            "<p>Любовь, влечение и секс способны подвигнуть сильных людей к сверхдостижениям. Любовь пробуждает в человеке такие чувства, которые служат ему в качестве предохранительного клапана, гарантируя выдержку и конструктивность усилий. В сочетании все три чувства могут поднять до уровня гения кого угодно.\n" +
            "<p>Чувства – это состояние сознания. Природа обеспечила человека «химической лабораторией» сознания, которая действует подобно хорошо организованному химическому производству. Ведь общеизвестно, что химия, смешивая определенные компоненты, сами по себе довольно безвредные, может создать сильнодействующий Яд. Человеческие чувства, смешиваясь в определенной пропорции, могут стать таким же Ядом. Страсть и ревность вполне способны превратить человека в бешеное животное.\n" +
            "<p>Путь к гениальности лежит через сексуальное развитие, использование секса, любви и увлечений и контроль над ними. Коротко процесс этот можно описать в следующих выражениях:\n" +
            "<p>Поддержите в себе конструктивные чувства и мысли, постарайтесь сделать их преобладающими в Вашем сознании. И наоборот, подавляйте в себе разрушительные эмоции. Сознание существует благодаря мыслям, питающим его. С помощью силы воли можно заставить себя культивировать одни мысли и уничтожать, как сорняки, другие. Если у Вас есть хоть немножко силы воли, то контролировать свое сознание проще простого. Контроль за ним начинается с настойчивости, переходящей в привычку.\n" +
            "<p>Секрет же контроля как раз и раскрывается в области сублимации, преобразования сексуальной энергии. Если Вас одолевают отрицательные эмоции или разрушающие душу чувства, их можно преобразовать в положительные и конструктивные простым способом: направить Вашу мысль на что либо дельное, созидательное.\n" +
            "<p>Другого пути к гениальности, кроме как сознательной работы над самим собой, нет! Конечно, обуреваемый только сексуальной энергией человек может добиться и, как правило, добивается высот в финансовой и предпринимательской деятельности. Но опыт показывает, что это так сильно влияет на характер, что лишает человека способности наслаждаться огромным состоянием и даже удержать его. Последнее заслуживает внимания и анализа, поскольку здесь заложена какая то непреходящая истина, знание которой поможет не только мужчинам, но и женщинам. Игнорирование ее приводит к тому, что тысячи людей лишаются счастья, даже обладая миллионами.\n</div>";
}
