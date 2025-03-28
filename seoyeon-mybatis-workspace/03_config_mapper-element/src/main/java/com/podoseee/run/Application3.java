package com.podoseee.run;

import com.podoseee.dto.OrderDto;
import com.podoseee.dto.OrderMenuDto;
import com.podoseee.service.MenuService;

import java.util.List;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        // 주문번호로 주문정보(주문번호,주문일,주문시간,총가격, 주문메뉴(메뉴번호,주문수량)들) 검색
        Scanner sc = new Scanner(System.in);
        System.out.print("주문번호: ");
        int code = sc.nextInt();

        OrderDto order = new MenuService().testResultMapcollection(code);
        System.out.println(order);

        List<OrderMenuDto> orderMenuList = order.getOrderMenuList();
        for(OrderMenuDto orderMenu : orderMenuList){
            System.out.println(orderMenu);
        }
    }
}
