package com.google.gson;

import bx.b0;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0<String, l> f45011a = new b0<>(false);

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n) && ((n) obj).f45011a.equals(this.f45011a);
        }
        return true;
    }

    public int hashCode() {
        return this.f45011a.hashCode();
    }

    public void k(String str, l lVar) {
        b0<String, l> b0Var = this.f45011a;
        if (lVar == null) {
            lVar = m.f45010a;
        }
        b0Var.put(str, lVar);
    }

    public void l(String str, String str2) {
        k(str, str2 == null ? m.f45010a : new p(str2));
    }

    public Set<Map.Entry<String, l>> m() {
        return this.f45011a.entrySet();
    }

    public l n(String str) {
        return this.f45011a.get(str);
    }

    public boolean o(String str) {
        return this.f45011a.containsKey(str);
    }

    public Set<String> p() {
        return this.f45011a.keySet();
    }

    public l q(String str) {
        return this.f45011a.remove(str);
    }
}
