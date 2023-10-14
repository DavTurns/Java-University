public class ArraySorter {
    private Sorter sorter;

    public void setSorterStrategy(Sorter sorter) {
        this.sorter = sorter;
    }

    public void sortArray(int[] arr) {
        this.sorter.sort(arr);
    }
}
