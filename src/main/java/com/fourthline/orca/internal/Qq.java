package com.fourthline.orca.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public interface Qq extends JD {

    public static final class a implements Qq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27524a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -861340021;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class b implements Qq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27525a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -782922034;
        }

        public String toString() {
            return "OnDocumentNotSupportedClicked";
        }
    }

    public static final class c implements Qq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f27526a;

        public c(Uri uri) {
            this.f27526a = uri;
        }

        public final Uri a() {
            return this.f27526a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f27526a, ((c) obj).f27526a);
        }

        public int hashCode() {
            Uri uri = this.f27526a;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public String toString() {
            return "OnDocumentPickerClosed(uri=" + this.f27526a + ")";
        }
    }

    public static final class d implements Qq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f27527a;

        public d(Uri uri) {
            this.f27527a = uri;
        }

        public final Uri a() {
            return this.f27527a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f27527a, ((d) obj).f27527a);
        }

        public int hashCode() {
            Uri uri = this.f27527a;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public String toString() {
            return "OnImagePickerClosed(uri=" + this.f27527a + ")";
        }
    }

    public static final class e implements Qq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f27528a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1790094335;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    public static final class f implements Qq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Tr f27529a;

        public f(Tr documentType) {
            p013kotlin.jvm.internal.s.k(documentType, "documentType");
            this.f27529a = documentType;
        }

        public final Tr a() {
            return this.f27529a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f27529a == ((f) obj).f27529a;
        }

        public int hashCode() {
            return this.f27529a.hashCode();
        }

        public String toString() {
            return "OnOptionClicked(documentType=" + this.f27529a + ")";
        }
    }

    public static final class g implements Qq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f27530a = new g();

        private g() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1800104767;
        }

        public String toString() {
            return "OnPopupMenuDismissed";
        }
    }

    public static final class h implements Qq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27531a;

        public h(int i11) {
            this.f27531a = i11;
        }

        public final int a() {
            return this.f27531a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f27531a == ((h) obj).f27531a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f27531a);
        }

        public String toString() {
            return "OnPopupMenuItemClicked(index=" + this.f27531a + ")";
        }
    }

    public static final class i implements Qq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f27532a = new i();

        private i() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return 487190882;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }
}
