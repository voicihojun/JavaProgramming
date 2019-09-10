package academy.learnprogramming;

public class NumberToWords {
    public static void numberToWords(int number) {

        int size = getDigitCount(number);

        if(size == -1) {
            System.out.println("Invalid Value");
        } else {
            number = reverse(number);
            for(int i=0; i < size; i++) {

                int remainder = number % 10;
                number = number / 10;

                switch(remainder) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }

        }

    }

    public static int reverse(int number) {
        String result = "";
        String strNumber = "";
        if(number < 0) {
            strNumber = Integer.toString(number);
            strNumber = strNumber.substring(1);
            for(int i=0; i < strNumber.length(); i++) {
                result = strNumber.charAt(i) + result;
            }
            result = "-" + result;

        } else {
            strNumber = Integer.toString(number);
            for(int i=0; i < strNumber.length(); i++) {
                result = strNumber.charAt(i) + result;
            }
        }

        return Integer.parseInt(result);
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        return Integer.toString(number).length();
    }

}
