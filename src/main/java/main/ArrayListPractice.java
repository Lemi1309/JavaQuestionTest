package main.java.main;

import java.util.ArrayList;

public class ArrayListPractice {
    // Q1: Return the size of a given ArrayList.
    public int listSize(ArrayList<Integer> list) { 
        return list.size();
    }
    // Q2: Return the sum of odd numbers in the list.
    public int SumOddList(ArrayList<Integer> list) { 
        int count = 0;
        for(int i =0; i < list.size(); i++){
            if(list.get(i)%2 != 0){
                count += list.get(i);
            }
        }
        return count;
    }
    // Q3: Return all listed numbers that have a 7 in them.
    public int CountAllSevens(ArrayList<Integer> list) { 
         int count = 0;
         for(int i = 0; i < list.size(); i++){
            if(list.get(i)%10 == 7){
                count++;
            }
         }
         return count;
    }
    // Q4: Return a newly made ArrayList that sorts all listed numbers from lowest to highest.
    public ArrayList<Integer> AscendList(ArrayList<Integer> list) { 
        ArrayList<Integer> newList = new ArrayList<Integer>(list);

        for(int i = 0; i < newList.size(); i++){
            for(int j = 0; j < newList.size(); j++){
                if(newList.get(i) < newList.get(j)){
                    int temp = newList.get(i);
                    newList.set(i, newList.get(j));
                    newList.set(j, temp); 
                }
            }
        }
        return newList;
    }
    // Q5: Return a newly made ArrayList that has removed all numbers greater than 50.
    public ArrayList<Integer> RemoveAboveFifty(ArrayList<Integer> list) { 
        ArrayList<Integer> gay = new ArrayList<Integer>(list);
        for(int i = 0; i < gay.size(); i++){
            if(gay.get(i) > 50){
                gay.remove(i);
                i--;
            }
        }    
        return gay;
    }
    // Q6: Return a newly made ArrayList that converts the length of String listed items into numbers.
    public ArrayList<Integer> convertList(ArrayList<String> list) { 
        ArrayList<Integer> monk = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            monk.add(list.get(i).length());
        }
        return monk;
    }
    // Q7: Recursively return the sum of all listed items in a given ArrayList.
    public int Sumof(int index, ArrayList<Integer> list) { 
        // Index starts at 0, this base case takes 1 off the size of list
        // e.g list has 4 elements [1, 2, 3, 5] if index counts to 4, it will try access element 5. (So -1 must be included)
        if(index > list.size()-1){
            return 0;
        }
        return list.get(index) + Sumof(index + 1, list);
    }
    // Q8: Return a newly made ArrayList that is n in size and is filled with randomly picked numbers within the range from start to end.
    public ArrayList<Integer> makeRandomList(int n, int start, int end) { 
        ArrayList<Integer> gay = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            int range = end - start;
            int random = (int)(Math.random()*range) + start;
            gay.add(random);
        }
        System.out.println(gay);
        return gay;
    }
    // Q9: Return the sum of listed items in both numList and strList but don't include 'null'.
    public int SpecialSumOfList(ArrayList<Integer> numList, ArrayList<String> strList) { 
        int count = 0;
        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) != null){
                count++;
            }
        }
        for(int j = 0; j < strList.size(); j++){
            if(strList.get(j) != null){
                count++;
            }
        }
        return count;
    }
    // Q10: Remove duplicate elements from an ArrayList and return a new list with unique elements.
    public ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) { 
        ArrayList<Integer> gay = new ArrayList<Integer>(list);

        for(int i = 0; i < gay.size(); i++){
            for(int j = i + 1; j < gay.size(); j++){
                if(gay.get(i) == gay.get(j)){
                    gay.remove(j);
                    j--;
                }
            }
        }
        return gay;

    }
    // Q11: Merge two sorted ArrayLists into a single sorted ArrayList. (Low to High)
    public ArrayList<Integer> mergeSortedLists(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        ArrayList<Integer> monk = new ArrayList<Integer>();

        for(int i = 0; i < list1.size(); i++){
            monk.add(list1.get(i));
        }
        for(int j = 0; j < list2.size(); j++){
            monk.add(list2.get(j));
        }
        // Nested loop
        for(int x = 0; x < monk.size(); x++){
            // Since we're adding 1, we minus 1 in the loop
            for(int y = 0; y < monk.size() - 1; y++){
                if(monk.get(y) > monk.get(y + 1)){
                    int temp = monk.get(y);
                    monk.set(y, monk.get(y+1));
                    monk.set(y+1, temp);
                }
            }
        }
        return monk;
    }
    // Q12: Find the second largest element in the ArrayList. (Does not include duplicates of highest number)
    public int secondLargest(ArrayList<Integer> list) { 
        ArrayList<Integer> sort = new ArrayList<>(list);

        //Nested loop to remove duplicates
        for(int i = 0; i < sort.size(); i++){
            for(int j = i + 1; j < sort.size(); j++){
                 if(sort.get(i) == sort.get(j)){
                    sort.remove(j);
                    j--;
                 }
            }
        }

        //Nested Loop for sorting low to high
        for(int x = 0; x < sort.size(); x++){
            for(int y = 0; y < sort.size() - 1; y++){
                if(sort.get(y) > sort.get(y + 1)){
                    int temp = sort.get(y);
                    sort.set(y, sort.get(y+1));
                    sort.set(y+1, temp);
                }
            }
        }
        return sort.get(sort.size() - 2);
    }
    // Q13: Return a new ArrayList containing only the elements that are present in both input ArrayLists.
    public ArrayList<Integer> findCommonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) { 

    }
}

