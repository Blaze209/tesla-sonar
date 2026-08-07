package com.fourthline.vision.internal;

import android.graphics.PointF;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4273r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4165c4 f38800a;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.r2$a */
    public static final class a extends AbstractC4273r2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C4165c4 f38801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f38802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f38803d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4165c4 faceBox, boolean z11, List<? extends PointF> contours) {
            super(faceBox, null);
            p013kotlin.jvm.internal.s.k(faceBox, "faceBox");
            p013kotlin.jvm.internal.s.k(contours, "contours");
            this.f38801b = faceBox;
            this.f38802c = z11;
            this.f38803d = contours;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a copy$default(a aVar, C4165c4 c4165c4, boolean z11, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c4165c4 = aVar.f38801b;
            }
            if ((i11 & 2) != 0) {
                z11 = aVar.f38802c;
            }
            if ((i11 & 4) != 0) {
                list = aVar.f38803d;
            }
            return aVar.copy(c4165c4, z11, list);
        }

        public final C4165c4 component1() {
            return this.f38801b;
        }

        public final boolean component2() {
            return this.f38802c;
        }

        public final List<PointF> component3() {
            return this.f38803d;
        }

        public final a copy(C4165c4 faceBox, boolean z11, List<? extends PointF> contours) {
            p013kotlin.jvm.internal.s.k(faceBox, "faceBox");
            p013kotlin.jvm.internal.s.k(contours, "contours");
            return new a(faceBox, z11, contours);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f38801b, aVar.f38801b) && this.f38802c == aVar.f38802c && p013kotlin.jvm.internal.s.f(this.f38803d, aVar.f38803d);
        }

        public final List<PointF> getContours() {
            return this.f38803d;
        }

        public final boolean getEyesOpen() {
            return this.f38802c;
        }

        @Override // com.fourthline.vision.internal.AbstractC4273r2
        public C4165c4 getFaceBox() {
            return this.f38801b;
        }

        public int hashCode() {
            return (((this.f38801b.hashCode() * 31) + Boolean.hashCode(this.f38802c)) * 31) + this.f38803d.hashCode();
        }

        public String toString() {
            return "Accurate(faceBox=" + this.f38801b + ", eyesOpen=" + this.f38802c + ", contours=" + this.f38803d + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.r2$b */
    public static final class b extends AbstractC4273r2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C4165c4 f38804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f38805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f38806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f38807e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4165c4 faceBox, boolean z11, float f11, float f12) {
            super(faceBox, null);
            p013kotlin.jvm.internal.s.k(faceBox, "faceBox");
            this.f38804b = faceBox;
            this.f38805c = z11;
            this.f38806d = f11;
            this.f38807e = f12;
        }

        public static /* synthetic */ b copy$default(b bVar, C4165c4 c4165c4, boolean z11, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c4165c4 = bVar.f38804b;
            }
            if ((i11 & 2) != 0) {
                z11 = bVar.f38805c;
            }
            if ((i11 & 4) != 0) {
                f11 = bVar.f38806d;
            }
            if ((i11 & 8) != 0) {
                f12 = bVar.f38807e;
            }
            return bVar.copy(c4165c4, z11, f11, f12);
        }

        public final C4165c4 component1() {
            return this.f38804b;
        }

        public final boolean component2() {
            return this.f38805c;
        }

        public final float component3() {
            return this.f38806d;
        }

        public final float component4() {
            return this.f38807e;
        }

        public final b copy(C4165c4 faceBox, boolean z11, float f11, float f12) {
            p013kotlin.jvm.internal.s.k(faceBox, "faceBox");
            return new b(faceBox, z11, f11, f12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f38804b, bVar.f38804b) && this.f38805c == bVar.f38805c && Float.compare(this.f38806d, bVar.f38806d) == 0 && Float.compare(this.f38807e, bVar.f38807e) == 0;
        }

        public final boolean getEyesOpen() {
            return this.f38805c;
        }

        @Override // com.fourthline.vision.internal.AbstractC4273r2
        public C4165c4 getFaceBox() {
            return this.f38804b;
        }

        public final float getPitch() {
            return this.f38807e;
        }

        public final float getYaw() {
            return this.f38806d;
        }

        public int hashCode() {
            return (((((this.f38804b.hashCode() * 31) + Boolean.hashCode(this.f38805c)) * 31) + Float.hashCode(this.f38806d)) * 31) + Float.hashCode(this.f38807e);
        }

        public String toString() {
            return "Fast(faceBox=" + this.f38804b + ", eyesOpen=" + this.f38805c + ", yaw=" + this.f38806d + ", pitch=" + this.f38807e + ")";
        }
    }

    public /* synthetic */ AbstractC4273r2(C4165c4 c4165c4, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4165c4);
    }

    public C4165c4 getFaceBox() {
        return this.f38800a;
    }

    private AbstractC4273r2(C4165c4 c4165c4) {
        this.f38800a = c4165c4;
    }
}
