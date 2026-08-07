package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface Ds {

    public static final class a implements Ds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25497a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f25498b = AnalyticsAttribute.NotAvailable;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f25499c = "camera_permission";

        private a() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return f25498b;
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f25499c;
        }
    }

    public static final class b implements Ds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25500a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f25501b = AnalyticsAttribute.NotAvailable;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f25502c = "cancel_flow";

        private b() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return f25501b;
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f25502c;
        }
    }

    String a();

    String getName();

    public static final class c implements Ds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bo f25503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f25504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final wn0.a f25505c;

        public c(Bo error, String source, wn0.a onRetry) {
            p013kotlin.jvm.internal.s.k(error, "error");
            p013kotlin.jvm.internal.s.k(source, "source");
            p013kotlin.jvm.internal.s.k(onRetry, "onRetry");
            this.f25503a = error;
            this.f25504b = source;
            this.f25505c = onRetry;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b() {
            return jn0.h0.f84049a;
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return this.f25504b;
        }

        public final Bo c() {
            return this.f25503a;
        }

        public final wn0.a d() {
            return this.f25505c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p013kotlin.jvm.internal.s.f(this.f25503a, cVar.f25503a) && p013kotlin.jvm.internal.s.f(this.f25504b, cVar.f25504b) && p013kotlin.jvm.internal.s.f(this.f25505c, cVar.f25505c);
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return this.f25503a.getAlias();
        }

        public int hashCode() {
            return (((this.f25503a.hashCode() * 31) + this.f25504b.hashCode()) * 31) + this.f25505c.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f25503a + ", source=" + this.f25504b + ", onRetry=" + this.f25505c + ")";
        }

        public /* synthetic */ c(Bo bo2, String str, wn0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(bo2, (i11 & 2) != 0 ? AnalyticsAttribute.NotAvailable : str, (i11 & 4) != 0 ? new wn0.a() { // from class: com.fourthline.orca.internal.y10
                @Override // wn0.a
                public final Object invoke() {
                    return Ds.c.b();
                }
            } : aVar);
        }
    }
}
