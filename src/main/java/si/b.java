package si;

import java.util.List;
import ji.i;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsi/b;", "Lsi/f;", "", "Lsi/e;", "interceptors", "", "index", "<init>", "(Ljava/util/List;I)V", "Lji/g;", "request", "Lji/i;", "a", "(Lji/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/List;", "b", "I", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<e> interceptors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends e> interceptors, int i11) {
        s.k(interceptors, "interceptors");
        this.interceptors = interceptors;
        this.index = i11;
    }

    @Override // si.f
    public Object a(ji.g gVar, Continuation<? super i> continuation) {
        if (this.index < this.interceptors.size()) {
            return this.interceptors.get(this.index).a(gVar, new b(this.interceptors, this.index + 1), continuation);
        }
        throw new IllegalStateException("Check failed.");
    }
}
