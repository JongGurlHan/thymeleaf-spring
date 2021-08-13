package hello.itemservice.domain.item;

//Enum: 서로 연관된 상수들의 집합.

//class Itemtype{
//    public static final Fruit APPLE = new Fruit();
//    public static final Fruit PEACH = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//}
// 와 같다.

public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description; //필드값

    ItemType(String description) {
        this.description = description;

    }
}

//enum Fruit{
//    APPLE("red"), PEACH("pink"), BANANA("yello"); //각각의 생성자를 호출하는것이고, 그 생성자의 매개변수에 인자를 전달
//    private String color; //필드
//    public String getColor(){ //메소드
//        return this.color;
//    }
//
//    Fruit(String color){
//        System.out.println("Call Constructor " + this);
//        this.color = color;
//    }
//}
