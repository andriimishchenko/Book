package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page1001 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h3>10. Девятый шаг к богатству: «МОЗГОВОЙ ЦЕНТР»</h3>\n" +
            "<div class=\"text\">"+
            "<p>Совместное действие двух законов – из сферы экономики и из сферы психики – дает феноменальный результат. Сила интеллекта поможет Вам увеличить состояние.\n" +
            "<p>Сила ума – ключевая в достижении успеха. Планы сами по себе бессмысленны, если какая нибудь сила не сдвинет их с места. В этой главе дается описание методики, помогающей интеллекту включаться в работу, а Вам – эффективно его использовать.\n" +
            "<p>Говоря «сила ума», Я имею в виду «организуемое и интеллектуально направленное знание». Вы также встретите термин «организованное усилие», подразумевающий совместные усилия двух или более людей, объединенных общей целью и единым планом работы.\n" +
            "<p>Давайте вместе подумаем, как лучше выработать в себе эту силу. Поскольку она представляет собой «организуемое знание», исследуем источники знания:\n" +
            "<ol>\n" +
            "\t<li>Высший разум. С этим источником Вы можете вступить в контакт по методике, описанной в одной из глав, при помощи творческого воображения.</li>\n" +
            "\t<li>Накопленный опыт. Опыт, накопленный человечеством (во всяком случае, его зафиксированную часть), можно почерпнуть из книг, имеющихся в любой хорошо оснащенной библиотеке. Важная часть этого опыта в классифицированном и систематизированном виде приобретается в школах и колледжах.</li>\t\n" +
            "\t<li>Эксперимент и исследование. В науке, да, собственно, и в повседневной жизни люди собирают, классифицируют и обобщают все новые факты. Это источник, которым отнюдь не следует пренебрегать, особенно если Вы не можете воспользоваться «накопленным опытом». Но и в таких случаях не забывайте, разумеется, о творческом воображении.</li>\t\n" +
            "</ol>" +
            "<p>Знания, полученные из любых источников, могут стать силой, если они будут организованы в плане действий и в конечном итоге сами станут действием.\n" +
            "<p>Прочтите еще раз описание трех основных источников получения знаний и подумайте, легко ли Вам будет действовать в одиночку – при их сборе, организации и тем более при практической реализации? А если планы обширны и предполагают многостороннюю деятельность, Вам не обойтись без сотрудничества, прежде чем вспыхнет первая искра силы ума.\n" +
            "\n</div>" +
            "<h4>Секрет Эндрю Карнеги</h4>\n" +
            "<div class=\"text\">" +
            "<p>Что такое «мозговой центр» и для чего он нужен? Это координация знаний и усилий – в духе гармонии – двух или более людей, объединенных стремлением к определенной цели. В предыдущей главе содержались рекомендации по заранее продуманному преобразованию Вашего желания денег в собственные деньги. Если Вы будете исполнять их настойчиво и разумно и при этом жестко подойдете к отбору людей в Ваш «мозговой центр», то Вы уже на полпути к успеху.\n" +
            "<p>Для того чтобы лучше понять скрытые потенциальные преимущества использования «мозгового центра», рассмотрим экономическую и психическую стороны проблемы. Если Вы окружаете себя людьми, всем сердцем желающими помочь Вам советом, содействием, сотрудничеством, – экономические выгоды такого рода общения очевидны. И неудивительно, что подобный гармоничный альянс лежит в основе практически каждого большого состояния. Осознание этой простой истины может стать определяющим фактором в изменении Вашего финансового положения.\n" +
            "<p>Трудней понять психическую сторону управления при помощи «мозговой группы».\n" +
            "<p>Может быть, Вам что то подскажет следующая мысль: «Два интеллекта, сошедшиеся вместе, неизбежно создают некоторое третье поле, которое может быть уподоблено новому, третьему, интеллекту».\n" +
            "<p>Человеческий ум представляет собой форму духовной энергии. Когда работа двух интеллектов гармонично координируется, их психические энергии вступают в фазу взаимодействия – в этом, собственно, и заключается психический аспект принципа работы «мозгового центра».\n" +
            "<p>Пятьдесят лет назад Эндрю Карнеги привлек мое внимание к тому, как принцип «мозгового центра» действует в экономике. Надо ли говорить, что именно это определило содержание всей моей последующей жизни?\n" +
            "<p>«Мозговой центр» самого мистера Карнеги состоял приблизительно из 50 человек, объединенных конкретной целью – производством и продажей стали. Мистер Карнеги полагал, что обязан своим состоянием интеллектуальному богатству, накопленному с помощью этих людей.\n" +
            "<p>Похожая картина предстает при анализе биографий всех очень богатых людей. Отдавали они себе в этом отчет или нет, но в любом случае умели ставить на службу силу «мозговых центров».\n" +
            "<p>Впрочем, могло ли быть иначе?\n</div>";
}
