import java.util.*;

public class Main {

    public static void main(String[] args) {
        if(args.length!=0){
            int n = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);
            if(n<=m) return;

            String[] t1, t2, t3;
            t1 = new String[n];
            t2 = new String[m];
            t3 = new String[m];

            Random random = new Random();
            for(int i=0; i<n;i++)
                t1[i] = randomString(random.nextInt(15)+5);


            for(int i=0; i<m;i++)
                t2[i] = t1[random.nextInt(n)];

            for (int i = 0; i < t3.length; i++) {
                String temp = randomString(random.nextInt(15) + 5);
                while (Arrays.asList(t1).contains(temp))
                    temp = randomString(random.nextInt(15) + 5);
                t3[i] = temp;
            }



            List<String> arrayList = new ArrayList<>();
            List<String> linkedList = new LinkedList<>();
            Map<String, String> treeMap = new TreeMap<>();
            Map<String, String> hashMap = new HashMap<>();
            long start, stop;


            System.out.println("\nWypelnianie");

//wypelnianie ArrayList
            start = System.nanoTime();
            for(int i=0; i<n; i++)
                arrayList.add(t1[i]);
            stop = System.nanoTime();
            System.out.println("\tarrayList  -> " + (stop-start)+"ns");

//wypelnianie LinkedList
            start = System.nanoTime();
            for(int i=0; i<n; i++)
                linkedList.add(t1[i]);
            stop = System.nanoTime();
            System.out.println("\tlinkedList -> " + (stop-start)+"ns");

//wypelnianie TreeMap
            start = System.nanoTime();
            for(int i=0; i<n; i++)
                treeMap.put(t1[i], null);
            stop = System.nanoTime();
            System.out.println("\ttreeMap    -> " + (stop-start)+"ns");

//wypelnianie HashMap
            start = System.nanoTime();
            for(int i=0; i<n; i++)
                hashMap.put(t1[i], null);
            stop = System.nanoTime();
            System.out.println("\thashMap    -> " + (stop-start)+"ns");


            System.out.println("\nWyszukiwanie t2");

//Wyszukiwanie w ArrayList t2
            start = System.nanoTime();
            for(int i=0; i<m; i++)
                arrayList.contains(t2[i]);
            stop = System.nanoTime();
            System.out.println("\tarrayList  -> " + (stop-start)+"ns");

//Wyszukiwanie w LinkedList t2
            start = System.nanoTime();
            for(int i=0; i<m; i++)
                linkedList.contains(t2[i]);
            stop = System.nanoTime();
            System.out.println("\tlinkedList -> " + (stop-start)+"ns");

//Wyszukiwanie w TreeMap t2
            start = System.nanoTime();
            for(int i=0; i<m; i++)
                treeMap.containsKey(t2[i]);
            stop = System.nanoTime();
            System.out.println("\ttreeMap    -> " + (stop-start)+"ns");

//Wyszukiwanie w HashMap t2
            start = System.nanoTime();
            for(int i=0; i<m; i++)
                hashMap.containsKey(t2[i]);
            stop = System.nanoTime();
            System.out.println("\thashMap    -> " + (stop-start)+"ns");


            System.out.println("\nWyszukiwanie t3");

//Wyszukiwanie w ArrayList t3
            start = System.nanoTime();
            for(int i=0; i<m; i++)
                arrayList.contains(t3[i]);
            stop = System.nanoTime();
            System.out.println("\tarrayList  -> " + (stop-start)+"ns");

//Wyszukiwanie w LinkedList t3
            start = System.nanoTime();
            for(int i=0; i<m; i++)
                linkedList.contains(t3[i]);
            stop = System.nanoTime();
            System.out.println("\tlinkedList -> " + (stop-start)+"ns");

//Wyszukiwanie w TreeMap t3
            start = System.nanoTime();
            for(int i=0; i<m; i++)
                treeMap.containsKey(t3[i]);
            stop = System.nanoTime();
            System.out.println("\ttreeMap    -> " + (stop-start)+"ns");

//Wyszukiwanie w HashMap t3
            start = System.nanoTime();
            for(int i=0; i< t3.length; i++)
                hashMap.containsKey(t3[i]);
            stop = System.nanoTime();
            System.out.println("\thashMap    -> " + (stop-start)+"ns");


//czasy dla ArrayList i LinkedList: for, for-each, iterator

            System.out.println("\nArrayList");

            start = System.nanoTime();
            for(int i=0; i<arrayList.size(); i++)
                arrayList.get(i);
            stop = System.nanoTime();
            System.out.println("\tfor      -> " + (stop-start)+"ns");

            start = System.nanoTime();
            for(String s: arrayList);
            stop = System.nanoTime();
            System.out.println("\tfor-each -> " + (stop-start)+"ns");

            Iterator<String> iter = arrayList.iterator();
            start = System.nanoTime();
            while(iter.hasNext())
                iter.next();

            stop = System.nanoTime();
            System.out.println("\titerator -> " + (stop-start)+"ns");


            System.out.println("\nLinkedList");

            start = System.nanoTime();
            for(int i=0; i<linkedList.size(); i++)
                linkedList.get(i);
            stop = System.nanoTime();
            System.out.println("\tfor      -> " + (stop-start)+"ns");

            start = System.nanoTime();
            for(String s: linkedList);
            stop = System.nanoTime();
            System.out.println("\tfor-each -> " + (stop-start)+"ns");

            iter = linkedList.iterator();
            start = System.nanoTime();
            while(iter.hasNext())
                iter.next();

            stop = System.nanoTime();
            System.out.println("\titerator -> " + (stop-start)+"ns");

            System.out.println("\nUsuwanie");

//usuwanie ArrayList
            start = System.nanoTime();
            arrayList.clear();
            stop = System.nanoTime();
            System.out.println("\tarrayList  -> " + (stop-start)+"ns");

//usuwanie LinkedList
            start = System.nanoTime();
            linkedList.clear();
            stop = System.nanoTime();
            System.out.println("\tlinkedList -> " + (stop-start)+"ns");

//usuwanie TreeMap
            start = System.nanoTime();
            treeMap.clear();
            stop = System.nanoTime();
            System.out.println("\ttreeMap    -> " + (stop-start)+"ns");

//usuwanie HashMap
            start = System.nanoTime();
            hashMap.clear();
            stop = System.nanoTime();
            System.out.println("\thashMap    -> " + (stop-start)+"ns");


        }
        else System.out.println("Podaj dwa parametry wywolania - liczby calkowite (pierwsza wieksza od drugiej) ");
		
	}

    public static String randomString(int dl){
        StringBuilder str = new StringBuilder();
        String alf = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();
        for(int i=0; i<dl; i++)
            str.append(alf.charAt((int)(rnd.nextInt(alf.length()))));

        return str.toString();
    }
}


