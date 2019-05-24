import java.util.ArrayList;

public class SumPrimesFast {


    public static void main(String[] args) {
        long sum = 0, startTime = System.currentTimeMillis();
        int first;
        ArrayList<Integer> mList = new ArrayList<>();
        ArrayList<Integer> msList = new ArrayList<>();
        ArrayList<Integer> pList = new ArrayList<>();
        boolean dontStop = true;

        for (int i = 2; i <= 2000000; i++) mList.add(i);

        while(dontStop){
            first = mList.get(0);
            pList.add(first);
            for(int i = 0; i<mList.size(); i++)
                if(mList.get(i)%first != 0) msList.add(mList.get(i));

            if(mList.size() - msList.size() == 1) dontStop = false;

            mList = msList;
            msList = new ArrayList<>();
        }

        for(int i = 0; i < pList.size(); i++) sum+=pList.get(i);
        for(int i = 0; i < mList.size(); i++) sum+=mList.get(i);

        System.out.println(sum + " " + (System.currentTimeMillis() - startTime));

    }
}
