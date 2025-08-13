import  java.util.*;

class array{
//    secondary fuction to excute the code\
public static int linearsearch(int num[]) {
    int largest= Integer.MIN_VALUE;
    for (int i = 0; i<num.length; i++) {
        if(largest<num[i]) {
            largest=num[i];
        }
    }
    return largest;
}

//    main fuction of array
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10};
//        int key=5;
        System.out.println("largest array:" + linearsearch(num));

    }
}