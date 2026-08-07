package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3815sf {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sf$a */
    public static final class a implements InterfaceC3815sf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC3358hs f35303a;

        public a(EnumC3358hs fileType) {
            p013kotlin.jvm.internal.s.k(fileType, "fileType");
            this.f35303a = fileType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f35303a == ((a) obj).f35303a;
        }

        public int hashCode() {
            return this.f35303a.hashCode();
        }

        public String toString() {
            return "ExceedMaxSize(fileType=" + this.f35303a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sf$b */
    public static final class b implements InterfaceC3815sf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC3358hs f35304a;

        public b(EnumC3358hs fileType) {
            p013kotlin.jvm.internal.s.k(fileType, "fileType");
            this.f35304a = fileType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f35304a == ((b) obj).f35304a;
        }

        public int hashCode() {
            return this.f35304a.hashCode();
        }

        public String toString() {
            return "IncorrectFormat(fileType=" + this.f35304a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sf$c */
    public static final class c implements InterfaceC3815sf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC3358hs f35305a;

        public c(EnumC3358hs fileType) {
            p013kotlin.jvm.internal.s.k(fileType, "fileType");
            this.f35305a = fileType;
        }

        public EnumC3358hs a() {
            return this.f35305a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f35305a == ((c) obj).f35305a;
        }

        public int hashCode() {
            return this.f35305a.hashCode();
        }

        public String toString() {
            return "Success(fileType=" + this.f35305a + ")";
        }
    }
}
