package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page1511 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Боязнь неудачи в любви: три симптома<h4>\n" +
            "<div class=\"text\">" +
            "<p>Отличительные симптомы ее таковы:" +
            "<ol>\n" +
            "\t<li>Ревность: привычка подозревать близких друзей и любимых безо всяких на то оснований; обвинение жены или мужа в неверности (конечно же, без причин); всеохватывающая подозрительность, абсолютное неверие.</li>\n" +
            "\t<li>Поиск промахов у всех: друзей, родственников, коллег, любимых (это, естественно, в первую голову) по малейшему поводу либо же при отсутствии такового – все равно.</li>\n" +
            "\t<li>Авантюризм: склонность к рискованным предприятиям, воровству, жульничеству и другим опасным деяниям с целью добыть денег для любимых, с верой, что любовь можно купить; влезание в долги для покупки подарков, чтобы показать себя с лучшей стороны; бессонница, нервозность, отсутствие настойчивости, самоконтроля, самоуверенности, слабоволие, плохое настроение.</li>\n" +
            "</ol>" +
            "</div>";
}
