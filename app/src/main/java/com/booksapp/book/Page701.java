package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page701 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h3>7. Шестой шаг к богатству: ПЛАНИРОВАНИЕ</h3>\n" +
            "<div class=\"text\">"+
            "<p>Посвящение в мистическую тайну «мозгового центра». Найдите для себя наилучшее поле деятельности, и Вы будете руководить и делать большие деньги в потрясающе короткие сроки.\n" +
            "<p>Вы уже поняли, наверное, что любые человеческие достижения начинаются с желания. Из абстрактного желание становится конкретным в «мастерских воображения», где и составляются планы по претворению желаний в действительность.\n" +
            "<p>В главе о желании Вы получили информацию о том, как желание денег превращается в собственно деньги. К этой цели ведут шесть Ясных, практических шагов. Один из этапов – формирование четкого, реально выполнимого плана (или планов), посредством которого можно осуществить задуманное.\n" +
            "<p>Перейдем к подробному изложению такого плана:\n" +
            "<ol>\n" +
            "\t<li>Возьмите в союзники столько людей, сколько Вам нужно для создания и осуществления Вашего плана (или планов), – используйте принцип «мозгового центра», описываемый далее. Абсолютно существенно Ваше внутреннее согласие с этой рекомендацией. Не пренебрегайте ею.</li>\n" +
            "\t<li>Прежде чем Вы образуете альянс интеллектуалов, определите, какие выгоды получит каждый член Вашей группы от участия в этом союзе и что Вы ему можете предложить. Никто не будет работать с Вами бесконечно без компенсации за свой труд. Ни один разумный человек не пригласит другого для работы и сам не будет ожидать такого приглашения без надежды на адекватное вознаграждение, хотя оно не всегда может быть измерено деньгами.</li>\n" +
            "\t<li>Договоритесь встречаться с членами «мозгового центра» не реже двух раз в неделю и даже чаще, если это возможно, до тех пор, пока сообща Вы не составите план, который в наибольшей степени устраивал бы Вас.</li>\n" +
            "\t<li>Сохраняйте гармонию в Ваших отношениях с членами интеллектуальной группы. Если Вы не можете в точности выполнить эту рекомендацию, будьте готовы к неудаче в любой момент. «Мозговой центр» не может существовать без совместимости всех его участников.</li>\n" +
            "</ol>" +
            "<p>Держите в уме следующие вещи:" +
            "<ol>\n" +
            "\t<li>Вы занимаетесь делом огромной для Вас важности. Для того чтобы быть уверенным в успехе, Вы должны иметь безошибочный план действий.</li>\n" +
            "\t<li>Вы должны привлечь на Вашу сторону и в Ваших целях опыт, образование, природные способности и воображение других людей. Любой человек, достигший впечатляющих успехов в бизнесе, следовал методу, описанному Выше.</li>\n" +
            "</ol>" +
            "<p>Достаточного опыта, образования, способностей, знаний, необходимых для того, чтобы преуспеть, нет ни у кого! Какой бы план Вы ни выбрали, все равно он будет плодом коллективного разума. Вы можете быть создателем плана в целом ли, в части ли его, но проследите за тем, чтобы он прошел экспертизу «мозгового центра».</div>"+
            "<h4>На ошибках учатся</h4>\n" +
            "<div class=\"text\">"+
            "<p>Если первый же план провалится, не беда; замените его другим. Если и этот новый план не оправдает Ваших надежд, опять же не спешите отчаиваться, а садитесь за разработку следующего проекта и ищите нетривиальные решения – пока план не заработает. Именно на этом этапе многие отступают из за отсутствия настойчивости. Помните: если план не осуществляется, то вместо того, чтобы понапрасну расстраиваться, надо заменить его другим. Вот и вся хитрость!\n" +
            "<p>Большинство неглупых людей не может обойтись без плана, какой бы предпринимательской деятельностью они не занимались. Главное, чтобы этот план был реальным и жизнеспособным. И не бойтесь начинать все сначала.\n" +
            "<p>Временная неудача означает только одно – в Вашем проекте что то не так. Миллионы людей всю жизнь не могут выбраться из бедности и даже нищеты только по одной причине: из за отсутствия хорошо продуманного плана. Ваши достижения целиком и полностью зависят от глубины его разработки.\n" +
            "<p>Человека нельзя принудить к отступлению, если он не сдается сам – и прежде всего в своем собственном сознании.\n" +
            "<p>Джеймс Дж. Хилл терпел неудачу за неудачей, пытаясь умножить капитал, необходимый для строительства железнодорожной магистрали Восток – Запад.\n" +
            "<p>Но временные поражения он сумел таки обратить в победу и сделал это с помощью новых проектов.\n" +
            "<p>Генри Форд тоже столкнулся, казалось бы, с непреодолимыми трудностями, притом не в самом начале своей «автомобильной» карьеры, а на вершине ее. Однако он продумал все заново от начала до конца, составил другой план и пришел к новой финансовой победе.\n" +
            "<p>Когда мы говорим о людях, разбогатевших, как нам кажется, в одночасье, мы абсолютно не замечаем тех временных неудач, которые им пришлось преодолеть задолго до того, как улыбнулось счастье.\n" +
            "<p>Никто из последователей этой философии не должен тешить себя надеждой разбогатеть, не пройдя через полосу «временных неудач». Когда такая полоса наступает, – это сигнал, что Ваш план недостаточно глубок. Надо все взвесить и без предрассудков, спокойно вновь устремиться навстречу желанной цели. Если Вы бросаете дело, не достигнув ее, то скорее всего Вы просто лентяй. Лентяй никогда не победит, а победитель не может быть ленивым. Запомните это на всю жизнь, а лучше напишите крупными буквами на листке бумаги и повесьте так, чтобы Вы могли видеть его перед отходом ко сну и каждое утро, настраиваясь на работу.\n" +
            "<p>Подбирая интеллектуальную группу, попытайтесь остановить выбор на тех, кто не делает трагедии из временных неудач.\n" +
            "<p>Некоторые люди совершенно уверены в том, что только деньги делают деньги. Это далеко не так! Лучше всего поможет преуспеть заряд желания, который нетрудно преобразовать в его денежный эквивалент, основываясь на изложенных здесь принципах. Деньги сами по себе – всего лишь косная материя. Деньги не думают, не двигаются и все время молчат, но у них прекрасный «слух»: стоит их позвать, как они не замедлят Явиться пред Ясные очи страждущих звона монет!\n\n</div>";
}
