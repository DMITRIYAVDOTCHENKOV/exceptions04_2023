package homework.homework1;

//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//		Метод должен пройтись по каждому элементу и проверить что он не равен null.
//		А теперь реализуйте следующую логику (через коды ошибок или исключения):
//		Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//		Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
//
//
public class Task1 {
    public static void main(String[] args) {
        Integer[] array = {1, 4, 6, null, 3, 2, null, 9, 7, null, 4};
        checkArray(array);

    }

    public static void checkArray(Integer[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("В ячейке " + i + " находится null");
                sb.append(i + " ");
            }
        }
        if (sb.length() == 0) {
            sb.append("не ");
        }
        System.out.println("В ячейках " + sb.toString() + "находится null");
    }
}