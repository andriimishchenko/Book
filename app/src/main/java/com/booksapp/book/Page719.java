package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page719 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Цивилизация построена на капитале</h4>\n" +
            "<div class=\"text\">"+
            "<p>Сумма денег, необходимых для производства всех этих железных дорог и морских судов, то есть всего лишь для транспортировки продуктов к завтраку, может потрясти любое воображение. Она приближается к сотням миллиардов долларов.\n" +
            "<p>Не говоря уже о найме рабочей силы на все эти корабли и поезда. Но транспорт – это всего лишь небольшая часть современной цивилизации. Прежде чем что либо везти, надо сначала произвести. А о том, чтобы приготовить продукт на продажу, Вы, конечно, забыли? Это еще миллионы и миллионы долларов: оборудование, машины, упаковка, транспортировка, хранение на складах, продажа, наконец, реклама и ко всему еще заработная плата тысяч людей. Да что там – миллионов.\n" +
            "<p>Ни корабли, ни железные дороги не будут действовать без человека. Они соответствуют уровню цивилизации и требуют профессионального, грамотного обращения, специальных инженерных знаний, одним словом, – способных людей: с воображением, верой, энтузиазмом, умеющих принимать решения и достаточно настойчивых. Эти то люди и считаются капиталистами! Их поступки мотивированы желанием строить, образовывать, оказывать услуги, получать прибыли и накапливать богатства. А поскольку они оказывают такой вид услуг, без которых не было бы цивилизации, они уже на пути к величайшим богатствам.\n" +
            "<p>Чтобы быть более понятным, Я могу только добавить, что эти капиталисты – те самые люди, о которых рассказывает нам странные байки множество уличных крикунов. Они – те самые, о ком всякого рода радикалы, коммунисты, рэкетиры, грязные политиканы и подкупленные дельцы вопят на всех перекрестках: смотрите, мол, вот эти «хищники», вот эти «акулы Уолл стрита»!\n" +
            "<p>Заметьте, Я не выступаю ни против, ни за какую либо экономическую систему.\n" +
            "<p>Цель этой книги – цель, которой Я посвятил больше полувека, – предоставить всем, кто бы ни пожелал, наилучшую философию, наилучшие знания, помогающие человеку добиться таких богатств, каких он сам захочет.\n" +
            "<p>Я здесь несколько углубился в преимущества капиталистической системы по двум причинам.\n" +
            "<ol>\n" +
            "\t<li>Я стремился показать, что все, кто желает преуспеть, должны приспособиться к условиям системы, контролирующей все подходы к большим и малым состояниям.</li>\n" +
            "\t<li>2. Я должен был Яркими красками изобразить политиканов и демагогов, умышленно затемняющих предмет спора в своих статьях и выступлениях по поводу организованного капитала, как будто это какое нибудь отравляющее вещество.</li>\t\n" +
            "</ol>" +
            "<p>Мы живем в капиталистической стране. Она всегда развивалась с помощью капитала. И мы, претендуя на все права, провозглашая все свободы и самые разнообразные возможности, мы, ищущие благ и богатств для всех, должны понять только одно – что ни богатств, ни возможностей не будет ни у кого, если организованный капитал не будет приносить доходов.\n" +
            "<p>Есть только один заслуживающий доверия метод приобретения и законного сохранения богатства, и он предопределяется предоставлением необходимых услуг. Невозможно создать никакой системы, позволяющей людям законным образом получить состояния с помощью махинаций, не создавая взамен ничего ценного, в чем бы оно ни выражалось.\n" +
            "\n</div>";
}
