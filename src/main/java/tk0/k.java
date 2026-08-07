package tk0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import ll0.w;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import yk0.HttpResponseContainer;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0002\u001f!BO\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\u0010\n\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\n\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010$\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#¨\u0006%"}, d2 = {"Ltk0/k;", "", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charsets", "", "", "charsetQuality", "sendCharset", "responseCharsetFallback", "<init>", "(Ljava/util/Set;Ljava/util/Map;Ljava/nio/charset/Charset;Ljava/nio/charset/Charset;)V", "Lwk0/c;", "request", "", "content", "Lbl0/c;", "requestContentType", "e", "(Lwk0/c;Ljava/lang/String;Lbl0/c;)Ljava/lang/Object;", "Lpk0/a;", "call", "Lll0/o;", "body", DateTokenConverter.CONVERTER_KEY, "(Lpk0/a;Lll0/o;)Ljava/lang/String;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "c", "(Lwk0/c;)V", "a", "Ljava/nio/charset/Charset;", "b", "requestCharset", "Ljava/lang/String;", "acceptCharsetHeader", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl0.a<k> f114705e = new dl0.a<>("HttpPlainText");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Charset responseCharsetFallback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Charset requestCharset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String acceptCharsetHeader;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR*\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0007\u0010\u000fR*\u0010\u0017\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u00060\u0005j\u0002`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Ltk0/k$a;", "", "<init>", "()V", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "a", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "charsets", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "charsetQuality", "c", "Ljava/nio/charset/Charset;", DateTokenConverter.CONVERTER_KEY, "()Ljava/nio/charset/Charset;", "setSendCharset", "(Ljava/nio/charset/Charset;)V", "sendCharset", "setResponseCharsetFallback", "responseCharsetFallback", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Charset sendCharset;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<Charset> charsets = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<Charset, Float> charsetQuality = new LinkedHashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Charset responseCharsetFallback = p013kotlin.text.d.UTF_8;

        public final Map<Charset, Float> a() {
            return this.charsetQuality;
        }

        public final Set<Charset> b() {
            return this.charsets;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Charset getResponseCharsetFallback() {
            return this.responseCharsetFallback;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Charset getSendCharset() {
            return this.sendCharset;
        }
    }

    /* JADX INFO: renamed from: tk0.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltk0/k$b;", "Ltk0/i;", "Ltk0/k$a;", "Ltk0/k;", "<init>", "()V", "Lkotlin/Function1;", "Ljn0/h0;", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/l;)Ltk0/k;", "plugin", "Lok0/a;", "scope", "c", "(Ltk0/k;Lok0/a;)V", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Ldl0/a;", "getKey", "()Ldl0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements i<a, k> {

        /* JADX INFO: renamed from: tk0.k$b$a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "", "Lwk0/c;", "content", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$1", f = "HttpPlainText.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.q<hl0.e<Object, wk0.c>, Object, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f114713n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f114714o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f114715p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k f114716q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f114716q = kVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hl0.e<Object, wk0.c> eVar, Object obj, Continuation<? super h0> continuation) {
                a aVar = new a(this.f114716q, continuation);
                aVar.f114714o = eVar;
                aVar.f114715p = obj;
                return aVar.invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f114713n;
                if (i11 == 0) {
                    t.b(obj);
                    hl0.e eVar = (hl0.e) this.f114714o;
                    Object obj2 = this.f114715p;
                    this.f114716q.c((wk0.c) eVar.b());
                    if (!(obj2 instanceof String)) {
                        return h0.f84049a;
                    }
                    bl0.c cVarD = bl0.s.d((bl0.r) eVar.b());
                    if (cVarD != null && !p013kotlin.jvm.internal.s.f(cVarD.getContentType(), bl0.c.d.f17578a.a().getContentType())) {
                        return h0.f84049a;
                    }
                    Object objE = this.f114716q.e((wk0.c) eVar.b(), (String) obj2, cVarD);
                    this.f114714o = null;
                    this.f114713n = 1;
                    if (eVar.d(objE, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: tk0.k$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "Lyk0/d;", "Lpk0/a;", "<name for destructuring parameter 0>", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Lyk0/d;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$2", f = "HttpPlainText.kt", i = {0, 0}, l = {136, 138}, m = "invokeSuspend", n = {"$this$intercept", "info"}, s = {"L$0", "L$1"})
        static final class C2453b extends SuspendLambda implements wn0.q<hl0.e<HttpResponseContainer, pk0.a>, HttpResponseContainer, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f114717n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f114718o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f114719p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k f114720q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2453b(k kVar, Continuation<? super C2453b> continuation) {
                super(3, continuation);
                this.f114720q = kVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hl0.e<HttpResponseContainer, pk0.a> eVar, HttpResponseContainer httpResponseContainer, Continuation<? super h0> continuation) {
                C2453b c2453b = new C2453b(this.f114720q, continuation);
                c2453b.f114718o = eVar;
                c2453b.f114719p = httpResponseContainer;
                return c2453b.invokeSuspend(h0.f84049a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
            
                if (r3.d(r4, r12) == r0) goto L21;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r12.f114717n
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L29
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    jn0.t.b(r13)
                    r9 = r12
                    goto L8b
                L14:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1c:
                    java.lang.Object r1 = r12.f114719p
                    il0.a r1 = (il0.TypeInfo) r1
                    java.lang.Object r3 = r12.f114718o
                    hl0.e r3 = (hl0.e) r3
                    jn0.t.b(r13)
                    r9 = r12
                    goto L6a
                L29:
                    jn0.t.b(r13)
                    java.lang.Object r13 = r12.f114718o
                    hl0.e r13 = (hl0.e) r13
                    java.lang.Object r1 = r12.f114719p
                    yk0.d r1 = (yk0.HttpResponseContainer) r1
                    il0.a r4 = r1.getExpectedType()
                    java.lang.Object r1 = r1.getResponse()
                    co0.d r5 = r4.a()
                    java.lang.Class<java.lang.String> r6 = java.lang.String.class
                    co0.d r6 = p013kotlin.jvm.internal.o0.b(r6)
                    boolean r5 = p013kotlin.jvm.internal.s.f(r5, r6)
                    if (r5 == 0) goto L50
                    boolean r5 = r1 instanceof io.ktor.utils.io.g
                    if (r5 != 0) goto L52
                L50:
                    r9 = r12
                    goto L8e
                L52:
                    r6 = r1
                    io.ktor.utils.io.g r6 = (io.ktor.utils.io.g) r6
                    r12.f114718o = r13
                    r12.f114719p = r4
                    r12.f114717n = r3
                    r7 = 0
                    r10 = 1
                    r11 = 0
                    r9 = r12
                    java.lang.Object r1 = io.ktor.utils.io.g.b.a(r6, r7, r9, r10, r11)
                    if (r1 != r0) goto L67
                    goto L8a
                L67:
                    r3 = r13
                    r13 = r1
                    r1 = r4
                L6a:
                    ll0.k r13 = (ll0.k) r13
                    tk0.k r4 = r9.f114720q
                    java.lang.Object r5 = r3.b()
                    pk0.a r5 = (pk0.a) r5
                    java.lang.String r13 = r4.d(r5, r13)
                    yk0.d r4 = new yk0.d
                    r4.<init>(r1, r13)
                    r13 = 0
                    r9.f114718o = r13
                    r9.f114719p = r13
                    r9.f114717n = r2
                    java.lang.Object r13 = r3.d(r4, r12)
                    if (r13 != r0) goto L8b
                L8a:
                    return r0
                L8b:
                    jn0.h0 r13 = jn0.h0.f84049a
                    return r13
                L8e:
                    jn0.h0 r13 = jn0.h0.f84049a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: tk0.k.Companion.C2453b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(k plugin, ok0.a scope) {
            p013kotlin.jvm.internal.s.k(plugin, "plugin");
            p013kotlin.jvm.internal.s.k(scope, "scope");
            scope.getRequestPipeline().l(wk0.f.INSTANCE.b(), new a(plugin, null));
            scope.getResponsePipeline().l(yk0.f.INSTANCE.c(), new C2453b(plugin, null));
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k a(wn0.l<? super a, h0> block) {
            p013kotlin.jvm.internal.s.k(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new k(aVar.b(), aVar.a(), aVar.getSendCharset(), aVar.getResponseCharsetFallback());
        }

        @Override // tk0.i
        public dl0.a<k> getKey() {
            return k.f114705e;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(kl0.a.i((Charset) t11), kl0.a.i((Charset) t12));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d((Float) ((Pair) t12).f(), (Float) ((Pair) t11).f());
        }
    }

    public k(Set<? extends Charset> charsets, Map<Charset, Float> charsetQuality, Charset charset, Charset responseCharsetFallback) {
        p013kotlin.jvm.internal.s.k(charsets, "charsets");
        p013kotlin.jvm.internal.s.k(charsetQuality, "charsetQuality");
        p013kotlin.jvm.internal.s.k(responseCharsetFallback, "responseCharsetFallback");
        this.responseCharsetFallback = responseCharsetFallback;
        List<Pair> listA1 = v.a1(v0.F(charsetQuality), new d());
        ArrayList arrayList = new ArrayList();
        for (Object obj : charsets) {
            if (!charsetQuality.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listA2 = v.a1(arrayList, new c());
        StringBuilder sb2 = new StringBuilder();
        for (Charset charset2 : listA2) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(kl0.a.i(charset2));
        }
        for (Pair pair : listA1) {
            Charset charset3 = (Charset) pair.a();
            float fFloatValue = ((Number) pair.b()).floatValue();
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            double d11 = fFloatValue;
            if (0.0d > d11 || d11 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb2.append(kl0.a.i(charset3) + ";q=" + (((double) yn0.a.d(100 * fFloatValue)) / 100.0d));
        }
        if (sb2.length() == 0) {
            sb2.append(kl0.a.i(this.responseCharsetFallback));
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        this.acceptCharsetHeader = string;
        if (charset == null && (charset = (Charset) v.q0(listA2)) == null) {
            Pair pair2 = (Pair) v.q0(listA1);
            charset = pair2 != null ? (Charset) pair2.e() : null;
            if (charset == null) {
                charset = p013kotlin.text.d.UTF_8;
            }
        }
        this.requestCharset = charset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(wk0.c request, String content, bl0.c requestContentType) {
        Charset charsetA;
        bl0.c cVarA = requestContentType == null ? bl0.c.d.f17578a.a() : requestContentType;
        if (requestContentType == null || (charsetA = bl0.d.a(requestContentType)) == null) {
            charsetA = this.requestCharset;
        }
        l.f114721a.trace("Sending request body to " + request.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String() + " as text/plain with charset " + charsetA);
        return new cl0.d(content, bl0.d.b(cVarA, charsetA), null, 4, null);
    }

    public final void c(wk0.c context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        bl0.l headers = context.getHeaders();
        bl0.o oVar = bl0.o.f17654a;
        if (headers.h(oVar.d()) != null) {
            return;
        }
        l.f114721a.trace("Adding Accept-Charset=" + this.acceptCharsetHeader + " to " + context.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String());
        context.getHeaders().k(oVar.d(), this.acceptCharsetHeader);
    }

    public final String d(pk0.a call, ll0.o body) {
        p013kotlin.jvm.internal.s.k(call, "call");
        p013kotlin.jvm.internal.s.k(body, "body");
        Charset charsetA = bl0.s.a(call.e());
        if (charsetA == null) {
            charsetA = this.responseCharsetFallback;
        }
        l.f114721a.trace("Reading response body for " + call.d().getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String() + " as String with charset " + charsetA);
        return w.e(body, charsetA, 0, 2, null);
    }
}
