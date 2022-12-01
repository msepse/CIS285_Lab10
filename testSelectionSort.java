import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testSelectionSort
{
    @Test
    public void test()
    {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    @Test
    public void testPositive()
    {

    }

    @Test
    public void testNegative()
    {

    }

    @Test
    public void testMixed()
    {
      /** Test data contains with both positive, negative and zeros **/
      int[] arr = new int[5];
      arr[0] = -4;
      arr[1] = -2;
      arr[2] = 4;
      arr[3] = -6;
      arr[4] = 20;

      int[] Sortedarr = new int[5];
      Sortedarr[0] = -6;
      Sortedarr[1] = -4;
      Sortedarr[2] = -2;
      Sortedarr[3] = 4;
      Sortedarr[4] = 20;

      SelectionSort temp1 = new SelectionSort();
      int[] sorted = temp1.basicSelectionSort(arr);

      /** add tests to check for this unit test **/
      assertEquals(Sortedarr[0], sorted[0], "The values are not the same (Mixed)");
      assertEquals(Sortedarr[1], sorted[1], "The values are not the same (Mixed)");
      assertEquals(Sortedarr[2], sorted[2], "The values are not the same (Mixed)");
      assertEquals(Sortedarr[3], sorted[3], "The values are not the same (Mixed)");
      assertEquals(Sortedarr[4], sorted[4], "The values are not the same (Mixed)");
    }

    @Test
    public void testDuplicates()
    {
      /** Test data contains duplicates **/
      int[] arr = new int[5];
      arr[0] = -6;
      arr[1] = 20;
      arr[2] = 4;
      arr[3] = -6;
      arr[4] = 20;

      int[] Sortedarr = new int[5];
      Sortedarr[0] = -6;
      Sortedarr[1] = -6;
      Sortedarr[2] = 4;
      Sortedarr[3] = 20;
      Sortedarr[4] = 20;

      SelectionSort temp1 = new SelectionSort();
      int[] sorted = temp1.basicSelectionSort(arr);

      /** add tests to check for this unit test **/
      assertEquals(Sortedarr[0], sorted[0], "The values are not the same (Duplicates)");
      assertEquals(Sortedarr[1], sorted[1], "The values are not the same (Duplicates)");
      assertEquals(Sortedarr[2], sorted[2], "The values are not the same (Duplicates)");
      assertEquals(Sortedarr[3], sorted[3], "The values are not the same (Duplicates)");
      assertEquals(Sortedarr[4], sorted[4], "The values are not the same (Duplicates)");
    }
}
