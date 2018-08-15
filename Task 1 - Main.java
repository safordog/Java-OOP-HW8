/*
 * Используя стандартный методы сериализации создайте мини-базу
 * данных для работы с группами студентов (возможность записи и чтения
 * базы из файла по запросу пользователя).
 */
package home.work8b;

/**
 *
 * @author safordog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Group MV25 =  new Group("MV25");
        MV25.addStudent("Ivanov", "Ivan", 21, 4, "MV25");
        MV25.addStudent("Petrov", "Petr", 22, 4.5, "MV25");
        MV25.addStudent("Sidorov", "Sidor", 21, 4.1, "MV25");
        MV25.addStudent("Borisov", "Boris", 20, 4.6, "MV25");
        MV25.addStudent("Nikitov", "Nikita", 21, 4.8, "MV25");
        
        Group MS30 = new Group("MS30");
        MS30.addStudent("Dmitrov", "Dmitriy", 21, 4, "MS30");
        MS30.addStudent("Volodin", "Volodia", 22, 4.5, "MS30");
        MS30.addStudent("Sidorov", "Sidor", 21, 4.1, "MS30");
        MS30.addStudent("Denisov", "Denis", 21, 4.1, "MS30");
        MS30.addStudent("Nikolaev", "Nikolay", 21, 4.1, "MS30");
        
        MS30.toSerialize(MS30);
        MV25.toSerialize(MV25);
        MV25.toDeserialize().printGroup();
        MS30.toDeserialize().printGroup();
        
    }
    
}
