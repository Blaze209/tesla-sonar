package ic;

import ec.g0;
import ec.h0;
import ec.r;
import okio.c0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lic/a;", "Lic/j;", "Lec/g0;", "data", "Lrc/n;", "options", "<init>", "(Lec/g0;Lrc/n;)V", "Lic/i;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lec/g0;", "b", "Lrc/n;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: ic.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lic/a$a;", "Lic/j$a;", "Lec/g0;", "<init>", "()V", "data", "Lrc/n;", "options", "Lec/r;", "imageLoader", "Lic/j;", "b", "(Lec/g0;Lrc/n;Lec/r;)Lic/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1631a implements j.a<g0> {
        @Override // ic.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(g0 data, Options options, r imageLoader) {
            if (yc.g0.h(data)) {
                return new a(data, options);
            }
            return null;
        }
    }

    public a(g0 g0Var, Options options) {
        this.data = g0Var;
        this.options = options;
    }

    @Override // ic.j
    public Object a(Continuation<? super i> continuation) {
        String strY0 = v.y0(v.i0(h0.f(this.data), 1), "/", null, null, 0, null, null, 62, null);
        return new SourceFetchResult(gc.v.a(c0.d(c0.m(this.options.getContext().getAssets().open(strY0))), this.options.getFileSystem(), new gc.a(strY0)), yc.v.f125365a.b(strY0), gc.h.DISK);
    }
}
