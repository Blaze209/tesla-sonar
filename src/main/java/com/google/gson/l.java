package com.google.gson;

import bx.h0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l {
    @Deprecated
    public l() {
    }

    public i a() {
        if (g()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n b() {
        if (i()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public p d() {
        if (j()) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean g() {
        return this instanceof i;
    }

    public boolean h() {
        return this instanceof m;
    }

    public boolean i() {
        return this instanceof n;
    }

    public boolean j() {
        return this instanceof p;
    }

    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            ex.c cVar = new ex.c(h0.c(sb2));
            cVar.z0(u.LENIENT);
            h0.b(this, cVar);
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}
