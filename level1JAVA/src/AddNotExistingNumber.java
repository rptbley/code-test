import java.util.stream.IntStream;

class AddNotExistingNumber {
    public int solution(int[] numbers) {
        return 45 - IntStream.of(numbers).sum();
    }
}
