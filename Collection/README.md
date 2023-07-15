# Java Collections
## Giới thiệu:
#### `Collections` là một khái niệm trong ngôn ngữ lập trình Java để đại diện cho một nhóm các đối tượng, cung cấp một tập hợp các class và interface để làm việc với dữ liệu tập hợp. Một số class và interface phổ biến:
* `List`
* `Queue`
* `Set`
* `Map`
### List
* `ArrayList`: Được triển khai một danh sách dựa trên mảng. Nó cung cấp các phương thức để thêm, xóa và truy xuất phần tử dựa trên chỉ số. ArrayList cũng có khả năng tự động mở rộng khi thêm phần tử mới.
* `LinkedList`: Được triển khai một danh sách liên kết hai chiều. Nó cung cấp các phương thức để thêm, xóa và truy xuất phần tử dựa trên chỉ số. LinkedList có khả năng thêm, xóa phần tử nhanh hơn so với ArrayList, nhưng truy xuất phần tử theo chỉ số chậm hơn.
* `Vector`:  Được triển khai một danh sách dựa trên mảng và tương tự như ArrayList. Tuy nhiên, Vector được đồng bộ hóa và được sử dụng trong các trường hợp đòi hỏi đồng bộ hóa truy cập đa luồng.
### Queue
* `PriorityQueue`: Cung cấp một hàng đợi ưu tiên, trong đó các phần tử được lưu trữ theo thứ tự ưu tiên của chúng. Phần tử có ưu tiên cao hơn được truy cập trước phần tử có ưu tiên thấp hơn. Các phần tử trong PriorityQueue được sắp xếp theo thứ tự ưu tiên sử dụng một tiêu chí so sánh. Mặc định, nếu các phần tử trong hàng đợi là các đối tượng Comparable, chúng sẽ được sắp xếp tự động. Nếu không, bạn có thể cung cấp một Comparator để chỉ định cách xác định thứ tự ưu tiên.
* `ArrayDeque`: Cung cấp một cấu trúc dữ liệu deque (hàng đợi hai đầu) dựa trên một mảng động. ArrayDeque cho phép thao tác chèn và xóa ở cả hai đầu của hàng đợi với độ phức tạp thời gian gần như là O(1). Điều này làm cho nó hiệu quả cho các thao tác thêm/xóa phần tử ở cả hai đầu của hàng đợi mà không cần đến việc di chuyển các phần tử khác.
* ### Set
* `HashSet`: Cung cấp một tập hợp các phần tử duy nhất, sử dụng cơ chế băm (hashing) để lưu trữ các phần tử và cho phép truy cập, thêm và xóa phần tử với độ phức tạp thời gian gần như là O(1). Mặc định, các phần tử trong HashSet không có thứ tự cụ thể.
* `LinkedHashSet`: Tương tự `HashSet`, tuy nhiên lưu trữ các phần tử theo thứ tự chèn của chúng bằng cách sử dụng một danh sách liên kết song song với bảng băm. Điều này làm cho LinkedHashSet hữu ích khi muốn duyệt qua các phần tử trong thứ tự chúng được chèn vào.
* `TreeSet`: Cung cấp một tập hợp sắp xếp các phần tử duy nhất dựa trên cấu trúc dữ liệu cây nhị phân. TreeSet lưu trữ các phần tử theo thứ tự tăng dần hoặc theo một bộ so sánh được chỉ định. Khi thêm một phần tử vào TreeSet, nó sẽ được đặt vào cây theo vị trí thích hợp dựa trên thứ tự sắp xếp, hữu ích khi bạn muốn duyệt qua các phần tử theo thứ tự sắp xếp.
* ### Map
* `HashMap`: Lưu trữ giá trị dạng key-value (key duy nhất, value tuỳ ý), tìm kiếm nhanh, cho phép value bằng null.
* `LinkedHashMap`: Là một phiên bản cải tiến của HashMap, duy trì thứ tự chèn của các cặp khóa-giá trị.
* `TreeMap`: Lưu trữ các cặp key-value theo thứ tự tăng dần của khóa hoặc theo một bộ so sánh được chỉ định. Khi thêm một cặp key-value vào TreeMap, nó sẽ được đặt vào cây theo vị trí thích hợp dựa trên thứ tự sắp xếp.

## 🌍 Resources:
1. [Java Collections Cheat Sheet](https://javaconceptoftheday.com/java-collections-cheat-sheet/) <br>
2. [What are Java Collections?](https://dev.to/educative/what-are-java-collections-get-started-with-the-framework-1j8j) <br>
3. [Collections in Java](https://dev.to/mobolanleadebesin/collections-in-java-5d3g) <br>
