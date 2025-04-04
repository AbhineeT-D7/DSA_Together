//https://www.geeksforgeeks.org/problems/majority-element-1587115620/1
int number = 0;
            int count = 0;
            for(int num : arr){
                if(count == 0){
                    number = num;
                }
                if(number == num){
                    count++;
                }else{
                    count--;
                }
            }
            
            count = 0;
            
            for(int num : arr){
                if(number == num) count++;
            }
            
            if(count > arr.length / 2) return number;
            else return -1;
