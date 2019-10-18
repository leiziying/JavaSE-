package demo01;

public class BinarySearch {
      int binarySearch(int array[],int size,int value){
          int left=0;
          int right=size;
          while(left<right){
              int mid=(right-left)/2+left;
              if(array[mid]==value){
                  return mid;
              }else  if(value<array[mid]){
                  right=mid;
              }else{
                  left=mid+1;
              }
          }
          return -1;
      }
}
