package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page405 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Почему мы – хозяева своей судьбы</h4>\n"+
            "<div class=\"text\">"+
            "<p>Скептицизм по отношению к новым идеям типичен для рода человеческого. Но попробуйте следовать рекомендациям этой книги, и Ваш скептицизм непременно сменится доверием, а затем выкристаллизуется в абсолютную веру.\n" +
            "<p>Многие философы утверждали, что человек Является хозяином своей земной судьбы, но большинство из них не могли объяснить почему. Но разве эта глава не дает ответа? Человек может стать господином над собой и своим окружением, потому что он обладает силой влияния на свое подсознание.\n" +
            "<p>Процесс превращения желания денег в деньги как таковые невозможен без подключения самовнушения – своего рода реле, подключающего Вас к подсознанию и помогающего на него влиять.\n" +
            "<p>Воспринимайте рекомендации, сформулированные в книге, как инструменты воздействия на подсознание. Запомните – Вы должны совершенно осознанно понимать, какую важную роль в Ваших усилиях по накоплению денег играет подсознание.\n" +
            "<p>По завершении чтения всей книги вернитесь к этой главе и читайте ее целиком, вслух, каждый вечер, пока к Вам не придет убеждение, что при помощи самовнушения Вы совершите задуманное. Подчеркивайте при чтении каждое предложение, произведшее впечатление.\n\n</div>";
}
