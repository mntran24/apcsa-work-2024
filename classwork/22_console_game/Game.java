import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Adventurer enemy;
        Adventurer player;
        Scanner inp = new Scanner(System.in);
        System.out.print("\u001b[31m");
        System.out.println("Choose your job/role. Only MyWarrior(mw) and General(g) are currently available. Your enemy will have the same role as you.");
        String rol = inp.nextLine();
        while(!rol.equals("mw")&&!rol.equals("g")){
            System.out.println("Please enter a valid input, mw or g.");
            rol = inp.nextLine();
        }
        System.out.println("Please input your Adventurer's name");
        String name = inp.nextLine();
        System.out.println("Please input your Adventurer's starting HP. If you type a number lower than the recommended starting HP, a default HP will be assigned. Your enemy will have the same starting HP as you.");
        int start_hp = inp.nextInt();
        inp.nextLine();
        if(rol.equals("mw")){
            // the threshold is the recommended starting hp. lower numbers will lead to potentially very short gameplay.
            if(start_hp <= 10){
                player = new MyWarrior(name);
                enemy = new MyWarrior("Genghis Khan");
            }
            else{
                player = new MyWarrior(name,start_hp);
                enemy = new MyWarrior("Genghis Khan",start_hp);
            }
        }
        else{
            if(start_hp <= 75){
                player = new General(name);
                enemy = new General("Genghis Khan");
            }
            else{
                player = new General(name,start_hp);
                enemy = new General("Genghis Khan",start_hp);
            }
        }
        while(player.getHP() > 0 && enemy.getHP() > 0){
            System.out.println("Player: " + player.getName() + " HP: " + player.getHP() + " " + player.getSpecialName() + ": " + player.getSpecial());
            System.out.println("Enemy: " + enemy.getName() + " HP: " + enemy.getHP() + " " + enemy.getSpecialName() + ": " + enemy.getSpecial());
                System.out.println("Choose your move! Type a for attack, su to support self, sp for special attack, or q to quit.");
                String move = inp.nextLine();
                while(!move.equals("a")&&!move.equals("su")&&!move.equals("sp")&&!move.equals("q")){
                    System.out.println("Please enter a valid input, a, su, sp, or q.");
                    move = inp.nextLine();
                }
                if(move.equals("a")){
                    System.out.println(player.attack(enemy));
                }
                else{
                    if(move.equals("su")){
                        System.out.println(player.support());
                    }
                    else{
                        if(move.equals("sp")){
                            System.out.println(player.specialAttack(enemy));
                        }
                        else{
                            return;
                        }
                    }
                }
            if(enemy.getHP() > 0){
                int choice = (int)(Math.random()*3);
                if(choice==0){
                    System.out.println(enemy.attack(player));
                }
                else{
                    if(choice==1){
                        System.out.println(enemy.support());
                    }
                    else{
                        System.out.println(enemy.specialAttack(player));
                    }
                }
            }
        }
        System.out.println("Player: " + player.getName() + " HP: " + player.getHP() + " " + player.getSpecialName() + ": " + player.getSpecial());
        System.out.println("Enemy: " + enemy.getName() + " HP: " + enemy.getHP() + " " + enemy.getSpecialName() + ": " + enemy.getSpecial());
        if(player.getHP()>0){
            System.out.println("The player won!");
        }
        else{
            if(player.getHP()==enemy.getHP()){
                System.out.println("It was a draw!");
            }
            else{
                System.out.println("The player lost :(");
            }
        }
    }
}
