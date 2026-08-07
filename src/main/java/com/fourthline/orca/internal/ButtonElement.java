package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.D3, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u0000 42\u00020\u0001:\u0002\u0019(B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBK\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b,\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b/\u00103¨\u00065"}, d2 = {"Lcom/fourthline/orca/internal/D3;", "", "Lcom/fourthline/orca/internal/Us;", "spinner", "Lcom/fourthline/orca/internal/OA;", "text", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/fourthline/orca/internal/m3;", "border", "", "opacity", "<init>", "(Lcom/fourthline/orca/internal/Us;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/m3;F)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/Us;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/m3;FLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/D3;Luo0/d;Lto0/f;)V", "(Lcom/fourthline/orca/internal/Us;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/m3;F)Lcom/fourthline/orca/internal/D3;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/Us;", "e", "()Lcom/fourthline/orca/internal/Us;", "b", "Lcom/fourthline/orca/internal/OA;", "f", "()Lcom/fourthline/orca/internal/OA;", "c", "Lcom/fourthline/orca/internal/g4;", "()Lcom/fourthline/orca/internal/g4;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/m3;", "()Lcom/fourthline/orca/internal/m3;", Gender.FEMALE, "()F", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class ButtonElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f25306f = {null, null, ColorElement.INSTANCE.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProgressElement spinner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement background;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BorderElement border;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float opacity;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.D3$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f25313b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f25312a = aVar;
            f25313b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.ButtonElement", aVar, 5);
            m1Var.o("spinner", true);
            m1Var.o("text", false);
            m1Var.o(AppStateModule.APP_STATE_BACKGROUND, true);
            m1Var.o("border", true);
            m1Var.o("opacity", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ButtonElement deserialize(uo0.e decoder) {
            float fD;
            int i11;
            ProgressElement progressElement;
            TextElement textElement;
            ColorElement colorElement;
            BorderElement borderElement;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = ButtonElement.f25306f;
            if (cVarB.i()) {
                ProgressElement progressElement2 = (ProgressElement) cVarB.n(fVar, 0, ProgressElement.a.f28850a, null);
                TextElement textElement2 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, null);
                colorElement = (ColorElement) cVarB.n(fVar, 2, dVarArr[2], null);
                progressElement = progressElement2;
                borderElement = (BorderElement) cVarB.n(fVar, 3, BorderElement.a.f33502a, null);
                fD = cVarB.D(fVar, 4);
                i11 = 31;
                textElement = textElement2;
            } else {
                float fD2 = BitmapDescriptorFactory.HUE_RED;
                boolean z11 = true;
                ProgressElement progressElement3 = null;
                TextElement textElement3 = null;
                ColorElement colorElement2 = null;
                BorderElement borderElement2 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        progressElement3 = (ProgressElement) cVarB.n(fVar, 0, ProgressElement.a.f28850a, progressElement3);
                        i12 |= 1;
                    } else if (iA == 1) {
                        textElement3 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, textElement3);
                        i12 |= 2;
                    } else if (iA == 2) {
                        colorElement2 = (ColorElement) cVarB.n(fVar, 2, dVarArr[2], colorElement2);
                        i12 |= 4;
                    } else if (iA == 3) {
                        borderElement2 = (BorderElement) cVarB.n(fVar, 3, BorderElement.a.f33502a, borderElement2);
                        i12 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        fD2 = cVarB.D(fVar, 4);
                        i12 |= 16;
                    }
                }
                fD = fD2;
                i11 = i12;
                progressElement = progressElement3;
                textElement = textElement3;
                colorElement = colorElement2;
                borderElement = borderElement2;
            }
            cVarB.c(fVar);
            return new ButtonElement(i11, progressElement, textElement, colorElement, borderElement, fD, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{ProgressElement.a.f28850a, TextElement.a.f27138a, ButtonElement.f25306f[2], BorderElement.a.f33502a, vo0.d0.f119601a};
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
        public final void serialize(uo0.f encoder, ButtonElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            ButtonElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.D3$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<ButtonElement> serializer() {
            return a.f25312a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ButtonElement(int i11, ProgressElement progressElement, TextElement textElement, ColorElement colorElement, BorderElement borderElement, float f11, vo0.v1 v1Var) {
        if (18 != (i11 & 18)) {
            vo0.h1.b(i11, 18, a.f25312a.getDescriptor());
        }
        this.spinner = (i11 & 1) == 0 ? ProgressElement.INSTANCE.a() : progressElement;
        this.text = textElement;
        if ((i11 & 4) == 0) {
            this.background = ColorElement.INSTANCE.b();
        } else {
            this.background = colorElement;
        }
        if ((i11 & 8) == 0) {
            this.border = BorderElement.INSTANCE.a();
        } else {
            this.border = borderElement;
        }
        this.opacity = f11;
    }

    public final ButtonElement a(ProgressElement spinner, TextElement text, ColorElement background, BorderElement border, float opacity) {
        p013kotlin.jvm.internal.s.k(spinner, "spinner");
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(background, "background");
        p013kotlin.jvm.internal.s.k(border, "border");
        return new ButtonElement(spinner, text, background, border, opacity);
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
    public final float getOpacity() {
        return this.opacity;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ProgressElement getSpinner() {
        return this.spinner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonElement)) {
            return false;
        }
        ButtonElement buttonElement = (ButtonElement) other;
        return p013kotlin.jvm.internal.s.f(this.spinner, buttonElement.spinner) && p013kotlin.jvm.internal.s.f(this.text, buttonElement.text) && p013kotlin.jvm.internal.s.f(this.background, buttonElement.background) && p013kotlin.jvm.internal.s.f(this.border, buttonElement.border) && Float.compare(this.opacity, buttonElement.opacity) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextElement getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((this.spinner.hashCode() * 31) + this.text.hashCode()) * 31) + this.background.hashCode()) * 31) + this.border.hashCode()) * 31) + Float.hashCode(this.opacity);
    }

    public String toString() {
        return "ButtonElement(spinner=" + this.spinner + ", text=" + this.text + ", background=" + this.background + ", border=" + this.border + ", opacity=" + this.opacity + ")";
    }

    public static /* synthetic */ ButtonElement a(ButtonElement buttonElement, ProgressElement progressElement, TextElement textElement, ColorElement colorElement, BorderElement borderElement, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            progressElement = buttonElement.spinner;
        }
        if ((i11 & 2) != 0) {
            textElement = buttonElement.text;
        }
        if ((i11 & 4) != 0) {
            colorElement = buttonElement.background;
        }
        if ((i11 & 8) != 0) {
            borderElement = buttonElement.border;
        }
        if ((i11 & 16) != 0) {
            f11 = buttonElement.opacity;
        }
        float f12 = f11;
        ColorElement colorElement2 = colorElement;
        return buttonElement.a(progressElement, textElement, colorElement2, borderElement, f12);
    }

    public static final /* synthetic */ void a(ButtonElement self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f25306f;
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.spinner, ProgressElement.INSTANCE.a())) {
            output.D(serialDesc, 0, ProgressElement.a.f28850a, self.spinner);
        }
        output.D(serialDesc, 1, TextElement.a.f27138a, self.text);
        if (output.G(serialDesc, 2) || !p013kotlin.jvm.internal.s.f(self.background, ColorElement.INSTANCE.b())) {
            output.D(serialDesc, 2, dVarArr[2], self.background);
        }
        if (output.G(serialDesc, 3) || !p013kotlin.jvm.internal.s.f(self.border, BorderElement.INSTANCE.a())) {
            output.D(serialDesc, 3, BorderElement.a.f33502a, self.border);
        }
        output.i(serialDesc, 4, self.opacity);
    }

    public ButtonElement(ProgressElement spinner, TextElement text, ColorElement background, BorderElement border, float f11) {
        p013kotlin.jvm.internal.s.k(spinner, "spinner");
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(background, "background");
        p013kotlin.jvm.internal.s.k(border, "border");
        this.spinner = spinner;
        this.text = text;
        this.background = background;
        this.border = border;
        this.opacity = f11;
    }

    public /* synthetic */ ButtonElement(ProgressElement progressElement, TextElement textElement, ColorElement colorElement, BorderElement borderElement, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ProgressElement.INSTANCE.a() : progressElement, textElement, (i11 & 4) != 0 ? ColorElement.INSTANCE.b() : colorElement, (i11 & 8) != 0 ? BorderElement.INSTANCE.a() : borderElement, f11);
    }
}
