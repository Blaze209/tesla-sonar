package ui;

import ii.v;
import ii.v.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lui/l;", "Lii/v$a;", "D", "Lui/a;", "Lii/f;", "request", "<init>", "(Lii/f;)V", "a", "Lii/f;", "()Lii/f;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class l<D extends v.a> implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ii.f<D> request;

    public l(ii.f<D> request) {
        s.k(request, "request");
        this.request = request;
    }

    public final ii.f<D> a() {
        return this.request;
    }
}
