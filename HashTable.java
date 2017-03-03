
public class HashTable {
      
      private final static int TABLE_SIZE = 128;
      private final static double CONSTANTE = 0.6180339887;
      HashEntry[] table;
 
      HashTable() {
            table = new HashEntry[TABLE_SIZE];
            for (int i = 0; i < TABLE_SIZE; i++)
                  table[i] = null;
      } 

      public int size() {
            int cont = 0;
            for (int i = 0; i < TABLE_SIZE; i++)
                  if(table[i] != null){
                        cont++;
                  }
            return cont; 
      }

      public boolean isEmpty() {
            int tmp = size();

            if(tmp == 0){
                  return true;
            }else{
                  return false;
            }
      }

      public int get(int key) {
            int hash = multMethod(key);
            while (table[hash] != null){
                  hash = (hash + 1) % TABLE_SIZE;
            }
            if (table[hash] == null){
                  return -1;
            }
            else{
                  return table[hash].getValue();
            }
      }
 
      public void put(int key, int value) {
            int hash = multMethod(key);
            while (table[hash] != null){
                  hash = (hash + 1) % TABLE_SIZE;
            }
            table[hash] = new HashEntry(key, value);
      }

      public int multMethod(int key){

            //h(k) = [m·(kA mod 1)]

            int k = key;
            int m = TABLE_SIZE;

            double num = k * CONSTANTE;
            long iPart = (long) num;
            double fPart = num - iPart;

            int result = (int)Math.floor(m*(fPart));
            return result;

      }
}