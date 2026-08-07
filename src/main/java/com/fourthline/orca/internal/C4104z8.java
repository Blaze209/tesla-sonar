package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.vision.document.DocumentScannerResult;
import java.util.Arrays;
import java.util.Date;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4104z8 implements W6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A7 f37211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3404ix f37212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Kp f37213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private G5 f37214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private X7 f37215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DocumentScannerResult f37216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f37217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f37219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Am f37220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f37221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f37222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private DocumentType f37223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f37224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC3630o7.a f37225o;

    public C4104z8(A7 document, C3404ix secondaryDocuments, Kp person, G5 g11, X7 x11, DocumentScannerResult documentScannerResult, String str, boolean z11, String str2, Am am2, byte[] bArr, double d11, DocumentType documentType, String str3) {
        p013kotlin.jvm.internal.s.k(document, "document");
        p013kotlin.jvm.internal.s.k(secondaryDocuments, "secondaryDocuments");
        p013kotlin.jvm.internal.s.k(person, "person");
        this.f37211a = document;
        this.f37212b = secondaryDocuments;
        this.f37213c = person;
        this.f37214d = g11;
        this.f37215e = x11;
        this.f37216f = documentScannerResult;
        this.f37217g = str;
        this.f37218h = z11;
        this.f37219i = str2;
        this.f37220j = am2;
        this.f37221k = bArr;
        this.f37222l = d11;
        this.f37223m = documentType;
        this.f37224n = str3;
    }

    private final void e() {
        Lp lpP = this.f37213c.p();
        lpP.b(null);
        lpP.c(null);
        lpP.a((Date) null);
        lpP.a((String) null);
        lpP.d(null);
        lpP.a((Gender) null);
        A7 a11 = this.f37211a;
        a11.b((String) null);
        a11.b((Date) null);
        a11.a((Date) null);
    }

    public final void a(G5 g11) {
        this.f37214d = g11;
    }

    @Override // com.fourthline.orca.internal.W6
    public DocumentScannerResult b() {
        return this.f37216f;
    }

    public final void c(String str) {
        this.f37224n = str;
    }

    @Override // com.fourthline.orca.internal.W6
    public String d() {
        return this.f37217g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4104z8)) {
            return false;
        }
        C4104z8 c4104z8 = (C4104z8) obj;
        return p013kotlin.jvm.internal.s.f(this.f37211a, c4104z8.f37211a) && p013kotlin.jvm.internal.s.f(this.f37212b, c4104z8.f37212b) && p013kotlin.jvm.internal.s.f(this.f37213c, c4104z8.f37213c) && p013kotlin.jvm.internal.s.f(this.f37214d, c4104z8.f37214d) && p013kotlin.jvm.internal.s.f(this.f37215e, c4104z8.f37215e) && p013kotlin.jvm.internal.s.f(this.f37216f, c4104z8.f37216f) && p013kotlin.jvm.internal.s.f(this.f37217g, c4104z8.f37217g) && this.f37218h == c4104z8.f37218h && p013kotlin.jvm.internal.s.f(this.f37219i, c4104z8.f37219i) && p013kotlin.jvm.internal.s.f(this.f37220j, c4104z8.f37220j) && p013kotlin.jvm.internal.s.f(this.f37221k, c4104z8.f37221k) && Double.compare(this.f37222l, c4104z8.f37222l) == 0 && this.f37223m == c4104z8.f37223m && p013kotlin.jvm.internal.s.f(this.f37224n, c4104z8.f37224n);
    }

    public final String f() {
        return this.f37219i;
    }

    public final A7 g() {
        return this.f37211a;
    }

    public final G5 h() {
        return this.f37214d;
    }

    public int hashCode() {
        int iHashCode = ((((this.f37211a.hashCode() * 31) + this.f37212b.hashCode()) * 31) + this.f37213c.hashCode()) * 31;
        G5 g11 = this.f37214d;
        int iHashCode2 = (iHashCode + (g11 == null ? 0 : g11.hashCode())) * 31;
        X7 x11 = this.f37215e;
        int iHashCode3 = (iHashCode2 + (x11 == null ? 0 : x11.hashCode())) * 31;
        DocumentScannerResult documentScannerResult = this.f37216f;
        int iHashCode4 = (iHashCode3 + (documentScannerResult == null ? 0 : documentScannerResult.hashCode())) * 31;
        String str = this.f37217g;
        int iHashCode5 = (((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f37218h)) * 31;
        String str2 = this.f37219i;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Am am2 = this.f37220j;
        int iHashCode7 = (iHashCode6 + (am2 == null ? 0 : am2.hashCode())) * 31;
        byte[] bArr = this.f37221k;
        int iHashCode8 = (((iHashCode7 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31) + Double.hashCode(this.f37222l)) * 31;
        DocumentType documentType = this.f37223m;
        int iHashCode9 = (iHashCode8 + (documentType == null ? 0 : documentType.hashCode())) * 31;
        String str3 = this.f37224n;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final byte[] i() {
        return this.f37221k;
    }

    public final Am j() {
        return this.f37220j;
    }

    public final Kp k() {
        return this.f37213c;
    }

    public final String l() {
        return this.f37224n;
    }

    public final DocumentType m() {
        return this.f37223m;
    }

    public final C3404ix n() {
        return this.f37212b;
    }

    public final X7 o() {
        return this.f37215e;
    }

    public String toString() {
        return "DocumentFlowDataBundle(document=" + this.f37211a + ", secondaryDocuments=" + this.f37212b + ", person=" + this.f37213c + ", documentIssuingCountry=" + this.f37214d + ", selectedDocument=" + this.f37215e + ", documentScannerResult=" + this.f37216f + ", documentAnalysisId=" + this.f37217g + ", isAutoDetectResultAvailable=" + this.f37218h + ", canNumber=" + this.f37219i + ", nfcCapabilityResult=" + this.f37220j + ", inMemoryVideo=" + Arrays.toString(this.f37221k) + ", imageCompression=" + this.f37222l + ", recognizedDocumentType=" + this.f37223m + ", recognizedCountryCode=" + this.f37224n + ")";
    }

    public final void a(X7 x11) {
        this.f37215e = x11;
    }

    public final void b(String str) {
        this.f37219i = str;
    }

    @Override // com.fourthline.orca.internal.W6
    public InterfaceC3630o7.a c() {
        return this.f37225o;
    }

    private final void b(InterfaceC3630o7.a aVar) {
        DocumentType documentType;
        String expirationDate;
        String issueDate;
        String dateOfBirth;
        String documentType2;
        try {
            OcrData ocrDataB = aVar.b();
            if (ocrDataB == null || (documentType2 = ocrDataB.getDocumentType()) == null) {
                documentType = null;
            } else {
                String issuingCountry = aVar.b().getIssuingCountry();
                if (issuingCountry == null) {
                    issuingCountry = "";
                }
                documentType = CountryNetworkModelKt.toDocumentType(documentType2, issuingCountry);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (documentType != null) {
            e();
            Lp lpP = this.f37213c.p();
            OcrData ocrDataB2 = aVar.b();
            lpP.b(ocrDataB2 != null ? ocrDataB2.getFirstName() : null);
            OcrData ocrDataB3 = aVar.b();
            lpP.c(ocrDataB3 != null ? ocrDataB3.getLastName() : null);
            OcrData ocrDataB4 = aVar.b();
            lpP.a(ocrDataB4 != null ? A8.a(ocrDataB4) : null);
            OcrData ocrDataB5 = aVar.b();
            lpP.d(ocrDataB5 != null ? ocrDataB5.getNationality() : null);
            OcrData ocrDataB6 = aVar.b();
            lpP.a((ocrDataB6 == null || (dateOfBirth = ocrDataB6.getDateOfBirth()) == null) ? null : A8.a(dateOfBirth));
            OcrData ocrDataB7 = aVar.b();
            lpP.a(ocrDataB7 != null ? ocrDataB7.getBirthPlace() : null);
            A7 a11 = this.f37211a;
            OcrData ocrDataB8 = aVar.b();
            a11.b((ocrDataB8 == null || (issueDate = ocrDataB8.getIssueDate()) == null) ? null : A8.a(issueDate));
            OcrData ocrDataB9 = aVar.b();
            a11.a((ocrDataB9 == null || (expirationDate = ocrDataB9.getExpirationDate()) == null) ? null : A8.a(expirationDate));
            OcrData ocrDataB10 = aVar.b();
            a11.b(ocrDataB10 != null ? ocrDataB10.getDocumentNumber() : null);
            a11.a(documentType);
        }
    }

    @Override // com.fourthline.orca.internal.W6
    public void a(DocumentScannerResult documentScannerResult) {
        this.f37216f = documentScannerResult;
    }

    @Override // com.fourthline.orca.internal.W6
    public void a(String str) {
        this.f37217g = str;
    }

    @Override // com.fourthline.orca.internal.W6
    public boolean a() {
        return this.f37218h;
    }

    public void a(boolean z11) {
        this.f37218h = z11;
    }

    public final void a(Am am2) {
        this.f37220j = am2;
    }

    public final void a(byte[] bArr) {
        this.f37221k = bArr;
    }

    public final void a(double d11) {
        this.f37222l = d11;
    }

    public final void a(DocumentType documentType) {
        this.f37223m = documentType;
    }

    @Override // com.fourthline.orca.internal.W6
    public void a(InterfaceC3630o7.a aVar) {
        if (aVar != null) {
            b(aVar);
        } else {
            aVar = null;
        }
        this.f37225o = aVar;
    }

    public /* synthetic */ C4104z8(A7 a11, C3404ix c3404ix, Kp kp2, G5 g11, X7 x11, DocumentScannerResult documentScannerResult, String str, boolean z11, String str2, Am am2, byte[] bArr, double d11, DocumentType documentType, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(a11, c3404ix, kp2, (i11 & 8) != 0 ? null : g11, (i11 & 16) != 0 ? null : x11, (i11 & 32) != 0 ? null : documentScannerResult, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? null : str2, (i11 & 512) != 0 ? null : am2, (i11 & 1024) != 0 ? null : bArr, (i11 & 2048) != 0 ? 0.8d : d11, (i11 & 4096) != 0 ? null : documentType, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str3);
    }
}
