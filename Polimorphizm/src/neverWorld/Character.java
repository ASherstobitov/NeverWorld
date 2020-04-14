package neverWorld;

import neverWorld.Exceptions.NeverWorldException;
import neverWorld.Exceptions.WrongDamageExceprion;
import neverWorld.Exceptions.WrongHpException;

import java.lang.invoke.WrongMethodTypeException;

public abstract class Character {
    private String name;
    private int healthPoints;
    private double damagePerSecond;
    private String characterType;

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        if (characterType.equals("DD") || characterType.equals("H") ||
                characterType.equals("T")|| characterType.equals("B")) {
            this.characterType = characterType;
        } else
            throw new WrongMethodTypeException();

    }


    public double getDamagePerSecond() {
        return damagePerSecond;
    }

    public void setDamagePerSecond(double damagePerSecond) {
        if (damagePerSecond < 0) {
            throw new WrongDamageExceprion();
        }
        this.damagePerSecond = damagePerSecond;
    }


    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (healthPoints < 0) {
            throw new WrongHpException();
        }
        this.healthPoints = healthPoints;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 10 || name.length() > 15) {
            throw new NeverWorldException("wrong length");
        }
        this.name = name;
    }

}
