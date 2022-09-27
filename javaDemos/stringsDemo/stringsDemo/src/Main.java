public class Main {
    public static void main(String[] args) {

        String message = " Today, the weather is very nice. ";
        System.out.println(message);

        System.out.println("Number of character : " + message.length());
        System.out.println("5. character :" + message.charAt(4));
        System.out.println(message.concat(" Wonderful!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("."));

        char[] characters = new char[5];
        message.getChars(0, 5, characters, 0);
        System.out.println(characters);
        System.out.println(message.indexOf('w'));//first
        System.out.println(message.lastIndexOf('t'));


        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(message.substring(2, 5));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}