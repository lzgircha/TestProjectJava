package class24;

public abstract class File {
    abstract void open();

    void edit() {
        System.out.println("editing the file");
    }

    void close() {
        System.out.println("closing the file");
    }
}

class JavaFile extends File {
    @Override
    void open() {
        System.out.println("Opening the file in IntelliJ");
    }

    void edit() {
        System.out.println("editing the file in IntelliJ");
    }
}

class WordFile extends File {
    @Override
    void open() {
        System.out.println("Opening the file in Microsoft word");
    }
}
class PDFFile extends File{
    @Override
    void open() {
        System.out.println("Opening the file in Adobe reader");
    }
}