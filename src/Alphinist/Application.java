package Alphinist;

public class Application {
    public static void main(String[] args) {
        // альпинисты
        Alphinist[] alpinists1 = new Alphinist[3];
        alpinists1[0] = new Alphinist("Руслан","Москва");
        alpinists1[1] = new Alphinist("Иван", "Иркутск");
        alpinists1[2] = new Alphinist("Степан", "Липецк");

        Alphinist[] alpinists2 = new Alphinist[3];
        alpinists2[0] = new Alphinist("Наталья", "Воронеж");
        alpinists2[1] = new Alphinist("Олег", "Санкт-Петербург");

        Alphinist[] alpinists3 = new Alphinist[3];
        alpinists3[0] = new Alphinist("Виктор", "Крым");
        alpinists3[1] = new Alphinist("Лилия", "Казань");

        // горы
        Mountain mountain1 = new Mountain("Чогори", "Китай", 8611);
        Mountain mountain2 = new Mountain("Эльбрус", "Россия", 5642);
        Mountain mountain3 = new Mountain("Лхоцзе", "Гималаи", 8516);

        // группы
        Groups groupName1 = new Groups(false, alpinists1);
        groupName1.setGroupName("Первая группа");
        groupName1.setGoMountain(mountain1);

        Groups groupName2 = new Groups(true, alpinists2);
        groupName2.setGroupName("Вторая группа");
        groupName2.setGoMountain(mountain2);

        Groups groupName3 = new Groups(true, alpinists3);
        groupName3.setGroupName("Третья группа");
        groupName3.setGoMountain(mountain3);

    }
}
