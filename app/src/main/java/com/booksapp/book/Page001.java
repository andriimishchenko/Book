package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class Page001 extends AppCompatActivity {
    private PageWebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        webView1 = new PageWebView(this);
        setContentView(webView1);
        webView1.showPage(PAGE_HTML1);
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

    private String PAGE_HTML1 = "<h3>ПРЕДИСЛОВИЕ</h3>\n" +
            "<div class=\"text\">\n" +
            "<p>В каждой главе моей книги рассказывается о том, как успешнее делать деньги, то есть секрете, который помог разбогатеть сотням людей. Долгие годы Я был занят анализом их карьеры.\n" +
            "<p>Впервые об этом секрете Я узнал от Эндрю Карнеги более полусотни лет тому назад. Милый и обаятельный старик шотландец как бы невзначай выдал его мне, совсем еще зеленому юнцу. После чего он – с веселыми огоньками в глазах – откинулся в кресле и стал внимательно наблюдать: хватит ли у меня ума, чтобы оценить всю значимость сказанного им.\n" +
            "<p>Увидев, как живо Я ухватился за его слова, он спросил, готов ли Я отдать лет двадцать или больше, чтобы подготовить себя к деятельности по распространению формулы успеха во всем мире – ради тех, кто, не обладая ею, может остаться неудачником на всю жизнь. Я сказал, что готов, и сдержал слово.\n" +
            "<p>Волшебная формула успеха выведена из идеи мистера Карнеги, принесшей ему колоссальное состояние, и должна поступить на вооружение людей, не имеющих времени на долгое и кропотливое исследование того, как делаются деньги. Карнеги надеялся, что Я смогу проверить правильность его утверждений и изложить их людям любого пола, возраста и профессии.\n" +
            "<p>Он утверждал, что эту науку нужно ввести во все школы и колледжи и что при надлежащем ее преподавании в системе образования произойдут революционные изменения, сокращающие время обучения не менее чем наполовину.\n</div>";
            }
