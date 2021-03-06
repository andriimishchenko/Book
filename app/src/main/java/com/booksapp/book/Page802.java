package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page802 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Как делается история</h4>\n" +
            "<div class=\"text\">"+
            "<p>Зачастую принятие значимых решений требует немало мужества и связано с риском для жизни. Это относится ко всем великим решениям, определяющим развитие цивилизации.\n" +
            "<p>Решение провозгласить знаменитую Декларацию о равноправии, давшую свободу цветному населению Америки, принималось президентом Линкольном с полным пониманием того, что тысячи друзей и политических сторонников отвернутся от него.\n" +
            "<p>Решение философа Сократа выпить кубок с Ядом, но не идти на компромисс со своими убеждениями, было решением, исполненным мужества. Минуло уже немало веков, но благодаря ему мы пользуемся сегодня свободой слова и свободой мысли.\n" +
            "<p>Когда генерал Роберт Э. Ли разошелся с Союзом и принял мужественное решение стать на сторону юга, он лучше других понимал, что это может стоить ему жизни и уж во всяком случае унесет немало жизней добровольцев.\n\n</div>";
}
