public class Wordcount {
    public int count(String input){

        char chBefore = ' ';
        char chCurrent;
        int count = 0;

        for(int i = 0; i< input.length(); i++){
            if(!Character.isLetter(input.charAt(i)) && Character.isLetter(chBefore)){
                count++;
            }
            chBefore = input.charAt(i);
        }
        if(Character.isLetter(input.charAt(input.length() - 1))){
            count++;
        }

        return count;
    }
}
