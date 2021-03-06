package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1301 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h3>13. Двенадцатый шаг к богатству: ИНТЕЛЛЕКТ</h3>\n" +
            "<div class=\"text\">"+
            "<p>В каждом уголке сознания Вам откроются новые поразительные возможности. Используйте же свою способность быстро, четко и эффективно мыслить.\n" +
            "<p>Более сорока лет назад автор, работая совместно с покойным доктором Александром Грэмом Беллом и доктором Элмером Р. Гэйтсом, пришел к выводу, что каждый человеческий мозг как бы представляет собой устройство для – одновременного – приема и передачи колебаний мысли. Подобно радио, человеческий мозг способен воспринять колебания мысли, посланной другим мозгом. Вспомните описание работы «творческого воображения» (см. главу «Воображение») и сравните с вышесказанным. Не правда ли, творческое воображение – это своего рода «приемное устройство» сознания, куда поступают импульсы мысли, посланные другими людьми? Одновременно он связывает аналитический ум с четырьмя источниками, стимулирующими интеллект.\n" +
            "<p>Стимулируемый, или ускоряемый до высокого уровня колебаний, интеллект становится более восприимчивым к мысли, поступающей из внешних источников. Этот процесс ускорения происходит через посредство положительных либо отрицательных эмоций – ведь эмоции увеличивают колебания мысли.\n" +
            "<p>По интенсивности и силе побудительного воздействия сексуальное чувство возглавляет список человеческих чувств. Интеллект, стимулируемый сексуальным чувством, действует гораздо эффективней, чем если бы это чувство оставалось в покое либо вообще отсутствовало. В результате преобразования сексуального чувства резко усиливается мыслительный процесс, что делает творческое воображение более восприимчивым. С другой стороны, хорошо работающий мозг не только притягивает посторонние идеи, но и приводит себя в состояние, необходимое для восприятия этих идей подсознанием.\n" +
            "<p>Итак, подсознание – это «передающее устройство» мозга, а творческое воображение – его «принимающее устройство». В контексте нового понимания функционирования подсознания и творческого воображения подумайте о роли самовнушения – этого оператора, приводящего в действие Вашу «радиостанцию».\n" +
            "<p>В главе «Самовнушение» Вы уже ознакомились со способами превращения желаний в их денежный эквивалент. Так и управление Вашей «радиостанцией» – не самая сложная процедура. Оно держится на трех китах – подсознании, творческом воображении и самовнушении. Как заставить их работать – пояснено в соответствующих главах. Но помните, все начинается с желания!\n" +
            "\n</div>\n" +
            "\n" +
            "<h4>Во власти невидимых сил<h4>\n" +
            "<div class=\"text\">" +
            "<p>В течение многих веков человек слишком зависел от своих физических ощущений, ограничивая свои знания миром физических тел, где все можно увидеть, потрогать, взвесить и измерить.\n" +
            "<p>Сейчас мы вступаем в поразительнейший из веков, открывающий возможность познания невидимых сил окружающего мира. Не придется ли нам признать, пережив этот век, что «другое Я» гораздо более могущественно, чем то физическое «я», которое мы видим в зеркале? Нередко, касаясь невидимого, не воспринимаемого с помощью «пяти чувств», люди бывают слишком легковесными. Пускай это напоминает нам, что все мы подконтрольны неосязаемым силам.\n" +
            "<p>Все человечество бессильно взаимодействовать с неосязаемой силой, воплощенной в океанских волнах. Человек не в состоянии понять силу всемирного тяготения, держащую маленькую Землю «подвешенной» в пространстве и не позволяющую людям упасть с нее; тем более не способен он взять эту силу под контроль. Человек полностью подвластен силе, вызывающей землетрясения, равно как беспомощен перед силой электричества.\n" +
            "<p>Поэтому слишком рано говорить о конце нашего невежества перед лицом природы. Ведь мы даже не понимаем силы, воплощенной в почве Земли, – силы, дающей человеку хлеб, питье, одежду и благосостояние.\n</div>";
}
