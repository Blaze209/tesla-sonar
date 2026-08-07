package p020r2;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wn0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH ¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Lr2/u;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lwn0/a;)V", "Lr2/h2;", "value", "Lr2/e4;", "previous", "b", "(Lr2/h2;Lr2/e4;)Lr2/e4;", "a", "Lr2/e4;", "()Lr2/e4;", "defaultValueHolder", "Lr2/g2;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e4<T> defaultValueHolder;

    public /* synthetic */ u(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public e4<T> a() {
        return this.defaultValueHolder;
    }

    public abstract e4<T> b(h2<T> value, e4<T> previous);

    private u(a<? extends T> aVar) {
        this.defaultValueHolder = new c1(aVar);
    }
}
