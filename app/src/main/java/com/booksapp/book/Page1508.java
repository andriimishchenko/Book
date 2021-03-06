package com.booksapp.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1508 extends AppCompatActivity {
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.item1:
                Intent intent = new Intent(getBaseContext(), Page1509.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML = "<h4>Боитесь ли Вы болезней?<h4>\n" +
            "<div class=\"text\">" +
            "<p>Этот страх может быть равно отнесен и к физическому, и к социальному наследию. Если говорить о его происхождении, то, смею утверждать, он тесным образом связан со страхом старости и смерти – этих двух предвестников «загробных ужасов», о которых человек, по сути, ничего не знает, хотя напичкан всякими малоприятными историями с детства. Данное Явление настолько распространено, что находятся проходимцы, продающие «рецепты здоровья», поддерживая, таким образом, страх смерти.\n" +
            "<p>В целом человек боится болезней из за посмертных страхов, внушенных в его сознание, и из опасения возможных экономических последствий.\n" +
            "<p>Известный терапевт установил, что 75 процентов людей, обращающихся к врачу, страдают от… ипохондрии (воображаемых болезней). Было убедительнейше доказано, что страх болезни, даже самый безосновательный, дает реальные физические симптомы того заболевания, которого человек опасается. Вот ведь до чего могущественно человеческое сознание! И в созидании, и в разрушении.\n" +
            "<p>Играя на этой человеческой слабости, отнюдь не один продавец «патентованных средств» сколотил себе состояние. Этот «налог» на человеческое безумие так вырос несколько десятилетий назад, что один популярный журнал даже провел кампанию против наиболее наглых продавцов разного рода «эликсиров жизни».\n" +
            "<p>Эксперименты, проведенные нами не так давно, доказали, что человеку можно внушить болезнь. К избранным нами «жертвам» три человека последовательно обращались с одним и тем же вопросом: «Что Вас беспокоит? Вы ужасно выглядите». На первый раз вопрос вызывал улыбку и безмятежное: «О нет, все в порядке». Во второй раз ответ обычно бывал таким: «Я точно не знаю, но действительно чувствую себя паршиво». Ну а в третий раз тот, к кому обращались с вопросом, прямо говорил, что болен.\n" +
            "<p>Не смейтесь, а лучше ка проверните эту штуку с кем либо из своих знакомых. Только не усердствуйте, а то ведь в самом деле заболеют! Между прочим, существует секта, члены которой мстят своим врагам, делая то же, что и мы, только шесть раз (метод гексаэдра). Правда, они называют это «напускать чары».\n" +
            "<p>Есть потрясающие свидетельства, когда болезни начинались от плохих мыслей. Плохая мысль может быть внушена, а может и сама родиться в человеческом сознании.\n" +
            "<p>Поэтому следуйте примеру одного мудрого человека, еще более мудрого, чем может показаться из следующих его слов: «Когда меня кто нибудь спрашивает, как Я себя чувствую, мне всегда хочется дать ему в морду».\n" +
            "<p>Доктора часто рекомендуют пациентам переменить (на время) климат, имея в виду – смену обстановки. Клетки страха болезни присутствуют в сознании у каждого. Беспокойство, боязнь, разочарование в любви и неудачи в делах оплодотворяют их и дают им жизнь.\n" +
            "<p>Неудачи в любви и делах стоят вверху этого списка… Один юноша так страдал от неудачной любви, что попал в больницу. В течение месяца он находился между жизнью и смертью. Наконец позвали психотерапевта. Первым делом доктор сменил сиделку, приставив к больному очаровательную молодую женщину. По предварительной договоренности с доктором она с первого же дня стала заниматься любовью с нашим юношей, и через три недели его выписали из госпиталя, все еще страдающего, правда, от совершенно другой болезни: он опять влюбился. И лекарством была вся эта мистификация, но впоследствии юноша и сиделка поженились.\n</div>";
}
