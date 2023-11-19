class Solution {
    public String solution(String my_string, int[] index_list) {
        String arr = "";
        for(int i = 0; i < index_list.length; i++){
            arr += my_string.charAt(index_list[i]);
        }
        return arr;
    }
}