package com.plaid.internal;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi", f = "SentryCrashApi.kt", i = {0}, l = {55}, m = "sendCrashes", n = {"results"}, s = {"L$0"})
public final class Q6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f46634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S6 f46636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46637d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6(S6 s11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46636c = s11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46635b = obj;
        this.f46637d |= Integer.MIN_VALUE;
        return this.f46636c.a((List) null, this);
    }
}
