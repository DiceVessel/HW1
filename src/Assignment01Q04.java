import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        int n = array.length;

        if (direction != 'R' && direction != 'L') {
            return array;
        }

        if (n == 0) {
            return array;
        }

        int steps = move % n;

        if (direction == 'L') {
            steps = -steps;
        }

        steps = (steps + n) % n;

        if (steps == 0) {
            return array;
        }

        shiftRight(array, steps);
        return array;
    }


    private static void shiftRight(int[] array, int steps) {
        int n = array.length;
        boolean[] finished_index = new boolean[array.length];

        for (int i = 0; i < n; i++) {
        if (!finished_index[i]) {
            int current = i;
            int carry_current = array[i];
            do {
                int next = (current + steps) % n;
                int temp = array[next];
                array[next] = carry_current;
                carry_current = temp;
                finished_index[next] = true;
                current = next;
            } while (current != i);
        }
    }
        

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}