package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page721 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Мысли на заметку</h4>\n" +
            "<div class=\"text\">"+
            "<p>Четыре динамичных принципа помогут Вам в формировании команды интеллектуалов, группы, которую мы называем «Господин Интеллект», или «мозговой центр». Она несказанно расширит Ваши финансовые возможности.\n" +
            "<p>Выбирайте людей, вдохновляющих Вас на дело, делящих с Вами интеллектуальную работу, отражающих и умножающих Вашу собственную веру.\n" +
            "<p>Применяйте на практике одиннадцать принципов компетентного руководства; помните о десяти причинах, приводящих лидеров к поражению, о шести областях деятельности, нуждающихся в руководителях нового типа, а также о пяти способах получить желаемую работу в любой сфере деятельности.\n" +
            "<p>Напишите запрос или заявление в соответствии с прилагаемым планом – и двери откроются перед Вами! Работодатели сами пригласят Вас и предложат высокооплачиваемую работу!\n" +
            "<p>Процветание Америки основывается на капитале, и в принципе совсем не сложно оторвать от этого бесконечного пирога лакомый кусочек и для себя.\n" +
            "<p>Успех в оправдании не нуждается. У неудачи нет никаких оправданий.\n\n</div>";
}
