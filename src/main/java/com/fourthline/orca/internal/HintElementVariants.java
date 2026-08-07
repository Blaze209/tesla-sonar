package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ah, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0003\"\u0012\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u0012\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/ah;", "", "Lcom/fourthline/orca/internal/ah$c;", "default", "warning", "<init>", "(Lcom/fourthline/orca/internal/ah$c;Lcom/fourthline/orca/internal/ah$c;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ah$c;Lcom/fourthline/orca/internal/ah$c;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/ah;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ah$c;", "()Lcom/fourthline/orca/internal/ah$c;", "b", "getWarning", "Companion", "c", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class HintElementVariants {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HintElement default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HintElement warning;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ah$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30416b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f30415a = aVar;
            f30416b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.HintElementVariants", aVar, 2);
            m1Var.o("default", false);
            m1Var.o("warning", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HintElementVariants deserialize(uo0.e decoder) {
            HintElement hintElement;
            int i11;
            HintElement hintElement2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                HintElement.a aVar = HintElement.a.f30422a;
                hintElement2 = (HintElement) cVarB.n(fVar, 0, aVar, null);
                hintElement = (HintElement) cVarB.n(fVar, 1, aVar, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                hintElement = null;
                HintElement hintElement3 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        hintElement3 = (HintElement) cVarB.n(fVar, 0, HintElement.a.f30422a, hintElement3);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        hintElement = (HintElement) cVarB.n(fVar, 1, HintElement.a.f30422a, hintElement);
                        i12 |= 2;
                    }
                }
                i11 = i12;
                hintElement2 = hintElement3;
            }
            cVarB.c(fVar);
            return new HintElementVariants(i11, hintElement2, hintElement, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            HintElement.a aVar = HintElement.a.f30422a;
            return new ro0.d[]{aVar, aVar};
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
        public final void serialize(uo0.f encoder, HintElementVariants value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            HintElementVariants.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ah$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<HintElementVariants> serializer() {
            return a.f30415a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ah$c, reason: from toString */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002\u001a(BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012*\b\u0002\u0010\r\u001a$0\bj\u0011`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\u0004\b\u000e\u0010\u000fBA\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R9\u0010\r\u001a$0\bj\u0011`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u0010 ¨\u00061"}, d2 = {"Lcom/fourthline/orca/internal/ah$c;", "", "Lcom/fourthline/orca/internal/OA;", "text", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/fourthline/orca/internal/m3;", "border", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/zw;", "radius", "<init>", "(Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/m3;I)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/m3;ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/ah$c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/OA;", "e", "()Lcom/fourthline/orca/internal/OA;", "b", "Lcom/fourthline/orca/internal/g4;", "()Lcom/fourthline/orca/internal/g4;", "c", "Lcom/fourthline/orca/internal/m3;", "()Lcom/fourthline/orca/internal/m3;", DateTokenConverter.CONVERTER_KEY, "I", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class HintElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ro0.d[] f30417e = {null, ColorElement.INSTANCE.serializer(), null, new C4134zw()};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement background;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BorderElement border;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int radius;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ah$c$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30422a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f30423b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f30422a = aVar;
                f30423b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.HintElementVariants.HintElement", aVar, 4);
                m1Var.o("text", false);
                m1Var.o(AppStateModule.APP_STATE_BACKGROUND, true);
                m1Var.o("border", true);
                m1Var.o("radius", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HintElement deserialize(uo0.e decoder) {
                int iIntValue;
                int i11;
                TextElement textElement;
                ColorElement colorElement;
                BorderElement borderElement;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = HintElement.f30417e;
                if (cVarB.i()) {
                    TextElement textElement2 = (TextElement) cVarB.n(fVar, 0, TextElement.a.f27138a, null);
                    ColorElement colorElement2 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], null);
                    BorderElement borderElement2 = (BorderElement) cVarB.n(fVar, 2, BorderElement.a.f33502a, null);
                    iIntValue = ((Number) cVarB.n(fVar, 3, dVarArr[3], 0)).intValue();
                    textElement = textElement2;
                    borderElement = borderElement2;
                    i11 = 15;
                    colorElement = colorElement2;
                } else {
                    boolean z11 = true;
                    int iIntValue2 = 0;
                    TextElement textElement3 = null;
                    ColorElement colorElement3 = null;
                    BorderElement borderElement3 = null;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            textElement3 = (TextElement) cVarB.n(fVar, 0, TextElement.a.f27138a, textElement3);
                            i12 |= 1;
                        } else if (iA == 1) {
                            colorElement3 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], colorElement3);
                            i12 |= 2;
                        } else if (iA == 2) {
                            borderElement3 = (BorderElement) cVarB.n(fVar, 2, BorderElement.a.f33502a, borderElement3);
                            i12 |= 4;
                        } else {
                            if (iA != 3) {
                                throw new UnknownFieldException(iA);
                            }
                            iIntValue2 = ((Number) cVarB.n(fVar, 3, dVarArr[3], Integer.valueOf(iIntValue2))).intValue();
                            i12 |= 8;
                        }
                    }
                    iIntValue = iIntValue2;
                    i11 = i12;
                    textElement = textElement3;
                    colorElement = colorElement3;
                    borderElement = borderElement3;
                }
                cVarB.c(fVar);
                return new HintElement(i11, textElement, colorElement, borderElement, iIntValue, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = HintElement.f30417e;
                return new ro0.d[]{TextElement.a.f27138a, dVarArr[1], BorderElement.a.f33502a, dVarArr[3]};
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
            public final void serialize(uo0.f encoder, HintElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                HintElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ah$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<HintElement> serializer() {
                return a.f30422a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ HintElement(int i11, TextElement textElement, ColorElement colorElement, BorderElement borderElement, int i12, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f30422a.getDescriptor());
            }
            this.text = textElement;
            if ((i11 & 2) == 0) {
                this.background = ColorElement.INSTANCE.a();
            } else {
                this.background = colorElement;
            }
            if ((i11 & 4) == 0) {
                this.border = BorderElement.INSTANCE.a();
            } else {
                this.border = borderElement;
            }
            if ((i11 & 8) == 0) {
                this.radius = 0;
            } else {
                this.radius = i12;
            }
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColorElement getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BorderElement getBorder() {
            return this.border;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getRadius() {
            return this.radius;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextElement getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintElement)) {
                return false;
            }
            HintElement hintElement = (HintElement) other;
            return p013kotlin.jvm.internal.s.f(this.text, hintElement.text) && p013kotlin.jvm.internal.s.f(this.background, hintElement.background) && p013kotlin.jvm.internal.s.f(this.border, hintElement.border) && this.radius == hintElement.radius;
        }

        public int hashCode() {
            return (((((this.text.hashCode() * 31) + this.background.hashCode()) * 31) + this.border.hashCode()) * 31) + Integer.hashCode(this.radius);
        }

        public String toString() {
            return "HintElement(text=" + this.text + ", background=" + this.background + ", border=" + this.border + ", radius=" + this.radius + ")";
        }

        public static final /* synthetic */ void a(HintElement self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f30417e;
            output.D(serialDesc, 0, TextElement.a.f27138a, self.text);
            if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.background, ColorElement.INSTANCE.a())) {
                output.D(serialDesc, 1, dVarArr[1], self.background);
            }
            if (output.G(serialDesc, 2) || !p013kotlin.jvm.internal.s.f(self.border, BorderElement.INSTANCE.a())) {
                output.D(serialDesc, 2, BorderElement.a.f33502a, self.border);
            }
            if (!output.G(serialDesc, 3) && self.radius == 0) {
                return;
            }
            output.D(serialDesc, 3, dVarArr[3], Integer.valueOf(self.radius));
        }

        public HintElement(TextElement text, ColorElement background, BorderElement border, int i11) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(background, "background");
            p013kotlin.jvm.internal.s.k(border, "border");
            this.text = text;
            this.background = background;
            this.border = border;
            this.radius = i11;
        }
    }

    public /* synthetic */ HintElementVariants(int i11, HintElement hintElement, HintElement hintElement2, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f30415a.getDescriptor());
        }
        this.default = hintElement;
        this.warning = hintElement2;
    }

    public static final /* synthetic */ void a(HintElementVariants self, uo0.d output, to0.f serialDesc) {
        HintElement.a aVar = HintElement.a.f30422a;
        output.D(serialDesc, 0, aVar, self.default);
        output.D(serialDesc, 1, aVar, self.warning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HintElementVariants)) {
            return false;
        }
        HintElementVariants hintElementVariants = (HintElementVariants) other;
        return p013kotlin.jvm.internal.s.f(this.default, hintElementVariants.default) && p013kotlin.jvm.internal.s.f(this.warning, hintElementVariants.warning);
    }

    public int hashCode() {
        return (this.default.hashCode() * 31) + this.warning.hashCode();
    }

    public String toString() {
        return "HintElementVariants(default=" + this.default + ", warning=" + this.warning + ")";
    }

    public HintElementVariants(HintElement hintElement, HintElement warning) {
        p013kotlin.jvm.internal.s.k(hintElement, "default");
        p013kotlin.jvm.internal.s.k(warning, "warning");
        this.default = hintElement;
        this.warning = warning;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final HintElement getDefault() {
        return this.default;
    }
}
