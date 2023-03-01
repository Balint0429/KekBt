public class KekBt {
    public static void main(String[] args){
        
        Engineer eng = new Engineer();
        eng.name ="Béla";
        eng.age=43;
        eng.salary= 900000;
        eng.gradeNumber="1234";
        eng.working();

        System.out.println("Name: "+eng.name+" Age: "+eng.age+ " Salery: "+eng.salary);
    }
}
