package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page503 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Алло! Знание?</h4>\n" +
            "<div class=\"text\">"+
            "<p>Прежде всего решите, какой именно вид специальных знаний Вам необходим и для чего. Если Ваше намерение серьезно, а планы рассчитаны на длительную перспективу, определиться Вам поможет цель, к которой Вы идете. Далее позаботьтесь о надежных источниках этих знаний. Важнейшие из них:" +
            "<ol>\n" +
            "\t<li>Ваш собственный жизненный опыт и образование.</li>\n" +
            "\t<li>Знания и опыт, полученные в результате кооперации с другими умными людьми (альянс умов, так сказать).</li>\n" +
            "\t<li>Колледжи и университеты.</li>\n" +
            "\t<li>Публичные библиотеки (книги и периодика, в которых сконцентрированы все знания, накопленные цивилизацией).</li>\n" +
            "\t<li>Специальные учебные курсы (вечерние школы и обучение на дому в особенности).</li>\t\n" +
            "</ol>" +
            "<p>Знания сами по себе не имеют никакой ценности. Но коль скоро знания получены, их нужно систематизировать и сделать пригодными к использованию для достижения конкретной цели. А для этого необходим, как Вы помните, план практических действий.\n" +
            "<p>Если Вы обдумываете возможность получить дополнительное образование, сначала определите, зачем Вам это нужно, а потом уже узнавайте, где это можно сделать.\n" +
            "<p>Преуспевающие в любом виде деятельности люди никогда не перестают интересоваться специальной литературой, имеющей отношение к их бизнесу или профессии. Наоборот. Известна распространенная ошибка большинства неудачников, наивно полагающих, что все знания они уже получили в школе. На самом же деле система образования всего лишь показывает путь, которым человек может приобрести необходимые ему, в том числе и практические, знания.\n" +
            "<p>Требование эпохи – специализация. Эту истину подтверждает попавшая на страницы газет история, которую рассказал Роберт П. Мур (в прошлом директор по кадрам Колумбийского университета).\n" +
            "\n</div>";
}