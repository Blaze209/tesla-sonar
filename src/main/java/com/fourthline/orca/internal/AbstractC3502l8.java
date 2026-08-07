package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerError;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3502l8 extends Bo {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.l8$a */
    public static final class a extends AbstractC3502l8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC3641oc f33244a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(AbstractC3641oc documentValidationError) {
            p013kotlin.jvm.internal.s.k(documentValidationError, "documentValidationError");
            Throwable th2 = null;
            super(documentValidationError.getAlias(), th2, documentValidationError.getAlias(), 2, null);
            this.f33244a = documentValidationError;
        }

        public final AbstractC3641oc a() {
            return this.f33244a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f33244a, ((a) obj).f33244a);
        }

        public int hashCode() {
            return this.f33244a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Analysis(documentValidationError=" + this.f33244a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.l8$b */
    public static final class b extends AbstractC3502l8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33245a = new b();

        private b() {
            super("canceled", null, "canceled", 2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 269311374;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.l8$c */
    public static final class c extends AbstractC3502l8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f33246a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List permissions) {
            super("permission_not_granted", null, null, 6, null);
            p013kotlin.jvm.internal.s.k(permissions, "permissions");
            this.f33246a = permissions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f33246a, ((c) obj).f33246a);
        }

        public int hashCode() {
            return this.f33246a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Permissions(permissions=" + this.f33246a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.l8$d */
    public static final class d extends AbstractC3502l8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC3641oc f33247a;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(AbstractC3641oc documentValidationError) {
            p013kotlin.jvm.internal.s.k(documentValidationError, "documentValidationError");
            Throwable th2 = null;
            super(documentValidationError.getAlias(), th2, documentValidationError.getAlias(), 2, null);
            this.f33247a = documentValidationError;
        }

        public final AbstractC3641oc a() {
            return this.f33247a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f33247a, ((d) obj).f33247a);
        }

        public int hashCode() {
            return this.f33247a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PostProcessing(documentValidationError=" + this.f33247a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.l8$e */
    public static final class e extends AbstractC3502l8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DocumentScannerError f33248a;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(DocumentScannerError scannerError) {
            p013kotlin.jvm.internal.s.k(scannerError, "scannerError");
            Throwable th2 = null;
            super(AbstractC3545m8.b(scannerError), th2, AbstractC3545m8.b(scannerError), 2, null);
            this.f33248a = scannerError;
        }

        public final DocumentScannerError a() {
            return this.f33248a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f33248a == ((e) obj).f33248a;
        }

        public int hashCode() {
            return this.f33248a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Scanner(scannerError=" + this.f33248a + ")";
        }
    }

    public /* synthetic */ AbstractC3502l8(String str, Throwable th2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2, str2);
    }

    public /* synthetic */ AbstractC3502l8(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, (i11 & 4) != 0 ? "document_scanner_error" : str2, null);
    }

    private AbstractC3502l8(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }
}
