package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page703 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>С чего начинается руководство</h4>\n" +
            "<div class=\"text\">"+
            "<p>Вообще говоря, человечество делится над два типа людей. Первый тип – лидеры, второй – исполнители. С самого начала Вы должны решить, в чем Ваше призвание – управлять или исполнять. Разница в доходах бывает колоссальной. Исполнители не имеют достаточно оснований претендовать на такое же вознаграждение. Но они часто делают ошибку, считая, что с ними поступают несправедливо.\n" +
            "<p>Быть исполнителем совсем не зазорно. С другой стороны, здесь нечем гордиться. Большинство из тех, кто нынче руководит, начинали в должности исполнителей. Они стали хорошими руководителями только потому, что были умными исполнителями. За малыми исключениями те, кто не может с должной сообразительностью исполнять решения, не станут и квалифицированными руководителями. И наоборот, изобретательные исполнители обычно в очень короткие сроки проявляют себя и учатся принимать самостоятельные решения. Умный исполнитель имеет ряд преимуществ. И кроме того, всегда можно набраться ума разума у лидеров.\n\n</div>";
}
