package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page1113 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Урок плодотворных лет</h4>\n" +
            "<div class=\"text\">"+
            "<p>Как уже было сказано выше, человек, не достигший сорока лет, редко подходит к пику своих творческих возможностей. Обычно люди создают все лучшее в их жизни в возрасте примерно от сорока до шестидесяти лет, когда достигают периода расцвета своих способностей (речь не идет о чрезвычайно одаренных людях, гениях и пророках). Эти утверждения основаны на тщательном исследовании деятельности тысяч людей. Пусть воспрянут духом те, кому еще нет сорока и кто еще не добился больших успехов. И пусть воодушевятся те, кто боится приближения «старости» за рубежом сорока лет. Наиболее плодотворны, как правило, годы от сорока до пятидесяти. Пусть Вас не пугает приближение этого возраста, ждите его не со страхом и трепетом, а в деятельной надежде.\n" +
            "<p>Если Вам еще нужны доказательства того, что лучшее время для человека начинается после сорока, прочитайте биографии наиболее преуспевающих людей Америки. Все доказательства Вы найдете там. Генри Форд самого большего добился в возрасте далеко за сорок. Эндрю Карнеги был еще старше, когда стал пожинать плоды своих усилий. Джеймс Дж. Хилл все еще сидел за телеграфным ключом, когда ему было под сорок. Его потрясающее восхождение началось позже. Одним словом, биографии американских промышленников и финансистов просто переполнены доказательствами, что лучшее, наипродуктивнейшее время – от сорока до шестидесяти.\n" +
            "<p>Между тридцатью и сорока годами люди только начинают постигать (если все таки начинают) искусство сублимации. Это открытие тем не менее происходит как бы на втором плане, незаметно для самого открывателя. Он, конечно, не может не заметить, как увеличивается его энергия, направленная на достижение успеха, но в большинстве случаев не понимает причин этой благотворной внутренней перемены, которая коренится в гармонизации сексуальных чувств и любовных переживаний. Он осознает только одно: эта внутренняЯ перемена дает ему дополнительные силы, которые он может использовать в качестве необходимых стимулов к действию.\n</div>";
}
