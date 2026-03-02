class Solution {
    public int findMinDifference(List<String> timePoints) {

        int[] minutes = new int[timePoints.size()];
        for(int i = 0; i<minutes.length; i++){
            minutes[i] = Integer.valueOf(timePoints.get(i).substring(0,2)) * 60 + Integer.valueOf(timePoints.get(i).substring(3));
        }

        Arrays.sort(minutes);
        int minimum = Integer.MAX_VALUE;

        for(int i = 1; i<minutes.length; i++){
            minimum = Math.min(minimum, minutes[i] - minutes[i - 1]);
        }

        minimum = Math.min(minimum, 1440 - minutes[minutes.length - 1] + minutes[0]);
        return minimum;

    }
}