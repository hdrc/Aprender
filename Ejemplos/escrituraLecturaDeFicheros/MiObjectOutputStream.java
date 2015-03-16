package escrituraLecturaDeFicheros;

import java.io.*;

public class MiObjectOutputStream extends ObjectOutputStream {
	//Sobreescribir el método que crea la cabecera
	protected void writeStreamHeader()throws IOException{
	}	
	
	//Constructores
	public MiObjectOutputStream()throws IOException{
		super();
	}
	public MiObjectOutputStream(OutputStream out)throws IOException{
		super(out);
	}
}
