package com.booksapp.book;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1407 extends AppCompatActivity {
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
                Intent intent = new Intent(getBaseContext(), Page1501.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML = "<h4>Мысли на заметку<h4>\n" +
            "<div class=\"text\">" +
            "<p>Вдохновение уже не минует Вас: оно нальет Вас силой творческого Воображения, мощью Шестого Чувства.\n" +
            "<p>Автор избрал Генри Форда и восемь других великих людей своими «невидимыми советниками». Этот поразительный способ поможет и Вам – действуйте!\n" +
            "<p>Вы соприкоснулись с не имеющим имени «нечто» – путеводной звездой великих людей всех времен. Оно, это «нечто», до сих пор творит чудеса в искусстве, науке и бизнесе.\n" +
            "<p>Вы хотите богатства? Эта глава – для Вас!\n" +
            "<p>Нас мало – на вершине успеха.\n</div>";
}
