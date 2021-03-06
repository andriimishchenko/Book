package com.booksapp.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1517 extends AppCompatActivity {
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
                Intent intent = new Intent(getBaseContext(), Page1518.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML = "<h4>Мысль – фантом<h4>\n" +
            "<div class=\"text\">" +
            "<p>Флюиды страха перетекают из сознания одного человека в сознание другого так же быстро и неотвратимо, как колебания голоса – из радиопередатчика в радиоприемник.\n" +
            "<p>Человек, высказывающий вслух негативные или деструктивные мысли, может быть уверен, что почувствует не менее разрушительную «отдачу». Даже простое испускание негативных импульсов мысли приводит к «отдаче» сразу по нескольким направлениям. Прежде и, пожалуй, важнее всего то, что у мозга, пульсирующего негативными мыслями, резко снижается способность к творческому воображению. Это следует помнить. Во вторых, присутствие в сознании отрицательных эмоций негативно «заражает» человека, что отвращает от него людей, и зачастую они проявляют враждебность по отношению к такой личности. Третий же источник ущерба заключается в том немаловажном обстоятельстве, что негативно направленные вспышки мысли не только наносят вред окружающим, но и, укореняЯсь в подсознании продуцирующего их человека, становятся, таким образом, частью его характера.\n" +
            "<p>Ваша деловая жизнь нацелена прежде всего на достижение успеха. Чтобы его добиться, Вы должны умиротворить сознание, овладеть материальными благами и, сверх всего, обрести счастье. Но все эти внешние признаки успеха берут начало в мыслительных импульсах.\n" +
            "<p>Вы можете контролировать сознание, Вы обладаете силой фиксировать в нем любые мысли по своему выбору. Но эта привилегия предполагает и ответственность за то, как – конструктивно ли? – Вы ею пользуетесь. Вы хозяин своей земной судьбы в той же степени, в какой обладаете властью над своими мыслями. Вы можете влиять на свое окружение, постепенно приобретая над ним контроль, а значит, приближая жизнь к своему идеалу, – но Вы можете и отказаться от использования своей кровной привилегии, подчинившись жизненному порядку и, таким образом, обрекая себя на плаванье в волнах «обстоятельств», которые будут бросать Вас вверх и вниз, как малую щепку, в огромном океане жизни.\n</div>";
}
