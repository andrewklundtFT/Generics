public class Main {
    public static void main(String[] args) throws Exception {
        Stack<Integer> a = new Stack<Integer>();
        System.out.println(a.Peek());
        a.push(1);
        System.out.println(a.Peek());
        a.push(2);
        System.out.println(a.Peek());
        a.Pop();
        System.out.println(a.Peek());
        a.Pop();
        System.out.println(a.Peek());
    }
}
