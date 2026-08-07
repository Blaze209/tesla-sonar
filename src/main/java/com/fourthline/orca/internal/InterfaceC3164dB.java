package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3164dB extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dB$a */
    public static final class a implements InterfaceC3164dB {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31091a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dB$b */
    public static final class b implements InterfaceC3164dB {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f31092a;

        public b(boolean z11) {
            this.f31092a = z11;
        }

        public final boolean a() {
            return this.f31092a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f31092a == ((b) obj).f31092a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f31092a);
        }

        public String toString() {
            return "OnFocusChanged(isFocused=" + this.f31092a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dB$c */
    public static final class c implements InterfaceC3164dB {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f31093a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dB$d */
    public static final class d implements InterfaceC3164dB {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f31094a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dB$e */
    public static final class e implements InterfaceC3164dB {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31095a;

        public e(String input) {
            p013kotlin.jvm.internal.s.k(input, "input");
            this.f31095a = input;
        }

        public final String a() {
            return this.f31095a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f31095a, ((e) obj).f31095a);
        }

        public int hashCode() {
            return this.f31095a.hashCode();
        }

        public String toString() {
            return "OnValueChanged(input=" + this.f31095a + ")";
        }
    }
}
