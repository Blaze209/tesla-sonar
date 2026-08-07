package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Ur implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f28833a;

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Ur$a$a, reason: collision with other inner class name */
        public static final class C0524a {
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
            public static final b f28834a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f28835a = new c();

            private c() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Tr f28836a;

            public d(Tr documentType) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                this.f28836a = documentType;
            }

            public final Tr a() {
                return this.f28836a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f28836a == ((d) obj).f28836a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }

            public int hashCode() {
                return this.f28836a.hashCode();
            }

            public String toString() {
                return "OnDocumentOptionClicked(documentType=" + this.f28836a + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f28837a = new e();

            private e() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f28838a = new f();

            private f() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }
        }

        public static final class g implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f28839a = new g();

            private g() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }
        }

        public static final class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Tr f28840a;

            public h(Tr documentType) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                this.f28840a = documentType;
            }

            public final Tr a() {
                return this.f28840a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f28840a == ((h) obj).f28840a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }

            public int hashCode() {
                return this.f28840a.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(documentType=" + this.f28840a + ")";
            }
        }

        public static final class i implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f28841a = new i();

            private i() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }
        }

        public static final class j implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final j f28842a = new j();

            private j() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }
        }

        public static final class k implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k f28843a = new k();

            private k() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }
        }

        public static final class l implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final l f28844a = new l();

            private l() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0524a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0524a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0524a.c(this);
            }
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Tr.values().length];
            try {
                iArr[Tr.UtilityBill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tr.TaxInvoice.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Tr.Insurance.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Tr.ProofOfHousing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Tr.BankStatement.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Tr.Other.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Ur(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f28833a = tracker;
    }

    private final void b(Tr tr2) {
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a("poa_document_type", AbstractC3989wg.a(tr2)));
        C3103bt.f30707a.b("poa_document_type", mapF);
        this.f28833a.a(new C3380iD(mapF));
    }

    private final void c() {
        C3103bt.a(C3103bt.f30707a, "orca_poa_document_type_did_select_document", null, null, 6, null);
    }

    private final void d() {
        C3103bt.f30707a.c("poa_document_type", p013kotlin.collections.v0.i());
    }

    private final void e() {
        C3103bt.a(C3103bt.f30707a, "orca_leave_identity_check", null, p013kotlin.collections.v0.f(EnumC3176dh.DOCUMENT_TYPE.b()), 2, null);
    }

    private final void f() {
        C3103bt.a(C3103bt.f30707a, "orca_poa_document_type_did_select_image", null, null, 6, null);
        this.f28833a.a(new J6("action_sheet", new InterfaceC3807sD.r(null, 1, null)));
    }

    private final void g() {
        C3103bt.a(C3103bt.f30707a, "orca_poa_document_type_action_take_photo", null, null, 6, null);
        this.f28833a.a(new J6("action_sheet", new InterfaceC3807sD.p(null, 1, null)));
    }

    private final void h() {
        C3103bt.a(C3103bt.f30707a, "orca_poa_document_type_action_select_image", null, null, 6, null);
        this.f28833a.a(new C3380iD(null, 1, null));
        this.f28833a.a(new K6("action_sheet"));
    }

    private final void i() {
        C3103bt.a(C3103bt.f30707a, "orca_poa_document_type_action_upload_document", null, null, 6, null);
        this.f28833a.a(new J6("action_sheet", new InterfaceC3807sD.r(null, 1, null)));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            a();
            return;
        }
        if (event instanceof a.f) {
            d();
            return;
        }
        if (event instanceof a.h) {
            b(((a.h) event).a());
            return;
        }
        if (event instanceof a.d) {
            a(((a.d) event).a());
            return;
        }
        if (event instanceof a.c) {
            b();
            return;
        }
        if (event instanceof a.g) {
            e();
            return;
        }
        if (event instanceof a.j) {
            g();
            return;
        }
        if (event instanceof a.l) {
            i();
            return;
        }
        if (event instanceof a.e) {
            c();
        } else if (event instanceof a.k) {
            h();
        } else {
            if (!(event instanceof a.i)) {
                throw new NoWhenBranchMatchedException();
            }
            f();
        }
    }

    private final void b() {
        C3103bt.a(C3103bt.f30707a, "orca_poa_document_type_action_link_button", null, null, 6, null);
        this.f28833a.a(new C3464kD(null, 1, null));
    }

    private final void a(Tr tr2) {
        String str;
        C3103bt.a(C3103bt.f30707a, "orca_poa_document_type_action_select_type", null, p013kotlin.collections.v0.f(jn0.x.a("poa_document_type", AbstractC3989wg.a(tr2))), 2, null);
        C3438jo c3438jo = this.f28833a;
        switch (b.$EnumSwitchMapping$0[tr2.ordinal()]) {
            case 1:
                str = "utility_bill";
                break;
            case 2:
                str = "tax_invoice";
                break;
            case 3:
                str = "insurance";
                break;
            case 4:
                str = "proof_of_housing";
                break;
            case 5:
                str = "bank_statement";
                break;
            case 6:
                str = "other";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        c3438jo.a(new C3764rD(AnalyticsAttribute.DocumentType, str));
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "poa_document_type", null, 2, null);
        this.f28833a.a(new C3294gD(null, 1, null));
    }
}
