package sa;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lsa/a;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lsa/l;", "connectionWrapper", "<init>", "(Lsa/l;)V", "a", "Lsa/l;", "()Lsa/l;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", Action.KEY_ATTRIBUTE, "b", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a implements CoroutineContext.Element {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l connectionWrapper;

    /* JADX INFO: renamed from: sa.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsa/a$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lsa/a;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.Key<a> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public a(l connectionWrapper) {
        s.k(connectionWrapper, "connectionWrapper");
        this.connectionWrapper = connectionWrapper;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getConnectionWrapper() {
        return this.connectionWrapper;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <R> R fold(R r11, p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r11, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<a> getKey() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // p013kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
