ArrayList arr
arr.size() = n
int num = n-1
for i in range 0 to n-1
    for x in range 0 to num
        if arr[x]>arr[x+1]
            int temp = arr[x]
            arr[x] = arr[x+1]
            arr[x+1] = temp
        num = num - 1
return arr
