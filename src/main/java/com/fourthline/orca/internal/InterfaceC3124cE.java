package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.NewAnalyticsEvent;
import com.fourthline.analytics.internal.TimedAnalyticsEvent;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3124cE extends NewAnalyticsEvent {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cE$a */
    public static final class a {
        public static Map a(InterfaceC3124cE interfaceC3124cE) {
            return NewAnalyticsEvent.DefaultImpls.getAttributes(interfaceC3124cE);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cE$b */
    public static final class b implements TimedAnalyticsEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f30829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30830b = "iglu:com.fourthline.sdk/workflow_completed/jsonschema/1-0-0";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30831c = "workflow_completed";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f30832d = p013kotlin.collections.v0.f(jn0.x.a(AnalyticsAttribute.ElapsedTime, Long.valueOf(getElapsedTime())));

        public b(long j11) {
            this.f30829a = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f30829a == ((b) obj).f30829a;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return this.f30832d;
        }

        @Override // com.fourthline.analytics.internal.TimedAnalyticsEvent
        public long getElapsedTime() {
            return this.f30829a;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return this.f30831c;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return this.f30830b;
        }

        public int hashCode() {
            return Long.hashCode(this.f30829a);
        }

        public String toString() {
            return "WorkflowCompleted(elapsedTime=" + this.f30829a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cE$c */
    public static final class c implements InterfaceC3124cE {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f30833a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f30834b = "iglu:com.fourthline.sdk/workflow_configured/jsonschema/1-0-0";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f30835c = "workflow_configured";

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return a.a(this);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return f30835c;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return f30834b;
        }

        public int hashCode() {
            return 1852223898;
        }

        public String toString() {
            return "WorkflowConfigured";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cE$d */
    public static final class d implements TimedAnalyticsEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f30836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f30837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f30839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f30840e;

        public d(Throwable error, long j11) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f30836a = error;
            this.f30837b = j11;
            this.f30838c = "iglu:com.fourthline.sdk/workflow_failed/jsonschema/1-0-0";
            this.f30839d = "workflow_failed";
            Map mapC = p013kotlin.collections.v0.c();
            mapC.putAll(AbstractC3396io.a(error));
            mapC.put(AnalyticsAttribute.ElapsedTime, Long.valueOf(getElapsedTime()));
            this.f30840e = p013kotlin.collections.v0.b(mapC);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p013kotlin.jvm.internal.s.f(this.f30836a, dVar.f30836a) && this.f30837b == dVar.f30837b;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return this.f30840e;
        }

        @Override // com.fourthline.analytics.internal.TimedAnalyticsEvent
        public long getElapsedTime() {
            return this.f30837b;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return this.f30839d;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return this.f30838c;
        }

        public int hashCode() {
            return (this.f30836a.hashCode() * 31) + Long.hashCode(this.f30837b);
        }

        public String toString() {
            return "WorkflowFailed(error=" + this.f30836a + ", elapsedTime=" + this.f30837b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cE$e */
    public static final class e implements InterfaceC3124cE {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f30841a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f30842b = "iglu:com.fourthline.sdk/workflow_started/jsonschema/1-0-0";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f30843c = "workflow_started";

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public Map getAttributes() {
            return a.a(this);
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getEventName() {
            return f30843c;
        }

        @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
        public String getSchema() {
            return f30842b;
        }

        public int hashCode() {
            return 989996709;
        }

        public String toString() {
            return "WorkflowStarted";
        }
    }
}
