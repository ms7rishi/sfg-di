package com.springframework.pets;


public class PetServiceFactory {

    public PetService getPetService(String getType){
        switch (getType){
            case "dog": return new DogPetService();
            case "cat": return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
