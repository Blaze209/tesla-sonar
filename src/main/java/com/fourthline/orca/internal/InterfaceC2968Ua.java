package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2968Ua extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ua$a */
    public static final class a implements InterfaceC2968Ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28753a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 112100157;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ua$b */
    public static final class b implements InterfaceC2968Ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28754a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -783054660;
        }

        public String toString() {
            return "OnCloseEnlargedButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ua$c */
    public static final class c implements InterfaceC2968Ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f28755a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1500685234;
        }

        public String toString() {
            return "OnDismissClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ua$d */
    public static final class d implements InterfaceC2968Ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f28756a;

        public d(Bitmap image) {
            p013kotlin.jvm.internal.s.k(image, "image");
            this.f28756a = image;
        }

        public final Bitmap a() {
            return this.f28756a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f28756a, ((d) obj).f28756a);
        }

        public int hashCode() {
            return this.f28756a.hashCode();
        }

        public String toString() {
            return "OnEnlargedButtonClicked(image=" + this.f28756a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ua$e */
    public static final class e implements InterfaceC2968Ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f28757a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -592371426;
        }

        public String toString() {
            return "OnHintAnimationFinished";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ua$f */
    public static final class f implements InterfaceC2968Ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f28758a = new f();

        private f() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1531432783;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ua$g */
    public static final class g implements InterfaceC2968Ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f28759a;

        public g(Map result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f28759a = result;
        }

        public final Map a() {
            return this.f28759a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p013kotlin.jvm.internal.s.f(this.f28759a, ((g) obj).f28759a);
        }

        public int hashCode() {
            return this.f28759a.hashCode();
        }

        public String toString() {
            return "OnPermissionsRequestResult(result=" + this.f28759a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ua$h */
    public static final class h implements InterfaceC2968Ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f28760a;

        public h(boolean z11) {
            this.f28760a = z11;
        }

        public final boolean a() {
            return this.f28760a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f28760a == ((h) obj).f28760a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f28760a);
        }

        public String toString() {
            return "OnScreenShown(allPermissionsGranted=" + this.f28760a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ua$i */
    public static final class i implements InterfaceC2968Ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f28761a = new i();

        private i() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return 1219706571;
        }

        public String toString() {
            return "OnTakeSnapshotClicked";
        }
    }
}
