public class Krypt {
    public static void main(String[] args) {
        exempel1();

    }


    private static void exempel1() {
        String message = "ALCZHG";
        char key = ')';
        String crypt = "";


        StringBuilder output = new StringBuilder();


            for(int i = 0; i < message.length(); i++) {
                crypt =crypt+ ((char) (message.charAt(i) ^ key));
            }
            System.out.println(crypt);
            return;

    }
        }


