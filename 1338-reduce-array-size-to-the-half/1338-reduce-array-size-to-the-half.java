class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
            for (int a : arr) map.put(a, map.getOrDefault(a, 0) + 1);

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
            for (int v : map.values()) maxHeap.offer(v);

            int ans = 0, count = 0, half = arr.length / 2;
            while (count < half) {
                count += maxHeap.poll();
                ans++;
            }

            return ans;
    }
}