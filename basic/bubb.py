
def bubbleSort(arr): 
    n = len(arr) 
  
   
    for i in range(n): 
  
       
        for j in range(0, n-i-1): 
  
            
            if arr[j] > arr[j+1] : 
                arr[j], arr[j+1] = arr[j+1], arr[j] 

    return arr


arr = [64, 25, 12, 22, 11]
bubbleSort(arr)
print("Sorted array:")
for i in range(len(arr)):
    print("%d" % arr[i])