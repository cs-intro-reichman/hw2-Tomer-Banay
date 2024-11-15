// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    
                String s = args[0];
                 s = s.toUpperCase();
                int times = Integer.parseInt (args [1]);

                String an = "AEFHILMNORSX";
                int i = 0;
                while (i < s.length()) {
                char c = s.charAt(i);
                        if (an.indexOf(c) == -1) {
                        System.out.println("Give me a  " + c + ": " + c + "!");
                        } else {
                        System.out.println("Give me an " + c + ": " + c + "!");
                        }
                i++;
                }
                for (int j = 0; j < times; j++) {
                        System.out.println( s + "!!!");
                }
        }
 }

