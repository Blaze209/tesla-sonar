package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import com.squareup.moshi.u;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<u> f57748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<Context> f57749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<i.a> f57750c;

    public g(qj0.i<u> iVar, qj0.i<Context> iVar2, qj0.i<i.a> iVar3) {
        this.f57748a = iVar;
        this.f57749b = iVar2;
        this.f57750c = iVar3;
    }

    public static g a(qj0.i<u> iVar, qj0.i<Context> iVar2, qj0.i<i.a> iVar3) {
        return new g(iVar, iVar2, iVar3);
    }

    public static f c(u uVar, Context context, i.a aVar, int i11) {
        return new f(uVar, context, aVar, i11);
    }

    public f b(int i11) {
        return c(this.f57748a.get(), this.f57749b.get(), this.f57750c.get(), i11);
    }
}
