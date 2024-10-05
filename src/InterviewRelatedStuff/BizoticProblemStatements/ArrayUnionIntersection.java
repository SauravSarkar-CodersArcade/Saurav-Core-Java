package InterviewRelatedStuff.BizoticProblemStatements;

import java.util.Arrays;

public class ArrayUnionIntersection {
    public static void findUnionAndIntersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;

        System.out.print("Intersection: ");
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println();

        System.out.print("Union: ");
        i = 0;
        j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }

        while (i < n1) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        while (j < n2) {
            System.out.print(arr2[j] + " ");
            j++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 8, 10, 12};
        int[] arr2 = {4, 8, 12, 16, 20};

        findUnionAndIntersection(arr1, arr2);
    }
}

