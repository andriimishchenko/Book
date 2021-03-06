package com.booksapp.book;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1523 extends AppCompatActivity {
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
                Intent intent = new Intent(getBaseContext(), Page1524.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML = "<h4>Фатальная привычка<h4>\n" +
            "<div class=\"text\">" +
            "<p>Построение алиби для объяснения своих неудач – это национальное развлечение, а точнее, национальное бедствие. Эта привычка стара как мир и фатальна для успеха! Но почему же люди так привязаны к своим алиби? Для меня ответ очевиден: потому что это их алиби. Алиби – дитя воображения. А человеческой натуре свойственно беречь свое дитя.\n" +
            "<p>Конечно, это весьма глубоко укоренившаясЯ привычка. А как известно, от привычек очень нелегко избавляться, особенно если они касаются чего либо, оправдывающего наши действия. Платон имел в виду эту истину, когда говорил: «Главная победа – победа над своим „я“. Быть побежденным своим „я“ – и стыдно, и низко».\n" +
            "<p>Об этом же думал и другой философ: «Велико же было мое удивление, когда Я обнаружил, что уродства, замечаемые в других, суть отражение моей собственной натуры».\n" +
            "<p>А Элберт Хаббард сказал так: «Для меня всегда оставалось загадкой, почему люди столько времени тратят на самообман, создавая алиби, для покрытия своих слабостей. Этого времени как раз хватило бы на исправление недостатков, и алиби были бы не нужны».\n" +
            "<p>Попутно напомню и такую мысль: «Жизнь – шахматная доска, и противостоит Вам время. Пока Вы колеблетесь и уклоняетесь от хода, время ест фигуры. Вы играете с соперником, не прощающим нерешительности!»\n" +
            "<p>Если раньше у Вас еще было объяснение, почему не удается заставить жизнь отдать то, что Вы от нее хотите, то теперь в Вашем распоряжении Ключ Управления Жизнью, открывающий дверь в ее сокровищницу.\n" +
            "<p>Ключ этот неосязаем, но могуществен! В привилегии Вашего сознания – породить желание богатства. Попытка – не пытка. Но за неиспользованные возможности всегда приходится платить: цена – неудача. Воспользуйтесь же Ключом Зажигания Успеха – и щедрой наградой Вам будет удовлетворение. Удовлетворение, приходящее ко всякому, кто победил себя, кто потребовал сполна – и получил сполна!\n" +
            "<p>Награда достойна усилий. Начнем? Убедимся?\n" +
            "<p>Бессмертный Эмерсон сказал: «Нас тянет друг к другу. Значит, мы обречены встретиться». Воспользуюсь же его мыслью: «Нас тянуло друг к другу, дорогой читатель. И мы встретились – на этих страницах».\n</div>";
}
