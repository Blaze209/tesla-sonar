package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentType;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3727qc implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f34797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f34798b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qc$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qc$a$a, reason: collision with other inner class name */
        public static final class C0599a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qc$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f34799a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0599a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0599a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0599a.c(this);
            }

            public int hashCode() {
                return -1458962558;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qc$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f34800a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0599a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0599a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0599a.c(this);
            }

            public int hashCode() {
                return -1739345672;
            }

            public String toString() {
                return "OnEnterScreen";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qc$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f34801a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0599a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0599a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0599a.c(this);
            }

            public int hashCode() {
                return 1192471798;
            }

            public String toString() {
                return "OnNextButtonClicked";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qc$a$e */
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Date f34802a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final G5 f34803b;

            public e(Date date, G5 country) {
                p013kotlin.jvm.internal.s.k(country, "country");
                this.f34802a = date;
                this.f34803b = country;
            }

            public final G5 a() {
                return this.f34803b;
            }

            public final Date b() {
                return this.f34802a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return p013kotlin.jvm.internal.s.f(this.f34802a, eVar.f34802a) && p013kotlin.jvm.internal.s.f(this.f34803b, eVar.f34803b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0599a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0599a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0599a.c(this);
            }

            public int hashCode() {
                Date date = this.f34802a;
                return ((date == null ? 0 : date.hashCode()) * 31) + this.f34803b.hashCode();
            }

            public String toString() {
                return "OnVersionSelected(issueDate=" + this.f34802a + ", country=" + this.f34803b + ")";
            }
        }
    }

    public C3727qc(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f34797a = tracker;
        this.f34798b = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.da1
            @Override // wn0.a
            public final Object invoke() {
                return C3727qc.a();
            }
        });
    }

    private final SimpleDateFormat b() {
        return (SimpleDateFormat) this.f34798b.getValue();
    }

    private final void c() {
        C3103bt.a(C3103bt.f30707a, "document_version", null, 2, null);
        this.f34797a.a(new C3294gD(null, 1, null));
    }

    private final void d() {
        C3103bt.c(C3103bt.f30707a, "document_version", null, 2, null);
    }

    private final void e() {
        C3103bt.b(C3103bt.f30707a, "document_version", null, 2, null);
        this.f34797a.a(new C3380iD(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            c();
            return;
        }
        if (event instanceof a.c) {
            d();
            return;
        }
        if (event instanceof a.d) {
            e();
        } else {
            if (!(event instanceof a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            a.e eVar = (a.e) event;
            a(eVar.b(), eVar.a());
        }
    }

    private final void a(Date date, G5 g11) {
        String str;
        if (date == null || (str = b().format(date)) == null) {
            str = AnalyticsAttribute.NotAvailable;
        }
        C3103bt.a(C3103bt.f30707a, "orca_document_version_action_select_version", null, p013kotlin.collections.v0.m(jn0.x.a("issue_date", str), jn0.x.a(AnalyticsAttribute.DocumentType, AbstractC3989wg.a(DocumentType.ID_CARD)), g11.d()), 2, null);
        this.f34797a.a(new C3764rD("issue_date", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }
}
