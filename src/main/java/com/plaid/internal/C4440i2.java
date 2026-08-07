package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel", f = "LinkActivityViewModel.kt", i = {}, l = {105}, m = "onBackPressed", n = {}, s = {})
public final class C4440i2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f47728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4449j2 f47729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4440i2(C4449j2 c4449j2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f47729b = c4449j2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47728a = obj;
        this.f47730c |= Integer.MIN_VALUE;
        return this.f47729b.a(this);
    }
}
