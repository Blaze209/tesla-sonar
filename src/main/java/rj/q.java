package rj;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.e> f108431a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.e> f108432b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f108433c;

    public boolean a(com.bumptech.glide.request.e eVar) {
        boolean z11 = true;
        if (eVar == null) {
            return true;
        }
        boolean zRemove = this.f108431a.remove(eVar);
        if (!this.f108432b.remove(eVar) && !zRemove) {
            z11 = false;
        }
        if (z11) {
            eVar.clear();
        }
        return z11;
    }

    public void b() {
        Iterator it = xj.l.k(this.f108431a).iterator();
        while (it.hasNext()) {
            a((com.bumptech.glide.request.e) it.next());
        }
        this.f108432b.clear();
    }

    public boolean c() {
        return this.f108433c;
    }

    public void d() {
        this.f108433c = true;
        for (com.bumptech.glide.request.e eVar : xj.l.k(this.f108431a)) {
            if (eVar.isRunning() || eVar.isComplete()) {
                eVar.clear();
                this.f108432b.add(eVar);
            }
        }
    }

    public void e() {
        this.f108433c = true;
        for (com.bumptech.glide.request.e eVar : xj.l.k(this.f108431a)) {
            if (eVar.isRunning()) {
                eVar.d();
                this.f108432b.add(eVar);
            }
        }
    }

    public void f() {
        for (com.bumptech.glide.request.e eVar : xj.l.k(this.f108431a)) {
            if (!eVar.isComplete() && !eVar.f()) {
                eVar.clear();
                if (this.f108433c) {
                    this.f108432b.add(eVar);
                } else {
                    eVar.i();
                }
            }
        }
    }

    public void g() {
        this.f108433c = false;
        for (com.bumptech.glide.request.e eVar : xj.l.k(this.f108431a)) {
            if (!eVar.isComplete() && !eVar.isRunning()) {
                eVar.i();
            }
        }
        this.f108432b.clear();
    }

    public void h(@NonNull com.bumptech.glide.request.e eVar) {
        this.f108431a.add(eVar);
        if (!this.f108433c) {
            eVar.i();
            return;
        }
        eVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f108432b.add(eVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f108431a.size() + ", isPaused=" + this.f108433c + "}";
    }
}
