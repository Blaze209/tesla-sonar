package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentType;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3523ln implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f33357a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ln$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ln$a$a, reason: collision with other inner class name */
        public static final class C0578a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ln$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f33358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final G5 f33359b;

            public b(DocumentType documentType, G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f33358a = documentType;
                this.f33359b = selectedCountry;
            }

            public final DocumentType a() {
                return this.f33358a;
            }

            public final G5 b() {
                return this.f33359b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f33358a == bVar.f33358a && p013kotlin.jvm.internal.s.f(this.f33359b, bVar.f33359b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0578a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0578a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0578a.c(this);
            }

            public int hashCode() {
                return (this.f33358a.hashCode() * 31) + this.f33359b.hashCode();
            }

            public String toString() {
                return "OnBackButtonClicked(documentType=" + this.f33358a + ", selectedCountry=" + this.f33359b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ln$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f33360a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final G5 f33361b;

            public c(DocumentType documentType, G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f33360a = documentType;
                this.f33361b = selectedCountry;
            }

            public final DocumentType a() {
                return this.f33360a;
            }

            public final G5 b() {
                return this.f33361b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f33360a == cVar.f33360a && p013kotlin.jvm.internal.s.f(this.f33361b, cVar.f33361b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0578a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0578a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0578a.c(this);
            }

            public int hashCode() {
                return (this.f33360a.hashCode() * 31) + this.f33361b.hashCode();
            }

            public String toString() {
                return "OnEnterScreen(documentType=" + this.f33360a + ", selectedCountry=" + this.f33361b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ln$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f33362a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f33363b;

            public d(int i11, int i12) {
                this.f33362a = i11;
                this.f33363b = i12;
            }

            public final int a() {
                return this.f33362a;
            }

            public final int b() {
                return this.f33363b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f33362a == dVar.f33362a && this.f33363b == dVar.f33363b;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0578a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0578a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0578a.c(this);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f33362a) * 31) + Integer.hashCode(this.f33363b);
            }

            public String toString() {
                return "OnInstructionViewed(currentIndex=" + this.f33362a + ", totalNumberOfInstructions=" + this.f33363b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ln$a$e */
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f33364a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final G5 f33365b;

            public e(DocumentType documentType, G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f33364a = documentType;
                this.f33365b = selectedCountry;
            }

            public final DocumentType a() {
                return this.f33364a;
            }

            public final G5 b() {
                return this.f33365b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f33364a == eVar.f33364a && p013kotlin.jvm.internal.s.f(this.f33365b, eVar.f33365b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0578a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0578a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0578a.c(this);
            }

            public int hashCode() {
                return (this.f33364a.hashCode() * 31) + this.f33365b.hashCode();
            }

            public String toString() {
                return "OnInstructionsButtonClicked(documentType=" + this.f33364a + ", selectedCountry=" + this.f33365b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ln$a$f */
        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f33366a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final G5 f33367b;

            public f(DocumentType documentType, G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f33366a = documentType;
                this.f33367b = selectedCountry;
            }

            public final DocumentType a() {
                return this.f33366a;
            }

            public final G5 b() {
                return this.f33367b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f33366a == fVar.f33366a && p013kotlin.jvm.internal.s.f(this.f33367b, fVar.f33367b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0578a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0578a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0578a.c(this);
            }

            public int hashCode() {
                return (this.f33366a.hashCode() * 31) + this.f33367b.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(documentType=" + this.f33366a + ", selectedCountry=" + this.f33367b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ln$a$g */
        public static final class g implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f33368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final G5 f33369b;

            public g(DocumentType documentType, G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f33368a = documentType;
                this.f33369b = selectedCountry;
            }

            public final DocumentType a() {
                return this.f33368a;
            }

            public final G5 b() {
                return this.f33369b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.f33368a == gVar.f33368a && p013kotlin.jvm.internal.s.f(this.f33369b, gVar.f33369b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0578a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0578a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0578a.c(this);
            }

            public int hashCode() {
                return (this.f33368a.hashCode() * 31) + this.f33369b.hashCode();
            }

            public String toString() {
                return "OnSkipButtonClicked(documentType=" + this.f33368a + ", selectedCountry=" + this.f33369b + ")";
            }
        }
    }

    public C3523ln(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f33357a = tracker;
    }

    private final void b(DocumentType documentType, G5 g11) {
        C3103bt.f30707a.c("nfc_intro", p013kotlin.collections.v0.m(a(documentType), g11.d()));
    }

    private final void c(DocumentType documentType, G5 g11) {
        C3103bt.a(C3103bt.f30707a, "orca_nfc_intro_action_learn_more", null, p013kotlin.collections.v0.m(a(documentType), g11.d()), 2, null);
        this.f33357a.a(new C3593nD(null, 1, null));
        this.f33357a.a(new K6("nfc_instructions"));
    }

    private final void d(DocumentType documentType, G5 g11) {
        Map mapM = p013kotlin.collections.v0.m(a(documentType), g11.d());
        C3103bt.f30707a.b("nfc_intro", mapM);
        this.f33357a.a(new C3380iD(mapM));
    }

    private final void e(DocumentType documentType, G5 g11) {
        Map mapM = p013kotlin.collections.v0.m(a(documentType), g11.d());
        C3103bt.a(C3103bt.f30707a, "orca_nfc_intro_action_skip", null, mapM, 2, null);
        this.f33357a.a(new C3722qD(mapM));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            a.b bVar = (a.b) event;
            a(bVar.a(), bVar.b());
            return;
        }
        if (event instanceof a.c) {
            a.c cVar = (a.c) event;
            b(cVar.a(), cVar.b());
            return;
        }
        if (event instanceof a.f) {
            a.f fVar = (a.f) event;
            d(fVar.a(), fVar.b());
            return;
        }
        if (event instanceof a.g) {
            a.g gVar = (a.g) event;
            e(gVar.a(), gVar.b());
        } else if (event instanceof a.e) {
            a.e eVar = (a.e) event;
            c(eVar.a(), eVar.b());
        } else {
            if (!(event instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            a.d dVar = (a.d) event;
            a(dVar.a(), dVar.b());
        }
    }

    private final void a(int i11, int i12) {
        C3103bt.a(C3103bt.f30707a, "orca_did_view_instruction", null, p013kotlin.collections.v0.m(jn0.x.a("source", "nfc_intro"), jn0.x.a("index", Integer.valueOf(i11)), jn0.x.a("total", Integer.valueOf(i12))), 2, null);
    }

    private final void a(DocumentType documentType, G5 g11) {
        Map mapM = p013kotlin.collections.v0.m(a(documentType), g11.d());
        C3103bt.f30707a.a("nfc_intro", mapM);
        this.f33357a.a(new C3294gD(mapM));
    }

    private final Pair a(DocumentType documentType) {
        return jn0.x.a(AnalyticsAttribute.DocumentType, AbstractC3989wg.a(documentType));
    }
}
