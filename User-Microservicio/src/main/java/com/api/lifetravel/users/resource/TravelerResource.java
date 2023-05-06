package com.api.lifetravel.users.resource;
import lombok.*;

import java.util.List;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class TravelerResource {
    private Long id;
    private String name;
    private String email;
    private String phone;

}