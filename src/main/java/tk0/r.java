package tk0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \b2\u00020\u0001:\u0002\u0006\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltk0/r;", "", "", "agent", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl0.a<r> f114733c = new dl0.a<>("UserAgent");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String agent;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Ltk0/r$a;", "", "", "agent", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String agent;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAgent() {
            return this.agent;
        }

        public final void b(String str) {
            p013kotlin.jvm.internal.s.k(str, "<set-?>");
            this.agent = str;
        }

        public a(String agent) {
            p013kotlin.jvm.internal.s.k(agent, "agent");
            this.agent = agent;
        }

        public /* synthetic */ a(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "Ktor http-client" : str);
        }
    }

    /* JADX INFO: renamed from: tk0.r$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltk0/r$b;", "Ltk0/i;", "Ltk0/r$a;", "Ltk0/r;", "<init>", "()V", "Lkotlin/Function1;", "Ljn0/h0;", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/l;)Ltk0/r;", "plugin", "Lok0/a;", "scope", "c", "(Ltk0/r;Lok0/a;)V", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Ldl0/a;", "getKey", "()Ldl0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements i<a, r> {

        /* JADX INFO: renamed from: tk0.r$b$a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "", "Lwk0/c;", "it", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.UserAgent$Plugin$install$1", f = "UserAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.q<hl0.e<Object, wk0.c>, Object, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f114736n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f114737o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ r f114738p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f114738p = rVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hl0.e<Object, wk0.c> eVar, Object obj, Continuation<? super h0> continuation) {
                a aVar = new a(this.f114738p, continuation);
                aVar.f114737o = eVar;
                return aVar.invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f114736n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                hl0.e eVar = (hl0.e) this.f114737o;
                s.f114739a.trace("Adding User-Agent header: " + this.f114738p.getAgent() + " for " + ((wk0.c) eVar.b()).getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String());
                wk0.j.a((bl0.r) eVar.b(), bl0.o.f17654a.s(), this.f114738p.getAgent());
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(r plugin, ok0.a scope) {
            p013kotlin.jvm.internal.s.k(plugin, "plugin");
            p013kotlin.jvm.internal.s.k(scope, "scope");
            scope.getRequestPipeline().l(wk0.f.INSTANCE.d(), new a(plugin, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tk0.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r a(wn0.l<? super a, h0> block) {
            p013kotlin.jvm.internal.s.k(block, "block");
            a aVar = new a(null, 1, 0 == true ? 1 : 0);
            block.invoke(aVar);
            return new r(aVar.getAgent(), 0 == true ? 1 : 0);
        }

        @Override // tk0.i
        public dl0.a<r> getKey() {
            return r.f114733c;
        }

        private Companion() {
        }
    }

    public /* synthetic */ r(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAgent() {
        return this.agent;
    }

    private r(String str) {
        this.agent = str;
    }
}
