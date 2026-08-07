package bl0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 H2\u00020\u0001:\u0001\u0014Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00103\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010!\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010$R$\u00106\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010!\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010$R\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010!\u001a\u0004\b*\u0010\u0017\"\u0004\b8\u0010$R(\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010:\u001a\u0004\b7\u0010;\"\u0004\b<\u0010=R*\u0010F\u001a\u00020?2\u0006\u0010@\u001a\u00020?8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b0\u0010C\"\u0004\bD\u0010ER$\u0010\r\u001a\u00020?2\u0006\u0010G\u001a\u00020?8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010B\u001a\u0004\bH\u0010CR(\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010@\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0017\"\u0004\bJ\u0010$R(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010@\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010\u0017\"\u0004\bL\u0010$R$\u0010\u000e\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u0017\"\u0004\bM\u0010$R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010;\"\u0004\bO\u0010=¨\u0006P"}, d2 = {"Lbl0/d0;", "", "Lbl0/h0;", "protocol", "", "host", "", "port", "user", "password", "", "pathSegments", "Lbl0/x;", "parameters", "fragment", "", "trailingQuery", "<init>", "(Lbl0/h0;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lbl0/x;Ljava/lang/String;Z)V", "Ljn0/h0;", "a", "()V", "c", "()Ljava/lang/String;", "toString", "Lbl0/k0;", "b", "()Lbl0/k0;", "Lbl0/h0;", "o", "()Lbl0/h0;", "y", "(Lbl0/h0;)V", "Ljava/lang/String;", "j", "w", "(Ljava/lang/String;)V", "I", "n", "()I", "x", "(I)V", DateTokenConverter.CONVERTER_KEY, "Z", "p", "()Z", "z", "(Z)V", "e", "h", "v", "encodedUser", "f", "t", "encodedPassword", "g", "r", "encodedFragment", "Ljava/util/List;", "()Ljava/util/List;", "u", "(Ljava/util/List;)V", "encodedPathSegments", "Lbl0/y;", "value", IntegerTokenConverter.CONVERTER_KEY, "Lbl0/y;", "()Lbl0/y;", "s", "(Lbl0/y;)V", "encodedParameters", "<set-?>", "k", "q", "A", "l", "setPassword", "setFragment", "m", "setPathSegments", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final k0 f17589l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private URLProtocol protocol;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String host;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int port;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean trailingQuery;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String encodedUser;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String encodedPassword;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String encodedFragment;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<String> encodedPathSegments;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private y encodedParameters;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private y parameters;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f17589l = j0.c(e0.a(companion));
    }

    public d0(URLProtocol protocol, String host, int i11, String str, String str2, List<String> pathSegments, x parameters, String fragment, boolean z11) {
        p013kotlin.jvm.internal.s.k(protocol, "protocol");
        p013kotlin.jvm.internal.s.k(host, "host");
        p013kotlin.jvm.internal.s.k(pathSegments, "pathSegments");
        p013kotlin.jvm.internal.s.k(parameters, "parameters");
        p013kotlin.jvm.internal.s.k(fragment, "fragment");
        this.protocol = protocol;
        this.host = host;
        this.port = i11;
        this.trailingQuery = z11;
        this.encodedUser = str != null ? a.m(str, false, 1, null) : null;
        this.encodedPassword = str2 != null ? a.m(str2, false, 1, null) : null;
        this.encodedFragment = a.r(fragment, false, false, null, 7, null);
        List<String> list = pathSegments;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a.p((String) it.next()));
        }
        this.encodedPathSegments = arrayList;
        y yVarE = m0.e(parameters);
        this.encodedParameters = yVarE;
        this.parameters = new l0(yVarE);
    }

    private final void a() {
        if (this.host.length() <= 0 && !p013kotlin.jvm.internal.s.f(this.protocol.getName(), Action.FILE_ATTRIBUTE)) {
            k0 k0Var = f17589l;
            this.host = k0Var.getHost();
            if (p013kotlin.jvm.internal.s.f(this.protocol, URLProtocol.INSTANCE.c())) {
                this.protocol = k0Var.getProtocol();
            }
            if (this.port == 0) {
                this.port = k0Var.getSpecifiedPort();
            }
        }
    }

    public final void A(String str) {
        this.encodedUser = str != null ? a.m(str, false, 1, null) : null;
    }

    public final k0 b() {
        a();
        return new k0(this.protocol, this.host, this.port, m(), this.parameters.build(), i(), q(), l(), this.trailingQuery, c());
    }

    public final String c() {
        a();
        String string = ((StringBuilder) f0.d(this, new StringBuilder(256))).toString();
        p013kotlin.jvm.internal.s.j(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEncodedFragment() {
        return this.encodedFragment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final y getEncodedParameters() {
        return this.encodedParameters;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEncodedPassword() {
        return this.encodedPassword;
    }

    public final List<String> g() {
        return this.encodedPathSegments;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getEncodedUser() {
        return this.encodedUser;
    }

    public final String i() {
        return a.k(this.encodedFragment, 0, 0, false, null, 15, null);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final y getParameters() {
        return this.parameters;
    }

    public final String l() {
        String str = this.encodedPassword;
        if (str != null) {
            return a.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final List<String> m() {
        List<String> list = this.encodedPathSegments;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a.i((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final String q() {
        String str = this.encodedUser;
        if (str != null) {
            return a.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void r(String str) {
        p013kotlin.jvm.internal.s.k(str, "<set-?>");
        this.encodedFragment = str;
    }

    public final void s(y value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.encodedParameters = value;
        this.parameters = new l0(value);
    }

    public final void t(String str) {
        this.encodedPassword = str;
    }

    public String toString() {
        String string = ((StringBuilder) f0.d(this, new StringBuilder(256))).toString();
        p013kotlin.jvm.internal.s.j(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }

    public final void u(List<String> list) {
        p013kotlin.jvm.internal.s.k(list, "<set-?>");
        this.encodedPathSegments = list;
    }

    public final void v(String str) {
        this.encodedUser = str;
    }

    public final void w(String str) {
        p013kotlin.jvm.internal.s.k(str, "<set-?>");
        this.host = str;
    }

    public final void x(int i11) {
        this.port = i11;
    }

    public final void y(URLProtocol uRLProtocol) {
        p013kotlin.jvm.internal.s.k(uRLProtocol, "<set-?>");
        this.protocol = uRLProtocol;
    }

    public final void z(boolean z11) {
        this.trailingQuery = z11;
    }

    public /* synthetic */ d0(URLProtocol uRLProtocol, String str, int i11, String str2, String str3, List list, x xVar, String str4, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? URLProtocol.INSTANCE.c() : uRLProtocol, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? p013kotlin.collections.v.m() : list, (i12 & 64) != 0 ? x.INSTANCE.a() : xVar, (i12 & 128) != 0 ? "" : str4, (i12 & 256) != 0 ? false : z11);
    }
}
