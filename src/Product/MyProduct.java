package Product;

public class MyProduct {
    //Класс МоиПродукты:
    //Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
    //Реализовать метод, который принимает на Продукт и добавляет его в список, если характеристики
    // продукта полностью соответствуют заявленным разрешениям, в противном случае сообщить, по какой
    // причине продукт не может быть добавлен в список (например, слишком большое содержание калорий)
    //Реализовать метод, который выводит названия всех продуктов из списка

    private int maxProteins = 15;
    private int maxFats = 5;
    private int maxCarbohydrates = 10;
    private int maxCalories = 300;
    private Product[] spisok = new Product[4];

    public void addProduct (Product product){
        for (int i = 0; i < spisok.length; i++){
            if (product.getProteins() > maxProteins){
                throw new IllegalArgumentException("Белки больше " + maxProteins);
            }
            if (product.getFats() > maxFats){
                throw new IllegalArgumentException("Жиры больше " + maxFats);
            }
            if (product.getCarbohydrates() > maxCarbohydrates){
                throw new IllegalArgumentException("Углеводы больше " + maxCarbohydrates);
            }
            if (product.getCalories() > maxCalories){
                throw new IllegalArgumentException("Калории больше " + maxCalories);
            }
            if (spisok[i] == null){
                spisok[i] = product;
                break;
            }
        }
    }

    public void addProduct (Product... spisok){
        for (Product product : spisok){
            addProduct(product);
        }
    }

    public void printMyProducts() {
        for (Product product : spisok) {
            if (product != null) {
                System.out.println("Название: " + product.getName());
                System.out.println("белки: " + product.getProteins());
                System.out.println("жиры: " + product.getFats());
                System.out.println("углеводы: " + product.getCarbohydrates());
                System.out.println("калории: " + product.getCalories());
                System.out.println();
            }
        }
    }
}