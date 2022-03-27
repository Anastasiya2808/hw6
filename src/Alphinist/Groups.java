package Alphinist;

public class Groups {
    // название группы
    // идет ли набор
    // массив альпинистов
    // гора
    private String groupName;
    private boolean openGroup;
    private Alphinist[] alphinists;
    private Mountain goMountain;

    // конструктор
    public  Groups (boolean openGroup, Alphinist[] alphinists){
        setOpenGroup(openGroup);
        setAlphinists(alphinists);
        setGoMountain(goMountain);
    }


    // сеттер для openGroup
    public  void setOpenGroup(boolean openGroup){
        this.openGroup = openGroup;
    }

    // геттер для openGroup
    public boolean getOpenGroup(){
        return openGroup;
    }

    // сеттер для groupName
    public  void setGroupName(String groupName){
        if (groupName == null || groupName.length()< 2){
            throw new IllegalArgumentException("groupName от 2 символов");
        }
        this.groupName = groupName;
    }

    // геттер для groupName
    public String getGroupName(){
        return  groupName;
    }

    // сеттер для массива альпинистов
    public  void setAlphinists(Alphinist[] alphinists){
        if (alphinists.length == 0){
            throw new IllegalArgumentException("Должен быть хотя бы 1 элемент");
        }
        this.alphinists = alphinists;
    }

    // геттер для альпинистов
    public Alphinist[] getAlphinists(){
        return alphinists;
    }

    // сеттер для goMountain
    public  void setGoMountain(Mountain goMountain) {
        this.goMountain = goMountain;
    }

    // геттер для goMountain
    public Mountain getGoMountain() {
        return goMountain;
    }

    // добавить альпиниста
    public  void  addAlphinist(Alphinist alphinist){
        if (openGroup == false){
            System.out.println("Мест нет");
        } else {
            for (int i = 0; i < alphinists.length; i++){
                if (alphinists[i] == null){
                    alphinists[i] = alphinist;
                    return;
                }
            }
            System.out.println("Набор в группу окончен");
            openGroup = false;
        }
    }

    public void addAlphinist (Alphinist...alphinists){
        for (Alphinist alphinist: alphinists){
            addAlphinist(alphinists);
        }
    }
}
