package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page208 extends AppCompatActivity {
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

    private String PAGE_HTML = "<h4>Эврика!</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Мы купили фонограф. Когда ребенок впервые услышал музыку, он пришел в экстаз и быстро завладел аппаратом. Однажды он прокручивал пластинку в течение двух часов подряд, плотно сжав зубами край трубы фонографа. Мы не поняли важности этой выработанной им самим привычки, пока не узнали о звуковой проводимости костей.\n" +
            "<p>Вскоре после этого Я обнаружил, что он слышит вполне отчетливо, если Я говорю, касаясь губами косточки у основания черепа.\n" +
            "<p>Убедившись, что он различает голоса, Я немедленно стал внушать ему желание слышать и говорить. Когда же Я увидел, что мальчику нравятся сказки перед сном, то стал сочинять истории, которые могли бы сформировать в нем самоуверенность, развить воображение и твердое желание слышать и быть нормальным.\n" +
            "<p>Была одна история, которую Я рассказывал особенно часто, всякий раз добавляЯ новые краски и сюжетные повороты. Смысл ее сводился к тому, что его увечье было не недостатком, а достоянием огромной ценности. Несмотря на всю мою философию, согласно которой любое несчастье несет в себе семя равновеликого преимущества, Я (должен честно в этом признаться) не имел ни малейшего представления, какая такая ценность может быть заключена в его увечье.\n</div>";
}
