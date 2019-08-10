package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page706 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Руководители нужны всюду</h4>\n" +
            "<div class=\"text\">"+
            "<p>Вот лишь несколько сфер деятельности, которые нуждаются сегодня в новом типе руководителей и где перед такими руководителями открываются самые широкие возможности." +
            "<ol>\n" +
            "\t<li>Острая необходимость в руководителях нового типа ощущается в политической деятельности, что указывает на некоторый кризис в этой сфере.</li>\n" +
            "\t<li>Реформе подвергается нынче и банковский бизнес.</li>\n" +
            "\t<li>Новых лидеров ждет и промышленность. Для того чтобы выжить, руководитель должен вести себя как общественный деятель, оправдывая доверие людей и стремясь смягчить их бедствия и лишения.</li>\n" +
            "\t<li>Будущий священнослужитель должен уделять больше внимания сегодняшним нуждам прихожан, решению их материальных и личных проблем и меньше увлекаться прошлым или обращать свой взор к отдаленному будущему.</li>\n" +
            "\t<li>Новый тип руководителей нужен также в области права, медицины и образования. Особенно это касается сферы образования. Руководители последней в будущем должны учить людей использовать знания, полученные в школе. Чем меньше теорий, тем лучше, здесь нужна голая практика.</li>\n" +
            "\t<li>Руководители нового типа должны прийти и в журналистику.</li>\n" +
            "</ol>" +
            "<p>Не правда ли, в перечисленных Выше сферах деятельности для толкового руководителя – море возможностей?\n" +
            "<p>Мир вступил в эпоху быстрых перемен. Это означает, что средства, с помощью которых должны быть изменены психология и поведение людей, необходимо, в свою очередь, приспособить к быстро меняющимся обстоятельствам. Средства, описанные в моей книге, в гораздо большей степени, чем все остальные, определяют общее направление развития цивилизации.\n" +
            "\n</div>";
}
