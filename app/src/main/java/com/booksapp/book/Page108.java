package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page108 extends AppCompatActivity {
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
    private String PAGE_HTML = "<h4>Хочу – значит, будет!</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Когда Генри Форд решил выпускать автомобиль знаменитой марки «V 8», он захотел построить мотор, в котором все восемь цилиндров были бы заключены в одном блоке. Сказано – сделано, и Форд дал соответствующее указание. Все инженеры до одного сошлись в том, что просто невозможно объединить восемь цилиндров.\n" +
            "<p>Форд сказал: «В любом случае сделайте». Инженеры настаивали: «Это невозможно». «Работайте до тех пор, – приказал Форд, – пока не будет результата. Сколько бы времени для этого ни потребовалось». И инженеры работали – у них не было другого выхода, ибо они хотели остаться у Форда. Прошло шесть месяцев – никаких результатов. А потом еще шесть месяцев. Они испробовали все мыслимые варианты, но штука не поддавалась: «Невозможно!» В конце года они доложили Форду, что так и не нашли способов реализации его указания.\n" +
            "<p>«Продолжайте работать, – сказал Форд. – Я этого хочу. Значит, это будет». Они продолжали работать, и наконец то в один прекрасный день орешек был расколот. Настойчивость Форда победила.\n" +
            "<p>Может быть, в этой истории Я ошибся в каких то мелочах, но за результат и обстоятельства – ручаюсь. Вы – кто хочет думать и, стало быть, богатеть – извлеките из нее секрет фордовских миллионов. Полагаю, Вам не придется искать его слишком долго.\n" +
            "<p>Генри Форд добился успеха, потому что понял и воспринял принципы успеха. Один из них – твердо знать, чего хочешь достигнуть. Запомните эту историю о Форде и отметьте строки, описывающие секрет его изумительного достижения.\n" +
            "<p>Если Вы сделаете это, если Вы выделили принципы, используя которые Генри Форд стал богатым, то… почему бы Вам не сравняться с ним в успехе? Не ответить на вызов, возможно, брошенный именно Вам?..\n</div>";
}
