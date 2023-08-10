# [Введение в программировние](https://github.com/dandolya/Introduction-to-Programming)

## [Домашнее задание 2. Сумма чисел](https://github.com/dandolya/Introduction-to-Programming/blob/main/Sum.java)
1. Разработайте класс `Sum`, который при запуске из командной строки будет складывать переданные в качестве аргументов целые числа и выводить их сумму на консоль.
2. Примеры запуска программы:\
`java Sum 1 2 3`\
Результат: 6\
`java Sum 1 2 -3`\
Результат: 0\
`java Sum "1 2 3"`\
Результат: 6\
`java Sum "1 2" " 3"`\
Результат: 6\
`java Sum " "`\
Результат: 0\
Аргументы могут содержать:
   * цифры;
   * знаки + и -;
   * произвольные [пробельные символы](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html#isWhitespace(char)).
3. При выполнении задания можно считать, что для представления входных данных и промежуточных результатов достаточен тип int.
4. Перед выполнением задания ознакомьтесь с документацией к классам [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html) и [Integer](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html).
5. Для отладочного вывода используйте [System.err](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/System.html#err), тогда он будет игнорироваться проверяющей программой.
### [Модификации](https://github.com/dandolya/Introduction-to-Programming/blob/main/SumFloat.java)
Float:
  * Входные данные являются 32-битными числами с формате с плавающей точкой
  * Класс должен иметь имя `SumFloat`

## [Домашнее задание 3. Реверс](https://github.com/dandolya/Introduction-to-Programming/blob/main/Reverse.java)
1. Разработайте класс `Reverse`, читающий числа из [стандартного ввода](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/System.html#in), и выводящий их на [стандартный вывод](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/System.html#out) в обратном порядке.
2. В каждой строке входа содержится некоторое количество целых чисел (возможно ноль). Числа разделены пробелами. Каждое число помещается в тип `int`.
3. Порядок строк в выходе должен быть обратным по сравнению с порядком строк во входе. Порядок чисел в каждой строке также должен быть обратным к порядку чисел во входе.
4. Вход содержит не более 106 чисел и строк.
5. Для чтения чисел используйте класс [Scanner](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html).
Примеры работы программы:\
![image](https://github.com/dandolya/Introduction-to-Programming/assets/117770118/7587f1bf-e432-4ae5-b42a-ccaf6c90ca9d)
### [Модификации](https://github.com/dandolya/Introduction-to-Programming/blob/main/ReverseEven.java)
Even:
  * Выведите (в реверсивном порядке) только четные числа
  * Класс должен иметь имя `ReverseEven`

## [Домашнее задание 4. Статистика слов](https://github.com/dandolya/Introduction-to-Programming/blob/main/WordStatInput.java)
1. Разработайте класс `WordStatInput`, подсчитывающий статистику встречаемости слов во входном файле.
2. Словом называется непрерывная последовательность букв, апострофов (') и дефисов (Unicode category [Punctuation, Dash](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html#DASH_PUNCTUATION)). Для подсчета статистики слова приводятся к нижнему регистру.
3. Выходной файл должен содержать все различные слова, встречающиеся во входном файле, в порядке их появления. Для каждого слова должна быть выведена одна строка, содержащая слово и число его вхождений во входном файле.
4. Имена входного и выходного файла задаются в качестве аргументов командной строки. Кодировка файлов: UTF-8.
5. Примеры работы программы:\
![image](https://github.com/dandolya/Introduction-to-Programming/assets/117770118/9f5a257d-145c-4634-af3d-af746b0f9e52)
### [Модификации](https://github.com/dandolya/Introduction-to-Programming/blob/main/WordStatWords.java)
Words:
  * В выходном файле слова должны быть упорядочены в лексикографическом порядке
  * Класс должен иметь имя `WordStatWords`

## [Домашнее задание 5. Свой сканер](https://github.com/dandolya/Introduction-to-Programming/blob/main/MyScanner.java)
1. Реализуйте свой аналог класса [Scanner](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html) на основе [Reader](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/Reader.html).
2. Примените разработанный `Scanner` для решения задания «Реверс».
3. Примените разработанный `Scanner` для решения задания «Статистика слов».
4. Нужно использовать блочное чтение. Код, управляющий чтением, должен быть общим.
5. *Сложный вариант.* Код, выделяющий числа и слова, должен быть общим.
6. Обратите внимание на:
    * Обработку ошибок.
    * На слова/числа, пересекающие границы блоков, особенно — больше одного раза.
### [Модификации](https://github.com/dandolya/Introduction-to-Programming/blob/main/ReverseOct.java)
Oct:
  * Во вводе и выводе используются числа в восьмеричной системе счисления
  * Класс должен иметь имя `ReverseOct`

## [Домашнее задание 6. Статистика слов++](https://github.com/dandolya/Introduction-to-Programming/blob/main/Wspp.java)
1. Разработайте класс `Wspp`, который будет подсчитывать статистику встречаемости слов во входном файле.
2. Словом называется непрерывная последовательность букв, апострофов и тире (Unicode category Punctuation, Dash). Для подсчета статистики, слова приводятся к нижнему регистру.
3. Выходной файл должен содержать все различные слова, встречающиеся во входном файле, в порядке их появления. Для каждого слова должна быть выведена одна строка, содержащая слово, число его вхождений во входной файл и номера вхождений этого слова среди всех слов во входном файле.
4. Имена входного и выходного файла задаются в качестве аргументов командной строки. Кодировка файлов: UTF-8.
5. Программа должна работать за линейное от размера входного файла время.
6. Для реализации программы используйте Collections Framework.
7. Сложный вариант. Реализуйте и примените класс `IntList`, компактно хранящий список целых чисел.
8. Примеры работы программы:\
![image](https://github.com/dandolya/Introduction-to-Programming/assets/117770118/e474a219-db95-4925-bd2c-188da81f1742)
### [Модификации](https://github.com/dandolya/Introduction-to-Programming/blob/main/WsppPosition.java)
Position:
  * Вместо номеров вхождений во всем файле надо указывать <номер строки>:<номер в строке>
  * Класс должен иметь имя `WsppPosition`

## [Домашнее задание 7. Разметка](https://github.com/dandolya/Introduction-to-Programming/tree/main/markup)
1. Разработайте набор классов для текстовой разметки.
2. Класс `Paragraph` может содержать произвольное число других элементов разметки и текстовых элементов.
3. Класс `Text` – текстовый элемент.
4. Классы разметки `Emphasis`, `Strong`, `Strikeout` – выделение, сильное выделение и зачеркивание. Элементы разметки могут содержать произвольное число других элементов разметки и текстовых элементов.
5. Все классы должны реализовывать метод `toMarkdown`([StringBuilder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html)), который должен генерировать [Markdown](https://ru.wikipedia.org/wiki/Markdown)-разметку по следующим правилам:
    * текстовые элементы выводятся как есть;
    * выделенный текст окружается символами '*';
    * сильно выделенный текст окружается символами '__';
    * зачеркнутый текст окружается символами '~'.
6. Следующий код должен успешно компилироваться:
```
   Paragraph paragraph = new Paragraph(List.of(
        new Strong(List.of(
            new Text("1"),
            new Strikeout(List.of(
                new Text("2"),
                new Emphasis(List.of(
                    new Text("3"),
                    new Text("4")
                )),
                new Text("5")
            )),
            new Text("6")
        ))
    ));
```
Вызов `paragraph.toMarkdown(new StringBuilder())` должен заполнять переданный `StringBuilder` следующим содержимым:\
    `__1~2*34*5~6__`\
Разработанные классы должны находиться в пакете markup.
### [Модфификации](https://github.com/dandolya/Introduction-to-Programming/tree/main/markup)
Html:
    Дополнительно реализуйте метод toHtml, генерирующий HTML-разметку:
        *выделеный текст окружается тегом `em`;
        *сильно выделеный текст окружается тегом `strong`;
        *зачеркнутый текст окружается тегом `s`.

## [Домашнее задание 10. Игра m,n,k](https://github.com/dandolya/Introduction-to-Programming/tree/main/game)
В этом домашнем задании вы можете пользоваться кодом, написанным на лекции. Он есть на [сайте курса](https://www.kgeorgiy.info/courses/prog-intro/).

1. Реализуйте [игру m,n,k](https://en.wikipedia.org/wiki/M,n,k-game) (_k_ в ряд на доске _m_×_n_).
2. Добавьте обработку ошибок ввода пользователя. В случае ошибочного хода пользователь должен иметь возможность сделать другой ход.
3. Добавьте обработку ошибок игроков. В случае ошибки игрок автоматически проигрывает.
4. _Простая версия_. Доска может производить обработку хода за O(_nmk_).
5. _Сложная_ версия_.
    * Доска должна производить обработку хода (проверку корректности, изменение состояния и определение результата) за O(k).
    * Предотвратите жульничество: у игрока не должно быть возможности достать Board из Position.
6. _Бонусная версия_. Реализуйте Winner — игрок, который выигрывает всегда, когда это возможно (против любого соперника).

### [Модификации](https://github.com/dandolya/Introduction-to-Programming/tree/main/game)
Матчи:
    * Добавьте поддержку матчей: последовательность игр до указанного числа побед.
    * Стороны в матче должны меняться каждую игру.

© Доля Даниил Алексеевич 2023
