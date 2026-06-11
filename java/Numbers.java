public class Numbers {

    public static void main(String[] args) {

        int[] numbers = {10,25,5,18,30,12,45,7,22,15,
                         50,3,28,17,60,9,35,41,11,26};

        int highest = numbers[0];
        int lowest = numbers[0];
        int sum = 0;

        for(int n : numbers) {
            if(n > highest)
                highest = n;

            if(n < lowest)
                lowest = n;

            sum += n;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Average: " + average);
    }
}
