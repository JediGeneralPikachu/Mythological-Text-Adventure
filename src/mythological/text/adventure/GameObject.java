/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythological.text.adventure;
import java.lang.String;
/**
 *
 * @author Raymond
 */
public class GameObject {
    protected String name,RPGclass,size,weight,armortype;
    protected int health,exp,level,damage,armor;
    
    public String returnName()
    {     
        return name;
    }
    
    public String returnRPGClass()
    {     
        return RPGclass;
    }
    
    public String returnSize()
    {     
        return size;
    }    
    
    public String returnWeight()
    {     
        return weight;
    }
    
    public String returnArmorType()
    {     
        return armortype;
    }
    
    public int returnHealth()
    {     
        return health;
    }
    
    public int returnEXP()
    {     
        return exp;
    }
    
    public int returnLevel()
    {
        return level;
    }
    
    public int returnDamage()
    {
        return damage;
    }
    
    public int returnArmor()
    {
        return armor;
    }
}
