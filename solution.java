 class Solution {
//     public int maxSubArray(int[] nums) {
//         int current = 0, max = Integer.MIN_VALUE;
//         for (int n : nums) {
//             current = Math.max(n, current + n);
//             max = Math.max(max, current);
//         }
//         return max;
//     }
// }
// merge and sort
// class Solution {
//     public int[] sortArray(int[] nums) {
//         mergeSort(nums, 0, nums.length - 1);
//         return nums;
//     }
//     void mergeSort(int[] a, int l, int r) {
//         if (l >= r) return;
//         int m = (l + r) / 2;
//         mergeSort(a, l, m);
//         mergeSort(a, m + 1, r);
//         merge(a, l, m, r);
//     }
//     void merge(int[] a, int l, int m, int r) {
//         int[] t = new int[r - l + 1];
//         int i = l, j = m + 1, k = 0;
//         while (i <= m && j <= r) t[k++] = a[i] <= a[j] ? a[i++] : a[j++];
//         while (i <= m) t[k++] = a[i++];
//         while (j <= r) t[k++] = a[j++];
//         for (i = 0; i < t.length; i++) a[l + i] = t[i];
//     }
// }
// leet 28
// class Solution {
//     public int strStr(String h, String n) {
//         int m = h.length(), k = n.length();
//         for (int i = 0; i <= m - k; i++)
//             if (h.substring(i, i + k).equals(n))
//                 return i;
//         return -1;
//     }
// }

// k freqyent count
// class Solution {
//     public List<String> topKFrequent(String[] words, int k) {
//         Map<String,Integer> map = new HashMap<>();
//         for (String w : words) map.put(w, map.getOrDefault(w, 0) + 1);
//         PriorityQueue<String> pq = new PriorityQueue<>(
//             (a,b) -> map.get(a).equals(map.get(b)) ? b.compareTo(a) : map.get(a) - map.get(b)
//         );
//         for (String w : map.keySet()) {
//             pq.offer(w);
//             if (pq.size() > k) pq.poll();
//         }
//         List<String> ans = new ArrayList<>();
//         while (!pq.isEmpty()) ans.add(pq.poll());
//         Collections.reverse(ans);
//         return ans;
//     }
// }

// duplicate val
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int j = 1;
//         for (int i = 1; i < nums.length; i++)
//             if (nums[i] != nums[i - 1])
//                 nums[j++] = nums[i];
//         return j;
//     }
// }
// lader 
// class Solution {
//     static ArrayList<Integer> leaders(int[] a) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         int max = Integer.MIN_VALUE;
//         for (int i = a.length - 1; i >= 0; i--) {
//             if (a[i] >= max) {
//                 ans.add(a[i]);
//                 max = a[i];
//             }
//         }
//         Collections.reverse(ans);
//         return ans;
//     }
// }


