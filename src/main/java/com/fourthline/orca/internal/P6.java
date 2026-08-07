package com.fourthline.orca.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import java.util.List;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class P6 implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f27277a;

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.P6$a$a, reason: collision with other inner class name */
        public static final class C0512a {
            public static Map a(a aVar) {
                return InterfaceC3354ho.a.C0566a.a(aVar);
            }

            public static String b(a aVar) {
                return InterfaceC3354ho.a.C0566a.b(aVar);
            }

            public static String c(a aVar) {
                return InterfaceC3354ho.a.C0566a.c(aVar);
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f27278a;

            public b(boolean z11) {
                this.f27278a = z11;
            }

            public final boolean a() {
                return this.f27278a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f27278a == ((b) obj).f27278a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0512a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0512a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0512a.c(this);
            }

            public int hashCode() {
                return Boolean.hashCode(this.f27278a);
            }

            public String toString() {
                return "OnEnterScreen(isAutoDetectResultAvailable=" + this.f27278a + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f27279a;

            public c(Throwable error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f27279a = error;
            }

            public final Throwable a() {
                return this.f27279a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f27279a, ((c) obj).f27279a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0512a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0512a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0512a.c(this);
            }

            public int hashCode() {
                return this.f27279a.hashCode();
            }

            public String toString() {
                return "OnError(error=" + this.f27279a + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f27280a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0512a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0512a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0512a.c(this);
            }

            public int hashCode() {
                return -1356848229;
            }

            public String toString() {
                return "OnSuccess";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f27281a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0512a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0512a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0512a.c(this);
            }

            public int hashCode() {
                return -803589895;
            }

            public String toString() {
                return "OnTimeout";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentRecognitionData f27282a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final OcrData f27283b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f27284c;

            public f(DocumentRecognitionData documentRecognitionData, OcrData ocrData, List validationErrors) {
                p013kotlin.jvm.internal.s.k(validationErrors, "validationErrors");
                this.f27282a = documentRecognitionData;
                this.f27283b = ocrData;
                this.f27284c = validationErrors;
            }

            public final DocumentRecognitionData a() {
                return this.f27282a;
            }

            public final OcrData b() {
                return this.f27283b;
            }

            public final List c() {
                return this.f27284c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return p013kotlin.jvm.internal.s.f(this.f27282a, fVar.f27282a) && p013kotlin.jvm.internal.s.f(this.f27283b, fVar.f27283b) && p013kotlin.jvm.internal.s.f(this.f27284c, fVar.f27284c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0512a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0512a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0512a.c(this);
            }

            public int hashCode() {
                DocumentRecognitionData documentRecognitionData = this.f27282a;
                int iHashCode = (documentRecognitionData == null ? 0 : documentRecognitionData.hashCode()) * 31;
                OcrData ocrData = this.f27283b;
                return ((iHashCode + (ocrData != null ? ocrData.hashCode() : 0)) * 31) + this.f27284c.hashCode();
            }

            public String toString() {
                return "OnValidResultReceived(documentRecognitionData=" + this.f27282a + ", ocrData=" + this.f27283b + ", validationErrors=" + this.f27284c + ")";
            }
        }
    }

    public P6(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f27277a = tracker;
    }

    private final boolean a(String str) {
        return str != null;
    }

    private final void b() {
        C3103bt.a(C3103bt.f30707a, "orca_document_analysis_timeout", null, null, 6, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            a(((a.b) event).a());
            return;
        }
        if (event instanceof a.f) {
            a.f fVar = (a.f) event;
            a(fVar.a(), fVar.b(), fVar.c());
        } else if (event instanceof a.e) {
            b();
        } else if (event instanceof a.c) {
            a(((a.c) event).a());
        } else {
            if (!(event instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            a();
        }
    }

    private final void a(Throwable th2) {
        FourthlineAnalytics.e$default(FourthlineAnalytics.INSTANCE, "orca_document_analysis_error", th2, null, 4, null);
        this.f27277a.a(new InterfaceC3673p7.c(th2));
    }

    private final void a() {
        C3103bt.b(C3103bt.f30707a, "document_analysis", null, 2, null);
    }

    private final void a(boolean z11) {
        C3103bt.f30707a.c("document_analysis", p013kotlin.collections.v0.f(jn0.x.a("auto_detect_result_available", Boolean.valueOf(z11))));
        this.f27277a.a(InterfaceC3673p7.d.f34453a);
    }

    private final void a(DocumentRecognitionData documentRecognitionData, OcrData ocrData, List list) {
        Pair[] pairArr = {jn0.x.a("first_name", Boolean.valueOf(a(ocrData != null ? ocrData.getFirstName() : null))), jn0.x.a("last_name", Boolean.valueOf(a(ocrData != null ? ocrData.getLastName() : null))), jn0.x.a("initials", Boolean.valueOf(a(ocrData != null ? ocrData.getInitials() : null))), jn0.x.a("gender", Boolean.valueOf(a(ocrData != null ? ocrData.getGender() : null))), jn0.x.a("nationality", Boolean.valueOf(a(ocrData != null ? ocrData.getNationality() : null))), jn0.x.a("issuing_country", Boolean.valueOf(a(ocrData != null ? ocrData.getIssuingCountry() : null))), jn0.x.a("issue_date", Boolean.valueOf(a(ocrData != null ? ocrData.getIssueDate() : null))), jn0.x.a(GovernmentIdNfcScan.expirationDateName, Boolean.valueOf(a(ocrData != null ? ocrData.getExpirationDate() : null))), jn0.x.a("birth_date", Boolean.valueOf(a(ocrData != null ? ocrData.getDateOfBirth() : null))), jn0.x.a("birth_place", Boolean.valueOf(a(ocrData != null ? ocrData.getBirthPlace() : null))), jn0.x.a(GovernmentIdNfcScan.documentNumberName, Boolean.valueOf(a(ocrData != null ? ocrData.getDocumentNumber() : null))), jn0.x.a(AnalyticsAttribute.DocumentType, Boolean.valueOf(a(ocrData != null ? ocrData.getDocumentType() : null))), jn0.x.a("document_model", Boolean.valueOf(a(documentRecognitionData != null ? documentRecognitionData.getDocumentModel() : null))), jn0.x.a("tax_identification_number", Boolean.valueOf(a(ocrData != null ? ocrData.getTaxIdentificationNumber() : null)))};
        C3103bt c3103bt = C3103bt.f30707a;
        p013kotlin.jvm.internal.s0 s0Var = new p013kotlin.jvm.internal.s0(2);
        s0Var.b(pairArr);
        s0Var.a(jn0.x.a("isPublic", Boolean.FALSE));
        C3103bt.a(c3103bt, "orca_document_analysis_result_received", null, p013kotlin.collections.v0.m((Pair[]) s0Var.d(new Pair[s0Var.c()])), 2, null);
        this.f27277a.a(new InterfaceC3673p7.b(p013kotlin.collections.v0.B(pairArr), list));
    }
}
