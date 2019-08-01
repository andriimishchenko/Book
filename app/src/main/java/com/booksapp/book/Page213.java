package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page213 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Мысли на заметку</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Когда желание собирает все силы для победы, Вам не нужны пути к отступлению: победа обеспечена.\n" +
            "<p>Шесть принципов, изложенных в главе, превращают желание в деньги. В случае с Эндрю Карнеги – в 100 миллионов долларов.\n" +
            "<p>Желание превращает неудачу в победу. Именно желание построило один из крупнейших в мире универмагов буквально на руинах. Мальчик без ушей научился слышать. Женщина, «у которой не было шансов», стала великой оперной певицей. Больной, приговоренный докторами к смерти, выжил. Именно обладание необычными и неясными для нас средствами «химии сознания» помогло этим людям.\n" +
            "<p>Для разума нет никаких препятствий, кроме тех, которые мы признаем.\n</div>";
}
