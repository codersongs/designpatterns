package com.codersongs.designpatterns.decorator;

public class SkillW extends Skills{
    private String skillName;
    public SkillW(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能W：" + this.skillName);
        super.learnSkills();
    }
}
