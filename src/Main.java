public class Main {
    public static void main(String[] args)
    {
        Person tom=new Person("Tom");
        System.out.println(tom.getName());
        tom.display();
        Client joe=new Client("Joe","ChukiBank",50000);
        joe.display();
        System.out.println(joe.getSum());

        Object kate = new Client("Kate", "BibiBank", 7000);
        if(kate instanceof Client clientKate)
        {
            clientKate.display();
        }
        else
        {
            System.out.println("No!");
        }



    }

}
    class Person
    {
    private String name;
    public String getName(){return name;}
    public Person(String name)
        {
        this.name=name;
        }
    public void display()
        {
            System.out.printf("Person: %s \n", name);
        }
    }
    class Employee extends Person
    {
        private String company;
        public Employee(String name, String company)
        {
            super(name);
            this.company=company;
        }
        public String getCompany()
        {
            return company;
        }
        public void display()
        {
            System.out.printf("Employee %s works %s \n", super.getName(), company);
        }
    }
    class Client extends Person
    {
        private int sum;
        private String bank;

        public Client(String name, String bank, int sum)
        {
            super(name);
            this.bank=bank;
            this.sum=sum;
        }
        public void display()
        {
            System.out.printf("Client %s has account in %s \n", super.getName(), bank);

        }
        public String getBank(){return bank;}
        public int getSum(){return sum;}

    }