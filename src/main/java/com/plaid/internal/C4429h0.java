package com.plaid.internal;

import java.lang.reflect.Type;
import java.util.UUID;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4429h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4443i5 f47698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4350b0 f47699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.gson.f f47700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Type f47701d;

    public C4429h0(C4443i5 storage, C4350b0 crashReportFactory) {
        p013kotlin.jvm.internal.s.k(storage, "storage");
        p013kotlin.jvm.internal.s.k(crashReportFactory, "crashReportFactory");
        this.f47698a = storage;
        this.f47699b = crashReportFactory;
        this.f47700c = new com.google.gson.f();
        this.f47701d = new C4359c0().getType();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C4429h0 c4429h0, String str, Type type, ContinuationImpl continuationImpl) {
        C4411f0 c4411f0;
        if (continuationImpl instanceof C4411f0) {
            c4411f0 = (C4411f0) continuationImpl;
            int i11 = c4411f0.f47647e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4411f0.f47647e = i11 - Integer.MIN_VALUE;
            } else {
                c4411f0 = new C4411f0(c4429h0, continuationImpl);
            }
        } else {
            c4411f0 = new C4411f0(c4429h0, continuationImpl);
        }
        Object objWithContext = c4411f0.f47645c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4411f0.f47647e;
        if (i12 == 0) {
            jn0.t.b(objWithContext);
            C4443i5 c4443i5 = c4429h0.f47698a;
            c4411f0.f47643a = c4429h0;
            c4411f0.f47644b = type;
            c4411f0.f47647e = 1;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C4416f5(c4443i5, str, null), c4411f0);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            type = c4411f0.f47644b;
            c4429h0 = c4411f0.f47643a;
            jn0.t.b(objWithContext);
        }
        Object objK = c4429h0.f47700c.k((String) objWithContext, type);
        p013kotlin.jvm.internal.s.j(objK, "fromJson(...)");
        return objK;
    }

    public static String a() {
        return UUID.randomUUID() + ".txt";
    }
}
