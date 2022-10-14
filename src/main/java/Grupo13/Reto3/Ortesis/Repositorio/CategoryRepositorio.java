/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grupo13.Reto3.Ortesis.Repositorio;

import Grupo13.Reto3.Ortesis.Interface.CategoryInterface;
import Grupo13.Reto3.Ortesis.Modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepositorio {
    @Autowired
    private CategoryInterface categoryInterface;
    
    public List<Category> getAll(){
        return (List<Category>) categoryInterface.findAll();
    }
    
    public Optional<Category> getCategory(int id){
        return categoryInterface.findById(id);
    }

    public Category save(Category category){
        return categoryInterface.save(category);
    }
    
    public void delete(Category category){
        categoryInterface.delete(category);
    }
    
   
    
}
