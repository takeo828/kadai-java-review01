
public class Review01 {

    public static void main(String[] args) {
        int price = 1500; // 商品の値段を代入
        int taxrate = 10;// 消費税率を代入
        int result;

        result = tax(price , taxrate);

        System.out.println(price + "円の商品の税込価格は" + (price + result) + "円（消費税は" + result + "円）です。");
    }

    public static int tax(int num1, int num2) {
        int result = num1 * num2/100;
        return result;
    }
}