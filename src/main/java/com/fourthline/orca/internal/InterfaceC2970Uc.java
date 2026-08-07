package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2970Uc extends InterfaceC3556md {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Uc$a */
    public static final class a implements InterfaceC2970Uc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28771a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 840967849;
        }

        public String toString() {
            return "Back";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Uc$b */
    public static final class b implements InterfaceC2970Uc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28772a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 399114691;
        }

        public String toString() {
            return "Forward";
        }
    }
}
