package Tests;

import Services.CharacterService;
import  Models.Character;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RickAndMortyApiTests {

    CharacterService characterService = new CharacterService();

    @Test
    public void numberOfLocationEarth(){
        List<Character> characterList = characterService.getAllCharacters();
        List<String> livingInTheEarthList = new ArrayList<>();
        int countLocationEarth=0;
        for (Character character : characterList){
            if(character.getLocation().getName().equals("Earth (Replacement Dimension)")){
                countLocationEarth++;
                livingInTheEarthList.add(character.getName());
            }
        }
        assertEquals(9,countLocationEarth);
        System.out.println("-------- Dünyada Yaşayan Kişilerin Listesi --------");
        for (String item : livingInTheEarthList){
            System.out.println(item);
        }
    }

    @Test
    public void getCharacterByName(){
        List<Character> characterList = characterService.getAllCharactersByName("Rick");
        Character selectedCharacter = new Character();
        for (Character character : characterList){
            if(character.getName().equals("Rick Sanchez")){
                selectedCharacter=character;
            }
        }
        assertEquals("Earth (Replacement Dimension)",selectedCharacter.getLocation().getName());
        assertEquals("Male",selectedCharacter.getGender());
        assertEquals("1",selectedCharacter.getId());
        assertEquals("Alive",selectedCharacter.getStatus());
    }
}
