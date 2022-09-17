import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class FibonacciOddEven {
    public static void main(String[] args) {
        int T;
        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        for (int i = 0; i <= T; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            String input = scanner.nextLine();
            if (input != null && input != ""){
                String[] splitedInput = input.split(" ");
                map.put("N",Integer.parseInt(splitedInput[0]));
                map.put("M",Integer.parseInt(splitedInput[1]));
                list.add(map);
            }
        }
        getCounts(list);
    }
    public static void getCounts(ArrayList<HashMap<String, Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            int N = list.get(i).get("N");
            int M = list.get(i).get("M");
            int[] series = getFibonacciSeries(M);
            int oddCount = 0;
            int evenCount = 0;
            for (int j = N - 1; j < M; j++) {
                if (series[j] % 2 == 0) {
                    evenCount += 1;
                } else {
                    oddCount += 1;
                }
            }
            System.out.println("Case: "+ (i + 1));
            System.out.print("Odd = " + oddCount + " \n" + "Even = " + evenCount + "\n");
        }
    }
    public static int[] getFibonacciSeries(int n) {
        int n1 = 0, n2 = 1, n3, i, count = n;
        int[] series = new int[n];
        series[0] = n1;
        series[1] = n2;
        for (i = 2; i < count; ++i)
        {
            n3 = n1 + n2;
            series[i] = n3;
            n1 = n2;
            n2 = n3;
        }
        return series;
    }
}
