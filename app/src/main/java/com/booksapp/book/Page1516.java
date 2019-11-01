package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page1516 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Беспокойство – тот же страх<h4>\n" +
            "<div class=\"text\">" +
            "<p>Беспокойство – состояние сознания, происходящее от страха. Оно действует медленно, но настойчиво. Шаг за шагом оно «окапывается» в сознании, пока не парализует способность человека к здравому рассуждению, не разрушит его уверенность в себе и инициативность, беспокойство – это вид непрекращающегося страха, имеющего причиной нерешительность, и, стало быть, это также состояние сознания, которое можно и должно контролировать.\n" +
            "<p>Расстроенное сознание беспомощно. Таковым его делает нерешительность. У большинства из нас недостает силы воли быстро принимать решение и уж потом (когда оно принято) держаться за него изо всех сил.\n" +
            "<p>Мы и не думаем об обстоятельствах после того, как наметили для себя определенную линию действий.\n" +
            "<p>Однажды мне довелось беседовать с человеком, которого через два часа должны были казнить на электрическом стуле. Этот осужденный был самым спокойным среди восьми сотоварищей по камере смертников. Его спокойствие побудило меня спросить, как он чувствует себя, зная, что через короткое время перейдет в вечность. «А неплохо. Только подумай, брат, – всем моим проблемам скоро наступит конец. У меня ведь ничего не было в жизни, кроме проблем. Мне всегда было трудно добыть еду и одежду. А скоро мне ничего этого не понадобится. Я стал чувствовать себя действительно хорошо, как только точно узнал, что должен буду умереть. Тогда Я решил: Я приму свою судьбу в хорошем настроении».\n" +
            "<p>Говоря это, он уплетал обед, которого вполне хватило бы на троих, очевидно, наслаждаясь каждым съедаемым кусочком, как будто ничто ужасное его не ожидало. Решение помогло этому человеку подчиниться судьбе! Но решение так же может уберечь Вас от следования в русле нежелательных обстоятельств.\n" +
            "<p>Именно с помощью нерешительности каждый из основных страхов преобразуется в беспокойство. Освободитесь раз и навсегда от страха смерти, признав ее неизбежной. Прогоните прочь страх нищеты, приняв решение преуспеть настолько, насколько это возможно без излишних волнений. Наступите на горло боязни критики, решившись не беспокоиться из за того, что другие подумают или скажут о Вас. Устраните из Вашего сознания страх критики через новое к ней отношение – воспринимайте ее не как препятствие, а как благословенную пору, приносящую с собой мудрость, самоконтроль и уровень понимания жизни, недоступный юности. Избавьте себя от страха болезней, просто позабыв их симптомы. Управляйте боязнью неудачи в любви, убеждая себя, что Вы в конце концов можете при необходимости обойтись и без нее.\n" +
            "<p>И вообще – отвыкайте беспокоиться! Примите одно для всех случаев решение: ничто, предлагаемое жизнью, недостойно Ваших волнений. И Вы увидите, что вместе с этим решением к Вам придет уравновешенность, Ясность интеллекта, спокойствие мысли, а это неизбежно приведет к счастью.\n" +
            "<p>Человек, чье сознание заполнено страхами, не только разрушает собственные возможности к осмысленному действию, но и деструктивно воздействует на сознание всех, с кем общается, разрушая, таким образом, их возможности.\n" +
            "<p>Даже собака или лошадь чувствуют, когда их хозяин боится. Более того, они улавливают флюиды страха, испускаемые человеком, и ведут себя соответственно. Между прочим, и среди животных, обладающих более низким уровнем интеллекта, обнаруживается эта способность – чувствовать чужой страх.\n</div>";
}