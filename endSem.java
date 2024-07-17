class vai{
    int a=0;
    int b=0;
    public int sub(int a,int b){
        return a-b;
    }
    public int add(int a,int b){
        return a+b;
    }
}
class bhav extends vai{
    
    bhav(){
    }
    bhav(int b,int a){
        
        this.a=a;
        this.b=b;
    }
    int eval(){
        return add(a,b)-sub(a,b);
    }

}
/**
 * endSem
 */
public class endSem {
    public static void main(String[] args) {
        bhav ob1=new bhav(1,1);
        System.out.println(ob1.eval());

    }
    
    
    

    
}