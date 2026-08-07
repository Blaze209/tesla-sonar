package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3405iy extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iy$a */
    public static final class a implements InterfaceC3405iy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32616a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iy$b */
    public static final class b implements InterfaceC3405iy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32617a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iy$c */
    public static final class c implements InterfaceC3405iy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32618a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iy$d */
    public static final class d implements InterfaceC3405iy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f32619a;

        public d(Bitmap image) {
            p013kotlin.jvm.internal.s.k(image, "image");
            this.f32619a = image;
        }

        public final Bitmap a() {
            return this.f32619a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f32619a, ((d) obj).f32619a);
        }

        public int hashCode() {
            return this.f32619a.hashCode();
        }

        public String toString() {
            return "OnEnlargedButtonClicked(image=" + this.f32619a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iy$e */
    public static final class e implements InterfaceC3405iy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32620a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -502831408;
        }

        public String toString() {
            return "OnLivenessFaceDirectionAnimationFinishedPlaying";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iy$f */
    public static final class f implements InterfaceC3405iy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f32621a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iy$g */
    public static final class g implements InterfaceC3405iy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f32622a;

        public g(Map result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f32622a = result;
        }

        public final Map a() {
            return this.f32622a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p013kotlin.jvm.internal.s.f(this.f32622a, ((g) obj).f32622a);
        }

        public int hashCode() {
            return this.f32622a.hashCode();
        }

        public String toString() {
            return "OnPermissionsRequestResult(result=" + this.f32622a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iy$h */
    public static final class h implements InterfaceC3405iy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f32623a = new h();

        private h() {
        }
    }
}
