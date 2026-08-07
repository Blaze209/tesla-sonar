package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Wh, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u0000 A2\u00020\u0001:\u00032!-B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012*\b\u0002\u0010\u000b\u001a$0\u0006j\u0011`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R9\u0010\u000b\u001a$0\u0006j\u0011`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b9\u00108R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b5\u0010.R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b2\u0010.R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b;\u0010@¨\u0006B"}, d2 = {"Lcom/fourthline/orca/internal/Wh;", "", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/fourthline/orca/internal/m3;", "border", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/zw;", "radius", "Lcom/fourthline/orca/internal/OA;", "header", "title", "text", "message", "icon", "bullet", "Lcom/fourthline/orca/internal/Wh$c;", "pagination", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/m3;ILcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/Wh$c;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/m3;ILcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/Wh$c;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Wh;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "b", "()Lcom/fourthline/orca/internal/g4;", "Lcom/fourthline/orca/internal/m3;", "getBorder", "()Lcom/fourthline/orca/internal/m3;", "c", "I", "g", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/OA;", "getHeader", "()Lcom/fourthline/orca/internal/OA;", "e", "getTitle", "f", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Lcom/fourthline/orca/internal/Wh$c;", "()Lcom/fourthline/orca/internal/Wh$c;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class InstructionBoxElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ro0.d[] f29547k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BorderElement border;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int radius;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement header;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement title;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement text;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement message;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement icon;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement bullet;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pagination pagination;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Wh$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29559b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f29558a = aVar;
            f29559b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.InstructionBoxElement", aVar, 10);
            m1Var.o(AppStateModule.APP_STATE_BACKGROUND, true);
            m1Var.o("border", true);
            m1Var.o("radius", true);
            m1Var.o("header", true);
            m1Var.o("title", true);
            m1Var.o("text", true);
            m1Var.o("message", true);
            m1Var.o("icon", true);
            m1Var.o("bullet", true);
            m1Var.o("pagination", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InstructionBoxElement deserialize(uo0.e decoder) {
            int i11;
            ColorElement colorElement;
            ColorElement colorElement2;
            TextElement textElement;
            TextElement textElement2;
            Pagination pagination;
            TextElement textElement3;
            TextElement textElement4;
            BorderElement borderElement;
            int i12;
            ColorElement colorElement3;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = InstructionBoxElement.f29547k;
            int i13 = 9;
            int i14 = 8;
            if (cVarB.i()) {
                ColorElement colorElement4 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                BorderElement borderElement2 = (BorderElement) cVarB.n(fVar, 1, BorderElement.a.f33502a, null);
                int iIntValue = ((Number) cVarB.n(fVar, 2, dVarArr[2], 0)).intValue();
                TextElement.a aVar = TextElement.a.f27138a;
                TextElement textElement5 = (TextElement) cVarB.n(fVar, 3, aVar, null);
                TextElement textElement6 = (TextElement) cVarB.n(fVar, 4, aVar, null);
                TextElement textElement7 = (TextElement) cVarB.n(fVar, 5, aVar, null);
                TextElement textElement8 = (TextElement) cVarB.n(fVar, 6, aVar, null);
                ColorElement colorElement5 = (ColorElement) cVarB.n(fVar, 7, dVarArr[7], null);
                colorElement = (ColorElement) cVarB.n(fVar, 8, dVarArr[8], null);
                colorElement3 = colorElement4;
                pagination = (Pagination) cVarB.n(fVar, 9, Pagination.a.f29563a, null);
                textElement2 = textElement8;
                textElement = textElement7;
                textElement4 = textElement5;
                textElement3 = textElement6;
                colorElement2 = colorElement5;
                i11 = 1023;
                i12 = iIntValue;
                borderElement = borderElement2;
            } else {
                int i15 = 7;
                int i16 = 2;
                boolean z11 = true;
                int i17 = 0;
                ColorElement colorElement6 = null;
                ColorElement colorElement7 = null;
                TextElement textElement9 = null;
                TextElement textElement10 = null;
                Pagination pagination2 = null;
                TextElement textElement11 = null;
                TextElement textElement12 = null;
                ColorElement colorElement8 = null;
                int iIntValue2 = 0;
                BorderElement borderElement3 = null;
                while (z11) {
                    int i18 = i14;
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i13 = 9;
                            i14 = 8;
                            i16 = 2;
                            i15 = 7;
                            break;
                        case 0:
                            colorElement8 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], colorElement8);
                            i17 |= 1;
                            i13 = 9;
                            i14 = 8;
                            i16 = 2;
                            i15 = 7;
                            break;
                        case 1:
                            borderElement3 = (BorderElement) cVarB.n(fVar, 1, BorderElement.a.f33502a, borderElement3);
                            i17 |= 2;
                            i13 = 9;
                            i14 = 8;
                            i16 = 2;
                            i15 = 7;
                            break;
                        case 2:
                            iIntValue2 = ((Number) cVarB.n(fVar, i16, dVarArr[i16], Integer.valueOf(iIntValue2))).intValue();
                            i17 |= 4;
                            i13 = 9;
                            i14 = 8;
                            i15 = 7;
                            break;
                        case 3:
                            textElement12 = (TextElement) cVarB.n(fVar, 3, TextElement.a.f27138a, textElement12);
                            i17 |= 8;
                            i13 = 9;
                            i14 = 8;
                            i15 = 7;
                            break;
                        case 4:
                            textElement11 = (TextElement) cVarB.n(fVar, 4, TextElement.a.f27138a, textElement11);
                            i17 |= 16;
                            i13 = 9;
                            i14 = 8;
                            i15 = 7;
                            break;
                        case 5:
                            textElement9 = (TextElement) cVarB.n(fVar, 5, TextElement.a.f27138a, textElement9);
                            i17 |= 32;
                            i13 = 9;
                            i14 = 8;
                            i15 = 7;
                            break;
                        case 6:
                            textElement10 = (TextElement) cVarB.n(fVar, 6, TextElement.a.f27138a, textElement10);
                            i17 |= 64;
                            i13 = 9;
                            i14 = 8;
                            i15 = 7;
                            break;
                        case 7:
                            colorElement7 = (ColorElement) cVarB.n(fVar, i15, dVarArr[i15], colorElement7);
                            i17 |= 128;
                            i13 = 9;
                            i14 = 8;
                            break;
                        case 8:
                            colorElement6 = (ColorElement) cVarB.n(fVar, i18, dVarArr[i18], colorElement6);
                            i17 |= 256;
                            i14 = i18;
                            i13 = 9;
                            break;
                        case 9:
                            pagination2 = (Pagination) cVarB.n(fVar, i13, Pagination.a.f29563a, pagination2);
                            i17 |= 512;
                            i14 = i18;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i17;
                colorElement = colorElement6;
                colorElement2 = colorElement7;
                textElement = textElement9;
                textElement2 = textElement10;
                pagination = pagination2;
                textElement3 = textElement11;
                textElement4 = textElement12;
                borderElement = borderElement3;
                i12 = iIntValue2;
                colorElement3 = colorElement8;
            }
            cVarB.c(fVar);
            return new InstructionBoxElement(i11, colorElement3, borderElement, i12, textElement4, textElement3, textElement, textElement2, colorElement2, colorElement, pagination, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = InstructionBoxElement.f29547k;
            ro0.d dVar = dVarArr[0];
            ro0.d dVar2 = dVarArr[2];
            ro0.d dVar3 = dVarArr[7];
            ro0.d dVar4 = dVarArr[8];
            TextElement.a aVar = TextElement.a.f27138a;
            return new ro0.d[]{dVar, BorderElement.a.f33502a, dVar2, aVar, aVar, aVar, aVar, dVar3, dVar4, Pagination.a.f29563a};
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
        public final void serialize(uo0.f encoder, InstructionBoxElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            InstructionBoxElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Wh$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<InstructionBoxElement> serializer() {
            return a.f29558a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Wh$c, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u0012 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006\""}, d2 = {"Lcom/fourthline/orca/internal/Wh$c;", "", "Lcom/fourthline/orca/internal/g4;", "inactive", "active", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Wh$c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "c", "()Lcom/fourthline/orca/internal/g4;", "b", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class Pagination {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ro0.d[] f29560c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement inactive;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement active;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Wh$c$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f29563a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f29564b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f29563a = aVar;
                f29564b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.InstructionBoxElement.Pagination", aVar, 2);
                m1Var.o("inactive", false);
                m1Var.o("active", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pagination deserialize(uo0.e decoder) {
                ColorElement colorElement;
                ColorElement colorElement2;
                int i11;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = Pagination.f29560c;
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
                return new Pagination(i11, colorElement2, colorElement, v1Var);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = Pagination.f29560c;
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
            public final void serialize(uo0.f encoder, Pagination value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                Pagination.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Wh$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<Pagination> serializer() {
                return a.f29563a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            ColorElement.Companion companion = ColorElement.INSTANCE;
            f29560c = new ro0.d[]{companion.serializer(), companion.serializer()};
        }

        public /* synthetic */ Pagination(int i11, ColorElement colorElement, ColorElement colorElement2, vo0.v1 v1Var) {
            if (3 != (i11 & 3)) {
                vo0.h1.b(i11, 3, a.f29563a.getDescriptor());
            }
            this.inactive = colorElement;
            this.active = colorElement2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColorElement getActive() {
            return this.active;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ColorElement getInactive() {
            return this.inactive;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pagination)) {
                return false;
            }
            Pagination pagination = (Pagination) other;
            return p013kotlin.jvm.internal.s.f(this.inactive, pagination.inactive) && p013kotlin.jvm.internal.s.f(this.active, pagination.active);
        }

        public int hashCode() {
            return (this.inactive.hashCode() * 31) + this.active.hashCode();
        }

        public String toString() {
            return "Pagination(inactive=" + this.inactive + ", active=" + this.active + ")";
        }

        public Pagination(ColorElement inactive, ColorElement active) {
            p013kotlin.jvm.internal.s.k(inactive, "inactive");
            p013kotlin.jvm.internal.s.k(active, "active");
            this.inactive = inactive;
            this.active = active;
        }

        public static final /* synthetic */ void a(Pagination self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f29560c;
            output.D(serialDesc, 0, dVarArr[0], self.inactive);
            output.D(serialDesc, 1, dVarArr[1], self.active);
        }
    }

    static {
        ColorElement.Companion companion = ColorElement.INSTANCE;
        f29547k = new ro0.d[]{companion.serializer(), null, new C4134zw(), null, null, null, null, companion.serializer(), companion.serializer(), null};
    }

    public /* synthetic */ InstructionBoxElement(int i11, ColorElement colorElement, BorderElement borderElement, int i12, TextElement textElement, TextElement textElement2, TextElement textElement3, TextElement textElement4, ColorElement colorElement2, ColorElement colorElement3, Pagination pagination, vo0.v1 v1Var) {
        this.background = (i11 & 1) == 0 ? ColorElement.INSTANCE.b() : colorElement;
        if ((i11 & 2) == 0) {
            this.border = BorderElement.INSTANCE.a();
        } else {
            this.border = borderElement;
        }
        if ((i11 & 4) == 0) {
            this.radius = 0;
        } else {
            this.radius = i12;
        }
        if ((i11 & 8) == 0) {
            this.header = TextElement.INSTANCE.a();
        } else {
            this.header = textElement;
        }
        if ((i11 & 16) == 0) {
            this.title = TextElement.INSTANCE.a();
        } else {
            this.title = textElement2;
        }
        if ((i11 & 32) == 0) {
            this.text = TextElement.INSTANCE.a();
        } else {
            this.text = textElement3;
        }
        if ((i11 & 64) == 0) {
            this.message = TextElement.INSTANCE.a();
        } else {
            this.message = textElement4;
        }
        if ((i11 & 128) == 0) {
            this.icon = ColorElement.INSTANCE.a();
        } else {
            this.icon = colorElement2;
        }
        if ((i11 & 256) == 0) {
            this.bullet = ColorElement.INSTANCE.a();
        } else {
            this.bullet = colorElement3;
        }
        if ((i11 & 512) != 0) {
            this.pagination = pagination;
        } else {
            ColorElement.Companion companion = ColorElement.INSTANCE;
            this.pagination = new Pagination(companion.b(), companion.b());
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ColorElement getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ColorElement getBullet() {
        return this.bullet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ColorElement getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextElement getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstructionBoxElement)) {
            return false;
        }
        InstructionBoxElement instructionBoxElement = (InstructionBoxElement) other;
        return p013kotlin.jvm.internal.s.f(this.background, instructionBoxElement.background) && p013kotlin.jvm.internal.s.f(this.border, instructionBoxElement.border) && this.radius == instructionBoxElement.radius && p013kotlin.jvm.internal.s.f(this.header, instructionBoxElement.header) && p013kotlin.jvm.internal.s.f(this.title, instructionBoxElement.title) && p013kotlin.jvm.internal.s.f(this.text, instructionBoxElement.text) && p013kotlin.jvm.internal.s.f(this.message, instructionBoxElement.message) && p013kotlin.jvm.internal.s.f(this.icon, instructionBoxElement.icon) && p013kotlin.jvm.internal.s.f(this.bullet, instructionBoxElement.bullet) && p013kotlin.jvm.internal.s.f(this.pagination, instructionBoxElement.pagination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Pagination getPagination() {
        return this.pagination;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextElement getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((((((((((((this.background.hashCode() * 31) + this.border.hashCode()) * 31) + Integer.hashCode(this.radius)) * 31) + this.header.hashCode()) * 31) + this.title.hashCode()) * 31) + this.text.hashCode()) * 31) + this.message.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.bullet.hashCode()) * 31) + this.pagination.hashCode();
    }

    public String toString() {
        return "InstructionBoxElement(background=" + this.background + ", border=" + this.border + ", radius=" + this.radius + ", header=" + this.header + ", title=" + this.title + ", text=" + this.text + ", message=" + this.message + ", icon=" + this.icon + ", bullet=" + this.bullet + ", pagination=" + this.pagination + ")";
    }

    public static final /* synthetic */ void a(InstructionBoxElement self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f29547k;
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.background, ColorElement.INSTANCE.b())) {
            output.D(serialDesc, 0, dVarArr[0], self.background);
        }
        if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.border, BorderElement.INSTANCE.a())) {
            output.D(serialDesc, 1, BorderElement.a.f33502a, self.border);
        }
        if (output.G(serialDesc, 2) || self.radius != 0) {
            output.D(serialDesc, 2, dVarArr[2], Integer.valueOf(self.radius));
        }
        if (output.G(serialDesc, 3) || !p013kotlin.jvm.internal.s.f(self.header, TextElement.INSTANCE.a())) {
            output.D(serialDesc, 3, TextElement.a.f27138a, self.header);
        }
        if (output.G(serialDesc, 4) || !p013kotlin.jvm.internal.s.f(self.title, TextElement.INSTANCE.a())) {
            output.D(serialDesc, 4, TextElement.a.f27138a, self.title);
        }
        if (output.G(serialDesc, 5) || !p013kotlin.jvm.internal.s.f(self.text, TextElement.INSTANCE.a())) {
            output.D(serialDesc, 5, TextElement.a.f27138a, self.text);
        }
        if (output.G(serialDesc, 6) || !p013kotlin.jvm.internal.s.f(self.message, TextElement.INSTANCE.a())) {
            output.D(serialDesc, 6, TextElement.a.f27138a, self.message);
        }
        if (output.G(serialDesc, 7) || !p013kotlin.jvm.internal.s.f(self.icon, ColorElement.INSTANCE.a())) {
            output.D(serialDesc, 7, dVarArr[7], self.icon);
        }
        if (output.G(serialDesc, 8) || !p013kotlin.jvm.internal.s.f(self.bullet, ColorElement.INSTANCE.a())) {
            output.D(serialDesc, 8, dVarArr[8], self.bullet);
        }
        if (!output.G(serialDesc, 9)) {
            Pagination pagination = self.pagination;
            ColorElement.Companion companion = ColorElement.INSTANCE;
            if (p013kotlin.jvm.internal.s.f(pagination, new Pagination(companion.b(), companion.b()))) {
                return;
            }
        }
        output.D(serialDesc, 9, Pagination.a.f29563a, self.pagination);
    }

    public InstructionBoxElement(ColorElement background, BorderElement border, int i11, TextElement header, TextElement title, TextElement text, TextElement message, ColorElement icon, ColorElement bullet, Pagination pagination) {
        p013kotlin.jvm.internal.s.k(background, "background");
        p013kotlin.jvm.internal.s.k(border, "border");
        p013kotlin.jvm.internal.s.k(header, "header");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(icon, "icon");
        p013kotlin.jvm.internal.s.k(bullet, "bullet");
        p013kotlin.jvm.internal.s.k(pagination, "pagination");
        this.background = background;
        this.border = border;
        this.radius = i11;
        this.header = header;
        this.title = title;
        this.text = text;
        this.message = message;
        this.icon = icon;
        this.bullet = bullet;
        this.pagination = pagination;
    }

    public /* synthetic */ InstructionBoxElement(ColorElement colorElement, BorderElement borderElement, int i11, TextElement textElement, TextElement textElement2, TextElement textElement3, TextElement textElement4, ColorElement colorElement2, ColorElement colorElement3, Pagination pagination, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        colorElement = (i12 & 1) != 0 ? ColorElement.INSTANCE.b() : colorElement;
        borderElement = (i12 & 2) != 0 ? BorderElement.INSTANCE.a() : borderElement;
        i11 = (i12 & 4) != 0 ? 0 : i11;
        textElement = (i12 & 8) != 0 ? TextElement.INSTANCE.a() : textElement;
        textElement2 = (i12 & 16) != 0 ? TextElement.INSTANCE.a() : textElement2;
        textElement3 = (i12 & 32) != 0 ? TextElement.INSTANCE.a() : textElement3;
        textElement4 = (i12 & 64) != 0 ? TextElement.INSTANCE.a() : textElement4;
        colorElement2 = (i12 & 128) != 0 ? ColorElement.INSTANCE.a() : colorElement2;
        colorElement3 = (i12 & 256) != 0 ? ColorElement.INSTANCE.a() : colorElement3;
        if ((i12 & 512) != 0) {
            ColorElement.Companion companion = ColorElement.INSTANCE;
            pagination = new Pagination(companion.b(), companion.b());
        }
        this(colorElement, borderElement, i11, textElement, textElement2, textElement3, textElement4, colorElement2, colorElement3, pagination);
    }
}
