package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page906 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>«Изощренная настойчивость» – в восьми переменах</h4>\n" +
            "<div class=\"text\">"+
            "<p>Прежде чем от настойчивости перейти к другой теме, определите, чем Вы отличаетесь от других людей и чего Вам не хватает для приобретения этого важного качества. Обдумайте свои действия пункт за пунктом, и Вы увидите все затруднения как на ладони. Такой анализ, кроме всего прочего, поможет лучше познать себя. Ниже перечислены Ваши истинные враги, стоящие между Вами и успехом. Вы обнаружите в этом списке не только симптомы, указывающие на недостаток настойчивости, но и слабости, которые нужно преодолеть желающим преуспеть в жизни:\n" +
            "<ol>\n" +
            "\t<li>Непонимание своих желаний.</li>\n" +
            "\t<li>Промедление, неважно, оправданно оно или нет (всегда находятся тысячи уважительных причин для промедления).</li>\t\n" +
            "\t<li>Отсутствие интереса к приобретению специальных знаний.</li>\t\n" +
            "\t<li>Колебания и нерешительность по любому поводу, привычка перекладывать ответственность на других, вместо того чтобы самому выходить из трудного положения.</li>\t\n" +
            "\t<li>Привычка ссылаться на обстоятельства, вместо того чтобы разрабатывать четкий план решения проблемы.</li>\t\n" +
            "\t<li>Самовлюбленность. От этого недуга лекарств почти нет, как и надежд у тех, кто им страдает.</li>\t\n" +
            "\t<li>Равнодушие или безразличие, чаще всего выражающееся в готовности к компромиссам по любому вопросу, без сопротивления и борьбы.</li>\t\n" +
            "\t<li>Привычка винить в собственных ошибках других и воспринимать неблагоприятные обстоятельства как неизбежные.</li>\t\n" +
            "\t<li>Отсутствие страсти, приводящей все в действие, без оглядки на побудительные мотивы.</li>\t\n" +
            "\t<li>Готовность, иногда переходящая в рвение, поставить на всех делах точку при малейшем признаке неуспеха (см. последнюю главу: «Шесть признаков страха»).</li>\t\n" +
            "\t<li>Отсутствие четкого плана действий, зафиксированного на бумаге, в случаях, когда необходим тщательный анализ.</li>\t\n" +
            "\t<li>Неумение учитывать изменение идеи или первоначального плана, схватить случай за хвост, если такая возможность представится.</li>\t\n" +
            "\t<li>Хотение вместо веления.</li>\t\n" +
            "\t<li>Привычка к нищете вместо стремления к богатству, абсолютное отсутствие честолюбия: желания быть, делать, иметь.</li>\t\n" +
            "\t<li>Привычка размениваться по мелочам, сотрудничать со спекулянтами и прочей «мелкой сошкой», попытки получить все сразу, ничего не отдавая взамен или отдавая неравную долю; неэквивалентная отдача (обычно выражающаясЯ в неоправданном риске, заключении сделок, больше похожих на аферу, чем на предпринимательство).</li>\t\n" +
            "\t<li>Страх перед критикой, перед мнением других. Часто одна только мысль, что скажет, подумает или сделает кто то, лишает человека всякой способности мыслить и действовать. Этот враг должен стоять во главе всего списка, поскольку всегда так или иначе существует в подсознании, и многие не дают себе даже отчета в его существовании (см. также последнюю главу: «Шесть признаков страха»).</li>\t\n" +
            "</ol>" +
            "</div>";
}
