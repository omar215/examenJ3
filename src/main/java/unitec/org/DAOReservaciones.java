/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.org;

/**
 *
 * @author Omar
 */
class DAOReservaciones {
        public SessionFactory sessionFactory;
    public Session session;
    public Transaction transaction;
    public DAOCliente(){
        sessionFactory=HibernateUtilidades.getSessionFactory()
                session=sessionFactory.openSession();
                transaction=session.beginTransaction();
    }
    private void cerrarTodo(){
        transaction.commit();
        session.close();
    }
    
    public void guardar(Cliente reservacion)throws Exception{
        session.save(reservacion);
        cerrarTodo();
    }
}
}
