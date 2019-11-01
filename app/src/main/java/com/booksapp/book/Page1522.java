package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page1522 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Любите ли Вы оправдываться?<h4>\n" +
            "<div class=\"text\">" +
            "<p>Все неудачники схожи в одном: они знают все причины неудач и представят Вам железное алиби, почему они сами ни в чем не преуспели. Некоторые из этих объяснений остроумны, а отдельные даже подтверждаются фактами. Но все эти алиби не заменяют денег. Миру интересен только успех!\n" +
            "<p>Сейчас Вы ознакомитесь со списком наиболее часто употребляемых алиби, составленным одним психологом. Всмотритесь в себя внимательно и осмотритесь, сколькими из них Вы пользуетесь, полагая, что это Ваше эксклюзивное изобретение. Помните также, что философия, представленная в моей книге, любое из них делает излишним.\n" +
            "<p>Если бы у меня не было жены и семьи…\n" +
            "<p>Если бы у меня была «рука»…\n" +
            "<p>Если бы у меня были деньги…\n" +
            "<p>Если бы у меня было хорошее образование…\n" +
            "<p>Если бы Я нашел работу…\n" +
            "<p>Если бы у меня было хорошее здоровье…\n" +
            "<p>Если бы у меня было время…\n" +
            "<p>Если бы времена были другими…\n" +
            "<p>Если бы меня понимали…\n" +
            "<p>Если бы Я жил в иных условиях…\n" +
            "<p>Если бы Я смог прожить жизнь заново…\n" +
            "<p>Если бы Я не опасался того, что скажут…\n" +
            "<p>Если бы мне дали шанс…\n" +
            "<p>Если бы сейчас у меня был шанс…\n" +
            "<p>Если бы другие ничего не имели против меня…\n" +
            "<p>Если ничего меня не остановит…\n" +
            "<p>Если бы только Я был помоложе…\n" +
            "<p>Если бы Я мог делать, что хочу…\n" +
            "<p>Если бы Я родился богатым…\n" +
            "<p>Если бы Я встретил «правильных людей»…\n" +
            "<p>Если бы у меня был талант, как у других…\n" +
            "<p>Если бы Я был напористым…\n" +
            "<p>Если бы Я раньше использовал свои возможности…\n" +
            "<p>Если бы мне не действовали на нервы…\n" +
            "<p>Если бы мне не надо было вести домашнее хозяйство и смотреть за детьми…\n" +
            "<p>Если бы Я мог хоть немного откладывать деньги…\n" +
            "<p>Если бы Я только нравился боссу…\n" +
            "<p>Если бы только мне кто то помог…\n" +
            "<p>Если бы в семье меня понимали…\n" +
            "<p>Если бы Я жил в большом городе…\n" +
            "<p>Если бы только Я мог начать…\n" +
            "<p>Если бы Я был свободным…\n" +
            "<p>Если бы у меня была индивидуальность…\n" +
            "<p>Если бы Я не был таким толстым…\n" +
            "<p>Если бы люди знали о моих способностях…\n" +
            "<p>Если бы мне дали передышку…\n" +
            "<p>Если бы Я мог расплатиться с долгами…\n" +
            "<p>Если бы не было той неудачи…\n" +
            "<p>Если бы Я знал, как…\n" +
            "<p>Если бы все не были настроены против меня…\n" +
            "<p>Если бы у меня не было столько проблем…\n" +
            "<p>Если бы Я мог удачно жениться…\n" +
            "<p>Если бы люди не были такими тупыми…\n" +
            "<p>Если бы у меня была не такая экстравагантная семья…\n" +
            "<p>Если бы Я был уверен в себе…\n" +
            "<p>Если бы удача не поворачивалась ко мне спиной…\n" +
            "<p>Если бы Я родился под счастливой звездой…\n" +
            "<p>Если бы не эта жизнь, в которой «что суждено, то и будет»…\n" +
            "<p>Если бы работа была полегче…\n" +
            "<p>Если бы Я не потерял деньги…\n" +
            "<p>Если бы Я жил в ином окружении…\n" +
            "<p>Если бы не мое прошлое…\n" +
            "<p>Если бы у меня было свое дело…\n" +
            "<p>Если бы меня только выслушали…\n" +
            "<p>Если бы… – и это самое существенное «если» – у меня было мужество увидеть себя таким, каков Я есть, Я бы понял, что во мне не так, и исправил бы это. Тогда бы у меня появился шанс извлечь урок из собственных ошибок и поучиться на примере других. Зная, что мне в себе надо исправить, Я занял бы положение, которое неизбежно бы занял, занимайся Я больше самоанализом, а не самоизвинениями.\n</div>";
}