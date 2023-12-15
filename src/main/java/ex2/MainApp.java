package ex2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MainApp {

    static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/PerecheNumere.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

    static List<PerecheNumere> citire(){
        try {
            File file=new File("src/main/resources/PerecheNumere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> pereche = mapper
                    .readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return pereche;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<PerecheNumere> lista = new ArrayList<PerecheNumere>();

        int ui=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("0=closing program");
            System.out.println("1=afisare");
            System.out.println("2=add pereche numar");
            System.out.println("3=salvare");
            System.out.println("4=load");
            System.out.println("5=numere cons in sir fibo");
            System.out.println("6=cel mic multiplu comun");
            System.out.println("7=numere au suma cifrelor egale");
            System.out.println("8=cele doua numere au același număr de cifre pare");
            ui=sc.nextInt();
            switch (ui){
                case 1->{
                    int n=lista.size();
                    for (int i = 0; i < n; i++) {
                        System.out.println(lista.get(i));
                    }
                }
                case 2->{
                    System.out.println("a=?");
                    int a=sc.nextInt();
                    System.out.println("b=?");
                    int b=sc.nextInt();
                    lista.add(new PerecheNumere(a,b));
                }
                case 3->{
                    scriere(lista);
                }
                case 4->{
                    lista.clear();
                    lista=citire();
                }
                case 5->{
                    System.out.println("care pereche=?");
                    int ind=sc.nextInt();
                    if(ind<=lista.size() && ind>=0){
                        if(lista.get(ind).FiboCons()){
                            System.out.println("adevarat");
                        }else{
                            System.out.println("fals");
                        }
                    }
                }
                case 6->{
                    System.out.println("care pereche=?");
                    int ind=sc.nextInt();
                    if(ind<=lista.size() && ind>=0){
                        System.out.println(lista.get(ind).CMMMC());
                    }
                }
                case 7->{
                    System.out.println("care pereche=?");
                    int ind=sc.nextInt();
                    if(ind<=lista.size() && ind>=0){
                        if(lista.get(ind).sumCifre()){
                            System.out.println("adevarat");
                        }else{
                            System.out.println("fals");
                        }
                    }
                }
                case 8->{
                    System.out.println("care pereche=?");
                    int ind=sc.nextInt();
                    if(ind<=lista.size() && ind>=0){
                        if(lista.get(ind).nrCifrePare()){
                            System.out.println("adevarat");
                        }else{
                            System.out.println("fals");
                        }
                    }
                }
            }
        }while(ui!=0);





    }
}
