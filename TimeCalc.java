public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMin = Integer.parseInt(args[1]);

        // totatl min and hours
        int totalMinutes = ((hours * 60) + minutes + addMin);
        int sumHours = ((totalMinutes / 60) % 24); 
        int sumMin = ( totalMinutes - ((totalMinutes / 60 ) * 60));
        

        // min + hours conditions
        if (sumHours == 24) System.out.print("00");
        if (sumHours < 10) System.out.print ("0" + sumHours);
        else System.out.print (sumHours);
        if (sumMin < 10) System.out.println (":0" + sumMin);
        else System.out.println (":" + sumMin);
        }
    }
