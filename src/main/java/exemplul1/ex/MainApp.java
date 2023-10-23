package exemplul1.ex;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exemplul1.Persoana;

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
            System.out.println("1=add pereche numar");
            System.out.println("2=salvare");
            System.out.println("3=load");
            System.out.println("4=afisare");
            ui=sc.nextInt();
            switch (ui){
                case 1->{
                    System.out.println("a=?");
                    int a=sc.nextInt();
                    System.out.println("b=?");
                    int b=sc.nextInt();
                    lista.add(new PerecheNumere(a,b));
                }
                case 2->{
                    scriere(lista);
                }
                case 3->{
                    lista.clear();
                    lista=citire();
                }
                case 4->{
                    int n=lista.size();
                    for (int i = 0; i < n; i++) {
                        System.out.println(lista.get(i));
                    }
                }
            }
        }while(ui!=0);





    }
}
