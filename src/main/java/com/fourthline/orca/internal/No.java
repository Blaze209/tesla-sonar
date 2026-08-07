package com.fourthline.orca.internal;

import android.os.SystemClock;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.analytics.internal.TimedAnalyticsEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class No implements InterfaceC3350hk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27068c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27069d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f27070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f27071b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b extends InterfaceC3354ho.a {

        public static final class a implements b, TimedAnalyticsEvent {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f27072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f27073b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f27074c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f27075d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Map f27076e;

            public a(String moduleName, long j11) {
                p013kotlin.jvm.internal.s.k(moduleName, "moduleName");
                this.f27072a = moduleName;
                this.f27073b = j11;
                this.f27074c = "iglu:com.fourthline.sdk/flow_completed/jsonschema/1-0-0";
                this.f27075d = "flow_completed";
                this.f27076e = p013kotlin.collections.v0.m(jn0.x.a("name", moduleName), jn0.x.a(AnalyticsAttribute.ElapsedTime, Long.valueOf(getElapsedTime())));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p013kotlin.jvm.internal.s.f(this.f27072a, aVar.f27072a) && this.f27073b == aVar.f27073b;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return this.f27076e;
            }

            @Override // com.fourthline.analytics.internal.TimedAnalyticsEvent
            public long getElapsedTime() {
                return this.f27073b;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return this.f27075d;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return this.f27074c;
            }

            public int hashCode() {
                return (this.f27072a.hashCode() * 31) + Long.hashCode(this.f27073b);
            }

            public String toString() {
                return "ModuleCompleted(moduleName=" + this.f27072a + ", elapsedTime=" + this.f27073b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.No$b$b, reason: collision with other inner class name */
        public static final class C0507b implements b, TimedAnalyticsEvent {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f27077a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f27078b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final long f27079c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f27080d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f27081e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Map f27082f;

            public C0507b(String moduleName, Throwable error, long j11) {
                p013kotlin.jvm.internal.s.k(moduleName, "moduleName");
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f27077a = moduleName;
                this.f27078b = error;
                this.f27079c = j11;
                this.f27080d = "iglu:com.fourthline.sdk/flow_failed/jsonschema/1-0-0";
                this.f27081e = "flow_failed";
                Map mapC = p013kotlin.collections.v0.c();
                mapC.putAll(AbstractC3396io.a(error));
                mapC.put("name", moduleName);
                mapC.put(AnalyticsAttribute.ElapsedTime, Long.valueOf(getElapsedTime()));
                this.f27082f = p013kotlin.collections.v0.b(mapC);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0507b)) {
                    return false;
                }
                C0507b c0507b = (C0507b) obj;
                return p013kotlin.jvm.internal.s.f(this.f27077a, c0507b.f27077a) && p013kotlin.jvm.internal.s.f(this.f27078b, c0507b.f27078b) && this.f27079c == c0507b.f27079c;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return this.f27082f;
            }

            @Override // com.fourthline.analytics.internal.TimedAnalyticsEvent
            public long getElapsedTime() {
                return this.f27079c;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return this.f27081e;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return this.f27080d;
            }

            public int hashCode() {
                return (((this.f27077a.hashCode() * 31) + this.f27078b.hashCode()) * 31) + Long.hashCode(this.f27079c);
            }

            public String toString() {
                return "ModuleFailed(moduleName=" + this.f27077a + ", error=" + this.f27078b + ", elapsedTime=" + this.f27079c + ")";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f27083a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f27084b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f27085c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Map f27086d;

            public c(String moduleName) {
                p013kotlin.jvm.internal.s.k(moduleName, "moduleName");
                this.f27083a = moduleName;
                this.f27084b = "iglu:com.fourthline.sdk/flow_started/jsonschema/1-0-0";
                this.f27085c = "flow_started";
                this.f27086d = p013kotlin.collections.v0.f(jn0.x.a("name", moduleName));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f27083a, ((c) obj).f27083a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return this.f27086d;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return this.f27085c;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return this.f27084b;
            }

            public int hashCode() {
                return this.f27083a.hashCode();
            }

            public String toString() {
                return "ModuleStarted(moduleName=" + this.f27083a + ")";
            }
        }
    }

    public No(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f27070a = tracker;
        this.f27071b = new LinkedHashMap();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3350hk
    public void a(C3392ik analyticsContext, Rf rf2) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        this.f27071b.put(analyticsContext.getName(), Long.valueOf(b()));
        this.f27070a.a(analyticsContext);
        a(this.f27070a, rf2);
        a(new b.c(analyticsContext.getName()));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3350hk
    public void b(C3392ik analyticsContext) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        a(new b.a(analyticsContext.getName(), a(analyticsContext.getName())));
        this.f27070a.a(analyticsContext.getIdentifier());
        a(this.f27070a, analyticsContext.getName());
        this.f27071b.remove(analyticsContext.getName());
    }

    @Override // com.fourthline.orca.internal.InterfaceC3350hk
    public void a(C3392ik analyticsContext, Bo error) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        p013kotlin.jvm.internal.s.k(error, "error");
        a(new b.C0507b(analyticsContext.getName(), error, a(analyticsContext.getName())));
        this.f27070a.a(analyticsContext.getIdentifier());
        this.f27071b.remove(analyticsContext.getName());
    }

    private final long b() {
        return SystemClock.uptimeMillis();
    }

    private final void a(b bVar) {
        this.f27070a.a(bVar);
    }

    private final void a(C3438jo c3438jo, Rf rf2) {
        Q6 q11;
        if (rf2 instanceof DocumentFlowConfig) {
            q11 = new Q6(((DocumentFlowConfig) rf2).getAnalysis().getEnabled());
        } else {
            q11 = rf2 instanceof C3340ha ? new Q6(((C3340ha) rf2).g()) : null;
        }
        if (q11 != null) {
            c3438jo.a(q11);
        }
    }

    private final void a(C3438jo c3438jo, String str) {
        String str2 = p013kotlin.jvm.internal.s.f(str, "document") ? AnalyticsContext.Analysis : null;
        if (str2 != null) {
            c3438jo.a(str2);
        }
    }

    private final long a(String str) {
        Long l11 = (Long) this.f27071b.get(str);
        if (l11 == null) {
            return -1L;
        }
        return b() - l11.longValue();
    }
}
