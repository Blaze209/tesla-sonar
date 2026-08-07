package com.fourthline.orca.internal;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3949vk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f36125a = e.f36142a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$A */
    public interface A extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$A$a */
        public static final class a {
            public static String a(A a11) {
                return g.a(a11);
            }

            public static String b(A a11) {
                return g.b(a11);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$A$b */
        public static final class b implements A {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f36126b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36127c = "workflow_loading";

            private b() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36127c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 726770207;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$a, reason: case insensitive filesystem */
    public interface InterfaceC3950a extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$a$a, reason: collision with other inner class name */
        public static final class C0622a {
            public static String a(InterfaceC3950a interfaceC3950a) {
                return g.a(interfaceC3950a);
            }

            public static String b(InterfaceC3950a interfaceC3950a) {
                return g.b(interfaceC3950a);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$a$b */
        public static final class b implements InterfaceC3950a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f36128b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36129c = "address_details";

            private b() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return C0622a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36129c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return C0622a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1975944700;
            }

            public String toString() {
                return "Details";
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$c */
    public interface c extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$c$a */
        public static final class a implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f36132b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36133c = "bav_capture";

            private a() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36133c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 980117329;
            }

            public String toString() {
                return "CaptureIban";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$c$b */
        public static final class b {
            public static String a(c cVar) {
                return "bav";
            }

            public static String b(c cVar) {
                return g.b(cVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$c$c, reason: collision with other inner class name */
        public static final class C0623c implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0623c f36134b = new C0623c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36135c = "bav_intro";

            private C0623c() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36135c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0623c);
            }

            public int hashCode() {
                return -1467385949;
            }

            public String toString() {
                return "FlowIntroduction";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$c$d */
        public static final class d implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f36136b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36137c = "bav_processing";

            private d() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36137c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1947357971;
            }

            public String toString() {
                return "Status";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$c$e */
        public static final class e implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f36138b = new e();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36139c = "bav_type";

            private e() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36139c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 1410297589;
            }

            public String toString() {
                return "Type";
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ e f36142a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final C3906uk f36143b = new C3906uk(true, true, false, null, 12, null);

        private e() {
        }

        public final C3906uk a() {
            return f36143b;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$f */
    public interface f extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$f$a */
        public static final class a {
            public static String a(f fVar) {
                return g.a(fVar);
            }

            public static String b(f fVar) {
                return g.b(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$f$b */
        public static final class b implements f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f36144b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36145c = "contact_details";

            private b() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36145c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1192060039;
            }

            public String toString() {
                return "Details";
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$g */
    public static final class g {
        public static String a(InterfaceC3949vk interfaceC3949vk) {
            return "";
        }

        public static String b(InterfaceC3949vk interfaceC3949vk) {
            return interfaceC3949vk.c() + "." + interfaceC3949vk.b();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$h */
    public interface h extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$h$a */
        public static final class a {
            public static String a(h hVar) {
                return g.a(hVar);
            }

            public static String b(h hVar) {
                return g.b(hVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$h$b */
        public static final class b implements h, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36146b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36147c;

            public b(C3906uk c3906uk) {
                this.f36146b = c3906uk;
                this.f36147c = "document_capture";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36147c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36146b, ((b) obj).f36146b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36146b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36146b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f36146b + ")";
            }

            public /* synthetic */ b(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$i */
    public interface i extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$i$a */
        public static final class a {
            public static String a(i iVar) {
                return g.a(iVar);
            }

            public static String b(i iVar) {
                return g.b(iVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$i$d */
        public static final class d implements i {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f36152b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36153c = "document_ready";

            private d() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36153c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -659010923;
            }

            public String toString() {
                return "DocumentReady";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$i$b */
        public static final class b implements i, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36148b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36149c;

            public b(C3906uk c3906uk) {
                this.f36148b = c3906uk;
                this.f36149c = "document_details";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36149c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36148b, ((b) obj).f36148b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36148b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36148b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Details(config=" + this.f36148b + ")";
            }

            public /* synthetic */ b(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$i$c */
        public static final class c implements i, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36150b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36151c;

            public c(C3906uk c3906uk) {
                this.f36150b = c3906uk;
                this.f36151c = "document_processing";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36151c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f36150b, ((c) obj).f36150b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36150b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36150b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "DocumentAnalysis(config=" + this.f36150b + ")";
            }

            public /* synthetic */ c(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$i$e */
        public static final class e implements i, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36154b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36155c;

            public e(C3906uk c3906uk) {
                this.f36154b = c3906uk;
                this.f36155c = "document_capture";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36155c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f36154b, ((e) obj).f36154b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36154b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36154b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f36154b + ")";
            }

            public /* synthetic */ e(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$i$f */
        public static final class f implements i, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36156b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36157c;

            public f(C3906uk c3906uk) {
                this.f36156b = c3906uk;
                this.f36157c = "document_upload";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36157c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f36156b, ((f) obj).f36156b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36156b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36156b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "UploadData(config=" + this.f36156b + ")";
            }

            public /* synthetic */ f(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$k */
    public interface k extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$k$b */
        public static final class b {
            public static String a(k kVar) {
                return g.a(kVar);
            }

            public static String b(k kVar) {
                return g.b(kVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$k$d */
        public static final class d implements k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f36170b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36171c = "eid_intro";

            private d() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36171c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1103090950;
            }

            public String toString() {
                return "Intro";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$k$e */
        public static final class e implements k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f36172b = new e();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36173c = "eid_nfc";

            private e() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36173c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 539638201;
            }

            public String toString() {
                return "Nfc";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$k$g */
        public static final class g implements k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f36176b = new g();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36177c = "eid_upload";

            private g() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36177c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 509074227;
            }

            public String toString() {
                return "Upload";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$k$a */
        public static final class a implements k, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36166b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36167c;

            public a(C3906uk c3906uk) {
                this.f36166b = c3906uk;
                this.f36167c = "eid_can_number";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36167c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f36166b, ((a) obj).f36166b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36166b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36166b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "CanNumber(config=" + this.f36166b + ")";
            }

            public /* synthetic */ a(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$k$c */
        public static final class c implements k, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36168b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36169c;

            public c(C3906uk c3906uk) {
                this.f36168b = c3906uk;
                this.f36169c = "eid_flow_selection";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36169c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f36168b, ((c) obj).f36168b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36168b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36168b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "FlowSelection(config=" + this.f36168b + ")";
            }

            public /* synthetic */ c(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$k$f */
        public static final class f implements k, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36174b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36175c;

            public f(C3906uk c3906uk) {
                this.f36174b = c3906uk;
                this.f36175c = "eid_pin";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36175c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f36174b, ((f) obj).f36174b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36174b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36174b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Pin(config=" + this.f36174b + ")";
            }

            public /* synthetic */ f(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$m */
    public static final class m implements InterfaceC3949vk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bo f36181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36182c;

        public m(Bo error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f36181b = error;
            this.f36182c = "finish_with_error";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String a() {
            return g.b(this);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String b() {
            return this.f36182c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String c() {
            return g.a(this);
        }

        public final Bo d() {
            return this.f36181b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && p013kotlin.jvm.internal.s.f(this.f36181b, ((m) obj).f36181b);
        }

        public int hashCode() {
            return this.f36181b.hashCode();
        }

        public String toString() {
            return "FINISH_WITH_ERROR(error=" + this.f36181b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$n */
    public static final class n implements InterfaceC3949vk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC3740qp f36183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36184c;

        public n(InterfaceC3740qp success) {
            p013kotlin.jvm.internal.s.k(success, "success");
            this.f36183b = success;
            this.f36184c = "finish_with_success";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String a() {
            return g.b(this);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String b() {
            return this.f36184c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String c() {
            return g.a(this);
        }

        public final InterfaceC3740qp d() {
            return this.f36183b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && p013kotlin.jvm.internal.s.f(this.f36183b, ((n) obj).f36183b);
        }

        public int hashCode() {
            return this.f36183b.hashCode();
        }

        public String toString() {
            return "FINISH_WITH_SUCCESS(success=" + this.f36183b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$o */
    public interface o extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$o$a */
        public static final class a {
            public static String a(o oVar) {
                return g.a(oVar);
            }

            public static String b(o oVar) {
                return g.b(oVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$o$b */
        public static final class b implements o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f36185b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36186c = OrcaKeys.METADATA;

            private b() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36186c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -654334811;
            }

            public String toString() {
                return "Scanner";
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$q */
    public interface q extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$q$a */
        public static final class a {
            public static String a(q qVar) {
                return g.a(qVar);
            }

            public static String b(q qVar) {
                return g.b(qVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$q$b */
        public static final class b implements q, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36189b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36190c;

            public b(C3906uk c3906uk) {
                this.f36189b = c3906uk;
                this.f36190c = "nfc_scanner";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36190c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36189b, ((b) obj).f36189b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36189b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36189b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f36189b + ")";
            }

            public /* synthetic */ b(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$r */
    public interface r extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$r$a */
        public static final class a {
            public static String a(r rVar) {
                return "can";
            }

            public static String b(r rVar) {
                return g.b(rVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$r$b */
        public static final class b implements r {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f36191b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36192c = "document_can";

            private b() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36192c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1565962903;
            }

            public String toString() {
                return "NfcCanNumber";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$r$c */
        public static final class c implements r, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36193b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36194c;

            public c(C3906uk c3906uk) {
                this.f36193b = c3906uk;
                this.f36194c = "nfc_intro";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36194c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f36193b, ((c) obj).f36193b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36193b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36193b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "NfcIntroduction(config=" + this.f36193b + ")";
            }

            public /* synthetic */ c(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$r$d */
        public static final class d implements r, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36195b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36196c;

            public d(C3906uk c3906uk) {
                this.f36195b = c3906uk;
                this.f36196c = "nfc_scanner";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36196c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f36195b, ((d) obj).f36195b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36195b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36195b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "NfcScanner(config=" + this.f36195b + ")";
            }

            public /* synthetic */ d(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$s */
    public interface s extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$s$a */
        public static final class a {
            public static String a(s sVar) {
                return g.a(sVar);
            }

            public static String b(s sVar) {
                return g.b(sVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$s$b */
        public static final class b implements s, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36197b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36198c;

            public b(C3906uk c3906uk) {
                this.f36197b = c3906uk;
                this.f36198c = "nfc_intro";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36198c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36197b, ((b) obj).f36197b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36197b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36197b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "NfcIntroduction(config=" + this.f36197b + ")";
            }

            public /* synthetic */ b(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$s$c */
        public static final class c implements s, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36199b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36200c;

            public c(C3906uk c3906uk) {
                this.f36199b = c3906uk;
                this.f36200c = "nfc_scanner";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36200c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f36199b, ((c) obj).f36199b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36199b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36199b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "NfcScanner(config=" + this.f36199b + ")";
            }

            public /* synthetic */ c(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$s$d */
        public static final class d implements s, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36201b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36202c;

            public d(C3906uk c3906uk) {
                this.f36201b = c3906uk;
                this.f36202c = "document_upload";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36202c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f36201b, ((d) obj).f36201b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36201b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36201b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "UploadData(config=" + this.f36201b + ")";
            }

            public /* synthetic */ d(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$t */
    public interface t extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$t$a */
        public static final class a {
            public static String a(t tVar) {
                return g.a(tVar);
            }

            public static String b(t tVar) {
                return g.b(tVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$t$c */
        public static final class c implements t {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f36205b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36206c = "personal_details";

            private c() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36206c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1126399063;
            }

            public String toString() {
                return "PersonalDetails";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$t$b */
        public static final class b implements t, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36203b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36204c;

            public b(C3906uk c3906uk) {
                this.f36203b = c3906uk;
                this.f36204c = "nationality";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36204c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36203b, ((b) obj).f36203b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36203b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36203b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Nationality(config=" + this.f36203b + ")";
            }

            public /* synthetic */ b(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$u */
    public interface u extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$u$a */
        public static final class a {
            public static String a(u uVar) {
                return "poa";
            }

            public static String b(u uVar) {
                return g.b(uVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$u$b */
        public static final class b implements u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f36207b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36208c = "poa_type";

            private b() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36208c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -961608443;
            }

            public String toString() {
                return "DocumentType";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$u$c */
        public static final class c implements u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f36209b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36210c = "poa_intro";

            private c() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36210c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 2051182122;
            }

            public String toString() {
                return "Introduction";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$u$d */
        public static final class d implements u, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36211b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36212c;

            public d(C3906uk c3906uk) {
                this.f36211b = c3906uk;
                this.f36212c = "poa_capture_result";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36212c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f36211b, ((d) obj).f36211b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36211b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36211b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "PickerConfirmation(config=" + this.f36211b + ")";
            }

            public /* synthetic */ d(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$u$e */
        public static final class e implements u, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36213b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36214c;

            public e(C3906uk c3906uk) {
                this.f36213b = c3906uk;
                this.f36214c = "poa_capture";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36214c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f36213b, ((e) obj).f36213b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36213b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36213b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f36213b + ")";
            }

            public /* synthetic */ e(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$u$f */
        public static final class f implements u, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36215b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36216c;

            public f(C3906uk c3906uk) {
                this.f36215b = c3906uk;
                this.f36216c = "poa_upload";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36216c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f36215b, ((f) obj).f36215b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36215b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36215b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "UploadData(config=" + this.f36215b + ")";
            }

            public /* synthetic */ f(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$v */
    public interface v extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$v$b */
        public static final class b {
            public static String a(v vVar) {
                return "qes";
            }

            public static String b(v vVar) {
                return g.b(vVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$v$c */
        public static final class c implements v {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f36219b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36220c = "qes_intro";

            private c() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36220c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 30804955;
            }

            public String toString() {
                return "FlowIntroduction";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$v$d */
        public static final class d implements v {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f36221b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36222c = OrcaKeys.METADATA;

            private d() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36222c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1781619382;
            }

            public String toString() {
                return "LocationScanner";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$v$e */
        public static final class e implements v {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f36223b = new e();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36224c = "qes_document_viewer";

            private e() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36224c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -396495742;
            }

            public String toString() {
                return "PdfRenderer";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$v$f */
        public static final class f implements v {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f36225b = new f();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36226c = "selfie_intro";

            private f() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36226c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -236868523;
            }

            public String toString() {
                return "SelfieIntroduction";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$v$h */
        public static final class h implements v {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final h f36229b = new h();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36230c = "qes_sign";

            private h() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36230c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public int hashCode() {
                return 1043195312;
            }

            public String toString() {
                return "Sign";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$v$a */
        public static final class a implements v, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36217b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36218c;

            public a(C3906uk c3906uk) {
                this.f36217b = c3906uk;
                this.f36218c = "qes_agree";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36218c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f36217b, ((a) obj).f36217b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36217b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36217b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Agreements(config=" + this.f36217b + ")";
            }

            public /* synthetic */ a(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$v$g */
        public static final class g implements v, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36227b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36228c;

            public g(C3906uk c3906uk) {
                this.f36227b = c3906uk;
                this.f36228c = "selfie_capture";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36228c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && p013kotlin.jvm.internal.s.f(this.f36227b, ((g) obj).f36227b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36227b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36227b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "SelfieScanner(config=" + this.f36227b + ")";
            }

            public /* synthetic */ g(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$w */
    public interface w extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$w$a */
        public static final class a {
            public static String a(w wVar) {
                return g.a(wVar);
            }

            public static String b(w wVar) {
                return g.b(wVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$w$b */
        public static final class b implements w, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36231b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36232c;

            public b(C3906uk c3906uk) {
                this.f36231b = c3906uk;
                this.f36232c = "selfie_capture";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36232c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36231b, ((b) obj).f36231b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36231b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36231b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f36231b + ")";
            }

            public /* synthetic */ b(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$x */
    public interface x extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$x$a */
        public static final class a {
            public static String a(x xVar) {
                return g.a(xVar);
            }

            public static String b(x xVar) {
                return g.b(xVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$x$b */
        public static final class b implements x {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f36233b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36234c = "selfie_intro";

            private b() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36234c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1149302784;
            }

            public String toString() {
                return "Introduction";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$x$c */
        public static final class c implements x, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36235b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36236c;

            public c(C3906uk c3906uk) {
                this.f36235b = c3906uk;
                this.f36236c = "selfie_capture";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36236c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f36235b, ((c) obj).f36235b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36235b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36235b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f36235b + ")";
            }

            public /* synthetic */ c(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$x$d */
        public static final class d implements x, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36237b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36238c;

            public d(C3906uk c3906uk) {
                this.f36237b = c3906uk;
                this.f36238c = "selfie_upload";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36238c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f36237b, ((d) obj).f36237b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36237b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36237b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "UploadData(config=" + this.f36237b + ")";
            }

            public /* synthetic */ d(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$y */
    public interface y extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$y$a */
        public static final class a {
            public static String a(y yVar) {
                return "tin";
            }

            public static String b(y yVar) {
                return g.b(yVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$y$c */
        public static final class c implements y {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f36241b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36242c = "tin_intro";

            private c() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36242c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -730833773;
            }

            public String toString() {
                return "Introduction";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$y$b */
        public static final class b implements y, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36239b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36240c;

            public b(C3906uk c3906uk) {
                this.f36239b = c3906uk;
                this.f36240c = "tin_details";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36240c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36239b, ((b) obj).f36239b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36239b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36239b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Details(config=" + this.f36239b + ")";
            }

            public /* synthetic */ b(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$y$d */
        public static final class d implements y, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36243b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36244c;

            public d(C3906uk c3906uk) {
                this.f36243b = c3906uk;
                this.f36244c = "tin_capture";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36244c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f36243b, ((d) obj).f36243b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36243b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36243b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Scanner(config=" + this.f36243b + ")";
            }

            public /* synthetic */ d(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InterfaceC3949vk.f36125a.a() : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$y$e */
        public static final class e implements y, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36245b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36246c;

            public e(C3906uk c3906uk) {
                this.f36245b = c3906uk;
                this.f36246c = "tin_upload";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36246c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f36245b, ((e) obj).f36245b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36245b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36245b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "UploadData(config=" + this.f36245b + ")";
            }

            public /* synthetic */ e(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$z */
    public interface z extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$z$a */
        public static final class a {
            public static String a(z zVar) {
                return g.a(zVar);
            }

            public static String b(z zVar) {
                return g.b(zVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$z$b */
        public static final class b implements z {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f36247b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36248c = "workflow_uploading";

            private b() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return a.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36248c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return a.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -2116454215;
            }

            public String toString() {
                return "Upload";
            }
        }
    }

    String a();

    String b();

    String c();

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$b */
    public static final class b implements InterfaceC3949vk, D4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3906uk f36130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36131c;

        public b(C3906uk c3906uk) {
            this.f36130b = c3906uk;
            this.f36131c = "back";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String a() {
            return g.b(this);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String b() {
            return this.f36131c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String c() {
            return g.a(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36130b, ((b) obj).f36130b);
        }

        @Override // com.fourthline.orca.internal.D4
        public C3906uk getConfig() {
            return this.f36130b;
        }

        public int hashCode() {
            C3906uk c3906uk = this.f36130b;
            if (c3906uk == null) {
                return 0;
            }
            return c3906uk.hashCode();
        }

        public String toString() {
            return "BACK(config=" + this.f36130b + ")";
        }

        public /* synthetic */ b(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : c3906uk);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$d */
    public static final class d implements InterfaceC3949vk, D4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3906uk f36140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36141c;

        public d(C3906uk c3906uk) {
            this.f36140b = c3906uk;
            this.f36141c = "cancel_flow";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String a() {
            return g.b(this);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String b() {
            return this.f36141c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String c() {
            return g.a(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f36140b, ((d) obj).f36140b);
        }

        @Override // com.fourthline.orca.internal.D4
        public C3906uk getConfig() {
            return this.f36140b;
        }

        public int hashCode() {
            C3906uk c3906uk = this.f36140b;
            if (c3906uk == null) {
                return 0;
            }
            return c3906uk.hashCode();
        }

        public String toString() {
            return "CANCEL_FLOW(config=" + this.f36140b + ")";
        }

        public /* synthetic */ d(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : c3906uk);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$j */
    public interface j extends InterfaceC3949vk {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$j$b */
        public static final class b {
            public static String a(j jVar) {
                return g.a(jVar);
            }

            public static String b(j jVar) {
                return g.b(jVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$j$c */
        public static final class c implements j {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f36160b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36161c = "document_intro";

            private c() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36161c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -682114565;
            }

            public String toString() {
                return "Introduction";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$j$e */
        public static final class e implements j {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f36164b = new e();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final String f36165c = "document_version";

            private e() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return f36165c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -550679977;
            }

            public String toString() {
                return "Version";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$j$a */
        public static final class a implements j, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36158b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36159c;

            public a(C3906uk c3906uk) {
                this.f36158b = c3906uk;
                this.f36159c = AnalyticsAttribute.DocumentCountry;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36159c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f36158b, ((a) obj).f36158b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36158b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36158b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Country(config=" + this.f36158b + ")";
            }

            public /* synthetic */ a(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$j$d */
        public static final class d implements j, D4 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private C3906uk f36162b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f36163c;

            public d(C3906uk c3906uk) {
                this.f36162b = c3906uk;
                this.f36163c = AnalyticsAttribute.DocumentType;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String a() {
                return b.b(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String b() {
                return this.f36163c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3949vk
            public String c() {
                return b.a(this);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f36162b, ((d) obj).f36162b);
            }

            @Override // com.fourthline.orca.internal.D4
            public C3906uk getConfig() {
                return this.f36162b;
            }

            public int hashCode() {
                C3906uk c3906uk = this.f36162b;
                if (c3906uk == null) {
                    return 0;
                }
                return c3906uk.hashCode();
            }

            public String toString() {
                return "Type(config=" + this.f36162b + ")";
            }

            public /* synthetic */ d(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : c3906uk);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$p */
    public static final class p implements InterfaceC3949vk, D4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3906uk f36187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36188c;

        public p(C3906uk c3906uk) {
            this.f36187b = c3906uk;
            this.f36188c = "none";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String a() {
            return g.b(this);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String b() {
            return this.f36188c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String c() {
            return g.a(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && p013kotlin.jvm.internal.s.f(this.f36187b, ((p) obj).f36187b);
        }

        @Override // com.fourthline.orca.internal.D4
        public C3906uk getConfig() {
            return this.f36187b;
        }

        public int hashCode() {
            C3906uk c3906uk = this.f36187b;
            if (c3906uk == null) {
                return 0;
            }
            return c3906uk.hashCode();
        }

        public String toString() {
            return "NONE(config=" + this.f36187b + ")";
        }

        public /* synthetic */ p(C3906uk c3906uk, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : c3906uk);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vk$l */
    public static final class l implements InterfaceC3949vk, D4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3906uk f36178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rf f36179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f36180d;

        public l(C3906uk c3906uk, Rf rf2) {
            this.f36178b = c3906uk;
            this.f36179c = rf2;
            this.f36180d = "finish_flow";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String a() {
            return g.b(this);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String b() {
            return this.f36180d;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3949vk
        public String c() {
            return g.a(this);
        }

        public final Rf d() {
            return this.f36179c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p013kotlin.jvm.internal.s.f(this.f36178b, lVar.f36178b) && p013kotlin.jvm.internal.s.f(this.f36179c, lVar.f36179c);
        }

        @Override // com.fourthline.orca.internal.D4
        public C3906uk getConfig() {
            return this.f36178b;
        }

        public int hashCode() {
            C3906uk c3906uk = this.f36178b;
            int iHashCode = (c3906uk == null ? 0 : c3906uk.hashCode()) * 31;
            Rf rf2 = this.f36179c;
            return iHashCode + (rf2 != null ? rf2.hashCode() : 0);
        }

        public String toString() {
            return "FINISH_FLOW(config=" + this.f36178b + ", target=" + this.f36179c + ")";
        }

        public /* synthetic */ l(C3906uk c3906uk, Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : c3906uk, (i11 & 2) != 0 ? null : rf2);
        }
    }
}
