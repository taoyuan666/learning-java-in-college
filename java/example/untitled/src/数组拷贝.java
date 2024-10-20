import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.copy;

public class 数组拷贝 {
    public static void main(String[] args) {
        int[] arr = {11, 13, 12};
        int[] arr2 = copy(arr);
    }
    public static int[] copy(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
