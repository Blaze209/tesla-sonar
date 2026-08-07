package xf;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\fR\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R,\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\r\u0010\u0015¨\u0006\u0016"}, d2 = {"Lxf/p;", "T", "", "property", "Lag/e;", "keyPath", "Lkotlin/Function1;", "Lig/b;", "callback", "<init>", "(Ljava/lang/Object;Lag/e;Lwn0/l;)V", "value", "(Ljava/lang/Object;Lag/e;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "b", "Lag/e;", "()Lag/e;", "Lwn0/l;", "()Lwn0/l;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f123450d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T property;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ag.e keyPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<ig.b<T>, T> callback;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lig/b;", "it", "a", "(Lig/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<ig.b<T>, T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f123454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t11) {
            super(1);
            this.f123454c = t11;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(ig.b<T> it) {
            s.k(it, "it");
            return this.f123454c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(T t11, ag.e keyPath, wn0.l<? super ig.b<T>, ? extends T> callback) {
        s.k(keyPath, "keyPath");
        s.k(callback, "callback");
        this.property = t11;
        this.keyPath = keyPath;
        this.callback = callback;
    }

    public final wn0.l<ig.b<T>, T> a() {
        return this.callback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ag.e getKeyPath() {
        return this.keyPath;
    }

    public final T c() {
        return this.property;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(T t11, ag.e keyPath, T t12) {
        this((Object) t11, keyPath, (wn0.l) new a(t12));
        s.k(keyPath, "keyPath");
    }
}
