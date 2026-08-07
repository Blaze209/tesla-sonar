package y20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\"\u0007J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJQ\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J[\u0010\u0016\u001a\u00028\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u008d\u0001\u0010\u001f\u001a\u00028\u0003\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00192\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c22\u0010\u000f\u001a.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001e\u0012\u0004\u0012\u00028\u00030\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010\"\u001a\u0004\u0018\u00010\f\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0014\u001a\u00028\u00002\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Ly20/t;", "", "Lkotlinx/coroutines/CoroutineScope;", "workflowScope", "Ly20/t$c;", "session", "Ljn0/h0;", "c", "(Lkotlinx/coroutines/CoroutineScope;Ly20/t$c;)V", "P", "S", "props", "Ly20/i;", "snapshot", "Lkotlin/Function2;", "proceed", "a", "(Ljava/lang/Object;Ly20/i;Lwn0/p;Ly20/t$c;)Ljava/lang/Object;", "old", "new", "state", "Lkotlin/Function3;", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwn0/q;Ly20/t$c;)Ljava/lang/Object;", Gender.OTHER, "R", "renderProps", "renderState", "Ly20/a;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ly20/t$b;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;Ly20/a;Lwn0/q;Ly20/t$c;)Ljava/lang/Object;", "Lkotlin/Function1;", "b", "(Ljava/lang/Object;Lwn0/l;Ly20/t$c;)Ly20/i;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface t {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <P, S> S a(t tVar, P p11, Snapshot snapshot, wn0.p<? super P, ? super Snapshot, ? extends S> proceed, c session) {
            p013kotlin.jvm.internal.s.k(tVar, "this");
            p013kotlin.jvm.internal.s.k(proceed, "proceed");
            p013kotlin.jvm.internal.s.k(session, "session");
            return proceed.invoke(p11, snapshot);
        }

        public static <P, S> S b(t tVar, P p11, P p12, S s11, wn0.q<? super P, ? super P, ? super S, ? extends S> proceed, c session) {
            p013kotlin.jvm.internal.s.k(tVar, "this");
            p013kotlin.jvm.internal.s.k(proceed, "proceed");
            p013kotlin.jvm.internal.s.k(session, "session");
            return proceed.invoke(p11, p12, s11);
        }

        public static <P, S, O, R> R c(t tVar, P p11, S s11, y20.a<? extends P, S, ? super O> context, wn0.q<? super P, ? super S, ? super b<P, S, O>, ? extends R> proceed, c session) {
            p013kotlin.jvm.internal.s.k(tVar, "this");
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(proceed, "proceed");
            p013kotlin.jvm.internal.s.k(session, "session");
            return proceed.invoke(p11, s11, null);
        }

        public static void d(t tVar, CoroutineScope workflowScope, c session) {
            p013kotlin.jvm.internal.s.k(tVar, "this");
            p013kotlin.jvm.internal.s.k(workflowScope, "workflowScope");
            p013kotlin.jvm.internal.s.k(session, "session");
        }

        public static <S> Snapshot e(t tVar, S s11, wn0.l<? super S, Snapshot> proceed, c session) {
            p013kotlin.jvm.internal.s.k(tVar, "this");
            p013kotlin.jvm.internal.s.k(proceed, "proceed");
            p013kotlin.jvm.internal.s.k(session, "session");
            return proceed.invoke(s11);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004JO\u0010\n\u001a\u00020\b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052$\u0010\t\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJh\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072.\u0010\t\u001a*\u0012\u0004\u0012\u00020\f\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007\u0012\u0004\u0012\u00020\b0\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JÇ\u0001\u0010\u001b\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0013\"\u0004\b\u0004\u0010\u0014\"\u0004\b\u0005\u0010\u00152\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00162\u0006\u0010\u0018\u001a\u00028\u00032\u0006\u0010\r\u001a\u00020\f2$\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u00072T\u0010\t\u001aP\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\f\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0007\u0012\u0004\u0012\u00028\u00050\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Ly20/t$b;", "P", "S", Gender.OTHER, "", "Ly20/r;", "action", "Lkotlin/Function1;", "Ljn0/h0;", "proceed", "b", "(Ly20/r;Lwn0/l;)V", "", Action.KEY_ATTRIBUTE, "Lkotlin/coroutines/Continuation;", "sideEffect", "Lkotlin/Function2;", "a", "(Ljava/lang/String;Lwn0/l;Lwn0/p;)V", "CP", "CO", "CR", "Ly20/q;", "child", "childProps", "handler", "Lkotlin/Function4;", "c", "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;Lwn0/r;)Ljava/lang/Object;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface b<P, S, O> {
        void a(String key, wn0.l<? super Continuation<? super h0>, ? extends Object> sideEffect, wn0.p<? super String, ? super wn0.l<? super Continuation<? super h0>, ? extends Object>, h0> proceed);

        void b(r<? super P, S, ? extends O> action, wn0.l<? super r<? super P, S, ? extends O>, h0> proceed);

        <CP, CO, CR> CR c(q<? super CP, ? extends CO, ? extends CR> child, CP childProps, String key, wn0.l<? super CO, ? extends r<? super P, S, ? extends O>> handler, wn0.r<? super q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super wn0.l<? super CO, ? extends r<? super P, S, ? extends O>>, ? extends CR> proceed);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly20/t$c;", "", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface c {
    }

    <P, S> S a(P props, Snapshot snapshot, wn0.p<? super P, ? super Snapshot, ? extends S> proceed, c session);

    <S> Snapshot b(S state, wn0.l<? super S, Snapshot> proceed, c session);

    void c(CoroutineScope workflowScope, c session);

    <P, S, O, R> R d(P renderProps, S renderState, y20.a<? extends P, S, ? super O> context, wn0.q<? super P, ? super S, ? super b<P, S, O>, ? extends R> proceed, c session);

    <P, S> S e(P old, P p11, S state, wn0.q<? super P, ? super P, ? super S, ? extends S> proceed, c session);
}
