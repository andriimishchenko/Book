package com.booksapp.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;

public class AdapterHelper {


    final String ATTR_GROUP_NAME= "chapter";
    final String ATTR_ITEM_NAME= "subChapter";



    String[]items={
            "ПРЕДИСЛОВИЕ",
            "1. МЫСЛЬ – ЭТО ВЕЩЬ!",
            "2. Первый шаг к богатству: ЖЕЛАНИЕ",
            "3. Второй шаг к богатству: ВЕРА",
            "4. Третий шаг к богатству: САМОВНУШЕНИЕ",
            "5. Четвертый шаг к богатству: СПЕЦИАЛЬНЫЕ ЗНАНИЯ",
            "6. Пятый шаг к богатству: ВООБРАЖЕНИЕ",
            "7. Шестой шаг к богатству: ПЛАНИРОВАНИЕ",
            "8. Седьмой шаг к богатству: РЕШЕНИЕ",
            "9. Восьмой шаг к богатству: НАСТОЙЧИВОСТЬ",
            "10. Девятый шаг к богатству: «МОЗГОВОЙ ЦЕНТР»",
            "11. Десятый шаг к богатству: ТАЙНА СЕКСА И СУБЛИМАЦИИ",
            "12. Одиннадцатый шаг к богатству: ПОДСОЗНАНИЕ",
            "13. Двенадцатый шаг к богатству: ИНТЕЛЛЕКТ",
            "14. Тринадцатый шаг к богатству: ШЕСТОЕ ЧУВСТВО",
            "15. ШЕСТЬ ПРИЗНАКОВ СТРАХА"
    };
    String[] chapter_0={
            "ПРЕДИСЛОВИЕ",
            "Секрет успеха прошел проверку практикой",
            "Имеющий уши – да услышит",
            "Поворотный пункт в Вашей жизни",
    };
    String[] chapter_1={
            "И Эдисон посмотрел в его честные глаза…",
            "Случай Является с черного хода",
            "Начал – не бросай",
            "Успех за шаг до поражения",
            "Дитя, повелевающее мужем",
            "«Да», спрятанное за «нет»",
            "Успех – это одна глубокая идея",
            "Хочу – значит, будет!",
            "Поэт, прозревший истину",
            "Юноша, увидевший судьбу",
            "Мысли на заметку"
    };
    String[] chapter_2={
            "Отступлению – нет",
            "И он сжег корабли",
            "Шесть этапов превращения идеи в деньги",
            "Принципы ценою в сто миллионов",
            "Вчера великие мечты – завтра великое богатство",
            "Мечту рождает желание",
            "И невозможное возможно",
            "Эврика!",
            "Что остановит бурю",
            "Провал слуха",
            "О, милые звуки!",
            "Фокус за кулисами…",
            "Мысли на заметку",
    };
    String[] chapter_3={
            "Ищите – и обрящете",
            "Невезение? Чепуха!",
            "«Мысль без веры мертва есть»",
            "Мысли-диктаторы",
            "Пять этапов самоутверждения",
            "Не накликайте на себя беду",
            "Великий опыт любви",
            "Блажен дающий",
            "Богатство растет изнутри",
            "Мысли на заметку",
    };
    String[] chapter_4={
            "Волнующий звон металла",
            "Представьте, что Вы делаете деньги",
            "И вдохновение поведет Вас…",
            "Подсознание заработало",
            "Почему мы – хозяева своей судьбы",
            "Мысли на заметку"
    };
    String[] chapter_5={
            "Блаженны нищие духом",
            "Знание – это так легко",
            "Алло! Знание?",
            "Требуются специалисты",
            "Практика в системе обучения",
            "Штудии и самоконтроль",
            "Учиться никогда не поздно",
            "Бухгалтерия на колесах",
            "Состояние под копирку ",
            "Десять лет, сохраненные для жизни ",
            "Победителей не судят",
            "Не задерживайтесь на дне",
            "Сам себе реклама",
            "Мысли на заметку"
    };
    String[] chapter_6={
            "Синтетическое и творческое",
            "Развивайте воображение",
            "Природа знает, где скрыт успех",
            "Идеи – это деньги",
            "А не хватало мелочи",
            "Миллион за неделю",
            "Ясные намерения – Ясный план",
            "Мысли на заметку"
    };
    String[] chapter_7={
            "На ошибках учатся",
            "Продать можно все",
            "С чего начинается руководство",
            "Одиннадцать секретов управления",
            "Ошибки руководителя",
            "Руководители нужны всюду",
            "Пять способов найти хорошую работу",
            "Как подготовить запрос или заявление",
            "Ищите работу по душе",
            "Общественность Вам поможет",
            "Три способа самооценки",
            "Эгоист или человеколюбец?",
            "Тридцать три несчастья",
            "Сам себе реклама?",
            "Каковы Ваши условия?",
            "Двадцать восемь вопросов тет-а-тет",
            "Деньги? Не ленитесь подбирать",
            "Верьте в капитал",
            "Цивилизация построена на капитале",
            "Где изобилие – там и возможности",
            "Мысли на заметку"
    };
    String[] chapter_8={
            "Они говорят, а жить Вам",
            "Как делается история",
            "Случай в Бостоне",
            "Ум хорошо, а два лучше",
            "Решение, изменившее ход истории",
            "Томас Джефферсон читает вслух",
            "Сила воспитанного ума",
            "Мысли на заметку"
    };
    String[] chapter_9={
            "Слабость – в слабости",
            "Если мыслить – то категориями денег",
            "Ваш тайный друг",
            "Поражение – это ненадолго",
            "Настойчивым может стать каждый",
            "«Изощренная настойчивость» – в восьми переменах",
            "Критиковать – дело нехитрое",
            "Не упускайте свой шанс",
            "Нам не хватало друг друга",
            "Четыре шага в воспитании настойчивости",
            "Кому помогает Высший Разум?",
            "Последний великий пророк (автор обозрения Томас Сьюгрю)",
            "Мысли на заметку"
    };
    String[] chapter_10={
            "Секрет Эндрю Карнеги",
            "Не отвергайте хороших советов",
            "Нищета не строит планов",
            "Мысли на заметку"
    };
    String[] chapter_11={
            "Движущая сила пола",
            "Стимулы сознания – не по Заратустре",
            "Воображение – шестое чувство",
            "«Четвертое измерение» мысли",
            "Внутренний голос",
            "Идея зреет",
            "Откройте в себе гения",
            "Сублимация",
            "Пустая трата энергии",
            "Природа – вторая натура",
            "Секс и торговля",
            "Секс и предрассудки",
            "Урок плодотворных лет",
            "Поверьте в свою гениальность",
            "Могучий опыт любви",
            "Мелочи брака",
            "Власть женственности",
            "Мысли на заметку"
    };
    String[] chapter_12={
            "Вначале было слово",
            "О коне и о трепетной лани",
            "Подсознание и молитва",
            "Мысли на заметку"
    };
    String[] chapter_13={
            "Во власти невидимых сил",
            "Мозг в мозг",
            "Что такое телепатия?",
            "Согласованный хор умов",
            "Мысли на заметку"
    };
    String[] chapter_14={
            "Великий Первотолчок",
            "Вы можете нанять «невидимых советников»",
            "Время для самовнушения ",
            "Воображаемый «кабинет»",
            "Как пробудить шестое чувство",
            "Шестое чувство – второе дыхание",
            "Мысли на заметку"
    };
    String[] chapter_15={
            "Страх – это только состояние",
            "На распутье",
            "Откуда приходит страх",
            "Боязнь нищеты: шесть симптомов",
            "«Именно деньги»",
            "Боитесь ли Вы критики?",
            "Боязнь критики: семь симптомов",
            "Боитесь ли Вы болезней?",
            "Страх болезней: семь симптомов",
            "Боитесь ли Вы неудачи в любви?",
            "Боязнь неудачи в любви: три симптома",
            "Боитесь ли Вы старости?",
            "Боязнь старости, четыре симптома",
            "Боитесь ли Вы смерти?",
            "Боязнь смерти: три симптома",
            "Беспокойство – тот же страх",
            "Мысль – фантом",
            "Вы слишком чувствительны?",
            "Защищайтесь!",
            "Сначала подумайте!",
            "Что дает самоконтроль",
            "Любите ли Вы оправдываться?",
            "Фатальная привычка",
            "Мысли на заметку"
    };


