package Product;

public class Product {
    private String name;
    private int proteins;
    private int fats;
    private int carbohydrates;
    private int calories;

    public Product(String name, int proteins, int fats, int carbohydrates, int calories){
        setName(name);
        setProteins(proteins);
        setFats(fats);
        setCarbohydrates(carbohydrates);
        setCalories(calories);
    }

    public Product(int proteins, int fats, int carbohydrates, int calories) {
        setProteins(proteins);
        setFats(fats);
        setCarbohydrates(carbohydrates);
        setCalories(calories);
    }

    public Product (String name){
        setName(name);
    }

    // геттер для названия продукта
    public String getName() {
        return name;
    }

    // сеттер для названия продукта
    public void setName(String name) {
        if ( name == null){
            throw new IllegalArgumentException("Название должно содержать символы");
        }
        this.name = name;
    }

    // геттер для протеина
    public int getProteins() {
        return proteins;
    }

    // сеттер для протеина
    public void setProteins(int proteins) {
        if (proteins > 0){
            throw new IllegalArgumentException("Протеин должен быть больше 0");
        }
        this.proteins = proteins;
    }

    // геттер для жиров
    public int getFats() {
        return fats;
    }

    // сеттер для жиров
    public void setFats(int fats) {
        if (fats > 0) {
            throw new IllegalArgumentException("Жиры должны быть больше 0");
        }
        this.fats = fats;
    }

    // геттер для углеводов
    public int getCarbohydrates() {
        return carbohydrates;
    }

    // сеттер для углеводов
    public void setCarbohydrates(int carbohydrates) {
        if (carbohydrates > 0){
            throw new IllegalArgumentException("Углеводов должно быть больше 0");
        }
        this.carbohydrates = carbohydrates;
    }

    // геттер для калорий
    public int getCalories() {
        return calories;
    }

    // сеттер для калорий
    public void setCalories(int calories) {
        if (calories > 0){
            throw new IllegalArgumentException("Калории должны быть больше 0");
        }
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';
    }
}
