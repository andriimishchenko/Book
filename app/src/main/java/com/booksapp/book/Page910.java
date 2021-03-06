package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page910 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Четыре шага в воспитании настойчивости</h4>\n" +
            "<div class=\"text\">"+
            "<p>Каждый, кто желает воспитать в себе необходимую настойчивость, должен сделать четыре простейших шага. Для этого не надо никакого особенного ума, никакого особенного образования, больших усилий и чрезвычайной траты времени. Вот эти необходимые шаги:" +
            "<ol>\n" +
            "\t<li>Ясная цель или стремление, при наличии страстного желания, добиться результата.</li>\n" +
            "\t<li>Четкий план, описывающий последовательность действий.</li>\t\n" +
            "\t<li>Независимое сознание, прочно защищенное от разрушительных влияний, включая внушения родственников, друзей и знакомых.</li>\t\n" +
            "\t<li>Дружественный союз, сотрудничество с одним или несколькими людьми, которые могут поддержать Ваше стремление идти к цели, используя план действий.</li>\t\n" +
            "</ol>" +
            "<p>Эти четыре шага (этапа) существенны для успеха в любой области деятельности. Для тех, кто готов следовать тринадцати принципам нашей философии, они должны стать как бы второй натурой или чертой характера.\n" +
            "<p>Это четыре шага, от которых зависит Ваше материальное положение.\n" +
            "<p>Это четыре шага, которые ведут к свободе и независимости суждений.\n" +
            "<p>Это четыре шага, которые принесут Вам богатство, большое или очень большое.\n" +
            "<p>Это четыре шага, которые проложат Вам путь к могуществу, славе и мировой известности.\n" +
            "<p>Это четыре шага, которые гарантируют случай и шанс.\n" +
            "<p>Это четыре шага, которые преобразуют сон в Явь, мечту в реальность.\n" +
            "<p>Это четыре шага, которые откроют дорогу победе над страхом, разочарованием и равнодушием.\n" +
            "<p>Тех, кто научится делать эти четыре шага, ожидает роскошное вознаграждение. Вы сами выпишете себе билет в то будущее, которого захотите.\n" +
            "</div>";
}
