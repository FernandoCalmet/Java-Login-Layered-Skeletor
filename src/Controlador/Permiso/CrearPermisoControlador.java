
package Controlador.Permiso;
/**
 *
 * @author Fernando Calmet <github.com/fernandocalmet>
 */
public class CrearPermisoControlador extends BasePermiso
{
    public boolean CrearPermiso(Object objModelo)
    {
        return getPermisoServicio().Crear(objModelo);
    }
}