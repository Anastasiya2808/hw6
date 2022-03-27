package Alphinist;

public class Mountain {
    // название ( не менее 4 символов)
    // страна ( не менее 4 символов)
    // высота ( не менее 100м)

    private String mName;
    private String country;
    private int high;

    public Mountain (String mName, String country, int high){
        setmName(mName);
        setCountry(country);
        setHigh(high);
    }

    // сеттер для mName
    public void setmName(String mNameValue){
        if ( mNameValue == null || mNameValue.length() < 4){
            throw new IllegalArgumentException("Значение mName от 4 символов");
        }
        mName = mNameValue;
    }

    // геттер для mName
    public String getmName(){
        return  mName;
    }

    // сеттер для country
    public void setCountry(String countryValue){
        if ( countryValue == null || countryValue.length() < 4){
            throw new IllegalArgumentException("Значение country от 4 символов");
        }
        country = countryValue;
    }

    // геттер для country
    public String getCountry(){
        return country;
    }

    // сеттер для high
    public void setHigh(int highValue){
        if ( highValue  < 100){
            throw new IllegalArgumentException("Значение high от 100 метров");
        }
        high = highValue;
    }

    // геттер для high
    public int getHigh(){
        return high;
    }
}
