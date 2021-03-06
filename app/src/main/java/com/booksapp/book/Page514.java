package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page514 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Мысли на заметку</h4>\n" +
            "<div class=\"text\">"+
            "<p>Знания – это только потенциальная сила. Вы должны организовать Ваши знания таким образом, чтобы получился четкий план действий, направленный к конкретной цели.\n" +
            "<p>Не пренебрегайте образованием, полученным в результате личного опыта или общения с другими умными людьми. Генри Форд был достаточно «невежествен», чтобы стать богатым.\n" +
            "<p>Используйте пять источников знаний, перечисленных в этой главе. Знания получить очень просто.\n" +
            "<p>Если Вы не можете продавать товар, продайте свои услуги или идеи за приличную цену. Наиболее удачливы в этом отношении те, кому за шестьдесят.\n" +
            "<p>Простой план сделал прекрасную рекламу тысячам умеющих дисциплинировать себя молодых людей.\n" +
            "<p>План под копирку, о котором говорится в этой главе, способен сэкономить Вам десять лет жизни.\n" +
            "<p>Знания проложат дорогу к богатству – если Вы только знаете, какую дорогу выбрать.\n\n</div>";
}