    ArrayList<Map<String, String>> groupData;
    // коллекция для элементов одной группы
    ArrayList<Map<String, String>> childDataItem;
    // общая коллекция для коллекций элементов
    ArrayList<ArrayList<Map<String, String>>> childData;
    // в итоге получится childData = ArrayList<childDataItem>
    // список атрибутов группы или элемента
    Map<String, String> m;

    Context ctx;

    AdapterHelper(Context _ctx) {
        ctx = _ctx;
    }

    SimpleExpandableListAdapter adapter;

    SimpleExpandableListAdapter getAdapter() {
        groupData = new ArrayList<Map<String, String>>();
            for (String item : items) {
            // заполняем список атрибутов для каждой группы
            m = new HashMap<String, String>();
            m.put(ATTR_GROUP_NAME, item); // имя компании
            groupData.add(m);
        }
        // список атрибутов групп для чтения
        String groupFrom[] = new String[] {ATTR_GROUP_NAME};
        // список ID view-элементов, в которые будет помещены атрибуты групп
        int groupTo[] = new int[] {android.R.id.text1};


        // создаем коллекцию для коллекций элементов
        childData = new ArrayList<ArrayList<Map<String, String>>>();

        childDataItem = new ArrayList<Map<String, String>>();
        // заполняем список атрибутов для каждого элемента
            for (String subChapter : chapter_0) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
        // добавляем в коллекцию коллекций
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
        // заполняем список атрибутов для каждого элемента
            for (String subChapter : chapter_1) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
        // добавляем в коллекцию коллекций
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_2) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_3) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_4) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_5) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_6) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_7) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_8) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_9) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_10) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_11) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_12) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_13) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_14) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);


        childDataItem = new ArrayList<Map<String, String>>();
            for (String subChapter : chapter_15) {
            m = new HashMap<String, String>();
            m.put(ATTR_ITEM_NAME, subChapter);
            childDataItem.add(m);
        }
            childData.add(childDataItem);

        // список атрибутов элементов для чтения
        String childFrom[] = new String[] {ATTR_ITEM_NAME};
        // список ID view-элементов, в которые будет помещены атрибуты элементов
        int childTo[] = new int[] {android.R.id.text1};

        adapter = new SimpleExpandableListAdapter(
                ctx,
                groupData,
                android.R.layout.simple_expandable_list_item_1,
                groupFrom,
                groupTo,
                childData,
                android.R.layout.simple_list_item_1,
                childFrom,
                childTo);
        return adapter;
    }


    String getGroupText(int groupPos) {
        return ((Map<String,String>)(adapter.getGroup(groupPos))).get(ATTR_GROUP_NAME);
    }

    String getChildText(int groupPos, int childPos) {
        return ((Map<String,String>)(adapter.getChild(groupPos, childPos))).get(ATTR_ITEM_NAME);
    }

    String getGroupChildText(int groupPos, int childPos) {
        return getGroupText(groupPos) + " " +  getChildText(groupPos, childPos);
    }
}
