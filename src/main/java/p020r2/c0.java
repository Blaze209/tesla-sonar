package p020r2;

import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lr2/c0;", "T", "Lr2/g2;", "Lkotlin/Function1;", "Lr2/v;", "defaultComputation", "<init>", "(Lwn0/l;)V", "value", "Lr2/h2;", "c", "(Ljava/lang/Object;)Lr2/h2;", "Lr2/d0;", "b", "Lr2/d0;", "g", "()Lr2/d0;", "defaultValueHolder", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0<T> extends g2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComputedValueHolder<T> defaultValueHolder;

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements wn0.a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f106498c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        public final T invoke() {
            o.t("Unexpected call to default provider");
            throw new KotlinNothingValueException();
        }
    }

    public c0(l<? super v, ? extends T> lVar) {
        super(a.f106498c);
        this.defaultValueHolder = new ComputedValueHolder<>(lVar);
    }

    @Override // p020r2.g2
    public h2<T> c(T value) {
        return new h2<>(this, value, value == null, null, null, null, true);
    }

    @Override // p020r2.u
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ComputedValueHolder<T> a() {
        return this.defaultValueHolder;
    }
}
