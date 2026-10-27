/**
 * Capa de acceso a datos: interfaces DAO (UsuarioDAO, ComponenteDAO, OfertaDAO...).
 *
 * Los servicios dependen solo de estas interfaces. Hoy se implementan con archivos planos
 * en autopartes.dao.archivo; cuando se conecte la base de datos se agregará
 * autopartes.dao.oracle sin cambiar los servicios ni las vistas.
 */
package autopartes.dao;
