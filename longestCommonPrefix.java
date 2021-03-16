//LeetCode 網址： https://leetcode.com/problems/longest-common-prefix/

package prefix;

/**
 *
 * @author HONG LEONG
 */
public class Prefix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[ ] testString = {"flower","flow","flozen"};
        Prefix p1 = new Prefix();
        System.out.println("return = " + p1.longestCommonPrefix(testString));        
    }
    
    public String longestCommonPrefix(String[ ] strs){        
// 當沒有東西的時候就回傳空值
        if(strs == null || strs.length == 0 ) return "";
 // 預設Prefix 為第一個字串
        String prefix = strs[0];

        for(int x = 1 ; x < strs.length ; x ++){
  // int indexOf(String str, int fromIndex): 返回从 fromIndex 位置开始查找指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。;
            while(strs[x].indexOf(prefix) != 0){
                // prefix 逐漸縮短，用於比對
                prefix = prefix.substring(0, prefix.length()-1);                
                if (prefix.isEmpty()) return "";
            }          
        }        
     return prefix;
    }    
}
