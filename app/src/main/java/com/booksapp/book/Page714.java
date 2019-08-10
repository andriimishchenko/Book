package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page714 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Сам себе реклама?</h4>\n" +
            "<div class=\"text\">"+
            "<p>Пожалуй, одно из древнейших восклицаний человека: «Познай себя!» Если Вы успешно торгуете, Вы должны знать особенности торговли до самой последней мелочи. То же справедливо и по отношению к рынку личных услуг. Вы должны знать свои слабости, чтобы быть в состоянии преодолеть их или полностью уничтожить. Вы должны знать свою силу, поскольку, продавая услуги, лучше иметь представление, как привлечь внимание к своим достоинствам. Но познать самого себя можно, только если очень хорошо порыться в самом себе и провести точный анализ.\n" +
            "<p>Невежество по отношению к себе продемонстрировал один молодой человек, просивший места у очень известного бизнесмена. Поначалу он произвел весьма хорошее впечатление. Но оно полностью испарилось после того, как менеджер спросил у кандидата, какое бы жалованье его устроило. Тот ответил, что не думал о конкретной сумме (см. об отсутствии Ясных целей в жизни). Менеджер на это сказал: «Мы будем платить Вам столько, сколько Вы стоите, и дадим Вам неделю испытательного срока». «Я не могу согласиться, – отвечал кандидат, – поскольку получаю больше, чем того стою, на прежнем месте».\n" +
            "<p>Запомните на всю жизнь: если Вы обсуждаете жалованье на Вашей нынешней службе или ищете другую работу, Вы всегда должны быть уверены в том, что стоите больше, чем получаете в данный момент.\n" +
            "<p>Одно дело – хотеть денег (и каждый ведь хочет их больше), но совершенно другое дело – стоить больше! Многие люди путают свои потребности со своими возможностями. Ваши финансовые запросы не имеют ничего общего с тем, чего Вы стоите. Последнее полностью зависит от Ваших способностей в предоставлении услуг или в Ваших организаторских талантах, если Вы можете и других побудить к тому же.\n\n</div>";
}