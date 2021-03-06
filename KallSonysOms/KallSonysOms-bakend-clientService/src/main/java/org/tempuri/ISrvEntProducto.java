package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-24T23:27:00.796-05:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "ISrvEntProducto")
@XmlSeeAlso({com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, ObjectFactory.class, org.datacontract.schemas._2004._07.productoentities.ObjectFactory.class})
public interface ISrvEntProducto {

    @WebMethod(operationName = "BuscarProducto", action = "http://tempuri.org/ISrvEntProducto/BuscarProducto")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarProducto", output = "http://tempuri.org/ISrvEntProducto/BuscarProductoResponse")
    @RequestWrapper(localName = "BuscarProducto", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarProducto")
    @ResponseWrapper(localName = "BuscarProductoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarProductoResponse")
    @WebResult(name = "BuscarProductoResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ProductoEntity buscarProducto(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        java.lang.Integer id
    );

    @WebMethod(operationName = "BuscarTop5VendidosFecha", action = "http://tempuri.org/ISrvEntProducto/BuscarTop5VendidosFecha")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarTop5VendidosFecha", output = "http://tempuri.org/ISrvEntProducto/BuscarTop5VendidosFechaResponse")
    @RequestWrapper(localName = "BuscarTop5VendidosFecha", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5VendidosFecha")
    @ResponseWrapper(localName = "BuscarTop5VendidosFechaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5VendidosFechaResponse")
    @WebResult(name = "BuscarTop5VendidosFechaResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity buscarTop5VendidosFecha(
        @WebParam(name = "FechaInicio", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar fechaInicio,
        @WebParam(name = "FechaFin", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar fechaFin
    );

    @WebMethod(operationName = "BuscarTop5CategoriasFecha", action = "http://tempuri.org/ISrvEntProducto/BuscarTop5CategoriasFecha")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarTop5CategoriasFecha", output = "http://tempuri.org/ISrvEntProducto/BuscarTop5CategoriasFechaResponse")
    @RequestWrapper(localName = "BuscarTop5CategoriasFecha", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5CategoriasFecha")
    @ResponseWrapper(localName = "BuscarTop5CategoriasFechaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5CategoriasFechaResponse")
    @WebResult(name = "BuscarTop5CategoriasFechaResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfCategoriaEntity buscarTop5CategoriasFecha(
        @WebParam(name = "FechaInicio", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar fechaInicio,
        @WebParam(name = "FechaFin", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar fechaFin
    );

    @WebMethod(operationName = "NuevoProducto", action = "http://tempuri.org/ISrvEntProducto/NuevoProducto")
    @Action(input = "http://tempuri.org/ISrvEntProducto/NuevoProducto", output = "http://tempuri.org/ISrvEntProducto/NuevoProductoResponse")
    @RequestWrapper(localName = "NuevoProducto", targetNamespace = "http://tempuri.org/", className = "org.tempuri.NuevoProducto")
    @ResponseWrapper(localName = "NuevoProductoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.NuevoProductoResponse")
    @WebResult(name = "NuevoProductoResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Integer nuevoProducto(
        @WebParam(name = "P", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.productoentities.ProductoEntity p
    );

    @WebMethod(operationName = "EliminarProducto", action = "http://tempuri.org/ISrvEntProducto/EliminarProducto")
    @Action(input = "http://tempuri.org/ISrvEntProducto/EliminarProducto", output = "http://tempuri.org/ISrvEntProducto/EliminarProductoResponse")
    @RequestWrapper(localName = "EliminarProducto", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EliminarProducto")
    @ResponseWrapper(localName = "EliminarProductoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EliminarProductoResponse")
    @WebResult(name = "EliminarProductoResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean eliminarProducto(
        @WebParam(name = "idProducto", targetNamespace = "http://tempuri.org/")
        java.lang.Integer idProducto
    );

    @WebMethod(operationName = "BuscarProductosRelacionados", action = "http://tempuri.org/ISrvEntProducto/BuscarProductosRelacionados")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarProductosRelacionados", output = "http://tempuri.org/ISrvEntProducto/BuscarProductosRelacionadosResponse")
    @RequestWrapper(localName = "BuscarProductosRelacionados", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarProductosRelacionados")
    @ResponseWrapper(localName = "BuscarProductosRelacionadosResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarProductosRelacionadosResponse")
    @WebResult(name = "BuscarProductosRelacionadosResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity buscarProductosRelacionados(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        java.lang.Integer id
    );

    @WebMethod(operationName = "BuscarProductoCodigo", action = "http://tempuri.org/ISrvEntProducto/BuscarProductoCodigo")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarProductoCodigo", output = "http://tempuri.org/ISrvEntProducto/BuscarProductoCodigoResponse")
    @RequestWrapper(localName = "BuscarProductoCodigo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarProductoCodigo")
    @ResponseWrapper(localName = "BuscarProductoCodigoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarProductoCodigoResponse")
    @WebResult(name = "BuscarProductoCodigoResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity buscarProductoCodigo(
        @WebParam(name = "codigo", targetNamespace = "http://tempuri.org/")
        java.lang.String codigo,
        @WebParam(name = "pagenum", targetNamespace = "http://tempuri.org/")
        java.lang.Integer pagenum,
        @WebParam(name = "pagesize", targetNamespace = "http://tempuri.org/")
        java.lang.Integer pagesize
    );

    @WebMethod(operationName = "BuscarTop5VendidosSemana", action = "http://tempuri.org/ISrvEntProducto/BuscarTop5VendidosSemana")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarTop5VendidosSemana", output = "http://tempuri.org/ISrvEntProducto/BuscarTop5VendidosSemanaResponse")
    @RequestWrapper(localName = "BuscarTop5VendidosSemana", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5VendidosSemana")
    @ResponseWrapper(localName = "BuscarTop5VendidosSemanaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5VendidosSemanaResponse")
    @WebResult(name = "BuscarTop5VendidosSemanaResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity buscarTop5VendidosSemana();

    @WebMethod(operationName = "BuscarTop5Vendidos", action = "http://tempuri.org/ISrvEntProducto/BuscarTop5Vendidos")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarTop5Vendidos", output = "http://tempuri.org/ISrvEntProducto/BuscarTop5VendidosResponse")
    @RequestWrapper(localName = "BuscarTop5Vendidos", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5Vendidos")
    @ResponseWrapper(localName = "BuscarTop5VendidosResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5VendidosResponse")
    @WebResult(name = "BuscarTop5VendidosResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity buscarTop5Vendidos();

    @WebMethod(operationName = "BuscarProductoCampana", action = "http://tempuri.org/ISrvEntProducto/BuscarProductoCampana")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarProductoCampana", output = "http://tempuri.org/ISrvEntProducto/BuscarProductoCampanaResponse")
    @RequestWrapper(localName = "BuscarProductoCampana", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarProductoCampana")
    @ResponseWrapper(localName = "BuscarProductoCampanaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarProductoCampanaResponse")
    @WebResult(name = "BuscarProductoCampanaResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity buscarProductoCampana(
        @WebParam(name = "idcampana", targetNamespace = "http://tempuri.org/")
        java.lang.Integer idcampana,
        @WebParam(name = "pagenum", targetNamespace = "http://tempuri.org/")
        java.lang.Integer pagenum,
        @WebParam(name = "pagesize", targetNamespace = "http://tempuri.org/")
        java.lang.Integer pagesize
    );

    @WebMethod(operationName = "EditarProducto", action = "http://tempuri.org/ISrvEntProducto/EditarProducto")
    @Action(input = "http://tempuri.org/ISrvEntProducto/EditarProducto", output = "http://tempuri.org/ISrvEntProducto/EditarProductoResponse")
    @RequestWrapper(localName = "EditarProducto", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EditarProducto")
    @ResponseWrapper(localName = "EditarProductoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EditarProductoResponse")
    @WebResult(name = "EditarProductoResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean editarProducto(
        @WebParam(name = "P", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.productoentities.ProductoEntity p
    );

    @WebMethod(operationName = "BuscarCategoriasFecha", action = "http://tempuri.org/ISrvEntProducto/BuscarCategoriasFecha")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarCategoriasFecha", output = "http://tempuri.org/ISrvEntProducto/BuscarCategoriasFechaResponse")
    @RequestWrapper(localName = "BuscarCategoriasFecha", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarCategoriasFecha")
    @ResponseWrapper(localName = "BuscarCategoriasFechaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarCategoriasFechaResponse")
    @WebResult(name = "BuscarCategoriasFechaResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfCategoriaEntity buscarCategoriasFecha(
        @WebParam(name = "FechaInicio", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar fechaInicio,
        @WebParam(name = "FechaFin", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar fechaFin
    );

    @WebMethod(operationName = "BuscarTop5ProductoVistoNuevo", action = "http://tempuri.org/ISrvEntProducto/BuscarTop5ProductoVistoNuevo")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarTop5ProductoVistoNuevo", output = "http://tempuri.org/ISrvEntProducto/BuscarTop5ProductoVistoNuevoResponse")
    @RequestWrapper(localName = "BuscarTop5ProductoVistoNuevo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5ProductoVistoNuevo")
    @ResponseWrapper(localName = "BuscarTop5ProductoVistoNuevoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5ProductoVistoNuevoResponse")
    @WebResult(name = "BuscarTop5ProductoVistoNuevoResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity buscarTop5ProductoVistoNuevo();

    @WebMethod(operationName = "BuscarTop5ProductoVisto", action = "http://tempuri.org/ISrvEntProducto/BuscarTop5ProductoVisto")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarTop5ProductoVisto", output = "http://tempuri.org/ISrvEntProducto/BuscarTop5ProductoVistoResponse")
    @RequestWrapper(localName = "BuscarTop5ProductoVisto", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5ProductoVisto")
    @ResponseWrapper(localName = "BuscarTop5ProductoVistoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarTop5ProductoVistoResponse")
    @WebResult(name = "BuscarTop5ProductoVistoResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity buscarTop5ProductoVisto();

    @WebMethod(operationName = "BuscarVendidosFecha", action = "http://tempuri.org/ISrvEntProducto/BuscarVendidosFecha")
    @Action(input = "http://tempuri.org/ISrvEntProducto/BuscarVendidosFecha", output = "http://tempuri.org/ISrvEntProducto/BuscarVendidosFechaResponse")
    @RequestWrapper(localName = "BuscarVendidosFecha", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarVendidosFecha")
    @ResponseWrapper(localName = "BuscarVendidosFechaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuscarVendidosFechaResponse")
    @WebResult(name = "BuscarVendidosFechaResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity buscarVendidosFecha(
        @WebParam(name = "FechaInicio", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar fechaInicio,
        @WebParam(name = "FechaFin", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar fechaFin
    );
}
