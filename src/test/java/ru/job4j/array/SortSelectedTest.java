package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort34125() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort687() {
        int[] data = new int[] {6, 8, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 7, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort94531() {
        int[] data = new int[] {9, 4, 5, 3, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4, 5, 9};
        assertThat(result).containsExactly(expected);
    }
}