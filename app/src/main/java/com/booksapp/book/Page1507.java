package com.booksapp.book;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1507 extends AppCompatActivity {
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
                Intent intent = new Intent(getBaseContext(), Page1508.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML = "<h4>Боязнь критики: семь симптомов<h4>\n" +
            "<div class=\"text\">" +
            "<p>Этот вид страха почти так же универсален, как и страх нищеты, а его последствия так же фатальны для личности из за того, что боязнь критики разрушает инициативу и делает бессмысленными любые усилия воображения. Итак, основные симптомы:" +
            "<ol>\n" +
            "\t<li>Застенчивость – обычно выражается в нервности, робости в разговоре и при встрече с незнакомыми, в неловкости движений, бегающих глазах.</li>\n" +
            "\t<li>Неуравновешенность – неумение контролировать свой голос, нервозность в присутствии посторонних, плохая осанка и память.</li>\n" +
            "\t<li>Слабохарактерность – нетвердость при принятии решений, отсутствие обаяния и умения четко объясниться; привычка «откладывать на завтра», бездумное соглашательство с чужим мнением.</li>\n" +
            "\t<li>Комплекс неполноценности – самоутверждение Языком; привычка говорить «громкие слова», чтобы произвести впечатление (зачастую – при незнании истинного значения этих слов); подражательство в манере одеваться, говорить и вообще в манерах, пристрастие к сочинительству – в основном на тему о своих достижениях. Такие люди часто кажутся самоуверенными.</li>\n" +
            "\t<li>Экстравагантность – стремление к тому, чтобы все было, «как у людей», а это неизбежно оборачивается жизнью не по средствам.</li>\n" +
            "\t<li>Безынициативность – неумение использовать возможности для самопродвижения; боязнь высказывать свою точку зрения, неуверенность в своих идеях, уклончивость ответов в разговоре с вышестоящими; неуклюжесть в манерах и речи; лживость.</li>\n" +
            "\t<li>Отсутствие самолюбия – леность души и тела; медлительность в решениях, внушаемость, неумение и нежелание самоутвердиться; пристрастие говорить гадости за спиной и льстить в глаза; непротивление неудачам, привычка бросать с легким сердцем любые начинания при малейшей оппозиции со стороны, безосновательная подозрительность; бестактность в разговоре; нежелание признавать свои ошибки.</li>\n" +
            "</ol>" +
            "</div>";
}
