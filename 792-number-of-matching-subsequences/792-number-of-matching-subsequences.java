class Solution {
  
        class Item {
        String word;
        int index;
        public Item (String s, int i) {
            word = s;
            index = i;
        }
    }
    public int numMatchingSubseq(String S, String[] words) {
        Queue<Item>[] dict = new Queue[26];
        for (int i = 0; i < dict.length; i++) {
            dict[i] = new LinkedList<>();
        }

        for (String word :words) {
            if (word.length() > 0) {
                dict[word.charAt(0) - 'a'].add(new Item(word, 0));
            }
        }

        int count = 0;
        for (char c : S.toCharArray()) {
            Queue<Item> queue = dict[c - 'a'];
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Item top = queue.remove();
                top.index++;
                if (top.index == top.word.length()) {
                    count++;
                } else {
                    dict[top.word.charAt(top.index) - 'a'].add(top);
                }
            }
        }

        return count;
    }
    }
