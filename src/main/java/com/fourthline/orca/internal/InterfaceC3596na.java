package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3596na extends PD, MD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.na$a */
    public static final class a implements InterfaceC3596na {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33898a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1720455951;
        }

        public String toString() {
            return "Back";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.na$b */
    public static final class b implements InterfaceC3596na {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f33899a;

        public b(boolean z11) {
            this.f33899a = z11;
        }

        public final boolean c() {
            return this.f33899a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f33899a == ((b) obj).f33899a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f33899a);
        }

        public String toString() {
            return "Forward(skipPermissionRationale=" + this.f33899a + ")";
        }
    }
}
