package bk0;

import ak0.g1;
import ak0.o0;
import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.io.SkipMeException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Address;
import ezvcard.property.Label;
import ezvcard.property.VCardProperty;
import ezvcard.util.h;
import gq.d;
import gq.e;
import gq.f;
import gq.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class a extends yj0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f17506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VCardVersion f17507e;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0351a> f17508a;

        /* JADX INFO: renamed from: bk0.a$b$a, reason: collision with other inner class name */
        private static class C0351a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VCard f17509a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List<Label> f17510b;

            public C0351a(VCard vCard, List<Label> list) {
                this.f17509a = vCard;
                this.f17510b = list;
            }
        }

        private b() {
            this.f17508a = new ArrayList();
        }

        public boolean a() {
            return this.f17508a.isEmpty();
        }

        public C0351a b() {
            if (a()) {
                return null;
            }
            List<C0351a> list = this.f17508a;
            return list.get(list.size() - 1);
        }

        public C0351a c() {
            if (a()) {
                return null;
            }
            List<C0351a> list = this.f17508a;
            return list.remove(list.size() - 1);
        }

        public void d(VCard vCard) {
            this.f17508a.add(new C0351a(vCard, new ArrayList()));
        }
    }

    private class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private VCard f17511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f17512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EmbeddedVCardException f17513c;

        private c() {
            this.f17512b = new b();
        }

        private String g(String str) {
            if (VCardDataType.c(str) != null) {
                return "VALUE";
            }
            return ezvcard.parameter.a.e(str) != null ? "ENCODING" : "TYPE";
        }

        private void h(VCardProperty vCardProperty) {
            Address address;
            String label;
            if ((vCardProperty instanceof Address) && (label = (address = (Address) vCardProperty).getLabel()) != null) {
                address.setLabel(label.replace("\\n", h.f63685a));
            }
        }

        private void i(String str, int i11, SkipMeException skipMeException) {
            ((yj0.c) a.this).f125636a.add(new yj0.b.C2731b(((yj0.c) a.this).f125638c).c(22, skipMeException.getMessage()).a());
        }

        private VCardProperty j(String str, VCardParameters vCardParameters, String str2, VCardDataType vCardDataType, int i11, VCardVersion vCardVersion, CannotParseException cannotParseException) {
            ((yj0.c) a.this).f125636a.add(new yj0.b.C2731b(((yj0.c) a.this).f125638c).d(cannotParseException).a());
            return new o0(str).h(str2, vCardDataType, vCardParameters, null);
        }

        private void k(String str, String str2, int i11, EmbeddedVCardException embeddedVCardException) {
            if (str2.trim().length() == 0) {
                this.f17513c = embeddedVCardException;
                return;
            }
            a aVar = new a(e.f(str2));
            aVar.J0(a.this.H0());
            aVar.K0(a.this.G0());
            aVar.t(((yj0.c) a.this).f125637b);
            try {
                VCard vCardP = aVar.p();
                if (vCardP != null) {
                    embeddedVCardException.b(vCardP);
                }
            } catch (IOException unused) {
            } finally {
                ((yj0.c) a.this).f125636a.addAll(aVar.o());
                ezvcard.util.f.a(aVar);
            }
        }

        private boolean l(List<String> list) {
            if (list.isEmpty()) {
                return false;
            }
            return m(list.get(list.size() - 1));
        }

        private boolean m(String str) {
            return "VCARD".equals(str);
        }

        private VCardProperty n(eq.d dVar, VCardVersion vCardVersion, int i11) {
            VCardProperty vCardPropertyA;
            c cVar;
            SkipMeException skipMeException;
            String strA = dVar.a();
            String strB = dVar.b();
            VCardParameters vCardParameters = new VCardParameters(dVar.c().g());
            String strD = dVar.d();
            ((yj0.c) a.this).f125638c.e().clear();
            ((yj0.c) a.this).f125638c.h(vCardVersion);
            ((yj0.c) a.this).f125638c.f(Integer.valueOf(i11));
            ((yj0.c) a.this).f125638c.g(strB);
            o(vCardParameters);
            p(vCardParameters, vCardVersion);
            g1<? extends VCardProperty> g1VarA = ((yj0.c) a.this).f125637b.a(strB);
            if (g1VarA == null) {
                g1VarA = new o0(strB);
            }
            VCardDataType vCardDataTypeB = vCardParameters.B();
            vCardParameters.Q(null);
            if (vCardDataTypeB == null) {
                vCardDataTypeB = g1VarA.d(vCardVersion);
            }
            VCardDataType vCardDataType = vCardDataTypeB;
            try {
                try {
                    try {
                        vCardPropertyA = g1VarA.h(strD, vCardDataType, vCardParameters, ((yj0.c) a.this).f125638c);
                        ((yj0.c) a.this).f125636a.addAll(((yj0.c) a.this).f125638c.e());
                    } catch (SkipMeException e11) {
                        skipMeException = e11;
                        i(strB, i11, skipMeException);
                        return null;
                    }
                } catch (SkipMeException e12) {
                    skipMeException = e12;
                }
            } catch (CannotParseException e13) {
                cVar = this;
                vCardPropertyA = cVar.j(strB, vCardParameters, strD, vCardDataType, i11, vCardVersion, e13);
            } catch (EmbeddedVCardException e14) {
                k(strB, strD, i11, e14);
                vCardPropertyA = e14.a();
            }
            cVar = this;
            vCardPropertyA.setGroup(strA);
            if (!(vCardPropertyA instanceof Label)) {
                h(vCardPropertyA);
                return vCardPropertyA;
            }
            cVar.f17512b.b().f17510b.add((Label) vCardPropertyA);
            return null;
        }

        private void o(VCardParameters vCardParameters) {
            for (String str : vCardParameters.h(null)) {
                vCardParameters.f(g(str), str);
            }
        }

        private void p(VCardParameters vCardParameters, VCardVersion vCardVersion) {
            String next;
            if (vCardVersion == VCardVersion.V2_1) {
                return;
            }
            List<String> listA = vCardParameters.A();
            if (listA.isEmpty()) {
                return;
            }
            Iterator<String> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.indexOf(44) < 0);
            if (next == null) {
                return;
            }
            listA.clear();
            int i11 = -1;
            while (true) {
                int i12 = i11 + 1;
                int iIndexOf = next.indexOf(44, i12);
                if (iIndexOf < 0) {
                    listA.add(next.substring(i12));
                    return;
                } else {
                    listA.add(next.substring(i12, iIndexOf));
                    i11 = iIndexOf;
                }
            }
        }

        @Override // gq.d
        public void a(String str, gq.b bVar) {
            if (m(str)) {
                b.C0351a c0351aC = this.f17512b.c();
                a.this.n(c0351aC.f17509a, c0351aC.f17510b);
                if (this.f17512b.a()) {
                    bVar.d();
                }
            }
        }

        @Override // gq.d
        public void b(String str, gq.b bVar) {
            VCardVersion vCardVersionValueOfByStr = VCardVersion.valueOfByStr(str);
            ((yj0.c) a.this).f125638c.h(vCardVersionValueOfByStr);
            this.f17512b.b().f17509a.p(vCardVersionValueOfByStr);
        }

        @Override // gq.d
        public void c(String str, gq.b bVar) {
            if (m(str)) {
                VCard vCard = new VCard(a.this.f17507e);
                if (this.f17512b.a()) {
                    this.f17511a = vCard;
                }
                this.f17512b.d(vCard);
                EmbeddedVCardException embeddedVCardException = this.f17513c;
                if (embeddedVCardException != null) {
                    embeddedVCardException.b(vCard);
                    this.f17513c = null;
                }
            }
        }

        @Override // gq.d
        public void d(eq.d dVar, gq.b bVar) {
            if (l(bVar.b())) {
                EmbeddedVCardException embeddedVCardException = this.f17513c;
                if (embeddedVCardException != null) {
                    embeddedVCardException.b(null);
                    this.f17513c = null;
                }
                VCard vCard = this.f17512b.b().f17509a;
                VCardProperty vCardPropertyN = n(dVar, vCard.o(), bVar.a());
                if (vCardPropertyN != null) {
                    vCard.d(vCardPropertyN);
                }
            }
        }

        @Override // gq.d
        public void e(g gVar, eq.d dVar, Exception exc, gq.b bVar) {
            if (l(bVar.b())) {
                ((yj0.c) a.this).f125636a.add(new yj0.b.C2731b(((yj0.c) a.this).f125638c).b(Integer.valueOf(bVar.a())).e(dVar == null ? null : dVar.b()).c(27, gVar.getMessage(), bVar.c()).a());
            }
        }
    }

    public a(String str) {
        this(str, VCardVersion.V2_1);
    }

    public Charset G0() {
        return this.f17506d.o();
    }

    public boolean H0() {
        return this.f17506d.p();
    }

    public void J0(boolean z11) {
        this.f17506d.J(z11);
    }

    public void K0(Charset charset) {
        this.f17506d.T(charset);
    }

    @Override // yj0.c
    protected VCard c() {
        c cVar = new c();
        this.f17506d.H(cVar);
        return cVar.f17511a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17506d.close();
    }

    public a(String str, VCardVersion vCardVersion) {
        this(new StringReader(str), vCardVersion);
    }

    public a(InputStream inputStream) {
        this(inputStream, VCardVersion.V2_1);
    }

    public a(InputStream inputStream, VCardVersion vCardVersion) {
        this(new InputStreamReader(inputStream), vCardVersion);
    }

    public a(File file) {
        this(file, VCardVersion.V2_1);
    }

    public a(File file, VCardVersion vCardVersion) {
        this(new BufferedReader(new FileReader(file)), vCardVersion);
    }

    public a(Reader reader) {
        this(reader, VCardVersion.V2_1);
    }

    public a(Reader reader, VCardVersion vCardVersion) {
        gq.c cVarF = gq.c.f();
        cVarF.e(vCardVersion.getSyntaxStyle());
        this.f17506d = new f(reader, cVarF);
        this.f17507e = vCardVersion;
    }
}
