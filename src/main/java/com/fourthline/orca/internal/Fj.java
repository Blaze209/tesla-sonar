package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface Fj extends Ds {

    public static final class a {
        public static String a(Fj fj2) {
            return "location";
        }
    }

    public static final class b implements Fj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25828a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f25829b = "location_unexpected";

        private b() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return a.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f25829b;
        }

        public int hashCode() {
            return 447329019;
        }

        public String toString() {
            return "LocationGeneralError";
        }
    }

    public static final class c implements Fj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25830a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f25831b = "location_permission";

        private c() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return a.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f25831b;
        }

        public int hashCode() {
            return -1989062262;
        }

        public String toString() {
            return "LocationPermission";
        }
    }

    public static final class d implements Fj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f25832a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f25833b = "location_permission_not_granted";

        private d() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return a.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f25833b;
        }

        public int hashCode() {
            return 235596178;
        }

        public String toString() {
            return "LocationPermissionNotGranted";
        }
    }

    public static final class e implements Fj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f25834a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f25835b = "location_services_not_enabled";

        private e() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return a.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f25835b;
        }

        public int hashCode() {
            return 1006986407;
        }

        public String toString() {
            return "LocationServicesNotEnabled";
        }
    }

    public static final class f implements Fj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f25836a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f25837b = "precise_location_permission";

        private f() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return a.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f25837b;
        }

        public int hashCode() {
            return -787899335;
        }

        public String toString() {
            return "PreciseLocationPermission";
        }
    }
}
