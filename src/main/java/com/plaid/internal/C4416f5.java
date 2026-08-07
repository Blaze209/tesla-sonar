package com.plaid.internal;

import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$loadData$2", f = "PlaidDirectoryStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class C4416f5 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4443i5 f47660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47661b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4416f5(C4443i5 c4443i5, String str, Continuation<? super C4416f5> continuation) {
        super(2, continuation);
        this.f47660a = c4443i5;
        this.f47661b = str;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4416f5(this.f47660a, this.f47661b, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return new C4416f5(this.f47660a, this.f47661b, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        File parentDirectory = this.f47660a.f47738a;
        String fileName = this.f47661b;
        p013kotlin.jvm.internal.s.k(parentDirectory, "parentDirectory");
        p013kotlin.jvm.internal.s.k(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        return sn0.h.n(file, null, 1, null);
    }
}
