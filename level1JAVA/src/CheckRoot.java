class CheckRoot {
    public long solution(long n) {
        double target = Math.sqrt(n);
        return target % 1 > 0 ? -1L : (long) Math.pow(target + 1, 2);
    }
}
