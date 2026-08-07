package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoDuration;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentValidationConfig;
import com.fourthline.vision.document.MrzValidationPolicy;
import java.net.URI;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3589n9 implements InterfaceC3546m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3085bb f33850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4104z8 f33851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Kp f33852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E6 f33853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Cm f33854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f33855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Integer f33857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f33858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f33859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f33860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f33861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f33862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final double f33863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC3281g0 f33864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final A7 f33865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Kp f33866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f33867r;

    public C3589n9(C3085bb flowConfig, C4104z8 bundle, Kp personBundle, E6 deviceDataBundle, Cm nfcResultToBundleMapper, boolean z11, boolean z12, Integer num, boolean z13) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        p013kotlin.jvm.internal.s.k(nfcResultToBundleMapper, "nfcResultToBundleMapper");
        this.f33850a = flowConfig;
        this.f33851b = bundle;
        this.f33852c = personBundle;
        this.f33853d = deviceDataBundle;
        this.f33854e = nfcResultToBundleMapper;
        this.f33855f = z11;
        this.f33856g = z12;
        this.f33857h = num;
        this.f33858i = z13;
        this.f33859j = true;
        this.f33860k = flowConfig.b().getEnabled();
        FlowStrategyConfig flowStrategyConfigD = flowConfig.d();
        C3632o9 c3632o9 = C3632o9.f34099a;
        this.f33861l = flowStrategyConfigD.a(c3632o9.c());
        this.f33862m = flowConfig.d().a(c3632o9.b()) ? false : flowConfig.c().getEnabled();
        this.f33863n = flowConfig.e().a();
        this.f33864o = flowConfig.d().a(c3632o9.a()) ? InterfaceC3281g0.b.f31908a : InterfaceC3281g0.a.f31907a;
        this.f33865p = bundle.g();
        this.f33866q = bundle.k();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3298gb
    public void a(C2973Va result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        a(result.a());
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public void b(Date date) {
        this.f33865p.a(date);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean c() {
        return this.f33861l;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public DocumentType d() {
        return InterfaceC3546m9.a.b(this);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public X7 e() {
        return this.f33851b.o();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public Integer f() {
        return this.f33857h;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public boolean g() {
        return AbstractC3672p6.a(this.f33852c.q().b(), t().getValidationConfig().getMinPersonAge());
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean h() {
        return this.f33856g;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public C3725qa i() {
        return InterfaceC3546m9.a.a(this);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public boolean j() {
        return this.f33867r;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean k() {
        return this.f33859j;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public Date l() {
        return this.f33865p.b();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public InterfaceC3281g0 m() {
        return this.f33864o;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public boolean n() {
        Date dateL = l();
        if (dateL == null) {
            return false;
        }
        G5 g5A = a();
        if (p013kotlin.jvm.internal.s.f(g5A != null ? g5A.c() : null, "FRA")) {
            X7 x7E = e();
            if ((x7E != null ? x7E.c() : null) == DocumentType.ID_CARD) {
                return true;
            }
        }
        X7 x7E2 = e();
        if ((x7E2 != null ? x7E2.c() : null) == DocumentType.FRENCH_ID_CARD) {
            return true;
        }
        Date dateA = AbstractC3672p6.a(dateL, null, 2, null);
        Date dateA2 = AbstractC3672p6.a(new Date(), null, 2, null);
        return p013kotlin.jvm.internal.s.f(dateA, dateA2) || dateA.after(dateA2);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean o() {
        return this.f33862m;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public double p() {
        return this.f33863n;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public boolean q() {
        return this.f33865p.a();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public boolean r() {
        return this.f33860k;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public String s() {
        return this.f33865p.g();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public DocumentScannerConfig t() {
        DocumentType documentTypeC;
        if (c()) {
            documentTypeC = this.f33851b.m();
            if (documentTypeC == null) {
                X7 x7O = this.f33851b.o();
                documentTypeC = x7O != null ? x7O.c() : null;
                if (documentTypeC == null) {
                    throw new NullPointerException("Document type is not provided either via Builder or from Document Type selection screen");
                }
            }
        } else {
            X7 x7O2 = this.f33851b.o();
            if (x7O2 == null || (documentTypeC = x7O2.c()) == null) {
                throw new NullPointerException("Document type is not provided either via Builder or from Document Type selection screen");
            }
        }
        return new DocumentScannerConfig(documentTypeC, u(), this.f33851b.j() == null && this.f33850a.i(), false, RecordingType.VIDEO_ONLY, MrzValidationPolicy.NORMAL, new DocumentValidationConfig(this.f33850a.b().getMinimumAge(), this.f33850a.h()), VideoDuration.DEFAULT.INSTANCE, 10L, this.f33858i);
    }

    public boolean u() {
        return this.f33855f;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3212eb
    public G5 a() {
        return this.f33851b.h();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public Date b() {
        return this.f33852c.b();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public void a(boolean z11) {
        this.f33867r = z11;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public void a(String str) {
        this.f33865p.b(str);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3289g8
    public void a(Date date) {
        this.f33852c.q().a(date);
    }

    private final void a(DocumentScannerResult documentScannerResult) {
        X7 x7E;
        URI url;
        this.f33851b.a(documentScannerResult.getMrzInfo() != null);
        this.f33851b.a(documentScannerResult);
        C4104z8 c4104z8 = this.f33851b;
        VideoRecording videoRecording = documentScannerResult.getVideoRecording();
        c4104z8.a((videoRecording == null || (url = videoRecording.getUrl()) == null) ? null : AbstractC3166dD.a(url));
        this.f33853d.a(documentScannerResult.getMetadata().getMotionData());
        A7 a11 = this.f33865p;
        a11.b((String) null);
        a11.b((Date) null);
        a11.a((Date) null);
        a11.a((List) null);
        AbstractC2927Ra.a(a11, documentScannerResult);
        Am amJ = this.f33851b.j();
        if (amJ != null && (x7E = e()) != null) {
            this.f33854e.a(amJ, x7E.c());
        }
        a(this.f33852c.n(), documentScannerResult);
        a(false);
    }

    public final void a(Lp lp2, DocumentScannerResult result) {
        p013kotlin.jvm.internal.s.k(lp2, "<this>");
        p013kotlin.jvm.internal.s.k(result, "result");
        MrzInfo mrzInfo = result.getMrzInfo();
        if (mrzInfo instanceof MrtdMrzInfo) {
            MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) mrzInfo;
            lp2.b(a(mrtdMrzInfo.getFirstNames()));
            lp2.c(a(mrtdMrzInfo.getLastNames()));
            lp2.a(mrtdMrzInfo.getValidationErrors().contains(MrtdMrzInfoValidationError.INVALID_BIRTH_DATE) ? null : mrtdMrzInfo.getBirthDate());
            lp2.d(mrtdMrzInfo.getNationality());
            lp2.a(mrtdMrzInfo.getGender());
        }
    }

    private final String a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = ((String) next) + " " + ((String) it.next());
            }
            return (String) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
