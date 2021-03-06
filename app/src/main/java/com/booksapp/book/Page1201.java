package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1201 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h3>12. Одиннадцатый шаг к богатству: ПОДСОЗНАНИЕ</h3>\n" +
            "<div class=\"text\">"+
            "<p>Подсознание, как спящий великан, ждет случая поддержать Вас во всяком устремлении. В конце концов именно подсознание, рождающее позитивное мышление, принесет Вам желаемое.\n" +
            "<p>Подсознание действует через сознание. Импульс мысли, достигающий сознания, классифицируется и записывается. Мысли могут быть извлечены из сознания или удалены из него так же, как письма из почтового Ящика.\n" +
            "<p>Впечатления и мысли копятся и воспринимаются независимо от их природы. Вы можете по своей воле вживить в подсознание любой план, любую мысль, любое намерение, которые хотели бы перевести в материальный (или денежный) эквивалент. Но учтите, – подсознание реагирует прежде всего на доминирующие желания, эмоционально подкрепленные верой.\n" +
            "<p>Обдумайте это с учетом рекомендаций, изложенных в главе «Желание», в связи с шестью наставлениями по формированию и реализации планов обогащения, и Вы поймете важность того, что Я хочу сказать.\n" +
            "<p>Подсознание трудится день и ночь. Методами, неизвестными человеку, оно черпает из Высшего Разума силу, способную превращать желания в реальность. При этом подсознание использует те средства, которые делают Ваши цели достижимыми.\n" +
            "<p>Человек не в состоянии полновластно управлять подсознанием, но человек волен в выборе рабочего материала для него: у Вашего подсознания есть только Ваши планы, желания и намерения. Поэтому перечитайте ка инструкции по использованию Вашего подсознания в главе, посвященной самовнушению. Есть множество подтверждений тому, что подсознание представляет собой связующее звено между человеческим и Мировым Разумом, оно – посредник, с помощью которого мы бесконечно черпаем из источника Бесконечного разума. Оно одно знает, как наши интеллектуальные усилия преобразуются в духовные. Подсознание – медиум, посредством которого молитвы возносятся к Тому, кто может их исполнить.</div>\n" +
            "\n" +
            "<h4>Вначале было слово<h4>\n" +
            "<div class=\"text\">" +
            "<p>Возможности созидательного усилия, связанного с подсознанием, беспредельны, они не поддаются реальному учету и вызывают трепет. Честно говоря, всегда, когда в беседе затрагивается тема подсознания, Я испытываю чувство собственной незначительности и неполноценности, вероятно из за того, что знания человека об этом предмете, к сожалению, весьма ограничены.\n" +
            "<p>Лишь восприняв как реальность существование подсознания и его возможности как медиума, материализующего желания, Вы сумеете оценить всю важность рекомендаций, предлагаемых в главе «Желание». Поймите также, почему Я неустанно твержу: желания должны быть четкими. Четче, еще четче – вот видите: уже можно и записать! И будьте настойчивыми в следовании инструкциям.\n" +
            "<p>Теперь о стимулах, возбуждающих в Вас способность достигать подсознания и влиять на него. Не падайте духом, если не все получается с первой попытки.\n" +
            "<p>Помните: Вы сможете управлять подсознанием, только если это станет привычкой. Следуйте рекомендациям из главы «Вера». Вы еще не умеете управлять верой? Будьте терпеливы и настойчивы.\n" +
            "<p>Я позволяю себе много повторов из глав «Вера» и «Самовнушение». Это необходимо для Вашего подсознания – ведь оно функционирует независимо от того, попытаетесь Вы на него воздействовать или нет, и неизбежно приводит к следующему умозаключению: чувство страха, мысли о нищете и вообще все негативные мысли стимулируют Ваше подсознание, пока Вы не научитесь управлять ими и пока пищей Вашего ума не станет нечто более благодарное.\n" +
            "<p>Подсознание не умеет бездействовать! Вы не даете ему работы? Что же, оно будет функционировать на том, что попадет в него без Вашего – раз Вы так хотите – участия. Мы ведь уже объясняли, что импульсы мысли беспрерывно проникают в подсознание из четырех источников (см. главу «Тайна секса и сублимации»).\n" +
            "<p>На данный момент Вам надо запомнить, что Ваше существование проходит в окружении всякого рода мыслительных импульсов, которые вступают в контакт с Вашим подсознанием, не утруждая себя уведомлениями. Некоторые импульсы негативны, другие позитивны. Ваша цель – отсечь поток негативных импульсов и помочь позитивным в их благотворном влиянии на подсознание. Если Вы этому научитесь, считайте, что ключ от подсознания в Ваших руках. Теперь Вы полностью в состоянии обезопасить подсознание от воздействия неблагоприятных мыслей.\n" +
            "<p>Все созданное человеком берет начало во вспышке мысли. Процессу созидания предшествует процесс воображения. Контролируемое воображение лежит в основе планов, ведущих к успеху в избранном деле. Импульс мысли должен пройти сквозь воображение и соединиться с верой. Совершенно так же план, соединенный с верой, попадает в подсознание именно через воображение.\n" +
            "<p>Как видите, для сознательного использования подсознания необходимо согласованное следование всем предлагаемым нами рекомендациям.\n</div>";
}
