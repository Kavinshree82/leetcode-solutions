//gray = number XOR (number >> 1)
class Solution {

    public List<Integer> grayCode(int n) {

        List<Integer> list = new ArrayList<>();

        int size = 1 << n;              // 2^n numbers

        for(int i = 0; i < size; i++) {
            int gray = i ^ (i >> 1);
            list.add(gray);
        }

        return list;
    }
}