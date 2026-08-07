package oi;

import ii.f;
import ii.g;
import ii.v;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Loi/c;", "Loi/b;", "", "Loi/a;", "interceptors", "", "index", "<init>", "(Ljava/util/List;I)V", "Lii/v$a;", "D", "Lii/f;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lii/g;", "a", "(Lii/f;)Lkotlinx/coroutines/flow/Flow;", "Ljava/util/List;", "b", "I", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<a> interceptors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends a> interceptors, int i11) {
        s.k(interceptors, "interceptors");
        this.interceptors = interceptors;
        this.index = i11;
    }

    public <D extends v.a> Flow<g<D>> a(f<D> request) {
        s.k(request, "request");
        if (this.index < this.interceptors.size()) {
            return this.interceptors.get(this.index).a(request, new c(this.interceptors, this.index + 1));
        }
        throw new IllegalStateException("Check failed.");
    }
}
