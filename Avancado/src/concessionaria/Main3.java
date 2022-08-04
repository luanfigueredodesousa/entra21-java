package concessionaria;

public class Main3 {
        public static int main (String[]args){
            int small = 4;
            int big = 1;
            int goal = 9;

            int bigUsed = 0;
            int smallUsed = 0;

            for (int i = 1; i >= big; i++) { //pegar a quantidade necessária de big pra chegar em goal
                if (i * 5 <= goal) {
                    bigUsed++;
                }
            }
            smallUsed = goal - (bigUsed * 5);
            if (smallUsed > small) {
                return -1;
            } else {
                return smallUsed;
            }
        }
    }



