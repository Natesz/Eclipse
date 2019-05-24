/ Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
       
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
       
        for(int i:arr){
            list.add(i);
        }
        
     
        
        while(list.size()!=0){
            
           // result.add(list.size());
            
            int minIndex = list.indexOf(Collections.min(list));
            int min = list.get(minIndex);
                //  System.out.println(min);

            for(int i=0;i<list.size();i++){
                list.set(i,list.get(i)-min);
                if(list.get(i)==0){
                    System.out.print(list.get(i));
                    list.remove(i);
                }
            }
           
           
System.out.println();
            
        }
        
          for(int i:result){
                System.out.println(i);
            }
        
        return arr;
    }
