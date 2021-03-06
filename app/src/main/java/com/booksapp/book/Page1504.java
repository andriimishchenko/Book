package com.booksapp.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1504 extends AppCompatActivity {
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
                Intent intent = new Intent(getBaseContext(), Page1505.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private String PAGE_HTML = "<h4>Боязнь нищеты: шесть симптомов<h4>\n" +
            "<div class=\"text\">" +
            "<ol>\n" +
            "\t<li>Безразличие – это отсутствие самолюбия, нежелание бороться с нищетой, непротивленческое отношение к любой подлянке судьбы, интеллектуальная и физическая лень, отсутствие инициативы, воображения, энтузиазма и самоконтроля.</li>\n" +
            "\t<li>Нерешительность – привычка позволять другим думать за себя, а самому занимать выжидательную позицию.</li>\n" +
            "\t<li>Сомнение – обычно появляется в форме объяснений и извинений, призванных покрыть и оправдать свои неудачи; иногда сочетается с завистью к чужим успехам или с их критикой.</li>\n" +
            "\t<li>Беспокойство – стремление искать ошибки у других, жить не по средствам; пренебрежительное отношение к своей внешности, насупленный, хмурый вид; невоздержанность в употреблении алкоголя, иногда – наркомания; нервозность, неуверенность в себе.</li>\n" +
            "\t<li>Сверхосторожность – тенденция видеть только оборотную сторону медали; мысли и разговоры о возможных неудачах вместо концентрации сознания на средствах достижения успеха; значение всех дорог к поражению при одновременном нежелании искать способы, как его избежать; ожидание «своего часа», становящееся постепенно мировоззрением; воспоминания о неудачниках, забвение победителей; суждения в стиле – «ах, все пустое! все – дырка от бублика»; пессимизм, ведущий к несварению желудка, плохому выводу шлаков из организма, интоксикации, нарушениям дыхания и общей предрасположенности к болезням.</li>\n" +
            "\t<li>Промедление – привычка откладывать на завтра то, что должно было быть сделано год назад; трата всех сил на оправдание безделья – вместо работы, конечно. Промедление, примыкая к сверхосторожности, сомнению и беспокойству, означает также уход, где это возможно, от ответственности; предпочтение компромисса жестокой борьбе; согласие с жизненными трудностями вместо их преодоления (ведь потом их можно назвать препятствием, мешающим движению вперед!); торговля с жизнью за каждый грош, в то время как у нее надо требовать и процветания, и богатства, и изобилия, и счастья, и довольства; тщательное планирование действий на случай неудачи вместо сжигания всех мостов, всех путей к отступлению; слабость и зачастую полное отсутствие самоуверенности, определенности целей, самоконтроля, инициативы, энтузиазма, самолюбия, способности разумно рассуждать; общение с теми, кто смирился с бедностью, вместо стремления к дружбе с богатыми, желающими стать еще богаче.</li>\n" +
            "</ol></div>";
}
