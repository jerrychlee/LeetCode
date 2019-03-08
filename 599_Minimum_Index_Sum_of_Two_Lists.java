599. Minimum Index Sum of Two Lists

Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list 
of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. 
If there is a choice tie between answers, output all of them with no order requirement. 
You could assume there always exists an answer.

Example 1:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".
Example 2:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]

Explanation: The restaurant they both like and have the least index sum is "Shogun" with 
index sum 1 (0+1).

Note:
The length of both lists will be in the range of [1, 1000].
The length of strings in both lists will be in the range of [1, 30].
The index is starting from 0 to the list length minus 1.
No duplicates in both lists.

=========================================================================================

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> out= new ArrayList<String>();
        for(int i=0; i<list1.length; i++){
            map.put(list1[i],i);
        }
        
        int count = Integer.MAX_VALUE;
        for(int j=0; j<list2.length; j++){
            if(map.containsKey(list2[j])){
                int sum = map.get(list2[j])+j;
                if(count>=sum){
                    if(count>sum){
                        out.clear();                        
                    }
                    out.add(new String(list2[j]));
                    count = sum;
                }
            }
        }
        return out.toArray(new String[0]);
    }
}

=========================================================================================
