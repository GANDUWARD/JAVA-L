import java.util.Scanner;

public class App {
    private String dusha;
    public App(String a){
        this.dusha=a;
    }
    public App(){
        this("甘杜华");
    }
    public void out(){
        System.out.println(this.dusha);
    }
    public static void main(String[] args) throws Exception {
        App[]  h;
        h= new App[5];
        for(int i=0;i<5;++i){
            Scanner sc = new Scanner(System.in);
            String b=sc.nextLine();
            h[i]=new App(b);
        }
        for(int i=0;i<5;++i){
            h[i].out();
        }
    }
}
