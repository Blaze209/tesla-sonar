package ts;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c {
    private c() {
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
            bundle.setClassLoader((ClassLoader) p0.j(c.class.getClassLoader()));
        }
    }

    public static <T extends com.google.android.exoplayer2.g> com.google.common.collect.x<T> d(com.google.android.exoplayer2.g.a<T> aVar, List<Bundle> list) {
        com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        for (int i11 = 0; i11 < list.size(); i11++) {
            aVarK.a(aVar.a((Bundle) a.e(list.get(i11))));
        }
        return aVarK.k();
    }

    public static <T extends com.google.android.exoplayer2.g> SparseArray<T> e(com.google.android.exoplayer2.g.a<T> aVar, SparseArray<Bundle> sparseArray) {
        com.google.android.material.internal.r rVar = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            rVar.put(sparseArray.keyAt(i11), aVar.a(sparseArray.valueAt(i11)));
        }
        return rVar;
    }

    public static Bundle f(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList<Integer> g(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle h(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T extends com.google.android.exoplayer2.g> ArrayList<Bundle> i(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    public static <T extends com.google.android.exoplayer2.g> SparseArray<Bundle> j(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            sparseArray2.put(sparseArray.keyAt(i11), sparseArray.valueAt(i11).toBundle());
        }
        return sparseArray2;
    }
}
