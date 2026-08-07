package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface V6 extends QD {

    public static final class a implements V6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f29033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f29034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Yj f29035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3903uh f29036d;

        public a(QA title, QA description, Yj mainAnimation, InterfaceC3903uh successIcon) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(mainAnimation, "mainAnimation");
            p013kotlin.jvm.internal.s.k(successIcon, "successIcon");
            this.f29033a = title;
            this.f29034b = description;
            this.f29035c = mainAnimation;
            this.f29036d = successIcon;
        }

        @Override // com.fourthline.orca.internal.V6
        public QA a() {
            return this.f29033a;
        }

        @Override // com.fourthline.orca.internal.V6
        public QA b() {
            return this.f29034b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f29033a, aVar.f29033a) && p013kotlin.jvm.internal.s.f(this.f29034b, aVar.f29034b) && p013kotlin.jvm.internal.s.f(this.f29035c, aVar.f29035c) && p013kotlin.jvm.internal.s.f(this.f29036d, aVar.f29036d);
        }

        @Override // com.fourthline.orca.internal.V6
        public Yj g() {
            return this.f29035c;
        }

        public int hashCode() {
            return (((((this.f29033a.hashCode() * 31) + this.f29034b.hashCode()) * 31) + this.f29035c.hashCode()) * 31) + this.f29036d.hashCode();
        }

        public final InterfaceC3903uh p() {
            return this.f29036d;
        }

        public String toString() {
            return "DoneState(title=" + this.f29033a + ", description=" + this.f29034b + ", mainAnimation=" + this.f29035c + ", successIcon=" + this.f29036d + ")";
        }
    }

    public static final class b implements V6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f29037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f29038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Yj f29039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Yj f29040d;

        public b(QA title, QA description, Yj mainAnimation, Yj loadingAnimation) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(mainAnimation, "mainAnimation");
            p013kotlin.jvm.internal.s.k(loadingAnimation, "loadingAnimation");
            this.f29037a = title;
            this.f29038b = description;
            this.f29039c = mainAnimation;
            this.f29040d = loadingAnimation;
        }

        public final b a(QA title, QA description, Yj mainAnimation, Yj loadingAnimation) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(mainAnimation, "mainAnimation");
            p013kotlin.jvm.internal.s.k(loadingAnimation, "loadingAnimation");
            return new b(title, description, mainAnimation, loadingAnimation);
        }

        @Override // com.fourthline.orca.internal.V6
        public QA b() {
            return this.f29038b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f29037a, bVar.f29037a) && p013kotlin.jvm.internal.s.f(this.f29038b, bVar.f29038b) && p013kotlin.jvm.internal.s.f(this.f29039c, bVar.f29039c) && p013kotlin.jvm.internal.s.f(this.f29040d, bVar.f29040d);
        }

        @Override // com.fourthline.orca.internal.V6
        public Yj g() {
            return this.f29039c;
        }

        public int hashCode() {
            return (((((this.f29037a.hashCode() * 31) + this.f29038b.hashCode()) * 31) + this.f29039c.hashCode()) * 31) + this.f29040d.hashCode();
        }

        public final Yj p() {
            return this.f29040d;
        }

        public String toString() {
            return "LoadingState(title=" + this.f29037a + ", description=" + this.f29038b + ", mainAnimation=" + this.f29039c + ", loadingAnimation=" + this.f29040d + ")";
        }

        public static /* synthetic */ b a(b bVar, QA qa2, QA qa3, Yj yj2, Yj yj3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                qa2 = bVar.f29037a;
            }
            if ((i11 & 2) != 0) {
                qa3 = bVar.f29038b;
            }
            if ((i11 & 4) != 0) {
                yj2 = bVar.f29039c;
            }
            if ((i11 & 8) != 0) {
                yj3 = bVar.f29040d;
            }
            return bVar.a(qa2, qa3, yj2, yj3);
        }

        @Override // com.fourthline.orca.internal.V6
        public QA a() {
            return this.f29037a;
        }
    }

    QA a();

    QA b();

    Yj g();
}
