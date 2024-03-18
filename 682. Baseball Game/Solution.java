class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        int top = 0;
        int stackRecord[] = new int[operations.length];

        for(String ele: operations){
            switch(ele){
                case "+" -> {
                    stackRecord[top] = stackRecord[top-1] + stackRecord[top-2];
                    top++;
                }
                case "D"-> {
                    stackRecord[top] = stackRecord[top-1]*2;
                    top++;
                }
                case "C"-> {
                    stackRecord[--top] = 0;
                }
                default -> {
                    stackRecord[top++] = Integer.parseInt(ele);
                }
            }
        }
        for(int ele : stackRecord){
            sum += ele;
        }
        return sum;
    }
}