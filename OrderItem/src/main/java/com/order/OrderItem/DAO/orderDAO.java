package com.order.OrderItem.DAO;

import com.order.OrderItem.entity.order;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class orderDAO  implements orderDAOin {

    private EntityManager entityManager;

    @Autowired
    public orderDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<order> findAll() {
        // get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create a query
        Query<order> theQuery =
                currentSession.createQuery("from order", order.class);

        List<order> orders = theQuery.getResultList();

        return orders;
    }

    @Override
    public order findById(int theId) {
        // get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        order theOrder = currentSession.get(order.class, theId);

        return theOrder;



    }




    @Override
    public void save(order theOrder) {
        // get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);


        currentSession.saveOrUpdate(theOrder);



    }

    @Override
    public void delete(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<order> theQuery =
                currentSession.createQuery("delete from order where id=:orderId");
        theQuery.setParameter("orderId", theId);
        theQuery.executeUpdate();

    }
}
