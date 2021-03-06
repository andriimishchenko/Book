package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1403 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Время для самовнушения<h4>\n" +
            "<div class=\"text\">" +
            "<p>Я, между прочим, понимал, что все эти люди смогли стать тем, кем они стали, потому что очень этого хотели. Я знал, что, если какое либо желание сидит в Вас крепко и глубоко, оно все равно найдет способ выйти наружу, то есть исполниться. Мне было известно, какую огромную силу представляет собой самовнушение, в деле же формирования личности его значение трудно переоценить.\n" +
            "<p>Зная принципы управления сознанием, Я был в достаточной степени подготовлен к перестройке своей личности. Во время собраний воображаемого совета у каждого из великолепной девятки Я просил необходимых для этого знаний и советов. Делал Я это вслух. Например:\n" +
            "<p>– Мистер Эмерсон, Я хотел бы получить частицу Вашего замечательного понимания природы, выделившего Вас из числа прочих смертных. Я прошу Вас оказать воздействие на мое подсознание и подсказать, какие качества помогли Вам понять и применить для своих целей законы природы.\n" +
            "<p>– Мистер Бербэнк, Я прошу Вас передать мне знание, позволившее Вам так смирять законы природы, что кактус в Ваших руках сбросил шипы и стал годным для еды. Откройте же мне доступ к знанию, которое помогло Вам заставить природу дать жизнь двум травинкам там, где прежде произрастала лишь одна.\n" +
            "<p>– Наполеон, Я охвачен жаждой соперничества, и именно от тебя Я хочу знать, как удавалось тебе вдохновлять людей, вызывать у них сильный и целеустремленный порыв к действию, как удавалось тебе заражаться и заражать верой, помогавшей поражение превращать в победу и преодолевать любые препятствия.\n" +
            "<p>– Мистер Пэйн, Я хотел бы иметь такую же свободу мысли, такую же отвагу и чистоту, с которыми Вы высказывали миру убеждения, столь Вас прославившие.\n" +
            "<p>– Мистер Дарвин, Я хотел бы обладать Вашим выдающимся спокойствием, способностью изучать принципы и следствия без шор предрассудков, чему Вы дали великолепные примеры в естествознании.\n" +
            "<p>– Мистер Линкольн, Я хотел бы выработать в своем характере безукоризненное чувство справедливости, безупречную выдержку, чувство юмора, человечность и терпимость – все те черты, которые в высшей степени были свойственны Вашему характеру.\n" +
            "<p>– Мистер Карнеги, Я хотел бы целиком проникнуться принципами «направляемого усилия», использованными Вами столь эффективно при строительстве гигантской промышленной империи.\n" +
            "<p>– Мистер Форд, Я хотел бы овладеть тайной Вашей настойчивости, последовательности, самоуверенности, Вашего упрямства, которые помогли Вам победить нищету и организовать, объединить человеческие усилия, чтобы и Я мог помогать другим идти по Вашим стопам.\n" +
            "<p>– Мистер Эдисон, дайте мне Вашу веру, которая способствовала Вам в разгадке множества тайн природы, Вашу способность упорно трудиться, так часто помогавшую вырывать победу.\n</div>";
}
