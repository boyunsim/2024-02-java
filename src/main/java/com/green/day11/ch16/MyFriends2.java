package com.green.day11.ch16;

public class MyFriends2 {
    public static void main(String[] args) {
        UnivFriend2[] arr1 = new UnivFriend2[3];
        CompFriend2[] arr2 = new CompFriend2[3];

        //다형성: 다양한 형태가 될 수 있는 성질 >> 변수타입은 다른데 저장할 수 있다.
        UnivFriend2 obj1 = new UnivFriend2("Lee", "Computer", "010-1111-1111"); //이때까지 배운바로는 UnivFreind2 객체의 주소값만 담을 수 있는 obj1 이지만
        Friends f1 = obj1; //타입이 다른데도 불구하고 문제가 생기지 않는다 >> 다형성(상속관계에서만 가능)
        Friends f2 = new UnivFriend2("SEO", "Electronics", "010-2222-2222");
        //Friends f2가 의미하는 바는 Friends객체 주소값을 담을 수 있는 f2 레퍼런스 변수
        //이제는 + Friend를 상속받은 객체의 주소값도 담을 수 있다.
        f1.showInfo();

        Friends[] arr3 = new Friends[10];
        //UnivFriend2, CompFreind2, Friends 객체 주소값을 모두 담을 수 있는 배열❗❗❗❗ >> 다른 객체의 주소값을 담아도 각방의 타입은 Friends
        arr3[0] = obj1;
        arr3[1] = f2;
        arr3[2] = new CompFriend2("YOON","R&D 1","02-123-9999");
        arr3[3] = new CompFriend2("PARK","R&D 2","02-333-5555");

        arr3[0].showInfo();
        //arr3[4].showInfo(); >>NullPointerException

        //반복문으로 arr3에 객체주소값이 있는 친구들만 showInfo() 메소드 호출
        System.out.println("=========|=========");

        for(Friends item : arr3) {
            if(item != null) {
                item.showInfo();
                System.out.println();
            }
        }
        // main 메소드는 수정 금지❗❗❗❗❗
    }
}

class Friends {
    protected String name;
    protected String phone;

    Friends(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("전화: " + phone);
    }
}

//이름, 전화, 전공값을 초기화할 수 있는 생성자 작성
class UnivFriend2 extends Friends{ //대학친구
    private String major;

    UnivFriend2 (String name, String major, String phone) {
        super(name, phone);
        this.major = major;
    }

    public void IntroUnivFriend () {
        System.out.printf("대학 친구 이름은 %s, 전공은 %s, 폰기종은 %s입니다\n", name, major, phone);
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("전공: " + major);
    }
}

class CompFriend2 extends Friends{ //직장동료
    private String department;

    CompFriend2 (String name, String department, String phone) {
        super(name, phone);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("부서: " + department);
    }

}