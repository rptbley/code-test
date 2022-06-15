class BlockPhoneNum {
    public String solution(String phone_number) {
        return new StringBuilder().append(phone_number).replace(0, phone_number.length() - 4, "*".repeat(phone_number.length() - 4)).toString();
    }

    public static void main(String[] args) {
        BlockPhoneNum blockPhoneNum = new BlockPhoneNum();
        System.out.println("result = " + blockPhoneNum.solution("01033334444"));
    }
}
