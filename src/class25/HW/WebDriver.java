package class25.HW;

interface WebDriver {
    //Create a WebDriver Interface that will have the following unimplemented behaviour:
    // openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    // Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window size in Chrome browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements on the Chrome browser");
        System.out.println("________________");
    }

}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window in Firefox browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements in Firefox browser");
        System.out.println("_____________________");
    }
}