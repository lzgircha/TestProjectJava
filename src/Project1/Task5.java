package Project1;

public class Task5 {
    //5)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array
    public static void main(String[] args) {
        int [][]num= {{2,5,3,8},
                {30,47,109,3},
                {4,28,71,16}
        };
        int sumE=0;
        int sumO=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(num[i][j]%2 ==0) {
                    sumE = sumE + num[i][j];
                }else
                {
                    sumO=sumO + num [i][j];
                }
            }
            System.out.println("Sum of Even numbers: "+sumE);
            System.out.println("Sum of Odd numbers: "+sumO);
        }

        }

        }


