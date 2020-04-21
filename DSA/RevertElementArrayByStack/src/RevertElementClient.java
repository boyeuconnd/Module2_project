import java.util.Arrays;

public class RevertElementClient {
    public static void main(String[] args) {
        Stack<Integer> myIntStack = new Stack();
        int[] inputArray = {1,2,3,4,5,6,7,8,9};
        for (int elements:inputArray) {
            myIntStack.push(elements);
        }
        int[] revertdArray = new int[inputArray.length];
        for (int i=0;i<revertdArray.length;i++) {
            revertdArray[i] = myIntStack.pop();

        }
        Arrays.toString(revertdArray);

        Stack<String> myStringStack = new Stack<>();
        String inputString = "I want to talk to you that i really, really love you.";
        System.out.println("Origin sentence: "+inputString);
        String[] splitedArray =inputString.split(" ");
        for (String a:splitedArray) {
            myStringStack.push(a);
        }
        String[] revertedString = new String[splitedArray.length];
        System.out.print("New reverted sentence: ");
        for(int i =0;i<revertedString.length;i++){
            revertedString[i]=myStringStack.pop();
            System.out.print(revertedString[i]+" ");
        }
        System.out.println("\n==================================================");
        String[] beforeMarriage = {
                "Chàng: Cuối cùng thì ngày này đã đến! Anh đã chờ mong quá lâu!",
                "Nàng: Anh có muốn em ra đi không?",
                "Chàng: Không! đừng có nghĩ tới chuyện…huyễn hoặc!",
                "Nàng: Anh có yêu em không?",
                "Chàng: Dĩ nhiên rồi! Cả ngàn lần cũng không đủ!",
                "Nàng: Anh có bao giờ lừa dối em không?",
                "Chàng: Không! Tại sao em hỏi câu ngớ ngẩn!",
                "Nàng: Anh có muốn hôn em không?",
                "Chàng: Mỗi khi anh có cơ hội.",
                "Nàng: Anh có đánh em không?",
                "Chàng: Em điên hả? Anh đâu có phải loại người đó!",
                "Nàng: Em có thể tin tưởng nơi anh được chớ?",
                "Chàng: ừ!",
                "Nàng: Anh yêu!",
        };
        System.out.println("=======Trước khi cưới=======");
        for (String b:beforeMarriage) {
            System.out.println(b);
            myStringStack.push(b);
        }
        String[] afterMarriage = new String[splitedArray.length];
        System.out.println("=======Sau khi cưới=======");
        for(int i =0;i<revertedString.length;i++){
            revertedString[i]=myStringStack.pop();
            System.out.println(revertedString[i]);
        }
    }
}
