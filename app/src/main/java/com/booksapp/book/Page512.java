package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page512 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Не задерживайтесь на дне</h4>\n" +
            "<div class=\"text\">"+
            "<p>Другая мысль, которую мне очень бы хотелось донести до Вас: и успех, и удача в значительнейшей степени Являются результатом привычки. У меня нет ни тени сомнения в том, что тесный союз Дэна Гальпина с величайшим футбольным тренером Америки воспитал в его сознании такую же пламенную страсть к победам, какая сделала и команду «Нотр Дам» всемирно известной. Поистине здесь есть что то от культа героев, особенно если герой – победитель.\n" +
            "<p>Убежденность в том, что деловой союз – жизненно важный фактор как в удаче, так и в неуспехе, мне пришлось продемонстрировать, когда мой сын Блэйер вел переговоры с Дэном Гальпиным по поводу должности в его фирме. Мистер Гальпин предложил ему первоначальное жалованье примерно в половину той суммы, которую мой сын мог получить от конкурирующей компании. Я употребил все свое родительское влияние, чтобы убедить сына согласиться на предложение Гальпина. Я убедил его в том, что возможность сотрудничества с человеком, который не идет на компромиссы с неблагоприятными для него обстоятельствами, ценна сама по себе и не может быть измерена категорией денег.\n" +
            "<p>На дне человек всегда влачит скучное, монотонное, не приносящее радостей существование. Поэтому Я и постарался как можно лучше показать способы преодоления неблагоприятных обстоятельств при неудачном старте.\n\n</div>";
}
