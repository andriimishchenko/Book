package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page604 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Идеи – это деньги</h4>\n" +
            "<div class=\"text\">"+
            "<p>Богатство начинается с идеи. Идеи формируются воображением. Давайте ка рассмотрим несколько широко известных идей, из которых выросли огромные состояния. Надеюсь, Вы поймете из этих рассказов, в чем заслуга воображения. И чего можете добиться Вы сами.\n</div>";
}
