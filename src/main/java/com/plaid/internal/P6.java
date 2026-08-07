package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", f = "SentryCrashApi.kt", i = {}, l = {41}, m = "sendCrash", n = {}, s = {})
public final class P6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S6 f46590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P6(S6 s11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46590b = s11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46589a = obj;
        this.f46591c |= Integer.MIN_VALUE;
        return this.f46590b.a((Crash) null, this);
    }
}
