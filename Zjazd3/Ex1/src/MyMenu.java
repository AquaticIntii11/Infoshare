public class MyMenu implements Menu{
    int number;
    String text;

    public MyMenu(){
        number = 1;
        text = "some text";
    }

    public MyMenu(int number){
        this.number = number;
    }

    public MyMenu(String someString){
        this.text = someString;
    }

    public MyMenu(int number, String text){
        this.number = number;
        this.text = text;
    }
    @Override
    public void show(){};
    @Override
    public void close(){};
    @Override
    public void runOption(int option){};


    public void fillTable (int num){
        int minNum = num;
        int[] tab = new int[10];
        for (int i=0; i < tab.length; i++){
            tab[i] = minNum;
            minNum+=1;
        }
        for (int i=0; i < tab.length; i++){
            System.out.println(tab[i]);
        }

    }
}

