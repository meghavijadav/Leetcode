class Solution {
    public String defangIPaddr(String address) {
        //replace . with [.]

        return address.replaceAll("\\.", "[.]");
    }
}