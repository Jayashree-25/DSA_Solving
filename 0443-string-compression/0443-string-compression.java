class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while(i < chars.length) {
            char current = chars[i];
            int j = i;

            while(j < chars.length && chars[j] == current) {
                j++;
            }

            int count = j - i;

            chars[index++] = current;

            if(count > 1) {
                String num = String.valueOf(count);

                for(int k = 0; k < num.length(); k++) {
                    chars[index++] = num.charAt(k);
                }
            }

            i = j;
        }

        return index;
    }
}