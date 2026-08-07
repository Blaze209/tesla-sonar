package yk0;

import bl0.s;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.q;
import co0.x;
import il0.TypeInfo;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import jn0.t;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import ll0.k;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007*\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lyk0/c;", "Ljn0/h0;", "c", "(Lyk0/c;)V", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "fallbackCharset", "", "a", "(Lyk0/c;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwk0/b;", DateTokenConverter.CONVERTER_KEY, "(Lyk0/c;)Lwk0/b;", "request", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {0}, l = {97}, m = "bodyAsText", n = {"decoder"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f125663n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f125664o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f125665p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125664o = obj;
            this.f125665p |= Integer.MIN_VALUE;
            return e.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(c cVar, Charset charset, Continuation<? super String> continuation) {
        a aVar;
        CharsetDecoder decoder;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f125665p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f125665p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f125664o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f125665p;
        if (i12 == 0) {
            t.b(objA);
            Charset charsetA = s.a(cVar);
            if (charsetA != null) {
                charset = charsetA;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            pk0.a aVarI = cVar.getCall();
            q qVarO = o0.o(k.class);
            TypeInfo typeInfoB = il0.b.b(x.f(qVarO), o0.b(k.class), qVarO);
            aVar.f125663n = charsetDecoderNewDecoder;
            aVar.f125665p = 1;
            objA = aVarI.a(typeInfoB, aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            decoder = charsetDecoderNewDecoder;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            decoder = (CharsetDecoder) aVar.f125663n;
            t.b(objA);
        }
        if (objA == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.ByteReadPacket");
        }
        p013kotlin.jvm.internal.s.j(decoder, "decoder");
        return kl0.b.b(decoder, (k) objA, 0, 2, null);
    }

    public static /* synthetic */ Object b(c cVar, Charset charset, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        return a(cVar, charset, continuation);
    }

    public static final void c(c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        CoroutineContext.Element element = cVar.getCoroutineContext().get(Job.INSTANCE);
        p013kotlin.jvm.internal.s.h(element);
        ((CompletableJob) element).complete();
    }

    public static final wk0.b d(c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        return cVar.getCall().d();
    }
}
