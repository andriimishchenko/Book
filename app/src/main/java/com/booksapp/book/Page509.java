package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page509 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Состояние под копирку</h4>\n" +
            "<div class=\"text\">"+
            "<p>Тысячи людей в нашей стране были бы благодарны специалистам, которые составили бы неразумное пособие на тему «как лучше продать свои личные услуги».\n" +
            "<p>Идея, описанная ниже, родилась из необходимости преодолеть непредвиденные обстоятельства, но ею может воспользоваться каждый. Женщина, автор идеи, обладала глубочайшим воображением. Она увидела, что только что рожденное детище может вырасти в новую профессию по обслуживанию тысяч людей, нуждающихся в практическом руководстве.\n" +
            "<p>Побуждаемая к действию успехом первого «подробного плана: как продать свои услуги», эта энергичная женщина взялась за решение проблемы, вставшей перед ее сыном. Молодой человек, выпускник колледжа, никак не мог продать свои способности. План, который она составила специально для него, – наилучший из известных мне образчиков такого рода.\n" +
            "<p>План этот содержал около пятидесяти красиво напечатанных страниц четко изложенной информации. Здесь были материалы о природных способностях юноши, успехах в школе, личном опыте, о том положении в обществе, которого он хотел добиться, и огромное количество иной информации, слишком подробной, чтобы Я мог рассказать обо всем. Главным был точный план действий для достижения цели.\n" +
            "<p>Подготовка такой «книги» заняла несколько недель, в течение которых мать почти ежедневно посылала сына в публичную библиотеку за необходимыми сведениями. Она отправляла сына также ко всем конкурентам его предполагаемого работодателя, чтобы собрать жизненно важную информацию относительно их методов предпринимательской деятельности. Такие сведения были бесценными для формирования плана. И в итоге в нем содержалось несколько превосходных предложений для возможного работодателя – пусть использует к своей выгоде!\n\n</div>";
}
