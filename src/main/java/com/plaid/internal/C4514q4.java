package com.plaid.internal;

import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.plaid.internal.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.di.OAuthRedirectUriStore", f = "OAuthRedirectUriStore.kt", i = {0, 1}, l = {20, 24}, m = "readOAuthRedirectUri", n = {"this", "uri"}, s = {"L$0", "L$0"})
public final class C4514q4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f48066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f48067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4522r4 f48068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4514q4(C4522r4 c4522r4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48068c = c4522r4;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48067b = obj;
        this.f48069d |= Integer.MIN_VALUE;
        return this.f48068c.a(this);
    }
}
