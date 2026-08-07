package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3726qb extends Of {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qb$a */
    public static final class a implements InterfaceC3726qb, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34791a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qb$b */
    public static final class b implements InterfaceC3726qb, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f34792a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qb$c */
    public static final class c implements InterfaceC3726qb, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f34793a;

        public c(Rf rf2) {
            this.f34793a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f34793a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f34793a, ((c) obj).f34793a);
        }

        public int hashCode() {
            Rf rf2 = this.f34793a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f34793a + ")";
        }

        public /* synthetic */ c(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : rf2);
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f34793a = rf2;
        }
    }
}
