package com.booksapp.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1502 extends AppCompatActivity {
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.item1:
                Intent intent = new Intent(getBaseContext(), Page1503.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML = "<h4>На распутье<h4>\n" +
            "<div class=\"text\">" +
            "<p>Между нищетой и богатством не бывает компромиссов. Дороги, ведущие к ним, диаметрально противоположны. Если Вы хотите богатства, не воспринимайте обстоятельств, ведущих к нищете: не замечайте их – они для Вас не существуют (кстати, слово «богатство» мы употребляем в самом широком значении, имея в виду не только материальное, финансовое, но и духовное, интеллектуальное богатство). Что же, вспомним опять, что путь к процветанию начинается с желания процветания. В главе «Желание» мы, как могли, объяснили, что Вам следует делать. И как раз в этой главе – о страхе – Вы имеете прекрасную возможность на практике реализовать наши рекомендации.\n" +
            "<p>Приступайте – и сразу станет очевидным, что из нашей философии Вы успели усвоить. Приступайте – Вы можете стать пророком своей судьбы и в точности предсказать, какое будущее Вам уготовано. Ибо если по прочтении этой главы\n" +
            "<p>Вы все еще согласны принимать нищету, – что же, Вы ее и получите! Неизбежно.\n" +
            "<p>Если Вы желаете богатства, определитесь, в какой форме и сколько Вы его хотите. Дорога Вам известна – Я ведь дал карту дорог, которая, при точном следовании, не позволит сбиться с пути. Если Вам не по силам начинать или же Вы остановитесь, не дойдя до цели, – не вините никого, кроме себя. Только Вы ответственны за свои поступки – никакое алиби не спасет от ответственности, потому что есть одна вещь, которая целиком в Вашей власти: это состояние Вашего сознания. Вдумайтесь: состояние Вашего сознания. Его не покупают – его создают.\n</div>";
}
