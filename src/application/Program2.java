package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		/*
		System.out.println("=== TEST #1");
		Department newDepartment = new Department(null, "Coffe");
		departmentDao.insert(newDepartment);
		System.out.println("Inserido com sucesso o departamento de id = " + newDepartment.getId());
		*/
		
		System.out.println("\n=== TEST #2===");
		Department departmentUpdate = departmentDao.findById(1);
		departmentUpdate.setName("filmes");
		departmentDao.update(departmentUpdate);
		System.out.println("Atualização completa");
		
		System.out.println("\n=== TEST #3===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		/*
		System.out.println("\n=== TEST #4===");
		System.out.print("informe o id a ser deletado: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("id deletado com sucesso");
		*/
		
		System.out.println("\n=== TEST #5===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		sc.close();

	}

}
