package org.example.mybatis3.entity;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id; // null 허용
    private String name;
}
