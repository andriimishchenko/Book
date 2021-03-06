package com.booksapp.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1519 extends AppCompatActivity {
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
                Intent intent = new Intent(getBaseContext(), Page1520.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML = "<h4>Защищайтесь!<h4>\n" +
            "<div class=\"text\">" +
            "<p>Чтобы защищаться от отрицательного влияния, самого ли себя или дурных людей вокруг Вас, вспомните, что у Вас есть сила воли. Постоянно давайте ей ход, и она выстроит в Вашем сознании стену иммунитета.\n" +
            "<p>Признайтесь себе, что по натуре Вы (как, впрочем, и все мы) ленивы, безразличны и восприимчивы к любому внушению, которое созвучно Вашим слабостям.\n" +
            "<p>Осознайте, что отрицательные импульсы проникают в Вас через подсознание, почему, собственно, их трудно обнаружить. Стало быть, «застегивайтесь на все пуговицы» с людьми, общение с которыми вызывает у Вас депрессию или обескураженность.\n" +
            "<p>Не забывайте, что по своей природе мы подвержены всем шести страхам, о которых шла речь, и у нас есть только один выход – выработать навыки противодействия им.\n" +
            "<p>Для начала очистите Вашу домашнюю аптечку, выбросьте Ваши любимые баночки с пилюлями, перестаньте лелеять простуды, мигрени, боли и болезни, которые Вы себе придумали.\n" +
            "<p>Неуклонно стремитесь к общению с людьми, пробуждающими в Вас мысль и активное действие.\n" +
            "<p>Не назначайте свиданий волнениям – они ведь наверняка придут.\n" +
            "<p>Без сомнения, наиболее распространенная человеческая слабость – открытость сознания для негативных воздействий. Она тем более разрушительна, поскольку большинство людей не признает, что подвержены ей, а если и признают, то отказываются или уклоняются от борьбы с этим злом, пока оно не становится неконтролируемой частью натуры.\n" +
            "<p>Следующие вопросы подготовлены в помощь людям, желающим знать, что они собой представляют. Читайте и вопросы, и ответы вслух так, чтобы Вы слышали свой голос. Это помогает быть более искренним с самим собой.\n</div>";
}
