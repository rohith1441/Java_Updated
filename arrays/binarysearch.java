package arrays;

public class binarysearch {
    int binsearch(int arr[], int l, int r, int x) {
        if (r >= 1) {
            int mid = l+(r - 1)/2;
            if (arr[mid] == x)
                return mid;
                if(arr[mid]>x)
                    return binsearch(arr,l,mid-1,x);
                return binsearch(arr,mid+1,r,x);

            }

        return  -1;
    }
}

