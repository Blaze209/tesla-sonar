package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3442js extends Of {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.js$a */
    public static final class a implements InterfaceC3442js, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32836a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.js$b */
    public static final class b implements InterfaceC3442js, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f32837a;

        public b(Rf rf2) {
            this.f32837a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f32837a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f32837a, ((b) obj).f32837a);
        }

        public int hashCode() {
            Rf rf2 = this.f32837a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f32837a + ")";
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f32837a = rf2;
        }

        public /* synthetic */ b(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : rf2);
        }
    }
}
