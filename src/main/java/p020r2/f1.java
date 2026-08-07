package p020r2;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \f2\u00020\u0001:\u0001\rJ*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lr2/f1;", "Lkotlin/coroutines/CoroutineContext$Element;", "R", "Lkotlin/Function1;", "", "onFrame", "B", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", Action.KEY_ATTRIBUTE, "H1", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface f1 extends CoroutineContext.Element {

    /* JADX INFO: renamed from: H1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f106537a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R a(f1 f1Var, R r11, p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(f1Var, r11, pVar);
        }

        public static <E extends CoroutineContext.Element> E b(f1 f1Var, CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(f1Var, key);
        }

        public static CoroutineContext c(f1 f1Var, CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(f1Var, key);
        }

        public static CoroutineContext d(f1 f1Var, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(f1Var, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: r2.f1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lr2/f1$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lr2/f1;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.Key<f1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f106537a = new Companion();

        private Companion() {
        }
    }

    <R> Object B(l<? super Long, ? extends R> lVar, Continuation<? super R> continuation);

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.Key<?> getKey() {
        return INSTANCE;
    }
}
