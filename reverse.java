class reverse {
    public static void main(String[] args) {      
    int n=12321,rem,rev=0,temp;
    temp=n;
    while(n>0){
        rem=n%10;
        rev=(rev*10)+rem;
        n=n/10;
    }
    System.out.println("reversed number is:= "+rev);
    if(rev==temp){
        System.out.println("Palindrone");
    }else{
        System.out.println("not palindrome");
    }
}
}

