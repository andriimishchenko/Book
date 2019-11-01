package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1514 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Боитесь ли Вы смерти?<h4>\n" +
            "<div class=\"text\">" +
            "<p>На некоторых из нас этот страх действует наиболее жестко. Причина же очевидна. Внезапная острая боль, пронизывающая сердце при мысли о смерти, чаще всего может быть отнесена к религиозному фанатизму. Так называемые Язычники меньше боятся смерти, чем более «цивилизованные» представители рода человеческого. В течение тысяч лет люди ставят так и остающиеся без ответа вопросы: «Отколь грядеши?» и «Камо грядеши?» – откуда Я и куда Я иду.\n" +
            "<p>В темные времена прошлого находились бездушные и хитрые люди, предлагавшие – за деньги – ответ.\n" +
            "<p>«Приди ко мне, прими мою веру, следуй моим догматам, и Я дам тебе билет, по которому после смерти ты попадешь прямехонько в рай», – кричит руководитель сектантской общины. «Конечно, ты можешь оставаться не со мной, – продолжает он, – но тогда дьявол подхватит тебя и сожжет в аду».\n" +
            "<p>Мысль об адском наказании лишает интереса к жизни и делает счастье невозможным.\n" +
            "<p>Хотя никакой религиозный лидер не в состоянии ни гарантировать вознесение в рай, ни устроить сошествие в ад (в связи с отсутствием такового), последний представляется столь ужасным, что сама мысль о нем тяжелым грузом ложится на воображение, причем столь Явственно, что начисто парализует рассудок – и как раз формирует страх смерти.\n" +
            "<p>Сейчас, к счастью, этот страх распространен не в такой степени, как в те времена, когда не было университетов и колледжей. Люди науки направили на человечество луч правды, и эта правда быстро освобождает мужчин и женщин Земли от боязни смерти. На юношей и девушек, посещающих университеты и колледжи, не так легко произвести впечатление образом «пламени и серы». С помощью биологии, астрономии, геологии и других сопредельных наук страхи темных веков, тисками сжимавшие души людей, рассеялись.\n" +
            "<p>Весь мир сотворен из двух вещей – энергии и материи. Из начального курса физики мы знаем, что ни материя, ни энергия (две известные человеку реальности) не могут быть ни созданы, ни разрушены. Они видоизменяются, но не разрушаются.\n" +
            "<p>Жизнь – энергия, что же еще? И, как другие формы энергии, она претерпевает различные трансформации и изменения. И смерть – тоже только трансформация. Но если это так, то, стало быть, после смерти наступает длинный, вечный, мирный сон, а сна – чего бояться? Задавите же в себе страх смерти!\n</div>";
}
