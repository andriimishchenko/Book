package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1107 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Откройте в себе гения</h4>\n" +
            "<div class=\"text\">"+
            "<p>Главное различие между гениальным изобретателем и заурядным «чудаком» в том, что гений пользуется даром творческого воображения, тогда как «чудак» понятия о нем не имеет. Изобретатель ученый использует оба дара: аналитические способности и творческое воображение.\n" +
            "<p>Как приходит к открытию ученый изобретатель? Он начинает с организации и комбинирования уже известных идей и принципов, полученных в результате опыта, и делает это с помощью своих аналитических способностей. Если ему становится Ясно, что их одних будет недостаточно для решения стоящих перед ним проблем, он обращается к тем источникам знания, которые предоставляют ему его творческие способности. Методы у всех, разумеется, индивидуальны, но суть состоит в следующем:\n" +
            "<ol>"+
            "<li>С помощью стимулов (десять из которых мы перечислили выше, хотя у каждого они очень личностны) ученый изобретатель преодолевает обычный средний уровень мышления.</li>"+
            "<li>Затем он концентрирует все свое внимание на известных моментах, имеющих отношение к его проблеме (завершенная часть работы), и создает в своем воображении целостную картину, идеальный образ неизвестных моментов (незавершенная часть). Ученый изобретатель держит этот образ в голове до тех пор, пока он не проникнет в подсознание, затем расслабляется, очищая свои мысли от всего постороннего, и ждет, когда в его уме «промелькнет» ответ на заданный подсознанием вопрос.</li>"+
            "</ol>" +
            "<p>Иногда результаты бывают непосредственными и определенными. Иногда отрицательными, – все зависит от того, насколько развито шестое чувство, то есть творческий дар.\n" +
            "<p>Мистер Эдисон перебрал более десяти тысяч комбинаций идей, используя исключительно свои аналитические способности, прежде чем «включил» творческое воображение и получил ответ, позволивший ему усовершенствовать лампу накаливания. Подобным же образом он действовал и тогда, когда изобрел фонограф.\n" +
            "<p>Множество достоверных данных говорит о том, что творческое воображение существует на самом деле. Их можно подтвердить, тщательно проанализировав жизнь и деятельность людей, лидирующих в тех областях, в которых они работали, не получив сколько нибудь широкого образования.\n" +
            "<p>Замечательным примером человека, который стал великим, обнаружив в себе творческие способности, Является Авраам Линкольн. После встречи с Энн Ратлидж он открыл их и стал использовать, ведь стимулом была любовь. Любовь – всегда самый сильный источник, особенно когда речь идет об источнике гениальности.\n</div>";
}
