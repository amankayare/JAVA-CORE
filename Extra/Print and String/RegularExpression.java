public class RegularExpression {

    // MATCHING SYMBOLS

    // . => any character
    // [abc] => Exactly given letters
    // [abc][vz] => Either first or second set (first set is for 1st letter and
    // second set is for 2nd letter)
    // [^abc] => except abc
    // [a-z1-7] => a to z or 1 to 7
    // A|B => A or B
    // XZ => Exactly XZ
    // ================================================================

    // META CHARACTERS

    // \d => Digits
    // \D => not digits
    // \s => Space
    // \S => not spaces
    // \w => alphabets or digits
    // \W => not alphabets or digits
    // ================================================================

    // Quantifiers (how many symbols you want)

    // * => 0 or more time
    // + => 1 or more
    // ? => 2 or 1 time
    // {X} => X times
    // {X,Y} => Between X and Y

    public static void main(String[] args) {


            String str = " programmer@yahoo.com";


            String username = str.substring(0,str.indexOf("@"));
            System.out.println("USERNAME: "+username);
            String domain = str.substring(str.indexOf("@")+1,str.indexOf("."));
            System.out.println( "DOMAIN: "+domain );

            if(domain.equals("gmail")){
                System.out.println("Yes domain is GMAIL");
            }else{
                System.out.println("No domain is not a GMAIL");
            }

            String s = "101010103001";
            String s2 = "101010100001";

            String s3 = "153ABD";
            System.out.println(s.matches("[10]*"));//true
            System.out.println(s2.matches("[10]*"));// false

            System.out.println(s3.matches("[\\W ABCD123456789]*"));


    }
}
