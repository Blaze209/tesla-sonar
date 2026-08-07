package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.sna.TwilioAuthController", f = "TwilioAuthController.kt", i = {0, 0}, l = {25, 42}, m = "asyncAuthentication", n = {"this", "twilioSnaRequest"}, s = {"L$0", "L$1"})
public final class C4481m7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4499o7 f47878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4508p7 f47879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f47880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4499o7 f47881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4481m7(C4499o7 c4499o7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47881d = c4499o7;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47880c = obj;
        this.f47882e |= Integer.MIN_VALUE;
        return this.f47881d.a(null, this);
    }
}
