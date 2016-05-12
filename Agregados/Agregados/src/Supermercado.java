
	/**
	 * Clase que representa un supermercado caracterizado por un
	 * nombre y que incluye un almacén de productos.
	 *
	 * @author PRG
	 * @version 1.0
	 */
	class Supermercado{

		/**
		 * Nombre del supermercado
		 */ 
		private String nombre;
		/**
		 * Almacen de productos
		 */
		private Almacen almacen;

		/**
		 * Constructor del supermercado a partir del nombre del mismo.
		 */
		Supermercado(String nombre){
			this.nombre = nombre;
			this.almacen = new Almacen();
		}

		/**
		 * Método que sirve para intentar aniadir un nuevo producto
		 * al almacen. Esto sera posible siempre y cuando el producto
		 * no se encuentre ya en el almacen, y el almacen siga
		 * disponiendo de sitio para su almacenaje.
		 *
		 * @param producto producto que se desea aniadir al almacen
		 * @return verdadero si ha sido posible aniadir el producto
		 * y falso en caso contrario
		 */
		boolean anyadir(Producto producto){
			boolean respuesta=almacen.anyadir(producto);
			return respuesta;
		}

		/**
		 * Trata de localizar un producto en el almacen a partir de
		 * su nombre.
		 *
		 * @param producto nombre del producto que se desea localizar
		 * @return el producto, en caso de encontrarlo, o null en caso
		 * contrario.
		 */
		Producto buscar(String producto){
			Producto buscado=almacen.buscar(producto);
			return buscado;
		}

		/**
		 * Devuelve una cadena de caracteres con toda la información relativa al 
		 * supermercado.
		 *
		 */
		public String toString(){
			StringBuffer salida = new StringBuffer();

			salida.append("\n ---------");
			salida.append("\n SUPERMERCADO: "+nombre);
			salida.append("\n ---------");
			salida.append(almacen.toString());
			/*for (int i=0; i < almacen.getSiguiente(); i++){
				salida.append(productos[i].toString());
			}
			*/
			return salida.toString();

		}

	}
