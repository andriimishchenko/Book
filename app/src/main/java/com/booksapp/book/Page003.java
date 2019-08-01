package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class Page003 extends AppCompatActivity {
    private PageWebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        webView1 = new PageWebView(this);
        setContentView(webView1);
        webView1.showPage(PAGE_HTML1);
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
    private String PAGE_HTML1 = "<h4>Имеющий уши – да услышит</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Будьте готовы – и секрет успеха раскроется Вам по крайней мере однажды на протяжении каждой главы. Я с большим удовольствием рассказал бы, как Вы об этом узнаете, но не хочу лишать Вас радости и значительных выгод первооткрывателя.\n" +
            "<p>Вы разочарованы, и перед Вами сплошные трудности, преодоление которых вытягивает всю душу, Вы измучены неудачами, и Вас преследуют болезни и физические недуги, что ж, прочтите историю об открытии, сделанном моим сыном, узнайте, как он использовал формулу Карнеги, и Вы окажетесь в оазисе в Пустыне Потерянных Надежд.\n" +
            "<p>Всякий, постигший и применивший на практике секрет успеха, буквально чувствует, что обречен на удачу. Если у Вас есть сомнения, постарайтесь фиксировать свое внимание на карьере людей, чей успех совершенно убеждает Вас, и сомнения Ваши исчезнут.\n" +
            "<p>Конечно, секрет успеха будет Вам кое чего стоить, но много меньше истинной цены. Цена эта не может быть названа – за обладание тайной нельзя заплатить деньгами по той причине, что она как бы делится на две части. И одна ее часть состоит в том, что тайна полностью захватывает человека.\n" +
            "<p>Всем, кто готов к секрету, он служит совершенно одинаково. Образование не играет здесь никакой роли. Задолго до моего рождения формула успеха открылась Томасу А. Эдисону, и он применил ее с таким умом, что стал всемирно известным изобретателем, хотя провел в школе всего лишь три месяца.\n" +
            "<p>Секрет успеха Явился и Эдвину С. Барнсу, деловому партнеру Эдисона. Барнс сколотил огромное состояние, позволившее ему отойти от активного бизнеса еще молодым человеком. Прочитав об этой истории в начале первой главы, Вы поймете, что богатства находятся в пределах досягаемости. Деньги, слава, известность и счастье доступны всем, кто готов к этому и сказал себе: Я достоин сего чудесного дара.\n" +
            "<p>Откуда Я знаю об этом секрете? Вы можете получить ответ, даже не дочитав книгу до конца. Возможно, Вы найдете его в самой первой главе или обнаружите на последней странице.\n" +
            "<p>В ходе двадцатилетних исследований, предпринятых с благословения мистера Карнеги, Я проанализировал жизнь и деятельность сотен известных людей, многие из которых подтвердили, что нажили свои огромные состояния с помощью формулы Карнеги.\n" +
            "<p>Среди них: Генри Форд, Уильям Ригль мл., Джеймс Дж. Хилл, Джордж С. Паркер, Е.М. Статлер, Генри Л. Доэрти, Сайрус Х.К. Кертис, Джордж Истмэн, Чарльз\n" +
            "<p>М. Шваб, Харрис Ф. Уильямс, д р Фрэнк Гансолэс, Дэниэль Уиллард, Кинг Жиллет, Ральф А. Уикс, судья Дэниэл Т. Райт, Джон Д. Рокфеллер, Томас А. Эдисон, Фрэнк А. Вандерлип, Ф.В. Вулворт, полковник Роберт А. Доллар, Эдвард А. Файлин, Эдвин С. Барнс, Артур Нэш, Теодор Рузвельт, Джон У. Дэвис, Элберт Хаббард, Уилбэр Райт, Уильям Дженнингс Брайн, д р Дэвид Стар Джордан, Дж. Оджин Армор, Артур Брисбэйн, Вудро Вильсон, Уильям Ховард Тафт, Лютер Бербэнк, Эдвард У. Бок, Фрэнк А. Мансей, Элберт Х. Гэри, Кларенс Дэрроу, д р Александер Грэхэм Белл, Джон Х. Патерсон, Джулиус Розенвальд, Стюарт Остин Уайер, д р Фрэнк Крэйн, Джордж М. Александер, Дж.Г. Чаплин, сенатор Дженнингс Рэндольф.\n" +
            "<p>Этот список представляет лишь ничтожную часть именитых американцев, чьи финансовые или иные достижения свидетельствуют: кто понял и применил формулу Карнеги в жизни, тот достиг высокого положения в обществе. Я никогда не встречал человека, который, будучи вдохновлен секретом этой формулы, не добился бы крупного успеха в своем деле. Я никогда не видел человека, который, не обладая этой тайной, смог бы прославиться или накопить огромные богатства со всеми вытекающими отсюда последствиями. Из этих двух посылок Я делаю вывод: формула успеха как часть необходимого знания предпочтительнее того, что привычно называется «образованием».\n" +
            "<p>В конце концов, что такое образование? На этот вопрос Вы тоже получите самый подробный ответ.\n</div>";
}
