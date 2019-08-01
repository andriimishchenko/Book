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
    private String PAGE_HTML1 = "<h4>1Поворотный пункт в Вашей жизни</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>В один прекрасный день пресловутый секрет успеха сойдет со страниц этой книги и предстанет перед Вами во всем своем величии. Будьте готовы к этому! Когда он возникнет, Вы непременно узнаете его. Когда Вы заметите первые признаки его появления, затаите дыхание и посмотрите на часы: ибо с этого момента вся Ваша жизнь может перевернуться.\n" +
            "<p>Помните также, что эта книга основана на фактах, а не на вымысле и цель ее исходит из величайшей универсальной истины, посредством которой всякий подготовленный может быть посвященным, научившись, что и как нужно делать. Вы получите необходимые стимулы, чтобы взяться за дело.\n" +
            "<p>А теперь, прежде чем Вы приметесь за чтение, разрешите хотя бы чуть чуть намекнуть на то, какой ключ поможет Вам в разгадке формулы Карнеги. У истока любого богатства и успеха лежит мысль! Если Вы готовы к успеху, то обладаете уже почти половиной секрета его достижения. Надеюсь, Вы без труда приставите и вторую половину, как только она дойдет до Вашего сознания. Удачи Вам!\n</div>";
}
