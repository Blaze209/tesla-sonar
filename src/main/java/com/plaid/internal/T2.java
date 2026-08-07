package com.plaid.internal;

import java.util.List;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m = "next", n = {"this", "state", "backstack", "continuationToken"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class T2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y2 f46707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N2 f46708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f46709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f46711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y2 f46712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46713g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(Y2 y11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46712f = y11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46711e = obj;
        this.f46713g |= Integer.MIN_VALUE;
        return this.f46712f.a((N2) null, (List) null, this);
    }
}
