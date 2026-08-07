package no0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lno0/g;", "T", "E", "Lno0/v;", "expectedValue", "Lkotlin/Function1;", "getter", "<init>", "(Ljava/lang/Object;Lwn0/l;)V", "value", "", "test", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "Lwn0/l;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g<T, E> implements v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final E expectedValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<T, E> getter;

    /* JADX WARN: Multi-variable type inference failed */
    public g(E e11, wn0.l<? super T, ? extends E> getter) {
        p013kotlin.jvm.internal.s.k(getter, "getter");
        this.expectedValue = e11;
        this.getter = getter;
    }

    @Override // no0.v
    public boolean test(T value) {
        return p013kotlin.jvm.internal.s.f(this.getter.invoke(value), this.expectedValue);
    }
}
