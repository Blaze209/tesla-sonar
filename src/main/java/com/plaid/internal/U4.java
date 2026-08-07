package com.plaid.internal;

import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$readNoLoadingUi$2", f = "PlaidClientSideOnlyConfigurationStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class U4 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W4 f46741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(W4 w11, Continuation<? super U4> continuation) {
        super(2, continuation);
        this.f46741a = w11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new U4(this.f46741a, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return new U4(this.f46741a, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        H5 h11 = this.f46741a.f46793a;
        h11.getClass();
        p013kotlin.jvm.internal.s.k("plaid_no_loading_ui", "fileName");
        File parentDirectory = h11.f46337a.getFilesDir();
        p013kotlin.jvm.internal.s.j(parentDirectory, "getFilesDir(...)");
        p013kotlin.jvm.internal.s.k(parentDirectory, "parentDirectory");
        p013kotlin.jvm.internal.s.k("plaid_no_loading_ui", "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, "plaid_no_loading_ui");
        if (!file.exists()) {
            file.createNewFile();
        }
        return Boxing.boxBoolean(p013kotlin.jvm.internal.s.f(sn0.h.n(file, null, 1, null), "true"));
    }
}
