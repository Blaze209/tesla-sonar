package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.OAuthPolling", f = "OAuthPolling.kt", i = {0, 0, 1, 1}, l = {43, 45}, m = "waitForOAuthComplete", n = {"this", "startTime", "this", "startTime"}, s = {"L$0", "J$0", "L$0", "J$0"})
public final class C4487n4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4496o4 f47927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f47929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4496o4 f47930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4487n4(C4496o4 c4496o4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47930d = c4496o4;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47929c = obj;
        this.f47931e |= Integer.MIN_VALUE;
        return this.f47930d.a(this);
    }
}
