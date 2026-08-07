package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface Sl extends Of {

    public static final class a implements Sl, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f27788a;

        public a(Rf rf2) {
            this.f27788a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f27788a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f27788a, ((a) obj).f27788a);
        }

        public int hashCode() {
            Rf rf2 = this.f27788a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f27788a + ")";
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f27788a = rf2;
        }
    }
}
