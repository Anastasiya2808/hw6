package Alphinist;

public class Alphinist {
    // имя (не менее 3 символов)
    //адрес (не менее 5 символов)
    private String name;
    private String adress;

    // сеттер для name
    public void setName(String nameValue){
        if ( nameValue == null || nameValue.length() < 3){
            throw new IllegalArgumentException("Значение name от 3 символов");
        }
        this.name = nameValue;
    }

    // геттер для name
    public String getName(){
        return  name;
    }

    // сеттер для Adress
    public void setAdress (String adressValue){
        if ( adressValue == null || adressValue.length() < 5){
            throw new IllegalArgumentException("Значение Adress от 5 символов");
        }
        this.adress = adressValue;
    }

    // геттер для Adress
    public String getAdress (){
        return adress;
    }

    public Alphinist (String name, String adress){
        setAdress(adress);
        setName(name);
    }
}
