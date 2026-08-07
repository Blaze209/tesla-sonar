package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import java.util.List;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3004Wa extends QD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Wa$a */
    public static final class a implements Ds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29494a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f29495b = "document_scanner";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f29496c = "document_ready";

        private a() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return f29495b;
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f29496c;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Wa$b */
    public static final class b implements InterfaceC3004Wa {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f29497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f29498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f29499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bitmap f29500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final QA f29501e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final QA f29502f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final QA f29503g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final QA f29504h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final QA f29505i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f29506j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final boolean f29507k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final InterfaceC3903uh f29508l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final C2916Oe f29509m;

        public b(List stepResults, QA title, QA description, Bitmap image, QA checkpointOne, QA checkpointTwo, QA qa2, QA negativeButtonText, QA positiveButtonText, boolean z11, boolean z12, InterfaceC3903uh enlargeImageSource, C2916Oe c2916Oe) {
            p013kotlin.jvm.internal.s.k(stepResults, "stepResults");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(image, "image");
            p013kotlin.jvm.internal.s.k(checkpointOne, "checkpointOne");
            p013kotlin.jvm.internal.s.k(checkpointTwo, "checkpointTwo");
            p013kotlin.jvm.internal.s.k(negativeButtonText, "negativeButtonText");
            p013kotlin.jvm.internal.s.k(positiveButtonText, "positiveButtonText");
            p013kotlin.jvm.internal.s.k(enlargeImageSource, "enlargeImageSource");
            this.f29497a = stepResults;
            this.f29498b = title;
            this.f29499c = description;
            this.f29500d = image;
            this.f29501e = checkpointOne;
            this.f29502f = checkpointTwo;
            this.f29503g = qa2;
            this.f29504h = negativeButtonText;
            this.f29505i = positiveButtonText;
            this.f29506j = z11;
            this.f29507k = z12;
            this.f29508l = enlargeImageSource;
            this.f29509m = c2916Oe;
        }

        public final b a(List stepResults, QA title, QA description, Bitmap image, QA checkpointOne, QA checkpointTwo, QA qa2, QA negativeButtonText, QA positiveButtonText, boolean z11, boolean z12, InterfaceC3903uh enlargeImageSource, C2916Oe c2916Oe) {
            p013kotlin.jvm.internal.s.k(stepResults, "stepResults");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(image, "image");
            p013kotlin.jvm.internal.s.k(checkpointOne, "checkpointOne");
            p013kotlin.jvm.internal.s.k(checkpointTwo, "checkpointTwo");
            p013kotlin.jvm.internal.s.k(negativeButtonText, "negativeButtonText");
            p013kotlin.jvm.internal.s.k(positiveButtonText, "positiveButtonText");
            p013kotlin.jvm.internal.s.k(enlargeImageSource, "enlargeImageSource");
            return new b(stepResults, title, description, image, checkpointOne, checkpointTwo, qa2, negativeButtonText, positiveButtonText, z11, z12, enlargeImageSource, c2916Oe);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f29497a, bVar.f29497a) && p013kotlin.jvm.internal.s.f(this.f29498b, bVar.f29498b) && p013kotlin.jvm.internal.s.f(this.f29499c, bVar.f29499c) && p013kotlin.jvm.internal.s.f(this.f29500d, bVar.f29500d) && p013kotlin.jvm.internal.s.f(this.f29501e, bVar.f29501e) && p013kotlin.jvm.internal.s.f(this.f29502f, bVar.f29502f) && p013kotlin.jvm.internal.s.f(this.f29503g, bVar.f29503g) && p013kotlin.jvm.internal.s.f(this.f29504h, bVar.f29504h) && p013kotlin.jvm.internal.s.f(this.f29505i, bVar.f29505i) && this.f29506j == bVar.f29506j && this.f29507k == bVar.f29507k && p013kotlin.jvm.internal.s.f(this.f29508l, bVar.f29508l) && p013kotlin.jvm.internal.s.f(this.f29509m, bVar.f29509m);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3004Wa
        public boolean h() {
            return this.f29507k;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.f29497a.hashCode() * 31) + this.f29498b.hashCode()) * 31) + this.f29499c.hashCode()) * 31) + this.f29500d.hashCode()) * 31) + this.f29501e.hashCode()) * 31) + this.f29502f.hashCode()) * 31;
            QA qa2 = this.f29503g;
            int iHashCode2 = (((((((((((iHashCode + (qa2 == null ? 0 : qa2.hashCode())) * 31) + this.f29504h.hashCode()) * 31) + this.f29505i.hashCode()) * 31) + Boolean.hashCode(this.f29506j)) * 31) + Boolean.hashCode(this.f29507k)) * 31) + this.f29508l.hashCode()) * 31;
            C2916Oe c2916Oe = this.f29509m;
            return iHashCode2 + (c2916Oe != null ? c2916Oe.hashCode() : 0);
        }

        public final QA p() {
            return this.f29501e;
        }

        public final QA q() {
            return this.f29503g;
        }

        public final QA r() {
            return this.f29502f;
        }

        public final InterfaceC3903uh s() {
            return this.f29508l;
        }

        public final C2916Oe t() {
            return this.f29509m;
        }

        public String toString() {
            return "ResultState(stepResults=" + this.f29497a + ", title=" + this.f29498b + ", description=" + this.f29499c + ", image=" + this.f29500d + ", checkpointOne=" + this.f29501e + ", checkpointTwo=" + this.f29502f + ", checkpointThree=" + this.f29503g + ", negativeButtonText=" + this.f29504h + ", positiveButtonText=" + this.f29505i + ", isPositiveButtonInProgress=" + this.f29506j + ", isClearMode=" + this.f29507k + ", enlargeImageSource=" + this.f29508l + ", enlarged=" + this.f29509m + ")";
        }

        public final Bitmap u() {
            return this.f29500d;
        }

        public final QA v() {
            return this.f29504h;
        }

        public final QA w() {
            return this.f29505i;
        }

        public final boolean x() {
            return this.f29506j;
        }

        public static /* synthetic */ b a(b bVar, List list, QA qa2, QA qa3, Bitmap bitmap, QA qa4, QA qa5, QA qa6, QA qa7, QA qa8, boolean z11, boolean z12, InterfaceC3903uh interfaceC3903uh, C2916Oe c2916Oe, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = bVar.f29497a;
            }
            return bVar.a(list, (i11 & 2) != 0 ? bVar.f29498b : qa2, (i11 & 4) != 0 ? bVar.f29499c : qa3, (i11 & 8) != 0 ? bVar.f29500d : bitmap, (i11 & 16) != 0 ? bVar.f29501e : qa4, (i11 & 32) != 0 ? bVar.f29502f : qa5, (i11 & 64) != 0 ? bVar.f29503g : qa6, (i11 & 128) != 0 ? bVar.f29504h : qa7, (i11 & 256) != 0 ? bVar.f29505i : qa8, (i11 & 512) != 0 ? bVar.f29506j : z11, (i11 & 1024) != 0 ? bVar.f29507k : z12, (i11 & 2048) != 0 ? bVar.f29508l : interfaceC3903uh, (i11 & 4096) != 0 ? bVar.f29509m : c2916Oe);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3004Wa
        public QA a() {
            return this.f29498b;
        }

        public /* synthetic */ b(List list, QA qa2, QA qa3, Bitmap bitmap, QA qa4, QA qa5, QA qa6, QA qa7, QA qa8, boolean z11, boolean z12, InterfaceC3903uh interfaceC3903uh, C2916Oe c2916Oe, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list, qa2, qa3, bitmap, qa4, qa5, qa6, qa7, qa8, (i11 & 512) != 0 ? false : z11, (i11 & 1024) != 0 ? false : z12, interfaceC3903uh, (i11 & 4096) != 0 ? null : c2916Oe);
        }
    }

    QA a();

    QA b();

    boolean h();

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Wa$c */
    public interface c extends InterfaceC3004Wa {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Wa$c$a */
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final QA f29510a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TD f29511b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final QA f29512c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f29513d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final QA f29514e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final QA f29515f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final InterfaceC3903uh f29516g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final InterfaceC3903uh f29517h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final InterfaceC3903uh f29518i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final Yj f29519j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private final Yj f29520k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private final boolean f29521l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private final boolean f29522m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Pair f29523n;

            public a(QA title, TD mask, QA description, boolean z11, QA qa2, QA buttonText, InterfaceC3903uh closeImageSource, InterfaceC3903uh shutterDefaultImageSource, InterfaceC3903uh shutterPressedImageSource, Yj yj2, Yj yj3, boolean z12, boolean z13, Pair pair) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(mask, "mask");
                p013kotlin.jvm.internal.s.k(description, "description");
                p013kotlin.jvm.internal.s.k(buttonText, "buttonText");
                p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                p013kotlin.jvm.internal.s.k(shutterDefaultImageSource, "shutterDefaultImageSource");
                p013kotlin.jvm.internal.s.k(shutterPressedImageSource, "shutterPressedImageSource");
                this.f29510a = title;
                this.f29511b = mask;
                this.f29512c = description;
                this.f29513d = z11;
                this.f29514e = qa2;
                this.f29515f = buttonText;
                this.f29516g = closeImageSource;
                this.f29517h = shutterDefaultImageSource;
                this.f29518i = shutterPressedImageSource;
                this.f29519j = yj2;
                this.f29520k = yj3;
                this.f29521l = z12;
                this.f29522m = z13;
                this.f29523n = pair;
            }

            public final a a(QA title, TD mask, QA description, boolean z11, QA qa2, QA buttonText, InterfaceC3903uh closeImageSource, InterfaceC3903uh shutterDefaultImageSource, InterfaceC3903uh shutterPressedImageSource, Yj yj2, Yj yj3, boolean z12, boolean z13, Pair pair) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(mask, "mask");
                p013kotlin.jvm.internal.s.k(description, "description");
                p013kotlin.jvm.internal.s.k(buttonText, "buttonText");
                p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                p013kotlin.jvm.internal.s.k(shutterDefaultImageSource, "shutterDefaultImageSource");
                p013kotlin.jvm.internal.s.k(shutterPressedImageSource, "shutterPressedImageSource");
                return new a(title, mask, description, z11, qa2, buttonText, closeImageSource, shutterDefaultImageSource, shutterPressedImageSource, yj2, yj3, z12, z13, pair);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa
            public QA b() {
                return this.f29512c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public boolean c() {
                return this.f29522m;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public InterfaceC3903uh d() {
                return this.f29516g;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public QA e() {
                return this.f29514e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p013kotlin.jvm.internal.s.f(this.f29510a, aVar.f29510a) && p013kotlin.jvm.internal.s.f(this.f29511b, aVar.f29511b) && p013kotlin.jvm.internal.s.f(this.f29512c, aVar.f29512c) && this.f29513d == aVar.f29513d && p013kotlin.jvm.internal.s.f(this.f29514e, aVar.f29514e) && p013kotlin.jvm.internal.s.f(this.f29515f, aVar.f29515f) && p013kotlin.jvm.internal.s.f(this.f29516g, aVar.f29516g) && p013kotlin.jvm.internal.s.f(this.f29517h, aVar.f29517h) && p013kotlin.jvm.internal.s.f(this.f29518i, aVar.f29518i) && p013kotlin.jvm.internal.s.f(this.f29519j, aVar.f29519j) && p013kotlin.jvm.internal.s.f(this.f29520k, aVar.f29520k) && this.f29521l == aVar.f29521l && this.f29522m == aVar.f29522m && p013kotlin.jvm.internal.s.f(this.f29523n, aVar.f29523n);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public TD getMask() {
                return this.f29511b;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public Pair getProgress() {
                return this.f29523n;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa
            public boolean h() {
                return this.f29513d;
            }

            public int hashCode() {
                int iHashCode = ((((((this.f29510a.hashCode() * 31) + this.f29511b.hashCode()) * 31) + this.f29512c.hashCode()) * 31) + Boolean.hashCode(this.f29513d)) * 31;
                QA qa2 = this.f29514e;
                int iHashCode2 = (((((((((iHashCode + (qa2 == null ? 0 : qa2.hashCode())) * 31) + this.f29515f.hashCode()) * 31) + this.f29516g.hashCode()) * 31) + this.f29517h.hashCode()) * 31) + this.f29518i.hashCode()) * 31;
                Yj yj2 = this.f29519j;
                int iHashCode3 = (iHashCode2 + (yj2 == null ? 0 : yj2.hashCode())) * 31;
                Yj yj3 = this.f29520k;
                int iHashCode4 = (((((iHashCode3 + (yj3 == null ? 0 : yj3.hashCode())) * 31) + Boolean.hashCode(this.f29521l)) * 31) + Boolean.hashCode(this.f29522m)) * 31;
                Pair pair = this.f29523n;
                return iHashCode4 + (pair != null ? pair.hashCode() : 0);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public Yj n() {
                return this.f29519j;
            }

            public final Yj p() {
                return this.f29520k;
            }

            public final InterfaceC3903uh q() {
                return this.f29517h;
            }

            public final InterfaceC3903uh r() {
                return this.f29518i;
            }

            public final boolean s() {
                return this.f29521l;
            }

            public String toString() {
                return "ManualMode(title=" + this.f29510a + ", mask=" + this.f29511b + ", description=" + this.f29512c + ", isClearMode=" + this.f29513d + ", warning=" + this.f29514e + ", buttonText=" + this.f29515f + ", closeImageSource=" + this.f29516g + ", shutterDefaultImageSource=" + this.f29517h + ", shutterPressedImageSource=" + this.f29518i + ", hintLottieSource=" + this.f29519j + ", progressIndicatorSource=" + this.f29520k + ", isTakeSnapshotEnabled=" + this.f29521l + ", isDynamicStepsEnabled=" + this.f29522m + ", progress=" + this.f29523n + ")";
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa
            public QA a() {
                return this.f29510a;
            }
        }

        boolean c();

        InterfaceC3903uh d();

        QA e();

        TD getMask();

        Pair getProgress();

        Yj n();

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Wa$c$b */
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final QA f29524a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TD f29525b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final QA f29526c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final InterfaceC3903uh f29527d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final boolean f29528e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final boolean f29529f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final QA f29530g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Yj f29531h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Pair f29532i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final InterfaceC3903uh f29533j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private final boolean f29534k;

            public b(QA title, TD mask, QA description, InterfaceC3903uh closeImageSource, boolean z11, boolean z12, QA qa2, Yj yj2, Pair pair, InterfaceC3903uh successIcon, boolean z13) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(mask, "mask");
                p013kotlin.jvm.internal.s.k(description, "description");
                p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                p013kotlin.jvm.internal.s.k(successIcon, "successIcon");
                this.f29524a = title;
                this.f29525b = mask;
                this.f29526c = description;
                this.f29527d = closeImageSource;
                this.f29528e = z11;
                this.f29529f = z12;
                this.f29530g = qa2;
                this.f29531h = yj2;
                this.f29532i = pair;
                this.f29533j = successIcon;
                this.f29534k = z13;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa
            public QA a() {
                return this.f29524a;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa
            public QA b() {
                return this.f29526c;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public boolean c() {
                return this.f29529f;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public InterfaceC3903uh d() {
                return this.f29527d;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public QA e() {
                return this.f29530g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p013kotlin.jvm.internal.s.f(this.f29524a, bVar.f29524a) && p013kotlin.jvm.internal.s.f(this.f29525b, bVar.f29525b) && p013kotlin.jvm.internal.s.f(this.f29526c, bVar.f29526c) && p013kotlin.jvm.internal.s.f(this.f29527d, bVar.f29527d) && this.f29528e == bVar.f29528e && this.f29529f == bVar.f29529f && p013kotlin.jvm.internal.s.f(this.f29530g, bVar.f29530g) && p013kotlin.jvm.internal.s.f(this.f29531h, bVar.f29531h) && p013kotlin.jvm.internal.s.f(this.f29532i, bVar.f29532i) && p013kotlin.jvm.internal.s.f(this.f29533j, bVar.f29533j) && this.f29534k == bVar.f29534k;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public TD getMask() {
                return this.f29525b;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public Pair getProgress() {
                return this.f29532i;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa
            public boolean h() {
                return this.f29528e;
            }

            public int hashCode() {
                int iHashCode = ((((((((((this.f29524a.hashCode() * 31) + this.f29525b.hashCode()) * 31) + this.f29526c.hashCode()) * 31) + this.f29527d.hashCode()) * 31) + Boolean.hashCode(this.f29528e)) * 31) + Boolean.hashCode(this.f29529f)) * 31;
                QA qa2 = this.f29530g;
                int iHashCode2 = (iHashCode + (qa2 == null ? 0 : qa2.hashCode())) * 31;
                Yj yj2 = this.f29531h;
                int iHashCode3 = (iHashCode2 + (yj2 == null ? 0 : yj2.hashCode())) * 31;
                Pair pair = this.f29532i;
                return ((((iHashCode3 + (pair != null ? pair.hashCode() : 0)) * 31) + this.f29533j.hashCode()) * 31) + Boolean.hashCode(this.f29534k);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3004Wa.c
            public Yj n() {
                return this.f29531h;
            }

            public final boolean p() {
                return this.f29534k;
            }

            public final InterfaceC3903uh q() {
                return this.f29533j;
            }

            public String toString() {
                return "SuccessMode(title=" + this.f29524a + ", mask=" + this.f29525b + ", description=" + this.f29526c + ", closeImageSource=" + this.f29527d + ", isClearMode=" + this.f29528e + ", isDynamicStepsEnabled=" + this.f29529f + ", warning=" + this.f29530g + ", hintLottieSource=" + this.f29531h + ", progress=" + this.f29532i + ", successIcon=" + this.f29533j + ", displayMask=" + this.f29534k + ")";
            }

            public /* synthetic */ b(QA qa2, TD td2, QA qa3, InterfaceC3903uh interfaceC3903uh, boolean z11, boolean z12, QA qa4, Yj yj2, Pair pair, InterfaceC3903uh interfaceC3903uh2, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(qa2, td2, qa3, interfaceC3903uh, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? null : qa4, (i11 & 128) != 0 ? null : yj2, (i11 & 256) != 0 ? null : pair, interfaceC3903uh2, z13);
            }
        }
    }
}
