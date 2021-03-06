package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page203 extends AppCompatActivity {
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
    private String PAGE_HTML = "<h4>Шесть этапов превращения идеи в деньги</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Вы желаете денег? Следующие шесть советов помогут Вам управлять Вашим желанием." +
            "<ol>\n" +
            "\t<li>Определите точное количество денег, которое Вы хотели бы иметь. Недостаточно сказать: «Я хочу иметь много денег». Будьте педантичны. (Ниже, в соответствующей главе, поясняется, почему с психологической точки зрения так важна цифра.)</li>\n" +
            "\t<li>Честно скажите себе, чем Вы готовы заплатить за богатство, которого желаете. (Бесплатно ничего не бывает, не так ли?)</li>\n" +
            "\t<li>Наметьте срок, к которому Вы уже будете обладать этими деньгами.</li>\n" +
            "\t<li>Составьте конкретный план выполнения Вашего желания и начинайте действовать немедленно, независимо от того, готовы Вы реализовать его или нет.</li>\n" +
            "\t<li>Запишите все: количество денег, время, к которому Вы хотите их иметь, чем Вы готовы жертвовать в обмен, план приобретения денег.</li>\n" +
            "\t<li>Каждый день – перед отходом ко сну и утром – читайте вслух свои записи. Читая, представьте, почувствуйте и поверьте в то, что деньги уже Ваши.</li>\n" +
            "</ol>" +
            "<p>Очень важно следовать всем шести советам, но особенно – последнему. Не жалуйтесь на невозможность представить, что деньги уже в Вашем кармане. Желание их иметь, если оно успело заразить Вас, станет хорошим помощником. Ваша цель – хотеть денег, хотеть так настойчиво, чтобы силой внушения желаемое стало действительным." +
            "</div>";
}
