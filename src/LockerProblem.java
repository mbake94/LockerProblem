/*
input:

create an array to type boolean isLockerOpen to 100

process:
for (i is 1, and as long as i <= the longth of isLockerOpen, increment i by 1
    for j is i - 1, and as long as j is < the length of isLockerOpen, j = j + 1
        isLockerOpen[j] = NOT isLockerOpen
    for (i is 0, and as long as i is less than the length of isLockerOpen, increment i by 1
        if (isLockerOpen[i] equals true, // if the locker is open
            print the locker number

output:
locker #1 is open
locker #4 is open
locker #9 is open
locker #16 is open
locker #25 is open
locker #36 is open
locker #49 is open
locker #64 is open
locker #81 is open
locker #100 is open
 */
public class LockerProblem {
    public static void main(String[] args) {
        boolean[] isLockerOpen = new boolean[100];

        for (int i = 1; i <= isLockerOpen.length; i++) {
            for (int j = i - 1; j < isLockerOpen.length; j += i) {
                isLockerOpen[j] = !isLockerOpen[j];
            }
        }
                for (int i = 0; i < isLockerOpen.length; i++){
                    if (isLockerOpen[i] == true){
                        System.out.println("locker #" + (i+1) + " is open");
                    }
        }
    }
}
