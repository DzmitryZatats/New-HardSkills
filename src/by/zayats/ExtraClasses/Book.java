package by.zayats.ExtraClasses;

abstract class Book implements Edition {
    public void pages(int n) {
        System.out.println("В книге " + n + " страниц");
    }

}

