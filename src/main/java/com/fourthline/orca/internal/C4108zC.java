package com.fourthline.orca.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.analytics.internal.AppErrorEvent;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4108zC implements InterfaceC3354ho {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zC$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.zC$a$a, reason: collision with other inner class name */
        public static final class C0628a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.zC$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f37239a;

            public b(boolean z11) {
                this.f37239a = z11;
            }

            public final boolean a() {
                return this.f37239a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f37239a == ((b) obj).f37239a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0628a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0628a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0628a.c(this);
            }

            public int hashCode() {
                return Boolean.hashCode(this.f37239a);
            }

            public String toString() {
                return "OnAttachHandler(defaultHandlerPresent=" + this.f37239a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.zC$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f37240a = new c();

            private c() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0628a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0628a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0628a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.zC$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f37241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Thread f37242b;

            public d(Throwable throwable, Thread thread) {
                p013kotlin.jvm.internal.s.k(throwable, "throwable");
                p013kotlin.jvm.internal.s.k(thread, "thread");
                this.f37241a = throwable;
                this.f37242b = thread;
            }

            public final Thread a() {
                return this.f37242b;
            }

            public final Throwable b() {
                return this.f37241a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p013kotlin.jvm.internal.s.f(this.f37241a, dVar.f37241a) && p013kotlin.jvm.internal.s.f(this.f37242b, dVar.f37242b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0628a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0628a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0628a.c(this);
            }

            public int hashCode() {
                return (this.f37241a.hashCode() * 31) + this.f37242b.hashCode();
            }

            public String toString() {
                return "OnUncaughtFourthlineException(throwable=" + this.f37241a + ", thread=" + this.f37242b + ")";
            }
        }
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
            a();
        } else {
            if (!(event instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            a.d dVar = (a.d) event;
            a(dVar.b(), dVar.a());
        }
    }

    private final void a(boolean z11) {
        C3103bt.a(C3103bt.f30707a, "orca_error_handler_add", null, p013kotlin.collections.v0.m(jn0.x.a("has_default_handler", Boolean.valueOf(z11)), jn0.x.a("isPublic", Boolean.FALSE)), 2, null);
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "orca_error_handler_remove", null, p013kotlin.collections.v0.f(jn0.x.a("isPublic", Boolean.FALSE)), 2, null);
    }

    private final void a(Throwable th2, Thread thread) {
        C3103bt.f30707a.a("orca_uncaught_exception", th2, p013kotlin.collections.v0.f(jn0.x.a("isPublic", Boolean.FALSE)));
        AppErrorEvent appErrorEvent = new AppErrorEvent(th2, thread);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(appErrorEvent);
        }
    }
}
