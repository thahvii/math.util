/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.main;

import com.fu.mathutil.MathUtility;

/**
 *
 * @author Thanh Vi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muốn test xem 5! có bằng 120 k??
        long expected = 120; // tui hy vọng 120 là giá trị trả về
        int n = 5; ////nếu tui tính 5!
        long actual = MathUtility.getFactorial(n);
        //actual : cái value hàm thwucj sự trả về
        //ta đi so sánh = mắt để xem hàm chạy dung hay k
        System.out.println("5!: Expected: " + expected
                + "; Actual: " + actual);

        //tình huống test số 2, 0! xem sao ?
        //TÌNH HUỐNG TEST, TÌNH HUỐNG SÀI, GỌI LÀ TEST CASE
        n = 0; //tui muốn tính 0!
        expected = 1; //hy vọng nhận về 1
        actual = MathUtility.getFactorial(n);//còn thực tế là
        //dùng mắt luận kết quả
        System.out.println("5!: Expected: " + expected
                + "; Actual: " + actual);

//        System.out.println("Hello GitHub");
//        System.out.println("This is 1st upload connects to remote GitHub server");
    }

}
//Trong quy trình lập trình chuyên nghiệp / ở acsc công ty, đặc biệt làm cho JP
//mọi hàm/class bạn viết ra đều được test kĩ càng trước khi ghép nó vào các cụm tính nawg, và ghép với UI, Back-end
//Làm sao đẻ test các hàm, các class
//Dân dev có nhiều cách
//1. Cách 1: sout(kêt quả xử lí của hàm)
//2. Cách 2: JOptionPane(pop-up lên kết quả xử lí hàm) bên Java Desktop
//3. Cách 3: Ghi vào LOG file trong môn Java Web, hay in kết quả xử lí ra 1 trang web tạm nào đó
//Với 3 cách này, ta gọi hàm, nhìn kết quả trả về của hàm, ACTUAL VALUE và ra ngầm so sánh với các kết quả mà ta tự tính toán
//trước đó khi chưa gọi hàm - ta gọi là GIÁ TRỊ KÌ VỌNG - EXPECTED VALUE 
//nếu EXPECTED VALUE == ACTUAL VALUE (thực tế à kì vọng khớp nhau)
//Á ĐÙ, hàm chạy đúng
//nếu k bằng, Á ĐÙ, hàm này sai
//3 cách trên đòi hỏi dev phải dùng mắt để luận kết quả đúng sai  

//nếu nhiều test case cần phải test, ta rất dễ bỏ sót, nhìn sai kết quả
//TEST KHI CODE VỪA MỚI XONG TỪNG HÀM GỌI LÀ UNIT TEST
//CÒN CÁCH XỊN XÒ THỨ 4
//TA KHÔNG CẦN NHÌN = MẮT TỪNG TRƯỜNG HỢP SỬ DỤNG HÀM
//TA NHỜ MÁY SO SÁNH GIÙM ACTUAL VỚI EXPECTED LUÔN
//VÀ NẾU TẤT CẢ CÁC TÌNH HUỐNG ĐỀU KHỚP, BẰNG NHAU, NÉM RA 1 MÀU XANH
//NẾU HẦU HẾT ĐỀU KHỚP, CHỈ CÓ ÍT NHẤT 1 CÁI KHÔNG KHỚP (HÀM KHÔNG ỔN ĐỊNH)
//NÉM RA MÀU ĐỎ --> CẢNH BÁO DÂN DEV CÓ TRỤC TRẶC
//VẬY LÚC NÀY TA CHỈ NHÌN MÀU LÀ ĐỦ, KHÔNG CẦN LUẬN TỪNG KẾT QUẢ
//kĩ thuật này gọi là test driven development + test automation  (tự động hóa việc test)
//vừa viết code vừa viết test 
//muốn làm đc điều này ta cần thêm thư viện phụ trợ để tung ra màu
//thư viện này đều có tương ứng ở các ngôn ngữ lập trình
//JAVA: JUnit, TESTNG...
//C#: NUnit, xUnit, MSTest
//PHP : PHPUnit
//...
