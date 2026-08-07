package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface Cn {

    public static final class b implements Cn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Yj f25255a;

        public b(Yj lottieSource) {
            p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
            this.f25255a = lottieSource;
        }

        public final Yj a() {
            return this.f25255a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25255a, ((b) obj).f25255a);
        }

        public int hashCode() {
            return this.f25255a.hashCode();
        }

        public String toString() {
            return "Lottie(lottieSource=" + this.f25255a + ")";
        }
    }

    public static final class a implements Cn {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0478a f25252c = new C0478a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f25254b;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Cn$a$a, reason: collision with other inner class name */
        public static final class C0478a {
            public /* synthetic */ C0478a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0478a() {
            }
        }

        public a(int i11, int i12) {
            this.f25253a = i11;
            this.f25254b = i12;
        }

        public final int a() {
            return this.f25254b;
        }

        public final int b() {
            return this.f25253a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25253a == aVar.f25253a && this.f25254b == aVar.f25254b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f25253a) * 31) + Integer.hashCode(this.f25254b);
        }

        public String toString() {
            return "Animation(progressItems=" + this.f25253a + ", currentPosition=" + this.f25254b + ")";
        }

        public /* synthetic */ a(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 10 : i11, (i13 & 2) != 0 ? 0 : i12);
        }
    }
}
