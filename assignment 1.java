





package microAndArrayUpdate;
import java.util.*;
public class MicroAndArray {
public static void main(String args[]) {
int T,K,N,NT,m=0;
int a[]=new int[10];
int b[]=new int[10];
Scanner sc = new Scanner(System.in);
T=sc.nextInt();
for(int i=0;i<T;i++) {
N= sc.nextInt();
K=sc.nextInt();
for(int j=0;j<N;j++) {
a[j]=sc.nextInt();
}
int min=a[0];
for(int j=0;j<N;j++) {
if(a[j]<min)
min=a[j];
}
NT=K-min;
if(min<K) {
b[m]=NT;
m++;
for(int j=0;j<NT;j++) {
a[j]=a[j]+1;
}
}

}
for(int i=0;i<T;i++) {
System.out.println(b[i]);
}
sc.close();
}

}

