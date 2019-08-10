package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page608 extends Activity {
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
            "<div class=\"text\">"+
            "<p>Работайте – тогда синтетическое и творческое воображение будут помогать Вам, как правая и левая рука.\n" +
            "<p>Отсутствие воображения – причина многих неудач; его наличие обеспечит успех. Эза Кэндлер не изобрел рецепта кока колы. Он вспенил ее воображением. Это принесло ему состояние.\n" +
            "<p>Деньги ждут Вас в неограниченном количестве, если Вы точно знаете, сколько и на что Вам их надо. И конечно, если Вам помогает воображение. Оно обеспечило миллион священнику, который его просто попросил.\n" +
            "<p>Богатство ждет Вас. Путь к нему начинается с простой идеи. Даже не план, а новая комбинация может принести тысячи и миллионы.\n" +
            "<p>Любому инструменту нужны умелые руки.\n\n</div>";
}
