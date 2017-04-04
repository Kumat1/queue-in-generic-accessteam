package TugasKamiBang;

/**
 * Created by Surya Permana Putra on 04/04/2017.
 */
public class Queue {



    static int ekor = -1;
    static int maxEkor = 5;
    public static void addQueue(String antrian[], String data)
    { if (ekor >= maxEkor)
        System.out.println("Maaf, antrian penuh");
    else
    { //System.out.println("add Queue: "+data);
        ekor++;
        antrian[ekor]=data;
    }
    }
    public static String deQueue(String antrian[])
    { String hasil="";
        if (ekor<0)
            hasil="Maaf, antrian kosong";
        else
        { hasil = antrian[0];
            antrian[0]=null;
            for (int i=1;i<=ekor;i++)
            {
                antrian[i-1]=antrian[i];
                antrian[i]=null;
            }
            ekor--;
        }
        return (hasil);
    }
    public static void bacaAntrian(String antrian[])
    { System.out.println("Kondisi Antrian : ");
        for (int i=0;i<=maxEkor;i++)
        {
            if (i==ekor)
                System.out.println(i+". "+ antrian[i]+" akhir");
            else if (antrian[i]==null)
                System.out.println(i+". ");
            else
                System.out.println(i+". "+antrian[i]);
        }
    }
    public static void main(String []surya) {
        String antrian[] = new String[16];
        System.out.println("Toilet Naik Turun Nafsu");
        addQueue(antrian, " Ucuf");
        addQueue(antrian, " Ian");
        addQueue(antrian, " Kia");
        addQueue(antrian, " Enta");
        addQueue(antrian, " Entut");
        addQueue(antrian, " Baba");

        System.out.println("\n");
        System.out.println(" ");
        bacaAntrian(antrian);
        System.out.println("\n\nURUTAN MASUK\nQueue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("Queue : " + deQueue(antrian));
        System.out.println("\n\nSedangkan  Baba masih menahan nafsu");
    }}

