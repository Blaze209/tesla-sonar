package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pz, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0004%&\u0013 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u0013\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/fourthline/orca/internal/pz;", "", "Lcom/fourthline/orca/internal/pz$c;", "default", "Lcom/fourthline/orca/internal/pz$d;", "disabled", "<init>", "(Lcom/fourthline/orca/internal/pz$c;Lcom/fourthline/orca/internal/pz$d;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/pz$c;Lcom/fourthline/orca/internal/pz$d;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/pz;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/pz$c;", "()Lcom/fourthline/orca/internal/pz$c;", "b", "Lcom/fourthline/orca/internal/pz$d;", "getDisabled", "()Lcom/fourthline/orca/internal/pz$d;", "Companion", "c", DateTokenConverter.CONVERTER_KEY, "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class StatefulRadioCellElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final RadioCellElement default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final RadioCellElementButReallyOnlyOpacity disabled;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34670b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f34669a = aVar;
            f34670b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.StatefulRadioCellElement", aVar, 2);
            m1Var.o("default", false);
            m1Var.o("disabled", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StatefulRadioCellElement deserialize(uo0.e decoder) {
            RadioCellElement radioCellElement;
            RadioCellElementButReallyOnlyOpacity radioCellElementButReallyOnlyOpacity;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                radioCellElement = (RadioCellElement) cVarB.n(fVar, 0, RadioCellElement.a.f34681a, null);
                radioCellElementButReallyOnlyOpacity = (RadioCellElementButReallyOnlyOpacity) cVarB.n(fVar, 1, RadioCellElementButReallyOnlyOpacity.a.f34689a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                radioCellElement = null;
                RadioCellElementButReallyOnlyOpacity radioCellElementButReallyOnlyOpacity2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        radioCellElement = (RadioCellElement) cVarB.n(fVar, 0, RadioCellElement.a.f34681a, radioCellElement);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        radioCellElementButReallyOnlyOpacity2 = (RadioCellElementButReallyOnlyOpacity) cVarB.n(fVar, 1, RadioCellElementButReallyOnlyOpacity.a.f34689a, radioCellElementButReallyOnlyOpacity2);
                        i12 |= 2;
                    }
                }
                radioCellElementButReallyOnlyOpacity = radioCellElementButReallyOnlyOpacity2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new StatefulRadioCellElement(i11, radioCellElement, radioCellElementButReallyOnlyOpacity, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{RadioCellElement.a.f34681a, RadioCellElementButReallyOnlyOpacity.a.f34689a};
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
        public final void serialize(uo0.f encoder, StatefulRadioCellElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            StatefulRadioCellElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<StatefulRadioCellElement> serializer() {
            return a.f34669a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$c, reason: from toString */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0003/ ,Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012(\u0010\u0010\u001a$0\u000bj\u0011`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bq\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b3\u00106R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R9\u0010\u0010\u001a$0\u000bj\u0011`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010&R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/fourthline/orca/internal/pz$c;", "", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "shadow", "Lcom/fourthline/orca/internal/pz$c$c;", "toggle", "Lcom/fourthline/orca/internal/OA;", "text", "subtitle", "subline", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/zw;", "radius", "icon", "", "opacity", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/pz$c$c;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;ILcom/fourthline/orca/internal/g4;F)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/pz$c$c;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;ILcom/fourthline/orca/internal/g4;FLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/pz$c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "b", "()Lcom/fourthline/orca/internal/g4;", "getShadow", "c", "Lcom/fourthline/orca/internal/pz$c$c;", "getToggle", "()Lcom/fourthline/orca/internal/pz$c$c;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/OA;", "e", "()Lcom/fourthline/orca/internal/OA;", "f", "getSubline", "g", "I", "getRadius", "h", IntegerTokenConverter.CONVERTER_KEY, Gender.FEMALE, "getOpacity", "()F", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class RadioCellElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final ro0.d[] f34671j;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement shadow;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ToggleElement toggle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement text;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement subtitle;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement subline;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int radius;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement icon;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final float opacity;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$c$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34681a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f34682b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f34681a = aVar;
                f34682b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.StatefulRadioCellElement.RadioCellElement", aVar, 9);
                m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
                m1Var.o("shadow", false);
                m1Var.o("toggle", false);
                m1Var.o("text", false);
                m1Var.o("subtitle", false);
                m1Var.o("subline", false);
                m1Var.o("radius", false);
                m1Var.o("icon", false);
                m1Var.o("opacity", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RadioCellElement deserialize(uo0.e decoder) {
                float fD;
                ColorElement colorElement;
                TextElement textElement;
                TextElement textElement2;
                TextElement textElement3;
                ToggleElement toggleElement;
                ColorElement colorElement2;
                int i11;
                int i12;
                ColorElement colorElement3;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = RadioCellElement.f34671j;
                int i13 = 8;
                int i14 = 6;
                if (cVarB.i()) {
                    ColorElement colorElement4 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                    ColorElement colorElement5 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], null);
                    ToggleElement toggleElement2 = (ToggleElement) cVarB.n(fVar, 2, ToggleElement.a.f34686a, null);
                    TextElement.a aVar = TextElement.a.f27138a;
                    TextElement textElement4 = (TextElement) cVarB.n(fVar, 3, aVar, null);
                    TextElement textElement5 = (TextElement) cVarB.n(fVar, 4, aVar, null);
                    TextElement textElement6 = (TextElement) cVarB.n(fVar, 5, aVar, null);
                    int iIntValue = ((Number) cVarB.n(fVar, 6, dVarArr[6], 0)).intValue();
                    colorElement = (ColorElement) cVarB.n(fVar, 7, dVarArr[7], null);
                    colorElement3 = colorElement4;
                    textElement2 = textElement6;
                    textElement3 = textElement4;
                    fD = cVarB.D(fVar, 8);
                    textElement = textElement5;
                    toggleElement = toggleElement2;
                    i11 = 511;
                    i12 = iIntValue;
                    colorElement2 = colorElement5;
                } else {
                    float fD2 = BitmapDescriptorFactory.HUE_RED;
                    int i15 = 1;
                    boolean z11 = true;
                    int iIntValue2 = 0;
                    ColorElement colorElement6 = null;
                    TextElement textElement7 = null;
                    TextElement textElement8 = null;
                    TextElement textElement9 = null;
                    ToggleElement toggleElement3 = null;
                    ColorElement colorElement7 = null;
                    int i16 = 0;
                    ColorElement colorElement8 = null;
                    while (z11) {
                        int i17 = i14;
                        int iA = cVarB.A(fVar);
                        switch (iA) {
                            case -1:
                                z11 = false;
                                i13 = 8;
                                i14 = 6;
                                i15 = 1;
                                break;
                            case 0:
                                colorElement7 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], colorElement7);
                                i16 |= 1;
                                i13 = 8;
                                i14 = 6;
                                i15 = 1;
                                break;
                            case 1:
                                colorElement8 = (ColorElement) cVarB.n(fVar, i15, dVarArr[i15], colorElement8);
                                i16 |= 2;
                                i13 = 8;
                                i14 = 6;
                                break;
                            case 2:
                                toggleElement3 = (ToggleElement) cVarB.n(fVar, 2, ToggleElement.a.f34686a, toggleElement3);
                                i16 |= 4;
                                i13 = 8;
                                i14 = 6;
                                break;
                            case 3:
                                textElement9 = (TextElement) cVarB.n(fVar, 3, TextElement.a.f27138a, textElement9);
                                i16 |= 8;
                                i13 = 8;
                                i14 = 6;
                                break;
                            case 4:
                                textElement7 = (TextElement) cVarB.n(fVar, 4, TextElement.a.f27138a, textElement7);
                                i16 |= 16;
                                i13 = 8;
                                i14 = 6;
                                break;
                            case 5:
                                textElement8 = (TextElement) cVarB.n(fVar, 5, TextElement.a.f27138a, textElement8);
                                i16 |= 32;
                                i13 = 8;
                                i14 = 6;
                                break;
                            case 6:
                                iIntValue2 = ((Number) cVarB.n(fVar, i17, dVarArr[i17], Integer.valueOf(iIntValue2))).intValue();
                                i16 |= 64;
                                i14 = i17;
                                i13 = 8;
                                break;
                            case 7:
                                colorElement6 = (ColorElement) cVarB.n(fVar, 7, dVarArr[7], colorElement6);
                                i16 |= 128;
                                i14 = i17;
                                break;
                            case 8:
                                fD2 = cVarB.D(fVar, i13);
                                i16 |= 256;
                                i14 = i17;
                                break;
                            default:
                                throw new UnknownFieldException(iA);
                        }
                    }
                    fD = fD2;
                    colorElement = colorElement6;
                    textElement = textElement7;
                    textElement2 = textElement8;
                    textElement3 = textElement9;
                    toggleElement = toggleElement3;
                    colorElement2 = colorElement8;
                    i11 = i16;
                    i12 = iIntValue2;
                    colorElement3 = colorElement7;
                }
                cVarB.c(fVar);
                return new RadioCellElement(i11, colorElement3, colorElement2, toggleElement, textElement3, textElement, textElement2, i12, colorElement, fD, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = RadioCellElement.f34671j;
                ro0.d dVar = dVarArr[0];
                ro0.d dVar2 = dVarArr[1];
                ro0.d dVar3 = dVarArr[6];
                ro0.d dVar4 = dVarArr[7];
                TextElement.a aVar = TextElement.a.f27138a;
                return new ro0.d[]{dVar, dVar2, ToggleElement.a.f34686a, aVar, aVar, aVar, dVar3, dVar4, vo0.d0.f119601a};
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
            public final void serialize(uo0.f encoder, RadioCellElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                RadioCellElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<RadioCellElement> serializer() {
                return a.f34681a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0012 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/pz$c$c;", "", "Lcom/fourthline/orca/internal/g4;", "highlight", AppStateModule.APP_STATE_BACKGROUND, "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/pz$c$c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "getHighlight", "()Lcom/fourthline/orca/internal/g4;", "b", "getBackground", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @ro0.p
        public static final /* data */ class ToggleElement {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final ro0.d[] f34683c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ColorElement highlight;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ColorElement background;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$c$c$a */
            public /* synthetic */ class a implements vo0.e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f34686a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f34687b;
                private static final to0.f descriptor;

                static {
                    a aVar = new a();
                    f34686a = aVar;
                    f34687b = 8;
                    vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.StatefulRadioCellElement.RadioCellElement.ToggleElement", aVar, 2);
                    m1Var.o("highlight", false);
                    m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
                    descriptor = m1Var;
                }

                private a() {
                }

                @Override // ro0.c
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ToggleElement deserialize(uo0.e decoder) {
                    ColorElement colorElement;
                    ColorElement colorElement2;
                    int i11;
                    p013kotlin.jvm.internal.s.k(decoder, "decoder");
                    to0.f fVar = descriptor;
                    uo0.c cVarB = decoder.b(fVar);
                    ro0.d[] dVarArr = ToggleElement.f34683c;
                    vo0.v1 v1Var = null;
                    if (cVarB.i()) {
                        colorElement2 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                        colorElement = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], null);
                        i11 = 3;
                    } else {
                        boolean z11 = true;
                        int i12 = 0;
                        ColorElement colorElement3 = null;
                        ColorElement colorElement4 = null;
                        while (z11) {
                            int iA = cVarB.A(fVar);
                            if (iA == -1) {
                                z11 = false;
                            } else if (iA == 0) {
                                colorElement4 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], colorElement4);
                                i12 |= 1;
                            } else {
                                if (iA != 1) {
                                    throw new UnknownFieldException(iA);
                                }
                                colorElement3 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], colorElement3);
                                i12 |= 2;
                            }
                        }
                        colorElement = colorElement3;
                        colorElement2 = colorElement4;
                        i11 = i12;
                    }
                    cVarB.c(fVar);
                    return new ToggleElement(i11, colorElement2, colorElement, v1Var);
                }

                @Override // vo0.e0
                public final ro0.d[] childSerializers() {
                    ro0.d[] dVarArr = ToggleElement.f34683c;
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
                public final void serialize(uo0.f encoder, ToggleElement value) {
                    p013kotlin.jvm.internal.s.k(encoder, "encoder");
                    p013kotlin.jvm.internal.s.k(value, "value");
                    to0.f fVar = descriptor;
                    uo0.d dVarB = encoder.b(fVar);
                    ToggleElement.a(value, dVarB, fVar);
                    dVarB.c(fVar);
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$c$c$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public final ro0.d<ToggleElement> serializer() {
                    return a.f34686a;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            static {
                ColorElement.Companion companion = ColorElement.INSTANCE;
                f34683c = new ro0.d[]{companion.serializer(), companion.serializer()};
            }

            public /* synthetic */ ToggleElement(int i11, ColorElement colorElement, ColorElement colorElement2, vo0.v1 v1Var) {
                if (3 != (i11 & 3)) {
                    vo0.h1.b(i11, 3, a.f34686a.getDescriptor());
                }
                this.highlight = colorElement;
                this.background = colorElement2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToggleElement)) {
                    return false;
                }
                ToggleElement toggleElement = (ToggleElement) other;
                return p013kotlin.jvm.internal.s.f(this.highlight, toggleElement.highlight) && p013kotlin.jvm.internal.s.f(this.background, toggleElement.background);
            }

            public int hashCode() {
                return (this.highlight.hashCode() * 31) + this.background.hashCode();
            }

            public String toString() {
                return "ToggleElement(highlight=" + this.highlight + ", background=" + this.background + ")";
            }

            public ToggleElement(ColorElement highlight, ColorElement background) {
                p013kotlin.jvm.internal.s.k(highlight, "highlight");
                p013kotlin.jvm.internal.s.k(background, "background");
                this.highlight = highlight;
                this.background = background;
            }

            public static final /* synthetic */ void a(ToggleElement self, uo0.d output, to0.f serialDesc) {
                ro0.d[] dVarArr = f34683c;
                output.D(serialDesc, 0, dVarArr[0], self.highlight);
                output.D(serialDesc, 1, dVarArr[1], self.background);
            }
        }

        static {
            ColorElement.Companion companion = ColorElement.INSTANCE;
            f34671j = new ro0.d[]{companion.serializer(), companion.serializer(), null, null, null, null, new C4134zw(), companion.serializer(), null};
        }

        public /* synthetic */ RadioCellElement(int i11, ColorElement colorElement, ColorElement colorElement2, ToggleElement toggleElement, TextElement textElement, TextElement textElement2, TextElement textElement3, int i12, ColorElement colorElement3, float f11, vo0.v1 v1Var) {
            if (511 != (i11 & 511)) {
                vo0.h1.b(i11, 511, a.f34681a.getDescriptor());
            }
            this.background = colorElement;
            this.shadow = colorElement2;
            this.toggle = toggleElement;
            this.text = textElement;
            this.subtitle = textElement2;
            this.subline = textElement3;
            this.radius = i12;
            this.icon = colorElement3;
            this.opacity = f11;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColorElement getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ColorElement getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextElement getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextElement getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadioCellElement)) {
                return false;
            }
            RadioCellElement radioCellElement = (RadioCellElement) other;
            return p013kotlin.jvm.internal.s.f(this.background, radioCellElement.background) && p013kotlin.jvm.internal.s.f(this.shadow, radioCellElement.shadow) && p013kotlin.jvm.internal.s.f(this.toggle, radioCellElement.toggle) && p013kotlin.jvm.internal.s.f(this.text, radioCellElement.text) && p013kotlin.jvm.internal.s.f(this.subtitle, radioCellElement.subtitle) && p013kotlin.jvm.internal.s.f(this.subline, radioCellElement.subline) && this.radius == radioCellElement.radius && p013kotlin.jvm.internal.s.f(this.icon, radioCellElement.icon) && Float.compare(this.opacity, radioCellElement.opacity) == 0;
        }

        public int hashCode() {
            return (((((((((((((((this.background.hashCode() * 31) + this.shadow.hashCode()) * 31) + this.toggle.hashCode()) * 31) + this.text.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.subline.hashCode()) * 31) + Integer.hashCode(this.radius)) * 31) + this.icon.hashCode()) * 31) + Float.hashCode(this.opacity);
        }

        public String toString() {
            return "RadioCellElement(background=" + this.background + ", shadow=" + this.shadow + ", toggle=" + this.toggle + ", text=" + this.text + ", subtitle=" + this.subtitle + ", subline=" + this.subline + ", radius=" + this.radius + ", icon=" + this.icon + ", opacity=" + this.opacity + ")";
        }

        public RadioCellElement(ColorElement background, ColorElement shadow, ToggleElement toggle, TextElement text, TextElement subtitle, TextElement subline, int i11, ColorElement icon, float f11) {
            p013kotlin.jvm.internal.s.k(background, "background");
            p013kotlin.jvm.internal.s.k(shadow, "shadow");
            p013kotlin.jvm.internal.s.k(toggle, "toggle");
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
            p013kotlin.jvm.internal.s.k(subline, "subline");
            p013kotlin.jvm.internal.s.k(icon, "icon");
            this.background = background;
            this.shadow = shadow;
            this.toggle = toggle;
            this.text = text;
            this.subtitle = subtitle;
            this.subline = subline;
            this.radius = i11;
            this.icon = icon;
            this.opacity = f11;
        }

        public static final /* synthetic */ void a(RadioCellElement self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f34671j;
            output.D(serialDesc, 0, dVarArr[0], self.background);
            output.D(serialDesc, 1, dVarArr[1], self.shadow);
            output.D(serialDesc, 2, ToggleElement.a.f34686a, self.toggle);
            TextElement.a aVar = TextElement.a.f27138a;
            output.D(serialDesc, 3, aVar, self.text);
            output.D(serialDesc, 4, aVar, self.subtitle);
            output.D(serialDesc, 5, aVar, self.subline);
            output.D(serialDesc, 6, dVarArr[6], Integer.valueOf(self.radius));
            output.D(serialDesc, 7, dVarArr[7], self.icon);
            output.i(serialDesc, 8, self.opacity);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$d, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/fourthline/orca/internal/pz$d;", "", "", "opacity", "<init>", "(F)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IFLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/pz$d;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Gender.FEMALE, "getOpacity", "()F", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class RadioCellElementButReallyOnlyOpacity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float opacity;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$d$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34689a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f34690b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f34689a = aVar;
                f34690b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.StatefulRadioCellElement.RadioCellElementButReallyOnlyOpacity", aVar, 1);
                m1Var.o("opacity", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RadioCellElementButReallyOnlyOpacity deserialize(uo0.e decoder) {
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
                return new RadioCellElementButReallyOnlyOpacity(i11, fD, null);
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
            public final void serialize(uo0.f encoder, RadioCellElementButReallyOnlyOpacity value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                RadioCellElementButReallyOnlyOpacity.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pz$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<RadioCellElementButReallyOnlyOpacity> serializer() {
                return a.f34689a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ RadioCellElementButReallyOnlyOpacity(int i11, float f11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f34689a.getDescriptor());
            }
            this.opacity = f11;
        }

        public static final /* synthetic */ void a(RadioCellElementButReallyOnlyOpacity self, uo0.d output, to0.f serialDesc) {
            output.i(serialDesc, 0, self.opacity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RadioCellElementButReallyOnlyOpacity) && Float.compare(this.opacity, ((RadioCellElementButReallyOnlyOpacity) other).opacity) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.opacity);
        }

        public String toString() {
            return "RadioCellElementButReallyOnlyOpacity(opacity=" + this.opacity + ")";
        }

        public RadioCellElementButReallyOnlyOpacity(float f11) {
            this.opacity = f11;
        }
    }

    public /* synthetic */ StatefulRadioCellElement(int i11, RadioCellElement radioCellElement, RadioCellElementButReallyOnlyOpacity radioCellElementButReallyOnlyOpacity, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f34669a.getDescriptor());
        }
        this.default = radioCellElement;
        this.disabled = radioCellElementButReallyOnlyOpacity;
    }

    public static final /* synthetic */ void a(StatefulRadioCellElement self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, RadioCellElement.a.f34681a, self.default);
        output.D(serialDesc, 1, RadioCellElementButReallyOnlyOpacity.a.f34689a, self.disabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatefulRadioCellElement)) {
            return false;
        }
        StatefulRadioCellElement statefulRadioCellElement = (StatefulRadioCellElement) other;
        return p013kotlin.jvm.internal.s.f(this.default, statefulRadioCellElement.default) && p013kotlin.jvm.internal.s.f(this.disabled, statefulRadioCellElement.disabled);
    }

    public int hashCode() {
        return (this.default.hashCode() * 31) + this.disabled.hashCode();
    }

    public String toString() {
        return "StatefulRadioCellElement(default=" + this.default + ", disabled=" + this.disabled + ")";
    }

    public StatefulRadioCellElement(RadioCellElement radioCellElement, RadioCellElementButReallyOnlyOpacity disabled) {
        p013kotlin.jvm.internal.s.k(radioCellElement, "default");
        p013kotlin.jvm.internal.s.k(disabled, "disabled");
        this.default = radioCellElement;
        this.disabled = disabled;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RadioCellElement getDefault() {
        return this.default;
    }
}
