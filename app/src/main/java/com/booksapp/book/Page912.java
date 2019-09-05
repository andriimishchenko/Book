package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page912 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Последний великий пророк (автор обозрения Томас Сьюгрю)</h4>\n" +
            "<div class=\"text\">"+
            "<p>Магомет был пророком, но никогда не творил чудеса. Он не был мистиком, не создал никакого официального учения; до сорока лет он не приступал к своей миссии. Когда Магомет объявил, что он – Посланник Господа, пророчествующий об истинной вере, он был жестоко осмеян и публично объявлен сумасшедшим. Дети показывали на него пальцем, а женщины бросали в него грязь и камни. Он был изгнан из своего родного города, Мекки, а его последователи отрешены от всего земного и выгнаны в пустыню вслед за ним. За первые десять лет пророческой деятельности Магомет не получил ничего, кроме насмешек и издевательств, нищеты и страданий. Но прошло еще десять лет, и он стал правителем всей Аравии, руководя ею из Мекки, главой новой мировой религии, которой суждено было распространиться от Дуная до Пиренеев. Сила, движущая ее, покоилась на трех китах: могуществе слова, силе молитвы и родстве человека с Богом.\n" +
            "<p>Его жизнь не была особенно наполнена смыслом. Он родился в одном из древнейших родов Мекки, которая была в то время торговым городом, чуть ли не торговым центром всего человечества, больше походившим на проходной двор. В городе было грязно, пыльно и душно, поэтому детей отправляли обычно на воспитание к бедуинам. Так воспитывался и Магомет, выросший на молоке кобылиц, заменивших ему родную мать, здоровым и сильным юношей. Он пас овец, а вскоре нанялся к некой богатой вдове начальника каравана. Так Магомет прошел по всему Востоку, разговаривая с самыми разными людьми самых разнообразных религиозных убеждений. Он видел, как христианство распадается на множество сект, враждующих между собой. Когда ему стукнуло двадцать восемь, вдова вышла за него замуж. Его отец был против брака, но она подпоила его и заставила благословить их. Следующие двенадцать лет Магомет провел в качестве богатого, всеми уважаемого и изворотливого торговца. Но затем он вдруг удалился в пустыню, а в один прекрасный день вернулся с первыми стихами Корана, Явившимися ему, и объявил себя Посланником Господа.\n" +
            "<p>Коран, откровение Господне, и был самым необъяснимым чудом в жизни Магомета. Он не был поэтом, у него не было дара слова. Но стихи Корана, наполненные верой, были много прекраснее того, что могли бы сочинить профессиональные поэты всех арабских племен. Для арабов это было поистине чудом. Дар слова у них считается величайшим даром, а поэт приравнивается ко Всемогущему. Магомет сказал, что все равны перед Господом и что весь мир должен стать демократическим исламским государством. А это уже была политическая ересь, ведь Магомет, кроме всего прочего, еще и горел желанием разрушить 360 идолов во внутреннем дворе у камня Каабы. Этот камень привлекал огромное количество кочующих племен к Мекке, что означало успешную торговлю. Поэтому местные «капиталисты», к которым, кстати, принадлежал и сам Магомет, обрушились на Пророка. Он удалился в пустыню и потребовал власти над всем миром.\n" +
            "<p>Так родилось движение ислама. Из пустыни Явилось пламя, которое уже нельзя было погасить, – армия сражающегося народа, сильная своим единством и желанием умереть за победу. Магомет призвал иудеев и христиан присоединиться к исламу. Он говорил, что не создает новой религии, а всего лишь призывает под свои знамена тех, кто верит в Единого Бога и готов сразиться за веру. Если бы христиане и иудеи поддержали Магомета, он завоевал бы весь мир. Но они отказались, не готовые принять новую для них идею священной войны. Когда войско Пророка вошло в Иерусалим, никто из жителей города не был убит, потому что так требовала вера Магомета. Но столетия спустя, когда крестоносцы захватили Иерусалим, не было пощады даже мусульманским старикам, женщинам и детям. Однако христианство все таки сходится с мусульманством. Сходство – в универсальности учения о Едином Боге.\n\n</div>";
}
