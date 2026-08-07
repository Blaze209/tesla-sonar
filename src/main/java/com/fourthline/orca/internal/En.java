package com.fourthline.orca.internal;

import android.net.Uri;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface En extends QD {

    public static final class a implements En {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f25613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Yj f25614b;

        public a(QA title, Yj lottieSource) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
            this.f25613a = title;
            this.f25614b = lottieSource;
        }

        @Override // com.fourthline.orca.internal.En
        public QA a() {
            return this.f25613a;
        }

        @Override // com.fourthline.orca.internal.En
        public QA b() {
            AbstractC3989wg.a("Do not touch! Use `NfcScannerViewWithLoader` Composable.");
            throw new KotlinNothingValueException();
        }

        @Override // com.fourthline.orca.internal.En
        public InterfaceC3903uh d() {
            AbstractC3989wg.a("Do not touch! Use `NfcScannerViewWithLoader` Composable.");
            throw new KotlinNothingValueException();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f25613a, aVar.f25613a) && p013kotlin.jvm.internal.s.f(this.f25614b, aVar.f25614b);
        }

        public int hashCode() {
            return (this.f25613a.hashCode() * 31) + this.f25614b.hashCode();
        }

        @Override // com.fourthline.orca.internal.En
        public e o() {
            AbstractC3989wg.a("Do not touch! Use `NfcScannerViewWithLoader` Composable.");
            throw new KotlinNothingValueException();
        }

        public final Yj p() {
            return this.f25614b;
        }

        public String toString() {
            return "LoadingState(title=" + this.f25613a + ", lottieSource=" + this.f25614b + ")";
        }
    }

    public static final class b implements En {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f25615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f25616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f25617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3903uh f25618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Cn f25619e;

        public b(e video, QA title, QA description, InterfaceC3903uh closeImageSource, Cn progressGraphic) {
            p013kotlin.jvm.internal.s.k(video, "video");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
            p013kotlin.jvm.internal.s.k(progressGraphic, "progressGraphic");
            this.f25615a = video;
            this.f25616b = title;
            this.f25617c = description;
            this.f25618d = closeImageSource;
            this.f25619e = progressGraphic;
        }

        @Override // com.fourthline.orca.internal.En
        public QA a() {
            return this.f25616b;
        }

        @Override // com.fourthline.orca.internal.En
        public QA b() {
            return this.f25617c;
        }

        @Override // com.fourthline.orca.internal.En
        public InterfaceC3903uh d() {
            return this.f25618d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f25615a, bVar.f25615a) && p013kotlin.jvm.internal.s.f(this.f25616b, bVar.f25616b) && p013kotlin.jvm.internal.s.f(this.f25617c, bVar.f25617c) && p013kotlin.jvm.internal.s.f(this.f25618d, bVar.f25618d) && p013kotlin.jvm.internal.s.f(this.f25619e, bVar.f25619e);
        }

        public int hashCode() {
            return (((((((this.f25615a.hashCode() * 31) + this.f25616b.hashCode()) * 31) + this.f25617c.hashCode()) * 31) + this.f25618d.hashCode()) * 31) + this.f25619e.hashCode();
        }

        @Override // com.fourthline.orca.internal.En
        public e o() {
            return this.f25615a;
        }

        public final Cn p() {
            return this.f25619e;
        }

        public String toString() {
            return "LookingForDocumentState(video=" + this.f25615a + ", title=" + this.f25616b + ", description=" + this.f25617c + ", closeImageSource=" + this.f25618d + ", progressGraphic=" + this.f25619e + ")";
        }
    }

    public static final class c implements En {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f25620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f25621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f25622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3903uh f25623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Cn f25624e;

        public c(e video, QA title, QA description, InterfaceC3903uh closeImageSource, Cn progressGraphic) {
            p013kotlin.jvm.internal.s.k(video, "video");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
            p013kotlin.jvm.internal.s.k(progressGraphic, "progressGraphic");
            this.f25620a = video;
            this.f25621b = title;
            this.f25622c = description;
            this.f25623d = closeImageSource;
            this.f25624e = progressGraphic;
        }

        @Override // com.fourthline.orca.internal.En
        public QA a() {
            return this.f25621b;
        }

        @Override // com.fourthline.orca.internal.En
        public QA b() {
            return this.f25622c;
        }

        @Override // com.fourthline.orca.internal.En
        public InterfaceC3903uh d() {
            return this.f25623d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p013kotlin.jvm.internal.s.f(this.f25620a, cVar.f25620a) && p013kotlin.jvm.internal.s.f(this.f25621b, cVar.f25621b) && p013kotlin.jvm.internal.s.f(this.f25622c, cVar.f25622c) && p013kotlin.jvm.internal.s.f(this.f25623d, cVar.f25623d) && p013kotlin.jvm.internal.s.f(this.f25624e, cVar.f25624e);
        }

        public int hashCode() {
            return (((((((this.f25620a.hashCode() * 31) + this.f25621b.hashCode()) * 31) + this.f25622c.hashCode()) * 31) + this.f25623d.hashCode()) * 31) + this.f25624e.hashCode();
        }

        @Override // com.fourthline.orca.internal.En
        public e o() {
            return this.f25620a;
        }

        public final Cn p() {
            return this.f25624e;
        }

        public String toString() {
            return "ScanningState(video=" + this.f25620a + ", title=" + this.f25621b + ", description=" + this.f25622c + ", closeImageSource=" + this.f25623d + ", progressGraphic=" + this.f25624e + ")";
        }
    }

    public static final class d implements En {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f25625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f25626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f25627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3903uh f25628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC3903uh f25629e;

        public d(e video, QA title, QA description, InterfaceC3903uh closeImageSource, InterfaceC3903uh successImageSource) {
            p013kotlin.jvm.internal.s.k(video, "video");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(description, "description");
            p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
            p013kotlin.jvm.internal.s.k(successImageSource, "successImageSource");
            this.f25625a = video;
            this.f25626b = title;
            this.f25627c = description;
            this.f25628d = closeImageSource;
            this.f25629e = successImageSource;
        }

        @Override // com.fourthline.orca.internal.En
        public QA a() {
            return this.f25626b;
        }

        @Override // com.fourthline.orca.internal.En
        public QA b() {
            return this.f25627c;
        }

        @Override // com.fourthline.orca.internal.En
        public InterfaceC3903uh d() {
            return this.f25628d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p013kotlin.jvm.internal.s.f(this.f25625a, dVar.f25625a) && p013kotlin.jvm.internal.s.f(this.f25626b, dVar.f25626b) && p013kotlin.jvm.internal.s.f(this.f25627c, dVar.f25627c) && p013kotlin.jvm.internal.s.f(this.f25628d, dVar.f25628d) && p013kotlin.jvm.internal.s.f(this.f25629e, dVar.f25629e);
        }

        public int hashCode() {
            return (((((((this.f25625a.hashCode() * 31) + this.f25626b.hashCode()) * 31) + this.f25627c.hashCode()) * 31) + this.f25628d.hashCode()) * 31) + this.f25629e.hashCode();
        }

        @Override // com.fourthline.orca.internal.En
        public e o() {
            return this.f25625a;
        }

        public final InterfaceC3903uh p() {
            return this.f25629e;
        }

        public String toString() {
            return "SuccessState(video=" + this.f25625a + ", title=" + this.f25626b + ", description=" + this.f25627c + ", closeImageSource=" + this.f25628d + ", successImageSource=" + this.f25629e + ")";
        }
    }

    QA a();

    QA b();

    InterfaceC3903uh d();

    e o();

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f25630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pair f25631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f25632c;

        public interface a {

            /* JADX INFO: renamed from: com.fourthline.orca.internal.En$e$a$a, reason: collision with other inner class name */
            public static final class C0486a implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Uri f25633a;

                public C0486a(Uri path) {
                    p013kotlin.jvm.internal.s.k(path, "path");
                    this.f25633a = path;
                }

                public final Uri a() {
                    return this.f25633a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0486a) && p013kotlin.jvm.internal.s.f(this.f25633a, ((C0486a) obj).f25633a);
                }

                public int hashCode() {
                    return this.f25633a.hashCode();
                }

                public String toString() {
                    return "FromLocalFile(path=" + this.f25633a + ")";
                }
            }

            public static final class b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f25634a;

                public b(int i11) {
                    this.f25634a = i11;
                }

                public final int a() {
                    return this.f25634a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.f25634a == ((b) obj).f25634a;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f25634a);
                }

                public String toString() {
                    return "FromRawResource(videoRawResId=" + this.f25634a + ")";
                }
            }
        }

        public e(a videoSource, Pair playRange, boolean z11) {
            p013kotlin.jvm.internal.s.k(videoSource, "videoSource");
            p013kotlin.jvm.internal.s.k(playRange, "playRange");
            this.f25630a = videoSource;
            this.f25631b = playRange;
            this.f25632c = z11;
        }

        public final boolean a() {
            return this.f25632c;
        }

        public final Pair b() {
            return this.f25631b;
        }

        public final a c() {
            return this.f25630a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p013kotlin.jvm.internal.s.f(this.f25630a, eVar.f25630a) && p013kotlin.jvm.internal.s.f(this.f25631b, eVar.f25631b) && this.f25632c == eVar.f25632c;
        }

        public int hashCode() {
            return (((this.f25630a.hashCode() * 31) + this.f25631b.hashCode()) * 31) + Boolean.hashCode(this.f25632c);
        }

        public String toString() {
            return "VideoState(videoSource=" + this.f25630a + ", playRange=" + this.f25631b + ", loop=" + this.f25632c + ")";
        }

        public /* synthetic */ e(a aVar, Pair pair, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, pair, (i11 & 4) != 0 ? false : z11);
        }
    }
}
