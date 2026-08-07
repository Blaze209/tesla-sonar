package y20;

import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"y20/x", "y20/y", "y20/z", "y20/a0", "y20/b0", "y20/c0"}, d2 = {}, k = 4, mv = {1, 6, 0}, xi = 48)
public final class w {
    public static final <PropsT, StateT, OutputT, RenderingT> k<PropsT, StateT, OutputT, RenderingT>.a a(a<? extends PropsT, StateT, ? super OutputT> aVar, k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar) {
        return z.a(aVar, kVar);
    }

    public static final <PropsT, StateT, OutputT> r<PropsT, StateT, OutputT> b(String str, wn0.l<? super r<? super PropsT, StateT, ? extends OutputT>.c, h0> lVar) {
        return b0.a(str, lVar);
    }

    public static final <PropsT, StateT, OutputT> r<PropsT, StateT, OutputT> c(wn0.a<String> aVar, wn0.l<? super r<? super PropsT, StateT, ? extends OutputT>.c, h0> lVar) {
        return b0.b(aVar, lVar);
    }

    public static final <PropsT, StateT, OutputT, RenderingT> r<PropsT, StateT, OutputT> d(k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, String str, wn0.l<? super r<? super PropsT, StateT, ? extends OutputT>.c, h0> lVar) {
        return z.b(kVar, str, lVar);
    }

    public static final <PropsT, StateT, OutputT, RenderingT> r<PropsT, StateT, OutputT> e(k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, wn0.a<String> aVar, wn0.l<? super r<? super PropsT, StateT, ? extends OutputT>.c, h0> lVar) {
        return z.c(kVar, aVar, lVar);
    }

    public static final <PropsT, StateT, OutputT> Pair<StateT, WorkflowOutput<OutputT>> h(r<? super PropsT, StateT, ? extends OutputT> rVar, PropsT propst, StateT statet) {
        return b0.d(rVar, propst, statet);
    }

    public static final <T, PropsT, StateT, OutputT> Object i(Flow<? extends T> flow, h<? super r<? super PropsT, StateT, ? extends OutputT>> hVar, wn0.l<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> lVar, Continuation<? super h0> continuation) {
        return y.a(flow, hVar, lVar, continuation);
    }

    public static final s j(q<?, ?, ?> qVar) {
        return c0.a(qVar);
    }

    public static final <OutputT> Object k(o<? extends OutputT> oVar, String str, h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar, Continuation<? super h0> continuation) {
        return a0.d(oVar, str, hVar, continuation);
    }

    public static final <T, PropsT, StateT, OutputT> void l(a<? extends PropsT, StateT, ? super OutputT> aVar, o<? extends T> oVar, co0.q qVar, String str, wn0.l<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> lVar) {
        x.a(aVar, oVar, qVar, str, lVar);
    }

    public static final <PropsT, StateT, OutputT> Object m(h<? super r<? super PropsT, StateT, ? extends OutputT>> hVar, r<? super PropsT, StateT, ? extends OutputT> rVar, Continuation<? super h0> continuation) {
        return y.b(hVar, rVar, continuation);
    }

    public static final s n(co0.q qVar) {
        return c0.b(qVar);
    }
}
