package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.c, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002\u001d+Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012(\u0010\u000e\u001a$0\tj\u0011`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B_\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R9\u0010\u000e\u001a$0\tj\u0011`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/fourthline/orca/internal/c;", "", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "separator", "Lcom/fourthline/orca/internal/OA;", "title", "message", "icon", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/zw;", "radius", "Lcom/fourthline/orca/internal/m3;", "border", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;ILcom/fourthline/orca/internal/m3;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;ILcom/fourthline/orca/internal/m3;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "getBackground", "()Lcom/fourthline/orca/internal/g4;", "b", "getSeparator", "c", "Lcom/fourthline/orca/internal/OA;", "getTitle", "()Lcom/fourthline/orca/internal/OA;", DateTokenConverter.CONVERTER_KEY, "getMessage", "e", "getIcon", "f", "I", "getRadius", "g", "Lcom/fourthline/orca/internal/m3;", "getBorder", "()Lcom/fourthline/orca/internal/m3;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class AccordionElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ro0.d[] f30738h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement separator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement message;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement icon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int radius;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BorderElement border;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30747b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f30746a = aVar;
            f30747b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.AccordionElement", aVar, 7);
            m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
            m1Var.o("separator", false);
            m1Var.o("title", false);
            m1Var.o("message", false);
            m1Var.o("icon", false);
            m1Var.o("radius", false);
            m1Var.o("border", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccordionElement deserialize(uo0.e decoder) {
            int iIntValue;
            BorderElement borderElement;
            ColorElement colorElement;
            int i11;
            ColorElement colorElement2;
            ColorElement colorElement3;
            TextElement textElement;
            TextElement textElement2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = AccordionElement.f30738h;
            int i12 = 6;
            if (cVarB.i()) {
                ColorElement colorElement4 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                ColorElement colorElement5 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], null);
                TextElement.a aVar = TextElement.a.f27138a;
                TextElement textElement3 = (TextElement) cVarB.n(fVar, 2, aVar, null);
                TextElement textElement4 = (TextElement) cVarB.n(fVar, 3, aVar, null);
                ColorElement colorElement6 = (ColorElement) cVarB.n(fVar, 4, dVarArr[4], null);
                iIntValue = ((Number) cVarB.n(fVar, 5, dVarArr[5], 0)).intValue();
                colorElement2 = colorElement4;
                borderElement = (BorderElement) cVarB.n(fVar, 6, BorderElement.a.f33502a, null);
                textElement2 = textElement4;
                textElement = textElement3;
                i11 = 127;
                colorElement = colorElement6;
                colorElement3 = colorElement5;
            } else {
                int i13 = 1;
                boolean z11 = true;
                int iIntValue2 = 0;
                BorderElement borderElement2 = null;
                ColorElement colorElement7 = null;
                ColorElement colorElement8 = null;
                TextElement textElement5 = null;
                TextElement textElement6 = null;
                int i14 = 0;
                ColorElement colorElement9 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 6;
                            i13 = 1;
                            break;
                        case 0:
                            colorElement7 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], colorElement7);
                            i14 |= 1;
                            i12 = 6;
                            i13 = 1;
                            break;
                        case 1:
                            colorElement8 = (ColorElement) cVarB.n(fVar, i13, dVarArr[i13], colorElement8);
                            i14 |= 2;
                            i12 = 6;
                            break;
                        case 2:
                            textElement5 = (TextElement) cVarB.n(fVar, 2, TextElement.a.f27138a, textElement5);
                            i14 |= 4;
                            i12 = 6;
                            break;
                        case 3:
                            textElement6 = (TextElement) cVarB.n(fVar, 3, TextElement.a.f27138a, textElement6);
                            i14 |= 8;
                            break;
                        case 4:
                            colorElement9 = (ColorElement) cVarB.n(fVar, 4, dVarArr[4], colorElement9);
                            i14 |= 16;
                            break;
                        case 5:
                            iIntValue2 = ((Number) cVarB.n(fVar, 5, dVarArr[5], Integer.valueOf(iIntValue2))).intValue();
                            i14 |= 32;
                            break;
                        case 6:
                            borderElement2 = (BorderElement) cVarB.n(fVar, i12, BorderElement.a.f33502a, borderElement2);
                            i14 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                iIntValue = iIntValue2;
                borderElement = borderElement2;
                colorElement = colorElement9;
                i11 = i14;
                colorElement2 = colorElement7;
                colorElement3 = colorElement8;
                textElement = textElement5;
                textElement2 = textElement6;
            }
            cVarB.c(fVar);
            return new AccordionElement(i11, colorElement2, colorElement3, textElement, textElement2, colorElement, iIntValue, borderElement, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = AccordionElement.f30738h;
            ro0.d dVar = dVarArr[0];
            ro0.d dVar2 = dVarArr[1];
            ro0.d dVar3 = dVarArr[4];
            ro0.d dVar4 = dVarArr[5];
            TextElement.a aVar = TextElement.a.f27138a;
            return new ro0.d[]{dVar, dVar2, aVar, aVar, dVar3, dVar4, BorderElement.a.f33502a};
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
        public final void serialize(uo0.f encoder, AccordionElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            AccordionElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<AccordionElement> serializer() {
            return a.f30746a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ColorElement.Companion companion = ColorElement.INSTANCE;
        f30738h = new ro0.d[]{companion.serializer(), companion.serializer(), null, null, companion.serializer(), new C4134zw(), null};
    }

    public /* synthetic */ AccordionElement(int i11, ColorElement colorElement, ColorElement colorElement2, TextElement textElement, TextElement textElement2, ColorElement colorElement3, int i12, BorderElement borderElement, vo0.v1 v1Var) {
        if (127 != (i11 & 127)) {
            vo0.h1.b(i11, 127, a.f30746a.getDescriptor());
        }
        this.background = colorElement;
        this.separator = colorElement2;
        this.title = textElement;
        this.message = textElement2;
        this.icon = colorElement3;
        this.radius = i12;
        this.border = borderElement;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccordionElement)) {
            return false;
        }
        AccordionElement accordionElement = (AccordionElement) other;
        return p013kotlin.jvm.internal.s.f(this.background, accordionElement.background) && p013kotlin.jvm.internal.s.f(this.separator, accordionElement.separator) && p013kotlin.jvm.internal.s.f(this.title, accordionElement.title) && p013kotlin.jvm.internal.s.f(this.message, accordionElement.message) && p013kotlin.jvm.internal.s.f(this.icon, accordionElement.icon) && this.radius == accordionElement.radius && p013kotlin.jvm.internal.s.f(this.border, accordionElement.border);
    }

    public int hashCode() {
        return (((((((((((this.background.hashCode() * 31) + this.separator.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.radius)) * 31) + this.border.hashCode();
    }

    public String toString() {
        return "AccordionElement(background=" + this.background + ", separator=" + this.separator + ", title=" + this.title + ", message=" + this.message + ", icon=" + this.icon + ", radius=" + this.radius + ", border=" + this.border + ")";
    }

    public AccordionElement(ColorElement background, ColorElement separator, TextElement title, TextElement message, ColorElement icon, int i11, BorderElement border) {
        p013kotlin.jvm.internal.s.k(background, "background");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(icon, "icon");
        p013kotlin.jvm.internal.s.k(border, "border");
        this.background = background;
        this.separator = separator;
        this.title = title;
        this.message = message;
        this.icon = icon;
        this.radius = i11;
        this.border = border;
    }

    public static final /* synthetic */ void a(AccordionElement self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f30738h;
        output.D(serialDesc, 0, dVarArr[0], self.background);
        output.D(serialDesc, 1, dVarArr[1], self.separator);
        TextElement.a aVar = TextElement.a.f27138a;
        output.D(serialDesc, 2, aVar, self.title);
        output.D(serialDesc, 3, aVar, self.message);
        output.D(serialDesc, 4, dVarArr[4], self.icon);
        output.D(serialDesc, 5, dVarArr[5], Integer.valueOf(self.radius));
        output.D(serialDesc, 6, BorderElement.a.f33502a, self.border);
    }
}
