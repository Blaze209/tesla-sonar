package com.plaid.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$listFileNames$2", f = "PlaidDirectoryStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class C4407e5 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super List<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4443i5 f47638a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4407e5(C4443i5 c4443i5, Continuation<? super C4407e5> continuation) {
        super(2, continuation);
        this.f47638a = c4443i5;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4407e5(this.f47638a, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
        return new C4407e5(this.f47638a, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listW1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        File[] fileArrListFiles = this.f47638a.f47738a.listFiles();
        if (fileArrListFiles == null || (listW1 = p013kotlin.collections.n.w1(fileArrListFiles)) == null) {
            return p013kotlin.collections.v.m();
        }
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listW1, 10));
        Iterator it = listW1.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getName());
        }
        return arrayList;
    }
}
