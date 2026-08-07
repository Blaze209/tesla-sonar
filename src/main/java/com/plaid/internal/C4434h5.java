package com.plaid.internal;

import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$saveData$2", f = "PlaidDirectoryStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class C4434h5 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4443i5 f47711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f47713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4434h5(C4443i5 c4443i5, String str, String str2, Continuation<? super C4434h5> continuation) {
        super(2, continuation);
        this.f47711a = c4443i5;
        this.f47712b = str;
        this.f47713c = str2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4434h5(this.f47711a, this.f47712b, this.f47713c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return ((C4434h5) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        File parentDirectory = this.f47711a.f47738a;
        String fileName = this.f47712b;
        p013kotlin.jvm.internal.s.k(parentDirectory, "parentDirectory");
        p013kotlin.jvm.internal.s.k(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        } else {
            file.createNewFile();
        }
        sn0.h.q(file, this.f47713c, null, 2, null);
        return jn0.h0.f84049a;
    }
}
