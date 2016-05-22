/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urp.services.webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import urp.model.pojos.Employees;
import urp.modelo.dao.EmployeesDao;
/**
 *
 * @author MIGUEL
 */
@WebService(serviceName = "EmployeeWS")
public class EmployeeWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarEmpleado")
    public String RegistrarEmpleado(@WebParam(name = "apellido") String apellido, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "ciudad") String ciudad, @WebParam(name = "pais") String pais) {
        
        Employees emp = new Employees(apellido,nombre,direccion,ciudad,pais);
        EmployeesDao employeesDao = new EmployeesDao();
        employeesDao.newEmployee(emp);
        return "Empleado Registrado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarEmpleado")
    public String consultarEmpleado(@WebParam(name = "codigoEmpleado") int codigoEmpleado) {
        //TODO write your implementation code here:
        
        EmployeesDao employeesDao = new EmployeesDao();
        
        return employeesDao.queryEmployee(codigoEmpleado);
    }
}
