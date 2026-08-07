package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2895Kd extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Kd$a */
    public static final class a implements InterfaceC2895Kd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26571a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Kd$b */
    public static final class b implements InterfaceC2895Kd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26572a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Kd$c */
    public static final class c implements InterfaceC2895Kd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26573a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Kd$d */
    public static final class d implements InterfaceC2895Kd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26574a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Kd$e */
    public static final class e implements InterfaceC2895Kd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26575a;

        public e(String input) {
            p013kotlin.jvm.internal.s.k(input, "input");
            this.f26575a = input;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f26575a, ((e) obj).f26575a);
        }

        public int hashCode() {
            return this.f26575a.hashCode();
        }

        public String toString() {
            return "OnPinChanged(input=" + this.f26575a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Kd$f */
    public static final class f implements InterfaceC2895Kd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26576a;

        public f(String input) {
            p013kotlin.jvm.internal.s.k(input, "input");
            this.f26576a = input;
        }

        public final String a() {
            return this.f26576a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f26576a, ((f) obj).f26576a);
        }

        public int hashCode() {
            return this.f26576a.hashCode();
        }

        public String toString() {
            return "OnPinInserted(input=" + this.f26576a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Kd$g */
    public static final class g implements InterfaceC2895Kd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f26577a = new g();

        private g() {
        }
    }
}
