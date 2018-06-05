# Hibernate-demo

### This github repo purpose is only for my self learning only

* Hibernate-1 - Simple Hibernate Project for learning configurations

* Hibernate-2 - For learning how to add another class Object as a column in a database.Here we will use @Embeddable annotation

* Hibernate-3 - For learning how to save collections in the Database.Hibernate will create another table for collection and will also create a foreign key pointing to the orignal table,which collection object is a part of.

* Hibernate-5 - For learning how to create a primary key for collection table. 

* Hibernate-6 One to One mapping every alien is having one vehicle.In alien table a foreign key column is created pointing to vechile table.

* Hibernate-7 One to Many mapping. Every Alien is having more than 1 vechile. A seperate table is created with 2 columns mapping alien id with vechile id.

* HIBERNATE-8 TwoWheeler and FourWheeler class extends Vehicle class. @Entity is defined on all 3 class still only 1 table is created in databse called Vechile table. This is Single table strategy in inheritance.Screenshot of the table created is stored in the folder itself.
dType column tells the class name.This is the default strategy hibernate uses.

* Hibernate9 Here @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) is used on top of parent class. Different tables are created for each class since it is Table_per_class strategy. Child classes have thier columns as well as columns of parent.Images of database created are stored.

* Hibernate-10 HERE @Inheritance(strategy=InheritanceType.JOINED) is used ,Columns of the parent table doesnt go into the child table as in the case of table_per_class strategy ,if we want the complete child class entity table we need to use sql join statement with the parent table.Child table only contains properties specific to the child class. Screenshot of the table created is stored in the folder itself.

* Hibernate-11 CRUD operations using hibernate

* HIBERNATE-12 Understanding Transient, Persistent and Detached Objects

* Hibernate-13 Hibernate Query language 

* Hibernate-14 using Second level cache
