package gq;

import ch.qos.logback.core.CoreConstants;
import com.github.mangstadt.vinnie.codec.DecoderException;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class f implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Reader f69339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f69340c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Charset f69342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f69343f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gq.b f69345h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69338a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69341d = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final gq.a f69344g = new gq.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69346i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69347j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69348k = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69349a;

        static {
            int[] iArr = new int[eq.a.values().length];
            f69349a = iArr;
            try {
                iArr[eq.a.OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69349a[eq.a.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f69350a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<eq.a> f69351b;

        public b(eq.a aVar) {
            ArrayList arrayList = new ArrayList();
            this.f69351b = arrayList;
            arrayList.add(aVar);
        }

        public String b() {
            if (this.f69350a.isEmpty()) {
                return null;
            }
            List<String> list = this.f69350a;
            return list.get(list.size() - 1);
        }

        public eq.a c() {
            if (this.f69351b.isEmpty()) {
                return null;
            }
            List<eq.a> list = this.f69351b;
            return list.get(list.size() - 1);
        }

        public String d() {
            List<eq.a> list = this.f69351b;
            list.remove(list.size() - 1);
            List<String> list2 = this.f69350a;
            return list2.remove(list2.size() - 1);
        }

        public int e(String str) {
            int iLastIndexOf = this.f69350a.lastIndexOf(str);
            if (iLastIndexOf < 0) {
                return 0;
            }
            return this.f69350a.size() - iLastIndexOf;
        }

        public void f(String str) {
            this.f69350a.add(str);
            this.f69351b.add(c());
        }

        public void g(eq.a aVar) {
            List<eq.a> list = this.f69351b;
            list.set(list.size() - 1, aVar);
        }
    }

    public f(Reader reader, c cVar) {
        this.f69339b = reader;
        this.f69340c = cVar;
        b bVar = new b(cVar.b());
        this.f69343f = bVar;
        this.f69345h = new gq.b(bVar.f69350a);
        if (reader instanceof InputStreamReader) {
            this.f69342e = Charset.forName(((InputStreamReader) reader).getEncoding());
        } else {
            this.f69342e = Charset.defaultCharset();
        }
    }

    private static boolean B(char c11) {
        return c11 == ' ' || c11 == '\t';
    }

    private int C() {
        int i11 = this.f69346i;
        if (i11 < 0) {
            return this.f69339b.read();
        }
        this.f69346i = -1;
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc  */
    private eq.d I(d dVar) {
        int i11;
        eq.d dVar2 = new eq.d();
        eq.a aVarC = this.f69343f.c();
        eq.d dVar3 = null;
        String str = null;
        char c11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        char c12 = 0;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            int iC = C();
            if (iC < 0) {
                this.f69348k = true;
                break;
            }
            char c13 = (char) iC;
            if (c11 != '\r' || c13 != '\n') {
                if (t(c13)) {
                    z12 = z11 && c11 == '=' && dVar2.c().h();
                    if (z12) {
                        this.f69344g.c();
                        this.f69345h.f69330b.c();
                    }
                    this.f69347j++;
                } else {
                    if (t(c11)) {
                        if (!B(c13)) {
                            if (!z12) {
                                this.f69346i = c13;
                                break;
                            }
                        } else {
                            c11 = c13;
                            z13 = true;
                        }
                    }
                    if (z13) {
                        if (!B(c13) || aVarC != eq.a.OLD) {
                            z13 = false;
                        }
                    }
                    this.f69345h.f69330b.a(c13);
                    if (z11) {
                        this.f69344g.a(c13);
                    } else if (c12 != 0) {
                        if (c12 != '\\') {
                            if (c12 != '^') {
                                this.f69344g.a(c12).a(c13);
                            } else if (c13 == '\'') {
                                this.f69344g.a(CoreConstants.DOUBLE_QUOTE_CHAR);
                            } else if (c13 == '^') {
                                this.f69344g.a(c13);
                            } else if (c13 != 'n') {
                                this.f69344g.a(c12).a(c13);
                            } else {
                                this.f69344g.b(this.f69338a);
                            }
                        } else if (c13 == ';' || c13 == '\\') {
                            this.f69344g.a(c13);
                        } else {
                            this.f69344g.a(c12).a(c13);
                        }
                        c11 = c13;
                        dVar3 = null;
                        c12 = 0;
                    } else {
                        if (str != null && ((i11 = a.f69349a[aVarC.ordinal()]) == 1 ? c13 == '\\' : i11 == 2 && c13 == '^' && this.f69341d)) {
                            c11 = c13;
                            c12 = c11;
                        } else if (c13 == '.' && dVar2.a() == null && dVar2.b() == null) {
                            dVar2.e(this.f69344g.f());
                        } else if ((c13 == ';' || c13 == ':') && !z14) {
                            if (dVar2.b() == null) {
                                dVar2.f(this.f69344g.f());
                            } else {
                                String strF = this.f69344g.f();
                                if (aVarC == eq.a.OLD) {
                                    strF = eq.b.a(strF);
                                }
                                dVar2.c().i(str, strF);
                                str = null;
                            }
                            if (c13 == ':') {
                                c11 = c13;
                                z11 = true;
                            }
                        } else if (dVar2.b() == null) {
                            this.f69344g.a(c13);
                        } else if (c13 == ',' && str != null && !z14 && aVarC != eq.a.OLD) {
                            dVar2.c().i(str, this.f69344g.f());
                        } else if (c13 == '=' && str == null) {
                            String upperCase = this.f69344g.f().toUpperCase();
                            if (aVarC == eq.a.OLD) {
                                upperCase = eq.b.b(upperCase);
                            }
                            str = upperCase;
                        } else if (c13 != '\"' || str == null || aVarC == eq.a.OLD) {
                            this.f69344g.a(c13);
                        } else {
                            z14 = !z14;
                        }
                        dVar3 = null;
                    }
                    c11 = c13;
                    dVar3 = null;
                }
            }
            c11 = c13;
        }
        if (!z11) {
            return dVar3;
        }
        dVar2.g(this.f69344g.f());
        if (dVar2.c().h()) {
            c(dVar2, dVar);
        }
        return dVar2;
    }

    private void c(eq.d dVar, d dVar2) {
        Charset charsetN = n(dVar, dVar2);
        if (charsetN == null) {
            charsetN = this.f69342e;
        }
        try {
            dVar.g(new fq.a(charsetN.name()).a(dVar.d()));
        } catch (DecoderException e11) {
            dVar2.e(g.QUOTED_PRINTABLE_ERROR, dVar, e11, this.f69345h);
        }
    }

    private Charset n(eq.d dVar, d dVar2) {
        try {
            return dVar.c().f();
        } catch (IllegalCharsetNameException | UnsupportedCharsetException e11) {
            dVar2.e(g.UNKNOWN_CHARSET, dVar, e11, this.f69345h);
            return null;
        }
    }

    private static boolean t(char c11) {
        return c11 == '\n' || c11 == '\r';
    }

    public void H(d dVar) {
        this.f69345h.f69332d = false;
        while (!this.f69348k) {
            gq.b bVar = this.f69345h;
            if (bVar.f69332d) {
                return;
            }
            bVar.f69331c = this.f69347j;
            this.f69344g.d();
            this.f69345h.f69330b.d();
            eq.d dVarI = I(dVar);
            if (this.f69345h.f69330b.g() == 0) {
                return;
            }
            if (dVarI == null) {
                dVar.e(g.MALFORMED_LINE, null, null, this.f69345h);
            } else if ("BEGIN".equalsIgnoreCase(dVarI.b().trim())) {
                String upperCase = dVarI.d().trim().toUpperCase();
                if (upperCase.length() == 0) {
                    dVar.e(g.EMPTY_BEGIN, null, null, this.f69345h);
                } else {
                    dVar.c(upperCase, this.f69345h);
                    this.f69343f.f(upperCase);
                }
            } else if ("END".equalsIgnoreCase(dVarI.b().trim())) {
                String upperCase2 = dVarI.d().trim().toUpperCase();
                if (upperCase2.length() == 0) {
                    dVar.e(g.EMPTY_END, null, null, this.f69345h);
                } else {
                    int iE = this.f69343f.e(upperCase2);
                    if (iE == 0) {
                        dVar.e(g.UNMATCHED_END, null, null, this.f69345h);
                    } else {
                        while (iE > 0) {
                            dVar.a(this.f69343f.d(), this.f69345h);
                            iE--;
                        }
                    }
                }
            } else {
                if ("VERSION".equalsIgnoreCase(dVarI.b())) {
                    String strB = this.f69343f.b();
                    if (this.f69340c.d(strB)) {
                        eq.a aVarC = this.f69340c.c(strB, dVarI.d());
                        if (aVarC == null) {
                            dVar.e(g.UNKNOWN_VERSION, dVarI, null, this.f69345h);
                        } else {
                            dVar.b(dVarI.d(), this.f69345h);
                            this.f69343f.g(aVarC);
                        }
                    }
                }
                dVar.d(dVarI, this.f69345h);
            }
        }
    }

    public void J(boolean z11) {
        this.f69341d = z11;
    }

    public void T(Charset charset) {
        this.f69342e = charset;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f69339b.close();
    }

    public Charset o() {
        return this.f69342e;
    }

    public boolean p() {
        return this.f69341d;
    }
}
