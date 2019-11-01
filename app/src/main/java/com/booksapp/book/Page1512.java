package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1512 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Боитесь ли Вы старости?<h4>\n" +
            "<div class=\"text\">" +
            "<p>В сущности, этот страх происходит от двух источников. Во первых, от мысли, что старость может принести с собой нищету. Во вторых (и это гораздо более важный источник), от ложных и жестоких учений прошлого, хорошенько приправленных «огнем и серой» и прочими страстями, бездушно нацеленных на порабощение человека через страх.\n" +
            "<p>У человека есть еще две совершенно разумные причины для опасений, связанные со старостью. Одна – недоверие к ближнему, вполне способному присвоить любые земные блага, принадлежащие Вам; вторая – жуткие картины потустороннего мира, внушенные в Ваше сознание.\n" +
            "<p>К этому страху примыкает более распространенная боязнь болезней. В причинное русло примешивается и эротический компонент, ибо не существует человека, которому бы нравилась мысль об утрате сексуальной привлекательности.\n" +
            "<p>Не стоит забывать и о возможности нищеты. «Дом престарелых» – не самое приятное словосочетание. Оно ударяет, как мороз, по сознанию любого, перед кем маячит возможность провести преклонные годы в богадельне.\n" +
            "<p>Ну и, наконец, старость не исключает потерю свободы и независимости, как физической, так и экономической.\n</div>";
}
