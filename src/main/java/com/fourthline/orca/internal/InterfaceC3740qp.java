package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerResult;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3740qp {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qp$a */
    public static final class a implements InterfaceC3740qp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3467ka f34876a;

        public a(C3467ka result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f34876a = result;
        }

        public final C3467ka a() {
            return this.f34876a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f34876a, ((a) obj).f34876a);
        }

        public int hashCode() {
            return this.f34876a.hashCode();
        }

        public String toString() {
            return "Document(result=" + this.f34876a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qp$b */
    public static final class b implements InterfaceC3740qp {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34877b = SelfieScannerResult.$stable;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SelfieScannerResult f34878a;

        public b(SelfieScannerResult result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f34878a = result;
        }

        public final SelfieScannerResult a() {
            return this.f34878a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f34878a, ((b) obj).f34878a);
        }

        public int hashCode() {
            return this.f34878a.hashCode();
        }

        public String toString() {
            return "Selfie(result=" + this.f34878a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qp$c */
    public static final class c implements InterfaceC3740qp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f34879a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1912372768;
        }

        public String toString() {
            return "Workflow";
        }
    }
}
