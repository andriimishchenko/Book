package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page1510 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Боитесь ли Вы неудачи в любви?<h4>\n" +
            "<div class=\"text\">" +
            "<p>Этот страх восходит ко времени полигамной семьи с ее обычаем похищения женщин и привычкой предаваться свободной любви где только возможно.\n" +
            "<p>Ревность и другие аналогичные виды неврозов вырастают из унаследованной боязни потерять объект своей любви; этот вид страха, пожалуй, самый болезненный из выделенных нами основных шести. Он вносит более всего беспорядка в жизнь тела и духа.\n" +
            "<p>В каменном веке мужчины выкрадывали женщин с применением грубой силы. Они продолжают делать это и сейчас, правда, техника изменилась. Они используют убеждение, обещают хорошую одежду, красивые машины и прочие весьма искусительные вещи, что действует ощутимо эффективней физической силы. В сравнении со временем рассвета нашей цивилизации изменились не повадки мужчин, а способы их проявления.\n" +
            "<p>Но тщательный анализ показывает, что женщины еще более подвержены этому страху. Они знают по опыту, что мужчины по своей природе полигамны и что, уж во всяком случае, их нельзя вверять в руки соперниц.\n</div>";
}
