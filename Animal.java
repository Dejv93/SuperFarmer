package gra1_0_obiektowo;

public class Animal {
    int count=0;
    public void addCount(int x){
        count+=x;
    };
    public void subtractCount(int x){
        count-=x;
    };
    public boolean isTradePossible(int x){
        return count>=x;
    };
}