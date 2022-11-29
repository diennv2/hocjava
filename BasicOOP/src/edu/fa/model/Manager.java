/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Mar 3, 2022
 * @version 1.0
*/

package edu.fa.model;

public class Manager {
    private String name1;
    public void report(Employee employee) throws Exception {
        System.out.println(employee.name);
    }
}
