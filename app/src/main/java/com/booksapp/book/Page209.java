package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page209 extends AppCompatActivity {
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private String PAGE_HTML = "<h4>Что остановит бурю</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Сейчас, ретроспективно анализируя события, Я могу сказать, что потрясающие результаты, достигнутые сыном, напрямую связаны с его верой в меня. Он не оспаривал ничего из того, что Я ему говорил. Я внушал ему идею, что он имеет очевидное преимущество перед старшим братом, которое будет проявляться множеством способов. Например, учителя в школе, заметив, что у него нет ушей, будут уделять ему особое внимание и обращаться к нему особенно ласково. И он видел, что так и есть. Или же, говорил Я ему, когда он подрастет и начнет продавать газеты (а его старший брат уже это делал), у него будет огромное преимущество перед братом, потому что люди станут давать ему больше чаевых, видя, какой он жизнерадостный, деловитый мальчик, несмотря на свой недостаток.\n" +
            "<p>Когда ему было около семи, появились первые признаки того, что наши методы «прогнозирования» приносят плоды. В течение нескольких месяцев он выпрашивал у нас как привилегию разрешение продавать газеты, но его мать не соглашалась.\n" +
            "<p>В конце концов мальчик все решил сам. Однажды, когда мы оставили его дома с прислугой, он выбрался на улицу через кухонное окно, одолжил шесть центов у обувщика по соседству, инвестировал этот первоначальный капитал в газеты, продал их, реинвестировал, и так далее до вечера. После подведения баланса и расчета с «банкиром» чистый доход составил сорок два пенса. Когда мы вечером вернулись домой, то обнаружили его крепко спящим. Один кулачок был плотно сжат.\n" +
            "<p>Мать разжала кулачок, вытащила монеты и заплакала. Однако! Плакать над первой победой, казавшейся недостижимой! Моя реакция была обратной. Я от души смеялся, потому что убедился: моя настойчивость по внушению в сознание ребенка веры в себя оказалась плодотворной.\n" +
            "<p>В этом первом «деловом предприятии» мать увидела маленького мальчика, вышедшего на улицу и рисковавшего жизнью, чтобы заработать деньги. А Я увидел смелого, амбициозного и самонадеянного маленького бизнесмена, у которого удвоилась вера в себя, потому что он занялся предпринимательством по собственной инициативе и победил. Эта перемена порадовала меня – она говорила о жизненной силе, которая будет сопутствовать ему всю жизнь.\n</div>";
}
