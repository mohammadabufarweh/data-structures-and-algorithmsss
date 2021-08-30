## Insertion Sort


**Pseudocode**
```
  InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
```


- **ex: [8,4,23,42,16,15]**


| Iteration      | i |          j |temp|result|
| ----------- | ----------- | ----------- |----------- | ----------- |
| 1      | 1       |      0 |4|[4,8,23,42,16,15]|
| 2   | 2       |        1 |23|[4,8,23,42,16,15]|
| 3      | 3       | 2 |42|[4,8,23,42,16,15]|
| 4   | 4       | 3 |16|[4,8,16,23,42,15]|
| 5      | 5       | 4 |15|[4,8,15,16,23,42]|




- Here we start from the second element in the array we take it and store it in new varabile  temp and we create variable j and we store the index-1 in it (value of i)

- then we check if the previous value is bigger than the current value we do the switch if not we pass to the next value .we repeat this operation to sort all value in array and then return the sorted array


