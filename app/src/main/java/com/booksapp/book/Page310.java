package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page310 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Мысли на заметку</h4>\n"+
            "<div class=\"text\">"+
            "<p>Для успеха необходима вера. Веру можно вызвать и укрепить, вбивая в подсознание нужные мысли.\n" +
            "<p>Для самоутверждения необходимо пройти пять этапов, легко поддающихся той внутренней силе, которая уже существует в Вас. Теперь Вы знаете: может казаться, что все кончено, но если мысли будут настроены на победу, то счастье и успех станут итогом тех же жизненных обстоятельств.\n" +
            "<p>Пример людей, подобных А. Линкольну и М. Ганди, показывает, как мысли могут обладать «магнетизмом», притягивая к себе мысли, близкие им по духу, и заставляЯ миллионы умов работать в унисон.\n" +
            "<p>Очень важный момент: прежде чем что нибудь получить, нужно что то отдать. Когда миллионеры поняли это, пиратский бизнес превратился в предпринимательство, работающее на общество и вместе с обществом. И такое предпринимательство до сих пор более выгодно.\n" +
            "<p>И нищета, и богатство – детище веры!\n\n</div>";
}
