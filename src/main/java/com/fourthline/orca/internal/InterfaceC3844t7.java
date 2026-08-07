package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3844t7 extends InterfaceC3354ho.a {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t7$a */
    public static final class a {
        public static Map a(InterfaceC3844t7 interfaceC3844t7) {
            return InterfaceC3354ho.a.C0566a.a(interfaceC3844t7);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t7$b */
    public static final class b implements InterfaceC3844t7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3936vD f35557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f35558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f35559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f35560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f35561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f35562f;

        public b(C3936vD expectations, Map extractedData, List validationErrors) {
            p013kotlin.jvm.internal.s.k(expectations, "expectations");
            p013kotlin.jvm.internal.s.k(extractedData, "extractedData");
            p013kotlin.jvm.internal.s.k(validationErrors, "validationErrors");
            this.f35557a = expectations;
            this.f35558b = extractedData;
            this.f35559c = validationErrors;
            this.f35560d = "step_analysis_completed";
            this.f35561e = "iglu:com.fourthline.sdk/step_analysis_completed/jsonschema/1-0-0";
            Pair pairA = jn0.x.a("expectations", AbstractC3887u7.b(expectations));
            Pair pairA2 = jn0.x.a("result", extractedData);
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(validationErrors, 10));
            Iterator it = validationErrors.iterator();
            while (it.hasNext()) {
                arrayList.add(R6.a((AbstractC3641oc) it.next()));
            }
            this.f35562f = p013kotlin.collections.v0.m(pairA, pairA2, jn0.x.a("validation_errors", arrayList));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f35557a, bVar.f35557a) && p013kotlin.jvm.internal.s.f(this.f35558b, bVar.f35558b) && p013kotlin.jvm.internal.s.f(this.f35559c, bVar.f35559c);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return this.f35562f;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return this.f35560d;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return this.f35561e;
        }

        public int hashCode() {
            return (((this.f35557a.hashCode() * 31) + this.f35558b.hashCode()) * 31) + this.f35559c.hashCode();
        }

        public String toString() {
            return "StepAnalysisCompleted(expectations=" + this.f35557a + ", extractedData=" + this.f35558b + ", validationErrors=" + this.f35559c + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t7$c */
    public static final class c implements InterfaceC3844t7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f35563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35564b = "step_analysis_failed";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35565c = "iglu:com.fourthline.sdk/step_analysis_failed/jsonschema/1-0-0";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f35566d;

        public c(Throwable th2) {
            this.f35563a = th2;
            Map mapC = p013kotlin.collections.v0.c();
            if (th2 != null) {
                mapC.putAll(AbstractC3396io.a(th2));
            } else {
                mapC.put(AnalyticsAttribute.Error, AnalyticsAttribute.NotAvailable);
            }
            this.f35566d = p013kotlin.collections.v0.b(mapC);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f35563a, ((c) obj).f35563a);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return this.f35566d;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return this.f35564b;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return this.f35565c;
        }

        public int hashCode() {
            Throwable th2 = this.f35563a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        public String toString() {
            return "StepAnalysisFailed(error=" + this.f35563a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t7$d */
    public static final class d implements InterfaceC3844t7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3936vD f35567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC3641oc f35568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f35570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f35571e;

        public d(C3936vD expectations, AbstractC3641oc validationError) {
            p013kotlin.jvm.internal.s.k(expectations, "expectations");
            p013kotlin.jvm.internal.s.k(validationError, "validationError");
            this.f35567a = expectations;
            this.f35568b = validationError;
            this.f35569c = "step_analysis_repeat_error";
            this.f35570d = "iglu:com.fourthline.sdk/step_analysis_repeat_error/jsonschema/1-0-0";
            this.f35571e = p013kotlin.collections.v0.m(jn0.x.a("expectations", AbstractC3887u7.b(expectations)), jn0.x.a("validation_error", R6.a(validationError)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p013kotlin.jvm.internal.s.f(this.f35567a, dVar.f35567a) && p013kotlin.jvm.internal.s.f(this.f35568b, dVar.f35568b);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return this.f35571e;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return this.f35569c;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return this.f35570d;
        }

        public int hashCode() {
            return (this.f35567a.hashCode() * 31) + this.f35568b.hashCode();
        }

        public String toString() {
            return "StepAnalysisRepeatError(expectations=" + this.f35567a + ", validationError=" + this.f35568b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t7$e */
    public static final class e implements InterfaceC3844t7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3936vD f35572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f35575d;

        public e(C3936vD expectations) {
            p013kotlin.jvm.internal.s.k(expectations, "expectations");
            this.f35572a = expectations;
            this.f35573b = "step_analysis_started";
            this.f35574c = "iglu:com.fourthline.sdk/step_analysis_started/jsonschema/1-0-0";
            this.f35575d = p013kotlin.collections.v0.f(jn0.x.a("expectations", AbstractC3887u7.b(expectations)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f35572a, ((e) obj).f35572a);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return this.f35575d;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return this.f35573b;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return this.f35574c;
        }

        public int hashCode() {
            return this.f35572a.hashCode();
        }

        public String toString() {
            return "StepAnalysisStarted(expectations=" + this.f35572a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t7$f */
    public static final class f implements InterfaceC3844t7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f35576a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f35577b = "step_analysis_timeout";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f35578c = "iglu:com.fourthline.sdk/step_analysis_timeout/jsonschema/1-0-0";

        private f() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return a.a(this);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return f35577b;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return f35578c;
        }

        public int hashCode() {
            return 507710328;
        }

        public String toString() {
            return "StepAnalysisTimeout";
        }
    }
}
