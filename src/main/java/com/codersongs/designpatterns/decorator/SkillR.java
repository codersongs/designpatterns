package com.codersongs.designpatterns.decorator;

public class SkillR extends Skills{
    private String skillName;

    public SkillR(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能:" + skillName);
        super.learnSkills();
    }
}
