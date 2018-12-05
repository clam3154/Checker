public class Runner
{
    public static void main(String[] args)
    {
        Checker broccoliChecker = new SubstringChecker("broccoli");

        Checker bChecker = new SubstringChecker("beets");
        Checker cChecker = new SubstringChecker("carrots");
        Checker bothChecker = new AndChecker(bChecker, cChecker);
        Checker aChecker = new SubstringChecker("artichokes");
        Checker veggies = new AndChecker(bothChecker, aChecker);
    }
}
