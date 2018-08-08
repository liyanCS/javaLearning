package initializationAndCleanup.exercise;
/**
 * @author Li Yan
 * enum与switch是绝配
 * PaperCurrencyType.values()会返回所有的PaperCurrency的实例，然后使用foreach来遍历它
 * switch的case语句如果没有用break的话，如果它匹配的话，会顺序执行下面所有的语句，而不管下面的case是否匹配
 */
public class Exercise22 {
    static void describe(PaperCurrencyType paperCurrencyType){
        System.out.print(paperCurrencyType + " has a portrait of ");
        switch (paperCurrencyType){
            case ONE: System.out.println("This is one yuan"); break;
            case TWO: System.out.println("This is two yuan"); break;
            case FIVE: System.out.println("This is five yuan"); break;
            case TEN: System.out.println("This is ten yuan"); break;
            case TWENTY: System.out.println("This is twenty yuan"); break;
            case FIFTY: System.out.println("This is fifty yuan"); break;
            default: System.out.println("There isn't this type paperCurrency");
        }
    }
    public static void main(String[] args){
        for(PaperCurrencyType paperCurrencyType: PaperCurrencyType.values()){
            describe(paperCurrencyType);
        }

    }

}
