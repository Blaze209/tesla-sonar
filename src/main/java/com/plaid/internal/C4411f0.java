package com.plaid.internal;

import java.lang.reflect.Type;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage", f = "CrashStorage.kt", i = {0, 0}, l = {53}, m = "loadEvents", n = {"this", "eventType"}, s = {"L$0", "L$1"})
public final class C4411f0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4429h0 f47643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Type f47644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f47645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4429h0 f47646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4411f0(C4429h0 c4429h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47646d = c4429h0;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47645c = obj;
        this.f47647e |= Integer.MIN_VALUE;
        return C4429h0.a(this.f47646d, null, null, this);
    }
}
