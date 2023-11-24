<h2>reduce-array-size-to-the-half Notes</h2><hr>calculate the frequency of each of the elements of the array using HashMap
    Map<Integer,Integer> map = new HashMap<>();
	for(int a : arr){
            map.put(a, map.getOrDefault(a,0) + 1);
        }
Store the frequency in a list and then sort it, so that we can make use of hightest frequency from the end of the list.
List<Integer> l = new ArrayList<>();
 		 for(int v : map.values()){
         l.add(v);
     }
 	Collections.sort(l);
Keep on incrementing the [count] value and adding the frequency to the sum until the [sum (of frequencies) ]
becomes >= n/2;
int len = l.size() - 1;
        int sum = 0;
        int count = 0;
        
        while(sum < n/2){
            sum += l.get(len--);
            count++;
        }
        
When the sum becomes >= n/2 , we come out of the while-loop and return the count value


