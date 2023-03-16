package project2;

interface WebDriver {
    //Provide Implementation for the diagram below.
    // Then create a test class in which you need to create Objects of ChromeDriver,
    // FirefoxDrive and SafariDriver classes and see which methods available to them.

    void open();
    void close();
    void getTitle();

    interface RemoteWebDriver extends WebDriver {
        void navigate();
    }
    interface TakesScreenshot extends RemoteWebDriver{
        void getScreenshot();
    }
    class ChromeDriver implements RemoteWebDriver{
       public void open(){System.out.println("Open Chrome browser");}
       public void close(){System.out.println("Close Chrome browser");}
       public void getTitle(){System.out.println("Get title from the Chrome browser");}
       public void navigate(){System.out.println("Navigate Chrome browser");}



    }
    class FirefoxDriver implements RemoteWebDriver{
        public void open(){System.out.println("Open Firefox browser");}
        public void close(){System.out.println("Close Firefox browser");}
        public void getTitle(){System.out.println("Get title from the Firefox browser");}
        public void navigate(){System.out.println("Navigate Firefox browser");}
    }
    class SafariDriver implements RemoteWebDriver{
        public void open(){System.out.println("Open Safari browser");}
        public void close(){System.out.println("Close Safari browser");}
        public void getTitle(){System.out.println("Get title from the Safari browser");}
        public void navigate(){System.out.println("Navigate Safari browser");}
    }

    public static void main(String[] args) {
        WebDriver []webDrivers={new FirefoxDriver(), new SafariDriver(), new ChromeDriver()};
        for (WebDriver wd: webDrivers){
            wd.close();
            wd.open();
            wd.getTitle();
        System.out.println("______________________");
        RemoteWebDriver []remoteDrivers={new FirefoxDriver(), new SafariDriver(), new ChromeDriver()};
        for (RemoteWebDriver rd: remoteDrivers){
            rd.navigate();
            rd.close();
            rd.open();
            rd.getTitle();
        }
    }
}}
