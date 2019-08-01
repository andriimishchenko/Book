package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page107 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Успех – это одна глубокая идея</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Отвечая, Я сформулирую тринадцать принципов. Но запомните – Ваш ответ на вопросы, вызванные наблюдениями за странной этой жизнью, может содержаться в Вашем собственном сознании в виде идеи, плана или намерения, которые, возможно, возникнут при чтении.\n" +
            "<p>Для успеха достаточно одной глубокой идеи. Принципы, описываемые здесь, в сущности, и есть способы взращивания полезных идей.\n" +
            "<p>Прежде чем вплотную подойти к их изложению, хочу предложить Вам подумать над следующим утверждением: «Когда начинаешь богатеть, деньги притекают столь быстро и в таком количестве, что воистину удивляешься: где же Вы хоронились все предыдущие постные годы?..» Оно кажется особенно поразительным, если принять во внимание всеобщее убеждение, что богатыми становятся только те, кто долго и упорно работает.\n" +
            "<p>Но когда Вы начинаете думать и, стало быть, богатеть, то неизбежно замечаете, что этому предшествует определенное состояние Вашего сознания, решительность намерений и… небольшое вложение так называемого тяжелого труда. Следовательно, Вы, да и всякий другой, должны научиться погружать сознание в состояние, притягивающее богатство. Двадцать лет Я занимался данной проблемой – очень уж хотелось узнать, как это удается богатым!\n" +
            "<p>Понаблюдайте внимательно: как только Вы начнете на практике использовать принципы этой философии, Ваше финансовое положение улучшится и все, к чему бы Вы ни прикасались, будет превращаться в Вашу собственность. Невозможно? Отнюдь!\n" +
            "<p>Человечество ущербно прежде всего тем, что каждому человеку известно слово «невозможно». Как же! Все правила, которые не работают, – он знает! Все, что нельзя сделать, – ему известно с пеленок. Эта книга написана для тех, кто ищет правила, ведущие к успеху, и готов сделать ставку на них.\n" +
            "<p>Успех приходит к тем, кто мыслит категориями успеха. Поражение сопутствует тем, кто позволяет мыслить категориями поражения.\n" +
            "<p>Предмет этой книги – помочь всем желающим обучиться искусству преобразования сознания: от пораженческого – к сознанию успеха.\n" +
            "<p>…Но есть еще одно слабое место у многих из нас: слишком привыкли мы мерить все меркой собственных впечатлений и убеждений. Не сомневаюсь, что и среди читателей этой книги найдутся люди, которые не поверят, что смогут разбогатеть. Почему? Да потому, что их мышление формировалось в условиях нищеты, нужды и неудач.\n" +
            "<p>Эти несчастные напоминают мне об одном выдающемся китайце, приехавшем в Америку с целью получить образование. Он посещал Чикагский университет. Однажды президент колледжа мистер Харпер встретил его в кампусе и спросил: «Что, на Ваш взгляд, Является наиболее заметной чертой американцев?»\n" +
            "<p>«Ну как же, – воскликнул студент, – странный разрез Ваших глаз. У Вас глаза не косые».\n" +
            "<p>Что можно сказать об этом китайце?..\n" +
            "<p>Мы отказываемся верить в то, чего не понимаем. Мы убеждены, что наша собственная марка – эталон для всех. Конечно, глаза у этого парня «не косые». Они не такие, как наши…\n</div>";
}
