package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface Im extends Of {

    public static final class a implements Im, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26325a = new a();

        private a() {
        }
    }

    public static final class b implements Im, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f26326a;

        public b(Rf rf2) {
            this.f26326a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f26326a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f26326a, ((b) obj).f26326a);
        }

        public int hashCode() {
            Rf rf2 = this.f26326a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f26326a + ")";
        }

        public /* synthetic */ b(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : rf2);
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f26326a = rf2;
        }
    }
}
