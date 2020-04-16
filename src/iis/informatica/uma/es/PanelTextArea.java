package iis.informatica.uma.es;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelTextArea extends JPanel {

	final static String quijote = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho\r\n" + 
			"tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín\r\n" + 
			"flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las\r\n" + 
			"más noches, duelos y quebrantos los sábados, lentejas los viernes, algún palomino\r\n" + 
			"de añadidura los domingos, consumían las tres partes de su hacienda. El resto\r\n" + 
			"della concluían sayo de velarte, calzas de velludo para las fiestas con sus\r\n" + 
			"pantuflos de lo mismo, los días de entre semana se honraba con su vellori de\r\n" + 
			"lo más fino. Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina\r\n" + 
			"que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba\r\n" + 
			"el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los\r\n" + 
			"cincuenta años, era de complexión recia, seco de carnes, enjuto de rostro;\r\n" + 
			"gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre\r\n" + 
			"de Quijada o Quesada (que en esto hay alguna diferencia en los autores que\r\n" + 
			"deste caso escriben), aunque por conjeturas verosímiles se deja entender que\r\n" + 
			"se llama Quijana; pero esto importa poco a nuestro cuento; basta que en la\r\n" + 
			"narración dél no se salga un punto de la verdad.\r\n" + 
			"Es, pues, de saber, que este sobredicho hidalgo, los ratos que estaba ocioso\r\n" + 
			"(que eran los más del año) se daba a leer libros de caballerías con tanta afición\r\n" + 
			"y gusto, que olvidó casi de todo punto el ejercicio de la caza, y aun la administración\r\n" + 
			"de su hacienda; y llegó a tanto su curiosidad y desatino en esto, que vendió muchas\r\n" + 
			"hanegas de tierra de sembradura, para comprar libros de caballerías en que\r\n" + 
			"leer; y así llevó a su casa todos cuantos pudo haber dellos; y de todos ningunos\r\n" + 
			"le parecían tan bien como los que compuso el famoso Feliciano de Silva: porque\r\n" + 
			"la claridad de su prosa, y aquellas intrincadas razones suyas, le parecían\r\n" + 
			"de perlas; y más cuando llegaba a leer aquellos requiebros y cartas de desafío,\r\n" + 
			"donde en muchas partes hallaba escrito: la razón de la sinrazón que a mi\r\n" + 
			"razón se hace, de tal manera mi razón enflaquece, que con razón me quejo de\r\n" + 
			"la vuestra fermosura, y también cuando leía: los altos cielos que de\r\n" + 
			"vuestra divinidad divinamente con las estrellas se fortifican, y os hacen merecedora\r\n" + 
			"del merecimiento que merece la vuestra grandeza. Con estas y semejantes\r\n" + 
			"razones perdía el pobre caballero el juicio, y desvelábase por entenderlas,\r\n" + 
			"y desentrañarles el sentido, que no se lo sacara, ni las entendiera el mismo\r\n" + 
			"Aristóteles, si resucitara para sólo ello. No estaba muy bien con las heridas\r\n" + 
			"que don Belianis daba y recibía, porque se imaginaba que por grandes maestros\r\n" + 
			"que le hubiesen curado, no dejaría de tener el rostro y todo el cuerpo lleno\r\n" + 
			"de cicatrices y señales; pero con todo alababa en su autor aquel acabar su\r\n" + 
			"libro con la promesa de aquella inacabable aventura, y muchas veces le vino\r\n" + 
			"deseo de tomar la pluma, y darle fin al pie de la letra como allí se promete;\r\n" + 
			"y sin duda alguna lo hiciera, y aun saliera con ello, si otros mayores y continuos\r\n" + 
			"pensamientos no se lo estorbaran.";
	
	JTextArea texto;
	
	public PanelTextArea() {
		texto = new JTextArea(20,30);
		texto.setText(quijote);
//		texto.setLineWrap(true);
//		texto.setWrapStyleWord(true);
		JScrollPane scrollP = new JScrollPane(texto);
		add(scrollP);
	}
	
}
