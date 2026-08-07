package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.twilio.verify_sna.domain.twilioverifysna.ConcreteTwilioVerifySna", f = "ConcreteTwilioVerifySna.kt", i = {0}, l = {43}, m = "processUrl", n = {"this"}, s = {"L$0"})
public final class M extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N f46436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f46438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46438c = n11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46437b = obj;
        this.f46439d |= Integer.MIN_VALUE;
        return this.f46438c.a(null, this);
    }
}
