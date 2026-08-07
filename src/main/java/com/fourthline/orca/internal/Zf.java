package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: loaded from: classes4.dex */
public interface Zf extends PD, InterfaceC3556md {

    public static final class a implements Zf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30023a = new a();

        private a() {
        }
    }

    public static final class b implements Zf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KycError f30024a;

        public b(KycError error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f30024a = error;
        }

        public final KycError c() {
            return this.f30024a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f30024a, ((b) obj).f30024a);
        }

        public int hashCode() {
            return this.f30024a.hashCode();
        }

        public String toString() {
            return "FinishWithError(error=" + this.f30024a + ")";
        }
    }

    public static final class c implements Zf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3172dd f30025a;

        public c(InterfaceC3172dd flowAction) {
            p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
            this.f30025a = flowAction;
        }

        public final InterfaceC3172dd c() {
            return this.f30025a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f30025a, ((c) obj).f30025a);
        }

        public int hashCode() {
            return this.f30025a.hashCode();
        }

        public String toString() {
            return "Forward(flowAction=" + this.f30025a + ")";
        }
    }
}
