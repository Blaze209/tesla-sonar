package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import expo.modules.interfaces.permissions.PermissionsResponse;
import i4.PlatformTextStyle;
import i4.TextStyle;
import k3.Shadow;
import kotlinx.serialization.UnknownFieldException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.FontWeight;
import p4.LocaleList;
import t4.LineHeightStyle;
import t4.TextGeometricTransform;
import t4.TextIndent;

/* JADX INFO: renamed from: com.fourthline.orca.internal.PA, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u0000 >2\u00020\u0001:\u00033 /Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012(\u0010\u0013\u001a$0\u000ej\u0011`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bs\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u008c\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2*\b\u0002\u0010\u0013\u001a$0\u000ej\u0011`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012HÆ\u0001¢\u0006\u0004\b \u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b5\u00108R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b9\u00108R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b/\u00108R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b3\u0010<R9\u0010\u0013\u001a$0\u000ej\u0011`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0006¢\u0006\f\n\u0004\b6\u0010=\u001a\u0004\b:\u0010'¨\u0006?"}, d2 = {"Lcom/fourthline/orca/internal/PA;", "", "Lcom/fourthline/orca/internal/PA$c;", "value", "Lcom/fourthline/orca/internal/OA;", "placeholder", AnnotatedPrivateKey.LABEL, PermissionsResponse.STATUS_KEY, "Lcom/fourthline/orca/internal/g4;", "icon", "shadow", AppStateModule.APP_STATE_BACKGROUND, "Lcom/fourthline/orca/internal/m3;", "border", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/zw;", "radius", "<init>", "(Lcom/fourthline/orca/internal/PA$c;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/m3;I)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/PA$c;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/m3;ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/PA;Luo0/d;Lto0/f;)V", "(Lcom/fourthline/orca/internal/PA$c;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/m3;I)Lcom/fourthline/orca/internal/PA;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/PA$c;", "j", "()Lcom/fourthline/orca/internal/PA$c;", "b", "Lcom/fourthline/orca/internal/OA;", "f", "()Lcom/fourthline/orca/internal/OA;", "c", "e", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/g4;", "()Lcom/fourthline/orca/internal/g4;", "h", "g", "Lcom/fourthline/orca/internal/m3;", "()Lcom/fourthline/orca/internal/m3;", "I", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class TextInputElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ro0.d[] f27302j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ValueElement value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement placeholder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement label;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement status;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement icon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement shadow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement background;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final BorderElement border;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int radius;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.PA$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27313b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f27312a = aVar;
            f27313b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.TextInputElement", aVar, 9);
            m1Var.o("value", false);
            m1Var.o("placeholder", false);
            m1Var.o(AnnotatedPrivateKey.LABEL, false);
            m1Var.o(PermissionsResponse.STATUS_KEY, false);
            m1Var.o("icon", false);
            m1Var.o("shadow", false);
            m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
            m1Var.o("border", false);
            m1Var.o("radius", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextInputElement deserialize(uo0.e decoder) {
            int iIntValue;
            ColorElement colorElement;
            ColorElement colorElement2;
            BorderElement c3540m3;
            ColorElement colorElement3;
            TextElement textElement;
            TextElement textElement2;
            int i11;
            ValueElement valueElement;
            TextElement textElement3;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = TextInputElement.f27302j;
            int i12 = 7;
            int i13 = 6;
            if (cVarB.i()) {
                ValueElement valueElement2 = (ValueElement) cVarB.n(fVar, 0, ValueElement.a.f27318a, null);
                TextElement.a aVar = TextElement.a.f27138a;
                TextElement textElement4 = (TextElement) cVarB.n(fVar, 1, aVar, null);
                TextElement textElement5 = (TextElement) cVarB.n(fVar, 2, aVar, null);
                TextElement textElement6 = (TextElement) cVarB.n(fVar, 3, aVar, null);
                ColorElement colorElement4 = (ColorElement) cVarB.n(fVar, 4, dVarArr[4], null);
                ColorElement colorElement5 = (ColorElement) cVarB.n(fVar, 5, dVarArr[5], null);
                ColorElement colorElement6 = (ColorElement) cVarB.n(fVar, 6, dVarArr[6], null);
                BorderElement c3540m4 = (BorderElement) cVarB.n(fVar, 7, BorderElement.a.f33502a, null);
                iIntValue = ((Number) cVarB.n(fVar, 8, dVarArr[8], 0)).intValue();
                valueElement = valueElement2;
                c3540m3 = c3540m4;
                textElement = textElement6;
                textElement2 = textElement5;
                colorElement3 = colorElement6;
                colorElement = colorElement5;
                i11 = 511;
                colorElement2 = colorElement4;
                textElement3 = textElement4;
            } else {
                int i14 = 5;
                int i15 = 4;
                boolean z11 = true;
                int iIntValue2 = 0;
                ColorElement colorElement7 = null;
                ColorElement colorElement8 = null;
                BorderElement c3540m5 = null;
                ColorElement colorElement9 = null;
                TextElement textElement7 = null;
                ValueElement valueElement3 = null;
                TextElement textElement8 = null;
                int i16 = 0;
                TextElement textElement9 = null;
                while (z11) {
                    int i17 = i13;
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 7;
                            i13 = 6;
                            i15 = 4;
                            i14 = 5;
                            break;
                        case 0:
                            valueElement3 = (ValueElement) cVarB.n(fVar, 0, ValueElement.a.f27318a, valueElement3);
                            i16 |= 1;
                            i12 = 7;
                            i13 = 6;
                            i15 = 4;
                            i14 = 5;
                            break;
                        case 1:
                            textElement8 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, textElement8);
                            i16 |= 2;
                            i12 = 7;
                            i13 = 6;
                            i15 = 4;
                            i14 = 5;
                            break;
                        case 2:
                            textElement9 = (TextElement) cVarB.n(fVar, 2, TextElement.a.f27138a, textElement9);
                            i16 |= 4;
                            i12 = 7;
                            i13 = 6;
                            i15 = 4;
                            i14 = 5;
                            break;
                        case 3:
                            textElement7 = (TextElement) cVarB.n(fVar, 3, TextElement.a.f27138a, textElement7);
                            i16 |= 8;
                            i12 = 7;
                            i13 = 6;
                            i15 = 4;
                            i14 = 5;
                            break;
                        case 4:
                            colorElement8 = (ColorElement) cVarB.n(fVar, i15, dVarArr[i15], colorElement8);
                            i16 |= 16;
                            i12 = 7;
                            i13 = 6;
                            i14 = 5;
                            break;
                        case 5:
                            colorElement7 = (ColorElement) cVarB.n(fVar, i14, dVarArr[i14], colorElement7);
                            i16 |= 32;
                            i12 = 7;
                            i13 = 6;
                            break;
                        case 6:
                            colorElement9 = (ColorElement) cVarB.n(fVar, i17, dVarArr[i17], colorElement9);
                            i16 |= 64;
                            i13 = i17;
                            i12 = 7;
                            break;
                        case 7:
                            c3540m5 = (BorderElement) cVarB.n(fVar, i12, BorderElement.a.f33502a, c3540m5);
                            i16 |= 128;
                            i13 = i17;
                            break;
                        case 8:
                            iIntValue2 = ((Number) cVarB.n(fVar, 8, dVarArr[8], Integer.valueOf(iIntValue2))).intValue();
                            i16 |= 256;
                            i13 = i17;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                iIntValue = iIntValue2;
                colorElement = colorElement7;
                colorElement2 = colorElement8;
                c3540m3 = c3540m5;
                colorElement3 = colorElement9;
                textElement = textElement7;
                textElement2 = textElement9;
                i11 = i16;
                valueElement = valueElement3;
                textElement3 = textElement8;
            }
            cVarB.c(fVar);
            return new TextInputElement(i11, valueElement, textElement3, textElement2, textElement, colorElement2, colorElement, colorElement3, c3540m3, iIntValue, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = TextInputElement.f27302j;
            ro0.d dVar = dVarArr[4];
            ro0.d dVar2 = dVarArr[5];
            ro0.d dVar3 = dVarArr[6];
            ro0.d dVar4 = dVarArr[8];
            TextElement.a aVar = TextElement.a.f27138a;
            return new ro0.d[]{ValueElement.a.f27318a, aVar, aVar, aVar, dVar, dVar2, dVar3, BorderElement.a.f33502a, dVar4};
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
        public final void serialize(uo0.f encoder, TextInputElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            TextInputElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.PA$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<TextInputElement> serializer() {
            return a.f27312a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.PA$c, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002\u0014%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0014\u001a\u00020\u001a2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0014\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/fourthline/orca/internal/PA$c;", "", "Lcom/fourthline/orca/internal/pg;", "typographyMonospace", "typography", "Lcom/fourthline/orca/internal/g4;", "color", "<init>", "(Lcom/fourthline/orca/internal/pg;Lcom/fourthline/orca/internal/pg;Lcom/fourthline/orca/internal/g4;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/pg;Lcom/fourthline/orca/internal/pg;Lcom/fourthline/orca/internal/g4;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/PA$c;Luo0/d;Lto0/f;)V", "", "isDigitInput", "Lw4/v;", "maxSize", "Li4/r0;", "(ZLw4/v;Lr2/l;II)Li4/r0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/pg;", "b", "()Lcom/fourthline/orca/internal/pg;", "getTypographyMonospace$annotations", "()V", "getTypography", "c", "Lcom/fourthline/orca/internal/g4;", "getColor", "()Lcom/fourthline/orca/internal/g4;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class ValueElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ro0.d[] f27314d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FontElement typographyMonospace;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FontElement typography;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement color;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.PA$c$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27319b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f27318a = aVar;
                f27319b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.TextInputElement.ValueElement", aVar, 3);
                m1Var.o("typography_monospace", false);
                m1Var.o("typography", false);
                m1Var.o("color", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ValueElement deserialize(uo0.e decoder) {
                int i11;
                FontElement fontElement;
                FontElement fontElement2;
                ColorElement colorElement;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = ValueElement.f27314d;
                FontElement fontElement3 = null;
                if (cVarB.i()) {
                    FontElement fontElement4 = (FontElement) cVarB.n(fVar, 0, dVarArr[0], null);
                    FontElement fontElement5 = (FontElement) cVarB.n(fVar, 1, dVarArr[1], null);
                    colorElement = (ColorElement) cVarB.n(fVar, 2, dVarArr[2], null);
                    fontElement = fontElement4;
                    i11 = 7;
                    fontElement2 = fontElement5;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    FontElement fontElement6 = null;
                    ColorElement colorElement2 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            fontElement3 = (FontElement) cVarB.n(fVar, 0, dVarArr[0], fontElement3);
                            i12 |= 1;
                        } else if (iA == 1) {
                            fontElement6 = (FontElement) cVarB.n(fVar, 1, dVarArr[1], fontElement6);
                            i12 |= 2;
                        } else {
                            if (iA != 2) {
                                throw new UnknownFieldException(iA);
                            }
                            colorElement2 = (ColorElement) cVarB.n(fVar, 2, dVarArr[2], colorElement2);
                            i12 |= 4;
                        }
                    }
                    i11 = i12;
                    fontElement = fontElement3;
                    fontElement2 = fontElement6;
                    colorElement = colorElement2;
                }
                cVarB.c(fVar);
                return new ValueElement(i11, fontElement, fontElement2, colorElement, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = ValueElement.f27314d;
                return new ro0.d[]{dVarArr[0], dVarArr[1], dVarArr[2]};
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
            public final void serialize(uo0.f encoder, ValueElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                ValueElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.PA$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<ValueElement> serializer() {
                return a.f27318a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            FontElement.Companion companion = FontElement.INSTANCE;
            f27314d = new ro0.d[]{companion.serializer(), companion.serializer(), ColorElement.INSTANCE.serializer()};
        }

        public /* synthetic */ ValueElement(int i11, FontElement fontElement, FontElement fontElement2, ColorElement colorElement, vo0.v1 v1Var) {
            if (7 != (i11 & 7)) {
                vo0.h1.b(i11, 7, a.f27318a.getDescriptor());
            }
            this.typographyMonospace = fontElement;
            this.typography = fontElement2;
            this.color = colorElement;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FontElement getTypographyMonospace() {
            return this.typographyMonospace;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValueElement)) {
                return false;
            }
            ValueElement valueElement = (ValueElement) other;
            return p013kotlin.jvm.internal.s.f(this.typographyMonospace, valueElement.typographyMonospace) && p013kotlin.jvm.internal.s.f(this.typography, valueElement.typography) && p013kotlin.jvm.internal.s.f(this.color, valueElement.color);
        }

        public int hashCode() {
            return (((this.typographyMonospace.hashCode() * 31) + this.typography.hashCode()) * 31) + this.color.hashCode();
        }

        public String toString() {
            return "ValueElement(typographyMonospace=" + this.typographyMonospace + ", typography=" + this.typography + ", color=" + this.color + ")";
        }

        public ValueElement(FontElement typographyMonospace, FontElement typography, ColorElement color) {
            p013kotlin.jvm.internal.s.k(typographyMonospace, "typographyMonospace");
            p013kotlin.jvm.internal.s.k(typography, "typography");
            p013kotlin.jvm.internal.s.k(color, "color");
            this.typographyMonospace = typographyMonospace;
            this.typography = typography;
            this.color = color;
        }

        public static final /* synthetic */ void a(ValueElement self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f27314d;
            output.D(serialDesc, 0, dVarArr[0], self.typographyMonospace);
            output.D(serialDesc, 1, dVarArr[1], self.typography);
            output.D(serialDesc, 2, dVarArr[2], self.color);
        }

        public final TextStyle a(boolean z11, w4.v vVar, p020r2.l lVar, int i11, int i12) {
            FontElement fontElement;
            lVar.o(-1692179560);
            boolean z12 = (i12 & 1) != 0 ? false : z11;
            w4.v vVar2 = (i12 & 2) != 0 ? null : vVar;
            if (p020r2.o.J()) {
                p020r2.o.S(-1692179560, i11, -1, "com.fourthline.orca.core.internal.styling.common.TextInputElement.ValueElement.getTextStyle (UiElement.kt:270)");
            }
            if (z12) {
                fontElement = this.typographyMonospace;
            } else if (!z12) {
                fontElement = this.typography;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Pair pairA = fontElement.a(vVar2, lVar, (i11 >> 3) & 14, 0);
            TextStyle textStyle = new TextStyle(this.color.a(lVar, 0), ((w4.v) pairA.e()).getPackedValue(), (FontWeight) null, (p014n4.b0) null, (p014n4.c0) null, fontElement.getFamily(), (String) null, 0L, (t4.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (t4.k) null, (Shadow) null, (m3.g) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (t4.s) null, 16777180, (DefaultConstructorMarker) null);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return textStyle;
        }
    }

    static {
        ColorElement.Companion companion = ColorElement.INSTANCE;
        f27302j = new ro0.d[]{null, null, null, null, companion.serializer(), companion.serializer(), companion.serializer(), null, new C4134zw()};
    }

    public /* synthetic */ TextInputElement(int i11, ValueElement valueElement, TextElement textElement, TextElement textElement2, TextElement textElement3, ColorElement colorElement, ColorElement colorElement2, ColorElement colorElement3, BorderElement c3540m3, int i12, vo0.v1 v1Var) {
        if (511 != (i11 & 511)) {
            vo0.h1.b(i11, 511, a.f27312a.getDescriptor());
        }
        this.value = valueElement;
        this.placeholder = textElement;
        this.label = textElement2;
        this.status = textElement3;
        this.icon = colorElement;
        this.shadow = colorElement2;
        this.background = colorElement3;
        this.border = c3540m3;
        this.radius = i12;
    }

    public final TextInputElement a(ValueElement value, TextElement placeholder, TextElement label, TextElement status, ColorElement icon, ColorElement shadow, ColorElement background, BorderElement border, int radius) {
        p013kotlin.jvm.internal.s.k(value, "value");
        p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
        p013kotlin.jvm.internal.s.k(label, "label");
        p013kotlin.jvm.internal.s.k(status, "status");
        p013kotlin.jvm.internal.s.k(icon, "icon");
        p013kotlin.jvm.internal.s.k(shadow, "shadow");
        p013kotlin.jvm.internal.s.k(background, "background");
        p013kotlin.jvm.internal.s.k(border, "border");
        return new TextInputElement(value, placeholder, label, status, icon, shadow, background, border, radius);
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
    public final TextElement getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputElement)) {
            return false;
        }
        TextInputElement textInputElement = (TextInputElement) other;
        return p013kotlin.jvm.internal.s.f(this.value, textInputElement.value) && p013kotlin.jvm.internal.s.f(this.placeholder, textInputElement.placeholder) && p013kotlin.jvm.internal.s.f(this.label, textInputElement.label) && p013kotlin.jvm.internal.s.f(this.status, textInputElement.status) && p013kotlin.jvm.internal.s.f(this.icon, textInputElement.icon) && p013kotlin.jvm.internal.s.f(this.shadow, textInputElement.shadow) && p013kotlin.jvm.internal.s.f(this.background, textInputElement.background) && p013kotlin.jvm.internal.s.f(this.border, textInputElement.border) && this.radius == textInputElement.radius;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextElement getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ColorElement getShadow() {
        return this.shadow;
    }

    public int hashCode() {
        return (((((((((((((((this.value.hashCode() * 31) + this.placeholder.hashCode()) * 31) + this.label.hashCode()) * 31) + this.status.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.shadow.hashCode()) * 31) + this.background.hashCode()) * 31) + this.border.hashCode()) * 31) + Integer.hashCode(this.radius);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextElement getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ValueElement getValue() {
        return this.value;
    }

    public String toString() {
        return "TextInputElement(value=" + this.value + ", placeholder=" + this.placeholder + ", label=" + this.label + ", status=" + this.status + ", icon=" + this.icon + ", shadow=" + this.shadow + ", background=" + this.background + ", border=" + this.border + ", radius=" + this.radius + ")";
    }

    public TextInputElement(ValueElement value, TextElement placeholder, TextElement label, TextElement status, ColorElement icon, ColorElement shadow, ColorElement background, BorderElement border, int i11) {
        p013kotlin.jvm.internal.s.k(value, "value");
        p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
        p013kotlin.jvm.internal.s.k(label, "label");
        p013kotlin.jvm.internal.s.k(status, "status");
        p013kotlin.jvm.internal.s.k(icon, "icon");
        p013kotlin.jvm.internal.s.k(shadow, "shadow");
        p013kotlin.jvm.internal.s.k(background, "background");
        p013kotlin.jvm.internal.s.k(border, "border");
        this.value = value;
        this.placeholder = placeholder;
        this.label = label;
        this.status = status;
        this.icon = icon;
        this.shadow = shadow;
        this.background = background;
        this.border = border;
        this.radius = i11;
    }

    public static /* synthetic */ TextInputElement a(TextInputElement textInputElement, ValueElement valueElement, TextElement textElement, TextElement textElement2, TextElement textElement3, ColorElement colorElement, ColorElement colorElement2, ColorElement colorElement3, BorderElement c3540m3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            valueElement = textInputElement.value;
        }
        if ((i12 & 2) != 0) {
            textElement = textInputElement.placeholder;
        }
        if ((i12 & 4) != 0) {
            textElement2 = textInputElement.label;
        }
        if ((i12 & 8) != 0) {
            textElement3 = textInputElement.status;
        }
        if ((i12 & 16) != 0) {
            colorElement = textInputElement.icon;
        }
        if ((i12 & 32) != 0) {
            colorElement2 = textInputElement.shadow;
        }
        if ((i12 & 64) != 0) {
            colorElement3 = textInputElement.background;
        }
        if ((i12 & 128) != 0) {
            c3540m3 = textInputElement.border;
        }
        if ((i12 & 256) != 0) {
            i11 = textInputElement.radius;
        }
        BorderElement c3540m4 = c3540m3;
        int i13 = i11;
        ColorElement colorElement4 = colorElement2;
        ColorElement colorElement5 = colorElement3;
        ColorElement colorElement6 = colorElement;
        TextElement textElement4 = textElement2;
        return textInputElement.a(valueElement, textElement, textElement4, textElement3, colorElement6, colorElement4, colorElement5, c3540m4, i13);
    }

    public static final /* synthetic */ void a(TextInputElement self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f27302j;
        output.D(serialDesc, 0, ValueElement.a.f27318a, self.value);
        TextElement.a aVar = TextElement.a.f27138a;
        output.D(serialDesc, 1, aVar, self.placeholder);
        output.D(serialDesc, 2, aVar, self.label);
        output.D(serialDesc, 3, aVar, self.status);
        output.D(serialDesc, 4, dVarArr[4], self.icon);
        output.D(serialDesc, 5, dVarArr[5], self.shadow);
        output.D(serialDesc, 6, dVarArr[6], self.background);
        output.D(serialDesc, 7, BorderElement.a.f33502a, self.border);
        output.D(serialDesc, 8, dVarArr[8], Integer.valueOf(self.radius));
    }
}
