import java.util.Scanner;

public class Binarysearch {
    public static void binarysearch(int arr[],int firstElement,int lastElement,int key)
    {
        int mid=(firstElement+lastElement)/2;

        while(firstElement<=lastElement)
        {
            if(arr[mid]<key)
            {
                firstElement=mid+1;
            } else if (arr[mid]==key) {
                System.out.println("Element is found at index number:"+mid);
                break;
            }
            else{
                lastElement= mid-1;
            }
            mid=(firstElement+lastElement)/2;
        }
        if(firstElement>lastElement)
        {
            System.out.println("Element is not found");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the element which you want to search:");
        int key= sc.nextInt();
        int lastElement=arr.length-1;

        binarysearch(arr,0,lastElement,key);
    }
}