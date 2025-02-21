int strStr(char* haystack, char* needle) {
    int needlelen = strlen(needle);
    int haylen = strlen(haystack);

    if(needlelen > haylen){
        return -1;
    }
    for(int i = 0; i <= haylen - needlelen; i++){
        int j = 0;
        while(j < needlelen && haystack[i + j] == needle[j]){
            j++;
        }
        if(j == needlelen){
            return i;
        }
    }
    return -1;
}
