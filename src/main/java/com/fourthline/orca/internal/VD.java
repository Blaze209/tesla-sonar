package com.fourthline.orca.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public interface VD {

    public static final class a implements VD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Yj f29053a;

        public a(Yj lottieSource) {
            p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
            this.f29053a = lottieSource;
        }

        public final Yj a() {
            return this.f29053a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f29053a, ((a) obj).f29053a);
        }

        public int hashCode() {
            return this.f29053a.hashCode();
        }

        public String toString() {
            return "Animation(lottieSource=" + this.f29053a + ")";
        }
    }

    public static final class b implements VD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f29054a;

        public b(Bitmap bitmap) {
            p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
            this.f29054a = bitmap;
        }

        public final Bitmap a() {
            return this.f29054a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f29054a, ((b) obj).f29054a);
        }

        public int hashCode() {
            return this.f29054a.hashCode();
        }

        public String toString() {
            return "Image(bitmap=" + this.f29054a + ")";
        }
    }
}
