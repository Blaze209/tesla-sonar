package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mz, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0004 $\u0013%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u0013\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/mz;", "", "Lcom/fourthline/orca/internal/mz$b;", "default", "Lcom/fourthline/orca/internal/mz$c;", "disabled", "<init>", "(Lcom/fourthline/orca/internal/mz$b;Lcom/fourthline/orca/internal/mz$c;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/mz$b;Lcom/fourthline/orca/internal/mz$c;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mz;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/mz$b;", "()Lcom/fourthline/orca/internal/mz$b;", "b", "Lcom/fourthline/orca/internal/mz$c;", "()Lcom/fourthline/orca/internal/mz$c;", "Companion", "c", DateTokenConverter.CONVERTER_KEY, "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class StatefulCheckboxElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CheckboxElement default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckboxElementButReallyOnlyOpacity disabled;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mz$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33741b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f33740a = aVar;
            f33741b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.StatefulCheckboxElement", aVar, 2);
            m1Var.o("default", false);
            m1Var.o("disabled", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StatefulCheckboxElement deserialize(uo0.e decoder) {
            CheckboxElement checkboxElement;
            CheckboxElementButReallyOnlyOpacity checkboxElementButReallyOnlyOpacity;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                checkboxElement = (CheckboxElement) cVarB.n(fVar, 0, CheckboxElement.a.f33746a, null);
                checkboxElementButReallyOnlyOpacity = (CheckboxElementButReallyOnlyOpacity) cVarB.n(fVar, 1, CheckboxElementButReallyOnlyOpacity.a.f33749a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                checkboxElement = null;
                CheckboxElementButReallyOnlyOpacity checkboxElementButReallyOnlyOpacity2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        checkboxElement = (CheckboxElement) cVarB.n(fVar, 0, CheckboxElement.a.f33746a, checkboxElement);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        checkboxElementButReallyOnlyOpacity2 = (CheckboxElementButReallyOnlyOpacity) cVarB.n(fVar, 1, CheckboxElementButReallyOnlyOpacity.a.f33749a, checkboxElementButReallyOnlyOpacity2);
                        i12 |= 2;
                    }
                }
                checkboxElementButReallyOnlyOpacity = checkboxElementButReallyOnlyOpacity2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new StatefulCheckboxElement(i11, checkboxElement, checkboxElementButReallyOnlyOpacity, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{CheckboxElement.a.f33746a, CheckboxElementButReallyOnlyOpacity.a.f33749a};
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
        public final void serialize(uo0.f encoder, StatefulCheckboxElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            StatefulCheckboxElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mz$b, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u0014\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/fourthline/orca/internal/mz$b;", "", "Lcom/fourthline/orca/internal/g4;", "highlight", AppStateModule.APP_STATE_BACKGROUND, "", "opacity", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;F)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;FLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mz$b;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "c", "()Lcom/fourthline/orca/internal/g4;", "b", Gender.FEMALE, "getOpacity", "()F", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class CheckboxElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ro0.d[] f33742d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement highlight;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement background;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float opacity;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mz$b$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33746a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33747b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33746a = aVar;
                f33747b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.StatefulCheckboxElement.CheckboxElement", aVar, 3);
                m1Var.o("highlight", false);
                m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
                m1Var.o("opacity", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CheckboxElement deserialize(uo0.e decoder) {
                float fD;
                int i11;
                ColorElement colorElement;
                ColorElement colorElement2;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = CheckboxElement.f33742d;
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
                return new CheckboxElement(i11, colorElement, colorElement2, fD, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = CheckboxElement.f33742d;
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
            public final void serialize(uo0.f encoder, CheckboxElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                CheckboxElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mz$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<CheckboxElement> serializer() {
                return a.f33746a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            ColorElement.Companion companion = ColorElement.INSTANCE;
            f33742d = new ro0.d[]{companion.serializer(), companion.serializer(), null};
        }

        public /* synthetic */ CheckboxElement(int i11, ColorElement colorElement, ColorElement colorElement2, float f11, vo0.v1 v1Var) {
            if (7 != (i11 & 7)) {
                vo0.h1.b(i11, 7, a.f33746a.getDescriptor());
            }
            this.highlight = colorElement;
            this.background = colorElement2;
            this.opacity = f11;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColorElement getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ColorElement getHighlight() {
            return this.highlight;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckboxElement)) {
                return false;
            }
            CheckboxElement checkboxElement = (CheckboxElement) other;
            return p013kotlin.jvm.internal.s.f(this.highlight, checkboxElement.highlight) && p013kotlin.jvm.internal.s.f(this.background, checkboxElement.background) && Float.compare(this.opacity, checkboxElement.opacity) == 0;
        }

        public int hashCode() {
            return (((this.highlight.hashCode() * 31) + this.background.hashCode()) * 31) + Float.hashCode(this.opacity);
        }

        public String toString() {
            return "CheckboxElement(highlight=" + this.highlight + ", background=" + this.background + ", opacity=" + this.opacity + ")";
        }

        public CheckboxElement(ColorElement highlight, ColorElement background, float f11) {
            p013kotlin.jvm.internal.s.k(highlight, "highlight");
            p013kotlin.jvm.internal.s.k(background, "background");
            this.highlight = highlight;
            this.background = background;
            this.opacity = f11;
        }

        public static final /* synthetic */ void a(CheckboxElement self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f33742d;
            output.D(serialDesc, 0, dVarArr[0], self.highlight);
            output.D(serialDesc, 1, dVarArr[1], self.background);
            output.i(serialDesc, 2, self.opacity);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mz$c, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0011\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0011\u0010\u001d¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/mz$c;", "", "", "opacity", "<init>", "(F)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IFLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mz$c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Gender.FEMALE, "()F", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class CheckboxElementButReallyOnlyOpacity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float opacity;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mz$c$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33749a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33750b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33749a = aVar;
                f33750b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.StatefulCheckboxElement.CheckboxElementButReallyOnlyOpacity", aVar, 1);
                m1Var.o("opacity", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CheckboxElementButReallyOnlyOpacity deserialize(uo0.e decoder) {
                float fD;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    fD = cVarB.D(fVar, 0);
                } else {
                    fD = BitmapDescriptorFactory.HUE_RED;
                    boolean z11 = true;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            fD = cVarB.D(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new CheckboxElementButReallyOnlyOpacity(i11, fD, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.d0.f119601a};
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
            public final void serialize(uo0.f encoder, CheckboxElementButReallyOnlyOpacity value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                CheckboxElementButReallyOnlyOpacity.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mz$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<CheckboxElementButReallyOnlyOpacity> serializer() {
                return a.f33749a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CheckboxElementButReallyOnlyOpacity(int i11, float f11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f33749a.getDescriptor());
            }
            this.opacity = f11;
        }

        public static final /* synthetic */ void a(CheckboxElementButReallyOnlyOpacity self, uo0.d output, to0.f serialDesc) {
            output.i(serialDesc, 0, self.opacity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckboxElementButReallyOnlyOpacity) && Float.compare(this.opacity, ((CheckboxElementButReallyOnlyOpacity) other).opacity) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.opacity);
        }

        public String toString() {
            return "CheckboxElementButReallyOnlyOpacity(opacity=" + this.opacity + ")";
        }

        public CheckboxElementButReallyOnlyOpacity(float f11) {
            this.opacity = f11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getOpacity() {
            return this.opacity;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mz$d, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<StatefulCheckboxElement> serializer() {
            return a.f33740a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StatefulCheckboxElement(int i11, CheckboxElement checkboxElement, CheckboxElementButReallyOnlyOpacity checkboxElementButReallyOnlyOpacity, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f33740a.getDescriptor());
        }
        this.default = checkboxElement;
        this.disabled = checkboxElementButReallyOnlyOpacity;
    }

    public static final /* synthetic */ void a(StatefulCheckboxElement self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, CheckboxElement.a.f33746a, self.default);
        output.D(serialDesc, 1, CheckboxElementButReallyOnlyOpacity.a.f33749a, self.disabled);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CheckboxElementButReallyOnlyOpacity getDisabled() {
        return this.disabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatefulCheckboxElement)) {
            return false;
        }
        StatefulCheckboxElement statefulCheckboxElement = (StatefulCheckboxElement) other;
        return p013kotlin.jvm.internal.s.f(this.default, statefulCheckboxElement.default) && p013kotlin.jvm.internal.s.f(this.disabled, statefulCheckboxElement.disabled);
    }

    public int hashCode() {
        return (this.default.hashCode() * 31) + this.disabled.hashCode();
    }

    public String toString() {
        return "StatefulCheckboxElement(default=" + this.default + ", disabled=" + this.disabled + ")";
    }

    public StatefulCheckboxElement(CheckboxElement checkboxElement, CheckboxElementButReallyOnlyOpacity disabled) {
        p013kotlin.jvm.internal.s.k(checkboxElement, "default");
        p013kotlin.jvm.internal.s.k(disabled, "disabled");
        this.default = checkboxElement;
        this.disabled = disabled;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CheckboxElement getDefault() {
        return this.default;
    }
}
