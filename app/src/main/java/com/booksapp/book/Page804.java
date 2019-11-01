package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Page804 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Ум хорошо, а два лучше</h4>\n" +
            "<div class=\"text\">"+
            "<p>Ричард Генри Ли стал важным действующим лицом в нашей истории, потому что состоял в постоянной переписке с Сэмьюэлом Адамсом. Будущие отцы основатели свободно делились своими страхами и надеждами относительно благосостояния населения их провинций. Из их переписки мистер Адамс вынес мысль, что регулярный обмен письмами между представителями всех тринадцати колоний мог бы способствовать координации усилий, столь необходимой для решения стоящих перед ними задач. Через два года после столкновения с солдатами в Бостоне (в марте 1772 г.) С. Адамс предложил Ассамблее сформировать Комитет по корреспонденции, который бы состоял из корреспондентов, назначаемых от каждой колонии, «в целях дружественного сотрудничества во благо колоний Британской Америки».\n" +
            "<p>Собственно, это и Явилось первым организационным оформлением силы, принесшей свободу и Вам, и мне: была образована «мозговая группа» из С. Адамса, Р. Ли и Д. Хэнкока. К моменту ее организации жители колоний вовсю вели беспорядочную войну с британскими войсками, примерно так же, как в вышеописанном бостонском инциденте, но проку от этого было немного. Отсутствовал «мозговой центр», направляющий разрозненные выступления, соединяющий силу сердец, умов и душ ради решения единого для всех колоний вопроса взаимоотношений с Англией.\n" +
            "<p>Между тем британцы не теряли времени даром. Их планы не были спонтанными, но исходили из координирующего центра. Планы подкреплялись деньгами и организованной армией.\n\n</div>";
}
