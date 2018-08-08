package initializationAndCleanup.exercise;

/**
 * @author Li Yan
 * 枚举类型可以看作是一个类
 * 枚举类型的实例{例子中的ONE,TWO,FIVE,TEN,TWENTY,FIFTY}为常量，故常用大写
 * 使用枚举类型的values方法与ordinal方法
 */
enum PaperCurrencyType{
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}

public class Exercise21 {
    public static void main(String[] args){
        for(PaperCurrencyType paperCurrencyType: PaperCurrencyType.values()){
            System.out.println(paperCurrencyType + ", ordinal: " + paperCurrencyType.ordinal());
        }

    }
}
