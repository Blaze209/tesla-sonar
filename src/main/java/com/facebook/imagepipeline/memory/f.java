package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
class f<V> extends a<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinkedList<tk.f<V>> f21717f;

    public f(int i11, int i12, int i13) {
        super(i11, i12, i13, false);
        this.f21717f = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.a
    void a(V v11) {
        tk.f<V> fVarPoll = this.f21717f.poll();
        if (fVarPoll == null) {
            fVarPoll = new tk.f<>();
        }
        fVarPoll.c(v11);
        this.f21709c.add(fVarPoll);
    }

    @Override // com.facebook.imagepipeline.memory.a
    public V g() {
        tk.f<V> fVar = (tk.f) this.f21709c.poll();
        k.g(fVar);
        V vB = fVar.b();
        fVar.a();
        this.f21717f.add(fVar);
        return vB;
    }
}
