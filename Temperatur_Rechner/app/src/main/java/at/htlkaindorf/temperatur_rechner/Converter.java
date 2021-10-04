package at.htlkaindorf.temperatur_rechner;

public class Converter {
    //f=fahrenheit
    //c = celsius
    //k = Kelvin
    public static float cToK(float c){
        return c+273.15f;
    }
    public static float kToC(float k){
        return k-273.15f;
    }
    public static float cToF(float c){
        return c*1.8f+32 ;
    }
    public static float fToC(float f){
        return(f-32)*9/5;
    }
    public static float ktoF(float k){
        return cToF(kToC(k));
    }
    public static float fToK(float f){
        return cToK(fToC(f));
    }
}
