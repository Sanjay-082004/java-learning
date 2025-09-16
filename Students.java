   class Students {
    private String name;
    private  int age;
    private  double marks;

    public Students(String name, int age, double marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("Name:"+name+",Age:"+age+",Marks:"+marks);
    }
}
