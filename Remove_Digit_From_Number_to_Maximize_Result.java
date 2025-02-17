public class Remove_Digit_From_Number_to_Maximize_Result {
    public String removeDigit(String number, char digit) {
        String max="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                String result=number.substring(0,i)+number.substring(i+1);
                if(result.compareTo(max)>0){
                    max=result;
                }
            }
        }
        return max;
    }
    
}
