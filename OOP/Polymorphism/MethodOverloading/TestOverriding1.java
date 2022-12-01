class Bank{
    int getrateofinterest(){return 0;}
}
class SBI extends Bank{
    int getrateofinterest(){return 8;}
}
class Axis extends Bank{
    int getrateofinterest(){return 7;}
}
class ICICI extends Bank{
    int getrateofinterest(){return 9;}
}
class TestOverriding1{
    public static void main (String[] args){
        SBI s=new SBI();
        Axis a=new Axis();
        ICICI i=new ICICI();
        system.out.println("rate of interest of SBI bank is :" + s.getrateofinterest());
        system.out.println("rate of interest of Axis bank is :" + a.getrateofinterest());
        system.out.println("rate of interest of ICICI bank is :" + i.getrateofinterest());


    }
}