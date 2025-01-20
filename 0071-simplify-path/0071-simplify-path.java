class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        List<String> list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(".") || arr[i].isBlank()) {
                continue;
            } else if (arr[i].equals("..")) {
                if (list.size() > 0) {
                    list.remove(list.size() - 1);
                }
            } else {
                list.add(arr[i]);
            }
        }
        return "/" + String.join("/", list);
    }
}