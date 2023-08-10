# Introduction-to-Programming

## Домашнее задание 2. Сумма чисел
1. Разработайте класс `Sum`, который при запуске из командной строки будет складывать переданные в качестве аргументов целые числа и выводить их сумму на консоль.
2. Примеры запуска программы:
   
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
  * произвольные пробельные символы.
3. При выполнении задания можно считать, что для представления входных данных и промежуточных результатов достаточен тип int.
4. Перед выполнением задания ознакомьтесь с документацией к классам String и Integer.
5. Для отладочного вывода используйте System.err, тогда он будет игнорироваться проверяющей программой.

## Домашнее задание 3. Реверс
1. Разработайте класс `Reverse`, читающий числа из стандартного ввода, и выводящий их на стандартный вывод в обратном порядке.
2. В каждой строке входа содержится некоторое количество целых чисел (возможно ноль). Числа разделены пробелами. Каждое число помещается в тип int.
3. Порядок строк в выходе должен быть обратным по сравнению с порядком строк во входе. Порядок чисел в каждой строке также должен быть обратным к порядку чисел во входе.
4. Вход содержит не более 106 чисел и строк.
5. Для чтения чисел используйте класс Scanner.
Примеры работы программы:
![image](https://github.com/dandolya/Introduction-to-Programming/assets/117770118/7587f1bf-e432-4ae5-b42a-ccaf6c90ca9d)

## Домашнее задание 4. Статистика слов
1. Разработайте класс `WordStatInput`, подсчитывающий статистику встречаемости слов во входном файле.
2. Словом называется непрерывная последовательность букв, апострофов (') и дефисов (Unicode category Punctuation, Dash). Для подсчета статистики слова приводятся к нижнему регистру.
3. Выходной файл должен содержать все различные слова, встречающиеся во входном файле, в порядке их появления. Для каждого слова должна быть выведена одна строка, содержащая слово и число его вхождений во входном файле.
4. Имена входного и выходного файла задаются в качестве аргументов командной строки. Кодировка файлов: UTF-8.
5. Примеры работы программы:

![image](https://github.com/dandolya/Introduction-to-Programming/assets/117770118/9f5a257d-145c-4634-af3d-af746b0f9e52)

## Домашнее задание 5. Свой сканер
1. Реализуйте свой аналог класса Scanner на основе Reader.
2. Примените разработанный `Scanner` для решения задания «Реверс».
3. Примените разработанный `Scanner` для решения задания «Статистика слов».
4. Нужно использовать блочное чтение. Код, управляющий чтением, должен быть общим.
5. *Сложный вариант.* Код, выделяющий числа и слова, должен быть общим.
6. Обратите внимание на:
* Обработку ошибок.
* На слова/числа, пересекающие границы блоков, особенно — больше одного раза.

## Домашнее задание 6. Статистика слов++
1. Разработайте класс 'Wspp', который будет подсчитывать статистику встречаемости слов во входном файле.
2. Словом называется непрерывная последовательность букв, апострофов и тире (Unicode category Punctuation, Dash). Для подсчета статистики, слова приводятся к нижнему регистру.
3. Выходной файл должен содержать все различные слова, встречающиеся во входном файле, в порядке их появления. Для каждого слова должна быть выведена одна строка, содержащая слово, число его вхождений во входной файл и номера вхождений этого слова среди всех слов во входном файле.
4. Имена входного и выходного файла задаются в качестве аргументов командной строки. Кодировка файлов: UTF-8.
5. Программа должна работать за линейное от размера входного файла время.
6. Для реализации программы используйте Collections Framework.
7. Сложный вариант. Реализуйте и примените класс `IntList`, компактно хранящий список целых чисел.
8. Примеры работы программы:
   
![image](https://github.com/dandolya/Introduction-to-Programming/assets/117770118/58e5aa2d-c43f-454d-bf8e-5cd3b8a5e53a)

