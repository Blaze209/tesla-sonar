package com.fourthline.nfc.internal;

import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcData;
import com.fourthline.nfc.NfcDataGroup;
import com.fourthline.nfc.NfcScannerSecurityKey;
import com.fourthline.nfc.PersonalDetailsKt;
import com.plaid.internal.EnumC4419g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.sf.scuba.smartcards.CardServiceException;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends J0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final NfcScannerSecurityKey f24588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExtraNfcScannerConfig f24589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X f24590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private yq0.n f24591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC2829t f24592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final I f24593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final I0.a f24594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f24595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f24596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f24597n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Boolean f24598o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f24599p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f24600q;

    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24601a = new a();

        public a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof br0.n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(NfcScannerSecurityKey key, ExtraNfcScannerConfig extraNfcScannerConfig, X imageConverter) {
        super(key);
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        this.f24588e = key;
        this.f24589f = extraNfcScannerConfig;
        this.f24590g = imageConverter;
        this.f24593j = new I();
        this.f24594k = new I0.a("mrtd", extraNfcScannerConfig != null ? extraNfcScannerConfig.getIssueCountry() : null, extraNfcScannerConfig != null ? extraNfcScannerConfig.getDocumentType() : null);
        this.f24596m = p013kotlin.collections.v.m();
        this.f24600q = jn0.m.b(new wn0.a() { // from class: com.fourthline.nfc.internal.g1
            @Override // wn0.a
            public final Object invoke() {
                return J.a(this.f24648a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(J j11, zo0.a aVar) {
        j11.f24595l++;
        p013kotlin.text.t.n(" \n                    \"type = " + aVar.c() + "\" \n                    \"commandAPDU = " + aVar.a() + "\" \n                    \"responseAPDU = " + aVar.b() + "\"\n                ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(J j11) {
        return j11.f24599p;
    }

    @Override // com.fourthline.nfc.internal.J0
    public List e() {
        return (List) this.f24600q.getValue();
    }

    @Override // com.fourthline.nfc.internal.J0
    public I0.a f() {
        return this.f24594k;
    }

    @Override // com.fourthline.nfc.internal.J0
    public void h() throws CardServiceException {
        yq0.n nVar = new yq0.n(g(), 65536, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, false, false);
        nVar.a(new zo0.b() { // from class: com.fourthline.nfc.internal.h1
            @Override // zo0.b
            public final void a(zo0.a aVar) {
                J.a(this.f24650a, aVar);
            }
        });
        nVar.e();
        this.f24591h = nVar;
        m();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0003, B:5:0x0009, B:8:0x0010, B:10:0x001f, B:12:0x0025, B:14:0x0032, B:16:0x003d, B:18:0x0048, B:20:0x0053, B:22:0x0063, B:25:0x006a), top: B:45:0x0003 }] */
    @Override // com.fourthline.nfc.internal.J0
    public void i() throws NfcException.b, CardServiceException {
        List listM;
        ho0.i iVarE0;
        ho0.i iVarZ;
        ho0.i iVarZ2;
        ho0.i iVarZ3;
        yq0.n nVar = null;
        try {
            yq0.n nVar2 = this.f24591h;
            if (nVar2 == null) {
                p013kotlin.jvm.internal.s.B("passportService");
                nVar2 = null;
            }
            Collection<br0.p> collectionA = new br0.h(nVar2.k((short) 284)).a();
            if (collectionA == null || (iVarE0 = p013kotlin.collections.v.e0(collectionA)) == null) {
                listM = p013kotlin.collections.v.m();
            } else {
                ho0.i iVarH = ho0.l.H(iVarE0, a.f24601a);
                p013kotlin.jvm.internal.s.i(iVarH, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
                if (iVarH == null || (iVarZ = ho0.l.Z(iVarH, new y0())) == null || (iVarZ2 = ho0.l.Z(iVarZ, new B0())) == null || (iVarZ3 = ho0.l.Z(iVarZ2, new A0())) == null) {
                    listM = p013kotlin.collections.v.m();
                } else {
                    final wn0.p pVar = new wn0.p() { // from class: com.fourthline.nfc.internal.i1
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return Integer.valueOf(J.a((br0.n) obj, (br0.n) obj2));
                        }
                    };
                    ho0.i iVarZ4 = ho0.l.Z(iVarZ3, new Comparator() { // from class: com.fourthline.nfc.internal.j1
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return J.a(pVar, obj, obj2);
                        }
                    });
                    if (iVarZ4 == null || (listM = ho0.l.c0(iVarZ4)) == null) {
                        listM = p013kotlin.collections.v.m();
                    }
                }
            }
        } catch (Throwable th2) {
            if (a(th2)) {
                throw th2;
            }
            listM = p013kotlin.collections.v.m();
        }
        this.f24596m = listM;
        NfcScannerSecurityKey nfcScannerSecurityKeyL = l();
        if (nfcScannerSecurityKeyL instanceof NfcScannerSecurityKey.BacKey) {
            a((NfcScannerSecurityKey.BacKey) l());
        } else {
            if (!(nfcScannerSecurityKeyL instanceof NfcScannerSecurityKey.PaceKey)) {
                throw new IllegalArgumentException("Key type is not supported!");
            }
            a((NfcScannerSecurityKey.PaceKey) l());
        }
        dr0.w wVar = new dr0.w(g());
        yq0.n nVar3 = this.f24591h;
        if (nVar3 == null) {
            p013kotlin.jvm.internal.s.B("passportService");
        } else {
            nVar = nVar3;
        }
        dr0.y yVarM = nVar.m();
        p013kotlin.jvm.internal.s.j(yVarM, "getWrapper(...)");
        this.f24592i = new D(wVar, yVarM);
    }

    @Override // com.fourthline.nfc.internal.J0
    public List j() throws Throwable {
        br0.k kVarA;
        br0.k kVarA2;
        NfcDataGroup nfcDataGroup;
        NfcDataGroup nfcDataGroup2;
        NfcDataGroup nfcDataGroup3;
        Object encoded;
        d().c(f());
        InterfaceC2829t interfaceC2829t = this.f24592i;
        NfcDataGroup nfcDataGroup4 = null;
        if (interfaceC2829t == null) {
            p013kotlin.jvm.internal.s.B("dataGroupStreamProvider");
            interfaceC2829t = null;
        }
        br0.o oVar = new br0.o(interfaceC2829t.a(H.SOD));
        Set<Integer> setKeySet = oVar.h().keySet();
        ArrayList arrayList = new ArrayList();
        InterfaceC2829t interfaceC2829t2 = this.f24592i;
        if (interfaceC2829t2 == null) {
            p013kotlin.jvm.internal.s.B("dataGroupStreamProvider");
            interfaceC2829t2 = null;
        }
        cr0.e eVar = new cr0.e(interfaceC2829t2.a(H.DG1));
        arrayList.add(eVar);
        InterfaceC2829t interfaceC2829t3 = this.f24592i;
        if (interfaceC2829t3 == null) {
            p013kotlin.jvm.internal.s.B("dataGroupStreamProvider");
            interfaceC2829t3 = null;
        }
        cr0.f fVar = new cr0.f(interfaceC2829t3.a(H.DG2));
        arrayList.add(fVar);
        try {
            InterfaceC2829t interfaceC2829t4 = this.f24592i;
            if (interfaceC2829t4 == null) {
                p013kotlin.jvm.internal.s.B("dataGroupStreamProvider");
                interfaceC2829t4 = null;
            }
            kVarA = new cr0.a(interfaceC2829t4.a(H.DG11));
            arrayList.add(kVarA);
        } catch (Throwable th2) {
            kVarA = a(th2, setKeySet, arrayList, 11);
        }
        br0.k kVar = kVarA;
        try {
            InterfaceC2829t interfaceC2829t5 = this.f24592i;
            if (interfaceC2829t5 == null) {
                p013kotlin.jvm.internal.s.B("dataGroupStreamProvider");
                interfaceC2829t5 = null;
            }
            kVarA2 = new cr0.b(interfaceC2829t5.a(H.DG12));
            arrayList.add(kVarA2);
        } catch (Throwable th3) {
            kVarA2 = a(th3, setKeySet, arrayList, 12);
        }
        d().a(f(), setKeySet, arrayList, this.f24595l);
        MrzInfo.Companion companion = MrzInfo.INSTANCE;
        String string = eVar.h().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        MrzInfo mrzInfoCreate = companion.create(string);
        if (mrzInfoCreate != null) {
            byte[] encoded2 = eVar.getEncoded();
            p013kotlin.jvm.internal.s.j(encoded2, "getEncoded(...)");
            nfcDataGroup = new NfcDataGroup(1, encoded2, NfcData.NfcDataType.MRZ_INFO, mrzInfoCreate);
        } else {
            nfcDataGroup = null;
        }
        List<org.jmrtd.lds.iso19794.b> listJ = fVar.j();
        p013kotlin.jvm.internal.s.j(listJ, "getFaceInfos(...)");
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(listJ, 10));
        Iterator<T> it = listJ.iterator();
        while (it.hasNext()) {
            arrayList2.add(((org.jmrtd.lds.iso19794.b) it.next()).d());
        }
        org.jmrtd.lds.iso19794.a aVar = (org.jmrtd.lds.iso19794.a) p013kotlin.collections.v.q0(p013kotlin.collections.v.A(arrayList2));
        if (aVar != null) {
            byte[] encoded3 = fVar.getEncoded();
            p013kotlin.jvm.internal.s.j(encoded3, "getEncoded(...)");
            nfcDataGroup2 = new NfcDataGroup(2, encoded3, NfcData.NfcDataType.PHOTO, this.f24590g.a(Z.a(aVar)));
        } else {
            nfcDataGroup2 = null;
        }
        if (kVar != null) {
            byte[] encoded4 = kVar.getEncoded();
            p013kotlin.jvm.internal.s.j(encoded4, "getEncoded(...)");
            NfcData.NfcDataType nfcDataType = NfcData.NfcDataType.PERSONAL_DETAILS;
            cr0.a aVar2 = kVar instanceof cr0.a ? (cr0.a) kVar : null;
            if (aVar2 == null || (encoded = PersonalDetailsKt.getPersonalDetails(aVar2)) == null) {
                encoded = kVar.getEncoded();
            }
            p013kotlin.jvm.internal.s.h(encoded);
            nfcDataGroup3 = new NfcDataGroup(11, encoded4, nfcDataType, encoded);
        } else {
            nfcDataGroup3 = null;
        }
        if (kVarA2 != null) {
            byte[] encoded5 = kVarA2.getEncoded();
            p013kotlin.jvm.internal.s.j(encoded5, "getEncoded(...)");
            NfcData.NfcDataType nfcDataType2 = NfcData.NfcDataType.DOCUMENT_DETAILS;
            byte[] encoded6 = kVarA2.getEncoded();
            p013kotlin.jvm.internal.s.j(encoded6, "getEncoded(...)");
            nfcDataGroup4 = new NfcDataGroup(12, encoded5, nfcDataType2, encoded6);
        }
        byte[] encoded7 = oVar.getEncoded();
        p013kotlin.jvm.internal.s.j(encoded7, "getEncoded(...)");
        NfcData.NfcDataType nfcDataType3 = NfcData.NfcDataType.SECURITY_OBJECT;
        byte[] encoded8 = oVar.getEncoded();
        p013kotlin.jvm.internal.s.j(encoded8, "getEncoded(...)");
        return p013kotlin.collections.v.r(nfcDataGroup, nfcDataGroup2, nfcDataGroup3, nfcDataGroup4, new NfcDataGroup(20, encoded7, nfcDataType3, encoded8));
    }

    private final boolean m() throws CardServiceException {
        zo0.f fVar = new zo0.f(new byte[]{0, -92, 0, 12});
        try {
            yq0.n nVar = this.f24591h;
            if (nVar == null) {
                p013kotlin.jvm.internal.s.B("passportService");
                nVar = null;
            }
            nVar.f(fVar);
            return true;
        } catch (CardServiceException e11) {
            if (a(e11)) {
                throw e11;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.fourthline.nfc.internal.J0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public I d() {
        return this.f24593j;
    }

    public NfcScannerSecurityKey l() {
        return this.f24588e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(br0.n nVar, br0.n nVar2) {
        return nVar.f().compareTo(nVar2.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(wn0.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final void a(NfcScannerSecurityKey.BacKey bacKey) throws NfcException.b, CardServiceException {
        yq0.h hVar = new yq0.h(bacKey.getDocumentNumber(), bacKey.getBirthDate(), bacKey.getExpiryDate());
        try {
            yq0.n nVar = this.f24591h;
            if (nVar == null) {
                p013kotlin.jvm.internal.s.B("passportService");
                nVar = null;
            }
            nVar.o(false);
        } catch (CardServiceException e11) {
            if (a(e11)) {
                throw e11;
            }
        } catch (Throwable unused) {
        }
        if (!a(hVar) && !a((yq0.g) hVar)) {
            throw new NfcException.b("Could not authenticate the chip.");
        }
    }

    private final void a(NfcScannerSecurityKey.PaceKey paceKey) throws NfcException.b {
        yq0.l lVarA = yq0.l.a(paceKey.getCanNumber());
        p013kotlin.jvm.internal.s.h(lVarA);
        if (!a(lVarA)) {
            throw new NfcException.b("Could not authenticate with Pace.");
        }
    }

    private final boolean a(yq0.h hVar) throws CardServiceException {
        try {
            I iD = d();
            I0.a aVarF = f();
            I0.b.C0469b c0469b = I0.b.C0469b.f24582b;
            iD.a(aVarF, c0469b);
            yq0.n nVar = this.f24591h;
            if (nVar == null) {
                p013kotlin.jvm.internal.s.B("passportService");
                nVar = null;
            }
            nVar.h(hVar);
            d().b(f(), c0469b);
            return true;
        } catch (CardServiceException e11) {
            if (!a(e11)) {
                d().a(f(), I0.b.C0469b.f24582b, e11);
                return false;
            }
            throw e11;
        }
    }

    private final boolean a(yq0.g gVar) throws CardServiceException {
        m();
        F0.a();
        yq0.n nVar = null;
        I0.b.e eVar = new I0.b.e(null, null, 3, null);
        Iterator it = this.f24596m.iterator();
        if (!it.hasNext()) {
            return false;
        }
        br0.n nVar2 = (br0.n) it.next();
        try {
            this.f24597n = nVar2.g();
            List list = this.f24596m;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((br0.n) it2.next()).g());
            }
            I0.b.e eVar2 = new I0.b.e(arrayList, this.f24597n);
            try {
                d().a(f(), eVar2);
                nVar2.g();
                yq0.n nVar3 = this.f24591h;
                if (nVar3 == null) {
                    p013kotlin.jvm.internal.s.B("passportService");
                    nVar3 = null;
                }
                nVar3.j(gVar, nVar2.e(), br0.n.n(nVar2.f()), nVar2.f());
                this.f24598o = Boolean.TRUE;
                yq0.n nVar4 = this.f24591h;
                if (nVar4 == null) {
                    p013kotlin.jvm.internal.s.B("passportService");
                } else {
                    nVar = nVar4;
                }
                nVar.o(true);
                this.f24599p = br0.n.l(nVar2.e()) == br0.n.b.CAM;
                d().b(f(), eVar2);
                return true;
            } catch (CardServiceException e11) {
                e = e11;
                eVar = eVar2;
                if (!a(e)) {
                    this.f24598o = Boolean.FALSE;
                    d().a(f(), eVar, e);
                    nVar2.g();
                    return false;
                }
                throw e;
            }
        } catch (CardServiceException e12) {
            e = e12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(final J j11) {
        InterfaceC2829t interfaceC2829t = j11.f24592i;
        yq0.n nVar = null;
        if (interfaceC2829t == null) {
            p013kotlin.jvm.internal.s.B("dataGroupStreamProvider");
            interfaceC2829t = null;
        }
        InputStream inputStreamA = interfaceC2829t.a(H.DG15);
        C2813g c2813g = inputStreamA != null ? new C2813g(inputStreamA) : null;
        InterfaceC2829t interfaceC2829t2 = j11.f24592i;
        if (interfaceC2829t2 == null) {
            p013kotlin.jvm.internal.s.B("dataGroupStreamProvider");
            interfaceC2829t2 = null;
        }
        InputStream inputStreamA2 = interfaceC2829t2.a(H.DG14);
        E e11 = new E(c2813g, inputStreamA2 != null ? new E0(inputStreamA2) : null);
        yq0.n nVar2 = j11.f24591h;
        if (nVar2 == null) {
            p013kotlin.jvm.internal.s.B("passportService");
        } else {
            nVar = nVar2;
        }
        C c11 = new C(nVar, j11);
        return p013kotlin.collections.v.p(new z0(new wn0.a() { // from class: com.fourthline.nfc.internal.f1
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(J.b(this.f24645a));
            }
        }), new C2821k(e11, c11), new C2801a(null, e11, c11, 1, null));
    }

    private final br0.k a(Throwable th2, Set set, List list, int i11) throws Throwable {
        if (!a(th2)) {
            return null;
        }
        d().a(f(), set, list, i11, this.f24595l, th2);
        throw th2;
    }
}
