public class Thoroughbred {
    private String mother;   // 马的母亲
    private String father;   // 马的父亲
    private int birthyear;   // 马的出生年份

    // 构造函数
    public Thoroughbred(String mother, String father, int birthyear) {
        this.mother = mother;
        this.father = father;
        this.birthyear = birthyear;
    }

    // 获取马的当前年龄
    public int getCurrentAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthyear;
    }

    // 获取马的父亲名字
    public String getFather() {
        return father;
    }

    // 获取马的母亲名字
    public String getMother() {
        return mother;
    }
}
