package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page1520 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Сначала подумайте!<h4>\n" +
            "<div class=\"text\">" +
            "<p>Часто ли Вы жалуетесь на свое самочувствие? Если да, то по какой причине?\n" +
            "<p>Ищите ли Вы ошибки у других по малейшему поводу?\n" +
            "<p>Часто ли Вы допускаете ошибки в работе? Если да, то почему?\n" +
            "<p>Как Вы ведете беседу – саркастически, наступательно?\n" +
            "<p>Избегаете ли Вы общения с кем либо умышленно? Если да, то почему?\n" +
            "<p>Часто ли страдаете от несварения желудка? Если да, то по какой причине?\n" +
            "<p>Кажется ли Вам жизнь тщетной, а будущее безнадежным?\n" +
            "<p>Нравится ли Вам Ваша профессия? Если нет, то почему?\n" +
            "<p>Часто ли чувствуете к себе жалость? Если да, то почему?\n" +
            "<p>Завидуете ли Вы тем, кто в чем то Вас превосходит?\n" +
            "<p>Чему Вы уделяете больше времени – мыслям об успехе или о поражении.\n" +
            "<p>Прибывает или убывает в Вас уверенности в себе по мере взросления?\n" +
            "<p>Извлекаете ли Вы какой либо прок из ошибок?\n" +
            "<p>Позволяете ли Вы родственникам или знакомым волновать вас? Если да, то почему?\n" +
            "<p>Бывает ли с Вами так, что иногда Вы парите в облаках, а временами погружаетесь в глубины безнадежности?\n" +
            "<p>Кто более всего вдохновляет Вас? Какова причина этого?\n" +
            "<p>Терпите ли Вы тех, кто влияет на Вас негативно или обескураживающе, даже если этого можно избежать?\n" +
            "<p>Безразличны ли Вы к своей внешности? Если да, то в каких случаях и почему?\n" +
            "<p>Умеете ли Вы «топить» тревоги в делах, быть настолько занятым, что просто нет времени на них раздражаться?\n" +
            "<p>Назвали ли бы Вы себя бесхребетным и слабовольным, поскольку позволяете другим думать за себя?\n" +
            "<p>Как часто волнения, которых можно избежать, беспокоят Вас и почему Вы их терпите?\n" +
            "<p>Употребляете ли Вы спиртное, наркотики или сигареты «для успокоения нервов»? Если да, то почему же Вы вместо этого не задействуете силу воли?\n" +
            "<p>«Придирается» ли кто нибудь к Вам? Если да, то на каком основании?\n" +
            "<p>Есть ли у Вас главная цель в жизни? Если да, то что это за цель? Какой план Вы разработали для ее достижения?\n" +
            "<p>Страдаете ли Вы от какого либо из шести основных страхов? Если да, то от какого (каких)?\n" +
            "<p>Есть ли у Вас метод защиты от отрицательных влияний?\n" +
            "<p>Занимаетесь ли Вы обдуманно и постоянно самовнушением, чтобы настроить Ваше сознание на позитивную работу?\n" +
            "<p>Чем Вы больше дорожите – материальными ценностями или возможностью контролировать свои мысли?\n" +
            "<p>Можно ли на Вас легко повлиять даже вопреки Вашему собственному суждению?\n" +
            "<p>Прибавил ли сегодняшний день что либо ценное к Вашему знанию или умонастроению?\n" +
            "<p>Смотрите ли Вы в лицо обстоятельствам, делающим Вас несчастливым, или предпочитаете уходить от ответственности?\n" +
            "<p>Анализируете ли Вы свои ошибки и неудачи с тем, чтобы извлечь из них пользу, или же Вы придерживаетесь мнения, что этого делать не надо?\n" +
            "<p>Можете ли Вы назвать слабости, наносящие Вам наибольший ущерб? Что Вы делаете, чтобы избавиться от них?\n" +
            "<p>Побуждаете ли Вы других людей приходить к Вам за сочувствием со своими проблемами?\n" +
            "<p>Что, по Вашему жизненному опыту, помогает Вам больше в продвижении вперед – собственные уроки или чье то влияние?\n" +
            "<p>Оказывает ли Ваше присутствие на других устойчивое отрицательное воздействие?\n" +
            "<p>Какие привычки в других раздражают Вас более всего?\n" +
            "<p>Составляете ли Вы Ваше мнение сами или позволяете себе находиться под посторонним влиянием?\n" +
            "<p>Научились ли Вы приходить в такое умонастроение, которое защищало бы Вас от обескураживающих влияний?\n" +
            "<p>Наполняет ли Ваша профессия душу верой и надеждой?\n" +
            "<p>Сознаете ли Вы, что обладаете духовной силой, достаточной для поддержания умонастроения свободным от всяких страхов?\n" +
            "<p>Настраивает ли религия Вашу душу на положительные мысли?\n" +
            "<p>Считаете ли Вы своим долгом разделить чужое беспокойство? Если да, то почему?\n" +
            "<p>Если Вы согласны с поговоркой «Два сапога – пара», то что Вы знаете о себе из наблюдения за Вашими друзьями?\n" +
            "<p>Видите ли Вы какую либо связь между людьми, с которыми Вы общаетесь наиболее тесно, и любой из Ваших неприятностей?\n" +
            "<p>Возможно ли, что кто то, кого Вы считаете другом, Является на самом деле Вашим злейшим врагом в силу отрицательного влияния, которое он на Вас оказывает?\n" +
            "<p>По каким критериям Вы определяете, кто Вам полезен, а кто вреден?\n" +
            "<p>Люди Вашего ближайшего окружения интеллектуально Выше или ниже Вас?\n" +
            "<p>Какое время каждый день Вы уделяете: а) работе; б) сну; в) развлечениям и отдыху; г) получению полезных знаний; д) ничегонеделанию?\n" +
            "<p>Кто из Ваших знакомых более всех Вас: а) вдохновляет; б) предостерегает; в) обескураживает?\n" +
            "<p>Что беспокоит Вас сильней всего? Почему Вы это терпите?\n" +
            "<p>Когда кто либо дает Вам бесплатный совет, что Вы делаете: следуете совету бездумно или анализируете его возможные мотивы?\n" +
            "<p>Подумайте, чего Вы больше всего желаете. Хотите ли Вы реализовать Ваше желание? Согласны ли Вы подчинять все другие желания этому одному? Сколько раз в день Вы думаете о достижении Вашей цели?\n" +
            "<p>Часто ли Вы меняете мнение? Если да, то почему?\n" +
            "<p>Завершаете ли Вы обычно начатое Вами дело?\n" +
            "<p>Сильное ли впечатление производят на Вас титулы, звания и богатство других людей?\n" +
            "<p>Важно ли для Вас то, что окружающие думают и говорят о вас?\n" +
            "<p>Угождаете ли Вы людям из за их общественного или финансового положения?\n" +
            "<p>Кого Вы считаете величайшим из живущих людей? В каких отношениях этот человек превосходит Вас?\n" +
            "<p>Сколько времени Вы посвятили изучению этих вопросов и ответов на них? (Для этого, как мне представляется, необходимо потратить по меньшей мере один день).\n" +
            "<p>Если Вы честно ответили на все вопросы, то наверняка узнали о себе больше, чем подавляющее число людей. Изучите эти вопросы тщательным образом, возвращайтесь к списку раз в неделю в течение нескольких месяцев, и Вам останется только поражаться количеству дополнительных знаний огромной важности, которые Вы приобретете простым способом – искренними ответами. Если Вы не уверены относительно ответов на некоторые вопросы, посоветуйтесь с теми, кто хорошо Вас знает (главное, чтобы у этих людей не было оснований льстить Вам), и посмотрите на себя их глазами. Уверяю Вас – это будет впечатляющий опыт!\n</div>";
}