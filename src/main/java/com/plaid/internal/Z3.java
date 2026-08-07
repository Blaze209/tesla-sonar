package com.plaid.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class Z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W3 f46846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X3 f46847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46848c;

    public class b {
    }

    static {
        O o11 = new O();
        f46846a = W3.INFO;
        f46847b = o11;
        f46848c = new a();
    }

    public class a implements X3 {
        @Override // com.plaid.internal.X3
        public final void a(W3 w11, String str) {
            try {
                Z3.f46847b.a(w11, str);
            } catch (Exception e11) {
                Log.e("ProveSDK", "log writer error!", e11);
            }
        }

        @Override // com.plaid.internal.X3
        public final void a(W3 w11, String str, Exception exc) {
            try {
                Z3.f46847b.a(w11, str, exc);
            } catch (Exception e11) {
                Log.e("ProveSDK", "log writer error!", e11);
            }
        }
    }
}
