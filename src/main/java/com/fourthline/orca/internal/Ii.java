package com.fourthline.orca.internal;

import java.io.File;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Ii implements InterfaceC3901uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f26311a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26312a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26314c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26312a = obj;
            this.f26314c |= Integer.MIN_VALUE;
            return Ii.this.a(null, null, this);
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26315a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ byte[] f26318d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, byte[] bArr, Continuation continuation) {
            super(2, continuation);
            this.f26317c = str;
            this.f26318d = bArr;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ii.this.new b(this.f26317c, this.f26318d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f26315a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            File file = new File(Ii.this.f26311a, this.f26317c);
            sn0.h.o(file, this.f26318d);
            return file.getAbsolutePath();
        }
    }

    public Ii(File destFolder) {
        p013kotlin.jvm.internal.s.k(destFolder, "destFolder");
        this.f26311a = destFolder;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3901uf
    public Object a(String str, byte[] bArr, Continuation continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f26314c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f26314c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f26312a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f26314c;
        if (i12 == 0) {
            jn0.t.b(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            b bVar = new b(str, bArr, null);
            aVar.f26314c = 1;
            objWithContext = BuildersKt.withContext(io2, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objWithContext);
        }
        p013kotlin.jvm.internal.s.j(objWithContext, "withContext(...)");
        return objWithContext;
    }
}
