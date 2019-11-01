package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page1503 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Откуда приходит страх<h4>\n" +
            "<div class=\"text\">" +
            "<p>Страх нищеты – состояние сознания, и ничего больше! Но он способен уничтожить Ваши шансы на успех в любом начинании.\n" +
            "<p>Этот страх парализует разум, разрушает воображение, убивает самоуверенность, подрывает энтузиазм, охлаждает инициативу, размывает цели, делает невозможным самоконтроль. Он сводит на нет очарование личности, расстраивает четкость мышления, препятствует концентрации усилий. Он лишает настойчивости, превращает силу в бессилие ничегонеделания, уничтожает амбицию, снижает память, притягивает неудачи. Он удушает любовь и насилует лучшие чувства души, помыкает дружбой и привлекает несчастье, ведет к бессоннице, тоске и печали… И все это происходит, несмотря на очевидную истину, что мы живем в мире, перенасыщенном всем, чего только душа пожелает, и между нами и желаемым нет никаких препятствий, кроме одного – отсутствия определенной цели.\n" +
            "<p>Из всех страхов страх нищеты, вне всякого сомнения, – самый разрушительный. И его трудней всего преодолеть – почему, собственно, мы с него и начали. Он проистекает из укорененного в нашем сознании страха стать жертвой своих собратьев. Поведение животных мотивируется инстинктами, но их способности к мышлению ограничены, и поэтому они охотятся друг на друга в буквальном смысле слова. Человек, обладающий высшей нервной и психической организацией, способный думать и рассуждать, не поедает себе подобных – он находит большее удовлетворение в «экономическом людоедстве». Человек настолько жаден, что цивилизации пришлось изобрести всевозможные законы для ограждения его от ближних.\n" +
            "<p>Нищета! Ничто не приносит больших страданий и унижений. До конца меня поймет только тот, кто испытал ее.\n" +
            "<p>Неудивительно, что мы боимся нищеты. Опыт, передаваемый из поколения в поколение, убеждает, что порой встречаются люди, которым не следует доверять, когда дело касается денег и благ земных.\n" +
            "<p>Человек так жаждет богатства, что приобретает его всеми доступными средствами – честными, если возможно, и иными, если необходимо или представляется случай.\n" +
            "<p>Итак, как же избавиться от этого монстра? Займитесь самоанализом, и он выявит слабости, о которых Вы не желаете знать. Это совершенно необходимо для всех, не желающих более пребывать посредственностью и жить в нищете. Допрашивая себя с пристрастием, не забывайте, что Вы одновременно судья и коллегия присяжных, прокурор и адвокат, причем адвокат как истца, так и ответчика. И конечно, не упустите из виду, что под судом то находитесь Вы сами. Задавайте себе конкретные вопросы и требуйте прямых ответов, и, когда следствие завершится, Вы, во всяком случае, будете знать о себе больше. Если же Вы чувствуете, что не сможете стать объективным судьей, попросите выступить в этом качестве кого либо из хорошо понимающих Вас людей. Но перекрестный допрос самого себя не передоверяйте никому. Вы – в поисках правды. Добудьте ее любой ценой, даже если на какое то время Вас охватит разочарование!\n" +
            "<p>Спросите кого угодно, чего он боится. В большинстве случаев Вы услышите: «Ничего». Это ошибочный ответ: мало кто осознает себя повязанным, ущемленным и подгоняемым страхом как духовно, так и физически. Чувство страха столь неуловимо и столь глубоко укоренено в сознании, что человек может пройти по жизни, отягощенный всеми видами страха, так ни разу и не отдав себе в этом отчета. Лишь мужественный анализ поможет выявить наличие всеобщего врага человеческого. Приступайте же к нему, внимательно вглядываясь в свой характер. В помощь Вам Я даю некоторые симптомы, которые каждому не мешало бы поискать в самом себе.\n</div>";
}
