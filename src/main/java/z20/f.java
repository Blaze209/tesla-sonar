package z20;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import wn0.p;
import y20.q;
import y20.r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0005:\u0002&*BI\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014Jq\u0010\u001f\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0015\"\u0004\b\u0004\u0010\u0016\"\u0004\b\u0005\u0010\u00172\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00182\u0006\u0010\u001a\u001a\u00028\u00032\u0006\u0010\u001c\u001a\u00020\u001b2$\u0010\u001e\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J>\u0010&\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0#\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u0011R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\bX\u0088\u0004¢\u0006\u0006\n\u0004\b&\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R,\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010/R,\u00102\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lz20/f;", "PropsT", "StateT", "OutputT", "Ly20/a;", "Ly20/h;", "Ly20/r;", "Lz20/f$a;", "renderer", "Lz20/f$b;", "sideEffectRunner", "Lkotlinx/coroutines/channels/SendChannel;", "eventActionsChannel", "<init>", "(Lz20/f$a;Lz20/f$b;Lkotlinx/coroutines/channels/SendChannel;)V", "Ljn0/h0;", "e", "()V", "value", "g", "(Ly20/r;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Ly20/q;", "child", "props", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "handler", DateTokenConverter.CONVERTER_KEY, "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "sideEffect", "a", "(Ljava/lang/String;Lwn0/p;)V", "f", "Lz20/f$a;", "b", "Lz20/f$b;", "c", "Lkotlinx/coroutines/channels/SendChannel;", "", "Z", "frozen", "()Ly20/h;", "actionSink", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class f<PropsT, StateT, OutputT> implements y20.a<PropsT, StateT, OutputT>, y20.h<r<? super PropsT, StateT, ? extends OutputT>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a<PropsT, StateT, OutputT> renderer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b sideEffectRunner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SendChannel<r<? super PropsT, StateT, ? extends OutputT>> eventActionsChannel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean frozen;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\u00020\u0004Jq\u0010\u0010\u001a\u00028\b\"\u0004\b\u0006\u0010\u0005\"\u0004\b\u0007\u0010\u0006\"\u0004\b\b\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\b2\u0006\u0010\n\u001a\u00028\u00062\u0006\u0010\f\u001a\u00020\u000b2$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lz20/f$a;", "PropsT", "StateT", "OutputT", "", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Ly20/q;", "child", "props", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Ly20/r;", "handler", "a", "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;)Ljava/lang/Object;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface a<PropsT, StateT, OutputT> {
        <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT a(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, wn0.l<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lz20/f$b;", "", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "sideEffect", "a", "(Ljava/lang/String;Lwn0/p;)V", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface b {
        void a(String key, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> sideEffect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(a<PropsT, StateT, OutputT> renderer, b sideEffectRunner, SendChannel<? super r<? super PropsT, StateT, ? extends OutputT>> eventActionsChannel) {
        s.k(renderer, "renderer");
        s.k(sideEffectRunner, "sideEffectRunner");
        s.k(eventActionsChannel, "eventActionsChannel");
        this.renderer = renderer;
        this.sideEffectRunner = sideEffectRunner;
        this.eventActionsChannel = eventActionsChannel;
    }

    private final void e() {
        if (this.frozen) {
            throw new IllegalStateException("RenderContext cannot be used after render method returns.");
        }
    }

    @Override // y20.a
    public void a(String key, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> sideEffect) {
        s.k(key, "key");
        s.k(sideEffect, "sideEffect");
        e();
        this.sideEffectRunner.a(key, sideEffect);
    }

    @Override // y20.a
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT d(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, wn0.l<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        s.k(child, "child");
        s.k(key, "key");
        s.k(handler, "handler");
        e();
        return (ChildRenderingT) this.renderer.a(child, props, key, handler);
    }

    public final void f() {
        e();
        this.frozen = true;
    }

    @Override // y20.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(r<? super PropsT, StateT, ? extends OutputT> value) {
        s.k(value, "value");
        if (!this.frozen) {
            throw new UnsupportedOperationException(s.t("Expected sink to not be sent to until after the render pass. Received action: ", value));
        }
        this.eventActionsChannel.offer(value);
    }

    @Override // y20.a
    public y20.h<r<? super PropsT, StateT, ? extends OutputT>> c() {
        return this;
    }
}
