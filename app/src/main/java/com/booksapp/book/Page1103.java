package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1103 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Воображение – шестое чувство</h4>\n" +
            "<div class=\"text\">"+
            "<p>Реальность существования шестого чувства уже давно и неопровержимо установлена. Шестое чувство – это воображение. Однако большинство людей на протяжении всей своей жизни так ни разу его и не используют. А если и прибегают к нему, то делают это скорее случайно. И лишь сравнительно немногие люди обращаются к своему воображению осознанно и преднамеренно. Тех же, кто не только творчески использует этот ниспосланный им дар, но и понимает, как он работает и чем хорош, мы называем гениями.\n" +
            "<p>Дар творческого воображения – это прямая связь между смертным человеком и бессмертным Высшим Разумом. Все откровения восходят к области религии, а все открытия новых основ и новых принципов устройства мира – к творческому воображению.\n" +
            "\n</div>";
}
