package urp.modelo.dao;

/**
 *
 * @author MIGUEL
 */

import urp.model.pojos.Employees;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

public class EmployeesDao {

    public void newEmployee(Employees emp) {
        SessionFactory sf = null;
        Session sesion = null;

        Transaction tx = null;

        try {
            sf = HibernateUtil.getSessionFactory();
            sesion =  sf.openSession();
            tx = sesion.beginTransaction();

            sesion.save(emp);
            tx.commit();
            sesion.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException("No se pudo registrar empleado");
        }
    }

    public String queryEmployee(int cod) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        System.out.println("hola");
        Session sesion = sf.openSession();

        Employees emp = (Employees)sesion.get(Employees.class, cod);
        
        sesion.close();
        if(emp != null){
            return "El empleado con codigo " + emp.getEmployeeId() + "   es : Nombre " + emp.getFirstName() + " apellido " + emp.getLastName();
        }else{
            return "El empleado con codigo "+ cod + " no existe";
        }
        
    }

}
 