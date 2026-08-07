package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.LivenessCheckType;

/* JADX INFO: loaded from: classes4.dex */
public interface UE {

    public static final class a implements UE {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28746a;

        public a(String redirectUrl) {
            p013kotlin.jvm.internal.s.k(redirectUrl, "redirectUrl");
            this.f28746a = redirectUrl;
        }

        public final String a() {
            return this.f28746a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f28746a, ((a) obj).f28746a);
        }

        public int hashCode() {
            return this.f28746a.hashCode();
        }

        public String toString() {
            return "BankAccountVerification(redirectUrl=" + this.f28746a + ")";
        }
    }

    public static final class b implements UE {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28747a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1996743072;
        }

        public String toString() {
            return "IdentityVerification";
        }
    }

    public static final class c implements UE {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f28748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f28749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LivenessCheckType f28750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final RandomnessSettings f28751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final EnumC3319gw f28752e;

        public c(boolean z11, boolean z12, LivenessCheckType livenessCheckType, RandomnessSettings randomnessSettings, EnumC3319gw initialStatus) {
            p013kotlin.jvm.internal.s.k(livenessCheckType, "livenessCheckType");
            p013kotlin.jvm.internal.s.k(initialStatus, "initialStatus");
            this.f28748a = z11;
            this.f28749b = z12;
            this.f28750c = livenessCheckType;
            this.f28751d = randomnessSettings;
            this.f28752e = initialStatus;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f28748a == cVar.f28748a && this.f28749b == cVar.f28749b && this.f28750c == cVar.f28750c && p013kotlin.jvm.internal.s.f(this.f28751d, cVar.f28751d) && this.f28752e == cVar.f28752e;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.f28748a) * 31) + Boolean.hashCode(this.f28749b)) * 31) + this.f28750c.hashCode()) * 31;
            RandomnessSettings randomnessSettings = this.f28751d;
            return ((iHashCode + (randomnessSettings == null ? 0 : randomnessSettings.hashCode())) * 31) + this.f28752e.hashCode();
        }

        public String toString() {
            return "QualifiedElectronicSignature(skipGeolocation=" + this.f28748a + ", selfieVideoEnabled=" + this.f28749b + ", livenessCheckType=" + this.f28750c + ", randomnessSettings=" + this.f28751d + ", initialStatus=" + this.f28752e + ")";
        }
    }
}
