package Services;

import io.restassured.RestAssured;
import Models.Character;
import java.util.List;

public class CharacterService extends BaseService {
    public List<Character> getAllCharacters() {
        List<Character> characterList = setupRequestSpecification()
                .when()
                .get("/character")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("results", Character.class);
        return characterList;
    }

    public List<Character> getAllCharactersByName(String name){
        List<Character> characterList = setupRequestSpecification()
                .param("name",name)
                .when()
                .get("/character")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("results", Character.class);
        return characterList;
    }
}
