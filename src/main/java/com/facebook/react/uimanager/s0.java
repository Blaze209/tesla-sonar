package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes4.dex */
class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<i0> f23365a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseBooleanArray f23366b = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jn.g f23367c = new jn.g();

    public void a(i0 i0Var) {
        this.f23367c.a();
        this.f23365a.put(i0Var.getReactTag(), i0Var);
    }

    public void b(i0 i0Var) {
        this.f23367c.a();
        int reactTag = i0Var.getReactTag();
        this.f23365a.put(reactTag, i0Var);
        this.f23366b.put(reactTag, true);
    }

    public i0 c(int i11) {
        this.f23367c.a();
        return this.f23365a.get(i11);
    }

    public int d() {
        this.f23367c.a();
        return this.f23366b.size();
    }

    public int e(int i11) {
        this.f23367c.a();
        return this.f23366b.keyAt(i11);
    }

    public boolean f(int i11) {
        this.f23367c.a();
        return this.f23366b.get(i11);
    }

    public void g(int i11) {
        this.f23367c.a();
        if (!this.f23366b.get(i11)) {
            this.f23365a.remove(i11);
            return;
        }
        throw new IllegalViewOperationException("Trying to remove root node " + i11 + " without using removeRootNode!");
    }

    public void h(int i11) {
        this.f23367c.a();
        if (i11 == -1) {
            return;
        }
        if (this.f23366b.get(i11)) {
            this.f23365a.remove(i11);
            this.f23366b.delete(i11);
        } else {
            throw new IllegalViewOperationException("View with tag " + i11 + " is not registered as a root view");
        }
    }
}
