package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1105 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Внутренний голос</h4>\n" +
            "<div class=\"text\">"+
            "<p>Чем больше этот творческий дар используется, чем больше человек полагается на него и чем больше воображения ему требуется для импульса мысли, тем он становится более восприимчивым по отношению к движущим силам, зарождающимся вне его подсознания. Этот дар удается развивать и совершенствовать только одним путем: обращаться к нему как можно чаще.\n" +
            "<p>То, что мы называем «совестью», действует целиком и полностью с помощью шестого чувства.\n" +
            "<p>Великие художники, писатели, музыканты и поэты стали великими только по той причине, что умели или научились полагаться на «тихий застенчивый голос», звучащий в них, используя дар воображения. Это хорошо известный факт, особенно для тех, у кого сложилось глубокое впечатление, что их лучшие мысли пришли к ним в качестве или в результате, так сказать, «предчувствия».\n" +
            "<p>Один оратор достиг известности лишь после того, как обнаружил, что, закрывая глаза, он стимулирует воображение. Однажды его, уже в зените славы, спросили, зачем он это делает в самый кульминационный момент своего выступления. И он ответил: «Я делаю так потому, что прислушиваюсь к своему внутреннему голосу».\n" +
            "<p>Один из наиболее преуспевающих и хорошо известных финансистов Америки тоже имел такую привычку: он закрывал глаза на две три минуты всегда, когда ему надо было принять какое нибудь решение. Когда его спрашивали, зачем он делает это, он отвечал: «Только с закрытыми глазами Я могу приблизиться к источнику Высшего Разума».\n</div>";
}
