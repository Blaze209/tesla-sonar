package com.plaid.internal;

import java.io.IOException;

/* JADX INFO: renamed from: com.plaid.internal.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4536t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4572x0 f48112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48114c;

    public C4536t0() {
        W3 w11 = Z3.f46846a;
        this.f48112a = new C4572x0("connectivity-validator");
        this.f48113b = "https://clients3.google.com/generate_204";
        this.f48114c = 10000;
    }

    public final boolean a(C4349b c4349b) {
        boolean z11;
        int i11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            z11 = false;
            try {
                InterfaceC4519r1.b bVarA = c4349b.a(new InterfaceC4519r1.a(this.f48113b, false, null, -1));
                this.f48112a.a(W3.TRACE, "response status " + bVarA.f48083b, new Object[0]);
                int i12 = bVarA.f48083b;
                if (i12 >= 200 && i12 < 300) {
                    z11 = true;
                }
            } catch (IOException e11) {
                this.f48112a.a(e11, "cannot reach test endpoint");
            }
            if (z11 || ((i11 = this.f48114c) > 0 && ((long) i11) + jCurrentTimeMillis <= System.currentTimeMillis())) {
                break;
            }
        }
        this.f48112a.a(W3.TRACE, "httpclient %s", z11 ? "online" : "offline");
        return z11;
    }
}
