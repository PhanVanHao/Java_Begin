
# Types : 

• boolean: true hoặc false
• int: số nguyên (0, 1, -47)
• double: số thực (3.14, 1.0, -2.1)
• String: văn bản (“hello”, “example”)

# Variables
• Biến 
Cú pháp : 
*Type : Name;*
Là đối tượng thay đổi thường xuyên trong chương trình , dùng để lưu trữ dữ liệu để xử lý hoặc in

# Operator

- Phép gán : =
- Phép cộng : +
- Phép trừ : -
- Phép nhân : *
- Phép chia : /
- Phép chia lấy phần dư(mod): %
- Thứ tự thực hiện phép tính 
+ Trong Ngoặc
+ Nhân Chia
+ Cộng Trừ


# Methods

1- Modifier trong Java

Có hai loại modifier trong java: access modifiers và non-access modifiers.

Các access modifiers trong java xác định độ truy cập (Phạm vi) vào dữ liệu của của các trường, phương thức, cấu tử hoặc class.

Có 4 kiểu của java access modifiers:

private
(Mặc định)
protected
public
Và có một vài non-access modifiers chẳng hạn static, abstract, synchronized, native, volatile, transient, v.v..
2 . Access modifiers


| Access Modifier | Truy cập bên trong class? | Truy cập bên trong package? | Truy cập bên ngoài package bởi class con? | Truy cập bên ngoài class và không thuộc class con? |
|:---------------:|:-------------------------:|:---------------------------:|:-----------------------------------------:|:--------------------------------------------------:|
|     private     |             Y             |                             |                                           |                                                    |
|     Mặc định    |             Y             |              Y              |                                           |                                                    |
|    protected    |             Y             |              Y              |                     Y                     |                                                    |
|      public     |             Y             |              Y              |                     Y                     |                          Y                         |



3- private access modifier

private access modifier chỉ cho phép truy cập trong nội bộ một class.
Bạn không thể truy cập vào trường private từ bên ngoài class định nghĩa trường private đó. Java sẽ thông báo lỗi tại thời điểm biên dịch class

4- private constructor
Nếu bạn tạo một class, và có một cấu tử private, bạn không thể tạo một đối tượng của class này từ cấu tử private đó từ bên ngoài class này. 
5- Access modifier mặc định

Trong trường hợp bạn khai báo một trường, method, hoặc cấu tử (constructor), class, .. mà không ghi rõ ràng access modifier, điều đó có nghĩa là nó là access modifier mặc định. 
Phạm vi truy cập của access modifier mặc định là trong nội bộ package.
Trong cùng một package bạn có thể truy cập vào các thành viên có access modifier mặc định.
Và không được phép truy cập bên ngoài package, kể cả trong class con.
Chú ý:

Với Interface khi bạn khai báo một trường (Field) hoặc một phương thức (Method) bạn luôn phải khai báo là public hoặc để mặc định, nhưng Java luôn hiểu đó là public.

6- protected access modifier

protected access modifier có thể truy cập bên trong package, hoặc bên ngoài package nhưng phải thông qua tính kế thừa. 

 
protected access modifier chỉ áp dụng cho field, method và constructor. Nó không thể áp dụng cho class (class, interface, enum, annotation).

7- public access modifier

public access modifier là mạnh mẽ nhất và có thể truy cập ở mọi nơi. Nó có phạm vi truy cập rộng nhất so với các modifier khác.

8- Ghi đè method

Bạn có thể ghi đè một method của class cha với một method cùng tên cùng tham số tại class con, tuy nhiên bạn không được phép làm hạn chế phạm vi truy cập của method này.

Có tham khảo từ nguồn : http://o7planning.org/vi/10319/access-modifier-trong-java




# Operator logic
Toán tử quan hệ trong Java (A=10,B=20)


| Toán Tử |                                                 Miêu tả                                                 |          Ví dụ          |
|:-------:|:-------------------------------------------------------------------------------------------------------:|:-----------------------:|
|    ==   |       Kiểm tra nếu giá trị của hai toán hạng có cân bằng hay không, nếu có thì điều kiện là true.       | (A == B) là không true. |
|    !=   |   Kiểm tra nếu giá trị hai toán hạng là cân bằng hay không, nếu không cân bằng, thì điều kiện là true   |    (A != B) là true.    |
|    >    |      Kiểm tra nếu toán hạng trái có lớn hơn toán hạng phải hay không, nếu có thì điều kiện là true      |  (A > B) là không true. |
|    <    |      Kiểm tra nếu toán hạng phải có lớn hơn toán hạng trái hay không, nếu có thì điều kiện là true      |     (A < B) là true.    |
|    >=   | Kiểm tra nếu toán hạng trái có lớn hơn hoặc bằng toán hạng phải hay không, nếu có thì điều kiện là true | (A >= B) là không true. |
|    <=   | Kiểm tra nếu toán hạng phải có lớn hơn hoặc bằng toán hạng trái hay không, nếu có thì điều kiện là true |    (A <= B) là true.    |


Toán tử thao tác bit trong Java
với 
a = 0011 1100
b = 0000 1101


| Toán Tử |                                                 Miêu tả                                                 |          Ví dụ          |
|:-------:|:-------------------------------------------------------------------------------------------------------:|:-----------------------:|
|    ==   |       Kiểm tra nếu giá trị của hai toán hạng có cân bằng hay không, nếu có thì điều kiện là true.       | (A == B) là không true. |
|    !=   |   Kiểm tra nếu giá trị hai toán hạng là cân bằng hay không, nếu không cân bằng, thì điều kiện là true   |    (A != B) là true.    |
|    >    |      Kiểm tra nếu toán hạng trái có lớn hơn toán hạng phải hay không, nếu có thì điều kiện là true      |  (A > B) là không true. |
|    <    |      Kiểm tra nếu toán hạng phải có lớn hơn toán hạng trái hay không, nếu có thì điều kiện là true      |     (A < B) là true.    |
|    >=   | Kiểm tra nếu toán hạng trái có lớn hơn hoặc bằng toán hạng phải hay không, nếu có thì điều kiện là true | (A >= B) là không true. |


Toán tử logic trong Java
Giả sử biến A giữ true và biến B giữ false thì khi đó:


| Toán Tử |                                                                     Miêu tả                                                                     |        Ví dụ       |
|:-------:|:-----------------------------------------------------------------------------------------------------------------------------------------------:|:------------------:|
|    &&   |                                Toán tử Và logic. Nếu cả hai toán hạng là khác không, thì khi đó điều kiện là true                               | (A && B) là false. |
|    ||   |                                   Toán tử Hoặc logic. Nếu một trong hai toán tử khác 0, thì điều kiện là true                                   |  (A || B) là true. |
|    !    | Toán tử Phủ định logic. Sử dụng để đảo ngược lại trạng thái logic của toán hạng đó. Nếu điều kiện toán hạng là true thì phủ định nó sẽ là false | !(A && B) là true. |



# If/ If Else
Cú pháp:
Cú pháp của một lệnh if…else trong Java là:

if(Bieu_thuc_Boolean){
   //Thuc thi khi bieu thuc Boolean la true
}else{
   //Thuc thi khi bieu thuc Boolean la false
}
