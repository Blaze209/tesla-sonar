package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3067b {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.b$a */
    public static final class a implements InterfaceC3067b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3903uh f30535a;

        public a(InterfaceC3903uh source) {
            p013kotlin.jvm.internal.s.k(source, "source");
            this.f30535a = source;
        }

        public final InterfaceC3903uh a() {
            return this.f30535a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f30535a, ((a) obj).f30535a);
        }

        public int hashCode() {
            return this.f30535a.hashCode();
        }

        public String toString() {
            return "Image(source=" + this.f30535a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.b$b, reason: collision with other inner class name */
    public static final class C0542b implements InterfaceC3067b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Yj f30536a;

        public C0542b(Yj source) {
            p013kotlin.jvm.internal.s.k(source, "source");
            this.f30536a = source;
        }

        public final Yj a() {
            return this.f30536a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0542b) && p013kotlin.jvm.internal.s.f(this.f30536a, ((C0542b) obj).f30536a);
        }

        public int hashCode() {
            return this.f30536a.hashCode();
        }

        public String toString() {
            return "Lottie(source=" + this.f30536a + ")";
        }
    }
}
