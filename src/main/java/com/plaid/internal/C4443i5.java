package com.plaid.internal;

import java.io.File;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4443i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f47738a;

    public C4443i5(File rootDirectory, String directory) {
        p013kotlin.jvm.internal.s.k(rootDirectory, "rootDirectory");
        p013kotlin.jvm.internal.s.k(directory, "directory");
        this.f47738a = new File(rootDirectory, directory);
    }

    public final Object a(SuspendLambda suspendLambda) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C4407e5(this, null), suspendLambda);
    }

    public final Object a(String str, SuspendLambda suspendLambda) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C4425g5(this, str, null), suspendLambda);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
    }
}
