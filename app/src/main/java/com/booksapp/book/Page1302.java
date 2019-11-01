package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page1302 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Мозг в мозг<h4>\n" +
            "<div class=\"text\">" +
            "<p>Все мы, с нашими пресловутыми культурой и образованием, не понимаем ничего (или понимаем слишком мало) в величайшей из невидимых сил – в силе мысли. У нас ничтожно мало знаний о мозге, о работе его тончайших механизмов, через которые сила мысли обретает материальные очертания. Впрочем, есть надежда, что мы живем в век, который просветит нас на этот счет. Ученые приступили, наконец, к изучению мозга, и хотя можно сказать, что наука о мозге переживает еще дошкольный период, но уже известно, например, что число мозговых извилин, соединяющих клетки (центральное звено в понимании принципов работы человеческого мозга!), равно цифре, за которой следует пятнадцать миллионов нолей.\n" +
            "<p>«Цифра настолько изумляюще огромна… – говорит доктор К. Джадсон Хэррик из Университета Чикаго, – что в сравнении с ней кажутся незначительными цифры в сотни миллионов световых лет… Было установлено, что в коре головного мозга человека от десяти до четырнадцати миллиардов нервных клеток, распределенных на определенные группы. И распределение это отнюдь не хаотично. Недавно разработанные методы электрофизиологии позволили зафиксировать движение токов между клетками с помощью микроэлектродов и определить разность потенциалов до одной миллионной вольта».\n" +
            "<p>Трудно поверить, что такая сложная и хрупкая система должна существовать с единственной целью поддержания физических функций, свойственных росту и жизни организма. Разве не кажется удивительным, что та же система, которая дает миллиардам мозговых клеток возможность связываться друг с другом, одновременно выводит их на иные неосязаемые силы?\n" +
            "<p>Газета «Нью Йорк таймс» опубликовала редакционную статью, посвященную исследованиям феноменов сознания, выводы из которой аналогичны тем, что Вы можете прочесть в этой и следующей главах. Предлагаем Вам статью, содержащую краткий анализ работы доктора Райта и его коллег в Дьюкском университете.\n</div>";
}
