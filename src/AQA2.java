public class AQA2 {
    
    public static void main (String args []) {

//
//        //И ИЛИ
//        int age = 20;
//
//        if (age < 18 || age > 63) {
//            System.out.println("Кредит не разрешен");
//        } else {
//            System.out.println("Разрешен");
//        }
//        
//        
//        //SWITCH CASE BREAK
////      (3 условия if и больше)
//
//        String color = "true";
//        
//        switch (color) {
//            case "red":
//                System.out.println("Stop");
//                break;
//            case "yellow":
//                System.out.println("Warning");
//                break;
//            case "green":
//                System.out.println("Go");
//                break;
//            default:
//                System.out.println("Only red, yellow, green are possible");
//                break;
//        }
//        
//       МАССИВ
        String[] names = {"Рак", "Лысенко", "Стрельцова", "Орлеанская", "Бондаловский", "Чудикова"};

////       System.out.println(names[1]);
//        
//        int[] ages = {1,2,3,4,5};
//        int index =4;
//        String searchName = "Лысенко";
//        boolean isFound = false;
//        while (index >= 0 && isFound == false) {
//
//            System.out.println("Попытка номер: " + index);
//            
//            if (names[index] == searchName) {
//                System.out.println("Найдено по индексу " + index);
//
//       isFound=true;
//            }
//            index--;
//
//        }
//        
//        FOR
        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]);

        }
        
////        FOR EACH
//
//        for (String name:names) {System.out.println(name);
//            
//        }
        
        
        
        
    }
}
