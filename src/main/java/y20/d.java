package y20;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0005B;\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\r2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJq\u0010\u001a\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0011\"\u0004\b\u0005\u0010\u00122\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00132\u0006\u0010\u0015\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00020\u00162$\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010!\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R,\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Ly20/d;", "P", "S", Gender.OTHER, "Ly20/a;", "Ly20/h;", "Ly20/r;", "baseRenderContext", "Ly20/t$b;", "interceptor", "<init>", "(Ly20/a;Ly20/t$b;)V", "value", "Ljn0/h0;", "f", "(Ly20/r;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Ly20/q;", "child", "props", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "handler", DateTokenConverter.CONVERTER_KEY, "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "sideEffect", "a", "(Ljava/lang/String;Lwn0/p;)V", "Ly20/a;", "b", "Ly20/t$b;", "c", "()Ly20/h;", "actionSink", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class d<P, S, O> implements y20.a<P, S, O>, h<r<? super P, S, ? extends O>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y20.a<P, S, O> baseRenderContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t.b<P, S, O> interceptor;

    /* JADX INFO: Add missing generic type declarations: [ChildOutputT, ChildRenderingT, ChildPropsT] */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f0\u000bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"ChildPropsT", "ChildOutputT", "ChildRenderingT", "P", "S", Gender.OTHER, "Ly20/q;", "iChild", "iProps", "", "iKey", "Lkotlin/Function1;", "Ly20/r;", "iHandler", "a", "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class a<ChildOutputT, ChildPropsT, ChildRenderingT> extends p013kotlin.jvm.internal.u implements wn0.r<q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT>, ChildPropsT, String, wn0.l<? super ChildOutputT, ? extends r<? super P, S, ? extends O>>, ChildRenderingT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d<P, S, O> f124670c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d<P, S, O> dVar) {
            super(4);
            this.f124670c = dVar;
        }

        @Override // wn0.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChildRenderingT invoke(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> iChild, ChildPropsT childpropst, String iKey, wn0.l<? super ChildOutputT, ? extends r<? super P, S, ? extends O>> iHandler) {
            p013kotlin.jvm.internal.s.k(iChild, "iChild");
            p013kotlin.jvm.internal.s.k(iKey, "iKey");
            p013kotlin.jvm.internal.s.k(iHandler, "iHandler");
            return (ChildRenderingT) ((d) this.f124670c).baseRenderContext.d(iChild, childpropst, iKey, iHandler);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"P", "S", Gender.OTHER, "", "iKey", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "iSideEffect", "a", "(Ljava/lang/String;Lwn0/l;)V"}, k = 3, mv = {1, 6, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<String, wn0.l<? super Continuation<? super h0>, ? extends Object>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d<P, S, O> f124671c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P", "S", Gender.OTHER, "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$1$1", f = "WorkflowInterceptor.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f124672n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ wn0.l<Continuation<? super h0>, Object> f124673o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(wn0.l<? super Continuation<? super h0>, ? extends Object> lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f124673o = lVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f124673o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f124672n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    wn0.l<Continuation<? super h0>, Object> lVar = this.f124673o;
                    this.f124672n = 1;
                    if (lVar.invoke(this) == coroutine_suspended) {
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
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d<P, S, O> dVar) {
            super(2);
            this.f124671c = dVar;
        }

        public final void a(String iKey, wn0.l<? super Continuation<? super h0>, ? extends Object> iSideEffect) {
            p013kotlin.jvm.internal.s.k(iKey, "iKey");
            p013kotlin.jvm.internal.s.k(iSideEffect, "iSideEffect");
            ((d) this.f124671c).baseRenderContext.a(iKey, new a(iSideEffect, null));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(String str, wn0.l<? super Continuation<? super h0>, ? extends Object> lVar) {
            a(str, lVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"P", "S", Gender.OTHER, "Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$withScopeReceiver$1", f = "WorkflowInterceptor.kt", i = {}, l = {EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124674n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ wn0.p<CoroutineScope, Continuation<? super h0>, Object> f124675o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d<P, S, O> f124676p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, d<P, S, O> dVar, Continuation<? super c> continuation) {
            super(1, continuation);
            this.f124675o = pVar;
            this.f124676p = dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new c(this.f124675o, this.f124676p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f124674n;
            if (i11 == 0) {
                jn0.t.b(obj);
                wn0.p<CoroutineScope, Continuation<? super h0>, Object> pVar = this.f124675o;
                CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(getContext());
                this.f124674n = 1;
                if (pVar.invoke(CoroutineScope, this) == coroutine_suspended) {
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

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((c) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: y20.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"P", "S", Gender.OTHER, "Ly20/r;", "interceptedAction", "Ljn0/h0;", "a", "(Ly20/r;)V"}, k = 3, mv = {1, 6, 0})
    static final class C2693d extends p013kotlin.jvm.internal.u implements wn0.l<r<? super P, S, ? extends O>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d<P, S, O> f124677c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2693d(d<P, S, O> dVar) {
            super(1);
            this.f124677c = dVar;
        }

        public final void a(r<? super P, S, ? extends O> interceptedAction) {
            p013kotlin.jvm.internal.s.k(interceptedAction, "interceptedAction");
            ((d) this.f124677c).baseRenderContext.c().b(interceptedAction);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            a((r) obj);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(y20.a<? extends P, S, ? super O> baseRenderContext, t.b<P, S, O> interceptor) {
        p013kotlin.jvm.internal.s.k(baseRenderContext, "baseRenderContext");
        p013kotlin.jvm.internal.s.k(interceptor, "interceptor");
        this.baseRenderContext = baseRenderContext;
        this.interceptor = interceptor;
    }

    @Override // y20.a
    public void a(String key, wn0.p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> sideEffect) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(sideEffect, "sideEffect");
        this.interceptor.a(key, new c(sideEffect, this, null), new b(this));
    }

    @Override // y20.a
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT d(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, wn0.l<? super ChildOutputT, ? extends r<? super P, S, ? extends O>> handler) {
        p013kotlin.jvm.internal.s.k(child, "child");
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(handler, "handler");
        return (ChildRenderingT) this.interceptor.c(child, props, key, handler, new a(this));
    }

    @Override // y20.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void b(r<? super P, S, ? extends O> value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.interceptor.b(value, new C2693d(this));
    }

    @Override // y20.a
    public h<r<? super P, S, ? extends O>> c() {
        return this;
    }
}
