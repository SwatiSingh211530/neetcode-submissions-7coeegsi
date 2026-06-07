class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            char[] arr1 = strs[i].toCharArray();
            Arrays.sort(arr1);
            String sorted1 = new String(arr1);

            for (int j = i + 1; j < strs.length; j++) {

                if (visited[j]) continue;

                char[] arr2 = strs[j].toCharArray();
                Arrays.sort(arr2);
                String sorted2 = new String(arr2);

                if (sorted1.equals(sorted2)) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }
}