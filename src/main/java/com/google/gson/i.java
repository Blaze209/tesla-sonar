package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends l implements Iterable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<l> f44873a = new ArrayList<>();

    private l m() {
        int size = this.f44873a.size();
        if (size == 1) {
            return this.f44873a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    @Override // com.google.gson.l
    public long e() {
        return m().e();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i) && ((i) obj).f44873a.equals(this.f44873a);
        }
        return true;
    }

    @Override // com.google.gson.l
    public String f() {
        return m().f();
    }

    public int hashCode() {
        return this.f44873a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.f44873a.iterator();
    }

    public void k(l lVar) {
        if (lVar == null) {
            lVar = m.f45010a;
        }
        this.f44873a.add(lVar);
    }

    public l l(int i11) {
        return this.f44873a.get(i11);
    }

    public int size() {
        return this.f44873a.size();
    }
}
