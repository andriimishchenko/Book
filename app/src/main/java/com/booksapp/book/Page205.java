package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page205 extends AppCompatActivity {
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
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private String PAGE_HTML = "<h4>Вчера великие мечты – завтра великое богатство</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Мы, участники гонки за богатством, живем в постоянно меняющемся мире.\n" +
            "<p>Этот мир настойчиво требует новых идей, новых подходов, лидеров, изобретений, систем обучения и маркетинга, новых книг и сценариев для телевидения и кино. И в этом состязании потребностей во все новых и лучших вещах побеждает тот, у кого есть определенная цель и жгучее желание успеха.\n" +
            "<p>Мы, желающие накопить состояние, должны помнить: настоящими лидерами этого мира всегда становились люди, которые умели использовать и заставить работать неосязаемое, невидимые силы еще не выявившихся возможностей и превращали эти силы (или импульсы мысли) в небоскребы, города, фабрики, аэропланы, автомобили и разного рода удобства, делающие жизнь более комфортной.\n" +
            "<p>Ничто не должно повлиять на Вашу мечту. Вам надо проникнуться духом великих пионеров прошлого, которым американская цивилизация обязана своей жизнеспособностью, помогающей развивать и реализовывать таланты.\n" +
            "<p>Если то, что Вы хотите, хорошо и, главное, Вы верите в это, – не сомневайтесь, действуйте! И неважно, что скажут «они», если Вас вдруг постигнет неудача, ибо «они» не знают, что каждая неудача несет в себе семя равновеликого успеха.\n" +
            "<p>Томас Эдисон мечтал об электрической лампочке. Он сразу же приступил к опытам и не отступал от своего, несмотря на десять тысяч неудач, пока его мечта не обрела реальные очертания. Мечтатели практики дела не бросают!\n" +
            "<p>Уэлан мечтал о сети табачных магазинов, и сейчас магазины его компании в Америке – на каждом углу.\n" +
            "<p>Братья Райт мечтали о летательном аппарате. Сегодня каждый может убедиться, здравой ли была их мечта.\n" +
            "<p>Маркони мечтал о передаче сигналов по воздуху при помощи неосязаемых сил. Доказательство тому, что он мечтал не впустую, – сегодняшние радио и телевидение. Интересно, что «друзья» Маркони отправили его в психиатрическую лечебницу и подвергли обследованию, когда он объявил, что открыл закон, по которому сообщения могут передаваться по воздуху без помощи провода или других физических устройств. Не правда ли, сегодня к мечтателям относятся получше?\n</div>";
}
