package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page504 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Требуются специалисты</h4>\n" +
            "<div class=\"text\">"+
            "<p>Среди кандидатов на службу в компании имеют преимущество выпускники школ бизнеса с навыком работы по отчетности и статистике, инженеры разных профилей, журналисты, архитекторы, химики, а также одаренные школьные лидеры и просто энергичные ребята последнего года обучения.\n" +
            "<p>Преимуществом среди прочих студентов, хорошо успевающих в строго академическом смысле, пользуется тот, кто выделяется активностью в кампусе, опережает всех по большинству показателей и выполняет дополнительную, соответствующую его уровню работу. Некоторые из таких кандидатов впоследствии получают сразу несколько предложений на занятие должности, особо одаренные – до шести.\n" +
            "<p>Вот как в письме к мистеру Муру одна из крупнейших индустриальных компаний сформулировала свои пожелания: «Мы заинтересованы в поиске людей, умеющих нетривиально управлять производством. По этой причине мы придаем особое значение качествам характера, личности и интеллекта – в гораздо большей степени, чем обычному специальному образованию.\n\n</div>";
}
