package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentType;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Y7 implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f29837a;

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Y7$a$a, reason: collision with other inner class name */
        public static final class C0533a {
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
            private final DocumentType f29838a;

            public b(DocumentType documentType) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                this.f29838a = documentType;
            }

            public final DocumentType a() {
                return this.f29838a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f29838a == ((b) obj).f29838a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0533a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0533a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0533a.c(this);
            }

            public int hashCode() {
                return this.f29838a.hashCode();
            }

            public String toString() {
                return "OnBackButtonClicked(documentType=" + this.f29838a + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f29839a;

            public c(DocumentType documentType) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                this.f29839a = documentType;
            }

            public final DocumentType a() {
                return this.f29839a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f29839a == ((c) obj).f29839a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0533a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0533a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0533a.c(this);
            }

            public int hashCode() {
                return this.f29839a.hashCode();
            }

            public String toString() {
                return "OnDateOfBirthClicked(documentType=" + this.f29839a + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f29840a;

            public d(DocumentType documentType) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                this.f29840a = documentType;
            }

            public final DocumentType a() {
                return this.f29840a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f29840a == ((d) obj).f29840a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0533a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0533a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0533a.c(this);
            }

            public int hashCode() {
                return this.f29840a.hashCode();
            }

            public String toString() {
                return "OnDocumentNumberClicked(documentType=" + this.f29840a + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f29841a;

            public e(DocumentType documentType) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                this.f29841a = documentType;
            }

            public final DocumentType a() {
                return this.f29841a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f29841a == ((e) obj).f29841a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0533a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0533a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0533a.c(this);
            }

            public int hashCode() {
                return this.f29841a.hashCode();
            }

            public String toString() {
                return "OnEnterScreen(documentType=" + this.f29841a + ")";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f29842a;

            public f(DocumentType documentType) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                this.f29842a = documentType;
            }

            public final DocumentType a() {
                return this.f29842a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f29842a == ((f) obj).f29842a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0533a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0533a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0533a.c(this);
            }

            public int hashCode() {
                return this.f29842a.hashCode();
            }

            public String toString() {
                return "OnExpirationDateClicked(documentType=" + this.f29842a + ")";
            }
        }

        public static final class g implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f29843a;

            public g(DocumentType documentType) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                this.f29843a = documentType;
            }

            public final DocumentType a() {
                return this.f29843a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f29843a == ((g) obj).f29843a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0533a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0533a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0533a.c(this);
            }

            public int hashCode() {
                return this.f29843a.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(documentType=" + this.f29843a + ")";
            }
        }
    }

    public Y7(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f29837a = tracker;
    }

    private final void b(DocumentType documentType) {
        C3103bt.a(C3103bt.f30707a, "orca_document_details_action_edit_date_of_birth", null, g(documentType), 2, null);
    }

    private final void c(DocumentType documentType) {
        C3103bt.a(C3103bt.f30707a, "orca_document_details_action_edit_document_number", null, g(documentType), 2, null);
    }

    private final void d(DocumentType documentType) {
        C3103bt.f30707a.c("document_details", g(documentType));
    }

    private final void e(DocumentType documentType) {
        C3103bt.a(C3103bt.f30707a, "orca_document_details_action_edit_expiration_date", null, g(documentType), 2, null);
    }

    private final void f(DocumentType documentType) {
        C3103bt.f30707a.b("document_details", g(documentType));
        this.f29837a.a(new C3380iD(null, 1, null));
    }

    private final Map g(DocumentType documentType) {
        return p013kotlin.collections.v0.f(jn0.x.a(AnalyticsAttribute.DocumentType, AbstractC3989wg.a(documentType)));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            a(((a.b) event).a());
            return;
        }
        if (event instanceof a.c) {
            b(((a.c) event).a());
            return;
        }
        if (event instanceof a.d) {
            c(((a.d) event).a());
            return;
        }
        if (event instanceof a.e) {
            d(((a.e) event).a());
        } else if (event instanceof a.f) {
            e(((a.f) event).a());
        } else {
            if (!(event instanceof a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            f(((a.g) event).a());
        }
    }

    private final void a(DocumentType documentType) {
        C3103bt.f30707a.a("document_details", g(documentType));
        this.f29837a.a(new C3294gD(null, 1, null));
    }
}
