package com.booksapp.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1506 extends AppCompatActivity {
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
                Intent intent = new Intent(getBaseContext(), Page1524.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML = "<h4>Боитесь ли Вы критики?<h4>\n" +
            "<div class=\"text\">" +
            "<p>Никто не сможет сказать определенно, откуда у человека взялся этот страх, но одно очевидно – он в нас присутствует и очень развит. Возможно, за страх критики ответственна та часть природы человека, которая побуждает его не только отобрать у ближнего пищу и имущество, но при этом и оправдать свои действия критикой характера ограбленного. Не секрет, что воры ругают тех, кого обчищают, а политики, добиваясь победы на выборах, не столько демонстрируют миру собственные достоинства и квалификацию, сколько очерняют оппонентов.\n" +
            "<p>Посмотрите, как быстро оседлали страх критики основные производители одежды! Каждый сезон меняется множество деталей в том, что мы носим. Но кто заказывает моду? Естественно, не покупатель, а производитель одежды. Зачем так часто меняются стили? Ответ очевиден: чтобы больше продать. Или автомобили. Каждый сезон выпускаются новые, модные, марки. И мало кто рискнет сесть за руль устаревшего автомобиля.\n" +
            "<p>То, что мы сейчас описали, конечно же, мелочи. Давайте исследуем поведение человека под воздействием страха критики в более существенных обстоятельствах. Ну возьмите, например, любого человека, достигшего интеллектуальной зрелости (обычно это соответствует 35 – 40 летнему возрасту), и если Вы умеете читать его тайные мысли, то обнаружите совершенно определенное неверие в большинство историй, услышанных им в детстве от священника. Но почему же человек, даже в наш просвещенный век, обычно избегает открыто говорить о своем неверии? Да потому, что он боится критики! Потому что немало мужчин и женщин в свое время сожгли на костре за то, что они посмели усомниться ну хотя бы в существовании привидений. Что ж, неудивительно, что мы унаследовали сознание, предрасположенное к страху. В конце концов, не так уж далеко отстоит от нас время, когда за критикой следовали суровые наказания. А в некоторых странах это практика и сегодняшнего дня.\n" +
            "<p>Страх критики подрывает инициативу, разрушает силу воображения, ограничивает индивидуальность, лишает человека уверенности в себе и вообще вредит ему во множестве других случаев. Да… Часто незаживающей раной становится родительская критика. Мать одного из дружков моего детства пестовала его (буквально!), то есть воспитывала пестом, била почти ежедневно, каждый раз завершая сие священнодействие следующим заявлением: «Ой, как по тебе тюрьма то плачет, ты и до двадцати без нее не дотянешь». И он таки попал в исправительную колонию… в 17 лет.\n" +
            "<p>Критика – это вид сервиса, которого у нас более чем достаточно. Сколько же каждый из нас получил этих бесплатных подарочков! А родственники (собственно, ближайшие)! Я убежден, что родитель, вырастивший своей критикой не столько ребенка, сколько комплекс неполноценности в человеческой оболочке, должен признаваться преступником (а это и есть преступление наихудшего свойства!). Менеджеры, понимающие человеческую природу, извлекают все лучшее из своих подчиненных не критикой, а конструктивными взаимоотношениями. Тех же результатов могут достичь и родители. Критика вызывает в сердце чувство неполноценности или обиды. Но не привязанности. Но не любви.\n</div>";
}
