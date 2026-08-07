package s7;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    private i() {
    }

    public static HashMap<String, String> a(Bundle bundle) {
        HashMap<String, String> map = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static com.google.common.collect.z<String, String> b(Bundle bundle) {
        return bundle == Bundle.EMPTY ? com.google.common.collect.z.m() : com.google.common.collect.z.d(a(bundle));
    }

    public static void c(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) q0.l(i.class.getClassLoader()));
        }
    }

    public static <T> com.google.common.collect.x<T> d(ou.h<Bundle, T> hVar, List<Bundle> list) {
        com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        for (int i11 = 0; i11 < list.size(); i11++) {
            aVarK.a(hVar.apply((Bundle) a.f(list.get(i11))));
        }
        return aVarK.k();
    }

    public static Bundle e(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList<Integer> f(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle g(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> ArrayList<Bundle> h(Collection<T> collection, ou.h<T, Bundle> hVar) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(hVar.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> com.google.common.collect.x<Bundle> i(List<T> list, ou.h<T, Bundle> hVar) {
        com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        for (int i11 = 0; i11 < list.size(); i11++) {
            aVarK.a(hVar.apply(list.get(i11)));
        }
        return aVarK.k();
    }

    public static <T> SparseArray<Bundle> j(SparseArray<T> sparseArray, ou.h<T, Bundle> hVar) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            sparseArray2.put(sparseArray.keyAt(i11), hVar.apply(sparseArray.valueAt(i11)));
        }
        return sparseArray2;
    }
}
