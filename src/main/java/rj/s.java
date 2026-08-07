package rj;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<uj.j<?>> f108448a = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f108448a.clear();
    }

    @NonNull
    public List<uj.j<?>> b() {
        return xj.l.k(this.f108448a);
    }

    public void c(@NonNull uj.j<?> jVar) {
        this.f108448a.add(jVar);
    }

    public void d(@NonNull uj.j<?> jVar) {
        this.f108448a.remove(jVar);
    }

    @Override // rj.l
    public void onDestroy() {
        Iterator it = xj.l.k(this.f108448a).iterator();
        while (it.hasNext()) {
            ((uj.j) it.next()).onDestroy();
        }
    }

    @Override // rj.l
    public void onStart() {
        Iterator it = xj.l.k(this.f108448a).iterator();
        while (it.hasNext()) {
            ((uj.j) it.next()).onStart();
        }
    }

    @Override // rj.l
    public void onStop() {
        Iterator it = xj.l.k(this.f108448a).iterator();
        while (it.hasNext()) {
            ((uj.j) it.next()).onStop();
        }
    }
}
