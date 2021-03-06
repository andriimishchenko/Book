package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page708 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Как подготовить запрос или заявление</h4>\n" +
            "<div class=\"text\">"+
            "<p>Запрос или заявление нужно готовить так же тщательно, как юрист готовит бумаги для судебного разбирательства. Если у Вас нет достаточного опыта в их составлении, проконсультируйтесь со специалистом и прибегните к его услугам. Уважающие себя бизнесмены берут на работу людей, кое что понимающих в искусстве «подать» себя, а также более или менее искушенных в психологии работодателей. То же самое надо иметь в виду и тем, кто хочет продать свои услуги. В запрос должна входить следующая информация:" +
            "<ol>\n" +
            "\t<li>Образование. Опишите кратко, но четко, в каких учебных заведениях и какими предметами Вы занимались, не забывая упомянуть о Ваших успехах в том или ином виде знаний.</li>\n" +
            "\t<li>Стаж работы по специальности. Если у Вас есть опыт работы по специальности, по которой Вы ищете работу, опишите все достаточно подробно, не забудьте приписать адреса и фамилии Ваших прежних руководителей. Будьте уверены, если Вы Ясно и определенно расскажете о том специальном опыте, который Вы приобрели раньше, о Ваших уникальных способностях, это сильно поможет в устройстве на интересующую Вас работу.</li>\n" +
            "\t<li>Справки. Практически любая фирма хочет знать как можно больше о прошлой деятельности человека, которого намеревается взять на работу. Приложите к своему запросу следующие справки: а) предыдущие наниматели; б) преподаватели, у которых Вы учились; в) рекомендации известных людей, пользующихся всеобщим доверием.</li>\n" +
            "\t<li>Фотография. Не забудьте приложить к письму собственную фотографию.</li>\n" +
            "\t<li>Просьба об определенной должности. Избегайте упоминания конкретной должности, которую Вы хотели бы получить. Никогда не говорите: «именно такая работа» – это свидетельствует о каких то пробелах в Вашей квалификации.</li>\n" +
            "\t<li>Обоснование наличия квалификации, необходимой для перспективной должности. Подробно изложите причины Вашей уверенности в том, что квалификация, которой Вы обладаете, достаточна для занятия интересующей Вас должности. Это наиболее важная часть запроса. Она в большей степени, чем все остальное, может определить Ваше будущее.</li>\n" +
            "\t<li>Предложение поработать с испытательным сроком. Может, это чересчур радикальное средство, но опыт показывает, что, если Вы уверены в своей квалификации, испытательный срок Вам не повредит. Такое предложение с Вашей стороны само по себе указывает на то, что Вы уверены в собственных силах и справитесь с должностью, на которую рассчитываете. Но Вы должны Ясно представлять себе, что Ваше предложение основано на: а) уверенности, что Вы годитесь на должность; б) уверенности, что Вас действительно возьмут на постоянную работу после испытательного срока; в) решимости занять эту должность.</li>\n" +
            "\t<li>Ваши познания в той области, где работает предполагаемый наниматель. Прежде чем претендовать на место или должность, тщательно ознакомьтесь с деятельностью предприятия работодателя и не скрывайте собственные познания в данной сфере. Это может произвести впечатление, свидетельствуя о Вашей заинтересованности в должности и о наличии творческой жилки.</li>\n" +
            "</ol>" +
            "<p>Помните: юристом, например, называют вовсе не того, кто знает все законы назубок, а того, кто лучше всего может подготовить факты и доказательства, приводящие к цели. Если Ваши «доказательства» подобраны с умом и составлены со смыслом, победа обеспечена более чем на половину. И это только начало!\n" +
            "<p>Не трудитесь делать запрос очень длинным. Работодатели настолько же заинтересованы в привлечении высококвалифицированных специалистов, насколько Вы – в получении интересной работы. Другими словами, удача наиболее преуспевающих предпринимателей по большей части зависит от их способности подобрать себе квалифицированных заместителей. Поэтому им нужна только полезная, необходимая информация.\n" +
            "<p>Помните также и о других, казалось бы, второстепенных вещах: старательность и аккуратность, с какими Вы подготовите запрос, будут свидетельствовать о Вашем усердии. У меня был опыт подготовки таких запросов для клиентов, и он был настолько удачен, что все мои клиенты получали положительный ответ без личного собеседования с нанимателями.\n" +
            "<p>Когда Ваш запрос будет составлен, напишите на нем печатными буквами что нибудь вроде: «Сведения о квалификации Роберта К. Смита, претендента на должность личного секретаря президента Блэнк Компани Инк».\n" +
            "<p>Имя адресата можно менять сколько угодно. Эта как бы личная реклама, несомненно, привлечет внимание. Аккуратно напечатайте запрос на самой лучшей бумаге, которую только удастся раздобыть, и заверните его в плотную бумагу, как это делают в книжных магазинах. А если Вы хотите представить его не в одну компанию, то всегда можете изменить название фирмы. На одной из первых страниц запроса должна быть и Ваша фотография. Когда будете писать письмо, следуйте в целом этой инструкции, однако более полагайтесь на собственное воображение.\n" +
            "<p>Удачливый продавец тщательно следит за собой. Он лучше всех понимает, какое значение имеет первое впечатление. Ваш запрос – не забывайте об этом – посредник, и его с легкостью можно уподобить такому продавцу. Подарите ему наиболее «подходящий костюм» и снабдите «улыбкой», и он будет выгодно отличаться от всех других предложений, которые когда либо встречались Вашему работодателю. Чем более достойна Вас та должность, соискателем которой Вы Являетесь, тем тщательнее должны быть приготовления. И если Вы продадите свои услуги предпринимателю в форме, производящей на него сильное впечатление, то, возможно, и жалованье Вам сразу же назначат более высокое.\n" +
            "<p>Если Вы ищете место с помощью рекламного агента или агента, действующего от имени нанимателя, снабдите и его копией Вашего запроса. Таким образом Вы создадите удобства для всех и увеличите свои шансы.\n" +
            "\n</div>";
}
