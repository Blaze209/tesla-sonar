package d3;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Ld3/g;", "Lkotlin/coroutines/CoroutineContext$Element;", "", "t", "()F", "scaleFactor", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", Action.KEY_ATTRIBUTE, "A1", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface g extends CoroutineContext.Element {

    /* JADX INFO: renamed from: A1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f59288a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R a(g gVar, R r11, p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(gVar, r11, pVar);
        }

        public static <E extends CoroutineContext.Element> E b(g gVar, CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(gVar, key);
        }

        public static CoroutineContext c(g gVar, CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(gVar, key);
        }

        public static CoroutineContext d(g gVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(gVar, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: d3.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ld3/g$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Ld3/g;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.Key<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f59288a = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.Key<?> getKey() {
        return INSTANCE;
    }

    float t();
}
