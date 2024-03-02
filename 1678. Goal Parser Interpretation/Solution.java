class Solution {
    public String interpret(String command) {
        String newCommand = command.replaceAll("\\(\\)", "o");
        String newCommand1 = newCommand.replaceAll("\\(al\\)", "al");
        return newCommand1;
    }
}