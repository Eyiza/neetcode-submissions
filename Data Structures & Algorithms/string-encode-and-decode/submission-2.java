class Solution {
    private String emptyRepr = "&#00";
    private String seperator = "_#_";

    public String encode(List<String> strs) {
        if (strs.size() == 0) return "";
        String encodedString = "";
        for (String str : strs) {
            // System.out.print("1");
            if (str.isEmpty()) encodedString += (emptyRepr + seperator);
            else encodedString += (str + seperator);
        }
        // String encodedString = String.join(seperator, strs);
        // System.out.println(encodedString);
        return encodedString;
    }

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<String>(); 
        String[] arr = str.split(seperator);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(emptyRepr)) arr[i] = "";
        }
        return Arrays.asList(arr);
    }
}
