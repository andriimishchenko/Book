package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1106 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Идея зреет</h4>\n" +
            "<div class=\"text\">"+
            "<p>Покойный ныне доктор Элмер Р. Гэйтс (из штата Мэриленд) совершил более двухсот открытий, имеющих практическое значение для самосовершенствования и использования своего творческого дара. Его метод интересен и даже необходим тому, кто мечтает стать гением в какой нибудь области. Сам доктор Гэйтс, несомненно, принадлежал к разряду таких людей. Это действительно гений, каких мало, но он почти не известен обществу, даже научному миру.\n" +
            "<p>В своей лаборатории он устроил «комнату личной коммуникации». Ее стены были практически непроницаемы, и в нее не проникал ни один луч света. В комнате стоял только стол с писчей бумагой и стул, а на стене напротив был выключатель. Когда доктор Гэйтс нуждался в помощи тех сил, доступ к которым ему обеспечивало только его творческое воображение, он заходил в эту комнату, закрывал ее и концентрировал все свое внимание на известных изобретениях – тех, автором которых был он сам, и пребывал в таком состоянии до того момента, пока в его голове не начинали мелькать новые идеи и соображения, чаще всего приводившие его к новым открытиям и изобретениям.\n" +
            "<p>Однажды мысли его полились сплошным потоком, и он писал без перерыва три часа подряд. Когда вдохновение истощилось и он проверил свои записи, то обнаружил, что среди них оказалось описание новых, не имевших аналогов, принципов. Принципов, о которых ничего не было известно в современном ему научном мире и описание которых при этом не могло занять больше минуты. Кроме того, они решали и его научные проблемы.\n" +
            "<p>Таким «высиживанием идей» доктор Гэйтс и зарабатывал себе на жизнь, выполняЯ заказы корпораций и частных лиц. Одна из крупнейших фирм Америки платила ему довольно прилично за каждый час такого «высиживания».\n" +
            "<p>Нередко наши умственные способности не дают желаемого эффекта по той причине, что они в значительной степени опираются на жизненный опыт. Тут необходимо подчеркнуть, что знания, полученные в результате опыта, эмпирическим путем, не всегда бывают точными и истинными. Идеи, возникшие благодаря творческому дару, более достоверны, потому что они возникают из источников куда более надежных, чем те, на которые может рассчитывать замкнутое, ограниченное человеческое сознание.\n</div>";
}
