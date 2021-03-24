/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.test;

import com.fu.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thanh Vi
 */
public class MathUtilityTest {

    //ta sẽ viết những loại code ở đây để test những hàm chính getFactorial() bên MathUtility chạy có đúng k
    //viết code để test code chính
    //đúng sai ở đây chusg tôi dùng màu sắt xanh đỏ
    @Test //biến hàm thường thành hàm main
    //Shift F6 để chạy
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        long expected = 120;//tui hy vong tra ve 120
        int n = 5; //tui muon tinh 5!
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        //nếu khớp thì màu xah, sai lệnh màu đỏ
        //màu xanh xuất hiện khi tất cả các tình huống xài hàm 
        //test case đều xanh
        //màu đỏ xuất hiện khi có ít nhất 1 thằng đỏ, 1 test case sai, tất cả bỏ
        //ẩn ý: hàm đã đúng thì phải đúng cho tất cả các tình huống mình test

        assertEquals(720, MathUtility.getFactorial(6));//6! có đúng là 720 k ?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //khi màu đỏ thì có 2 tình huống: hàm bạn tính sai, k như kì vọng
        //                                hàm tính đúng, bnaj kì vọng sai

    }

    //ta sẽ đi test hàm có ném ra ngoại lệ như thiết kế hay k ?
    //hàm đc thiết kế rằng: đưa tham số n 0...20 -> tính đúng n!
    //hàm đc thiết kế rằng: đưa tham số cà chớn, < 0 > 20 ném ra ngoại lệ cảnh báo sai tham số, ngoài miền giá trị tính !
    //chốt: đưa tham số cà chớn phải ném về ngoại lệ nếu thấy đúng là ném về ngoại lệ khi đưa tham số cà chớn 
    //thì kết luận hàm đúng, XANH
    //thấy ngoại lệ khi đưa n cà chớn. mừng rơi nước mắt vì hàm chạy đúg như thiết kế
    //ngoai lệ xuất hiện khi 5! thì là hàm đúng mà
    //ngoại lệ thì k phải là giá trị để so sánh kiểu assertEquals()
    //vậy ta phải dùng kiểu khác !
    // @Test(expected = Exception.class) // k nên bắt mức cao nhất, mặc dù k sai
    
    
    @Test(expected = IllegalArgumentException.class)
    public void getFactorialGivenWrongArgumentThrowsWxception() {
        MathUtility.getFactorial(40);
        MathUtility.getFactorial(-40);
        //2 thằng này phải ném về ngoại lệ IllegalArgumentException
    }
    
    

}
