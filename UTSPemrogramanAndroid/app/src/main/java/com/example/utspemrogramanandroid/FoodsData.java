package com.example.utspemrogramanandroid;

import android.content.Context;

import java.util.ArrayList;

public class FoodsData {
    private static String[] foodNames = {
            "Batagor",
            "Black Salad",
            "Cappuchino",
            "Cheese Cake",
            "Cireng",
            "Donut",
            "Kopi Hitam",
            "Mie Goreng",
            "Sparkling Tea"

    };
    private static String[] foodPrices = {
            "15000",
            "20000",
            "25000",
            "18000",
            "8000",
            "10000",
            "12000",
            "16000",
            "15000"

    };
    private static String[] foodDetails = {
            "Batagor merupakan jajanan khas Bandung yang mengadaptasi gaya Tionghoa-Indonesia dan kini sudah dikenal hampir di seluruh wilayah Indonesia.",
            "Warna hitam membuat salad buah tampak tak biasa namun irisan jeruk sunkist membuatnya tampak menarik. Saus berwarna hitam ini membuat buah-buahan di dalam salad tak terlihat sehingga membuat penasaran dan menjadi kejutan tersendiri saat masuk ke dalam mulut. Bisa saja mendapatkan buah atau jeli yang tak terduga.",
            "Kapucino adalah minuman khas Italia yang dibuat dari espreso dan susu, tetapi referensi lain juga ada yang menyebutkan bahwa kapucino berawal dari biji biji kopi tentara Turki yang tertinggal setelah peperangan yang di pimpin oleh Kara Mustapha Pasha di Wina, Austria melawan tentara gabungan Polandia-Germania",
            "Cheesecake adalah kue yang biasanya dimakan sebagai hidangan penutup, dibuat dengan mencampurkan keju yang bertekstur lembut, telur, susu, dan gula.",
            "Cireng adalah makanan ringan yang berasal dari daerah Sunda yang dibuat dengan cara menggoreng campuran adonan yang berbahan utama tepung kanji atau tapioka. Makanan ringan ini sangat populer di daerah Priangan, dan dijual dalam berbagai bentuk dan variasi rasa. Makanan ini cukup terkenal pada era 80-an",
            "Donat adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur, dan mentega. Donat yang paling umum adalah donat berbentuk cincin dengan lubang di tengah dan donat berbentuk bundar dengan isian manis, seperti selai, jelly, krim, dan custard.",
            "Kopi hitam juga mengurangi tingkat peradangan dalam tubuh. Kopi hitam adalah pembangkit tenaga antioksidan. Kopi hitam mengandung Vitamin B2, B3, B5, Mangan, kalium dan magnesium.",
            "Mi goreng berarti \"mi yang digoreng\" adalah makanan yang berasal dari Indonesia yang populer dan juga digemari di Malaysia, dan Singapura",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
    };
    private static int[] foodsImages = {
            R.drawable.batagor,
            R.drawable.black_salad,
            R.drawable.cappuchino,
            R.drawable.cheesecake,
            R.drawable.cireng,
            R.drawable.donut,
            R.drawable.kopi_hitam,
            R.drawable.mie_goreng,
            R.drawable.sparkling_tea

    };
    static ArrayList<Food> getListData(Context context) {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setPrice(foodPrices[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodsImages[position]);
            list.add(food);
        }
        return list;
    }
}
