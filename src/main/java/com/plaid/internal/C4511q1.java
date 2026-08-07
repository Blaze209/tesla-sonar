package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", i = {0, 0}, l = {97}, m = "pollOAuthResult", n = {"this", "oautStateId"}, s = {"L$0", "L$1"})
public final class C4511q1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4466l1 f48054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f48056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4466l1 f48057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4511q1(C4466l1 c4466l1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48057d = c4466l1;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48056c = obj;
        this.f48058e |= Integer.MIN_VALUE;
        return C4466l1.b(this.f48057d, null, this);
    }
}
