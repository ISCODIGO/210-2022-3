# Lanzamiento de Dados
Juego creado en JavaFX para mostrar algunos elementos:
- Carga de imagenes
- Uso de RadioButton
- Inclusion de clases creadass para la gestion de datos

## Clases
- **Dado**: Clase creada para simular el comportamiento basico de un dado, con sus 6 caras y la generacion de un valor pseudo-aleatorio.
- **Juego**: Clase para manejar los lanzamientos de dos dados y la gestion de puntos en cada lanzada.
- **GameApp**: Clase para gestionar la Application.
- **GameController**: Clase controladora para compactar toda la logica del programa.

## Manejo de Imagenes
Se utiliza el control ImageView para esto. Hay una funcion *setImage()* que necesita un objeto Image para mostrarlo.

El posible problema es obtener la ruta de la imagen. En el caso de Maven (el manejador de proyecto que estamos utilizando) puede ser menos transparente en cuanto al uso de directorios. 

Lo primero que hacemos es colocar las imagenes en Resources del proyecto (en este caso es `resources/com/example/dados/`), incluso se pueden colocar directorios dentro de esta ubicacion.

Para encontrar estos elementos en el codigo utilizamos la clase GameApplication (o cualquier subclase de Application). Mediante `GameApplication.class.getResource("ruta-imagen").toURI()` se obtiene el localizador interno. Ya con ello podemos cargarlo a la Image y a su vez al ImageView.

Es importante señalar que si la imagen no esta directamente en la raiz del package debe indicarse la carpeta donde se ubica.