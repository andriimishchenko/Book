package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page406 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Мысли на заметку</h4>\n" +
            "<div class=\"text\">"+
            "<p>У каждого человека есть шестое чувство, но для контроля над подсознанием достаточно пяти чувств. Если подсознание Вам подвластно, стремление к процветанию не оставляет места для нищеты.\n" +
            "<p>Увидьте желаемое богатство воочию, «подержите» его в руках – и оно придет с совсем неожиданной стороны. Обозначьте Вашу цель (желание денег) цифрой. И пускай цифра будет большой. Не забудьте назначить срок.\n" +
            "<p>Подсознание одарило Вас планом? Немедленно за работу! Вдохновение драгоценно и не терпит отлагательств. Будете «ждать удачного времени» – дождетесь неудачи!\n" +
            "<p>Три простых упражнения делают Вас хозяином самовнушения. Следуйте инструкции буквально – и станете хозяином своей судьбы.\n" +
            "<p>В каждой напасти ищите благо!\n</div>";
}
