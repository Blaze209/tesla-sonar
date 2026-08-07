package bl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b2\u0018\u0000 @2\u00020\u0001:\u0001\u001bBc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b/\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b0\u0010\u0015R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b2\u00103R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010 R\u001b\u00106\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b%\u0010\u0015R\u001b\u00107\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b)\u0010\u0015R\u001b\u00109\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u00105\u001a\u0004\b8\u0010\u0015R\u001d\u0010:\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b-\u0010\u0015R\u001d\u0010<\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b\"\u0010\u0015R\u001b\u0010>\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010?\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b4\u0010\u001a¨\u0006A"}, d2 = {"Lbl0/k0;", "", "Lbl0/h0;", "protocol", "", "host", "", "specifiedPort", "", "pathSegments", "Lbl0/x;", "parameters", "fragment", "user", "password", "", "trailingQuery", "urlString", "<init>", "(Lbl0/h0;Ljava/lang/String;ILjava/util/List;Lbl0/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lbl0/h0;", "k", "()Lbl0/h0;", "b", "Ljava/lang/String;", "g", "c", "I", "l", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "e", "Lbl0/x;", "getParameters", "()Lbl0/x;", "f", "getFragment", "n", "h", "Z", "m", "()Z", "j", "Lkotlin/Lazy;", "encodedPath", "encodedQuery", "getEncodedPathAndQuery", "encodedPathAndQuery", "encodedUser", "o", "encodedPassword", "p", "encodedFragment", "port", "q", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final URLProtocol protocol;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String host;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int specifiedPort;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> pathSegments;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x parameters;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fragment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String user;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String password;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean trailingQuery;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String urlString;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedPath;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedQuery;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedPathAndQuery;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedUser;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedPassword;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedFragment;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int iU0 = p013kotlin.text.t.u0(k0.this.urlString, '#', 0, false, 6, null) + 1;
            if (iU0 == 0) {
                return "";
            }
            String strSubstring = k0.this.urlString.substring(iU0);
            p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (k0.this.getPassword() == null) {
                return null;
            }
            if (k0.this.getPassword().length() == 0) {
                return "";
            }
            String strSubstring = k0.this.urlString.substring(p013kotlin.text.t.u0(k0.this.urlString, CoreConstants.COLON_CHAR, k0.this.getProtocol().getName().length() + 3, false, 4, null) + 1, p013kotlin.text.t.u0(k0.this.urlString, '@', 0, false, 6, null));
            p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int iU0;
            if (k0.this.i().isEmpty() || (iU0 = p013kotlin.text.t.u0(k0.this.urlString, '/', k0.this.getProtocol().getName().length() + 3, false, 4, null)) == -1) {
                return "";
            }
            int iX0 = p013kotlin.text.t.x0(k0.this.urlString, new char[]{'?', '#'}, iU0, false, 4, null);
            if (iX0 == -1) {
                String strSubstring = k0.this.urlString.substring(iU0);
                p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
            String strSubstring2 = k0.this.urlString.substring(iU0, iX0);
            p013kotlin.jvm.internal.s.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int iU0 = p013kotlin.text.t.u0(k0.this.urlString, '/', k0.this.getProtocol().getName().length() + 3, false, 4, null);
            if (iU0 == -1) {
                return "";
            }
            int iU1 = p013kotlin.text.t.u0(k0.this.urlString, '#', iU0, false, 4, null);
            if (iU1 == -1) {
                String strSubstring = k0.this.urlString.substring(iU0);
                p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
            String strSubstring2 = k0.this.urlString.substring(iU0, iU1);
            p013kotlin.jvm.internal.s.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            int iU0 = p013kotlin.text.t.u0(k0.this.urlString, '?', 0, false, 6, null) + 1;
            if (iU0 == 0) {
                return "";
            }
            int iU1 = p013kotlin.text.t.u0(k0.this.urlString, '#', iU0, false, 4, null);
            if (iU1 == -1) {
                String strSubstring = k0.this.urlString.substring(iU0);
                p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
            String strSubstring2 = k0.this.urlString.substring(iU0, iU1);
            p013kotlin.jvm.internal.s.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (k0.this.getUser() == null) {
                return null;
            }
            if (k0.this.getUser().length() == 0) {
                return "";
            }
            int length = k0.this.getProtocol().getName().length() + 3;
            String strSubstring = k0.this.urlString.substring(length, p013kotlin.text.t.x0(k0.this.urlString, new char[]{CoreConstants.COLON_CHAR, '@'}, length, false, 4, null));
            p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
    }

    public k0(URLProtocol protocol, String host, int i11, List<String> pathSegments, x parameters, String fragment, String str, String str2, boolean z11, String urlString) {
        p013kotlin.jvm.internal.s.k(protocol, "protocol");
        p013kotlin.jvm.internal.s.k(host, "host");
        p013kotlin.jvm.internal.s.k(pathSegments, "pathSegments");
        p013kotlin.jvm.internal.s.k(parameters, "parameters");
        p013kotlin.jvm.internal.s.k(fragment, "fragment");
        p013kotlin.jvm.internal.s.k(urlString, "urlString");
        this.protocol = protocol;
        this.host = host;
        this.specifiedPort = i11;
        this.pathSegments = pathSegments;
        this.parameters = parameters;
        this.fragment = fragment;
        this.user = str;
        this.password = str2;
        this.trailingQuery = z11;
        this.urlString = urlString;
        if ((i11 < 0 || i11 >= 65536) && i11 != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        this.encodedPath = jn0.m.b(new d());
        this.encodedQuery = jn0.m.b(new f());
        this.encodedPathAndQuery = jn0.m.b(new e());
        this.encodedUser = jn0.m.b(new g());
        this.encodedPassword = jn0.m.b(new c());
        this.encodedFragment = jn0.m.b(new b());
    }

    public final String b() {
        return (String) this.encodedFragment.getValue();
    }

    public final String c() {
        return (String) this.encodedPassword.getValue();
    }

    public final String d() {
        return (String) this.encodedPath.getValue();
    }

    public final String e() {
        return (String) this.encodedQuery.getValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && k0.class == other.getClass() && p013kotlin.jvm.internal.s.f(this.urlString, ((k0) other).urlString);
    }

    public final String f() {
        return (String) this.encodedUser.getValue();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }

    public final List<String> i() {
        return this.pathSegments;
    }

    public final int j() {
        Integer numValueOf = Integer.valueOf(this.specifiedPort);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.protocol.getDefaultPort();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getUrlString() {
        return this.urlString;
    }
}
