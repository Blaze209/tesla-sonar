package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3491ky extends QD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$a */
    public interface a extends InterfaceC3491ky {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$a$a, reason: collision with other inner class name */
        public static final class C0572a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final QA f33113a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final QA f33114b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Bitmap f33115c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final QA f33116d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final QA f33117e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final QA f33118f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final QA f33119g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final QA f33120h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final C2916Oe f33121i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final InterfaceC3903uh f33122j;

            public C0572a(QA title, QA description, Bitmap image, QA negativeButtonText, QA checkpointOne, QA checkpointTwo, QA checkpointThree, QA positiveButtonText, C2916Oe c2916Oe, InterfaceC3903uh enlargeImageSource) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(description, "description");
                p013kotlin.jvm.internal.s.k(image, "image");
                p013kotlin.jvm.internal.s.k(negativeButtonText, "negativeButtonText");
                p013kotlin.jvm.internal.s.k(checkpointOne, "checkpointOne");
                p013kotlin.jvm.internal.s.k(checkpointTwo, "checkpointTwo");
                p013kotlin.jvm.internal.s.k(checkpointThree, "checkpointThree");
                p013kotlin.jvm.internal.s.k(positiveButtonText, "positiveButtonText");
                p013kotlin.jvm.internal.s.k(enlargeImageSource, "enlargeImageSource");
                this.f33113a = title;
                this.f33114b = description;
                this.f33115c = image;
                this.f33116d = negativeButtonText;
                this.f33117e = checkpointOne;
                this.f33118f = checkpointTwo;
                this.f33119g = checkpointThree;
                this.f33120h = positiveButtonText;
                this.f33121i = c2916Oe;
                this.f33122j = enlargeImageSource;
            }

            public final C0572a a(QA title, QA description, Bitmap image, QA negativeButtonText, QA checkpointOne, QA checkpointTwo, QA checkpointThree, QA positiveButtonText, C2916Oe c2916Oe, InterfaceC3903uh enlargeImageSource) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(description, "description");
                p013kotlin.jvm.internal.s.k(image, "image");
                p013kotlin.jvm.internal.s.k(negativeButtonText, "negativeButtonText");
                p013kotlin.jvm.internal.s.k(checkpointOne, "checkpointOne");
                p013kotlin.jvm.internal.s.k(checkpointTwo, "checkpointTwo");
                p013kotlin.jvm.internal.s.k(checkpointThree, "checkpointThree");
                p013kotlin.jvm.internal.s.k(positiveButtonText, "positiveButtonText");
                p013kotlin.jvm.internal.s.k(enlargeImageSource, "enlargeImageSource");
                return new C0572a(title, description, image, negativeButtonText, checkpointOne, checkpointTwo, checkpointThree, positiveButtonText, c2916Oe, enlargeImageSource);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0572a)) {
                    return false;
                }
                C0572a c0572a = (C0572a) obj;
                return p013kotlin.jvm.internal.s.f(this.f33113a, c0572a.f33113a) && p013kotlin.jvm.internal.s.f(this.f33114b, c0572a.f33114b) && p013kotlin.jvm.internal.s.f(this.f33115c, c0572a.f33115c) && p013kotlin.jvm.internal.s.f(this.f33116d, c0572a.f33116d) && p013kotlin.jvm.internal.s.f(this.f33117e, c0572a.f33117e) && p013kotlin.jvm.internal.s.f(this.f33118f, c0572a.f33118f) && p013kotlin.jvm.internal.s.f(this.f33119g, c0572a.f33119g) && p013kotlin.jvm.internal.s.f(this.f33120h, c0572a.f33120h) && p013kotlin.jvm.internal.s.f(this.f33121i, c0572a.f33121i) && p013kotlin.jvm.internal.s.f(this.f33122j, c0572a.f33122j);
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((this.f33113a.hashCode() * 31) + this.f33114b.hashCode()) * 31) + this.f33115c.hashCode()) * 31) + this.f33116d.hashCode()) * 31) + this.f33117e.hashCode()) * 31) + this.f33118f.hashCode()) * 31) + this.f33119g.hashCode()) * 31) + this.f33120h.hashCode()) * 31;
                C2916Oe c2916Oe = this.f33121i;
                return ((iHashCode + (c2916Oe == null ? 0 : c2916Oe.hashCode())) * 31) + this.f33122j.hashCode();
            }

            public final QA p() {
                return this.f33117e;
            }

            public final QA q() {
                return this.f33119g;
            }

            public final QA r() {
                return this.f33118f;
            }

            public final InterfaceC3903uh s() {
                return this.f33122j;
            }

            public final C2916Oe t() {
                return this.f33121i;
            }

            public String toString() {
                return "ConfirmState(title=" + this.f33113a + ", description=" + this.f33114b + ", image=" + this.f33115c + ", negativeButtonText=" + this.f33116d + ", checkpointOne=" + this.f33117e + ", checkpointTwo=" + this.f33118f + ", checkpointThree=" + this.f33119g + ", positiveButtonText=" + this.f33120h + ", enlarged=" + this.f33121i + ", enlargeImageSource=" + this.f33122j + ")";
            }

            public final Bitmap u() {
                return this.f33115c;
            }

            public final QA v() {
                return this.f33116d;
            }

            public final QA w() {
                return this.f33120h;
            }

            public static /* synthetic */ C0572a a(C0572a c0572a, QA qa2, QA qa3, Bitmap bitmap, QA qa4, QA qa5, QA qa6, QA qa7, QA qa8, C2916Oe c2916Oe, InterfaceC3903uh interfaceC3903uh, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    qa2 = c0572a.f33113a;
                }
                if ((i11 & 2) != 0) {
                    qa3 = c0572a.f33114b;
                }
                if ((i11 & 4) != 0) {
                    bitmap = c0572a.f33115c;
                }
                if ((i11 & 8) != 0) {
                    qa4 = c0572a.f33116d;
                }
                if ((i11 & 16) != 0) {
                    qa5 = c0572a.f33117e;
                }
                if ((i11 & 32) != 0) {
                    qa6 = c0572a.f33118f;
                }
                if ((i11 & 64) != 0) {
                    qa7 = c0572a.f33119g;
                }
                if ((i11 & 128) != 0) {
                    qa8 = c0572a.f33120h;
                }
                if ((i11 & 256) != 0) {
                    c2916Oe = c0572a.f33121i;
                }
                if ((i11 & 512) != 0) {
                    interfaceC3903uh = c0572a.f33122j;
                }
                C2916Oe c2916Oe2 = c2916Oe;
                InterfaceC3903uh interfaceC3903uh2 = interfaceC3903uh;
                QA qa9 = qa7;
                QA qa10 = qa8;
                QA qa11 = qa5;
                QA qa12 = qa6;
                return c0572a.a(qa2, qa3, bitmap, qa4, qa11, qa12, qa9, qa10, c2916Oe2, interfaceC3903uh2);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky
            public QA a() {
                return this.f33113a;
            }

            public /* synthetic */ C0572a(QA qa2, QA qa3, Bitmap bitmap, QA qa4, QA qa5, QA qa6, QA qa7, QA qa8, C2916Oe c2916Oe, InterfaceC3903uh interfaceC3903uh, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(qa2, qa3, bitmap, qa4, qa5, qa6, qa7, qa8, (i11 & 256) != 0 ? null : c2916Oe, interfaceC3903uh);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final QA f33123a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final QA f33124b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Bitmap f33125c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f33126d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Yj f33127e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final InterfaceC3903uh f33128f;

            public b(QA title, QA description, Bitmap image, int i11, Yj loadingSpinnerLottieSource, InterfaceC3903uh closeImageSource) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(description, "description");
                p013kotlin.jvm.internal.s.k(image, "image");
                p013kotlin.jvm.internal.s.k(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
                p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                this.f33123a = title;
                this.f33124b = description;
                this.f33125c = image;
                this.f33126d = i11;
                this.f33127e = loadingSpinnerLottieSource;
                this.f33128f = closeImageSource;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky
            public QA a() {
                return this.f33123a;
            }

            public QA b() {
                return this.f33124b;
            }

            public final InterfaceC3903uh d() {
                return this.f33128f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p013kotlin.jvm.internal.s.f(this.f33123a, bVar.f33123a) && p013kotlin.jvm.internal.s.f(this.f33124b, bVar.f33124b) && p013kotlin.jvm.internal.s.f(this.f33125c, bVar.f33125c) && this.f33126d == bVar.f33126d && p013kotlin.jvm.internal.s.f(this.f33127e, bVar.f33127e) && p013kotlin.jvm.internal.s.f(this.f33128f, bVar.f33128f);
            }

            public int hashCode() {
                return (((((((((this.f33123a.hashCode() * 31) + this.f33124b.hashCode()) * 31) + this.f33125c.hashCode()) * 31) + Integer.hashCode(this.f33126d)) * 31) + this.f33127e.hashCode()) * 31) + this.f33128f.hashCode();
            }

            public final Bitmap p() {
                return this.f33125c;
            }

            public final int q() {
                return this.f33126d;
            }

            public final Yj r() {
                return this.f33127e;
            }

            public String toString() {
                return "UploadState(title=" + this.f33123a + ", description=" + this.f33124b + ", image=" + this.f33125c + ", imageRotationAngle=" + this.f33126d + ", loadingSpinnerLottieSource=" + this.f33127e + ", closeImageSource=" + this.f33128f + ")";
            }
        }
    }

    QA a();

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$b */
    public interface b extends InterfaceC3491ky {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final QA f33129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Yj f33130b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final TD f33131c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final InterfaceC3903uh f33132d;

            public a(QA title, Yj lottieSource, TD td2, InterfaceC3903uh closeImageSource) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
                p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                this.f33129a = title;
                this.f33130b = lottieSource;
                this.f33131c = td2;
                this.f33132d = closeImageSource;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky
            public QA a() {
                return this.f33129a;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
            public InterfaceC3903uh d() {
                return this.f33132d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p013kotlin.jvm.internal.s.f(this.f33129a, aVar.f33129a) && p013kotlin.jvm.internal.s.f(this.f33130b, aVar.f33130b) && p013kotlin.jvm.internal.s.f(this.f33131c, aVar.f33131c) && p013kotlin.jvm.internal.s.f(this.f33132d, aVar.f33132d);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
            public TD getMask() {
                return this.f33131c;
            }

            public int hashCode() {
                int iHashCode = ((this.f33129a.hashCode() * 31) + this.f33130b.hashCode()) * 31;
                TD td2 = this.f33131c;
                return ((iHashCode + (td2 == null ? 0 : td2.hashCode())) * 31) + this.f33132d.hashCode();
            }

            public final Yj p() {
                return this.f33130b;
            }

            public String toString() {
                return "LivenessMode(title=" + this.f33129a + ", lottieSource=" + this.f33130b + ", mask=" + this.f33131c + ", closeImageSource=" + this.f33132d + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$b$b, reason: collision with other inner class name */
        public interface InterfaceC0573b extends b {

            /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$b$b$a */
            public static final class a implements InterfaceC0573b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final QA f33133a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final TD f33134b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final InterfaceC3903uh f33135c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private final InterfaceC3903uh f33136d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private final InterfaceC3903uh f33137e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private final InterfaceC3903uh f33138f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private final Integer f33139g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private final Integer f33140h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private final Float f33141i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private final Float f33142j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private final Pair f33143k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private final Yj f33144l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private final Pair f33145m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final InterfaceC3903uh f33146n;

                public a(QA title, TD mask, InterfaceC3903uh maskCircleImageSource, InterfaceC3903uh baseGradesImageSource, InterfaceC3903uh targetDirectionGradesImageSource, InterfaceC3903uh currentDirectionGradesImageSource, Integer num, Integer num2, Float f11, Float f12, Pair stepsProgress, Yj lottieSource, Pair pair, InterfaceC3903uh closeImageSource) {
                    p013kotlin.jvm.internal.s.k(title, "title");
                    p013kotlin.jvm.internal.s.k(mask, "mask");
                    p013kotlin.jvm.internal.s.k(maskCircleImageSource, "maskCircleImageSource");
                    p013kotlin.jvm.internal.s.k(baseGradesImageSource, "baseGradesImageSource");
                    p013kotlin.jvm.internal.s.k(targetDirectionGradesImageSource, "targetDirectionGradesImageSource");
                    p013kotlin.jvm.internal.s.k(currentDirectionGradesImageSource, "currentDirectionGradesImageSource");
                    p013kotlin.jvm.internal.s.k(stepsProgress, "stepsProgress");
                    p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
                    p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                    this.f33133a = title;
                    this.f33134b = mask;
                    this.f33135c = maskCircleImageSource;
                    this.f33136d = baseGradesImageSource;
                    this.f33137e = targetDirectionGradesImageSource;
                    this.f33138f = currentDirectionGradesImageSource;
                    this.f33139g = num;
                    this.f33140h = num2;
                    this.f33141i = f11;
                    this.f33142j = f12;
                    this.f33143k = stepsProgress;
                    this.f33144l = lottieSource;
                    this.f33145m = pair;
                    this.f33146n = closeImageSource;
                }

                public final a a(QA title, TD mask, InterfaceC3903uh maskCircleImageSource, InterfaceC3903uh baseGradesImageSource, InterfaceC3903uh targetDirectionGradesImageSource, InterfaceC3903uh currentDirectionGradesImageSource, Integer num, Integer num2, Float f11, Float f12, Pair stepsProgress, Yj lottieSource, Pair pair, InterfaceC3903uh closeImageSource) {
                    p013kotlin.jvm.internal.s.k(title, "title");
                    p013kotlin.jvm.internal.s.k(mask, "mask");
                    p013kotlin.jvm.internal.s.k(maskCircleImageSource, "maskCircleImageSource");
                    p013kotlin.jvm.internal.s.k(baseGradesImageSource, "baseGradesImageSource");
                    p013kotlin.jvm.internal.s.k(targetDirectionGradesImageSource, "targetDirectionGradesImageSource");
                    p013kotlin.jvm.internal.s.k(currentDirectionGradesImageSource, "currentDirectionGradesImageSource");
                    p013kotlin.jvm.internal.s.k(stepsProgress, "stepsProgress");
                    p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
                    p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                    return new a(title, mask, maskCircleImageSource, baseGradesImageSource, targetDirectionGradesImageSource, currentDirectionGradesImageSource, num, num2, f11, f12, stepsProgress, lottieSource, pair, closeImageSource);
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
                public InterfaceC3903uh d() {
                    return this.f33146n;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return p013kotlin.jvm.internal.s.f(this.f33133a, aVar.f33133a) && p013kotlin.jvm.internal.s.f(this.f33134b, aVar.f33134b) && p013kotlin.jvm.internal.s.f(this.f33135c, aVar.f33135c) && p013kotlin.jvm.internal.s.f(this.f33136d, aVar.f33136d) && p013kotlin.jvm.internal.s.f(this.f33137e, aVar.f33137e) && p013kotlin.jvm.internal.s.f(this.f33138f, aVar.f33138f) && p013kotlin.jvm.internal.s.f(this.f33139g, aVar.f33139g) && p013kotlin.jvm.internal.s.f(this.f33140h, aVar.f33140h) && p013kotlin.jvm.internal.s.f(this.f33141i, aVar.f33141i) && p013kotlin.jvm.internal.s.f(this.f33142j, aVar.f33142j) && p013kotlin.jvm.internal.s.f(this.f33143k, aVar.f33143k) && p013kotlin.jvm.internal.s.f(this.f33144l, aVar.f33144l) && p013kotlin.jvm.internal.s.f(this.f33145m, aVar.f33145m) && p013kotlin.jvm.internal.s.f(this.f33146n, aVar.f33146n);
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public Integer f() {
                    return this.f33139g;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b, com.fourthline.orca.internal.InterfaceC3491ky.b
                public TD getMask() {
                    return this.f33134b;
                }

                public int hashCode() {
                    int iHashCode = ((((((((((this.f33133a.hashCode() * 31) + this.f33134b.hashCode()) * 31) + this.f33135c.hashCode()) * 31) + this.f33136d.hashCode()) * 31) + this.f33137e.hashCode()) * 31) + this.f33138f.hashCode()) * 31;
                    Integer num = this.f33139g;
                    int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.f33140h;
                    int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Float f11 = this.f33141i;
                    int iHashCode4 = (iHashCode3 + (f11 == null ? 0 : f11.hashCode())) * 31;
                    Float f12 = this.f33142j;
                    int iHashCode5 = (((((iHashCode4 + (f12 == null ? 0 : f12.hashCode())) * 31) + this.f33143k.hashCode()) * 31) + this.f33144l.hashCode()) * 31;
                    Pair pair = this.f33145m;
                    return ((iHashCode5 + (pair != null ? pair.hashCode() : 0)) * 31) + this.f33146n.hashCode();
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public InterfaceC3903uh i() {
                    return this.f33137e;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public InterfaceC3903uh j() {
                    return this.f33138f;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public InterfaceC3903uh k() {
                    return this.f33135c;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public InterfaceC3903uh l() {
                    return this.f33136d;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public Integer m() {
                    return this.f33140h;
                }

                public final Pair p() {
                    return this.f33145m;
                }

                public final Yj q() {
                    return this.f33144l;
                }

                public final Float r() {
                    return this.f33142j;
                }

                public final Pair s() {
                    return this.f33143k;
                }

                public final Float t() {
                    return this.f33141i;
                }

                public String toString() {
                    return "Scanning(title=" + this.f33133a + ", mask=" + this.f33134b + ", maskCircleImageSource=" + this.f33135c + ", baseGradesImageSource=" + this.f33136d + ", targetDirectionGradesImageSource=" + this.f33137e + ", currentDirectionGradesImageSource=" + this.f33138f + ", targetRotation=" + this.f33139g + ", currentRotation=" + this.f33140h + ", yaw=" + this.f33141i + ", pitch=" + this.f33142j + ", stepsProgress=" + this.f33143k + ", lottieSource=" + this.f33144l + ", lottieFrames=" + this.f33145m + ", closeImageSource=" + this.f33146n + ")";
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky
                public QA a() {
                    return this.f33133a;
                }

                public /* synthetic */ a(QA qa2, TD td2, InterfaceC3903uh interfaceC3903uh, InterfaceC3903uh interfaceC3903uh2, InterfaceC3903uh interfaceC3903uh3, InterfaceC3903uh interfaceC3903uh4, Integer num, Integer num2, Float f11, Float f12, Pair pair, Yj yj2, Pair pair2, InterfaceC3903uh interfaceC3903uh5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(qa2, td2, interfaceC3903uh, interfaceC3903uh2, interfaceC3903uh3, interfaceC3903uh4, num, (i11 & 128) != 0 ? null : num2, (i11 & 256) != 0 ? null : f11, (i11 & 512) != 0 ? null : f12, pair, yj2, (i11 & 4096) != 0 ? null : pair2, interfaceC3903uh5);
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$b$b$b, reason: collision with other inner class name */
            public static final class C0574b implements InterfaceC0573b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final QA f33147a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final TD f33148b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final InterfaceC3903uh f33149c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private final InterfaceC3903uh f33150d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private final InterfaceC3903uh f33151e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private final InterfaceC3903uh f33152f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private final Pair f33153g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private final InterfaceC3903uh f33154h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private final int f33155i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private final InterfaceC3903uh f33156j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private final int f33157k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private final int f33158l;

                public C0574b(QA title, TD mask, InterfaceC3903uh maskCircleImageSource, InterfaceC3903uh baseGradesImageSource, InterfaceC3903uh targetDirectionGradesImageSource, InterfaceC3903uh currentDirectionGradesImageSource, Pair pair, InterfaceC3903uh interfaceC3903uh, int i11, InterfaceC3903uh closeImageSource) {
                    p013kotlin.jvm.internal.s.k(title, "title");
                    p013kotlin.jvm.internal.s.k(mask, "mask");
                    p013kotlin.jvm.internal.s.k(maskCircleImageSource, "maskCircleImageSource");
                    p013kotlin.jvm.internal.s.k(baseGradesImageSource, "baseGradesImageSource");
                    p013kotlin.jvm.internal.s.k(targetDirectionGradesImageSource, "targetDirectionGradesImageSource");
                    p013kotlin.jvm.internal.s.k(currentDirectionGradesImageSource, "currentDirectionGradesImageSource");
                    p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                    this.f33147a = title;
                    this.f33148b = mask;
                    this.f33149c = maskCircleImageSource;
                    this.f33150d = baseGradesImageSource;
                    this.f33151e = targetDirectionGradesImageSource;
                    this.f33152f = currentDirectionGradesImageSource;
                    this.f33153g = pair;
                    this.f33154h = interfaceC3903uh;
                    this.f33155i = i11;
                    this.f33156j = closeImageSource;
                    this.f33157k = i11;
                    this.f33158l = i11;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky
                public QA a() {
                    return this.f33147a;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
                public InterfaceC3903uh d() {
                    return this.f33156j;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0574b)) {
                        return false;
                    }
                    C0574b c0574b = (C0574b) obj;
                    return p013kotlin.jvm.internal.s.f(this.f33147a, c0574b.f33147a) && p013kotlin.jvm.internal.s.f(this.f33148b, c0574b.f33148b) && p013kotlin.jvm.internal.s.f(this.f33149c, c0574b.f33149c) && p013kotlin.jvm.internal.s.f(this.f33150d, c0574b.f33150d) && p013kotlin.jvm.internal.s.f(this.f33151e, c0574b.f33151e) && p013kotlin.jvm.internal.s.f(this.f33152f, c0574b.f33152f) && p013kotlin.jvm.internal.s.f(this.f33153g, c0574b.f33153g) && p013kotlin.jvm.internal.s.f(this.f33154h, c0574b.f33154h) && this.f33155i == c0574b.f33155i && p013kotlin.jvm.internal.s.f(this.f33156j, c0574b.f33156j);
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public Integer f() {
                    return Integer.valueOf(this.f33157k);
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b, com.fourthline.orca.internal.InterfaceC3491ky.b
                public TD getMask() {
                    return this.f33148b;
                }

                public int hashCode() {
                    int iHashCode = ((((((((((this.f33147a.hashCode() * 31) + this.f33148b.hashCode()) * 31) + this.f33149c.hashCode()) * 31) + this.f33150d.hashCode()) * 31) + this.f33151e.hashCode()) * 31) + this.f33152f.hashCode()) * 31;
                    Pair pair = this.f33153g;
                    int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
                    InterfaceC3903uh interfaceC3903uh = this.f33154h;
                    return ((((iHashCode2 + (interfaceC3903uh != null ? interfaceC3903uh.hashCode() : 0)) * 31) + Integer.hashCode(this.f33155i)) * 31) + this.f33156j.hashCode();
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public InterfaceC3903uh i() {
                    return this.f33151e;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public InterfaceC3903uh j() {
                    return this.f33152f;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public InterfaceC3903uh k() {
                    return this.f33149c;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public InterfaceC3903uh l() {
                    return this.f33150d;
                }

                @Override // com.fourthline.orca.internal.InterfaceC3491ky.b.InterfaceC0573b
                public Integer m() {
                    return Integer.valueOf(this.f33158l);
                }

                public final Pair p() {
                    return this.f33153g;
                }

                public final InterfaceC3903uh q() {
                    return this.f33154h;
                }

                public String toString() {
                    return "Success(title=" + this.f33147a + ", mask=" + this.f33148b + ", maskCircleImageSource=" + this.f33149c + ", baseGradesImageSource=" + this.f33150d + ", targetDirectionGradesImageSource=" + this.f33151e + ", currentDirectionGradesImageSource=" + this.f33152f + ", stepsProgress=" + this.f33153g + ", successIcon=" + this.f33154h + ", successRotation=" + this.f33155i + ", closeImageSource=" + this.f33156j + ")";
                }
            }

            Integer f();

            @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
            TD getMask();

            InterfaceC3903uh i();

            InterfaceC3903uh j();

            InterfaceC3903uh k();

            InterfaceC3903uh l();

            Integer m();
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$b$c */
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final QA f33159a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TD f33160b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final InterfaceC3903uh f33161c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Yj f33162d;

            public c(QA title, TD mask, InterfaceC3903uh closeImageSource, Yj loadingSpinnerLottieSource) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(mask, "mask");
                p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                p013kotlin.jvm.internal.s.k(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
                this.f33159a = title;
                this.f33160b = mask;
                this.f33161c = closeImageSource;
                this.f33162d = loadingSpinnerLottieSource;
            }

            public final c a(QA title, TD mask, InterfaceC3903uh closeImageSource, Yj loadingSpinnerLottieSource) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(mask, "mask");
                p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                p013kotlin.jvm.internal.s.k(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
                return new c(title, mask, closeImageSource, loadingSpinnerLottieSource);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
            public InterfaceC3903uh d() {
                return this.f33161c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p013kotlin.jvm.internal.s.f(this.f33159a, cVar.f33159a) && p013kotlin.jvm.internal.s.f(this.f33160b, cVar.f33160b) && p013kotlin.jvm.internal.s.f(this.f33161c, cVar.f33161c) && p013kotlin.jvm.internal.s.f(this.f33162d, cVar.f33162d);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
            public TD getMask() {
                return this.f33160b;
            }

            public int hashCode() {
                return (((((this.f33159a.hashCode() * 31) + this.f33160b.hashCode()) * 31) + this.f33161c.hashCode()) * 31) + this.f33162d.hashCode();
            }

            public final Yj p() {
                return this.f33162d;
            }

            public String toString() {
                return "ScanningMode(title=" + this.f33159a + ", mask=" + this.f33160b + ", closeImageSource=" + this.f33161c + ", loadingSpinnerLottieSource=" + this.f33162d + ")";
            }

            public static /* synthetic */ c a(c cVar, QA qa2, TD td2, InterfaceC3903uh interfaceC3903uh, Yj yj2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    qa2 = cVar.f33159a;
                }
                if ((i11 & 2) != 0) {
                    td2 = cVar.f33160b;
                }
                if ((i11 & 4) != 0) {
                    interfaceC3903uh = cVar.f33161c;
                }
                if ((i11 & 8) != 0) {
                    yj2 = cVar.f33162d;
                }
                return cVar.a(qa2, td2, interfaceC3903uh, yj2);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky
            public QA a() {
                return this.f33159a;
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$b$d */
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final QA f33163a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TD f33164b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final InterfaceC3903uh f33165c;

            public d(QA title, TD mask, InterfaceC3903uh closeImageSource) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(mask, "mask");
                p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                this.f33163a = title;
                this.f33164b = mask;
                this.f33165c = closeImageSource;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky
            public QA a() {
                return this.f33163a;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
            public InterfaceC3903uh d() {
                return this.f33165c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p013kotlin.jvm.internal.s.f(this.f33163a, dVar.f33163a) && p013kotlin.jvm.internal.s.f(this.f33164b, dVar.f33164b) && p013kotlin.jvm.internal.s.f(this.f33165c, dVar.f33165c);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
            public TD getMask() {
                return this.f33164b;
            }

            public int hashCode() {
                return (((this.f33163a.hashCode() * 31) + this.f33164b.hashCode()) * 31) + this.f33165c.hashCode();
            }

            public String toString() {
                return "SuccessMode(title=" + this.f33163a + ", mask=" + this.f33164b + ", closeImageSource=" + this.f33165c + ")";
            }
        }

        InterfaceC3903uh d();

        TD getMask();

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ky$b$e */
        public static final class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final QA f33166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TD f33167b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final InterfaceC3903uh f33168c;

            public e(QA title, TD td2, InterfaceC3903uh closeImageSource) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
                this.f33166a = title;
                this.f33167b = td2;
                this.f33168c = closeImageSource;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky
            public QA a() {
                return this.f33166a;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
            public InterfaceC3903uh d() {
                return this.f33168c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return p013kotlin.jvm.internal.s.f(this.f33166a, eVar.f33166a) && p013kotlin.jvm.internal.s.f(this.f33167b, eVar.f33167b) && p013kotlin.jvm.internal.s.f(this.f33168c, eVar.f33168c);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3491ky.b
            public TD getMask() {
                return this.f33167b;
            }

            public int hashCode() {
                int iHashCode = this.f33166a.hashCode() * 31;
                TD td2 = this.f33167b;
                return ((iHashCode + (td2 == null ? 0 : td2.hashCode())) * 31) + this.f33168c.hashCode();
            }

            public String toString() {
                return "Transition(title=" + this.f33166a + ", mask=" + this.f33167b + ", closeImageSource=" + this.f33168c + ")";
            }

            public /* synthetic */ e(QA qa2, TD td2, InterfaceC3903uh interfaceC3903uh, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? QA.b.f27435b : qa2, (i11 & 2) != 0 ? null : td2, interfaceC3903uh);
            }
        }
    }
}
