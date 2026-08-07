package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.m3, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002!\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0019¨\u0006%"}, d2 = {"Lcom/fourthline/orca/internal/m3;", "", "Lcom/fourthline/orca/internal/g4;", "color", "", Snapshot.WIDTH, "<init>", "(Lcom/fourthline/orca/internal/g4;I)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/m3;Luo0/d;Lto0/f;)V", "(Lcom/fourthline/orca/internal/g4;I)Lcom/fourthline/orca/internal/m3;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "c", "()Lcom/fourthline/orca/internal/g4;", "b", "I", DateTokenConverter.CONVERTER_KEY, "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class BorderElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ro0.d[] f33498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BorderElement f33499d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int width;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.m3$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33503b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f33502a = aVar;
            f33503b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.BorderElement", aVar, 2);
            m1Var.o("color", false);
            m1Var.o(Snapshot.WIDTH, false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BorderElement deserialize(uo0.e decoder) {
            ColorElement colorElement;
            int iE;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = BorderElement.f33498c;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                colorElement = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                iE = cVarB.e(fVar, 1);
                i11 = 3;
            } else {
                boolean z11 = true;
                int iE2 = 0;
                int i12 = 0;
                ColorElement colorElement2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        colorElement2 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], colorElement2);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        iE2 = cVarB.e(fVar, 1);
                        i12 |= 2;
                    }
                }
                colorElement = colorElement2;
                iE = iE2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new BorderElement(i11, colorElement, iE, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{BorderElement.f33498c[0], vo0.j0.f119632a};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, BorderElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            BorderElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.m3$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BorderElement a() {
            return BorderElement.f33499d;
        }

        public final ro0.d<BorderElement> serializer() {
            return a.f33502a;
        }

        private Companion() {
        }
    }

    static {
        ColorElement.Companion companion = ColorElement.INSTANCE;
        f33498c = new ro0.d[]{companion.serializer(), null};
        f33499d = new BorderElement(companion.b(), 0);
    }

    public /* synthetic */ BorderElement(int i11, ColorElement colorElement, int i12, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f33502a.getDescriptor());
        }
        this.color = colorElement;
        this.width = i12;
    }

    public final BorderElement a(ColorElement color, int width) {
        p013kotlin.jvm.internal.s.k(color, "color");
        return new BorderElement(color, width);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ColorElement getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderElement)) {
            return false;
        }
        BorderElement borderElement = (BorderElement) other;
        return p013kotlin.jvm.internal.s.f(this.color, borderElement.color) && this.width == borderElement.width;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + Integer.hashCode(this.width);
    }

    public String toString() {
        return "BorderElement(color=" + this.color + ", width=" + this.width + ")";
    }

    public BorderElement(ColorElement color, int i11) {
        p013kotlin.jvm.internal.s.k(color, "color");
        this.color = color;
        this.width = i11;
    }

    public static /* synthetic */ BorderElement a(BorderElement borderElement, ColorElement colorElement, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            colorElement = borderElement.color;
        }
        if ((i12 & 2) != 0) {
            i11 = borderElement.width;
        }
        return borderElement.a(colorElement, i11);
    }

    public static final /* synthetic */ void a(BorderElement self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, f33498c[0], self.color);
        output.x(serialDesc, 1, self.width);
    }
}
