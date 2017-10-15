public class StringCalculator {

    public int Add(String numbers) throws Exception {
        int sum = 0;
        String hasNegativeStr = "";

        if(numbers != "") {
            String[] strnums = numbers.split(",|\n");
            for (int i = 0; i < strnums.length; i++) {
                int val = Integer.parseInt(strnums[i]);;
                if (val < 0) {
                    if (hasNegativeStr != "") {
                        hasNegativeStr += ",";
                    }

                    hasNegativeStr += val;
                }

                sum += val;
            }
        }
        if (hasNegativeStr != "") {
            throw new Exception("Negatives not allowed: " + hasNegativeStr);
        }

        return sum;
    }

}
