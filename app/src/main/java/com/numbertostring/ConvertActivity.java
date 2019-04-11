package com.numbertostring;

public class ConvertActivity {
    public String word;
    String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
    String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public ConvertActivity(){
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String change(int number) {
        if (number % 100 < 20) {
            word=ones[number%20];
            number /=100;
        }else {
            word=ones[number%10];
            number /=10;
            word = tens[number % 10] +" "+ word;
            number /= 10;
        }
        if (number == 0)
            return word;
        return ones[number] +" " + " hundred "+" and" + word;
    }
}
