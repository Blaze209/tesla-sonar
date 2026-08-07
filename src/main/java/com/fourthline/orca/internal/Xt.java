package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface Xt extends Of {

    public static final class a implements Xt, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f29767a;

        public a(Rf rf2) {
            this.f29767a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f29767a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f29767a, ((a) obj).f29767a);
        }

        public int hashCode() {
            Rf rf2 = this.f29767a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f29767a + ")";
        }

        public /* synthetic */ a(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : rf2);
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f29767a = rf2;
        }
    }
}
