package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class Fs implements InterfaceC3354ho {

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Fs$a$a, reason: collision with other inner class name */
        public static final class C0489a {
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
            private final AbstractC3641oc f25869a;

            public b(AbstractC3641oc error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f25869a = error;
            }

            public final AbstractC3641oc a() {
                return this.f25869a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25869a, ((b) obj).f25869a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0489a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0489a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0489a.c(this);
            }

            public int hashCode() {
                return this.f25869a.hashCode();
            }

            public String toString() {
                return "OnPrimaryButtonClicked(error=" + this.f25869a + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AbstractC3641oc f25870a;

            public c(AbstractC3641oc error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f25870a = error;
            }

            public final AbstractC3641oc a() {
                return this.f25870a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f25870a, ((c) obj).f25870a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0489a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0489a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0489a.c(this);
            }

            public int hashCode() {
                return this.f25870a.hashCode();
            }

            public String toString() {
                return "OnSecondaryButtonClicked(error=" + this.f25870a + ")";
            }
        }
    }

    private final void b(AbstractC3641oc abstractC3641oc) {
        C3103bt.a(C3103bt.f30707a, "orca_leave_identity_check", null, p013kotlin.collections.v0.m(c(abstractC3641oc), EnumC3176dh.DOCUMENT_VALIDATION.b()), 2, null);
    }

    private final Pair c(AbstractC3641oc abstractC3641oc) {
        return jn0.x.a("orca_error", R6.a(abstractC3641oc));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            a(((a.b) event).a());
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            b(((a.c) event).a());
        }
    }

    private final void a(AbstractC3641oc abstractC3641oc) {
        String str;
        if (!p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.g.f34200a) && !p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.f.f34199a) && !p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.i.f34202a)) {
            if (!p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.a.f34194a) && !p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.e.f34198a) && !p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.d.f34197a)) {
                str = "N/A";
            } else {
                str = "open_document_type";
            }
        } else {
            str = "open_issuing_country";
        }
        C3103bt.a(C3103bt.f30707a, p013kotlin.jvm.internal.s.f(abstractC3641oc, AbstractC3641oc.j.f34203a) ? "orca_leave_identity_check" : "orca_ocr_validation_error_popup_action", null, p013kotlin.collections.v0.m(c(abstractC3641oc), jn0.x.a("action", str)), 2, null);
    }
}
