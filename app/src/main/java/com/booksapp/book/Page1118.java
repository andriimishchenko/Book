package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1118 extends AppCompatActivity {
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
            "<p>Два весьма знаменательных факта о движущей силе секса дают Вам новое понимание этого обильного источника энергии и силы. Сексуальная энергия может сделать Вас такими же гениальными, какими она сделала Томаса Эдисона и Эндрю Карнеги.\n" +
            "<p>Сексуальная энергия вместе с энтузиазмом, творческим воображением, пламенным желанием, настойчивостью может сделать Вас и счастливым, и богатым.\n" +
            "<p>Возвышенный строй мыслей поможет Вам хотя бы уже тем, что обострит интуицию. Вы сможете «настроиться» на подсознание и идеи других людей.\n" +
            "<p>Великая тайна всех одаренных изобретателей теперь будет работать на Вас. Кроме того, Вы поняли: ничто так сильно не поможет Вам в Вашем деле, как сексуальная энергия, – никогда не отказывайтесь от ее естественного проявления. Правда, понимание того, как ею следует распорядиться, ко многим приходит слишком поздно.\n" +
            "<p>Источником непреходящих богатств как раз и Являются источники всякой жизненной силы.\n</div>";
}
