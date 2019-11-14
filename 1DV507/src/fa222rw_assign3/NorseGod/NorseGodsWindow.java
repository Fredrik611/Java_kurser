package fa222rw_assign3.NorseGod;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class NorseGodsWindow extends Application {
	// Arraylist that keeps track of all the gods and the information about them.
	private ArrayList<NorseGod> norseGods = new ArrayList<NorseGod>();
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) {
		// getting all of the gods from an other method.
		getGods();
		// the list view with all of the gods. 
		ListView<String> godsList = new ListView<>();
		// adding all of the gods
		godsList.getItems().addAll(norseGods.get(0).getName(),norseGods.get(1).getName(),norseGods.get(2).getName(),norseGods.get(3).getName(),norseGods.get(4).getName(),norseGods.get(5).getName());
		// setting a maxWidth of a 100.
		godsList.setMaxWidth(100);
		// Text that the information is going to be put in. 
		Text name = new Text();
		name.setFont(Font.font("Helvetica" , FontWeight.BOLD, 30));
		Text race = new Text();
		race.setFont(Font.font("Helvetica", FontPosture.ITALIC, 20));
		Text desc = new Text();
		desc.setFont(Font.font("Helvetica", FontWeight.NORMAL, 20));
		// a textflow with all of text object in it. 
		TextFlow text = new TextFlow(name, race, desc);
		// with the padding 50 on the right. 
		text.setPadding(new Insets(0,0,0,50));
		// set the max to 400 pixles.
		text.setMaxWidth(400);
		// a scroll pane that sets a scroll on the infromation. 
		ScrollPane scroll = new ScrollPane();
		scroll.setContent(text);
		// Label with the title 
		Label titel = new Label("Norse Gods and other Beings");
		titel.setFont(Font.font("Helvetica" , FontWeight.BOLD, 20));
		// a border pane with the list view and the textflow in it. 
		BorderPane view = new BorderPane();
		view.setTop(titel);
		view.setLeft(godsList);
		view.setCenter(scroll);
		
		// when a item in the list is clicked it sets the name, race and desc in the text objects 
		godsList.getSelectionModel().selectedIndexProperty().addListener(ov -> {
			name.setText(norseGods.get(godsList.getSelectionModel().getSelectedIndex()).getName() + "\r\n");
			race.setText(norseGods.get(godsList.getSelectionModel().getSelectedIndex()).getRace() +"\r\n" );
			desc.setText(norseGods.get(godsList.getSelectionModel().getSelectedIndex()).getDesc());
			});
			// makes a scene and set it to the primarystage and then shows it. 
			Scene scene = new Scene(view, 550, 500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Norse Gods");
			primaryStage.show();
	}
	
	private void getGods() {
		//adds the information to the arraylist.
		norseGods.add(new NorseGod("Thor", "Aesir" ,"In Germanic mythology, Thor is a hammer-wielding god associated with thunder, lightning, storms, oak trees, strength, the protection of mankind, and also hallowing and fertility. Besides Old Norse Þórr, extensions of the god occur in Old English as Þunor, and in Old High German as Donar (runic þonar ᚦᛟᚾᚨᚱ). All forms of the deity stem from a Common Germanic (meaning 'thunder').\r\n" + 
				"\r\n" + 
				"Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, to the tribal expansions of the Migration Period, to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to his popularity." ));
		norseGods.add(new NorseGod("Odin" , "Aesir" , "In Germanic mythology, Odin is a widely revered god. In Norse mythology, from which stems most surviving information about the god, Odin is associated with wisdom, healing, death, royalty, the gallows, knowledge, battle, sorcery, poetry, frenzy, and the runic alphabet, and is the husband of the goddess Frigg. In wider Germanic mythology and paganism, Odin was known in Old English as Wōden, in Old Saxon as Wōdan, and in Old High German as Wuotan or Wōtan, all stemming from the reconstructed Proto-Germanic theonym.\r\n" + 
				"\r\n" + 
				"Odin is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania through the tribal expansions of the Migration Period and the Viking Age. In the modern period, Odin continued to be acknowledged in the rural folklore of Germanic Europe. References to Odin appear in place names throughout regions historically inhabited by the ancient Germanic peoples, and the day of the week Wednesday bears his name in many Germanic languages, including English."));
		norseGods.add(new NorseGod("Loki" , "Giant" , "Loki s a god in Norse mythology. Loki is in some sources the son of Fárbauti and Laufey, and the brother of Helblindi and Býleistr. By the jötunn Angrboða, Loki is the father of Hel, the wolf Fenrir, and the world serpent Jörmungandr. By his wife Sigyn, Loki is the father of Narfi and/or Nari. By the stallion Svaðilfari, Loki is the mother—giving birth in the form of a mare—to the eight-legged horse Sleipnir. In addition, Loki is referred to as the father of Váli in Prose Edda, though this source also refers to Odin as the father of Váli twice, and Váli is found mentioned as a Son of Loki only once.\r\n" + 
				"\r\n" + 
				"Loki's relation with the gods varies by source; Loki sometimes assists the gods and sometimes behaves in a malicious manner towards them. Loki is a shape shifter and in separate incidents he appears in the form of a salmon, a mare, a fly, and possibly an elderly woman named Þökk (Old Norse 'thanks'). Loki's positive relations with the gods end with his role in engineering the death of the god Baldr and Loki is eventually bound by Váli with the entrails of one of his sons. In both the Poetic Edda and the Prose Edda, the goddess Skaði is responsible for placing a serpent above him while he is bound. The serpent drips venom from above him that Sigyn collects into a bowl; however, she must empty the bowl when it is full, and the venom that drips in the meantime causes Loki to writhe in pain, thereby causing earthquakes. With the onset of Ragnarök, Loki is foretold to slip free from his bonds and to fight against the gods among the forces of the jötnar, at which time he will encounter the god Heimdallr and the two will slay each other."));
		norseGods.add(new NorseGod("Heimdallr","Aesir","In Norse mythology, Heimdallr is a god who possesses the resounding horn Gjallarhorn, owns the golden-maned horse Gulltoppr, is called the shining god and the whitest of the gods, has gold teeth, and is the son of Nine Mothers (who may represent personified waves). Heimdallr is attested as possessing foreknowledge, keen eyesight and hearing, and keeps watch for invaders and the onset of Ragnarök while drinking fine mead in his dwelling Himinbjörg, located where the burning rainbow bridge Bifröst meets the sky. Heimdallr is said to be the originator of social classes among humanity and once regained Freyja's treasured possession Brísingamen while doing battle in the shape of a seal with Loki. Heimdallr and Loki are foretold to kill one another during the events of Ragnarök. Heimdallr is additionally referred to as Rig, Hallinskiði, Gullintanni, and Vindlér or Vindhlér.\r\n" + 
				"\r\n" + 
				"Heimdallr is attested in the Poetic Edda, compiled in the 13th century from earlier traditional material; in the Prose Edda and Heimskringla, both written in the 13th century by Snorri Sturluson; in the poetry of skalds; and on an Old Norse runic inscription found in England. Two lines of an otherwise lost poem about the god, Heimdalargaldr, survive. Due to the problematic and enigmatic nature of these attestations, scholars have produced various theories about the nature of the god, including his apparent relation to rams, that he may be a personification of or connected to the world tree Yggdrasil, and potential Indo-European cognates."));
		norseGods.add(new NorseGod("Baldr","Other","Baldr (also Balder, Baldur) is a god in Norse mythology, and a son of the god Odin and the goddess Frigg. He has numerous brothers, such as Thor and Váli.\r\n" + 
				"\r\n" + 
				"In the 12th century, Danish accounts by Saxo Grammaticus and other Danish Latin chroniclers recorded a euhemerized account of his story. Compiled in Iceland in the 13th century, but based on much older Old Norse poetry, the Poetic Edda and the Prose Edda contain numerous references to the death of Baldr as both a great tragedy to the Æsir and a harbinger of Ragnarök.\r\n" + 
				"\r\n" + 
				"According to Gylfaginning, a book of Snorri Sturluson's Prose Edda, Baldr's wife is Nanna and their son is Forseti. In Gylfaginning, Snorri relates that Baldr had the greatest ship to ever be built, named Hringhorni, and that there is no place more beautiful than his hall, Breidablik."));
		norseGods.add(new NorseGod("Freyja","Vair","In Norse mythology, Freyja (/ˈfreɪə/; Old Norse for \"(the) Lady\") is a goddess associated with love, sex, beauty, fertility, gold, seiðr, war, and death. Freyja is the owner of the necklace Brísingamen, rides a chariot pulled by two cats, is accompanied by the boar Hildisvíni, and possesses a cloak of falcon feathers. By her husband Óðr, she is the mother of two daughters, Hnoss and Gersemi. Along with her brother Freyr, her father Njörðr, and her mother (Njörðr's sister, unnamed in sources), she is a member of the Vanir. Stemming from Old Norse Freyja, modern forms of the name include Freya, Freyia, and Freja.\r\n" + 
				"\r\n" + 
				"Freyja rules over her heavenly field Fólkvangr and there receives half of those that die in battle, whereas the other half go to the god Odin's hall, Valhalla. Within Fólkvangr lies her hall, Sessrúmnir. Freyja assists other deities by allowing them to use her feathered cloak, is invoked in matters of fertility and love, and is frequently sought after by powerful jötnar who wish to make her their wife. Freyja's husband, the god Óðr, is frequently absent. She cries tears of red gold for him, and searches for him under assumed names. Freyja has numerous names, including Gefn, Hörn, Mardöll, Sýr, Valfreyja, and Vanadís."));
	}
}
