package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", i = {}, l = {67}, m = "doOnStart", n = {}, s = {})
public final class C4475m1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f47864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4466l1 f47865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4475m1(C4466l1 c4466l1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47865b = c4466l1;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47864a = obj;
        this.f47866c |= Integer.MIN_VALUE;
        return this.f47865b.a(this);
    }
}
