package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3325h1 extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h1$a */
    public static final class a implements InterfaceC3325h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32168a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h1$b */
    public static final class b implements InterfaceC3325h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f32169a;

        public b(boolean z11) {
            this.f32169a = z11;
        }

        public final boolean a() {
            return this.f32169a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f32169a == ((b) obj).f32169a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f32169a);
        }

        public String toString() {
            return "OnFocusChanged(isFocused=" + this.f32169a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h1$c */
    public static final class c implements InterfaceC3325h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32170a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h1$d */
    public static final class d implements InterfaceC3325h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f32171a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h1$e */
    public static final class e implements InterfaceC3325h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32172a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h1$f */
    public static final class f implements InterfaceC3325h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32173a;

        public f(String input) {
            p013kotlin.jvm.internal.s.k(input, "input");
            this.f32173a = input;
        }

        public final String a() {
            return this.f32173a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f32173a, ((f) obj).f32173a);
        }

        public int hashCode() {
            return this.f32173a.hashCode();
        }

        public String toString() {
            return "OnValueChanged(input=" + this.f32173a + ")";
        }
    }
}
