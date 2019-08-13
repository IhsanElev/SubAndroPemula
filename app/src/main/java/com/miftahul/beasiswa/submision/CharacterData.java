package com.miftahul.beasiswa.submision;


import java.util.ArrayList;

public class CharacterData {
    public static String[][] data = new String[][]{
            {"Alucard", "Fighter","https://gamebrott.com/wp-content/uploads/2019/01/3.png"},
            {"Aldous", "Fighter","https://gamebrott.com/wp-content/uploads/2019/01/3.png"},
            {"Alpha", "Fighter","https://gamebrott.com/wp-content/uploads/2019/01/286.jpg"},
            {"Kaja", "Fighter","https://gamebrott.com/wp-content/uploads/2019/01/281.jpg"},
            {"Thamuz", "Fighter","https://gamebrott.com/wp-content/uploads/2019/01/165.jpg"},
            {"Lancelot", "Assasins","https://gamebrott.com/wp-content/uploads/2019/01/165.jpg"},
            {"Kadita", "Mage","https://gamebrott.com/wp-content/uploads/2019/01/184.jpg"},
            {"Lesley", "Marksman","https://gamebrott.com/wp-content/uploads/2019/01/181.jpg"},
            {"Minsithhar", "Fighter","https://gamebrott.com/wp-content/uploads/2019/01/15.jpg"},
            {"Leomord", "Fighter", "https://gamebrott.com/wp-content/uploads/2019/01/4.png"},
    };

    public static ArrayList<Karakter> getListData() {
        ArrayList<Karakter> list = new ArrayList<>();
        for (String[] aData : data) {
            Karakter karakter = new Karakter();
            karakter.setName(aData[0]);
            karakter.setFrom(aData[1]);
            karakter.setPhoto(aData[2]);
            list.add(karakter);
        }
        return list;
    }
}

