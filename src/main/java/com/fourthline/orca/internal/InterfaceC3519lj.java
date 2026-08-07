package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3519lj extends Of {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lj$a */
    public static final class a implements InterfaceC3519lj, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f33334a;

        public a(Rf rf2) {
            this.f33334a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f33334a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f33334a, ((a) obj).f33334a);
        }

        public int hashCode() {
            Rf rf2 = this.f33334a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f33334a + ")";
        }

        public /* synthetic */ a(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : rf2);
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f33334a = rf2;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lj$b */
    public static final class b implements InterfaceC3519lj, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33335a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lj$c */
    public static final class c implements InterfaceC3519lj, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f33336a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lj$d */
    public static final class d implements InterfaceC3519lj, Of.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f33337a = new d();

        private d() {
        }
    }
}
