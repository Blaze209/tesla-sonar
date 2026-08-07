package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class L7 implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3392ik f26735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3438jo f26736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private G5 f26737c;

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.L7$a$a, reason: collision with other inner class name */
        public static final class C0500a {
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
            public static final b f26738a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0500a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0500a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0500a.c(this);
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final G5 f26739a;

            public c(G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f26739a = selectedCountry;
            }

            public final G5 a() {
                return this.f26739a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f26739a, ((c) obj).f26739a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0500a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0500a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0500a.c(this);
            }

            public int hashCode() {
                return this.f26739a.hashCode();
            }

            public String toString() {
                return "OnCountrySelected(selectedCountry=" + this.f26739a + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f26740a = new d();

            private d() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0500a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0500a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0500a.c(this);
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final G5 f26741a;

            public e(G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f26741a = selectedCountry;
            }

            public final G5 a() {
                return this.f26741a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f26741a, ((e) obj).f26741a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0500a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0500a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0500a.c(this);
            }

            public int hashCode() {
                return this.f26741a.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(selectedCountry=" + this.f26741a + ")";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final G5 f26742a;

            public f(G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f26742a = selectedCountry;
            }

            public final G5 a() {
                return this.f26742a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f26742a, ((f) obj).f26742a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0500a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0500a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0500a.c(this);
            }

            public int hashCode() {
                return this.f26742a.hashCode();
            }

            public String toString() {
                return "OnUnsupportedCountrySelected(selectedCountry=" + this.f26742a + ")";
            }
        }
    }

    public L7(C3392ik analyticsContext, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f26735a = analyticsContext;
        this.f26736b = tracker;
    }

    private final void b() {
        C3103bt.c(C3103bt.f30707a, AnalyticsAttribute.DocumentCountry, null, 2, null);
    }

    private final void c(G5 g11) {
        C3103bt.a(C3103bt.f30707a, "orca_document_country_error_popup_unsupported_country", null, p013kotlin.collections.v0.f(g11.d()), 2, null);
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.f26737c = g11;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            a();
            return;
        }
        if (event instanceof a.d) {
            b();
            return;
        }
        if (event instanceof a.e) {
            b(((a.e) event).a());
        } else if (event instanceof a.c) {
            a(((a.c) event).a());
        } else {
            if (!(event instanceof a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            c(((a.f) event).a());
        }
    }

    private final void b(G5 g11) {
        Map mapF = p013kotlin.collections.v0.f(g11.d());
        C3103bt.f30707a.b(AnalyticsAttribute.DocumentCountry, mapF);
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.f26735a.set(AnalyticsAttribute.DocumentCountry, g11.c());
        this.f26736b.a(new C3380iD(mapF));
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, AnalyticsAttribute.DocumentCountry, null, 2, null);
        this.f26736b.a(new C3294gD(null, 1, null));
    }

    private final void a(G5 g11) {
        C3103bt.a(C3103bt.f30707a, "orca_document_country_action_select_country", null, p013kotlin.collections.v0.f(g11.d()), 2, null);
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.f26737c = g11;
        this.f26736b.a(new C3764rD(AnalyticsAttribute.DocumentCountry, g11.c()));
    }
}
