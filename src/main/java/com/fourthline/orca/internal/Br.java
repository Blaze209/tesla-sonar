package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Br implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f25114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f25115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f25116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f25117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final QA f25118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final QA f25119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final QA f25120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final QA f25121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3903uh f25122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C2916Oe f25123j;

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Br$a$a, reason: collision with other inner class name */
        public static final class C0476a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Yj f25124a;

            public C0476a(Yj lottieSource) {
                p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
                this.f25124a = lottieSource;
            }

            public final Yj a() {
                return this.f25124a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0476a) && p013kotlin.jvm.internal.s.f(this.f25124a, ((C0476a) obj).f25124a);
            }

            public int hashCode() {
                return this.f25124a.hashCode();
            }

            public String toString() {
                return "Animation(lottieSource=" + this.f25124a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Bitmap f25125a;

            public b(Bitmap bitmap) {
                p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
                this.f25125a = bitmap;
            }

            public final Bitmap a() {
                return this.f25125a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25125a, ((b) obj).f25125a);
            }

            public int hashCode() {
                return this.f25125a.hashCode();
            }

            public String toString() {
                return "Image(bitmap=" + this.f25125a + ")";
            }
        }
    }

    public Br(QA title, QA description, a preview, QA checkpointOne, QA checkpointTwo, QA checkpointThree, QA negativeButtonText, QA positiveButtonText, InterfaceC3903uh enlargeImageSource, C2916Oe c2916Oe) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(preview, "preview");
        p013kotlin.jvm.internal.s.k(checkpointOne, "checkpointOne");
        p013kotlin.jvm.internal.s.k(checkpointTwo, "checkpointTwo");
        p013kotlin.jvm.internal.s.k(checkpointThree, "checkpointThree");
        p013kotlin.jvm.internal.s.k(negativeButtonText, "negativeButtonText");
        p013kotlin.jvm.internal.s.k(positiveButtonText, "positiveButtonText");
        p013kotlin.jvm.internal.s.k(enlargeImageSource, "enlargeImageSource");
        this.f25114a = title;
        this.f25115b = description;
        this.f25116c = preview;
        this.f25117d = checkpointOne;
        this.f25118e = checkpointTwo;
        this.f25119f = checkpointThree;
        this.f25120g = negativeButtonText;
        this.f25121h = positiveButtonText;
        this.f25122i = enlargeImageSource;
        this.f25123j = c2916Oe;
    }

    public final Br a(QA title, QA description, a preview, QA checkpointOne, QA checkpointTwo, QA checkpointThree, QA negativeButtonText, QA positiveButtonText, InterfaceC3903uh enlargeImageSource, C2916Oe c2916Oe) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(preview, "preview");
        p013kotlin.jvm.internal.s.k(checkpointOne, "checkpointOne");
        p013kotlin.jvm.internal.s.k(checkpointTwo, "checkpointTwo");
        p013kotlin.jvm.internal.s.k(checkpointThree, "checkpointThree");
        p013kotlin.jvm.internal.s.k(negativeButtonText, "negativeButtonText");
        p013kotlin.jvm.internal.s.k(positiveButtonText, "positiveButtonText");
        p013kotlin.jvm.internal.s.k(enlargeImageSource, "enlargeImageSource");
        return new Br(title, description, preview, checkpointOne, checkpointTwo, checkpointThree, negativeButtonText, positiveButtonText, enlargeImageSource, c2916Oe);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Br)) {
            return false;
        }
        Br br2 = (Br) obj;
        return p013kotlin.jvm.internal.s.f(this.f25114a, br2.f25114a) && p013kotlin.jvm.internal.s.f(this.f25115b, br2.f25115b) && p013kotlin.jvm.internal.s.f(this.f25116c, br2.f25116c) && p013kotlin.jvm.internal.s.f(this.f25117d, br2.f25117d) && p013kotlin.jvm.internal.s.f(this.f25118e, br2.f25118e) && p013kotlin.jvm.internal.s.f(this.f25119f, br2.f25119f) && p013kotlin.jvm.internal.s.f(this.f25120g, br2.f25120g) && p013kotlin.jvm.internal.s.f(this.f25121h, br2.f25121h) && p013kotlin.jvm.internal.s.f(this.f25122i, br2.f25122i) && p013kotlin.jvm.internal.s.f(this.f25123j, br2.f25123j);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f25114a.hashCode() * 31) + this.f25115b.hashCode()) * 31) + this.f25116c.hashCode()) * 31) + this.f25117d.hashCode()) * 31) + this.f25118e.hashCode()) * 31) + this.f25119f.hashCode()) * 31) + this.f25120g.hashCode()) * 31) + this.f25121h.hashCode()) * 31) + this.f25122i.hashCode()) * 31;
        C2916Oe c2916Oe = this.f25123j;
        return iHashCode + (c2916Oe == null ? 0 : c2916Oe.hashCode());
    }

    public final QA p() {
        return this.f25117d;
    }

    public final QA q() {
        return this.f25119f;
    }

    public final QA r() {
        return this.f25118e;
    }

    public final InterfaceC3903uh s() {
        return this.f25122i;
    }

    public final C2916Oe t() {
        return this.f25123j;
    }

    public String toString() {
        return "State(title=" + this.f25114a + ", description=" + this.f25115b + ", preview=" + this.f25116c + ", checkpointOne=" + this.f25117d + ", checkpointTwo=" + this.f25118e + ", checkpointThree=" + this.f25119f + ", negativeButtonText=" + this.f25120g + ", positiveButtonText=" + this.f25121h + ", enlargeImageSource=" + this.f25122i + ", enlarged=" + this.f25123j + ")";
    }

    public final QA u() {
        return this.f25120g;
    }

    public final QA v() {
        return this.f25121h;
    }

    public final a w() {
        return this.f25116c;
    }

    public static /* synthetic */ Br a(Br br2, QA qa2, QA qa3, a aVar, QA qa4, QA qa5, QA qa6, QA qa7, QA qa8, InterfaceC3903uh interfaceC3903uh, C2916Oe c2916Oe, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = br2.f25114a;
        }
        if ((i11 & 2) != 0) {
            qa3 = br2.f25115b;
        }
        if ((i11 & 4) != 0) {
            aVar = br2.f25116c;
        }
        if ((i11 & 8) != 0) {
            qa4 = br2.f25117d;
        }
        if ((i11 & 16) != 0) {
            qa5 = br2.f25118e;
        }
        if ((i11 & 32) != 0) {
            qa6 = br2.f25119f;
        }
        if ((i11 & 64) != 0) {
            qa7 = br2.f25120g;
        }
        if ((i11 & 128) != 0) {
            qa8 = br2.f25121h;
        }
        if ((i11 & 256) != 0) {
            interfaceC3903uh = br2.f25122i;
        }
        if ((i11 & 512) != 0) {
            c2916Oe = br2.f25123j;
        }
        InterfaceC3903uh interfaceC3903uh2 = interfaceC3903uh;
        C2916Oe c2916Oe2 = c2916Oe;
        QA qa9 = qa7;
        QA qa10 = qa8;
        QA qa11 = qa5;
        QA qa12 = qa6;
        return br2.a(qa2, qa3, aVar, qa4, qa11, qa12, qa9, qa10, interfaceC3903uh2, c2916Oe2);
    }

    public final QA a() {
        return this.f25114a;
    }

    public /* synthetic */ Br(QA qa2, QA qa3, a aVar, QA qa4, QA qa5, QA qa6, QA qa7, QA qa8, InterfaceC3903uh interfaceC3903uh, C2916Oe c2916Oe, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qa2, qa3, aVar, qa4, qa5, qa6, qa7, qa8, interfaceC3903uh, (i11 & 512) != 0 ? null : c2916Oe);
    }
}
