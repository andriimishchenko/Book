package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;


public class Page803 extends AppCompatActivity {
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


    private String PAGE_HTML = "<h4>Случай в Бостоне</h4>\n" +
            "<div class=\"text\">"+
            "<p>Но самое главное для американского народа решение было принято 4 июля 1776 года в Филадельфии, когда пятьдесят шесть мужчин поставили свои подписи под документом, который должен был принести или свободу Америке, или – виселицу всем пятидесяти шести!\n" +
            "<p>Вы, конечно, слышали об этой знаменитой истории, но вряд ли извлекли из нее урок.\n" +
            "<p>История… Мы знаем ее так, как нам ее преподают. Мы помним даты и имена сражавшихся – Вэлли Фордж, Йорктаун, Джордж Вашингтон, лорд Корнуэлис. Но ведаем ли мы о реальных силах, стоявших за всеми именами, датами и событиями, обеспечивающих свободу Америке задолго до того, как армия Джорджа Вашингтона подошла к Йорктауну?\n" +
            "<p>Ни у одного из авторов исторических романов Вы не найдете даже упоминания об этой непобедимой силе, давшей рождение и свободу нации, которой судьбой было предназначено продолжить путь и установить стандарты независимости для всех народов Земли. И это – трагедия. Трагедия потому, что та же сила должна быть используема каждым, преодолевающим трудности судьбы и заставляющим жизнь платить ему причитающееся.\n" +
            "<p>Еще раз вглядимся в события, давшие рождение этой силе. Бостон, 5 марта 1770 года. Британские солдаты патрулируют улицы, откровенно устрашая жителей своим присутствием. Колонисты возмущены – они забрасывают солдат, марширующих в тумане, камнями и насмешками, пока офицер не отдает приказ: «На изготовку… К бою!»\n" +
            "<p>Начинается сражение, принесшее смерть и увечья слишком многим. Возмущение становится всеобщим. Специально для обсуждения инцидента собирается Провинциальная Ассамблея, составленная из наиболее видных колонистов. Двое из них, Джон Хэнкок и Сэмьюэл Адамс, произносят наиболее смелые речи. Они требуют предпринять решительные шаги для удаления британских солдат из Бостона.\n" +
            "<p>Есть все основания назвать это решение, созревшее у двух людей, началом американской свободы. Это было опасное решение, поэтому подумайте, сколько мужества и веры оно потребовало. Сэмьюэлу Адамсу поручили обратиться к губернатору Хатчинсону и потребовать вывода британских войск. Просьба была удовлетворена – войска удалили из Бостона, но оказалось, что инцидент не исчерпан. Он положил начало процессу, который в конечном итоге привел к изменению направления развития всей цивилизации.\n\n</div>";
}
