class Solution {

    public String decodeString(String s) {
        //Stack to store repeat number
        Stack<Integer> numberStack = new Stack();

        //Stack to store the string which need to repeat
        Stack<String> stringStack = new Stack();

        int n =0; 
        char [] charArray = s.toCharArray();
        StringBuilder currentString = new StringBuilder();

        for(int i=0;i<charArray.length;i++){
            char ch = charArray[i];

            if(Character.isDigit(ch)){
                /*In java char have ASCII value hence we have written (ch-0)
                 example : 0 value is 48 and I have ch as 3.value of 3 is 51 hence
                  52-48 = 3 hence I will able to convert string to number
                */
                n = n*10 + (ch-'0');
            }else if(ch=='['){

                //push the string to string stack
                stringStack.push(currentString.toString());

                //push the Number to number stack
                numberStack.push(n);

               //reset the count and string
                currentString = new StringBuilder();
                n=0;

            }else if(ch==']'){
                String preString = stringStack.pop();
                int repeatNumber = numberStack.pop();

                for(int j=0;j<repeatNumber;j++){
                    preString = preString + currentString.toString();
                }

                currentString = new StringBuilder(preString.toString());
            }else{
                //If we have first string as letter not number or not any bracket
                currentString.append(ch);
            }
        }
        return currentString.toString();
      }
}