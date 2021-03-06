package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page202 extends AppCompatActivity {
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
    private String PAGE_HTML = "<h4>И он сжег корабли</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Много лет назад один великий полководец оказался перед выбором: он должен был принять решение, определившее впоследствии его победу. А противостоял полководцу враг, армия которого намного превосходила его собственную. И он погрузил своих солдат на корабли и отправил их во вражескую землю. По прибытии же приказал корабли сжечь. Перед битвой полководец обратился к армии: «Видите ли Вы дым от наших кораблей? Это значит, что если мы не победим, то не сможем живыми покинуть эти берега. Один у нас выбор: победить или погибнуть».\n" +
            "<p>И они победили!\n" +
            "<p>Желающий победить должен сжечь за собой мосты, отсечь все пути к отступлению. Только так можно сохранить жгучее желание победы, очень важное для успеха.\n" +
            "<p>…Наутро после великого чикагского пожара группа торговцев стояла на Стейт стрит среди дымящихся останков былого богатства. Они совещались – восстанавливать ли разрушенное огнем или уехать из Чикаго в другое, более счастливое место. И все решили уехать. Кроме одного.\n" +
            "<p>Маршалл Филд, торговец, решивший остаться в Чикаго, сказал: «Джентльмены, на этом самом месте Я построю величайший магазин в мире, и мне все равно, сколько раз он будет гореть».\n" +
            "<p>Это случилось около ста лет назад. Магазин был построен. Он стоит до сих пор, как памятник тому состоянию души, которое называется желанием победить.\n" +
            "<p>Конечно, Маршаллу Филду проще было уехать. Но тем он и отличался от остальных торговцев – чем практически всегда отличается достигающий успеха от терпящего поражение.\n" +
            "<p>С того дня, когда человек начинает понимать значение денег, он хочет, чтобы они у него не переводились. Но хотеть – не значит иметь. Только страстное желание богатства, переходящее в идею фикс, только планирование конкретных путей и средств его достижения, только реализация планов с настойчивостью, не признающей поражения, в один прекрасный день сделают Вас богатым.\n</div>";
}
