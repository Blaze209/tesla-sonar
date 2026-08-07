package p028zk0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.ktor.utils.io.g;
import io.ktor.utils.io.u;
import jn0.h0;
import kotlinx.coroutines.GlobalScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aR\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lio/ktor/utils/io/g;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "contentLength", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "a", "(Lio/ktor/utils/io/g;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Long;Lwn0/q;)Lio/ktor/utils/io/g;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: zk0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "Ljn0/h0;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3}, l = {23, 24, 26, 31}, m = "invokeSuspend", n = {"$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "read", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "total", "bytesSend", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "I$0", "L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1"})
    static final class C2791a extends SuspendLambda implements p<u, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f128406n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f128407o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f128408p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f128409q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f128410r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        long f128411s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f128412t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f128413u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f128414v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f128415w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Long f128416x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ g f128417y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ q<Long, Long, Continuation<? super h0>, Object> f128418z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2791a(Long l11, g gVar, q<? super Long, ? super Long, ? super Continuation<? super h0>, ? extends Object> qVar, Continuation<? super C2791a> continuation) {
            super(2, continuation);
            this.f128416x = l11;
            this.f128417y = gVar;
            this.f128418z = qVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation<? super h0> continuation) {
            return ((C2791a) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2791a c2791a = new C2791a(this.f128416x, this.f128417y, this.f128418z, continuation);
            c2791a.f128415w = obj;
            return c2791a;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00f3 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:64:0x019f, B:40:0x00ed, B:42:0x00f3, B:45:0x010d, B:57:0x016f, B:61:0x0180), top: B:69:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:44:0x010b  */
        /* JADX WARN: Code duplicated, block: B:45:0x010d A[Catch: all -> 0x0022, PHI: r2 r3 r4 r6 r9 r10 r11 r12 r14 r16
          0x010d: PHI (r2v12 java.lang.Object) = (r2v33 java.lang.Object), (r2v19 java.lang.Object) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r3v5 nl0.f) = (r3v6 nl0.f), (r3v10 nl0.f) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r4v5 long) = (r4v6 long), (r4v10 long) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r6v5 long) = (r6v7 long), (r6v10 long) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r9v3 byte[]) = (r9v4 byte[]), (r9v8 byte[]) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r10v2 java.lang.Object) = (r10v6 java.lang.Object), (r10v8 java.lang.Object) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r11v4 wn0.q<java.lang.Long, java.lang.Long, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object>) = 
          (r11v5 wn0.q<java.lang.Long, java.lang.Long, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object>)
          (r11v8 wn0.q<java.lang.Long, java.lang.Long, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object>)
         binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r12v6 io.ktor.utils.io.g) = (r12v8 io.ktor.utils.io.g), (r12v11 io.ktor.utils.io.g) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r14v2 io.ktor.utils.io.u) = (r14v3 io.ktor.utils.io.u), (r14v6 io.ktor.utils.io.u) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r16v2 long) = (r16v3 long), (r16v5 long) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:64:0x019f, B:40:0x00ed, B:42:0x00f3, B:45:0x010d, B:57:0x016f, B:61:0x0180), top: B:69:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0135  */
        /* JADX WARN: Code duplicated, block: B:53:0x0161  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0161 -> B:18:0x0059). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 427
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p028zk0.a.C2791a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final g a(g gVar, CoroutineContext context, Long l11, q<? super Long, ? super Long, ? super Continuation<? super h0>, ? extends Object> listener) {
        s.k(gVar, "<this>");
        s.k(context, "context");
        s.k(listener, "listener");
        return io.ktor.utils.io.p.b(GlobalScope.INSTANCE, context, true, new C2791a(l11, gVar, listener, null)).getChannel();
    }
}
