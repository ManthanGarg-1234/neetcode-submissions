class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<n1;i++){
            freq1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n2;i++){
            freq2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]!=freq2[i]) return false;
        }
    return true;
    }
}
