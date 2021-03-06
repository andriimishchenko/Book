package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page210 extends AppCompatActivity {
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private String PAGE_HTML = "<h4>Провал слуха</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Маленький глухой мальчик учился в школе и колледже, не будучи способным слышать учителей, если они не кричали с очень близкого расстояния. Но он не пошел в школу для глухих. Мы не разрешали ему учить знаковый Язык жестов. Мы были настойчивы в том, что наш мальчик будет жить нормальной жизнью, общаться с нормальными детьми, и не отступались от своего решения, хотя это и стоило нам нервов и споров со школьными чиновниками.\n" +
            "<p>Когда сын уже учился в колледже, он испробовал один электрический слуховой аппарат, но безрезультатно. На следующей неделе по чистой случайности ему попал в руки другой слуховой аппарат, но он не торопился надеть его, так как боялся разочарования. Когда сын все же решился, кое как взгромоздил аппарат на голову и включил батарейку, то – о чудо! – как по мановению волшебной палочки сбылось желание всей его жизни – он слышал! Почти так же хорошо, как человек с нормальным слухом.\n" +
            "<p>Переполненный радостью от вступления в мир звуков, он помчался к телефону позвонить матери – слышал ее превосходно. Впервые в жизни он Ясно слышал голоса профессоров в аудитории. Впервые в жизни он мог свободно разговаривать с людьми, не заставляя их говорить громко. Мир изменился.\n" +
            "<p>Желание начало выплачивать дивиденды, но победа еще не была полной. Мальчику предстояло найти определенный и конкретный путь и превратить свой недостаток в равноценное достояние.\n</div>";
}
