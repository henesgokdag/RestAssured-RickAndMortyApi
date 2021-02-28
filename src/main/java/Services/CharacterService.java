package Services;

import io.restassured.RestAssured;
import Models.Character;
import java.util.List;

public class CharacterService {
    public List<Character> getAllCharacters() {
        List<Character> characterList = RestAssured.given()
                .when()
                .get("https://rickandmortyapi.com/api/character")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("results", Character.class);
        return characterList;
    }

    public List<Character> getAllCharactersByName(String name){
        List<Character> characterList = RestAssured.given()
                .when()
                .get("https://rickandmortyapi.com/api/character?name="+name)
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("results", Character.class);
        return characterList;
    }
}
