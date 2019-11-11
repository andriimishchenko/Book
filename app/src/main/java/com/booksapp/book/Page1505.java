package com.booksapp.book;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1505 extends AppCompatActivity {
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.item1:
                Intent intent = new Intent(getBaseContext(), Page1506.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML ="<h4>«Именно деньги»<h4>\n" +
            "<div class=\"text\">" +
            "<p>Кто то скажет: «Почему Вы написали книгу о деньгах? Разве богатство измеряется только в долларах?» Многие убеждены, что существуют другие формы богатства, более предпочтительные для души. Да, богатство – не только доллары, но и на белом свете живут миллионы людей, которые ответят Вам так: «Дайте мне столько денег, сколько Я хочу, а уж остальным и сам себя обеспечу».\n" +
            "<p>Основная побудительная причина создания этой книги – страх нищеты, парализовавший миллионы мужчин и женщин. Послушайте, что делает этот страх. Рассказывает Уэстбрук Пенглер:\n" +
            "<p>«Деньги – всего лишь связки раковин, металлические кружочки или полоски бумаги. Но существуют богатства сердца и души, которые не купишь за деньги; находящиеся в подавленном состоянии зачастую не могут думать об этом и вообще сохранять присутствие духа. Вот человек выброшен на улицу; он – внизу, он – вне; и то, что происходит в его душе, совершенно отчетливо проявляется в посадке плеч, в том, как он носит шляпу, идет или смотрит. Он не может уйти от чувства собственной неполноценности, находясь среди людей, имеющих постоянную работу, даже если он знает, что неизмеримо Выше их по интеллекту, по характеру и по способностям.\n" +
            "<p>В свою очередь эти люди (даже друзья) испытывают некоторое чувство превосходства и, пусть бессознательно, относятся к нему как к раненому. Какое то время он имеет возможность одалживать деньги, но их, разумеется, недостаточно для поддержания прежнего уровня жизни, и, в конце концов, никому не одалживают вечно. Причем он одалживает «на жизнь», что лишь усугубляет депрессию, а у самих этих денег нет оживляющей силы денег заработанных. Конечно же, Я говорю не о бездельниках и смирившихся неудачниках, а о мужчинах с нормальным самолюбием и самоуважением.\n" +
            "<p>Полагаю, что женщины, оказавшиеся в подобной ситуации, ведут себя иначе. Замечу попутно, что, рассуждая о людях, ставших лишними, мы почему то не имеем в виду женщин. Да, редко можно увидеть женщину, стоящую в очереди за миской супа, а тем более нищенствующую. Вы не выделите их, как мужчин, в толпе по каким либо очевидным признакам. Опять таки речь не идет об уличных бродяжках что женского, что мужского пола; их, вероятно, одинаковое число. Речь идет о сравнительно молодых, достойных, интеллигентных женщинах. Их должно быть много, но они не выставляют напоказ крах своей жизни. Может быть, они предпочитают самоубийство.\n" +
            "<p>Человек, оказавшийся не у дел, имеет достаточно времени для размышлений. У него есть время поехать «к черту на рога» за обнаружившейся вакансией, чтобы узнать, что она занята, или о том, что надо продавать какую нибудь дрянь, которую если купят, то из жалости, и ему придется жить на комиссионные. Отказавшись от столь «заманчивой» перспективы, он вдруг видит, что оказался на улице и ему можно идти «куда угодно», что, впрочем, совершенно равнозначно «некуда идти». И он идет, идет, идет. Он глазеет на витрины, на недоступную ему роскошь и чувствует себя человеком второго сорта; он уступает место у витрин тем, кто смотрит на них с активным интересом. Затем он забредает в метро или библиотеку, чтобы дать отдых ногам и немного согреться. Но это не поиск работы – хотя он опять идет.\n" +
            "<p>Он этого не знает, но бесцельность поиска, даже если она еще не запечатлелась в его внешности, сама по себе чревата отказом. Его одежда, оставшаясЯ с хороших времен, еще неплохо сидит, но не может скрыть упадка духа.\n" +
            "<p>Он видит тысячи людей, занятых своей работой, и завидует им в глубине души – всем этим киоскерам, клеркам, аптекарям, кондукторам. Те – независимы, в них бездна самоуверенности и достоинства, а он не может убедить себя, что тоже хороший человек, хотя постоянно спорит с собой и всегда приходит к благоприятному для себя выводу.»\n" +
            "<p>Именно деньги, точнее, их отсутствие, так изменили этого человека. Будь у него немного денег – он опять стал бы самим собой.\n</div>";
}
