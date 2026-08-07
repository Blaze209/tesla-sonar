package io.ktor.utils.io.jvm.javaio;

import ch.qos.logback.core.CoreConstants;
import io.ktor.utils.io.j;
import io.ktor.utils.io.u;
import java.io.IOException;
import java.io.InputStream;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/io/InputStream;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lnl0/f;", "", "pool", "Lio/ktor/utils/io/g;", "a", "(Ljava/io/InputStream;Lkotlin/coroutines/CoroutineContext;Lnl0/f;)Lio/ktor/utils/io/g;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "Ljn0/h0;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2", f = "Reading.kt", i = {0, 0}, l = {90}, m = "invokeSuspend", n = {"$this$writer", "buffer"}, s = {"L$0", "L$1"})
    static final class a extends SuspendLambda implements p<u, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78821n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f78822o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f78823p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ nl0.f<byte[]> f78824q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InputStream f78825r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(nl0.f<byte[]> fVar, InputStream inputStream, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f78824q = fVar;
            this.f78825r = inputStream;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation<? super h0> continuation) {
            return ((a) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f78824q, this.f78825r, continuation);
            aVar.f78823p = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            byte[] bArrS2;
            u uVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f78822o;
            if (i11 == 0) {
                t.b(obj);
                u uVar2 = (u) this.f78823p;
                bArrS2 = this.f78824q.S2();
                uVar = uVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArrS2 = (byte[]) this.f78821n;
                uVar = (u) this.f78823p;
                try {
                    t.b(obj);
                } catch (Throwable th2) {
                    try {
                        uVar.getChannel().close(th2);
                        this.f78824q.F1(bArrS2);
                    } finally {
                        this.f78824q.F1(bArrS2);
                        this.f78825r.close();
                    }
                }
            }
            while (true) {
                int i12 = this.f78825r.read(bArrS2, 0, bArrS2.length);
                if (i12 < 0) {
                    this.f78824q.F1(bArrS2);
                    return h0.f84049a;
                }
                if (i12 != 0) {
                    j channel = uVar.getChannel();
                    this.f78823p = uVar;
                    this.f78821n = bArrS2;
                    this.f78822o = 1;
                    if (channel.l(bArrS2, 0, i12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
    }

    public static final io.ktor.utils.io.g a(InputStream inputStream, CoroutineContext context, nl0.f<byte[]> pool) {
        s.k(inputStream, "<this>");
        s.k(context, "context");
        s.k(pool, "pool");
        return io.ktor.utils.io.p.b(GlobalScope.INSTANCE, context, true, new a(pool, inputStream, null)).getChannel();
    }

    public static /* synthetic */ io.ktor.utils.io.g b(InputStream inputStream, CoroutineContext coroutineContext, nl0.f fVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        if ((i11 & 2) != 0) {
            fVar = nl0.a.a();
        }
        return a(inputStream, coroutineContext, fVar);
    }
}
