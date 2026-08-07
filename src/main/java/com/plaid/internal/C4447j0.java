package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashWorkManager", f = "CrashWorkManager.kt", i = {0}, l = {30}, m = "storeCrashAndScheduleUpload", n = {"this"}, s = {"L$0"})
public final class C4447j0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4456k0 f47755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f47756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4456k0 f47757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4447j0(C4456k0 c4456k0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47757c = c4456k0;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47756b = obj;
        this.f47758d |= Integer.MIN_VALUE;
        return this.f47757c.a(null, this);
    }
}
