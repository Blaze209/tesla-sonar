package io.ktor.utils.io;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lio/ktor/utils/io/j;", "", "desiredSpace", "Lll0/a;", "e", "(Lio/ktor/utils/io/j;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buffer", "written", "Ljn0/h0;", "c", "(Lio/ktor/utils/io/j;Lll0/a;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Lio/ktor/utils/io/j;Lll0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/x;", "session", "g", "(Lio/ktor/utils/io/x;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "()Lll0/a;", "h", "(Lio/ktor/utils/io/j;)Lio/ktor/utils/io/x;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.WriterSessionKt", f = "WriterSession.kt", i = {0}, l = {83}, m = "completeWritingFallback", n = {"buffer"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78849n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f78850o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f78851p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78850o = obj;
            this.f78851p |= Integer.MIN_VALUE;
            return w.d(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.WriterSessionKt", f = "WriterSession.kt", i = {0, 0}, l = {93}, m = "writeBufferSuspend", n = {"session", "desiredSpace"}, s = {"L$0", "I$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78852n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f78853o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78854p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f78855q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78854p = obj;
            this.f78855q |= Integer.MIN_VALUE;
            return w.g(null, 0, this);
        }
    }

    public static final Object c(j jVar, ll0.a aVar, int i11, Continuation<? super h0> continuation) {
        if (jVar instanceof s) {
            ((s) jVar).d(i11);
            return h0.f84049a;
        }
        Object objD = d(jVar, aVar, continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(j jVar, ll0.a aVar, Continuation<? super h0> continuation) {
        a aVar2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f78851p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f78851p = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f78850o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f78851p;
        if (i12 == 0) {
            jn0.t.b(obj);
            if (!(aVar instanceof ml0.a)) {
                throw new UnsupportedOperationException("Only ChunkBuffer instance is supported.");
            }
            aVar2.f78849n = aVar;
            aVar2.f78851p = 1;
            if (jVar.k(aVar, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (ll0.a) aVar2.f78849n;
            jn0.t.b(obj);
        }
        ((ml0.a) aVar).E(ml0.a.INSTANCE.c());
        return h0.f84049a;
    }

    public static final Object e(j jVar, int i11, Continuation<? super ll0.a> continuation) {
        x xVarH = h(jVar);
        if (xVarH == null) {
            return f();
        }
        ml0.a aVarA = xVarH.a(i11);
        return aVarA != null ? aVarA : g(xVarH, i11, continuation);
    }

    private static final ll0.a f() {
        ml0.a aVarS2 = ml0.a.INSTANCE.c().S2();
        ml0.a aVar = aVarS2;
        aVar.t();
        aVar.p(8);
        return aVarS2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(x xVar, int i11, Continuation<? super ll0.a> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f78855q;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f78855q = i12 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f78854p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bVar.f78855q;
        if (i13 == 0) {
            jn0.t.b(obj);
            bVar.f78852n = xVar;
            bVar.f78853o = i11;
            bVar.f78855q = 1;
            if (xVar.b(i11, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = bVar.f78853o;
            xVar = (x) bVar.f78852n;
            jn0.t.b(obj);
        }
        ml0.a aVarA = xVar.a(i11);
        return aVarA != null ? aVarA : xVar.a(1);
    }

    private static final x h(j jVar) {
        if (jVar instanceof s) {
            return ((s) jVar).n();
        }
        return null;
    }
}
