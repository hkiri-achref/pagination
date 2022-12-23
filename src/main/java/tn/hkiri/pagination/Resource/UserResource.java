package tn.hkiri.pagination.Resource;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.hkiri.pagination.entity.HttpResponse;
import tn.hkiri.pagination.service.UserService;

import java.util.Optional;

import static java.time.LocalTime.now;
import static java.util.Map.of;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserResource {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<HttpResponse> getUsers(@RequestParam Optional<String> name,
                                                 @RequestParam Optional<Integer> page,
                                                 @RequestParam Optional<Integer> size
                                                ) {


        return ResponseEntity.ok().body(
                HttpResponse.builder()
                        .timeStamp(now().toString())
                        .statusCode(HttpStatus.OK.value())
                        .data(of("page",userService.getUsers(name.orElse(""),page.orElse(0),size.orElse(10))))
                        .httpStatus(HttpStatus.OK).build()
        );

    }


}
