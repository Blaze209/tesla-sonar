package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3409j1 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.j1$a */
    public static final class a implements InterfaceC3409j1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32645a;

        public a(boolean z11) {
            this.f32645a = z11;
        }

        public final boolean a() {
            return this.f32645a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f32645a == ((a) obj).f32645a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f32645a);
        }

        public String toString() {
            return "Completed(isValid=" + this.f32645a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.j1$b */
    public static final class b implements InterfaceC3409j1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f32646a;

        public b(Throwable error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f32646a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f32646a, ((b) obj).f32646a);
        }

        public int hashCode() {
            return this.f32646a.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f32646a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.j1$c */
    public static final class c implements InterfaceC3409j1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32647a = new c();

        private c() {
        }
    }
}
