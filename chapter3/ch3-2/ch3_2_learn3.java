public class ch3_2_learn3 {
    public static void main(String[] args) {
        int su1 = -1;
        if(10 <= su1){// 첫 번쨰 if문
            System.out.println("첫 번쨰 if문 조건을 만족한 경우");
            if(15 <= su1){// 두 번쨰 if문
                System.out.println("두 번쨰 if문 조건을 만족한 경우");
            }
            else{//두 번째 if의 else
                System.out.println("두 번쨰 if문 조건을 만족하지 못한경우");
            }
        }
        else {// 첫 번쨰 if의 else
            if(0 <= su1 && su1 <= 9){// else안에 있는 if
                System.out.println("else 안에있는 if문 조건을 만족한 경우");
            }
            else{// else안에 있는 if의 else
                System.out.println("else 안에있는 if문 조건을 만족하지 못한경우");
                // -1은 첫번째 if에서 조건을 만족하지 못했기 때문에 else로 이동
                // else 안에 있는 if에서도 조건을 만족하지 못했기 때문에 else로 이동
            }
        }
    }
}
