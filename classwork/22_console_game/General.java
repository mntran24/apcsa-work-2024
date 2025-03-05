public class General extends Adventurer{
    private int capability,max_capability;
    public General(String name, int hp){
        super(name, hp);
        max_capability = 50;
        capability = 30;
    }
    public General(String name){
        this(name,100);
    }
    
    public String getSpecialName(){
        return "functional capability";
    }
    public int getSpecial(){
        return capability;
    }
    public void setSpecial(int n){
        capability = n;
    }
    public int getSpecialMax(){
        return max_capability;
    }
    public String attack(Adventurer other){
        if (this.getSpecial() <= 0){
            return "Not enough " + this.getSpecialName() + ", must refuel by supporting self.";
        }
        int damage = 10 + (int)(Math.random()*20);
        other.applyDamage(damage);
        this.restoreSpecial(5);
        this.setHP(this.getHP() - 10);
        return this.toString() + " dealt a " + damage + " HP blow to " + other.toString() + "! They've just gained 5 functional capabilities but lost 10 HP.";
    }
    public String support(Adventurer other){
        if (this.getSpecial() <= 0){
            return "Not enough " + this.getSpecialName() + ", must refuel by supporting self.";
        }
        this.setSpecial(this.getSpecial() - 20);
        return this.toString() + " just donated " + other.restoreSpecial(20) + " " + other.getSpecialName() + " to " + other.toString() + "!";
    }
    public String support(){
        this.setHP(this.getHP() + 10);
        int res = (int)(Math.random()*9) + 1;
        return this.toString() + " has just regained " + this.restoreSpecial(res) + " " + this.getSpecialName() + " and 10 HP.";
    }
    public String specialAttack(Adventurer other){
        if (this.getSpecial() <= 0){
            return "Not enough " + this.getSpecialName() + ", must refuel by supporting self.";
        }
        int att = 10 + (int)(Math.random()*10);
        int dam = 10 + (int)(Math.random()*40);
        int lost = dam / 2;
        other.applyDamage(dam);
        other.setSpecial(other.getSpecial() - att);
        this.setHP(this.getHP() - lost);
        this.restoreSpecial(5);
        return this.toString() + " dealt a special " + dam + " HP and " + att + " " + other.getSpecialName() + " blow to " + other.toString() + "! They've just gained 5 functional capabilities but lost " + lost + " HP.";
    }
}