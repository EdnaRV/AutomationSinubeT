import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int nb1 = 100;
        int nb2 = 400;
        int nb3 = 4;
        //2024
        int yFromFile = 2020;
        int day = 29;
        String month = "Feb";
        int yDate = 2022;

        if( ((month.equals("Ene")) || (month.equals("Mar")) || (month.equals("May")) || (month.equals("Jul")) || (month.equals("Ago")) || (month.equals("Oct")) || (month.equals("Dic")) ) & (day == 31) & ((yFromFile > 1 ) & (yFromFile <= yDate ) & (yFromFile >= (yDate - 120 )) ) ){
            System.out.println("Día y mes correctos segun calendario");
        } else if ( ( (month.equals("Abr")) || (month.equals("Jun")) || (month.equals("Sep")) || (month.equals("Nov")) ) & (day == 30) & (day == 31) & ((yFromFile > 1 ) & (yFromFile <= yDate ) & (yFromFile >= (yDate - 120 )) )) {
            System.out.println("Día y mes correctos segun calendario");

        } else if ( ( (month.equals("Feb")) ) & (day == 28) & (day == 31) & ((yFromFile > 1 ) & (yFromFile <= yDate ) & (yFromFile >= (yDate - 120 )) )) {
            System.out.println("Día y mes correctos segun calendario");
        } else if ((day == 29) & (month.equals("Feb")) & (((yFromFile % nb1 ) == 0) || ((yFromFile % nb2 ) == 0) || ((yFromFile % nb3 ) == 0)) & ((yFromFile > 1 ) & (yFromFile <= yDate ) & (yFromFile >= (yDate - 120 )) ) ){
            System.out.println("Es un año bisciesto, la fecha es correcta c:");
            //Se sigue con el programa

        } else if ((day < 1) || (day > 31) & (day == 31) & ((yFromFile > 1 ) & (yFromFile <= yDate ) & (yFromFile >= (yDate - 120 )) ) ){
            System.out.println("No es una fecha válida");
            //Mandar a llamar Screenshot(String msg = Fecha ingresada inválida) --- para que la imprima en la captura de pantalla

            //*******++++
            //Activar una bandera(booblean false or true)

            //***********
        } else if (yFromFile > yDate) {
            System.out.println("Bienvenido viajero del futuro, no podemos asignarte CURP c:");
            String msg = "Viajero del futuro";

        } else {
            System.out.println("No es una fecha válida");

        }

        //Validacion si es un año de nacimiento de nuestros días (no > date() actual / ni menor a date() actual - 100)

        //Validacion si es un dia >= 1 y <= 31
        //Validacion por mes(segun el que se ingrese)

        //*******++++
        //Si la bandera es true: manda a llamar una funcion de Screenshot HP o Test to fail

        //***********

//_________________________________________________________________________________________________________________________________________
        //Creacion de carpetas c:

        /*

        String raizCarpetas = "C:\\Users\\envaldez\\Documents\\sinubeT\\Screenshot\\" + caption + getDate() ;

        String picFile = caption  + "_" + getDateTime() + ".png" ;

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            Thread.sleep(1000);
            FileUtils .copyFile(screenshotFile, new File(raizCarpetas + picFile ));

        } catch (Exception e) {
            e.printStackTrace();
        }
        Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("ScreenShot Tomada\n");

        */
        String existRDPath = "C:\\Users\\envaldez\\Documents\\sinubeT\\Evidencias";
        String notExistRDPath = "";
        String existDPath = "C:\\Users\\envaldez\\Documents\\sinubeT\\" +"Date"+ yDate;
        String notExistDPath = "";
/*
        //if ! x carpeta & x archivo Existen   entonces
        if(!existRDPath.exist()){


        }
            //Crealos porfas(osea que les paso el path)

        //sino, en el path existente creo los x archivos

*/


    }
}