public class KekBt {
    public static void main(String[] args){
        
        Engineer eng = new Engineer();
        eng.name ="Béla";
        eng.age=43;
        eng.salary= 900000;
        eng.gradeNumber="1234";
        eng.working();

        System.out.println("Name: "+eng.name+" Age: "+eng.age+ " Salery: "+eng.salary);

        MainEngineer mEng = new MainEngineer();
        mEng.name = "Pali";
        mEng.age= 55;
        mEng.salary=850000;
        mEng.bonus=450000;
        mEng.working();

        System.out.println("Name: "+mEng.name+" Age: "+mEng.age+ " Salery: "+mEng.salary);
    }
}
