package Controlador.Permiso;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet <github.com/fernandocalmet>
 */
public class ConsultarTodosPermisos extends BasePermiso
{
    public ArrayList<Object[]> ConsultarTodosPermisos()
    {
        return getPermisoServicio().ConsultarTodos();
    }
}