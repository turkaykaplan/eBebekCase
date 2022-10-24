public class Employee {

     String name;
     int salary;
     int workHours;
     int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){

        if (this.salary > 1000)
            return (this.salary*3)/100;
        else
            return 0;
    }
    public double bonus(){
        if(workHours > 40)
            return (workHours-40)*30;
        else
            return 0;
    }
    public int raiseSalary(){
        int expRaiseSalary;
        int time = (2021 - this.hireYear);
        double rSalary = this.salary + this.bonus()- this.tax(); // Vergi ve bonuslar ile birlikte raiseSalary
        if (time > 10 ){
            expRaiseSalary = (int) (rSalary*0.05);
            return expRaiseSalary; }

        else if (time > 9 && 20 > time ) {
            expRaiseSalary = (int) (rSalary*0.1);
            return expRaiseSalary;}

        else if (time >  19){
            expRaiseSalary = (int) (rSalary*0.15);
            return expRaiseSalary;}

        else{
            expRaiseSalary = 0;}

        return expRaiseSalary;
    }
    public String toString(){

        System.out.println("Çalışanın Adı: " + this.name);
        System.out.println("Çalışanın Maaşı: " + this.salary + " TL");
        System.out.println("Haftalık Çalışma Saati: " + this.workHours +" Saat");
        System.out.println("İşe Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax()+ " TL");
        System.out.println("Bonus: " + bonus()+ " TL");
        System.out.println("Yıla Göre Maaşın Artışı: " + raiseSalary() + " TL");
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " +  (this.salary +bonus()+raiseSalary() - tax())+" TL");
        System.out.println("Toplam Maaş: " + (this.salary+bonus()+raiseSalary()) +" TL");


        return ("\nSonuçlar Yukarıda Gösterilmiştir.");
    }
    public static void main(String[] args) {

        Employee calisan = new Employee("Kutay", 8900,54,1992);
        System.out.println(calisan);
    }
}