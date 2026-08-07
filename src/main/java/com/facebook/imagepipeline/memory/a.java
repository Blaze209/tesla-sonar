package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
class a<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Queue f21709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21711e;

    public a(int i11, int i12, int i13, boolean z11) {
        k.i(i11 > 0);
        k.i(i12 >= 0);
        k.i(i13 >= 0);
        this.f21707a = i11;
        this.f21708b = i12;
        this.f21709c = new LinkedList();
        this.f21711e = i13;
        this.f21710d = z11;
    }

    void a(V v11) {
        this.f21709c.add(v11);
    }

    public void b() {
        k.i(this.f21711e > 0);
        this.f21711e--;
    }

    @Deprecated
    public V c() {
        V vG = g();
        if (vG != null) {
            this.f21711e++;
        }
        return vG;
    }

    int d() {
        return this.f21709c.size();
    }

    public void e() {
        this.f21711e++;
    }

    public boolean f() {
        return this.f21711e + d() > this.f21708b;
    }

    public V g() {
        return (V) this.f21709c.poll();
    }

    public void h(V v11) {
        k.g(v11);
        if (this.f21710d) {
            k.i(this.f21711e > 0);
            this.f21711e--;
            a(v11);
        } else {
            int i11 = this.f21711e;
            if (i11 <= 0) {
                qk.a.o("BUCKET", "Tried to release value %s from an empty bucket!", v11);
            } else {
                this.f21711e = i11 - 1;
                a(v11);
            }
        }
    }
}
