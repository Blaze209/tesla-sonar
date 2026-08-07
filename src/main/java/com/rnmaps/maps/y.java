package com.rnmaps.maps;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public class y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static y f49345g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedList<l> f49347b = new LinkedList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49348c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f49350e = 40;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LinkedList<l> f49351f = new LinkedList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f49346a = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f49349d = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.h();
            if (y.this.f49347b.size() > 0) {
                y.this.f49346a.postDelayed(y.this.f49349d, 40L);
            } else {
                y.this.f49348c = false;
            }
        }
    }

    private y() {
    }

    static y f() {
        if (f49345g == null) {
            synchronized (y.class) {
                f49345g = new y();
            }
        }
        return f49345g;
    }

    public void e(l lVar) {
        this.f49347b.add(lVar);
        if (this.f49348c) {
            return;
        }
        this.f49348c = true;
        this.f49346a.postDelayed(this.f49349d, 40L);
    }

    public void g(l lVar) {
        this.f49347b.remove(lVar);
    }

    public void h() {
        for (l lVar : this.f49347b) {
            if (!lVar.A()) {
                this.f49351f.add(lVar);
            }
        }
        if (this.f49351f.size() > 0) {
            this.f49347b.removeAll(this.f49351f);
            this.f49351f.clear();
        }
    }
}
