package com.plaid.internal;

import android.content.Context;
import com.plaid.internal.core.crashreporting.internal.CrashUploadWorker;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4456k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4429h0 f47783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V<?> f47784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashApiOptions f47785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.gson.f f47786e;

    public C4456k0(Context application, C4429h0 crashStorage, V<?> crashApiClass, CrashApiOptions crashApiOptions) {
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(crashStorage, "crashStorage");
        p013kotlin.jvm.internal.s.k(crashApiClass, "crashApiClass");
        p013kotlin.jvm.internal.s.k(crashApiOptions, "crashApiOptions");
        this.f47782a = application;
        this.f47783b = crashStorage;
        this.f47784c = crashApiClass;
        this.f47785d = crashApiOptions;
        this.f47786e = new com.google.gson.f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Crash crash, ContinuationImpl continuationImpl) {
        C4447j0 c4447j0;
        C4456k0 c4456k0;
        if (continuationImpl instanceof C4447j0) {
            c4447j0 = (C4447j0) continuationImpl;
            int i11 = c4447j0.f47758d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4447j0.f47758d = i11 - Integer.MIN_VALUE;
            } else {
                c4447j0 = new C4447j0(this, continuationImpl);
            }
        } else {
            c4447j0 = new C4447j0(this, continuationImpl);
        }
        Object obj = c4447j0.f47756b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4447j0.f47758d;
        if (i12 == 0) {
            jn0.t.b(obj);
            c4447j0.f47755a = this;
            c4447j0.f47758d = 1;
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C4420g0(this.f47783b, new Crash[]{crash}, null), c4447j0);
            if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objWithContext = jn0.h0.f84049a;
            }
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            c4456k0 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4456k0 = c4447j0.f47755a;
            jn0.t.b(obj);
        }
        c4456k0.getClass();
        androidx.work.g gVarA = new androidx.work.g.a().k("crashesApiClass", c4456k0.f47784c.f46756a).k("crashOptions", c4456k0.f47786e.s(c4456k0.f47785d)).a();
        p013kotlin.jvm.internal.s.j(gVarA, "build(...)");
        androidx.work.s0.e(c4456k0.f47782a).a(new androidx.work.c0.a(CrashUploadWorker.class).n(gVarA).b());
        return jn0.h0.f84049a;
    }
}
