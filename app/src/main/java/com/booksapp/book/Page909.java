package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page909 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Нам не хватало друг друга</h4>\n" +
            "<div class=\"text\">"+
            "<p>Жил да был когда то давно некий властитель. Только в сердце своем он был не король, а просто одинокий человек. Его руки – руки принца Уэлльского – больше сорока лет домогались многие красавицы, принцессы всей Европы сохли по нему. Он жил, не уединяЯсь, и, когда стал Эдуардом VIII, вдруг ощутил глубокую внутреннюю пустоту, которая вряд ли могла быть понята кем либо из его блистательного окружения, – и эта пустота могла быть заполнена только любовью.\n" +
            "<p>А помните Уоллис Симпсон? Дважды, оступившись в поисках любви, она находила в себе мужество продолжить поиски. Любовь была ее самым большим долгом. Что может быть более великим, чем любовь? Творец не говорит: придумывайте Ваши условности, осуждайте, клевещите, злословьте, женитесь по расчету. Он говорит: любите.\n" +
            "<p>Думая об Уоллис Симпсон, вспомните и о том, кто знал, что ей было нужно, и подарил ей в итоге больше чем царство. Женщины, думающие, что мир принадлежит мужчинам, не имеют никаких шансов на победу. И лучше всего им было бы проследить за жизнью тех избранных, которые в возрасте, считающемся «поздним», находят то, чего никак не могут найти большинство незамужних женщин во всем мире.\n" +
            "<p>А что же король Эдуард? Заплатил ли он слишком высокую цену за единственную женщину, в которой так нуждался? Мы можем только догадываться. Но видим решимость, знаем, что за эту решимость надо было сначала заплатить, что за нее было заплачено, и заплачено сполна.\n" +
            "<p>Британская империя проложила дорогу к новому мировому порядку. Герцог Виндзорский и его жена в конце концов были примирены с королевской семьей. История их любви, их настойчивости и целеустремленности, той высокой цены, которую им пришлось заплатить и, наконец, триумфа любви легко может быть отнесена к делам давно прошедших дней. Но все равно помните всегда о том, как они искали лучшее сокровище мира и как добились своего.\n" +
            "<p>Спросите у первых ста встречных, чего они хотят в этой жизни, и девяносто восемь из них не смогут Вам точно ответить. Если Вы будете настаивать, одни скажут «покоя»; другие назовут деньги; некоторые скажут «счастья», другие – «славы и могущества», оставшиеся – «общественного положения», «комфорта в жизни», «возможности петь, танцевать, писать». Но никто из них не раскроет ни одного из этих понятий, а тем более не расскажет, как ему добиться этого. Ни у кого нет ни малейшего намека на четкий план, посредством которого можно достичь всех этих очень смутно высказанных желаний. Из желаний богатств не получается. Они получаются из Ясного плана действий, основанного на таких же Ясных устремлениях и осуществляемого с необходимой настойчивостью.\n\n</div>";
}
