package class23;

public class WeDriverTester {
    public static void main(String[] args) {
        //easier way
        WebDriver webDriver=new FireFox();
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();

      /* Chrome googleChrome=new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();

        System.out.println("-----------");
        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

        System.out.println("-----------");
        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closeBrowser();*/
        System.out.println("------shorter way with help of enhanced for loop-----");
        //using array
        WebDriver[]browsers={new Chrome(),new Safari(),new FireFox()};

        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();


        }
    }
}
