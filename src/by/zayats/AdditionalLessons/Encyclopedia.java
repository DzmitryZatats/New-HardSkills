package by.zayats.AdditionalLessons;


class Encyclopedia extends Book {
    String name;
    public Encyclopedia(String name) {
        this.name = name;
    }

    @Override
    public void number() {
        System.out.println(super.name + " № 5 - " + name);
    }


}
