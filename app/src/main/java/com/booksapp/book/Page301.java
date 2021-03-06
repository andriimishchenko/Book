package com.booksapp.book;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page301 extends AppCompatActivity {
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
    private String PAGE_HTML = "<h3>3. Второй шаг к богатству: ВЕРА</h3>\n" +
            "<div class=\"text\">\n" +
            "<p>Управляемая вера заставляет всякую мысль вибрировать от напряжения. Вы можете подняться на недостижимую высоту, воодушевившись могуществом приобретенной уверенности в себе.\n" +
            "<p>Вера – катализатор всех умственных способностей. Если она соединяется с мыслью, то возникающий почти молитвенный трепет ума тут же подхватывается подсознанием и переводится им в духовную плоскость.\n" +
            "<p>Из всех положительных эмоций наиболее сильными Являются чувства веры и любви, а также сексуальное чувство. Действуя все вместе, они создают эффект «объемного» видения. Вот тут то и включается подсознание, побуждающее Высший Разум к ответу на поставленный вопрос. Надо только суметь уловить тут возвышенный образ, подобием которого Являются Ваши мысли.\n</div>" +
            "<h4>Ищите – и обрящете</h4>\n" +
            "<div class=\"text\">\n<p>Таким образом, мы подходим к утверждению, которое позволит лучше понять, какое огромное значение приобретает самовнушение при материализации желания, а именно: вера – это всего лишь состояние ума. Это состояние может быть искусственно вызвано многократным воздействием самовнушения на подсознание.\n" +
            "<p>В качестве иллюстрации возьмем цель, с которой Вы читаете эту книгу, – получить возможность превратить неосязаемый импульс желания в его физический эквивалент – деньги. Следуя указаниям о самовнушении и подсознании, подытоженным в этой главе, Вы можете убедить себя, что верите, и тогда получите то, о чем мечтаете. Эта «вера в успех» уже заложена в Ваше подсознание еще до осуществления плана по материализации желаний.\n" +
            "<p>Вера – состояние ума, которое можно развить в волю с помощью тринадцати принципов, ибо с применением этих принципов она совершенствуется уже вполне осознанно.\n" +
            "<p>Единственно известный метод осознанного совершенствования чувства веры – вбивать его в подсознание, как это делают священники.\n" +
            "<p>Может быть, эта мысль станет понятнее, если обратиться к природе преступления. Знаменитые криминалисты пришли к выводу, что, когда человек сталкивается с преступлением впервые, оно отвращает его. Если же он какое то время соприкасается с ним, то привыкает к нему. Длительная связь с преступным миром заражает человека преступлением. Но с таким же успехом можно сказать, что импульс мысли в конце концов заразит сознание, преображая его в физический эквивалент – в деньги.\n" +
            "<p>В связи с этим советую вновь поразмышлять над формулой: все мысли, которые могут быть представлены на чувственном уровне (в ощущениях), при условии, что они замешаны на вере, начинают немедленно материализовываться.\n" +
            "<p>Эмоции, или чувственное начало в мысли, – это факторы, придающие мыслям жизненность, действенность и силу. Чувства веры, любви и сексуальное чувство в соединении с порывом мысли делают их несравненно более жизнеспособными, чем они могли бы быть, взятые сами по себе.\n" +
            "<p>Но достигать глубин подсознания и влиять на него могут не только мысли в соединении с верой, но и мысли, смешанные как с положительными, так и с отрицательными эмоциями!\n</div>";
}
