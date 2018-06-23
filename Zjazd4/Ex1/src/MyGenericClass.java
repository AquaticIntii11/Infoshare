public class MyGenericClass<T>  {
    private T item;

    public MyGenericClass(T item){
        this.item = item;
    }

    public void printItem(){
        System.out.println(item.getClass().getName());
    }
}
