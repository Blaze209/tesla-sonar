package dl0;

import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/g;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Pair;", "a", "(Lio/ktor/utils/io/g;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/Pair;", "", "b", "(Lio/ktor/utils/io/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", i = {0, 0, 1, 1}, l = {27, 31}, m = "invokeSuspend", n = {"$this$launch", "buffer", "$this$launch", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f60738n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f60739o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f60740p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.g f60741q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f60742r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f60743s;

        /* JADX INFO: renamed from: dl0.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1$1", f = "ByteChannels.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
        static final class C1239a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f60744n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.c f60745o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ byte[] f60746p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f60747q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1239a(io.ktor.utils.io.c cVar, byte[] bArr, int i11, Continuation<? super C1239a> continuation) {
                super(2, continuation);
                this.f60745o = cVar;
                this.f60746p = bArr;
                this.f60747q = i11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C1239a(this.f60745o, this.f60746p, this.f60747q, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f60744n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    io.ktor.utils.io.c cVar = this.f60745o;
                    byte[] bArr = this.f60746p;
                    int i12 = this.f60747q;
                    this.f60744n = 1;
                    if (cVar.l(bArr, 0, i12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C1239a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1$2", f = "ByteChannels.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f60748n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.c f60749o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ byte[] f60750p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f60751q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(io.ktor.utils.io.c cVar, byte[] bArr, int i11, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f60749o = cVar;
                this.f60750p = bArr;
                this.f60751q = i11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f60749o, this.f60750p, this.f60751q, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f60748n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    io.ktor.utils.io.c cVar = this.f60749o;
                    byte[] bArr = this.f60750p;
                    int i12 = this.f60751q;
                    this.f60748n = 1;
                    if (cVar.l(bArr, 0, i12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.utils.io.g gVar, io.ktor.utils.io.c cVar, io.ktor.utils.io.c cVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f60741q = gVar;
            this.f60742r = cVar;
            this.f60743s = cVar2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f60741q, this.f60742r, this.f60743s, continuation);
            aVar.f60740p = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0044 A[Catch: all -> 0x001a, PHI: r1 r4
          0x0044: PHI (r1v6 ??) = (r1v11 ??), (r1v12 ??), (r1v13 ??) binds: [B:16:0x0032, B:23:0x0097, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]
          0x0044: PHI (r4v2 kotlinx.coroutines.CoroutineScope) = 
          (r4v0 kotlinx.coroutines.CoroutineScope)
          (r4v1 kotlinx.coroutines.CoroutineScope)
          (r4v6 kotlinx.coroutines.CoroutineScope)
         binds: [B:16:0x0032, B:23:0x0097, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:17:0x0044, B:19:0x004c, B:22:0x005b, B:25:0x009a, B:29:0x00b4, B:14:0x002e), top: B:37:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x004c A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:17:0x0044, B:19:0x004c, B:22:0x005b, B:25:0x009a, B:29:0x00b4, B:14:0x002e), top: B:37:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x005a  */
        /* JADX WARN: Code duplicated, block: B:22:0x005b A[Catch: all -> 0x001a, PHI: r1 r4 r13
          0x005b: PHI (r1v5 ??) = (r1v14 ??), (r1v15 ??) binds: [B:20:0x0058, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x005b: PHI (r4v1 kotlinx.coroutines.CoroutineScope) = (r4v2 kotlinx.coroutines.CoroutineScope), (r4v4 kotlinx.coroutines.CoroutineScope) binds: [B:20:0x0058, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x005b: PHI (r13v9 java.lang.Object) = (r13v22 java.lang.Object), (r13v0 java.lang.Object) binds: [B:20:0x0058, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:17:0x0044, B:19:0x004c, B:22:0x005b, B:25:0x009a, B:29:0x00b4, B:14:0x002e), top: B:37:0x0008 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v5, types: [byte[], java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6, types: [byte[], java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0097 -> B:17:0x0044). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dl0.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f60752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f60753d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.ktor.utils.io.c cVar, io.ktor.utils.io.c cVar2) {
            super(1);
            this.f60752c = cVar;
            this.f60753d = cVar2;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                return;
            }
            this.f60752c.cancel(th2);
            this.f60753d.cancel(th2);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.util.ByteChannelsKt", f = "ByteChannels.kt", i = {}, l = {91}, m = "toByteArray", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f60754n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f60755o;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f60754n = obj;
            this.f60755o |= Integer.MIN_VALUE;
            return f.b(null, this);
        }
    }

    public static final Pair<io.ktor.utils.io.g, io.ktor.utils.io.g> a(io.ktor.utils.io.g gVar, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(gVar, "<this>");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        io.ktor.utils.io.c cVarA = io.ktor.utils.io.e.a(true);
        io.ktor.utils.io.c cVarA2 = io.ktor.utils.io.e.a(true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(gVar, cVarA, cVarA2, null), 3, null).invokeOnCompletion(new b(cVarA, cVarA2));
        return jn0.x.a(cVarA, cVarA2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object b(io.ktor.utils.io.g gVar, Continuation<? super byte[]> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f60755o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f60755o = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object objA = cVar2.f60754n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar2.f60755o;
        if (i12 == 0) {
            jn0.t.b(objA);
            cVar2.f60755o = 1;
            objA = io.ktor.utils.io.g.b.a(gVar, 0L, cVar2, 1, null);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objA);
        }
        return ll0.w.c((ll0.k) objA, 0, 1, null);
    }
}
