package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page502 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Знание – это так легко</h4>\n" +
            "<div class=\"text\">"+
            "<p>Прежде чем Вы уверитесь в своих способностях преображать желание в денежки, нужно будет приобрести специальные знания в той области, которую Вы избрали. Но предположим, необходимо больше специальных знаний, нежели Вы в состоянии усвоить, или же у Вас просто нет наклонностей в их приобретении. В таком случае «мозговой центр» поможет Вам преодолеть этот маленький недостаток.\n" +
            "<p>Накопление огромных состояний требует огромной энергии, а она, в свою очередь, невозможна без системы хорошо организованных и разумно используемых специальных знаний. Однако совершенно необязательно, чтобы ими обладал именно человек, желающий сколотить состояние.\n" +
            "<p>Сказанное Выше призвано вселить надежду в тех, кто мечтает разбогатеть, но не обладает достаточным «образованием», чтобы извлечь из него необходимые специальные знания. Очень часто люди страдают «комплексом неполноценности» именно из за недостатка «образования». Но человек, способный организовать «мозговой центр» и управлять группой, способный использовать такую группу в своих целях, настолько же образован, насколько образован любой член его команды.\n" +
            "<p>Томас А. Эдисон провел в школе не больше трех месяцев. Но он не был невеждой. И умер отнюдь не бедняком.\n" +
            "<p>Генри Форд закончил не больше шести классов, но его финансы были в порядке!\n" +
            "<p>Специальные знания относятся к наиболее изощренным видам знаний, и при этом нет ничего дешевле их! Не верите – загляните в платежные ведомости любого университета, и тогда поговорим.\n\n</div>";
}
