package anudip;

//defining the class
class SI{
        //member variable
        private float principal,rate;
        private int time;
        SI(float p, float r, int t){
            principal=p;
            rate=r;
            time=t;
        }
        public void DisplayData(){
            System.out.println("------------Simple Interest------------");
            System.out.println("Principal: "+principal+"Rs.");
            System.out.println("Rate: "+rate+"%");
            System.out.println("Time: "+time);
        }
        public void CalculateSI(){
            float si = (principal*rate*time)/100;
            System.out.println("--------------------------------------");
            System.out.print("Simple Interest is: " + si);
        }
    }
public class SimpleInterest {

    public static void main(String[] args) {
        SI a=new SI(1500f,10f,5);

        a.DisplayData();
        a.CalculateSI();
    }
}

