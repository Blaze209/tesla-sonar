package com.plaid.internal;

import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4582y1 implements Z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H5 f48224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pj0.a<wo0.b> f48225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorCoroutineDispatcher f48226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public N2 f48227d;

    public C4582y1(H5 plaidStorage, pj0.a<wo0.b> json) {
        p013kotlin.jvm.internal.s.k(plaidStorage, "plaidStorage");
        p013kotlin.jvm.internal.s.k(json, "json");
        this.f48224a = plaidStorage;
        this.f48225b = json;
        this.f48226c = ThreadPoolDispatcherKt.newSingleThreadContext("LinkStateStoreThreadSafe");
    }

    public static final N2 b(C4582y1 c4582y1) {
        c4582y1.getClass();
        try {
            try {
                H5 h11 = c4582y1.f48224a;
                h11.getClass();
                p013kotlin.jvm.internal.s.k("plaid_link_state", "fileName");
                File parentDirectory = h11.f46337a.getFilesDir();
                p013kotlin.jvm.internal.s.j(parentDirectory, "getFilesDir(...)");
                p013kotlin.jvm.internal.s.k(parentDirectory, "parentDirectory");
                p013kotlin.jvm.internal.s.k("plaid_link_state", "fileName");
                if (!parentDirectory.exists()) {
                    parentDirectory.mkdirs();
                }
                File file = new File(parentDirectory, "plaid_link_state");
                if (!file.exists()) {
                    file.createNewFile();
                }
                String strN = sn0.h.n(file, null, 1, null);
                if (strN != null && strN.length() != 0) {
                    return (N2) c4582y1.f48225b.get().d(N2.f46471a.getValue(), strN);
                }
            } catch (Exception e11) {
                X5.a.a(X5.f46812a, e11);
            }
            return N2.j.f46508b;
        } finally {
            c4582y1.f48224a.a();
        }
    }

    @Override // com.plaid.internal.Z2
    public final Object a(ContinuationImpl continuationImpl) {
        return BuildersKt.withContext(this.f48226c, new C4564w1(this, null), continuationImpl);
    }

    @Override // com.plaid.internal.Z2
    public final Object a(N2 n11, ContinuationImpl continuationImpl) {
        Object objWithContext = BuildersKt.withContext(this.f48226c, new C4573x1(n11, this, null), continuationImpl);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
    }

    public static final void b(C4582y1 c4582y1, N2 n11) throws IOException {
        c4582y1.getClass();
        if (n11 instanceof N2.b) {
            return;
        }
        c4582y1.f48224a.a("plaid_link_state", c4582y1.f48225b.get().b(N2.f46471a.getValue(), n11));
    }
}
