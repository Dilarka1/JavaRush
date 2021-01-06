package JavaRush.Level13;

public class Solution10 {
    /*
Параметризованый интерфейс
*/
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {
            return new StringObject();
        }
    }
}
