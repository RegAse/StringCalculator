public class StringCalculator {

    public int Add(String numbers) {
        int sum = 0;

        if(numbers != "") {
            String[] strnums = numbers.split(",|\n");
            for (int i = 0; i < strnums.length; i++) {
                sum += Integer.parseInt(strnums[i]);
            }
        }

        return sum;
    }

}
