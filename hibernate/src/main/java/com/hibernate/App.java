package com.hibernate;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
        System.out.println( "program started.." );
        Entity e=new Entity();
        e.setId(5);
         e.setName("amir");
        e.setlName("khan");
        e.setSalary("20000");
        
        Configuration cf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Entity.class);
        SessionFactory sf=cf.buildSessionFactory();
        
        Session session=sf.openSession();
        Transaction t=session.beginTransaction();
        
       
       // session.save(e);
        
        Criteria c=session.createCriteria(Entity.class);
       
        //fetch 
        /*
        List list=c.list();
        Iterator itr=list.iterator();
        while(itr.hasNext()) {
        	Entity entity=(Entity) itr.next();
        	System.out.println(entity.getId()+""+entity.getName()+""+entity.getlName()+""+entity.getSalary());
        }
        */
        //update
        e=session.get(Entity.class, 4);
        e.setName("rizwan");
        session.update(e);
        
        List list=c.list();
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
        	e=(Entity) itr.next();
        	System.out.println(e.getId()+" "+e.getName()+" "+e.getlName()+" "+" "+e.getSalary());
        }
        
       // session.delete(e);
        		
        
        t.commit();
        System.out.println("success");
        session.close();
        sf.close();
        
    }
}
