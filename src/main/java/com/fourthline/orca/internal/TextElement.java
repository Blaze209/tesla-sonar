package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.PlatformTextStyle;
import i4.TextStyle;
import k3.Shadow;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.FontWeight;
import p4.LocaleList;
import t4.LineHeightStyle;
import t4.TextGeometricTransform;
import t4.TextIndent;

/* JADX INFO: renamed from: com.fourthline.orca.internal.OA, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002&\u0013B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0013\u001a\u00020\u00172\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0013\u0010\u0018J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/fourthline/orca/internal/OA;", "", "Lcom/fourthline/orca/internal/pg;", "typography", "Lcom/fourthline/orca/internal/g4;", "color", "<init>", "(Lcom/fourthline/orca/internal/pg;Lcom/fourthline/orca/internal/g4;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/pg;Lcom/fourthline/orca/internal/g4;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/OA;Luo0/d;Lto0/f;)V", "Lw4/v;", "maxSize", "Li4/r0;", "(Lw4/v;Lr2/l;II)Li4/r0;", "(Lcom/fourthline/orca/internal/pg;Lcom/fourthline/orca/internal/g4;)Lcom/fourthline/orca/internal/OA;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/pg;", DateTokenConverter.CONVERTER_KEY, "()Lcom/fourthline/orca/internal/pg;", "b", "Lcom/fourthline/orca/internal/g4;", "c", "()Lcom/fourthline/orca/internal/g4;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class TextElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ro0.d[] f27134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final TextElement f27135d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontElement typography;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement color;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.OA$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27139b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f27138a = aVar;
            f27139b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.TextElement", aVar, 2);
            m1Var.o("typography", true);
            m1Var.o("color", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextElement deserialize(uo0.e decoder) {
            ColorElement colorElement;
            FontElement fontElement;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = TextElement.f27134c;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                fontElement = (FontElement) cVarB.n(fVar, 0, dVarArr[0], null);
                colorElement = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                ColorElement colorElement2 = null;
                FontElement fontElement2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        fontElement2 = (FontElement) cVarB.n(fVar, 0, dVarArr[0], fontElement2);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        colorElement2 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], colorElement2);
                        i12 |= 2;
                    }
                }
                colorElement = colorElement2;
                fontElement = fontElement2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new TextElement(i11, fontElement, colorElement, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = TextElement.f27134c;
            return new ro0.d[]{dVarArr[0], dVarArr[1]};
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
        public final void serialize(uo0.f encoder, TextElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            TextElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.OA$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextElement a() {
            return TextElement.f27135d;
        }

        public final ro0.d<TextElement> serializer() {
            return a.f27138a;
        }

        private Companion() {
        }
    }

    static {
        FontElement.Companion companion = FontElement.INSTANCE;
        ro0.d<FontElement> dVarSerializer = companion.serializer();
        ColorElement.Companion companion2 = ColorElement.INSTANCE;
        f27134c = new ro0.d[]{dVarSerializer, companion2.serializer()};
        f27135d = new TextElement(companion.a(), companion2.a());
    }

    public /* synthetic */ TextElement(int i11, FontElement fontElement, ColorElement colorElement, vo0.v1 v1Var) {
        if (2 != (i11 & 2)) {
            vo0.h1.b(i11, 2, a.f27138a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.typography = FontElement.INSTANCE.a();
        } else {
            this.typography = fontElement;
        }
        this.color = colorElement;
    }

    public final TextElement a(FontElement typography, ColorElement color) {
        p013kotlin.jvm.internal.s.k(typography, "typography");
        p013kotlin.jvm.internal.s.k(color, "color");
        return new TextElement(typography, color);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ColorElement getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FontElement getTypography() {
        return this.typography;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextElement)) {
            return false;
        }
        TextElement textElement = (TextElement) other;
        return p013kotlin.jvm.internal.s.f(this.typography, textElement.typography) && p013kotlin.jvm.internal.s.f(this.color, textElement.color);
    }

    public int hashCode() {
        return (this.typography.hashCode() * 31) + this.color.hashCode();
    }

    public String toString() {
        return "TextElement(typography=" + this.typography + ", color=" + this.color + ")";
    }

    public static /* synthetic */ TextElement a(TextElement textElement, FontElement fontElement, ColorElement colorElement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fontElement = textElement.typography;
        }
        if ((i11 & 2) != 0) {
            colorElement = textElement.color;
        }
        return textElement.a(fontElement, colorElement);
    }

    public TextElement(FontElement typography, ColorElement color) {
        p013kotlin.jvm.internal.s.k(typography, "typography");
        p013kotlin.jvm.internal.s.k(color, "color");
        this.typography = typography;
        this.color = color;
    }

    public static final /* synthetic */ void a(TextElement self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f27134c;
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.typography, FontElement.INSTANCE.a())) {
            output.D(serialDesc, 0, dVarArr[0], self.typography);
        }
        output.D(serialDesc, 1, dVarArr[1], self.color);
    }

    public final TextStyle a(w4.v vVar, p020r2.l lVar, int i11, int i12) {
        lVar.o(2079085939);
        w4.v vVar2 = (i12 & 1) != 0 ? null : vVar;
        if (p020r2.o.J()) {
            p020r2.o.S(2079085939, i11, -1, "com.fourthline.orca.core.internal.styling.common.TextElement.getTextStyle (StylingElement.kt:83)");
        }
        Pair pairA = this.typography.a(vVar2, lVar, i11 & 14, 0);
        TextStyle textStyle = new TextStyle(this.color.a(lVar, 0), ((w4.v) pairA.e()).getPackedValue(), (FontWeight) null, (p014n4.b0) null, (p014n4.c0) null, this.typography.getFamily(), (String) null, 0L, (t4.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (t4.k) null, (Shadow) null, (m3.g) null, 0, 0, ((w4.v) pairA.f()).getPackedValue(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (t4.s) null, 16646108, (DefaultConstructorMarker) null);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return textStyle;
    }
}
