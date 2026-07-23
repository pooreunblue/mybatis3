package org.example.mybatis3.entity;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private Long id; // null 허용
    private String name;
}
