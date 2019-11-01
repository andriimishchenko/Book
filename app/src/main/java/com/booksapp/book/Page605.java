package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page605 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>А не хватало мелочи</h4>\n" +
            "<div class=\"text\">"+
            "<p>Пятьдесят лет назад старый сельский доктор приехал в город. Он привязал лошадь и тихо, с черного хода, прошмыгнул в аптеку. Более часа доктор и аптекарский клерк торговались о чем то шепотом. Потом доктор вышел и вернулся с большим старомодным котелком и деревянной мешалкой.\n" +
            "<p>Клерк изучил содержимое котелка и передал доктору пачку банкнот – ровно пятьсот долларов. Это были все его сбережения! Получив деньги, старик отдал, наконец, самое важное: листок бумаги с секретной формулой.\n" +
            "<p>За то, что было написано на бумаге, короли отдавали полцарства. Эти магические слова должны были заставить котелок кипеть. Но ни доктор, ни молодой клерк не знали, какие сказочные богатства вычерпать из этого котелка было предназначено судьбой.\n" +
            "<p>Старик был доволен, продав свой рецепт за пятьсот долларов. Клерк же никогда не думал, что вложит деньги в ветхий котелок. Но вскоре с этим котелком, – по способности извлекать золото «из воздуха» – не сможет сравниться и волшебная лампа Аладдина.\n" +
            "<p>Клерк приобрел идею! Но чудеса с котелком стали происходить только после того, как новый владелец прибавил к секретным инструкциям кое что, о чем доктор ничего не знал. Подумайте, что же это было?\n" +
            "<p>А теперь давайте посмотрим, какие огромные богатства принесла идея. Прежде всего она озолотила тех, кто продает содержимое котелка миллионам людей.\n" +
            "<p>Старый котелок сегодня – крупнейший потребитель сахара, дающий работу сборщикам тростника и рабочим сахарных заводов.\n" +
            "<p>Старый котелок ежегодно потребляет миллионы стеклянных бутылок, обеспечивая занятость людей в стекольной промышленности.\n" +
            "<p>Старый котелок – работодатель огромной армии клерков, стенографисток, сценаристов, экспертов по рекламе по всей стране. Он принес славу и богатство множеству артистов, создавших запоминающиеся картины с описанием продукта.\n" +
            "<p>Старый котелок превратил маленький южный городок в деловую столицу юга, где он и посейчас приносит пользу, напрямую или косвенно, в бизнесе каждого жителя.\n" +
            "<p>Влияние этой идеи способствует развитию всего цивилизованного мира, принося золото всякому, кто к ней прикоснется.\n" +
            "<p>Золото из котелка основало и поддерживает один из самых знаменитых колледжей юга, в котором тысяча студентов получает подготовку, необходимую для достижения успеха.\n" +
            "<p>Если бы продукт из медного котелка умел говорить, он рассказал бы множество захватывающих историй на всех Языках мира. Истории о любви и бизнесе, о тысячах мужчин и женщин, которых он ежедневно ободряет.\n" +
            "<p>Во всяком случае, в одной такой истории участвовал автор этих строк. Действие ее начиналось недалеко от места, где в свое время аптекарский клерк купил старый котелок. Именно там автор встретил свою будущую жену, кстати, впервые рассказавшую ему эту историю. Они как раз пили этот замечательный напиток, когда он попросил ее соединить с ним свою жизнь «для радостей и трудностей».\n" +
            "<p>Кем бы Вы ни были, где бы Вы ни жили и чем бы ни занимались, вспомните всякий раз, когда увидите слова «кока кола», что эта гигантская империя выросла из одной идеи и что таинственной составляющей, которую Эза Кэндлер, аптекарский клерк, прибавил к рецепту напитка, было воображение!\n" +
            "<p>А теперь остановитесь. Подумайте. Подумайте о том, что принципы, излагаемые здесь, помогли кока коле захватить каждый город, городок, поселок и перекресток по всему миру. И если Вам придет в голову идея, которая окажется столь же достойной и разумной, Вы сможете повторить рекорд всемирно известного борца с жаждой.\n\n</div>";
}
