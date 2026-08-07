package io.ktor.client.plugins;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import tk0.i;
import tk0.j;
import tk0.m;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0002\u0007\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/d;", "", "", "checkHttpMethod", "allowHttpsDowngrade", "<init>", "(ZZ)V", "a", "Z", "b", "c", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl0.a<d> f78450d = new dl0.a<>("HttpRedirect");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final al0.a<yk0.c> f78451e = new al0.a<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean checkHttpMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean allowHttpsDowngrade;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lio/ktor/client/plugins/d$a;", "", "<init>", "()V", "", "a", "Z", "b", "()Z", "setCheckHttpMethod", "(Z)V", "checkHttpMethod", "setAllowHttpsDowngrade", "allowHttpsDowngrade", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean checkHttpMethod = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean allowHttpsDowngrade;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAllowHttpsDowngrade() {
            return this.allowHttpsDowngrade;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCheckHttpMethod() {
            return this.checkHttpMethod;
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lio/ktor/client/plugins/d$b;", "Ltk0/i;", "Lio/ktor/client/plugins/d$a;", "Lio/ktor/client/plugins/d;", "<init>", "()V", "Ltk0/q;", "Lwk0/c;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpk0/a;", "origin", "", "allowHttpsDowngrade", "Lok0/a;", "client", "e", "(Ltk0/q;Lwk0/c;Lpk0/a;ZLok0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Ljn0/h0;", "block", "g", "(Lwn0/l;)Lio/ktor/client/plugins/d;", "plugin", "scope", "f", "(Lio/ktor/client/plugins/d;Lok0/a;)V", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Ldl0/a;", "getKey", "()Ldl0/a;", "Lal0/a;", "Lyk0/c;", "HttpResponseRedirect", "Lal0/a;", DateTokenConverter.CONVERTER_KEY, "()Lal0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements i<a, d> {

        /* JADX INFO: renamed from: io.ktor.client.plugins.d$b$a */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "io.ktor.client.plugins.HttpRedirect$Plugin", f = "HttpRedirect.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {113}, m = "handleCall", n = {"this", "$this$handleCall", CoreConstants.CONTEXT_SCOPE_VALUE, "client", "call", "requestBuilder", "originProtocol", "originAuthority", "allowHttpsDowngrade"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0"})
        static final class a extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f78456n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f78457o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f78458p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f78459q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f78460r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f78461s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f78462t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f78463u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f78464v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            boolean f78465w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            /* synthetic */ Object f78466x;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            int f78468z;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f78466x = obj;
                this.f78468z |= Integer.MIN_VALUE;
                return Companion.this.e(null, null, null, false, null, this);
            }
        }

        /* JADX INFO: renamed from: io.ktor.client.plugins.d$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltk0/q;", "Lwk0/c;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpk0/a;", "<anonymous>", "(Ltk0/q;Lwk0/c;)Lpk0/a;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.HttpRedirect$Plugin$install$1", f = "HttpRedirect.kt", i = {0, 0}, l = {64, 69}, m = "invokeSuspend", n = {"$this$intercept", CoreConstants.CONTEXT_SCOPE_VALUE}, s = {"L$0", "L$1"})
        static final class C1670b extends SuspendLambda implements q<tk0.q, wk0.c, Continuation<? super pk0.a>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f78469n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f78470o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f78471p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ d f78472q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ ok0.a f78473r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1670b(d dVar, ok0.a aVar, Continuation<? super C1670b> continuation) {
                super(3, continuation);
                this.f78472q = dVar;
                this.f78473r = aVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(tk0.q qVar, wk0.c cVar, Continuation<? super pk0.a> continuation) {
                C1670b c1670b = new C1670b(this.f78472q, this.f78473r, continuation);
                c1670b.f78470o = qVar;
                c1670b.f78471p = cVar;
                return c1670b.invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                wk0.c cVar;
                tk0.q qVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f78469n;
                if (i11 == 0) {
                    t.b(obj);
                    tk0.q qVar2 = (tk0.q) this.f78470o;
                    cVar = (wk0.c) this.f78471p;
                    this.f78470o = qVar2;
                    this.f78471p = cVar;
                    this.f78469n = 1;
                    Object objA = qVar2.a(cVar, this);
                    if (objA != coroutine_suspended) {
                        qVar = qVar2;
                        obj = objA;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                cVar = (wk0.c) this.f78471p;
                tk0.q qVar3 = (tk0.q) this.f78470o;
                t.b(obj);
                qVar = qVar3;
                wk0.c cVar2 = cVar;
                pk0.a aVar = (pk0.a) obj;
                if (this.f78472q.checkHttpMethod && !m.f114722a.contains(aVar.d().getMethod())) {
                    return aVar;
                }
                Companion companion = d.INSTANCE;
                boolean z11 = this.f78472q.allowHttpsDowngrade;
                ok0.a aVar2 = this.f78473r;
                this.f78470o = null;
                this.f78471p = null;
                this.f78469n = 2;
                Object objE = companion.e(qVar, cVar2, aVar, z11, aVar2, this);
                return objE == coroutine_suspended ? coroutine_suspended : objE;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:20:0x0116  */
        /* JADX WARN: Code duplicated, block: B:22:0x011f  */
        /* JADX WARN: Code duplicated, block: B:30:0x0165  */
        /* JADX WARN: Code duplicated, block: B:33:0x01ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:37:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:39:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, tk0.q] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r19v0, types: [T, java.lang.Object, pk0.a] */
        /* JADX WARN: Type inference failed for: r1v11, types: [T] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v6, types: [T, wk0.c] */
        /* JADX WARN: Type inference failed for: r7v0, types: [T] */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, wk0.c] */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01ac -> B:35:0x01b2). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public final java.lang.Object e(tk0.q r17, wk0.c r18, pk0.a r19, boolean r20, ok0.a r21, p013kotlin.coroutines.Continuation<? super pk0.a> r22) {
            /*
                Method dump skipped, instruction units count: 465
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.d.Companion.e(tk0.q, wk0.c, pk0.a, boolean, ok0.a, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final al0.a<yk0.c> d() {
            return d.f78451e;
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(d plugin, ok0.a scope) {
            s.k(plugin, "plugin");
            s.k(scope, "scope");
            ((e) j.b(scope, e.INSTANCE)).d(new C1670b(plugin, scope, null));
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public d a(l<? super a, h0> block) {
            s.k(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new d(aVar.getCheckHttpMethod(), aVar.getAllowHttpsDowngrade(), null);
        }

        @Override // tk0.i
        public dl0.a<d> getKey() {
            return d.f78450d;
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12);
    }

    private d(boolean z11, boolean z12) {
        this.checkHttpMethod = z11;
        this.allowHttpsDowngrade = z12;
    }
}
