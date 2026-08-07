package ic;

import ec.g0;
import ec.r;
import gc.v;
import okio.c0;
import okio.i0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lic/m;", "Lic/j;", "Lec/g0;", "uri", "Lrc/n;", "options", "<init>", "(Lec/g0;Lrc/n;)V", "Lic/i;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lec/g0;", "b", "Lrc/n;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lic/m$a;", "Lic/j$a;", "Lec/g0;", "<init>", "()V", "data", "", "c", "(Lec/g0;)Z", "Lrc/n;", "options", "Lec/r;", "imageLoader", "Lic/j;", "b", "(Lec/g0;Lrc/n;Lec/r;)Lic/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<g0> {
        private final boolean c(g0 data) {
            return s.f(data.getCom.adyen.checkout.components.core.paymentmethod.CardPaymentMethod.PAYMENT_METHOD_TYPE java.lang.String(), "jar:file");
        }

        @Override // ic.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(g0 data, Options options, r imageLoader) {
            if (c(data)) {
                return new m(data, options);
            }
            return null;
        }
    }

    public m(g0 g0Var, Options options) {
        this.uri = g0Var;
        this.options = options;
    }

    @Override // ic.j
    public Object a(Continuation<? super i> continuation) {
        String path = this.uri.getPath();
        if (path == null) {
            path = "";
        }
        String str = path;
        int iU0 = t.u0(str, '!', 0, false, 6, null);
        if (iU0 == -1) {
            throw new IllegalStateException(("Invalid jar:file URI: " + this.uri).toString());
        }
        i0.Companion companion = i0.INSTANCE;
        String strSubstring = str.substring(0, iU0);
        s.j(strSubstring, "substring(...)");
        i0 i0VarE = i0.Companion.e(companion, strSubstring, false, 1, null);
        String strSubstring2 = str.substring(iU0 + 1, str.length());
        s.j(strSubstring2, "substring(...)");
        i0 i0VarE2 = i0.Companion.e(companion, strSubstring2, false, 1, null);
        return new SourceFetchResult(v.d(i0VarE2, c0.f(this.options.getFileSystem(), i0VarE), null, null, null, 28, null), yc.v.f125365a.a(yc.k.d(i0VarE2)), gc.h.DISK);
    }
}
