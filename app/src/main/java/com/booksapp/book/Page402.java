package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page402 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Представьте, что Вы делаете деньги</h4>\n"+
            "<div class=\"text\">"+
            "<p>Для того чтобы хорошо выполнять инструкции, содержащиеся в предыдущей главе,\n" +
            "<p>Вам надо научиться концентрировать свое внимание. Вспомним «шесть принципов». Первый из них гласит «Зафиксируйте в сознании точное количество денег, которое Вы желаете иметь». Что же надо делать? Закройте глаза и так долго фиксируйте сознание на точной цифре денег, пока они не появЯтся перед Вами в физическом обличье. Делайте упражнения по меньшей мере один раз в день, после чего переходите к рекомендациям, даваемым в главе о вере.\n" +
            "<p>Важность феномена веры трудно переоценить. Подсознание воспринимает отдаваемые ему приказы только тогда, когда они базируются на абсолютной вере. Памятуя об этом утверждении, обдумайте возможность устроить Вашему подсознанию такой совершенно законный «трюк»: заставьте его поверить, что Вы обязаны иметь количество денег, визуализированное сознанием; что деньги просто лежат до востребования Вами; что подсознание должно дать Вам практические планы обретения этих – ваших! – денег. Заставьте его поверить – ведь Вы же верите!\n" +
            "<p>Недурная идея, не правда ли? Вдохновитесь ею – и Вы увидите, на что способно Ваше воображение!\n\n</div>";
}
