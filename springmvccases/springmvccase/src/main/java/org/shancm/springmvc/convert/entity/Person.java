package org.shancm.springmvc.convert.entity;

import org.springframework.stereotype.Component;

/**
 * @author shancm
 * @pachage org.shancm.springmvc.convert.entity
 * @description:
 * @date 2018/6/12
 */
@Component

public class Person {
    private Long mob;
    private Integer age;

    public Long getMob() {
        return mob;
    }

    public void setMob(Long mob) {
        this.mob = mob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "mob=" + mob +
                ", age=" + age +
                '}';
    }
}
