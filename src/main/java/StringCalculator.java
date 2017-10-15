public class StringCalculator {

    public int Add(String numbers) throws Exception {
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            delimiter += "|" + numbers.substring(2,3);
            numbers = numbers.substring(4, numbers.length());
        }

        int sum = 0;
        String hasNegativeStr = "";

        if(numbers != "") {
            String[] strnums = numbers.split(delimiter);
            for (int i = 0; i < strnums.length; i++) {
                int val = Integer.parseInt(strnums[i]);;
                if (val < 0) {
                    if (hasNegativeStr != "") {
                        hasNegativeStr += ",";
                    }

                    hasNegativeStr += val;
                }

                if (val <= 1000) {
                    sum += val;
                }
            }
        }
        if (hasNegativeStr != "") {
            throw new Exception("Negatives not allowed: " + hasNegativeStr);
        }

        return sum;
    }

}
