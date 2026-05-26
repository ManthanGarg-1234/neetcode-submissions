class Solution {
    public static int[] findpse(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    public static int[] findnse(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=findnse(heights,n);
        int[] pse=findpse(heights,n);
        int Maxarea=0;
        for(int i=0;i<n;i++){
            Maxarea=Math.max(Maxarea,heights[i]*(nse[i]-pse[i]-1));
        }
        return Maxarea;
    }
}
