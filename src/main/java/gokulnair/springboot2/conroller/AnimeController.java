package gokulnair.springboot2.conroller;


import gokulnair.springboot2.domain.Anime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//the difference between @Controller annotation and @RestController is that we cannot send views as response
@RestController
@RequestMapping("anime")
public class AnimeController {

    @RequestMapping()
    public List<Anime>ListAll(){
        return Arrays.asList(new Anime("Tokyo Goul"),new Anime("Dragon Ball"));
    }
}
