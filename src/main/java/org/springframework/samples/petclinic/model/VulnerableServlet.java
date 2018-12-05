package org.springframework.samples.petclinic.model;

import javax.servlet.http.HttpServlet;

public class VulnerableServlet extends HttpServlet {

    public static void main(String[] args) {
        System.out.println("Vulnerability!");
    }

}
