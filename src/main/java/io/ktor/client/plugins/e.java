package io.ktor.client.plugins;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import tk0.i;
import wk0.h;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0004\u000f\u0012\u0017\rB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\r\u001a\u00020\f2(\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010RE\u0010\u0016\u001a*\u0012&\u0012$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lio/ktor/client/plugins/e;", "", "", "maxSendCount", "<init>", "(I)V", "Lkotlin/Function3;", "Ltk0/q;", "Lwk0/c;", "Lkotlin/coroutines/Continuation;", "Lpk0/a;", "block", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lwn0/q;)V", "a", "I", "", "b", "Ljava/util/List;", "getInterceptors$annotations", "()V", "interceptors", "c", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl0.a<e> f78475d = new dl0.a<>("HttpSend");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxSendCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<q<tk0.q, wk0.c, Continuation<? super pk0.a>, Object>> interceptors;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/e$a;", "", "<init>", "()V", "", "a", "I", "()I", "setMaxSendCount", "(I)V", "maxSendCount", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int maxSendCount = 20;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getMaxSendCount() {
            return this.maxSendCount;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/e$b;", "Ltk0/q;", "", "maxSendCount", "Lok0/a;", "client", "<init>", "(ILok0/a;)V", "Lwk0/c;", "requestBuilder", "Lpk0/a;", "a", "(Lwk0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "b", "Lok0/a;", "c", "sentCount", DateTokenConverter.CONVERTER_KEY, "Lpk0/a;", "currentCall", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements tk0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int maxSendCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ok0.a client;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int sentCount;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private pk0.a currentCall;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", i = {0}, l = {138}, m = "execute", n = {"this"}, s = {"L$0"})
        static final class a extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f78483n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f78484o;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f78486q;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f78484o = obj;
                this.f78486q |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(int i11, ok0.a client) {
            s.k(client, "client");
            this.maxSendCount = i11;
            this.client = client;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // tk0.q
        public Object a(wk0.c cVar, Continuation<? super pk0.a> continuation) {
            a aVar;
            b bVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f78486q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f78486q = i11 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(continuation);
                }
            } else {
                aVar = new a(continuation);
            }
            Object objD = aVar.f78484o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = aVar.f78486q;
            if (i12 == 0) {
                t.b(objD);
                pk0.a aVar2 = this.currentCall;
                if (aVar2 != null) {
                    CoroutineScopeKt.cancel$default(aVar2, null, 1, null);
                }
                int i13 = this.sentCount;
                if (i13 >= this.maxSendCount) {
                    throw new SendCountExceedException("Max send count " + this.maxSendCount + " exceeded. Consider increasing the property maxSendCount if more is required.");
                }
                this.sentCount = i13 + 1;
                h sendPipeline = this.client.getSendPipeline();
                Object objD2 = cVar.getBody();
                aVar.f78483n = this;
                aVar.f78486q = 1;
                objD = sendPipeline.d(cVar, objD2, aVar);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) aVar.f78483n;
                t.b(objD);
            }
            pk0.a aVar3 = objD instanceof pk0.a ? (pk0.a) objD : null;
            if (aVar3 != null) {
                bVar.currentCall = aVar3;
                return aVar3;
            }
            throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + objD).toString());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B<\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\u0006\u0010\b\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR9\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/e$c;", "Ltk0/q;", "Lkotlin/Function3;", "Lwk0/c;", "Lkotlin/coroutines/Continuation;", "Lpk0/a;", "", "interceptor", "nextSender", "<init>", "(Lwn0/q;Ltk0/q;)V", "requestBuilder", "a", "(Lwk0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwn0/q;", "b", "Ltk0/q;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements tk0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q<tk0.q, wk0.c, Continuation<? super pk0.a>, Object> interceptor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final tk0.q nextSender;

        /* JADX WARN: Multi-variable type inference failed */
        public c(q<? super tk0.q, ? super wk0.c, ? super Continuation<? super pk0.a>, ? extends Object> interceptor, tk0.q nextSender) {
            s.k(interceptor, "interceptor");
            s.k(nextSender, "nextSender");
            this.interceptor = interceptor;
            this.nextSender = nextSender;
        }

        @Override // tk0.q
        public Object a(wk0.c cVar, Continuation<? super pk0.a> continuation) {
            return this.interceptor.invoke(this.nextSender, cVar, continuation);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.e$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/e$d;", "Ltk0/i;", "Lio/ktor/client/plugins/e$a;", "Lio/ktor/client/plugins/e;", "<init>", "()V", "Lkotlin/Function1;", "Ljn0/h0;", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/l;)Lio/ktor/client/plugins/e;", "plugin", "Lok0/a;", "scope", "c", "(Lio/ktor/client/plugins/e;Lok0/a;)V", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Ldl0/a;", "getKey", "()Ldl0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements i<a, e> {

        /* JADX INFO: renamed from: io.ktor.client.plugins.e$d$a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "", "Lwk0/c;", "content", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", i = {0}, l = {104, 105}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
        static final class a extends SuspendLambda implements q<hl0.e<Object, wk0.c>, Object, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f78489n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f78490o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f78491p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ e f78492q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ ok0.a f78493r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, ok0.a aVar, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f78492q = eVar;
                this.f78493r = aVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hl0.e<Object, wk0.c> eVar, Object obj, Continuation<? super h0> continuation) {
                a aVar = new a(this.f78492q, this.f78493r, continuation);
                aVar.f78490o = eVar;
                aVar.f78491p = obj;
                return aVar.invokeSuspend(h0.f84049a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
            
                if (r1.d((pk0.a) r11, r10) == r0) goto L21;
             */
            /* JADX WARN: Type inference failed for: r11v13, types: [T, io.ktor.client.plugins.e$b] */
            /* JADX WARN: Type inference failed for: r8v1, types: [T, io.ktor.client.plugins.e$c] */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 238
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.e.Companion.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(e plugin, ok0.a scope) {
            s.k(plugin, "plugin");
            s.k(scope, "scope");
            scope.getRequestPipeline().l(wk0.f.INSTANCE.c(), new a(plugin, scope, null));
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e a(l<? super a, h0> block) {
            s.k(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new e(aVar.getMaxSendCount(), null);
        }

        @Override // tk0.i
        public dl0.a<e> getKey() {
            return e.f78475d;
        }

        private Companion() {
        }
    }

    public /* synthetic */ e(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    public final void d(q<? super tk0.q, ? super wk0.c, ? super Continuation<? super pk0.a>, ? extends Object> block) {
        s.k(block, "block");
        this.interceptors.add(block);
    }

    private e(int i11) {
        this.maxSendCount = i11;
        this.interceptors = new ArrayList();
    }
}
