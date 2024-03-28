
class NumericCall {
    public boolean checkNumber(String word, int k){
        char ch[] = word.toCharArray();
        int count = 0;
        for (int i = 0; i <= ch.length - 1; i++ ){
            if(ch[i] >= 'a' && ch[i] <= 'z' ){
                count ++;
            } else if(ch[i] >= '0' && ch[i] <= '9'){
                if(count == k){
                    count = 0;
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
public class NumericChecker {
    public static void main(String[] args) {
        NumericCall numericCall = new NumericCall();
        int K = 3;
        System.out.println(numericCall.checkNumber("abc1def2gdi3jkl4hyo5", K));
    }

}
