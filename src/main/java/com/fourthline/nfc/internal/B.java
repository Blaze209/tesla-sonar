package com.fourthline.nfc.internal;

import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcData;
import com.fourthline.nfc.NfcDataGroup;
import com.fourthline.nfc.NfcScannerSecurityKey;
import com.plaid.internal.EnumC4419g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.sf.scuba.smartcards.CardServiceException;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends J0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a f24506m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f24507n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f24508o = {-96, 0, 0, 4, 86, 69, 68, 76, 45, 48, 49};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final NfcScannerSecurityKey.BapKey f24509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private dr0.w f24510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zo0.k f24511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2835z f24512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f24513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final A f24514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final I0.a f24515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f24516l;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(NfcScannerSecurityKey.BapKey key, ExtraNfcScannerConfig extraNfcScannerConfig) {
        super(key);
        p013kotlin.jvm.internal.s.k(key, "key");
        this.f24509e = key;
        this.f24514j = new A();
        this.f24515k = new I0.a("idl", extraNfcScannerConfig != null ? extraNfcScannerConfig.getIssueCountry() : null, extraNfcScannerConfig != null ? extraNfcScannerConfig.getDocumentType() : null);
        this.f24516l = jn0.m.b(new wn0.a() { // from class: com.fourthline.nfc.internal.a1
            @Override // wn0.a
            public final Object invoke() {
                return B.a(this.f24628a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(B b11) {
        C2835z c2835z;
        zo0.k kVar = b11.f24511g;
        C2835z c2835z2 = null;
        if (kVar == null) {
            p013kotlin.jvm.internal.s.B("transmittingService");
            kVar = null;
        }
        C c11 = new C(new yq0.n(kVar, 256, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, true, false), b11);
        z0 z0Var = new z0(new wn0.a() { // from class: com.fourthline.nfc.internal.b1
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(B.k());
            }
        });
        C2835z c2835z3 = b11.f24512h;
        if (c2835z3 == null) {
            p013kotlin.jvm.internal.s.B("fileSystem");
            c2835z = null;
        } else {
            c2835z = c2835z3;
        }
        C2801a c2801a = new C2801a(null, c2835z, c11, 1, null);
        C2835z c2835z4 = b11.f24512h;
        if (c2835z4 == null) {
            p013kotlin.jvm.internal.s.B("fileSystem");
        } else {
            c2835z2 = c2835z4;
        }
        return p013kotlin.collections.v.p(z0Var, c2801a, new C2821k(c2835z2, c11));
    }

    private final void n() {
        dr0.w wVar = this.f24510f;
        if (wVar == null) {
            p013kotlin.jvm.internal.s.B("apduSender");
            wVar = null;
        }
        wVar.e(null, f24508o);
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.f24513i++;
    }

    @Override // com.fourthline.nfc.internal.J0
    public List e() {
        return (List) this.f24516l.getValue();
    }

    @Override // com.fourthline.nfc.internal.J0
    public I0.a f() {
        return this.f24515k;
    }

    @Override // com.fourthline.nfc.internal.J0
    public void h() throws CardServiceException {
        this.f24510f = new dr0.w(g());
        g().e();
        n();
    }

    @Override // com.fourthline.nfc.internal.J0
    public void i() {
        I0.b.c cVar = I0.b.c.f24583b;
        d().a(f(), cVar);
        dr0.y yVarA = new C2817i(new dr0.e(g()), 65536, false).a(new C2815h(a(m())));
        zo0.k kVar = new zo0.k(g(), yVarA);
        kVar.g();
        this.f24511g = kVar;
        D d11 = new D(new dr0.w(g()), yVarA);
        InputStream inputStreamA = d11.a(EnumC2834y.DG13);
        C2813g c2813g = inputStreamA != null ? new C2813g(inputStreamA) : null;
        InputStream inputStreamA2 = d11.a(EnumC2834y.DG14);
        this.f24512h = new C2835z(d11, new E(c2813g, inputStreamA2 != null ? new E0(inputStreamA2) : null));
        d().b(f(), cVar);
    }

    @Override // com.fourthline.nfc.internal.J0
    public List j() {
        d().c(f());
        C2835z c2835z = this.f24512h;
        if (c2835z == null) {
            p013kotlin.jvm.internal.s.B("fileSystem");
            c2835z = null;
        }
        br0.o oVarE = c2835z.e();
        Set<Integer> setKeySet = oVarE.h().keySet();
        ArrayList arrayList = new ArrayList();
        C2835z c2835z2 = this.f24512h;
        if (c2835z2 == null) {
            p013kotlin.jvm.internal.s.B("fileSystem");
            c2835z2 = null;
        }
        C2826p c2826pC = c2835z2.c();
        arrayList.add(c2826pC);
        C2835z c2835z3 = this.f24512h;
        if (c2835z3 == null) {
            p013kotlin.jvm.internal.s.B("fileSystem");
            c2835z3 = null;
        }
        C2827q c2827qD = c2835z3.d();
        arrayList.add(c2827qD);
        d().a(f(), setKeySet, arrayList, this.f24513i);
        MrzInfo mrzInfoCreate = MrzInfo.INSTANCE.create(m().getRawMrz());
        NfcData nfcData = mrzInfoCreate != null ? new NfcData(NfcData.NfcDataType.MRZ_INFO, mrzInfoCreate) : null;
        NfcDataGroup nfcDataGroup = new NfcDataGroup(1, c2826pC.a(), NfcData.NfcDataType.IDL_BASIC_INFO, c2826pC.b());
        NfcDataGroup nfcDataGroup2 = new NfcDataGroup(6, c2827qD.a(), NfcData.NfcDataType.PHOTO, c2827qD.b());
        byte[] encoded = oVarE.getEncoded();
        p013kotlin.jvm.internal.s.j(encoded, "getEncoded(...)");
        NfcData.NfcDataType nfcDataType = NfcData.NfcDataType.SECURITY_OBJECT;
        byte[] encoded2 = oVarE.getEncoded();
        p013kotlin.jvm.internal.s.j(encoded2, "getEncoded(...)");
        return p013kotlin.collections.v.r(nfcData, nfcDataGroup, nfcDataGroup2, new NfcDataGroup(20, encoded, nfcDataType, encoded2));
    }

    @Override // com.fourthline.nfc.internal.J0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public A d() {
        return this.f24514j;
    }

    public NfcScannerSecurityKey.BapKey m() {
        return this.f24509e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k() {
        return false;
    }

    private final String a(NfcScannerSecurityKey.BapKey bapKey) {
        return p013kotlin.text.t.n1(bapKey.getRawMrz(), new bo0.j(1, 28));
    }
}
