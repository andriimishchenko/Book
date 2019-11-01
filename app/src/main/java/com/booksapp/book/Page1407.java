package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

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


    private String PAGE_HTML = "<h4>Мысли на заметку<h4>\n" +
            "<div class=\"text\">" +
            "<p>Вдохновение уже не минует Вас: оно нальет Вас силой творческого Воображения, мощью Шестого Чувства.\n" +
            "<p>Автор избрал Генри Форда и восемь других великих людей своими «невидимыми советниками». Этот поразительный способ поможет и Вам – действуйте!\n" +
            "<p>Вы соприкоснулись с не имеющим имени «нечто» – путеводной звездой великих людей всех времен. Оно, это «нечто», до сих пор творит чудеса в искусстве, науке и бизнесе.\n" +
            "<p>Вы хотите богатства? Эта глава – для Вас!\n" +
            "<p>Нас мало – на вершине успеха.\n</div>";
}
