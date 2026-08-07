package kotlin;

import i4.Placeholder;
import jn0.h0;
import p020r2.l;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lb2/q;", "", "Li4/w;", "placeholder", "Lkotlin/Function1;", "", "Ljn0/h0;", "children", "<init>", "(Li4/w;Lwn0/q;)V", "a", "Li4/w;", "b", "()Li4/w;", "Lwn0/q;", "()Lwn0/q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Placeholder placeholder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.q<String, l, Integer, h0> children;

    /* JADX WARN: Multi-variable type inference failed */
    public q(Placeholder placeholder, wn0.q<? super String, ? super l, ? super Integer, h0> qVar) {
        this.placeholder = placeholder;
        this.children = qVar;
    }

    public final wn0.q<String, l, Integer, h0> a() {
        return this.children;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
