package ic;

import ch.qos.logback.core.CoreConstants;
import ec.g0;
import ec.r;
import gc.v;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\f\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lic/g;", "Lic/j;", "Lec/g0;", "uri", "Lrc/n;", "options", "<init>", "(Lec/g0;Lrc/n;)V", "Lic/i;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lec/g0;", "b", "Lrc/n;", "c", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f77438c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lic/g$a;", "", "<init>", "()V", "", "BASE64_TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lic/g$b;", "Lic/j$a;", "Lec/g0;", "<init>", "()V", "data", "Lrc/n;", "options", "Lec/r;", "imageLoader", "Lic/j;", "b", "(Lec/g0;Lrc/n;Lec/r;)Lic/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements j.a<g0> {
        @Override // ic.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(g0 data, Options options, r imageLoader) {
            if (s.f(data.getCom.adyen.checkout.components.core.paymentmethod.CardPaymentMethod.PAYMENT_METHOD_TYPE java.lang.String(), "data")) {
                return new g(data, options);
            }
            return null;
        }
    }

    public g(g0 g0Var, Options options) {
        this.uri = g0Var;
        this.options = options;
    }

    @Override // ic.j
    public Object a(Continuation<? super i> continuation) {
        int iV0 = t.v0(this.uri.getData(), ";base64,", 0, false, 6, null);
        if (iV0 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.uri).toString());
        }
        int iU0 = t.u0(this.uri.getData(), CoreConstants.COLON_CHAR, 0, false, 6, null);
        if (iU0 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.uri).toString());
        }
        String strSubstring = this.uri.getData().substring(iU0 + 1, iV0);
        s.j(strSubstring, "substring(...)");
        byte[] bArrH = tn0.a.h(tn0.a.INSTANCE, this.uri.getData(), iV0 + 8, 0, 4, null);
        okio.h hVar = new okio.h();
        hVar.write(bArrH);
        return new SourceFetchResult(v.c(hVar, this.options.getFileSystem(), null, 4, null), strSubstring, gc.h.MEMORY);
    }
}
