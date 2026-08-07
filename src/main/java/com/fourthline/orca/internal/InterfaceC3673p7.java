package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3673p7 extends InterfaceC3354ho.a {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.p7$a */
    public static final class a {
        public static Map a(InterfaceC3673p7 interfaceC3673p7) {
            return InterfaceC3354ho.a.C0566a.a(interfaceC3673p7);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.p7$b */
    public static final class b implements InterfaceC3673p7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f34444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f34445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f34446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f34447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f34448e;

        public b(Map extractedData, List validationErrors) {
            p013kotlin.jvm.internal.s.k(extractedData, "extractedData");
            p013kotlin.jvm.internal.s.k(validationErrors, "validationErrors");
            this.f34444a = extractedData;
            this.f34445b = validationErrors;
            this.f34446c = "result_analysis_completed";
            this.f34447d = "iglu:com.fourthline.sdk/result_analysis_completed/jsonschema/1-0-0";
            Pair pairA = jn0.x.a("result", extractedData);
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(validationErrors, 10));
            Iterator it = validationErrors.iterator();
            while (it.hasNext()) {
                arrayList.add(R6.a((AbstractC3641oc) it.next()));
            }
            this.f34448e = p013kotlin.collections.v0.m(pairA, jn0.x.a("validation_errors", arrayList));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f34444a, bVar.f34444a) && p013kotlin.jvm.internal.s.f(this.f34445b, bVar.f34445b);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return this.f34448e;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return this.f34446c;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return this.f34447d;
        }

        public int hashCode() {
            return (this.f34444a.hashCode() * 31) + this.f34445b.hashCode();
        }

        public String toString() {
            return "ResultAnalysisCompleted(extractedData=" + this.f34444a + ", validationErrors=" + this.f34445b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.p7$c */
    public static final class c implements InterfaceC3673p7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f34449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34450b = "result_analysis_failed";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f34451c = "iglu:com.fourthline.sdk/result_analysis_failed/jsonschema/1-0-0";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f34452d;

        public c(Throwable th2) {
            this.f34449a = th2;
            Map mapC = p013kotlin.collections.v0.c();
            if (th2 != null) {
                mapC.putAll(AbstractC3396io.a(th2));
            } else {
                mapC.put(AnalyticsAttribute.Error, AnalyticsAttribute.NotAvailable);
            }
            this.f34452d = p013kotlin.collections.v0.b(mapC);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f34449a, ((c) obj).f34449a);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return this.f34452d;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return this.f34450b;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return this.f34451c;
        }

        public int hashCode() {
            Throwable th2 = this.f34449a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        public String toString() {
            return "ResultAnalysisFailed(error=" + this.f34449a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.p7$d */
    public static final class d implements InterfaceC3673p7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f34453a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f34454b = "result_analysis_started";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f34455c = "iglu:com.fourthline.sdk/result_analysis_started/jsonschema/1-0-0";

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return a.a(this);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return f34454b;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return f34455c;
        }

        public int hashCode() {
            return -1580408072;
        }

        public String toString() {
            return "ResultAnalysisStarted";
        }
    }
}
