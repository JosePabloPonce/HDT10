import java.util.ArrayList;

//https://github.com/Zeku87/Grafo-Java Implementacion de clase

/*
 * Cada instancia a esta clase representa cada vertice
 * Cada vertice tiene asociado una etiqueta
 * Por tanto, la existencia de esta no permite v�rtices duplicados
 * El array de lista vecindad contiene las aristas incidentes al v�rtice
*/


public class Vertice
{
 
    private ArrayList<Arista> vecindad;
    private String etiqueta;

    public Vertice (String etiqueta)
    {
	this.etiqueta = etiqueta;
	this.vecindad = new ArrayList<Arista>();
    }

    /**
     * A�ade un objeto Arista al array de lista vecindad
     * si y solo este no est� contenido en dicho array de lista 
     * @param arista. Objeto a a�adir
     */
    public void insertarVecino(Arista arista)
    {
	if( !this.vecindad.contains(arista))
	    this.vecindad.add(arista);
    }

    /**
     * Comprueba si la arista incide en este vertice
     * @param arista. Objeto a evaluar
     * @return true. Si y solo si el objeto esta contenido en el array de lista vecindad
     */
    public boolean contieneUnVecino(Arista arista)
    {
	return this.vecindad.contains(arista);
    }

    /**
     * @param indice. Indica la posicion a extraer
     * @return Arista. La arista apuntada por el �ndice en el array de lista vecindad
     */
    public Arista getVecino(int indice)
    {
	return this.vecindad.get(indice);
    }

    /**
     * Se elimina una arista del array de lista vecindad mediante posici�n
     * @param indice. Indica la posicion a eliminar
     * @return Arista. La Arista que ha sido eliminada del array de lista vecindad
     */
    public Arista eliminarVecino(int indice)
    {
	return this.vecindad.remove(indice);
    }


    /**
     * Se elimina el objeto Arista del array de lista vecindad mediante
     * el identificando la referencia del objeto Arista
     * @param arista. indice el objeto Arista a eliminar
     */
    public void eliminarVecino(Arista arista)
    {
	this.vecindad.remove(arista);
    }

    /**
     * @return int. Se devuelve el n�mero de aristas incidentes (o vecinos) 
     * tiene el v�rtice en el array de lista vecindad
     */
    public int getContarVecinos()
    {
	return this.vecindad.size();
    }

    /**
     * @return String. Devuelve el valor de la cadena etiqueta
     */
    public String getEtiqueta()
    {
	return this.etiqueta;
    }

    /**
     * Se comprueba si vertice2 es un objeto de tipo Vertice
     * En tal caso podemos convertirlo de Object a Vertice
     * Y por �ltimo evaluamos si contiene el mismo valor que el objeto vertice actual
     * Para ello las etiquetas deben coincidir(son �nicas para cada objeto Vertice) 
     * @param vertice2. Objeto que comparamos con el vertice para 
     * evaluar si son el mismo objeto
     * @return true. Efectivamente son el mismo objeto
     */
    public boolean equals(Object vertice2)
    {
	if( !(vertice2 instanceof Vertice))
	    return false;

	Vertice v = (Vertice) vertice2;
	return this.etiqueta.equals(v.etiqueta);
    }

    /**
     * @return String. Representaci�n del v�rtice en una cadena
     */
    public String toString()
    {
	return "Vertice: " + this.etiqueta;
    }


    /**
     * @return int. C�digo hash para este v�rtice
     **/
    public int hashCode()
    {
	return this.getEtiqueta().hashCode();
    }
    
    /**
     * @return ArrayList<Arista>. Copia del array de lista vecindad
     */ 
    public ArrayList<Arista> getVecinos()
    {
	return new ArrayList<Arista>(this.vecindad);
    }
}