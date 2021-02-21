import java.util.*;
public class sortingCode
{
static void sortArray(int arr[])
{
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if (arr[j]<arr[i])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
public static void main(String g[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
sortArray(arr);
}
}