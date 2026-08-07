package com.fourthline.orca.internal;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4129zr extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zr$a */
    public static final class a implements InterfaceC4129zr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37331a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1163414859;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zr$b */
    public static final class b implements InterfaceC4129zr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f37332a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -662581369;
        }

        public String toString() {
            return "OnChangeDocumentButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zr$c */
    public static final class c implements InterfaceC4129zr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f37333a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1343303278;
        }

        public String toString() {
            return "OnCloseEnlargedButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zr$d */
    public static final class d implements InterfaceC4129zr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f37334a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -392241608;
        }

        public String toString() {
            return "OnConfirmButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zr$e */
    public static final class e implements InterfaceC4129zr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f37335a;

        public e(Bitmap image) {
            p013kotlin.jvm.internal.s.k(image, "image");
            this.f37335a = image;
        }

        public final Bitmap a() {
            return this.f37335a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f37335a, ((e) obj).f37335a);
        }

        public int hashCode() {
            return this.f37335a.hashCode();
        }

        public String toString() {
            return "OnEnlargedButtonClicked(image=" + this.f37335a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zr$f */
    public static final class f implements InterfaceC4129zr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f37336a = new f();

        private f() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1678463010;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }
}
