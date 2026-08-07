package jx;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class i extends h {
    public i(ArrayList<q> arrayList) {
        super(g(arrayList));
    }

    private static ArrayList<hx.c> g(ArrayList<q> arrayList) {
        ArrayList<hx.c> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            throw new IllegalArgumentException("Tracks cannot be null");
        }
        Iterator<q> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        return arrayList2;
    }
}
