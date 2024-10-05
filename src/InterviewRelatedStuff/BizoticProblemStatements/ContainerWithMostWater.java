package InterviewRelatedStuff.BizoticProblemStatements;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int area = Math.min(height[left], height[right])
                            * (right - left);

            maxArea = Math.max(area, maxArea);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {3, 1, 2, 4, 5, 2, 6};
        int maxAreaData = maxArea(height);
        System.out.println(maxAreaData);
    }

}
