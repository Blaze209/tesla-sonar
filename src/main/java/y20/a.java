package y20;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00002\u00020\u0004Js\u0010\u0010\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\b2\u0006\u0010\n\u001a\u00028\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R,\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Ly20/a;", "PropsT", "StateT", "OutputT", "", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Ly20/q;", "child", "props", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Ly20/r;", "handler", DateTokenConverter.CONVERTER_KEY, "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "sideEffect", "a", "(Ljava/lang/String;Lwn0/p;)V", "Ly20/h;", "c", "()Ly20/h;", "actionSink", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface a<PropsT, StateT, OutputT> {

    /* JADX INFO: renamed from: y20.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C2691a {
        public static /* synthetic */ Object a(a aVar, q qVar, Object obj, String str, wn0.l lVar, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderChild");
            }
            if ((i11 & 4) != 0) {
                str = "";
            }
            return aVar.d(qVar, obj, str, lVar);
        }
    }

    void a(String key, wn0.p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> sideEffect);

    h<r<? super PropsT, StateT, ? extends OutputT>> c();

    <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT d(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, wn0.l<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler);
}
