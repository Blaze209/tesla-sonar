package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrzInfo;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface T0 {

    public static final class b implements T0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MrzInfo f37954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f37955b;

        public b(MrzInfo mrz, d textDetection) {
            p013kotlin.jvm.internal.s.k(mrz, "mrz");
            p013kotlin.jvm.internal.s.k(textDetection, "textDetection");
            this.f37954a = mrz;
            this.f37955b = textDetection;
        }

        public static /* synthetic */ b copy$default(b bVar, MrzInfo mrzInfo, d dVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                mrzInfo = bVar.f37954a;
            }
            if ((i11 & 2) != 0) {
                dVar = bVar.f37955b;
            }
            return bVar.copy(mrzInfo, dVar);
        }

        public final MrzInfo component1() {
            return this.f37954a;
        }

        public final d component2() {
            return this.f37955b;
        }

        public final b copy(MrzInfo mrz, d textDetection) {
            p013kotlin.jvm.internal.s.k(mrz, "mrz");
            p013kotlin.jvm.internal.s.k(textDetection, "textDetection");
            return new b(mrz, textDetection);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f37954a, bVar.f37954a) && p013kotlin.jvm.internal.s.f(this.f37955b, bVar.f37955b);
        }

        @Override // com.fourthline.vision.internal.T0
        public C4165c4 getBox() {
            return this.f37955b.getBox();
        }

        public final MrzInfo getMrz() {
            return this.f37954a;
        }

        @Override // com.fourthline.vision.internal.T0
        public String getText() {
            return this.f37955b.getText();
        }

        public final d getTextDetection() {
            return this.f37955b;
        }

        public int hashCode() {
            return (this.f37954a.hashCode() * 31) + this.f37955b.hashCode();
        }

        public String toString() {
            return "Mrz(mrz=" + this.f37954a + ", textDetection=" + this.f37955b + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f37956a;

        public c(List<d> texts) {
            p013kotlin.jvm.internal.s.k(texts, "texts");
            this.f37956a = texts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c copy$default(c cVar, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = cVar.f37956a;
            }
            return cVar.copy(list);
        }

        public final List<d> component1() {
            return this.f37956a;
        }

        public final c copy(List<d> texts) {
            p013kotlin.jvm.internal.s.k(texts, "texts");
            return new c(texts);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f37956a, ((c) obj).f37956a);
        }

        public final List<d> getTexts() {
            return this.f37956a;
        }

        public int hashCode() {
            return this.f37956a.hashCode();
        }

        public String toString() {
            return "Root(texts=" + this.f37956a + ")";
        }
    }

    C4165c4 getBox();

    String getText();

    public static final class a implements T0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f37951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C4165c4 f37952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f37953c;

        public a(String text, C4165c4 box, List<Object> list) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(box, "box");
            this.f37951a = text;
            this.f37952b = box;
            this.f37953c = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a copy$default(a aVar, String str, C4165c4 c4165c4, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f37951a;
            }
            if ((i11 & 2) != 0) {
                c4165c4 = aVar.f37952b;
            }
            if ((i11 & 4) != 0) {
                list = aVar.f37953c;
            }
            return aVar.copy(str, c4165c4, list);
        }

        public final String component1() {
            return this.f37951a;
        }

        public final C4165c4 component2() {
            return this.f37952b;
        }

        public final List<Object> component3() {
            return this.f37953c;
        }

        public final a copy(String text, C4165c4 box, List<Object> list) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(box, "box");
            return new a(text, box, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f37951a, aVar.f37951a) && p013kotlin.jvm.internal.s.f(this.f37952b, aVar.f37952b) && p013kotlin.jvm.internal.s.f(this.f37953c, aVar.f37953c);
        }

        @Override // com.fourthline.vision.internal.T0
        public C4165c4 getBox() {
            return this.f37952b;
        }

        public final List<Object> getSymbols() {
            return this.f37953c;
        }

        @Override // com.fourthline.vision.internal.T0
        public String getText() {
            return this.f37951a;
        }

        public int hashCode() {
            int iHashCode = ((this.f37951a.hashCode() * 31) + this.f37952b.hashCode()) * 31;
            List list = this.f37953c;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Line(text=" + this.f37951a + ", box=" + this.f37952b + ", symbols=" + this.f37953c + ")";
        }

        public /* synthetic */ a(String str, C4165c4 c4165c4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, c4165c4, (i11 & 4) != 0 ? null : list);
        }
    }

    public static final class d implements T0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f37957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C4165c4 f37958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f37959c;

        public d(String text, C4165c4 box, List<a> list) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(box, "box");
            this.f37957a = text;
            this.f37958b = box;
            this.f37959c = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d copy$default(d dVar, String str, C4165c4 c4165c4, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dVar.f37957a;
            }
            if ((i11 & 2) != 0) {
                c4165c4 = dVar.f37958b;
            }
            if ((i11 & 4) != 0) {
                list = dVar.f37959c;
            }
            return dVar.copy(str, c4165c4, list);
        }

        public final String component1() {
            return this.f37957a;
        }

        public final C4165c4 component2() {
            return this.f37958b;
        }

        public final List<a> component3() {
            return this.f37959c;
        }

        public final d copy(String text, C4165c4 box, List<a> list) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(box, "box");
            return new d(text, box, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p013kotlin.jvm.internal.s.f(this.f37957a, dVar.f37957a) && p013kotlin.jvm.internal.s.f(this.f37958b, dVar.f37958b) && p013kotlin.jvm.internal.s.f(this.f37959c, dVar.f37959c);
        }

        @Override // com.fourthline.vision.internal.T0
        public C4165c4 getBox() {
            return this.f37958b;
        }

        public final List<a> getLines() {
            return this.f37959c;
        }

        @Override // com.fourthline.vision.internal.T0
        public String getText() {
            return this.f37957a;
        }

        public int hashCode() {
            int iHashCode = ((this.f37957a.hashCode() * 31) + this.f37958b.hashCode()) * 31;
            List list = this.f37959c;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Text(text=" + this.f37957a + ", box=" + this.f37958b + ", lines=" + this.f37959c + ")";
        }

        public /* synthetic */ d(String str, C4165c4 c4165c4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, c4165c4, (i11 & 4) != 0 ? null : list);
        }
    }
}
