package com.booksapp.book;

import android.app.Activity;
import android.os.Bundle;


public class Page1110 extends Activity {
    private PageWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Думай и богатей");
        webView = new PageWebView(this);
        setContentView(webView);
        webView.showPage(PAGE_HTML);
    }


    private String PAGE_HTML = "<h4>Природа – вторая натура</h4>\n" +
            "<div class=\"text\">"+
            "<p>В истории много примеров, когда гениальность проявляется в результате искусственных стимулов, влияющих на сознание, таких, как алкоголь и наркотики.\n" +
            "<p>Эдгар Аллан По создал своего «Ворона» под влиянием немалого количества выпитого им ликера, «видя сны, которые до него не видел никто из смертных». Джеймс Уитком Райли написал свои лучшие произведения, также вкусив алкоголя. Может быть, поэтому он видел «нереальную реальность: и виденье, и обман, мельницу, воды теченье и клубящийся туман». Самые замечательные творения Роберта Бернса тоже были результатом подобного состояния.\n" +
            "<p>Но да будет позволено заметить, что многие люди такого сорта кончили очень плохо. К счастью, у природы в запасе оказались и другие средства, с помощью которых одаренные личности могут так стимулировать сознание, что оно обращается к тончайшим и редкостным мыслям. Мыслям, о которых никто не может с уверенностью сказать, откуда они возникли! И вряд ли здесь найдутся какие нибудь заменители.\n" +
            "<p>Психологам очень хорошо известно, что между сексуальными чувствами и мистикой существует очень тесная связь. Этот факт, может быть, и объясняет странное, с нашей точки зрения, поведение людей, находящихся на первобытной стадии развития, во время религиозно сексуальных оргий.\n" +
            "<p>Миром и цивилизацией правят человеческие чувства, что бы там ни говорили. В своих поступках люди все таки больше опираются на них, чем на разум. Теоретический дар сознания претворяется в действие и созидание целиком с помощью чувств, желаний, а не холодного рассудка. А сексуальное чувство – наиболее могущественное из всех остальных. Конечно, есть и другие стимулы сознания – мы их перечислили, – но ни один из них, ни даже все вместе взятые по силе не сравнятся с чувством любви.\n" +
            "<p>Стимул сознания – это временное или постоянное влияние на него, повышающее интенсивность мысли. Десять описанных нами стимулов – наиболее употребимы. Припадая к этим источникам, можно дойти и до Высшего Разума или, если будет желание и воля, войти в кладовые подсознания, как собственного, так и чужого. Так, впрочем, и действуют все гениально одаренные люди.\n</div>";
}
