package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page602 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Развивайте воображение</h4>\n" +
            "<div class=\"text\">"+
            "<p>При бездействии воображение слабеет, чахнет, но не умирает. Дайте ему жизнь Вашей работой! Поскольку Вам чаще придется иметь дело с синтетическим воображением, развивайте его усерднее, особенно в период составления конкретных планов добывания денег.\n" +
            "<p>По прочтении всей книги вернитесь к этой главе. Заставьте работать воображение над составлением планов (или плана) превращения желания в деньги.\n" +
            "<p>Детальные рекомендации по построению планов даются почти в каждой главе. Выберите те, которые наиболее подходят для Вашего случая, и запишите сам план, если Вы еще этого не сделали. В момент, когда это произойдет, Ваше желание приобретает осязаемую форму. Перечитайте предыдущую фразу. Вслух. Очень медленно. Произнося, помните: Вы сделали первый из множества шагов на пути превращения мысли в реальность.\n\n</div>";
}
