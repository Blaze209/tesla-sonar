package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4572x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48210a;

    public C4572x0(String str) {
        W3 w11 = Z3.f46846a;
        this.f48210a = str.concat(": ");
    }

    public final String a(String str, Object... objArr) {
        if (objArr.length == 0) {
            return this.f48210a + str;
        }
        try {
            return this.f48210a + String.format(str, objArr);
        } catch (Exception e11) {
            return this.f48210a + str + "... {format error " + e11.getMessage() + "}";
        }
    }

    public final void a(W3 w11, String str, Object... objArr) {
        W3 w12 = Z3.f46846a;
        if (w11.f46792a <= Z3.f46846a.f46792a) {
            Z3.f46848c.a(w11, a(str, objArr));
        }
    }

    public final void a(Exception exc, String str) {
        W3 w11 = W3.ERROR;
        W3 w12 = Z3.f46846a;
        if (w11.f46792a <= Z3.f46846a.f46792a) {
            Z3.f46848c.a(w11, a(str, new Object[0]), exc);
        }
    }
}
