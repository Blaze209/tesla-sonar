package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3807sD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$a */
    public static final class a implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35234b;

        public a(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35233a = resource;
            this.f35234b = "cancel";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f35233a, ((a) obj).f35233a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35234b;
        }

        public int hashCode() {
            return this.f35233a.hashCode();
        }

        public String toString() {
            return "Cancel(resource=" + this.f35233a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35233a;
        }

        public /* synthetic */ a(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.a.a(QA.f27433a, R.string.shared_button_cancel, 0, 2, null) : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$b */
    public static final class b implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35235a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final QA f35236b = QA.a.a(QA.f27433a, R.string.shared_button_close, 0, 2, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f35237c = "close";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f35238d = 8;

        private b() {
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return f35237c;
        }

        public int hashCode() {
            return -783165290;
        }

        public String toString() {
            return "Close";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return f35236b;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$c */
    public static final class c implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35240b;

        public c(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35239a = resource;
            this.f35240b = "collapse";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f35239a, ((c) obj).f35239a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35240b;
        }

        public int hashCode() {
            return this.f35239a.hashCode();
        }

        public String toString() {
            return "Collapse(resource=" + this.f35239a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35239a;
        }

        public /* synthetic */ c(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.b.f27435b : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$d */
    public static final class d implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35242b;

        public d(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35241a = resource;
            this.f35242b = "continue";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f35241a, ((d) obj).f35241a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35242b;
        }

        public int hashCode() {
            return this.f35241a.hashCode();
        }

        public String toString() {
            return "Continue(resource=" + this.f35241a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35241a;
        }

        public /* synthetic */ d(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.a.a(QA.f27433a, R.string.shared_button_continue, 0, 2, null) : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$e */
    public static final class e {
        public static String a(InterfaceC3807sD interfaceC3807sD, p020r2.l lVar, int i11) {
            lVar.o(82662274);
            if (p020r2.o.J()) {
                p020r2.o.S(82662274, i11, -1, "com.fourthline.orca.core.internal.composable.intent.UxIntent.getAccessibilityLabel (UxIntent.kt:21)");
            }
            String strA = RA.a(interfaceC3807sD.a(), lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return strA;
        }

        public static String b(InterfaceC3807sD interfaceC3807sD, p020r2.l lVar, int i11) {
            lVar.o(188797664);
            if (p020r2.o.J()) {
                p020r2.o.S(188797664, i11, -1, "com.fourthline.orca.core.internal.composable.intent.UxIntent.getLabel (UxIntent.kt:16)");
            }
            String strC = RA.c(interfaceC3807sD.a(), lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return strC;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$f */
    public static final class f implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35244b;

        public f(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35243a = resource;
            this.f35244b = "download";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f35243a, ((f) obj).f35243a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35244b;
        }

        public int hashCode() {
            return this.f35243a.hashCode();
        }

        public String toString() {
            return "Download(resource=" + this.f35243a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35243a;
        }

        public /* synthetic */ f(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.b.f27435b : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$g */
    public static final class g implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35246b;

        public g(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35245a = resource;
            this.f35246b = "exit";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p013kotlin.jvm.internal.s.f(this.f35245a, ((g) obj).f35245a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35246b;
        }

        public int hashCode() {
            return this.f35245a.hashCode();
        }

        public String toString() {
            return "Exit(resource=" + this.f35245a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35245a;
        }

        public /* synthetic */ g(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.a.a(QA.f27433a, R.string.shared_button_exit, 0, 2, null) : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$h */
    public static final class h implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35248b;

        public h(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35247a = resource;
            this.f35248b = "expand";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && p013kotlin.jvm.internal.s.f(this.f35247a, ((h) obj).f35247a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35248b;
        }

        public int hashCode() {
            return this.f35247a.hashCode();
        }

        public String toString() {
            return "Expand(resource=" + this.f35247a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35247a;
        }

        public /* synthetic */ h(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.b.f27435b : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$i */
    public static final class i implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final QA f35252d;

        public i(String value, String accessibilityValue) {
            p013kotlin.jvm.internal.s.k(value, "value");
            p013kotlin.jvm.internal.s.k(accessibilityValue, "accessibilityValue");
            this.f35249a = value;
            this.f35250b = accessibilityValue;
            this.f35251c = "undefined";
            this.f35252d = QA.b.f27435b;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35252d;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            lVar.o(-1556611678);
            if (p020r2.o.J()) {
                p020r2.o.S(-1556611678, i11, -1, "com.fourthline.orca.core.internal.composable.intent.UxIntent.LegacyString.getLabel (UxIntent.kt:31)");
            }
            String str = this.f35249a;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return p013kotlin.jvm.internal.s.f(this.f35249a, iVar.f35249a) && p013kotlin.jvm.internal.s.f(this.f35250b, iVar.f35250b);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35251c;
        }

        public int hashCode() {
            return (this.f35249a.hashCode() * 31) + this.f35250b.hashCode();
        }

        public String toString() {
            return "LegacyString(value=" + this.f35249a + ", accessibilityValue=" + this.f35250b + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            lVar.o(-1851447872);
            if (p020r2.o.J()) {
                p020r2.o.S(-1851447872, i11, -1, "com.fourthline.orca.core.internal.composable.intent.UxIntent.LegacyString.getAccessibilityLabel (UxIntent.kt:36)");
            }
            String str = this.f35250b;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return str;
        }

        public /* synthetic */ i(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? str : str2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$j */
    public static final class j implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35254b;

        public j(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35253a = resource;
            this.f35254b = "open";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && p013kotlin.jvm.internal.s.f(this.f35253a, ((j) obj).f35253a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35254b;
        }

        public int hashCode() {
            return this.f35253a.hashCode();
        }

        public String toString() {
            return "Open(resource=" + this.f35253a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35253a;
        }

        public /* synthetic */ j(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.b.f27435b : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$k */
    public static final class k implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35256b;

        public k(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35255a = resource;
            this.f35256b = "resolve";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && p013kotlin.jvm.internal.s.f(this.f35255a, ((k) obj).f35255a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35256b;
        }

        public int hashCode() {
            return this.f35255a.hashCode();
        }

        public String toString() {
            return "Resolve(resource=" + this.f35255a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35255a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$l */
    public static final class l implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35258b;

        public l(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35257a = resource;
            this.f35258b = "retry";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && p013kotlin.jvm.internal.s.f(this.f35257a, ((l) obj).f35257a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35258b;
        }

        public int hashCode() {
            return this.f35257a.hashCode();
        }

        public String toString() {
            return "Retry(resource=" + this.f35257a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35257a;
        }

        public /* synthetic */ l(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.a.a(QA.f27433a, R.string.shared_button_retry, 0, 2, null) : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$m */
    public static final class m implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f35259a = new m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final QA f35260b = QA.a.a(QA.f27433a, R.string.step_document_nfc_intro_button_start_nfc_scan, 0, 2, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f35261c = "scan_chip";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f35262d = 8;

        private m() {
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return f35261c;
        }

        public int hashCode() {
            return 1296425227;
        }

        public String toString() {
            return "ScanChip";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return f35260b;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$n */
    public static final class n implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35264b;

        public n(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35263a = resource;
            this.f35264b = "share";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && p013kotlin.jvm.internal.s.f(this.f35263a, ((n) obj).f35263a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35264b;
        }

        public int hashCode() {
            return this.f35263a.hashCode();
        }

        public String toString() {
            return "Share(resource=" + this.f35263a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35263a;
        }

        public /* synthetic */ n(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.b.f27435b : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$o */
    public static final class o implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35266b;

        public o(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35265a = resource;
            this.f35266b = "skip";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && p013kotlin.jvm.internal.s.f(this.f35265a, ((o) obj).f35265a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35266b;
        }

        public int hashCode() {
            return this.f35265a.hashCode();
        }

        public String toString() {
            return "Skip(resource=" + this.f35265a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35265a;
        }

        public /* synthetic */ o(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.b.f27435b : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$p */
    public static final class p implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35268b;

        public p(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35267a = resource;
            this.f35268b = "take_photo";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && p013kotlin.jvm.internal.s.f(this.f35267a, ((p) obj).f35267a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35268b;
        }

        public int hashCode() {
            return this.f35267a.hashCode();
        }

        public String toString() {
            return "TakePhoto(resource=" + this.f35267a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35267a;
        }

        public /* synthetic */ p(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.b.f27435b : qa2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$q */
    public static final class q implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35270b;

        public q(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35269a = resource;
            this.f35270b = "undefined";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && p013kotlin.jvm.internal.s.f(this.f35269a, ((q) obj).f35269a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35270b;
        }

        public int hashCode() {
            return this.f35269a.hashCode();
        }

        public String toString() {
            return "Undefined(resource=" + this.f35269a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35269a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sD$r */
    public static final class r implements InterfaceC3807sD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35272b;

        public r(QA resource) {
            p013kotlin.jvm.internal.s.k(resource, "resource");
            this.f35271a = resource;
            this.f35272b = "upload_photo";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String a(p020r2.l lVar, int i11) {
            return e.a(this, lVar, i11);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String b(p020r2.l lVar, int i11) {
            return e.b(this, lVar, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && p013kotlin.jvm.internal.s.f(this.f35271a, ((r) obj).f35271a);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public String getAlias() {
            return this.f35272b;
        }

        public int hashCode() {
            return this.f35271a.hashCode();
        }

        public String toString() {
            return "UploadPhoto(resource=" + this.f35271a + ")";
        }

        @Override // com.fourthline.orca.internal.InterfaceC3807sD
        public QA a() {
            return this.f35271a;
        }

        public /* synthetic */ r(QA qa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? QA.b.f27435b : qa2);
        }
    }

    QA a();

    String a(p020r2.l lVar, int i11);

    String b(p020r2.l lVar, int i11);

    String getAlias();
}
