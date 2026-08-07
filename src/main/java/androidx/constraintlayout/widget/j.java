package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SparseIntArray f7383a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<Integer, HashSet<WeakReference<a>>> f7384b = new HashMap<>();

    public interface a {
    }

    public void a(int i11, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.f7384b.get(Integer.valueOf(i11));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f7384b.put(Integer.valueOf(i11), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
