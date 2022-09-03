class MedianFinder {
       PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());
    // right queue is highest numbers in normal order so we can pop the lowest value
    PriorityQueue<Integer> right = new PriorityQueue<>(Comparator.naturalOrder());
	
    public void addNum(int num) {

        left.add(num); // always add to left

        // If queues are unbalanced in size, move largest value from left to right
        // we ensure left q is never more than one element larger than right q
        if (left.size() > (right.size() + 1))
            right.add(left.poll());

        // now check if the smallest value on right is larger than largest
        // value on left. If it is, then swap them over to ensure
        // all values on left are smaller than all on right.
        if (!right.isEmpty() && right.peek() < left.peek()) {
            int val1 = left.poll();
            int val2 = right.poll();
            left.add(val2);
            right.add(val1);
        }
    }

    public double findMedian() {

        if (left.size() == right.size())
            return (left.peek() + right.peek()) / 2.0;
        else
            return left.peek();
    }}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */