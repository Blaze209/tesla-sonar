package y20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005:\u0001\u001aB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\"\u0010\u0015\u001a\u001e0\u0014R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H&¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ly20/k;", "PropsT", "StateT", "OutputT", "RenderingT", "Ly20/q;", "<init>", "()V", "props", "Ly20/i;", "snapshot", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ly20/i;)Ljava/lang/Object;", "old", "new", "state", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "renderProps", "renderState", "Ly20/k$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "f", "(Ljava/lang/Object;Ljava/lang/Object;Ly20/k$a;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Ly20/i;", "a", "()Ly20/k;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class k<PropsT, StateT, OutputT, RenderingT> implements q<PropsT, OutputT, RenderingT> {

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004Jt\u0010\u0010\u001a\u00028\u0006\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u0006\"\u0004\b\u0006\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\b2\u0006\u0010\n\u001a\u00028\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0012H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R,\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Ly20/k$a;", "Ly20/a;", "baseContext", "<init>", "(Ly20/k;Ly20/a;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Ly20/q;", "child", "props", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Ly20/r;", "handler", DateTokenConverter.CONVERTER_KEY, "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "sideEffect", "a", "(Ljava/lang/String;Lwn0/p;)V", "Ly20/h;", "c", "()Ly20/h;", "actionSink", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class a implements y20.a<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ y20.a<PropsT, StateT, OutputT> f124692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k<PropsT, StateT, OutputT, RenderingT> f124693b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(k this$0, y20.a<? extends PropsT, StateT, ? super OutputT> baseContext) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            p013kotlin.jvm.internal.s.k(baseContext, "baseContext");
            this.f124693b = this$0;
            this.f124692a = baseContext;
        }

        @Override // y20.a
        public void a(String key, wn0.p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> sideEffect) {
            p013kotlin.jvm.internal.s.k(key, "key");
            p013kotlin.jvm.internal.s.k(sideEffect, "sideEffect");
            this.f124692a.a(key, sideEffect);
        }

        @Override // y20.a
        public h<r<? super PropsT, StateT, ? extends OutputT>> c() {
            return this.f124692a.c();
        }

        @Override // y20.a
        public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT d(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, wn0.l<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
            p013kotlin.jvm.internal.s.k(child, "child");
            p013kotlin.jvm.internal.s.k(key, "key");
            p013kotlin.jvm.internal.s.k(handler, "handler");
            return (ChildRenderingT) this.f124692a.d(child, props, key, handler);
        }
    }

    public abstract StateT d(PropsT props, Snapshot snapshot);

    public abstract RenderingT f(PropsT renderProps, StateT renderState, k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>.a context);

    public abstract Snapshot g(StateT state);

    @Override // y20.q
    public final k<PropsT, StateT, OutputT, RenderingT> a() {
        return this;
    }

    public StateT e(PropsT old, PropsT propst, StateT state) {
        return state;
    }
}
