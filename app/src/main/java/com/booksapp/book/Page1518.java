package com.booksapp.book;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1518 extends AppCompatActivity {
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
                Intent intent = new Intent(getBaseContext(), Page1519.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML = "<h4>Вы слишком чувствительны?<h4>\n" +
            "<div class=\"text\">" +
            "<p>Чтобы Вам не показалось мало вышеописанных шести основных страхов, назову еще одно зло, от которого страдают люди. Это весьма плодородная почва, дающая густые всходы разного рода неудач. Зло это столь неуловимо, что его присутствие зачастую нелегко установить. Строго говоря, оно не классифицируется как страх. За неимением лучшего названия определим это зло как подверженность отрицательным влияниям.\n" +
            "<p>Люди, накапливающие состояние, всегда себя от него оберегают. Пришибленные нищетой – никогда! Если Вы преуспеваете в какой либо профессии, будьте готовы сопротивляться этому дьяволу. Если же Вы знакомитесь с моей философией с целью накопления богатства, то Вам тем более следует разобраться в себе на этот счет. Ну а если Вы пренебрежете самоанализом, – что ж, тогда прости прощай Ваша затаенная мечта!\n" +
            "<p>Проведите аналитический поиск. По прочтении вопросов, подготовленных для Вашего самоанализа, настройтесь на максимальную, бухгалтерскую точность во время ответов. Выполняйте задание так же тщательно, как если бы Вы искали врага, затаившегося в засаде, и отнеситесь к своим ошибкам не менее сурово, чем, предположим, к врагу во плоти.\n" +
            "<p>Для Вас не составит труда найти защиту от грабителя с большой дороги, поскольку закон предоставляет нам организованную систему общественной взаимопомощи, направленной ко всеобщему благу. Управиться же с вышеупомянутым злом гораздо сложней, потому что оно бьет по воле, когда Вы даже не подозреваете о его присутствии, причем независимо от того, спите Вы или бодрствуете. Его оружие нематериально, ибо оно – состояние Вашего собственного сознания. Иногда оно входит в Вас со словами Ваших родственников, не имеющих в виду ничего дурного. Иногда оно вырастает изнутри, из склада Вашего ума. Но всегда оно – отрава, хотя, может быть, убивает и помедленней.\n</div>";
}
