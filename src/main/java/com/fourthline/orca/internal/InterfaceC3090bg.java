package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3090bg extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.bg$a */
    public static final class a implements InterfaceC3090bg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30646a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.bg$b */
    public static final class b implements InterfaceC3090bg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30647a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.bg$c */
    public static final class c implements InterfaceC3090bg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC3718q9 f30648a;

        public c(EnumC3718q9 type) {
            p013kotlin.jvm.internal.s.k(type, "type");
            this.f30648a = type;
        }

        public final EnumC3718q9 a() {
            return this.f30648a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f30648a == ((c) obj).f30648a;
        }

        public int hashCode() {
            return this.f30648a.hashCode();
        }

        public String toString() {
            return "OnOptionClicked(type=" + this.f30648a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.bg$d */
    public static final class d implements InterfaceC3090bg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f30649a = new d();

        private d() {
        }
    }
}
