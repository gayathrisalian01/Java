class Solution {
        public int addMinimum(String A) {
    char curr = 'a';
    int res = 0;
    for(int i = 0;i < A.length();){
        if(A.charAt(i) == curr) ++i;
        else ++res;
		curr = (char)('a' + ((curr - 'a') + 1) % 3);
	}
    return res + (curr == 'a' ? 0 : 'c' - curr + 1);
}
    }
