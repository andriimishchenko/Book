package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page212 extends AppCompatActivity {
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

    private String PAGE_HTML = "<h4>Фокус за кулисами…</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Один небольшой параграф из газетной биографии госпожи Шуман Хайнк дает ключи к пониманию оглушительного успеха этой необыкновенной женщины и певицы. Я его процитирую: «В начале карьеры госпожа Шуман Хайнк пришла к директору Венской королевской оперы, чтобы он ее прослушал. Бросив взгляд на неловкую, бедно одетую девушку, он воскликнул отнюдь не вежливо: „С таким лицом и полным отсутствием внешности как Вы вообще можете рассчитывать на успех в опере? Мое дорогое дитя, откажитесь от этой мысли. Покупайте ка лучше швейную машину и приступайте к работе. Вы и через вечность не станете певицей“.\n" +
            "<p>Но вечность – это очень долго! Директор Венской королевской оперы знал массу вещей о технике пения. Но он мало знал о силе желания, когда оно становится идеей фикс. Иначе вряд ли бы он так легко осудил гения, не дав ему никакого шанса.\n" +
            "<p>…Несколько лет назад один из моих деловых партнеров серьезно заболел. Состояние здоровья все ухудшалось… и наконец его забрали на операцию. Впрочем, доктор предупредил меня, что нет почти никаких шансов увидеть его живым. Но пациент так не считал. Перед тем как его уложили в операционную, он прошептал: «Не беспокойтесь, шеф. Я выберусь отсюда через несколько дней». Сестра, присутствовавшая при разговоре, посмотрела на меня с сожалением. Но – пациент выжил! Когда все уже было в прошлом, врач сказал так: «Его спасло желание жить, и больше ничего. Он никогда бы не выкарабкался, если бы согласился принять смерть».\n" +
            "<p>Я убежден в действенности желания, подкрепленного верой, потому что видел, как эта сила поднимала людей из ничтожества к власти и богатству; Я видел, как она спасала потенциальных жертв; как она выступала медиумом, вызывавшим людей из небытия после сотни несчастий; как она дала моему сыну нормальную, счастливую жизнь, несмотря на то, что Природа отправила его в этот мир без ушей.\n" +
            "<p>Природа… Пользуясь странными, могущественными и никогда не разглашаемыми средствами «химии сознания», Природа маскируется под тот самый импульс страсти – никогда не признающей слова «невозможно» и не желающей знать «неудач».\n</div>";
}
