package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page204 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Принципы ценою в сто миллионов</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Тем, кто не привык к тренировке ума, эти советы могут показаться бессмысленными. Может быть, таким людям будет интересно узнать, что в них сформулирована информация, полученная автором от Эндрю Карнеги. От Карнеги, начинавшего рабочим на металлургическом заводе и сумевшего, несмотря на очень плохой старт, выжать из этих принципов богатство, оцениваемое примерно в сто миллионов долларов.\n" +
            "<p>Возможно, надо еще сказать, что эти принципы одобрил старый Томас А. Эдисон, заметивший, что в них сформулирована суть не только накопления денег, – с их помощью возможно достижение любой цели.\n" +
            "<p>Принципы призывают не к «тяжкому труду», а к самопожертвованию. От Вас не требуется становиться смешным или доверчивым. Для их реализации не надо быть высокообразованным. Надо заставить работать Ваше сознание, понять, что накопление денег нельзя отдавать на волю случая, везения. Запомните: люди, накопившие крупнейшие состояния века, долго надеялись, хотели, желали, строили планы, прежде чем к ним потекли деньги.\n" +
            "<p>И еще одно: Вы никогда не станете богатым, если не «доведете до кипения» страсть к деньгам, если не поверите в свое богатство, как в себя.\n</div>";
}
