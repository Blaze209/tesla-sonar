package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", i = {0, 0}, l = {91}, m = "openLoginUrl", n = {"this", "loginUri"}, s = {"L$0", "L$1"})
public final class C4502p1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4466l1 f48024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f48026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4466l1 f48027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4502p1(C4466l1 c4466l1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48027d = c4466l1;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48026c = obj;
        this.f48028e |= Integer.MIN_VALUE;
        return C4466l1.a(this.f48027d, (String) null, this);
    }
}
