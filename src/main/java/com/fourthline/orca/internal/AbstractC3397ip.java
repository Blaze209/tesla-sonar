package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerError;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3397ip extends Bo {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ip$a */
    public static final class a extends AbstractC3397ip {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32573a = new a();

        private a() {
            super("canceled", null, "canceled", 2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -2034668105;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ip$b */
    public static final class b extends AbstractC3397ip {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32574a = new b();

        private b() {
            super("not_same_person", null, "not_same_person", 2, null);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ip$c */
    public static final class c extends AbstractC3397ip {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32575a = new c();

        private c() {
            super("permission_not_granted", null, "permission_not_granted", 2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1518661978;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Permissions";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ip$d */
    public static final class d extends AbstractC3397ip {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SelfieScannerError f32576a;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(SelfieScannerError scannerError) {
            p013kotlin.jvm.internal.s.k(scannerError, "scannerError");
            Throwable th2 = null;
            super(AbstractC3439jp.b(scannerError), th2, AbstractC3439jp.b(scannerError), 2, null);
            this.f32576a = scannerError;
        }

        public final SelfieScannerError a() {
            return this.f32576a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f32576a == ((d) obj).f32576a;
        }

        public int hashCode() {
            return this.f32576a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Scanner(scannerError=" + this.f32576a + ")";
        }
    }

    public /* synthetic */ AbstractC3397ip(String str, Throwable th2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2, str2);
    }

    public /* synthetic */ AbstractC3397ip(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, (i11 & 4) != 0 ? "selfie_scanner_error" : str2, null);
    }

    private AbstractC3397ip(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }
}
