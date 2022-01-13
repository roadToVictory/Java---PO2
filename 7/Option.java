public enum Option{
    RESET('r', "Reset planszy", null), 
    LEFT('a', "Przesun w lewo, ", Direction.LEFT),
    RIGHT('d', "Przesun w prawo, ", Direction.RIGHT),
    UP('w', "Przesun w gore, ", Direction.UP),
    DOWN('s', "Przesun w dol, ", Direction.DOWN),
    EXIT('q', "Zakonczenie gry", null);

    private char z;
    private String opis;
    Direction dir;

    Option(char znak, String o, Direction d){
        z=znak; opis=o; dir=d;
    }

    char getZ(){return z;}
    String getOpis(){return opis;}
    Direction getDir(){return dir;}
    
    public String toString(){
        if(dir!=null)
            return z + " ==>"+" opcja "+name()+", opis: "+getOpis()+"wektor przesuniecia:"+dir;
        return z + " ==>"+" opcja "+name()+", "+"opis: "+getOpis(); 
    }
}