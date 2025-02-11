class Solution {
    public String removeOccurrences(String s, String part) {
       char[] str = s.toCharArray();
       char[] ptr = part.toCharArray();
       char[] restack = new char[str.length];
       int stacksize = 0;
       int ptrLength = ptr.length;
       char prtend = ptr[ptr.length - 1];
       for (char currentChar : str) {
            restack[stacksize++] = currentChar;

            if (currentChar == prtend && stacksize >= ptrLength) {
                int i = stacksize - 1, j = ptrLength - 1;

                while (j >= 0 && restack[i] == ptr[j]) {
                    i--;
                    j--;
                }

                if (j < 0) {
                    stacksize = i + 1;
                }
            }
        }

        return new String(restack, 0, stacksize);

    }
}
