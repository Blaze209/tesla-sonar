package com.plaid.internal;

import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", i = {0, 0, 0, 0}, l = {395, WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "exitFromCurrentState", n = {"this", "state", "continuationToken", "backstack"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class R2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y2 f46643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N2 f46644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f46646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f46647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y2 f46648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46649g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(Y2 y11, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46648f = y11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f46647e = obj;
        this.f46649g |= Integer.MIN_VALUE;
        return this.f46648f.a(null, this);
    }
}
