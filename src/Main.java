public class Main {
    public static void main(String[] args){
        String line = InOutUtils.ReadInputLine("Clauses.txt");
        System.out.println(TaskUtils.isLineBalanced(line));
    }
}
