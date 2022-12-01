class Operation{
    int data = 30;

void change(Operation op){
    op.data=op.data+50;
}
public static void main (String args[]){
    Operation op = new Operation();
    System.out.println("Before operation"  +op.data);
    op.change(op);
    System.out.println("Afer operation"  +op.data);
}
}