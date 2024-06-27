package com.jgajzler.apartmently.config;

//import org.hibernate.HibernateException;
//import org.hibernate.engine.spi.SharedSessionContractImplementor;
//
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Types;
//
//public class PostgreSQLEnumType extends org.hibernate.type.EnumType {
//
//    public void nullSafeSet(
//            PreparedStatement preparedStatement,
//            Object value,
//            int index,
//            SharedSessionContractImplementor session)
//            throws HibernateException, SQLException {
//        if (value == null) {
//            preparedStatement.setNull(index, Types.OTHER);
//        } else {
//            preparedStatement.setObject(
//                    index,
//                    value.toString(),
//                    Types.OTHER
//            );
//        }
//    }
//}

//import org.hibernate.HibernateException;
//import org.hibernate.engine.spi.SharedSessionContractImplementor;
//import org.hibernate.type.EnumType;
//
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Types;
//
//public class MySQLEnumType extends EnumType {
//
//    @Override
//    public void nullSafeSet(
//            PreparedStatement preparedStatement,
//            Object value,
//            int index,
//            SharedSessionContractImplementor session)
//            throws HibernateException, SQLException {
//        
//        if (value == null) {
//            preparedStatement.setNull(index, Types.VARCHAR); // Adjust type for MySQL
//        } else {
//            preparedStatement.setObject(
//                    index,
//                    value.toString(),
//                    Types.VARCHAR // Adjust type for MySQL
//            );
//        }
//    }
//}
//




import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.EnumType;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class StringEnumType extends EnumType {
    @Override
    public void nullSafeSet(
            PreparedStatement preparedStatement,
            Object value,
            int index,
            SharedSessionContractImplementor session)
            throws HibernateException, SQLException {
        if (value == null) {
            preparedStatement.setNull(index, Types.VARCHAR);
        } else {
            preparedStatement.setString(index, value.toString());
        }
    }
}

