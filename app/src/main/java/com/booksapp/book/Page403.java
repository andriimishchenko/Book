package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page403 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>И вдохновение поведет Вас…</h4>\n"+
            "<div class=\"text\">"+
            "<p>Вначале у Вас, конечно же, нет конкретного плана завоевания мира – обретения тех денег, которые Вы видите воочию, которыми Вы бредите. Не дожидайтесь плана – думайте о Ваших деньгах, ведь такое состояние сознания как раз и подстегивает подсознание. Вам остается только быть наготове. Идея придет в голову как «вспышка», как «вдохновение». Вдохните – и немедленно приступайте к делу.\n" +
            "<p>Когда Вы выполняете четвертую из шести рекомендаций («Составьте конкретный план исполнения желания и сразу же приступайте к его реализации»), ради Бога, не доверяйте Вашему здравому смыслу. Он не только зачастую ленив, но и, если полностью на него полагаться, по природе своей больше привык разочаровывать, чем служить. Когда (с закрытыми глазами) Вы вызываете образ денег, представьте одновременно, что Вы собираетесь с ними делать (вложить в службу сервиса, в торговлю), когда их получите. Это важно!\n\n</div>";
}
