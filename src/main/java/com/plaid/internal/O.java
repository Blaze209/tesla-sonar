package com.plaid.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class O implements X3 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46543a;

        static {
            int[] iArr = new int[W3.values().length];
            f46543a = iArr;
            try {
                iArr[W3.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46543a[W3.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46543a[W3.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46543a[W3.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.plaid.internal.X3
    public final void a(W3 w11, String str) {
        int i11 = a.f46543a[w11.ordinal()];
        int i12 = 2;
        if (i11 != 1) {
            if (i11 == 2) {
                i12 = 3;
            } else if (i11 != 3) {
                i12 = 4;
                if (i11 == 4) {
                    i12 = 6;
                }
            } else {
                i12 = 5;
            }
        }
        Log.println(i12, "ProveSDK", str);
    }

    @Override // com.plaid.internal.X3
    public final void a(W3 w11, String str, Exception exc) {
        a(w11, str + '\n' + Log.getStackTraceString(exc));
    }
}
