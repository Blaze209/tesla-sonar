package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3678pC extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pC$a */
    public static final class a implements InterfaceC3678pC {
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pC$b */
    public static final class b implements InterfaceC3678pC {
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pC$c */
    public static final class c implements InterfaceC3678pC {
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pC$d */
    public static final class d implements InterfaceC3678pC {
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pC$e */
    public static final class e implements InterfaceC3678pC {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f34470a;

        public e(Object obj) {
            this.f34470a = obj;
        }

        public final Object a() {
            return this.f34470a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f34470a, ((e) obj).f34470a);
        }

        public int hashCode() {
            Object obj = this.f34470a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "OnTypeClicked(type=" + this.f34470a + ")";
        }
    }
}
