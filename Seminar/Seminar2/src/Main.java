import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Tool> tools = List.of(new Hammer("hammer", 10), new Saw("saw", 5));

        System.out.println(ToolFilter.filterByWeight(tools, 7));
        System.out.println(ToolFilter.filteredByCanCut(tools));

        int[] arr = {6, 5, 2, 3, 1, 7};

        ArraySorter sorter = new ArraySorter();
        sorter.setSorterStrategy(new SlowSorter());
        sorter.sortArray(arr);
        System.out.println(Arrays.toString(arr));

        OrderLine orderLine = new OrderLine(10, new ComedyMovie("Bad Movie", 10), new ComedyMovieDiscounter());

        System.out.println(orderLine.calculatePrice());
    }
}