package tk0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import hl0.Phase;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ltk0/a;", "", "<init>", "()V", "Lok0/a;", "scope", "Ljn0/h0;", "c", "(Lok0/a;)V", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl0.a<a> f114655b = new dl0.a<>("BodyProgress");

    /* JADX INFO: renamed from: tk0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltk0/a$a;", "Ltk0/i;", "Ljn0/h0;", "Ltk0/a;", "<init>", "()V", "Lkotlin/Function1;", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/l;)Ltk0/a;", "plugin", "Lok0/a;", "scope", "c", "(Ltk0/a;Lok0/a;)V", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Ldl0/a;", "getKey", "()Ldl0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements i<h0, a> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(a plugin, ok0.a scope) throws hl0.b {
            p013kotlin.jvm.internal.s.k(plugin, "plugin");
            p013kotlin.jvm.internal.s.k(scope, "scope");
            plugin.c(scope);
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(wn0.l<? super h0, h0> block) {
            p013kotlin.jvm.internal.s.k(block, "block");
            return new a();
        }

        @Override // tk0.i
        public dl0.a<a> getKey() {
            return a.f114655b;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "", "Lwk0/c;", "content", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.plugins.BodyProgress$handle$1", f = "BodyProgress.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.q<hl0.e<Object, wk0.c>, Object, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f114656n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f114657o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f114658p;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hl0.e<Object, wk0.c> eVar, Object obj, Continuation<? super h0> continuation) {
            b bVar = new b(continuation);
            bVar.f114657o = eVar;
            bVar.f114658p = obj;
            return bVar.invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f114656n;
            if (i11 == 0) {
                t.b(obj);
                hl0.e eVar = (hl0.e) this.f114657o;
                Object obj2 = this.f114658p;
                wn0.q qVar = (wn0.q) ((wk0.c) eVar.b()).getAttributes().a(tk0.b.f114662a);
                if (qVar == null) {
                    return h0.f84049a;
                }
                p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
                qk0.a aVar = new qk0.a((cl0.b) obj2, ((wk0.c) eVar.b()).getExecutionContext(), qVar);
                this.f114657o = null;
                this.f114656n = 1;
                if (eVar.d(aVar, this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhl0/e;", "Lyk0/c;", "Ljn0/h0;", "response", "<anonymous>", "(Lhl0/e;Lyk0/c;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.plugins.BodyProgress$handle$2", f = "BodyProgress.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.q<hl0.e<yk0.c, h0>, yk0.c, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f114659n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f114660o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f114661p;

        c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hl0.e<yk0.c, h0> eVar, yk0.c cVar, Continuation<? super h0> continuation) {
            c cVar2 = new c(continuation);
            cVar2.f114660o = eVar;
            cVar2.f114661p = cVar;
            return cVar2.invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f114659n;
            if (i11 == 0) {
                t.b(obj);
                hl0.e eVar = (hl0.e) this.f114660o;
                yk0.c cVar = (yk0.c) this.f114661p;
                wn0.q qVar = (wn0.q) cVar.getCall().d().getAttributes().a(tk0.b.f114663b);
                if (qVar == null) {
                    return h0.f84049a;
                }
                yk0.c cVarC = tk0.b.c(cVar, qVar);
                this.f114660o = null;
                this.f114659n = 1;
                if (eVar.d(cVarC, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(ok0.a scope) throws hl0.b {
        Phase phase = new Phase("ObservableContent");
        scope.getRequestPipeline().j(wk0.f.INSTANCE.b(), phase);
        scope.getRequestPipeline().l(phase, new b(null));
        scope.getReceivePipeline().l(yk0.b.INSTANCE.a(), new c(null));
    }
}
