package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4001ws {
    QA a();

    QA b();

    InterfaceC3807sD c();

    InterfaceC3807sD d();

    boolean e();

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ws$b */
    public static final class b implements InterfaceC4001ws {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f36552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Yj f36553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f36554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f36555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC3807sD f36556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InterfaceC3807sD f36557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f36558g;

        public b(QA title, Yj lottieSource, QA description, List bulletPoints, InterfaceC3807sD primaryButtonIntent, InterfaceC3807sD interfaceC3807sD, boolean z11) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(bulletPoints, "bulletPoints");
            p013kotlin.jvm.internal.s.k(primaryButtonIntent, "primaryButtonIntent");
            this.f36552a = title;
            this.f36553b = lottieSource;
            this.f36554c = description;
            this.f36555d = bulletPoints;
            this.f36556e = primaryButtonIntent;
            this.f36557f = interfaceC3807sD;
            this.f36558g = z11;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA a() {
            return this.f36552a;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA b() {
            return this.f36554c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD c() {
            return this.f36557f;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD d() {
            return this.f36556e;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public boolean e() {
            return this.f36558g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f36552a, bVar.f36552a) && p013kotlin.jvm.internal.s.f(this.f36553b, bVar.f36553b) && p013kotlin.jvm.internal.s.f(this.f36554c, bVar.f36554c) && p013kotlin.jvm.internal.s.f(this.f36555d, bVar.f36555d) && p013kotlin.jvm.internal.s.f(this.f36556e, bVar.f36556e) && p013kotlin.jvm.internal.s.f(this.f36557f, bVar.f36557f) && this.f36558g == bVar.f36558g;
        }

        public final List f() {
            return this.f36555d;
        }

        public final Yj g() {
            return this.f36553b;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f36552a.hashCode() * 31) + this.f36553b.hashCode()) * 31) + this.f36554c.hashCode()) * 31) + this.f36555d.hashCode()) * 31) + this.f36556e.hashCode()) * 31;
            InterfaceC3807sD interfaceC3807sD = this.f36557f;
            return ((iHashCode + (interfaceC3807sD == null ? 0 : interfaceC3807sD.hashCode())) * 31) + Boolean.hashCode(this.f36558g);
        }

        public String toString() {
            return "AnimatedWithBullets(title=" + this.f36552a + ", lottieSource=" + this.f36553b + ", description=" + this.f36554c + ", bulletPoints=" + this.f36555d + ", primaryButtonIntent=" + this.f36556e + ", secondaryButtonIntent=" + this.f36557f + ", requiresAnnouncement=" + this.f36558g + ")";
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ws$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC3903uh f36559a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final wn0.p f36560b;

            public a(InterfaceC3903uh interfaceC3903uh, wn0.p text) {
                p013kotlin.jvm.internal.s.k(text, "text");
                this.f36559a = interfaceC3903uh;
                this.f36560b = text;
            }

            public final InterfaceC3903uh a() {
                return this.f36559a;
            }

            public final wn0.p b() {
                return this.f36560b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p013kotlin.jvm.internal.s.f(this.f36559a, aVar.f36559a) && p013kotlin.jvm.internal.s.f(this.f36560b, aVar.f36560b);
            }

            public int hashCode() {
                InterfaceC3903uh interfaceC3903uh = this.f36559a;
                return ((interfaceC3903uh == null ? 0 : interfaceC3903uh.hashCode()) * 31) + this.f36560b.hashCode();
            }

            public String toString() {
                return "BulletPoint(imageSource=" + this.f36559a + ", text=" + this.f36560b + ")";
            }

            public /* synthetic */ a(InterfaceC3903uh interfaceC3903uh, wn0.p pVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : interfaceC3903uh, pVar);
            }
        }

        public /* synthetic */ b(QA qa2, Yj yj2, QA qa3, List list, InterfaceC3807sD interfaceC3807sD, InterfaceC3807sD interfaceC3807sD2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(qa2, yj2, qa3, list, interfaceC3807sD, (i11 & 32) != 0 ? null : interfaceC3807sD2, (i11 & 64) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ws$d */
    public static final class d implements InterfaceC4001ws {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f36567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f36568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f36569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3807sD f36570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC3807sD f36571e;

        public d(boolean z11, QA title, QA description, InterfaceC3807sD primaryButtonIntent, InterfaceC3807sD interfaceC3807sD) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(primaryButtonIntent, "primaryButtonIntent");
            this.f36567a = z11;
            this.f36568b = title;
            this.f36569c = description;
            this.f36570d = primaryButtonIntent;
            this.f36571e = interfaceC3807sD;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA a() {
            return this.f36568b;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA b() {
            return this.f36569c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD c() {
            return this.f36571e;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD d() {
            return this.f36570d;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public boolean e() {
            return this.f36567a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f36567a == dVar.f36567a && p013kotlin.jvm.internal.s.f(this.f36568b, dVar.f36568b) && p013kotlin.jvm.internal.s.f(this.f36569c, dVar.f36569c) && p013kotlin.jvm.internal.s.f(this.f36570d, dVar.f36570d) && p013kotlin.jvm.internal.s.f(this.f36571e, dVar.f36571e);
        }

        public int hashCode() {
            int iHashCode = ((((((Boolean.hashCode(this.f36567a) * 31) + this.f36568b.hashCode()) * 31) + this.f36569c.hashCode()) * 31) + this.f36570d.hashCode()) * 31;
            InterfaceC3807sD interfaceC3807sD = this.f36571e;
            return iHashCode + (interfaceC3807sD == null ? 0 : interfaceC3807sD.hashCode());
        }

        public String toString() {
            return "Default(requiresAnnouncement=" + this.f36567a + ", title=" + this.f36568b + ", description=" + this.f36569c + ", primaryButtonIntent=" + this.f36570d + ", secondaryButtonIntent=" + this.f36571e + ")";
        }

        public /* synthetic */ d(boolean z11, QA qa2, QA qa3, InterfaceC3807sD interfaceC3807sD, InterfaceC3807sD interfaceC3807sD2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, qa2, qa3, interfaceC3807sD, (i11 & 16) != 0 ? null : interfaceC3807sD2);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ws$e */
    public static final class e implements InterfaceC4001ws {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3903uh f36572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f36573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC3807sD f36574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3807sD f36575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f36576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final QA f36577f;

        public e(InterfaceC3903uh imageSource, QA description, InterfaceC3807sD primaryButtonIntent, InterfaceC3807sD interfaceC3807sD, boolean z11) {
            p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(primaryButtonIntent, "primaryButtonIntent");
            this.f36572a = imageSource;
            this.f36573b = description;
            this.f36574c = primaryButtonIntent;
            this.f36575d = interfaceC3807sD;
            this.f36576e = z11;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA a() {
            return this.f36577f;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA b() {
            return this.f36573b;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD c() {
            return this.f36575d;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD d() {
            return this.f36574c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public boolean e() {
            return this.f36576e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p013kotlin.jvm.internal.s.f(this.f36572a, eVar.f36572a) && p013kotlin.jvm.internal.s.f(this.f36573b, eVar.f36573b) && p013kotlin.jvm.internal.s.f(this.f36574c, eVar.f36574c) && p013kotlin.jvm.internal.s.f(this.f36575d, eVar.f36575d) && this.f36576e == eVar.f36576e;
        }

        public final InterfaceC3903uh f() {
            return this.f36572a;
        }

        public int hashCode() {
            int iHashCode = ((((this.f36572a.hashCode() * 31) + this.f36573b.hashCode()) * 31) + this.f36574c.hashCode()) * 31;
            InterfaceC3807sD interfaceC3807sD = this.f36575d;
            return ((iHashCode + (interfaceC3807sD == null ? 0 : interfaceC3807sD.hashCode())) * 31) + Boolean.hashCode(this.f36576e);
        }

        public String toString() {
            return "WithImage(imageSource=" + this.f36572a + ", description=" + this.f36573b + ", primaryButtonIntent=" + this.f36574c + ", secondaryButtonIntent=" + this.f36575d + ", requiresAnnouncement=" + this.f36576e + ")";
        }

        public /* synthetic */ e(InterfaceC3903uh interfaceC3903uh, QA qa2, InterfaceC3807sD interfaceC3807sD, InterfaceC3807sD interfaceC3807sD2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC3903uh, qa2, interfaceC3807sD, (i11 & 8) != 0 ? null : interfaceC3807sD2, (i11 & 16) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ws$a */
    public static final class a implements InterfaceC4001ws {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f36546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Yj f36547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f36548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3807sD f36549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC3807sD f36550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f36551f;

        public a(QA title, Yj lottieSource, QA description, InterfaceC3807sD primaryButtonIntent, InterfaceC3807sD interfaceC3807sD, boolean z11) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(primaryButtonIntent, "primaryButtonIntent");
            this.f36546a = title;
            this.f36547b = lottieSource;
            this.f36548c = description;
            this.f36549d = primaryButtonIntent;
            this.f36550e = interfaceC3807sD;
            this.f36551f = z11;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA a() {
            return this.f36546a;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA b() {
            return this.f36548c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD c() {
            return this.f36550e;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD d() {
            return this.f36549d;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public boolean e() {
            return this.f36551f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f36546a, aVar.f36546a) && p013kotlin.jvm.internal.s.f(this.f36547b, aVar.f36547b) && p013kotlin.jvm.internal.s.f(this.f36548c, aVar.f36548c) && p013kotlin.jvm.internal.s.f(this.f36549d, aVar.f36549d) && p013kotlin.jvm.internal.s.f(this.f36550e, aVar.f36550e) && this.f36551f == aVar.f36551f;
        }

        public final Yj f() {
            return this.f36547b;
        }

        public int hashCode() {
            int iHashCode = ((((((this.f36546a.hashCode() * 31) + this.f36547b.hashCode()) * 31) + this.f36548c.hashCode()) * 31) + this.f36549d.hashCode()) * 31;
            InterfaceC3807sD interfaceC3807sD = this.f36550e;
            return ((iHashCode + (interfaceC3807sD == null ? 0 : interfaceC3807sD.hashCode())) * 31) + Boolean.hashCode(this.f36551f);
        }

        public String toString() {
            return "Animated(title=" + this.f36546a + ", lottieSource=" + this.f36547b + ", description=" + this.f36548c + ", primaryButtonIntent=" + this.f36549d + ", secondaryButtonIntent=" + this.f36550e + ", requiresAnnouncement=" + this.f36551f + ")";
        }

        public /* synthetic */ a(QA qa2, Yj yj2, QA qa3, InterfaceC3807sD interfaceC3807sD, InterfaceC3807sD interfaceC3807sD2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(qa2, yj2, qa3, interfaceC3807sD, (i11 & 16) != 0 ? null : interfaceC3807sD2, (i11 & 32) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ws$c */
    public static final class c implements InterfaceC4001ws {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f36561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f36562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC3807sD f36563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3807sD f36564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f36565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final QA f36566f;

        public c(QA title, QA description, InterfaceC3807sD interfaceC3807sD, InterfaceC3807sD interfaceC3807sD2, boolean z11, QA hint) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(hint, "hint");
            this.f36561a = title;
            this.f36562b = description;
            this.f36563c = interfaceC3807sD;
            this.f36564d = interfaceC3807sD2;
            this.f36565e = z11;
            this.f36566f = hint;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA a() {
            return this.f36561a;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA b() {
            return this.f36562b;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD c() {
            return this.f36564d;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD d() {
            return this.f36563c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public boolean e() {
            return this.f36565e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p013kotlin.jvm.internal.s.f(this.f36561a, cVar.f36561a) && p013kotlin.jvm.internal.s.f(this.f36562b, cVar.f36562b) && p013kotlin.jvm.internal.s.f(this.f36563c, cVar.f36563c) && p013kotlin.jvm.internal.s.f(this.f36564d, cVar.f36564d) && this.f36565e == cVar.f36565e && p013kotlin.jvm.internal.s.f(this.f36566f, cVar.f36566f);
        }

        public final QA f() {
            return this.f36566f;
        }

        public int hashCode() {
            int iHashCode = ((this.f36561a.hashCode() * 31) + this.f36562b.hashCode()) * 31;
            InterfaceC3807sD interfaceC3807sD = this.f36563c;
            int iHashCode2 = (iHashCode + (interfaceC3807sD == null ? 0 : interfaceC3807sD.hashCode())) * 31;
            InterfaceC3807sD interfaceC3807sD2 = this.f36564d;
            return ((((iHashCode2 + (interfaceC3807sD2 != null ? interfaceC3807sD2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f36565e)) * 31) + this.f36566f.hashCode();
        }

        public String toString() {
            return "AnimatedWithHint(title=" + this.f36561a + ", description=" + this.f36562b + ", primaryButtonIntent=" + this.f36563c + ", secondaryButtonIntent=" + this.f36564d + ", requiresAnnouncement=" + this.f36565e + ", hint=" + this.f36566f + ")";
        }

        public /* synthetic */ c(QA qa2, QA qa3, InterfaceC3807sD interfaceC3807sD, InterfaceC3807sD interfaceC3807sD2, boolean z11, QA qa4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(qa2, qa3, (i11 & 4) != 0 ? null : interfaceC3807sD, (i11 & 8) != 0 ? null : interfaceC3807sD2, (i11 & 16) != 0 ? false : z11, qa4);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ws$f */
    public static final class f implements InterfaceC4001ws {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f36578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final wn0.p f36579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f36580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3807sD f36581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC3807sD f36582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InterfaceC3903uh f36583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f36584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final QA f36585h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final QA f36586i;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ws$f$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final wn0.r f36587a;

            public a(wn0.r body) {
                p013kotlin.jvm.internal.s.k(body, "body");
                this.f36587a = body;
            }

            public final wn0.r a() {
                return this.f36587a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f36587a, ((a) obj).f36587a);
            }

            public int hashCode() {
                return this.f36587a.hashCode();
            }

            public String toString() {
                return "Page(body=" + this.f36587a + ")";
            }
        }

        public f(List pages, wn0.p onPageViewed, boolean z11, InterfaceC3807sD primaryButtonIntent, InterfaceC3807sD interfaceC3807sD, InterfaceC3903uh arrowIcon, boolean z12) {
            p013kotlin.jvm.internal.s.k(pages, "pages");
            p013kotlin.jvm.internal.s.k(onPageViewed, "onPageViewed");
            p013kotlin.jvm.internal.s.k(primaryButtonIntent, "primaryButtonIntent");
            p013kotlin.jvm.internal.s.k(arrowIcon, "arrowIcon");
            this.f36578a = pages;
            this.f36579b = onPageViewed;
            this.f36580c = z11;
            this.f36581d = primaryButtonIntent;
            this.f36582e = interfaceC3807sD;
            this.f36583f = arrowIcon;
            this.f36584g = z12;
            QA.b bVar = QA.b.f27435b;
            this.f36585h = bVar;
            this.f36586i = bVar;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA a() {
            return this.f36585h;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public QA b() {
            return this.f36586i;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD c() {
            return this.f36582e;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public InterfaceC3807sD d() {
            return this.f36581d;
        }

        @Override // com.fourthline.orca.internal.InterfaceC4001ws
        public boolean e() {
            return this.f36580c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p013kotlin.jvm.internal.s.f(this.f36578a, fVar.f36578a) && p013kotlin.jvm.internal.s.f(this.f36579b, fVar.f36579b) && this.f36580c == fVar.f36580c && p013kotlin.jvm.internal.s.f(this.f36581d, fVar.f36581d) && p013kotlin.jvm.internal.s.f(this.f36582e, fVar.f36582e) && p013kotlin.jvm.internal.s.f(this.f36583f, fVar.f36583f) && this.f36584g == fVar.f36584g;
        }

        public final InterfaceC3903uh f() {
            return this.f36583f;
        }

        public final wn0.p g() {
            return this.f36579b;
        }

        public final List h() {
            return this.f36578a;
        }

        public int hashCode() {
            int iHashCode = ((((((this.f36578a.hashCode() * 31) + this.f36579b.hashCode()) * 31) + Boolean.hashCode(this.f36580c)) * 31) + this.f36581d.hashCode()) * 31;
            InterfaceC3807sD interfaceC3807sD = this.f36582e;
            return ((((iHashCode + (interfaceC3807sD == null ? 0 : interfaceC3807sD.hashCode())) * 31) + this.f36583f.hashCode()) * 31) + Boolean.hashCode(this.f36584g);
        }

        public final boolean i() {
            return this.f36584g;
        }

        public String toString() {
            return "WithPages(pages=" + this.f36578a + ", onPageViewed=" + this.f36579b + ", requiresAnnouncement=" + this.f36580c + ", primaryButtonIntent=" + this.f36581d + ", secondaryButtonIntent=" + this.f36582e + ", arrowIcon=" + this.f36583f + ", showBackground=" + this.f36584g + ")";
        }

        public /* synthetic */ f(List list, wn0.p pVar, boolean z11, InterfaceC3807sD interfaceC3807sD, InterfaceC3807sD interfaceC3807sD2, InterfaceC3903uh interfaceC3903uh, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, pVar, (i11 & 4) != 0 ? false : z11, interfaceC3807sD, (i11 & 16) != 0 ? null : interfaceC3807sD2, interfaceC3903uh, (i11 & 64) != 0 ? true : z12);
        }
    }
}
