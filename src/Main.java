public class Main {
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 ()
    {
        System.out.println("Задача 1");
        int i = 100;
        byte b = 3;
        short s = 40;
        long l = 2000000000;
        float f = 42.575f;
        double d = 12.7456354546;
        System.out.println("    Значение переменной i с типом int равно " + i);
        System.out.println("    Значение переменной b с типом byte равно " + b);
        System.out.println("    Значение переменной s с типом short равно " + s);
        System.out.println("    Значение переменной l с типом long равно " + l);
        System.out.println("    Значение переменной f с типом float равно " + f);
        System.out.println("    Значение переменной d с типом double равно " + d);
    }

    public static void task2 ()
    {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549l;
        float c =2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3 ()
    {
        System.out.println("Задача 3");
        byte Ludmila = 23;
        byte Anna = 27;
        byte Ekaterina = 30;
        short bumagaVsego = 480;
        short bumagaNaUchenika = (short)(bumagaVsego/(Ludmila + Anna + Ekaterina));
        System.out.println("    На каждого ученика рассчитано" + bumagaNaUchenika + "листов бумаги");
    }
    public static void task4 ()
    {
        System.out.println("Задача 4");
        byte butilkiVDveMinuyi = 16;
        short dvadcatiMut = (short)(butilkiVDveMinuyi * 10);
        short sutki = (short)(dvadcatiMut * 72);
        int triDnia = sutki * 3;
        int mesiac = triDnia * 10;
        System.out.println("    За 20 минут машина произвела " + dvadcatiMut + " штук бутылок");
        System.out.println("    За сутки машина произвела " + sutki + " штук бутылок");
        System.out.println("    За 3 дня машина произвела " + triDnia + " штук бутылок");
        System.out.println("    За месяц машина произвела " + mesiac + " штук бутылок");
    }
    public static void task5 ()
    {
        System.out.println("Задача 5");
        byte banokKupleno = 120;
        byte beloyNaKlass = 2;
        byte korichnevoyNaKlass = 4;
        byte banokNaKlass = (byte)(beloyNaKlass + korichnevoyNaKlass);
        byte klassov = (byte)(banokKupleno / banokNaKlass);
        byte beloy = (byte)(klassov * beloyNaKlass);
        byte korichnevoy = (byte)(klassov * korichnevoyNaKlass);
        System.out.println("    В школе, где " + klassov + " классов, нужно " + beloy + " банок белой краски и " + korichnevoy + " банок коричневой краски");
    }
    public static void task6 ()
    {
        System.out.println("Задача 6");
        byte vesBanana = 80;
        byte ves100MlMoloka = 105;
        byte vesBriketePlombira = 100;
        byte vesEgg = 70;
        short banani = (short)(vesBanana * 5);
        short moloko = (short)(ves100MlMoloka * 2);
        short plombir = (short)(vesBriketePlombira * 2);
        short eggs = (short)(vesEgg * 4);
        short vesZavtraka = (short)(banani + moloko + plombir + eggs);
        float vesVKg = vesZavtraka / 1000f;
        System.out.println("    Вес завтрака в граммах: " + vesZavtraka);
        System.out.println("    Вес завтрака в килограммах: " + vesVKg);
    }
    public static void task7 ()
    {
        System.out.println("Задача 7");
        short maxSkorostPohudania = 500;
        short minSkorostPohudania = 250;
        byte lishniyVesKG = 7;
        short lishniyVesG = (short)(lishniyVesKG * 1000);
        short timePriMax = (short)(lishniyVesG / maxSkorostPohudania);
        short timePriMin = (short)(lishniyVesG / minSkorostPohudania);
        short timePriSrednem = (short)((timePriMin + timePriMax) / 2);
        System.out.println( "   " + timePriMin + " дней потребуется если сбрасывать по 250г в день");
        System.out.println( "   " + timePriMax + " дней потребуется при сбрасывании 500г в день");
        System.out.println( "   " + timePriSrednem + " дней потребуется в среднем");
    }
    public static void task8 ()
    {
        System.out.println("Задача 8");
        int mashaMesDo = 67760;
        int mashaMesPosle = mashaMesDo + mashaMesDo/10;
        int mashaGodDo = mashaMesDo * 12;
        int mashaGodPosle = mashaMesPosle * 12;
        int mashaRazn = mashaGodPosle - mashaGodDo;
        int denMesDo = 83690;
        int denMesPosle = denMesDo + denMesDo/10;
        int denGodDo = denMesDo * 12;
        int denGodPosle = denMesPosle * 12;
        int denRazn = denGodPosle - denGodDo;
        int krisMesDo = 76230;
        int krisMesPosle = krisMesDo + krisMesDo/10;
        int krisGodDo = krisMesDo * 12;
        int krisGodPosle = krisMesPosle * 12;
        int krisRazn = krisGodPosle - krisGodDo;
        System.out.println("    Маша теперь получает " + mashaMesPosle + " рублей. Годовой доход вырос на " + mashaRazn + " рублей");
        System.out.println("    Денис теперь получает " + denMesPosle + " рублей. Годовой доход вырос на " + denRazn + " рублей");
        System.out.println("    Кристина теперь получает " + krisMesPosle + " рублей. Годовой доход вырос на " + krisRazn + " рублей");
    }
}