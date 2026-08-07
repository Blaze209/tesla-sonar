package sz;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f111934h = new g(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f111935i = new g(-1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f111936j = new g(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f111937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f111938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f111939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f111940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j.g f111941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j.g f111942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j.h f111943g;

    public g(int i11) {
        boolean z11 = (i11 & 1) == 0;
        this.f111937a = z11;
        boolean z12 = (i11 & 4) == 0;
        this.f111939c = z12;
        boolean z13 = (i11 & 2) == 0;
        this.f111938b = z13;
        this.f111940d = (i11 & 16) > 0;
        j.g gVar = (i11 & 8) > 0 ? j.f111950c : j.f111948a;
        if (z12) {
            this.f111942f = j.f111949b;
        } else {
            this.f111942f = gVar;
        }
        if (z11) {
            this.f111941e = j.f111949b;
        } else {
            this.f111941e = gVar;
        }
        if (z13) {
            this.f111943g = j.f111952e;
        } else {
            this.f111943g = j.f111951d;
        }
    }

    public void a(Appendable appendable) throws IOException {
        appendable.append(CoreConstants.COMMA_CHAR);
    }

    public void c(Appendable appendable) throws IOException {
        appendable.append('[');
    }

    public void d(Appendable appendable) throws IOException {
        appendable.append(']');
    }

    public void f(String str, Appendable appendable) {
        this.f111943g.a(str, appendable);
    }

    public boolean g() {
        return this.f111940d;
    }

    public boolean h(String str) {
        return this.f111941e.a(str);
    }

    public boolean i(String str) {
        return this.f111942f.a(str);
    }

    public void k(Appendable appendable) throws IOException {
        appendable.append(CoreConstants.COLON_CHAR);
    }

    public void m(Appendable appendable) throws IOException {
        appendable.append(CoreConstants.COMMA_CHAR);
    }

    public void n(Appendable appendable) throws IOException {
        appendable.append(CoreConstants.CURLY_LEFT);
    }

    public void o(Appendable appendable) throws IOException {
        appendable.append(CoreConstants.CURLY_RIGHT);
    }

    public void p(Appendable appendable, String str) throws IOException {
        if (!i(str)) {
            appendable.append(str);
            return;
        }
        appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        i.a(str, appendable, this);
        appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
    }

    public void b(Appendable appendable) {
    }

    public void e(Appendable appendable) {
    }

    public void j(Appendable appendable) {
    }

    public void l(Appendable appendable) {
    }
}
