package com.booksapp.book;


import android.os.Bundle;
import android.view.MenuItem;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class TestFinalActivity extends AppCompatActivity {
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
    private String PAGE_HTML = "<h4>И Э\n" +
            "в еглаза…</h4>\n" +
            "<div class=\"text\">\n" +
            "<p>Ба\n" +
            "<p>Психологи правы: «если человек по настоящему чего то хочет, это отражается на его внешности». Барнс был готов к деловому сотрудничеству с Эдисоном; больше того, он обладал решимостью добиться своего.\n" +
            "</div>";
}
