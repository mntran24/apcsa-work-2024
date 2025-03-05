int key = 1;
int temp = 0;
for i in range n-1
    for int x = key-1;x>=0;x--
        if (data[x]>data[key]){
            temp = data[x];
            data[x] = data[key];
            data[key] = temp;
        }
    key++;
    