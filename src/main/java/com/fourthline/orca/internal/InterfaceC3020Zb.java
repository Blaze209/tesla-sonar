package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3020Zb extends PD, InterfaceC2923Qb {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Zb$a */
    public static final class a implements InterfaceC3020Zb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30012a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Zb$b */
    public static final class b implements InterfaceC3020Zb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KycError f30013a;

        public b(KycError error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f30013a = error;
        }

        public final KycError c() {
            return this.f30013a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f30013a, ((b) obj).f30013a);
        }

        public int hashCode() {
            return this.f30013a.hashCode();
        }

        public String toString() {
            return "FinishWithError(error=" + this.f30013a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Zb$c */
    public static final class c implements InterfaceC3020Zb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3726qb f30014a;

        public c(InterfaceC3726qb flowAction) {
            p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
            this.f30014a = flowAction;
        }

        public final InterfaceC3726qb c() {
            return this.f30014a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f30014a, ((c) obj).f30014a);
        }

        public int hashCode() {
            return this.f30014a.hashCode();
        }

        public String toString() {
            return "Forward(flowAction=" + this.f30014a + ")";
        }
    }
}
