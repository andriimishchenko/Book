package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page805 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Решение, изменившее ход истории</h4>\n" +
            "<div class=\"text\">"+
            "<p>Вместо мистера Хатчинсона новым губернатором Массачусетса был назначен мистер Гэйдж, решивший добиться прекращения оппозиционной деятельности с помощью устрашения. С этой целью губернатор Гэйдж отправил к Сэмьюэлу Адамсу своего посланника. Чтобы лучше понять то, что произошло, приведем часть разговора между С. Адамсом и полковником Фентоном.\n" +
            "<p>Полковник Фентон: «От имени губернатора Гэйджа, господин Адамс, хочу уверить Вас, что губернатор уполномочен вести переговоры об условиях, на которых Вы согласились бы выйти из оппозиции к действиям правительства. Губернатор настоятельно советует Вам, сэр, не вызывать и в дальнейшем неудовольствия Его Величества. Ваше поведение было таковым, что вполне подпадает под действие акта, изданного Его Величеством королем Генрихом Восьмым, согласно которому лица, виновные в измене или недонесении об измене, могут быть отправлены в Англию для суда по представлению губернатора провинции. Но если Вы перемените свое политическое направление, то не только будете лично удовлетворены, но и восстановите взаимоотношения с короной».\n" +
            "<p>Выбор, стоявший перед Сэмьюэлом Адамсом, предполагал уход из оппозиции в обмен на взятку либо продолжение борьбы с риском быть повешенным. Настало время, точнее момент, когда Адамс должен был принять решение всей жизни. И Адамс… взял с полковника Фентона слово чести, что тот дословно передаст его ответ губернатору.\n" +
            "<p>Вот что он сказал: «Можете сказать губернатору Гэйджу, что моя душа уже давно живет в мире с королем королей, и ничье частное мнение не заставит меня отречься от правого дела моей страны. И передайте также губернатору Гэйджу настоятельный совет Сэмьюэла Адамса не оскорблять в дальнейшем чувств доведенного до белого каления народа».\n" +
            "<p>Получив едкий ответ Адамса, губернатор впал в бешенство и издал воззвание, гласившее: «Именем Его Величества Я предлагаю и обещаю милостивое прощение всем лицам, которые сложат оружие и вернутся к исполнению обязанностей мирных подданных. Из числа лиц, могущих рассчитывать на сие милостивое прощение, исключаются Сэмьюэл Адамс и Джон Хэнкок, проступки коих перед\n" +
            "<p>Его Величеством слишком гнусны, чтобы заслуживать что либо, кроме наказания».\n" +
            "<p>Выражаясь современным Языком, С. Адамс и Д. Хэнкок «оказались под колпаком». Угроза взбешенного губернатора побудила их прийти к другому решению, не менее, впрочем, опасному. Они сразу же созвали секретное совещание из своих наиболее преданных приверженцев. После того как все собрались, Адамс закрыл дверь комнаты на ключ, ключ положил в карман и объявил присутствующим, что необходимость созвать съезд колонистов абсолютно назрела. И что никто не покинет комнаты, пока таковое решение не будет принято!\n" +
            "<p>Публика взволновалась. Взвешивались возможные последствия этого радикального шага. Выражались большие сомнения в мудрости столь определенного решения, к тому же вызывающего по отношению к короне. Но среди запертых были два человека, обладавшие иммунитетом к страху, слепые к возможности неудачи, – Д. Хэнкок и С. Адамс. Под воздействием их могучих умов остальные пришли к согласию в том, что Комитетом по корреспонденции должно быть сделано все необходимое для проведения в Филадельфии 5 сентября 1774 года первого Континентального съезда.\n" +
            "<p>Запомните эту дату. Она более важна, чем 4 июля 1776 года, ибо, если бы не было решения о проведении Континентального съезда, могло не быть и подписания Декларации независимости.\n" +
            "<p>Накануне первого заседания нового съезда другой лидер в другой части страны пребывал в творческих муках в связи с изданием «Обобщенного взгляда на права Британской Америки». Это был Томас Джефферсон из провинции Вирджиния, чьи взаимоотношения с лордом Данмором (представителем короны в Вирджинии) были столь же напряжены, как и у Д. Хэнкока и С. Адамса с их губернатором.\n" +
            "<p>Вскоре после публикации знаменитого «Обобщенного взгляда на права Британской Америки» Т. Джефферсон был извещен, что подлежит наказанию по обвинению в государственной измене правительству Его Величества. Услышав об угрозе, Патрик Генри, один из сотоварищей мистера Джефферсона, высказался дерзко, но на века: «Если это измена, то изменяй по максимуму».\n" +
            "<p>В течение двух – с перерывами – лет работы первого Континентального съезда именно такие люди, не имеющие ни власти, ни военной силы, ни средств, обсуждали судьбы колоний, пока 7 июня 1776 года не поднялся Ричард Генри Ли и не заявил, обращаясь к председательствующему и делегатам: «Джентльмены! Я утверждаю, что Соединенные колонии должны и имеют право быть независимыми государствами, должны выйти из всякой формы подданства британской короне и всякие политические отношения между ними и Великобританией считаются и должны быть разорванными».\n\n</div>";
}
