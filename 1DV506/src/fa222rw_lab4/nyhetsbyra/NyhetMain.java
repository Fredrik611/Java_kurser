/**
 * 
 */
package fa222rw_lab4.nyhetsbyra;

import java.io.File;
import java.util.Iterator;

/**
 * @author Fredrik
 *
 */
public class NyhetMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// tidningar skapas 
		Tidning Aftonbladet = new Tidning("Aftonbladet");
		Tidning DN = new Tidning("DN");
		Tidning SvenskaDagbladet = new Tidning("SvenskaDagbladet");
		
		// Dessa skapar en NyhetsByra
		NyhetsByra TT = new NyhetsByra();
		TT.AddTidning(Aftonbladet);
		TT.AddTidning(DN);
		TT.AddTidning(SvenskaDagbladet);
		
		// Det skapas några nyheter
		File fil1 = new File("c\\temp\\historyOfProgramming.txt");
		TT.AddNyhet(Aftonbladet.skapaNyhet(fil1));
		
		File fil2 = new File("c\\temp\\helTal.txt");
		TT.AddNyhet(DN.skapaNyhet(fil2));
		
		File fil3 = new File("c\\temp\\historyOfProgramming.txt");
		TT.AddNyhet(DN.skapaNyhet(fil3));
		
		System.out.println("-------------------");
		System.out.println("Nyheter som SvenskaDagbladet har fått tillgång till");
		// Nyheter som Svenkadagbladet har
		
		Iterator<Nyhet> iterator = SvenskaDagbladet.iteratorNyheter();
		while (iterator.hasNext()) {
			Nyhet temp = iterator.next();
			System.out.println("Nyhets id: "+ temp.getId() + " skaparens id: " + temp.getTidningid() );
		}
		System.out.println("-------------------");
		System.out.println("TT har ett samarbete med dessa tidningarna: ");
		// visar vilka som är med i nyhetsbyran
		Iterator<Tidning> tidningsiterator = TT.iteratorTidning();
		while (tidningsiterator.hasNext()) {
			Tidning tidningTemp = tidningsiterator.next();
			System.out.println("Tidningens ID: " + tidningTemp.getId() + " Tidningens namn: " + tidningTemp.getNamn());
		}
		
	
		
		
	}

}
