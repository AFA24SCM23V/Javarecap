public class First {
    public static void main(String[] args) {
     
     //autoboxing char to Character
      char ch = 'a';
      Character x = ch;
      System.out.println(x);


      //unboxing CHaracter to char
      Character y = 'h';
      char chh = y;
      System.out.println(chh);

    }

    Character c = null;  // Valid
   // char ch2 = null;  // Compilation error

}
