package com.tatiana.project.lesson11;

public enum Country {
    USA("usa", 43875248){
        @Override
        public void printInfo() {
            System.out.println("USA");
        }
        public void usaVoid (){}
    },
    UK("uk", 4254524){
        @Override
        public void printInfo() {
            System.out.println("UK");
        }
        public void usaVoid (){}
    },
    BRAZIL("brazil", 582098204){
        @Override
        public void printInfo() {
            System.out.println("BRAZIL");
        }
        public void usaVoid (){} // этот метод будет доступен только здесь в рамках{}
    };

    private String titile;
    private long population;

    Country(String titile, long population) {
        this.titile = titile;
        this.population = population;
    }

    abstract public void printInfo();

}
