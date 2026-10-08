class Solution {
    public int findLucky(int[] arr) {
        if(arr[0]==500){
            return 500;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int x=1;
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey()==entry.getValue()){
                list.add(entry.getKey());
            }
        }
        if(list.size()!=0){
           return Collections.max(list);
        }
        return -1;
    }
}