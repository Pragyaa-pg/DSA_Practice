class Q1323 {
    public int maximum69Number (int num) {
        int count =0;
        int digit;
        int exactDigit;
        int newDigit;
        int original=num;
        int maximum69Number =num;
        while(num!=0){
            count++;
            num=num/10;
        }
        for(int i=count-1;i>=0;i--){
            digit =original/(int)Math.pow(10,i);
            exactDigit =digit%10;
            if(exactDigit ==6){
                newDigit =original+3*(int)Math.pow(10,i);
                maximum69Number = Math.max(newDigit,maximum69Number);
                return maximum69Number;
            }
        }
        return maximum69Number;
        
    }
    public static void main(String[] args) {
        Q1323 obj =new Q1323();
        int num = 6699;
    }
}