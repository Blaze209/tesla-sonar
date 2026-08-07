package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlinx.serialization.UnknownFieldException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.f0, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 52\u00020\u0001:\u0003(\u001c-BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012(\u0010\r\u001a$0\bj\u0011`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011BK\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R9\u0010\r\u001a$0\bj\u0011`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\b-\u00104¨\u00066"}, d2 = {"Lcom/fourthline/orca/internal/f0;", "", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/fourthline/orca/internal/OA;", AnnotatedPrivateKey.LABEL, "Lcom/fourthline/orca/internal/f0$b;", "button", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/zw;", "radius", "Lcom/fourthline/orca/internal/m3;", "border", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/f0$b;ILcom/fourthline/orca/internal/m3;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/f0$b;ILcom/fourthline/orca/internal/m3;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/f0;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "b", "()Lcom/fourthline/orca/internal/g4;", "Lcom/fourthline/orca/internal/OA;", "e", "()Lcom/fourthline/orca/internal/OA;", "c", "Lcom/fourthline/orca/internal/f0$b;", DateTokenConverter.CONVERTER_KEY, "()Lcom/fourthline/orca/internal/f0$b;", "I", "f", "Lcom/fourthline/orca/internal/m3;", "()Lcom/fourthline/orca/internal/m3;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class AgreementsElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f31562f = {ColorElement.INSTANCE.serializer(), null, null, new C4134zw(), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AgreementsButtonElement button;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int radius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BorderElement border;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.f0$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31569b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f31568a = aVar;
            f31569b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.AgreementsElement", aVar, 5);
            m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
            m1Var.o(AnnotatedPrivateKey.LABEL, false);
            m1Var.o("button", false);
            m1Var.o("radius", false);
            m1Var.o("border", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AgreementsElement deserialize(uo0.e decoder) {
            int iIntValue;
            int i11;
            ColorElement colorElement;
            TextElement textElement;
            AgreementsButtonElement agreementsButtonElement;
            BorderElement borderElement;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = AgreementsElement.f31562f;
            int i12 = 0;
            if (cVarB.i()) {
                ColorElement colorElement2 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                TextElement textElement2 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, null);
                AgreementsButtonElement agreementsButtonElement2 = (AgreementsButtonElement) cVarB.n(fVar, 2, AgreementsButtonElement.a.f31576a, null);
                iIntValue = ((Number) cVarB.n(fVar, 3, dVarArr[3], 0)).intValue();
                colorElement = colorElement2;
                borderElement = (BorderElement) cVarB.n(fVar, 4, BorderElement.a.f33502a, null);
                agreementsButtonElement = agreementsButtonElement2;
                i11 = 31;
                textElement = textElement2;
            } else {
                int i13 = 1;
                int iIntValue2 = 0;
                ColorElement colorElement3 = null;
                TextElement textElement3 = null;
                AgreementsButtonElement agreementsButtonElement3 = null;
                BorderElement borderElement2 = null;
                int i14 = 0;
                while (i13 != 0) {
                    int iA = cVarB.A(fVar);
                    int i15 = i12;
                    if (iA == -1) {
                        i12 = i15;
                        i13 = i12;
                    } else if (iA != 0) {
                        if (iA == 1) {
                            textElement3 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, textElement3);
                            i14 |= 2;
                        } else if (iA == 2) {
                            agreementsButtonElement3 = (AgreementsButtonElement) cVarB.n(fVar, 2, AgreementsButtonElement.a.f31576a, agreementsButtonElement3);
                            i14 |= 4;
                        } else if (iA == 3) {
                            iIntValue2 = ((Number) cVarB.n(fVar, 3, dVarArr[3], Integer.valueOf(iIntValue2))).intValue();
                            i14 |= 8;
                        } else {
                            if (iA != 4) {
                                throw new UnknownFieldException(iA);
                            }
                            borderElement2 = (BorderElement) cVarB.n(fVar, 4, BorderElement.a.f33502a, borderElement2);
                            i14 |= 16;
                        }
                        i12 = i15;
                    } else {
                        colorElement3 = (ColorElement) cVarB.n(fVar, i15, dVarArr[i15], colorElement3);
                        i14 |= 1;
                        i12 = i15;
                    }
                }
                iIntValue = iIntValue2;
                i11 = i14;
                colorElement = colorElement3;
                textElement = textElement3;
                agreementsButtonElement = agreementsButtonElement3;
                borderElement = borderElement2;
            }
            cVarB.c(fVar);
            return new AgreementsElement(i11, colorElement, textElement, agreementsButtonElement, iIntValue, borderElement, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = AgreementsElement.f31562f;
            return new ro0.d[]{dVarArr[0], TextElement.a.f27138a, AgreementsButtonElement.a.f31576a, dVarArr[3], BorderElement.a.f33502a};
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
        public final void serialize(uo0.f encoder, AgreementsElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            AgreementsElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.f0$b, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0002\u001b'BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012(\u0010\u000e\u001a$0\tj\u0011`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000f\u0010\u0010BK\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b/\u0010(R9\u0010\u000e\u001a$0\tj\u0011`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u0010!¨\u00063"}, d2 = {"Lcom/fourthline/orca/internal/f0$b;", "", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/fourthline/orca/internal/OA;", "text", "Lcom/fourthline/orca/internal/m3;", "border", "icon", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/zw;", "radius", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/m3;Lcom/fourthline/orca/internal/g4;I)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/m3;Lcom/fourthline/orca/internal/g4;ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/f0$b;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "b", "()Lcom/fourthline/orca/internal/g4;", "Lcom/fourthline/orca/internal/OA;", "f", "()Lcom/fourthline/orca/internal/OA;", "c", "Lcom/fourthline/orca/internal/m3;", "()Lcom/fourthline/orca/internal/m3;", DateTokenConverter.CONVERTER_KEY, "e", "I", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class AgreementsButtonElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ro0.d[] f31570f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement text;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BorderElement border;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement icon;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int radius;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.f0$b$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31576a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f31577b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f31576a = aVar;
                f31577b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.AgreementsElement.AgreementsButtonElement", aVar, 5);
                m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
                m1Var.o("text", false);
                m1Var.o("border", false);
                m1Var.o("icon", false);
                m1Var.o("radius", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AgreementsButtonElement deserialize(uo0.e decoder) {
                int iIntValue;
                int i11;
                ColorElement colorElement;
                TextElement textElement;
                BorderElement borderElement;
                ColorElement colorElement2;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = AgreementsButtonElement.f31570f;
                int i12 = 0;
                if (cVarB.i()) {
                    ColorElement colorElement3 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                    TextElement textElement2 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, null);
                    BorderElement borderElement2 = (BorderElement) cVarB.n(fVar, 2, BorderElement.a.f33502a, null);
                    ColorElement colorElement4 = (ColorElement) cVarB.n(fVar, 3, dVarArr[3], null);
                    iIntValue = ((Number) cVarB.n(fVar, 4, dVarArr[4], 0)).intValue();
                    colorElement = colorElement3;
                    borderElement = borderElement2;
                    colorElement2 = colorElement4;
                    i11 = 31;
                    textElement = textElement2;
                } else {
                    int i13 = 1;
                    int iIntValue2 = 0;
                    ColorElement colorElement5 = null;
                    TextElement textElement3 = null;
                    BorderElement borderElement3 = null;
                    ColorElement colorElement6 = null;
                    int i14 = 0;
                    while (i13 != 0) {
                        int iA = cVarB.A(fVar);
                        int i15 = i12;
                        if (iA == -1) {
                            i12 = i15;
                            i13 = i12;
                        } else if (iA != 0) {
                            if (iA == 1) {
                                textElement3 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, textElement3);
                                i14 |= 2;
                            } else if (iA == 2) {
                                borderElement3 = (BorderElement) cVarB.n(fVar, 2, BorderElement.a.f33502a, borderElement3);
                                i14 |= 4;
                            } else if (iA == 3) {
                                colorElement6 = (ColorElement) cVarB.n(fVar, 3, dVarArr[3], colorElement6);
                                i14 |= 8;
                            } else {
                                if (iA != 4) {
                                    throw new UnknownFieldException(iA);
                                }
                                iIntValue2 = ((Number) cVarB.n(fVar, 4, dVarArr[4], Integer.valueOf(iIntValue2))).intValue();
                                i14 |= 16;
                            }
                            i12 = i15;
                        } else {
                            colorElement5 = (ColorElement) cVarB.n(fVar, i15, dVarArr[i15], colorElement5);
                            i14 |= 1;
                            i12 = i15;
                        }
                    }
                    iIntValue = iIntValue2;
                    i11 = i14;
                    colorElement = colorElement5;
                    textElement = textElement3;
                    borderElement = borderElement3;
                    colorElement2 = colorElement6;
                }
                cVarB.c(fVar);
                return new AgreementsButtonElement(i11, colorElement, textElement, borderElement, colorElement2, iIntValue, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = AgreementsButtonElement.f31570f;
                return new ro0.d[]{dVarArr[0], TextElement.a.f27138a, BorderElement.a.f33502a, dVarArr[3], dVarArr[4]};
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
            public final void serialize(uo0.f encoder, AgreementsButtonElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                AgreementsButtonElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.f0$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<AgreementsButtonElement> serializer() {
                return a.f31576a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            ColorElement.Companion companion = ColorElement.INSTANCE;
            f31570f = new ro0.d[]{companion.serializer(), null, null, companion.serializer(), new C4134zw()};
        }

        public /* synthetic */ AgreementsButtonElement(int i11, ColorElement colorElement, TextElement textElement, BorderElement borderElement, ColorElement colorElement2, int i12, vo0.v1 v1Var) {
            if (31 != (i11 & 31)) {
                vo0.h1.b(i11, 31, a.f31576a.getDescriptor());
            }
            this.background = colorElement;
            this.text = textElement;
            this.border = borderElement;
            this.icon = colorElement2;
            this.radius = i12;
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
        public final ColorElement getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getRadius() {
            return this.radius;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AgreementsButtonElement)) {
                return false;
            }
            AgreementsButtonElement agreementsButtonElement = (AgreementsButtonElement) other;
            return p013kotlin.jvm.internal.s.f(this.background, agreementsButtonElement.background) && p013kotlin.jvm.internal.s.f(this.text, agreementsButtonElement.text) && p013kotlin.jvm.internal.s.f(this.border, agreementsButtonElement.border) && p013kotlin.jvm.internal.s.f(this.icon, agreementsButtonElement.icon) && this.radius == agreementsButtonElement.radius;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextElement getText() {
            return this.text;
        }

        public int hashCode() {
            return (((((((this.background.hashCode() * 31) + this.text.hashCode()) * 31) + this.border.hashCode()) * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.radius);
        }

        public String toString() {
            return "AgreementsButtonElement(background=" + this.background + ", text=" + this.text + ", border=" + this.border + ", icon=" + this.icon + ", radius=" + this.radius + ")";
        }

        public AgreementsButtonElement(ColorElement background, TextElement text, BorderElement border, ColorElement icon, int i11) {
            p013kotlin.jvm.internal.s.k(background, "background");
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(border, "border");
            p013kotlin.jvm.internal.s.k(icon, "icon");
            this.background = background;
            this.text = text;
            this.border = border;
            this.icon = icon;
            this.radius = i11;
        }

        public static final /* synthetic */ void a(AgreementsButtonElement self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f31570f;
            output.D(serialDesc, 0, dVarArr[0], self.background);
            output.D(serialDesc, 1, TextElement.a.f27138a, self.text);
            output.D(serialDesc, 2, BorderElement.a.f33502a, self.border);
            output.D(serialDesc, 3, dVarArr[3], self.icon);
            output.D(serialDesc, 4, dVarArr[4], Integer.valueOf(self.radius));
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.f0$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<AgreementsElement> serializer() {
            return a.f31568a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AgreementsElement(int i11, ColorElement colorElement, TextElement textElement, AgreementsButtonElement agreementsButtonElement, int i12, BorderElement borderElement, vo0.v1 v1Var) {
        if (31 != (i11 & 31)) {
            vo0.h1.b(i11, 31, a.f31568a.getDescriptor());
        }
        this.background = colorElement;
        this.label = textElement;
        this.button = agreementsButtonElement;
        this.radius = i12;
        this.border = borderElement;
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
    public final AgreementsButtonElement getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextElement getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementsElement)) {
            return false;
        }
        AgreementsElement agreementsElement = (AgreementsElement) other;
        return p013kotlin.jvm.internal.s.f(this.background, agreementsElement.background) && p013kotlin.jvm.internal.s.f(this.label, agreementsElement.label) && p013kotlin.jvm.internal.s.f(this.button, agreementsElement.button) && this.radius == agreementsElement.radius && p013kotlin.jvm.internal.s.f(this.border, agreementsElement.border);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return (((((((this.background.hashCode() * 31) + this.label.hashCode()) * 31) + this.button.hashCode()) * 31) + Integer.hashCode(this.radius)) * 31) + this.border.hashCode();
    }

    public String toString() {
        return "AgreementsElement(background=" + this.background + ", label=" + this.label + ", button=" + this.button + ", radius=" + this.radius + ", border=" + this.border + ")";
    }

    public AgreementsElement(ColorElement background, TextElement label, AgreementsButtonElement button, int i11, BorderElement border) {
        p013kotlin.jvm.internal.s.k(background, "background");
        p013kotlin.jvm.internal.s.k(label, "label");
        p013kotlin.jvm.internal.s.k(button, "button");
        p013kotlin.jvm.internal.s.k(border, "border");
        this.background = background;
        this.label = label;
        this.button = button;
        this.radius = i11;
        this.border = border;
    }

    public static final /* synthetic */ void a(AgreementsElement self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f31562f;
        output.D(serialDesc, 0, dVarArr[0], self.background);
        output.D(serialDesc, 1, TextElement.a.f27138a, self.label);
        output.D(serialDesc, 2, AgreementsButtonElement.a.f31576a, self.button);
        output.D(serialDesc, 3, dVarArr[3], Integer.valueOf(self.radius));
        output.D(serialDesc, 4, BorderElement.a.f33502a, self.border);
    }
}
