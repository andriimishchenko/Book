package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1108 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Сублимация</h4>\n" +
            "<div class=\"text\">"+
            "<p>История вся изобилует примерами неотразимого влияния женщин на великих людей. Один из таких исторических деятелей – Наполеон Бонапарт. Воодушевленный Жозефиной, он был непобедим. Когда же его рассудок (его «высший суд») внушил ему мысль отказаться от Жозефины, слава его стала клониться к закату. Его поражение и одинокая кончина на острове Святой Елены – прямой результат этого решения.\n" +
            "<p>Только требования приличия не позволяют нам напомнить простым американцам о тех богатых соотечественниках, которые вскарабкались наверх благодаря влиянию своих жен, но стоило им оступиться, теряЯ деньги и состояния, как они сразу же отказывались от своих постаревших подруг в пользу новых, более молодых, и дела шли на поправку. Со всей очевидностью можно утверждать, что Наполеон был не единственным, кто открыл для себя, насколько влияние любви могущественнее всех других истинных источников гениальности.\n" +
            "<p>Сознание человека обязательно нуждается в стимуле!\n" +
            "<p>Самым мощным среди всех заслуживающих внимания стимулов Является, конечно, секс. Эта движущая сила, если ее преобразовать и направить в нужное русло, способна поднять человека на такую высоту мысли, откуда он с легкостью справится с ежедневными «мелочами жизни», которые так донимали его «внизу».\n" +
            "<p>Давайте освежим в памяти некоторые факты, известные нам из биографий великих людей. Вот имена некоторых из них, добившихся блестящих результатов в жизни: Джордж Вашингтон, Томас Джефферсон, Наполеон Бонапарт, Элберт Губберт, Уильям Шекспир, Элберт Х. Гэри, Авраам Линкольн, Вудро Вильсон, Ральф Уолдо Эмерсон, Джон Х. Патерсон, Роберт Бернс, Эндрю Джексон, Энрико Карузо. О каждом известно, что по природе своей это был очень сексуальный человек. Гений, окрылявший их, несомненно, сублимированная сексуальная энергия.\n" +
            "<p>Вы можете дополнить этот список сами, если достаточно начитаны и знаете биографии знаменитых людей. Но вряд ли Вам удастся найти хотя бы одного человека во всей истории человечества, который добился бы величайших достижений в любой области и не был бы движим при этом чувством любви, не обладал бы прекрасно развитыми сексуальными способностями.\n" +
            "<p>Если же Вы не доверяете истории на том основании, что ничего нельзя проверить, составьте список преуспевающих людей, которых Вы прекрасно знаете, и попробуйте найти среди них хотя бы одного импотента. Уверен, Вы его не найдете.\n" +
            "<p>Сексуальная энергия – это творческая сила всех без исключения гениальных личностей. Никогда не было, нет и не будет великого художника, архитектора или миллионера – импотента.\n" +
            "<p>Но это не значит, что высокосексуальные люди – обязательно люди выдающиеся. Гениями становятся только те из них, кто так стимулирует свое сознание, что оно обращается к силам, доступным человеку только благодаря творческому воображению. Главным из всех стимулов, которые могут быть выработаны для такого «подъема», была и остается сексуальная энергия. Простого обладания этой энергией недостаточно, чтобы воспитать в себе гения. Энергия любви должна быть преобразована в какую нибудь иную энергию, иной вид желания или поступков прежде, чем человек поднимется до уровня гения.\n" +
            "<p>Однако большинство людей, не понимая этой великой силы или злоупотребляЯ ею, опускаются до состояния животного. И что уж тут говорить о гениальности!\n</div>";
}
