package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Us, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002\"\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/fourthline/orca/internal/Us;", "", "Lcom/fourthline/orca/internal/g4;", "highlight", AppStateModule.APP_STATE_BACKGROUND, "", "backgroundOpacity", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;F)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;FLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Us;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "e", "()Lcom/fourthline/orca/internal/g4;", "b", "c", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "()F", "getBackgroundOpacity$annotations", "()V", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class ProgressElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d[] f28845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ProgressElement f28846e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement highlight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement background;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float backgroundOpacity;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Us$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28851b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f28850a = aVar;
            f28851b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.ProgressElement", aVar, 3);
            m1Var.o("highlight", false);
            m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
            m1Var.o("background_opacity", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProgressElement deserialize(uo0.e decoder) {
            float fD;
            int i11;
            ColorElement colorElement;
            ColorElement colorElement2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = ProgressElement.f28845d;
            if (cVarB.i()) {
                ColorElement colorElement3 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                colorElement2 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], null);
                colorElement = colorElement3;
                fD = cVarB.D(fVar, 2);
                i11 = 7;
            } else {
                float fD2 = BitmapDescriptorFactory.HUE_RED;
                boolean z11 = true;
                ColorElement colorElement4 = null;
                ColorElement colorElement5 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        colorElement4 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], colorElement4);
                        i12 |= 1;
                    } else if (iA == 1) {
                        colorElement5 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], colorElement5);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        fD2 = cVarB.D(fVar, 2);
                        i12 |= 4;
                    }
                }
                fD = fD2;
                i11 = i12;
                colorElement = colorElement4;
                colorElement2 = colorElement5;
            }
            cVarB.c(fVar);
            return new ProgressElement(i11, colorElement, colorElement2, fD, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = ProgressElement.f28845d;
            return new ro0.d[]{dVarArr[0], dVarArr[1], vo0.d0.f119601a};
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
        public final void serialize(uo0.f encoder, ProgressElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            ProgressElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Us$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProgressElement a() {
            return ProgressElement.f28846e;
        }

        public final ro0.d<ProgressElement> serializer() {
            return a.f28850a;
        }

        private Companion() {
        }
    }

    static {
        ColorElement.Companion companion = ColorElement.INSTANCE;
        f28845d = new ro0.d[]{companion.serializer(), companion.serializer(), null};
        f28846e = new ProgressElement(companion.a(k3.p1.INSTANCE.k()), companion.b(), 1.0f);
    }

    public /* synthetic */ ProgressElement(int i11, ColorElement colorElement, ColorElement colorElement2, float f11, vo0.v1 v1Var) {
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f28850a.getDescriptor());
        }
        this.highlight = colorElement;
        this.background = colorElement2;
        this.backgroundOpacity = f11;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ColorElement getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getBackgroundOpacity() {
        return this.backgroundOpacity;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ColorElement getHighlight() {
        return this.highlight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressElement)) {
            return false;
        }
        ProgressElement progressElement = (ProgressElement) other;
        return p013kotlin.jvm.internal.s.f(this.highlight, progressElement.highlight) && p013kotlin.jvm.internal.s.f(this.background, progressElement.background) && Float.compare(this.backgroundOpacity, progressElement.backgroundOpacity) == 0;
    }

    public int hashCode() {
        return (((this.highlight.hashCode() * 31) + this.background.hashCode()) * 31) + Float.hashCode(this.backgroundOpacity);
    }

    public String toString() {
        return "ProgressElement(highlight=" + this.highlight + ", background=" + this.background + ", backgroundOpacity=" + this.backgroundOpacity + ")";
    }

    public ProgressElement(ColorElement highlight, ColorElement background, float f11) {
        p013kotlin.jvm.internal.s.k(highlight, "highlight");
        p013kotlin.jvm.internal.s.k(background, "background");
        this.highlight = highlight;
        this.background = background;
        this.backgroundOpacity = f11;
    }

    public static final /* synthetic */ void a(ProgressElement self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f28845d;
        output.D(serialDesc, 0, dVarArr[0], self.highlight);
        output.D(serialDesc, 1, dVarArr[1], self.background);
        output.i(serialDesc, 2, self.backgroundOpacity);
    }
}
