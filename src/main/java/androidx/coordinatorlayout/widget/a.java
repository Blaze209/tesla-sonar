package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.collection.x0;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import u5.f;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f<ArrayList<T>> f7423a = new Pools$SimplePool(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0<T, ArrayList<T>> f7424b = new x0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f7425c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<T> f7426d = new HashSet<>();

    private void e(T t11, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t11)) {
            return;
        }
        if (hashSet.contains(t11)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t11);
        ArrayList<T> arrayList2 = this.f7424b.get(t11);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                e(arrayList2.get(i11), arrayList, hashSet);
            }
        }
        hashSet.remove(t11);
        arrayList.add(t11);
    }

    @NonNull
    private ArrayList<T> f() {
        ArrayList<T> arrayListB = this.f7423a.b();
        return arrayListB == null ? new ArrayList<>() : arrayListB;
    }

    private void l(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.f7423a.a(arrayList);
    }

    public void a(@NonNull T t11, @NonNull T t12) {
        if (!this.f7424b.containsKey(t11) || !this.f7424b.containsKey(t12)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f7424b.get(t11);
        if (arrayListF == null) {
            arrayListF = f();
            this.f7424b.put(t11, arrayListF);
        }
        arrayListF.add(t12);
    }

    public void b(@NonNull T t11) {
        if (this.f7424b.containsKey(t11)) {
            return;
        }
        this.f7424b.put(t11, null);
    }

    public void c() {
        int size = this.f7424b.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<T> arrayListM = this.f7424b.m(i11);
            if (arrayListM != null) {
                l(arrayListM);
            }
        }
        this.f7424b.clear();
    }

    public boolean d(@NonNull T t11) {
        return this.f7424b.containsKey(t11);
    }

    public List<T> g(@NonNull T t11) {
        ArrayList<T> arrayListH = h(t11);
        if (arrayListH == null) {
            return null;
        }
        return new ArrayList(arrayListH);
    }

    ArrayList<T> h(@NonNull T t11) {
        return this.f7424b.get(t11);
    }

    public List<T> i(@NonNull T t11) {
        int size = this.f7424b.getSize();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<T> arrayListM = this.f7424b.m(i11);
            if (arrayListM != null && arrayListM.contains(t11)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f7424b.i(i11));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> j() {
        this.f7425c.clear();
        this.f7426d.clear();
        int size = this.f7424b.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            e(this.f7424b.i(i11), this.f7425c, this.f7426d);
        }
        return this.f7425c;
    }

    public boolean k(@NonNull T t11) {
        int size = this.f7424b.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<T> arrayListM = this.f7424b.m(i11);
            if (arrayListM != null && arrayListM.contains(t11)) {
                return true;
            }
        }
        return false;
    }
}
