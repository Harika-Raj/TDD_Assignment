package Assignment3;

public class RunLengthData {

    String data;
    public RunLengthData(String data) {
        this.data = data ;
    }

    public String encode() {
        int count ;
        String encodedData = "";
       for(int index = 0 ; index < data.length() ; index++){
           count = 1;
           while(index + 1 < data.length() && data.charAt(index) == data.charAt(index + 1)){
               count++;
               index++;
           }
           encodedData = encodedData + data.toLowerCase().charAt(index) + String.valueOf(count);
       }
       return encodedData;
    }

    public String decode() {
        return "a";
    }
}
