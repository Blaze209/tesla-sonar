package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.L6, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 52\u00020\u0001:\u0005,+/\u001c(BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\t\u001a$0\u0004j\u0011`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011BK\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)R9\u0010\t\u001a$0\u0004j\u0011`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\b/\u00104¨\u00066"}, d2 = {"Lcom/fourthline/orca/internal/L6;", "", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/zw;", "radius", "Lcom/fourthline/orca/internal/L6$c;", "default", "Lcom/fourthline/orca/internal/L6$e;", "selector", "Lcom/fourthline/orca/internal/L6$d;", "instructional", "<init>", "(Lcom/fourthline/orca/internal/g4;ILcom/fourthline/orca/internal/L6$c;Lcom/fourthline/orca/internal/L6$e;Lcom/fourthline/orca/internal/L6$d;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;ILcom/fourthline/orca/internal/L6$c;Lcom/fourthline/orca/internal/L6$e;Lcom/fourthline/orca/internal/L6$d;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/L6;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "b", "()Lcom/fourthline/orca/internal/g4;", "I", "e", "c", "Lcom/fourthline/orca/internal/L6$c;", "()Lcom/fourthline/orca/internal/L6$c;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/L6$e;", "getSelector", "()Lcom/fourthline/orca/internal/L6$e;", "Lcom/fourthline/orca/internal/L6$d;", "()Lcom/fourthline/orca/internal/L6$d;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DialogElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f26707f = {ColorElement.INSTANCE.serializer(), new C4134zw(), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorElement background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DefaultDialog default;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OptionDialog selector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final InstructionDialog instructional;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26714b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f26713a = aVar;
            f26714b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.DialogElement", aVar, 5);
            m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
            m1Var.o("radius", false);
            m1Var.o("default", false);
            m1Var.o("selector", false);
            m1Var.o("instructional", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DialogElement deserialize(uo0.e decoder) {
            int i11;
            int i12;
            ColorElement colorElement;
            DefaultDialog defaultDialog;
            OptionDialog optionDialog;
            InstructionDialog instructionDialog;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = DialogElement.f26707f;
            int i13 = 0;
            if (cVarB.i()) {
                ColorElement colorElement2 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                int iIntValue = ((Number) cVarB.n(fVar, 1, dVarArr[1], 0)).intValue();
                DefaultDialog defaultDialog2 = (DefaultDialog) cVarB.n(fVar, 2, DefaultDialog.a.f26719a, null);
                i11 = iIntValue;
                colorElement = colorElement2;
                optionDialog = (OptionDialog) cVarB.n(fVar, 3, OptionDialog.a.f26728a, null);
                instructionDialog = (InstructionDialog) cVarB.n(fVar, 4, InstructionDialog.a.f26722a, null);
                defaultDialog = defaultDialog2;
                i12 = 31;
            } else {
                int i14 = 1;
                int iIntValue2 = 0;
                ColorElement colorElement3 = null;
                DefaultDialog defaultDialog3 = null;
                OptionDialog optionDialog2 = null;
                InstructionDialog instructionDialog2 = null;
                int i15 = 0;
                while (i14 != 0) {
                    int iA = cVarB.A(fVar);
                    int i16 = i13;
                    if (iA == -1) {
                        i13 = i16;
                        i14 = i13;
                    } else if (iA != 0) {
                        if (iA == 1) {
                            iIntValue2 = ((Number) cVarB.n(fVar, 1, dVarArr[1], Integer.valueOf(iIntValue2))).intValue();
                            i15 |= 2;
                        } else if (iA == 2) {
                            defaultDialog3 = (DefaultDialog) cVarB.n(fVar, 2, DefaultDialog.a.f26719a, defaultDialog3);
                            i15 |= 4;
                        } else if (iA == 3) {
                            optionDialog2 = (OptionDialog) cVarB.n(fVar, 3, OptionDialog.a.f26728a, optionDialog2);
                            i15 |= 8;
                        } else {
                            if (iA != 4) {
                                throw new UnknownFieldException(iA);
                            }
                            instructionDialog2 = (InstructionDialog) cVarB.n(fVar, 4, InstructionDialog.a.f26722a, instructionDialog2);
                            i15 |= 16;
                        }
                        i13 = i16;
                    } else {
                        colorElement3 = (ColorElement) cVarB.n(fVar, i16, dVarArr[i16], colorElement3);
                        i15 |= 1;
                        i13 = i16;
                    }
                }
                i11 = iIntValue2;
                i12 = i15;
                colorElement = colorElement3;
                defaultDialog = defaultDialog3;
                optionDialog = optionDialog2;
                instructionDialog = instructionDialog2;
            }
            cVarB.c(fVar);
            return new DialogElement(i12, colorElement, i11, defaultDialog, optionDialog, instructionDialog, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = DialogElement.f26707f;
            return new ro0.d[]{dVarArr[0], dVarArr[1], DefaultDialog.a.f26719a, OptionDialog.a.f26728a, InstructionDialog.a.f26722a};
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
        public final void serialize(uo0.f encoder, DialogElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DialogElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DialogElement> serializer() {
            return a.f26713a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$c, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u0015\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b\u0015\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b$\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\"\u0010&¨\u0006("}, d2 = {"Lcom/fourthline/orca/internal/L6$c;", "", "Lcom/fourthline/orca/internal/OA;", "header", "title", "message", "Lcom/fourthline/orca/internal/Wh;", "instruction", "<init>", "(Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/Wh;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/Wh;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/L6$c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/OA;", "()Lcom/fourthline/orca/internal/OA;", "b", DateTokenConverter.CONVERTER_KEY, "c", "Lcom/fourthline/orca/internal/Wh;", "()Lcom/fourthline/orca/internal/Wh;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class DefaultDialog {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement header;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement message;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstructionBoxElement instruction;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$c$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26719a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f26720b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f26719a = aVar;
                f26720b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.DialogElement.DefaultDialog", aVar, 4);
                m1Var.o("header", false);
                m1Var.o("title", false);
                m1Var.o("message", false);
                m1Var.o("instruction", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DefaultDialog deserialize(uo0.e decoder) {
                int i11;
                TextElement textElement;
                TextElement textElement2;
                TextElement textElement3;
                InstructionBoxElement wh2;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                TextElement textElement4 = null;
                if (cVarB.i()) {
                    TextElement.a aVar = TextElement.a.f27138a;
                    TextElement textElement5 = (TextElement) cVarB.n(fVar, 0, aVar, null);
                    TextElement textElement6 = (TextElement) cVarB.n(fVar, 1, aVar, null);
                    textElement3 = (TextElement) cVarB.n(fVar, 2, aVar, null);
                    wh2 = (InstructionBoxElement) cVarB.n(fVar, 3, InstructionBoxElement.a.f29558a, null);
                    i11 = 15;
                    textElement2 = textElement6;
                    textElement = textElement5;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    TextElement textElement7 = null;
                    TextElement textElement8 = null;
                    InstructionBoxElement wh3 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            textElement4 = (TextElement) cVarB.n(fVar, 0, TextElement.a.f27138a, textElement4);
                            i12 |= 1;
                        } else if (iA == 1) {
                            textElement7 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, textElement7);
                            i12 |= 2;
                        } else if (iA == 2) {
                            textElement8 = (TextElement) cVarB.n(fVar, 2, TextElement.a.f27138a, textElement8);
                            i12 |= 4;
                        } else {
                            if (iA != 3) {
                                throw new UnknownFieldException(iA);
                            }
                            wh3 = (InstructionBoxElement) cVarB.n(fVar, 3, InstructionBoxElement.a.f29558a, wh3);
                            i12 |= 8;
                        }
                    }
                    i11 = i12;
                    textElement = textElement4;
                    textElement2 = textElement7;
                    textElement3 = textElement8;
                    wh2 = wh3;
                }
                cVarB.c(fVar);
                return new DefaultDialog(i11, textElement, textElement2, textElement3, wh2, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                TextElement.a aVar = TextElement.a.f27138a;
                return new ro0.d[]{aVar, aVar, aVar, InstructionBoxElement.a.f29558a};
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
            public final void serialize(uo0.f encoder, DefaultDialog value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                DefaultDialog.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<DefaultDialog> serializer() {
                return a.f26719a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ DefaultDialog(int i11, TextElement textElement, TextElement textElement2, TextElement textElement3, InstructionBoxElement wh2, vo0.v1 v1Var) {
            if (15 != (i11 & 15)) {
                vo0.h1.b(i11, 15, a.f26719a.getDescriptor());
            }
            this.header = textElement;
            this.title = textElement2;
            this.message = textElement3;
            this.instruction = wh2;
        }

        public static final /* synthetic */ void a(DefaultDialog self, uo0.d output, to0.f serialDesc) {
            TextElement.a aVar = TextElement.a.f27138a;
            output.D(serialDesc, 0, aVar, self.header);
            output.D(serialDesc, 1, aVar, self.title);
            output.D(serialDesc, 2, aVar, self.message);
            output.D(serialDesc, 3, InstructionBoxElement.a.f29558a, self.instruction);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InstructionBoxElement getInstruction() {
            return this.instruction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextElement getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextElement getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultDialog)) {
                return false;
            }
            DefaultDialog defaultDialog = (DefaultDialog) other;
            return p013kotlin.jvm.internal.s.f(this.header, defaultDialog.header) && p013kotlin.jvm.internal.s.f(this.title, defaultDialog.title) && p013kotlin.jvm.internal.s.f(this.message, defaultDialog.message) && p013kotlin.jvm.internal.s.f(this.instruction, defaultDialog.instruction);
        }

        public int hashCode() {
            return (((((this.header.hashCode() * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.instruction.hashCode();
        }

        public String toString() {
            return "DefaultDialog(header=" + this.header + ", title=" + this.title + ", message=" + this.message + ", instruction=" + this.instruction + ")";
        }

        public DefaultDialog(TextElement header, TextElement title, TextElement message, InstructionBoxElement instruction) {
            p013kotlin.jvm.internal.s.k(header, "header");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(message, "message");
            p013kotlin.jvm.internal.s.k(instruction, "instruction");
            this.header = header;
            this.title = title;
            this.message = message;
            this.instruction = instruction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextElement getHeader() {
            return this.header;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$d, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0011\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0011\u0010\u001d¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/L6$d;", "", "Lcom/fourthline/orca/internal/Wh;", "instruction", "<init>", "(Lcom/fourthline/orca/internal/Wh;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/Wh;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/L6$d;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/Wh;", "()Lcom/fourthline/orca/internal/Wh;", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class InstructionDialog {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstructionBoxElement instruction;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$d$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f26723b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f26722a = aVar;
                f26723b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.DialogElement.InstructionDialog", aVar, 1);
                m1Var.o("instruction", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InstructionDialog deserialize(uo0.e decoder) {
                InstructionBoxElement wh2;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                vo0.v1 v1Var = null;
                if (cVarB.i()) {
                    wh2 = (InstructionBoxElement) cVarB.n(fVar, 0, InstructionBoxElement.a.f29558a, null);
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    wh2 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            wh2 = (InstructionBoxElement) cVarB.n(fVar, 0, InstructionBoxElement.a.f29558a, wh2);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new InstructionDialog(i11, wh2, v1Var);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{InstructionBoxElement.a.f29558a};
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
            public final void serialize(uo0.f encoder, InstructionDialog value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                InstructionDialog.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<InstructionDialog> serializer() {
                return a.f26722a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ InstructionDialog(int i11, InstructionBoxElement wh2, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f26722a.getDescriptor());
            }
            this.instruction = wh2;
        }

        public static final /* synthetic */ void a(InstructionDialog self, uo0.d output, to0.f serialDesc) {
            output.D(serialDesc, 0, InstructionBoxElement.a.f29558a, self.instruction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InstructionDialog) && p013kotlin.jvm.internal.s.f(this.instruction, ((InstructionDialog) other).instruction);
        }

        public int hashCode() {
            return this.instruction.hashCode();
        }

        public String toString() {
            return "InstructionDialog(instruction=" + this.instruction + ")";
        }

        public InstructionDialog(InstructionBoxElement instruction) {
            p013kotlin.jvm.internal.s.k(instruction, "instruction");
            this.instruction = instruction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InstructionBoxElement getInstruction() {
            return this.instruction;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$e, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0003'\u0015#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/fourthline/orca/internal/L6$e;", "", "Lcom/fourthline/orca/internal/OA;", "message", "Lcom/fourthline/orca/internal/g4;", "divider", "Lcom/fourthline/orca/internal/L6$e$c;", "option", "<init>", "(Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/L6$e$c;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/L6$e$c;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/L6$e;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/OA;", "getMessage", "()Lcom/fourthline/orca/internal/OA;", "b", "Lcom/fourthline/orca/internal/g4;", "getDivider", "()Lcom/fourthline/orca/internal/g4;", "c", "Lcom/fourthline/orca/internal/L6$e$c;", "getOption", "()Lcom/fourthline/orca/internal/L6$e$c;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class OptionDialog {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ro0.d[] f26724d = {null, ColorElement.INSTANCE.serializer(), null};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement divider;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Option option;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$e$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26728a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f26729b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f26728a = aVar;
                f26729b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.DialogElement.OptionDialog", aVar, 3);
                m1Var.o("message", false);
                m1Var.o("divider", false);
                m1Var.o("option", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OptionDialog deserialize(uo0.e decoder) {
                int i11;
                TextElement textElement;
                ColorElement colorElement;
                Option option;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = OptionDialog.f26724d;
                TextElement textElement2 = null;
                if (cVarB.i()) {
                    TextElement textElement3 = (TextElement) cVarB.n(fVar, 0, TextElement.a.f27138a, null);
                    colorElement = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], null);
                    textElement = textElement3;
                    option = (Option) cVarB.n(fVar, 2, Option.a.f26733a, null);
                    i11 = 7;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    ColorElement colorElement2 = null;
                    Option option2 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            textElement2 = (TextElement) cVarB.n(fVar, 0, TextElement.a.f27138a, textElement2);
                            i12 |= 1;
                        } else if (iA == 1) {
                            colorElement2 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], colorElement2);
                            i12 |= 2;
                        } else {
                            if (iA != 2) {
                                throw new UnknownFieldException(iA);
                            }
                            option2 = (Option) cVarB.n(fVar, 2, Option.a.f26733a, option2);
                            i12 |= 4;
                        }
                    }
                    i11 = i12;
                    textElement = textElement2;
                    colorElement = colorElement2;
                    option = option2;
                }
                cVarB.c(fVar);
                return new OptionDialog(i11, textElement, colorElement, option, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{TextElement.a.f27138a, OptionDialog.f26724d[1], Option.a.f26733a};
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
            public final void serialize(uo0.f encoder, OptionDialog value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                OptionDialog.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<OptionDialog> serializer() {
                return a.f26728a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$e$c, reason: from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u0013!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/L6$e$c;", "", "Lcom/fourthline/orca/internal/g4;", "icon", "Lcom/fourthline/orca/internal/OA;", "text", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/L6$e$c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "getIcon", "()Lcom/fourthline/orca/internal/g4;", "b", "Lcom/fourthline/orca/internal/OA;", "getText", "()Lcom/fourthline/orca/internal/OA;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @ro0.p
        public static final /* data */ class Option {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final ro0.d[] f26730c = {ColorElement.INSTANCE.serializer(), null};

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ColorElement icon;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final TextElement text;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$e$c$a */
            public /* synthetic */ class a implements vo0.e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f26733a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f26734b;
                private static final to0.f descriptor;

                static {
                    a aVar = new a();
                    f26733a = aVar;
                    f26734b = 8;
                    vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.DialogElement.OptionDialog.Option", aVar, 2);
                    m1Var.o("icon", false);
                    m1Var.o("text", false);
                    descriptor = m1Var;
                }

                private a() {
                }

                @Override // ro0.c
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Option deserialize(uo0.e decoder) {
                    ColorElement colorElement;
                    TextElement textElement;
                    int i11;
                    p013kotlin.jvm.internal.s.k(decoder, "decoder");
                    to0.f fVar = descriptor;
                    uo0.c cVarB = decoder.b(fVar);
                    ro0.d[] dVarArr = Option.f26730c;
                    vo0.v1 v1Var = null;
                    if (cVarB.i()) {
                        colorElement = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                        textElement = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, null);
                        i11 = 3;
                    } else {
                        boolean z11 = true;
                        int i12 = 0;
                        ColorElement colorElement2 = null;
                        TextElement textElement2 = null;
                        while (z11) {
                            int iA = cVarB.A(fVar);
                            if (iA == -1) {
                                z11 = false;
                            } else if (iA == 0) {
                                colorElement2 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], colorElement2);
                                i12 |= 1;
                            } else {
                                if (iA != 1) {
                                    throw new UnknownFieldException(iA);
                                }
                                textElement2 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, textElement2);
                                i12 |= 2;
                            }
                        }
                        colorElement = colorElement2;
                        textElement = textElement2;
                        i11 = i12;
                    }
                    cVarB.c(fVar);
                    return new Option(i11, colorElement, textElement, v1Var);
                }

                @Override // vo0.e0
                public final ro0.d[] childSerializers() {
                    return new ro0.d[]{Option.f26730c[0], TextElement.a.f27138a};
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
                public final void serialize(uo0.f encoder, Option value) {
                    p013kotlin.jvm.internal.s.k(encoder, "encoder");
                    p013kotlin.jvm.internal.s.k(value, "value");
                    to0.f fVar = descriptor;
                    uo0.d dVarB = encoder.b(fVar);
                    Option.a(value, dVarB, fVar);
                    dVarB.c(fVar);
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.L6$e$c$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public final ro0.d<Option> serializer() {
                    return a.f26733a;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Option(int i11, ColorElement colorElement, TextElement textElement, vo0.v1 v1Var) {
                if (3 != (i11 & 3)) {
                    vo0.h1.b(i11, 3, a.f26733a.getDescriptor());
                }
                this.icon = colorElement;
                this.text = textElement;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Option)) {
                    return false;
                }
                Option option = (Option) other;
                return p013kotlin.jvm.internal.s.f(this.icon, option.icon) && p013kotlin.jvm.internal.s.f(this.text, option.text);
            }

            public int hashCode() {
                return (this.icon.hashCode() * 31) + this.text.hashCode();
            }

            public String toString() {
                return "Option(icon=" + this.icon + ", text=" + this.text + ")";
            }

            public Option(ColorElement icon, TextElement text) {
                p013kotlin.jvm.internal.s.k(icon, "icon");
                p013kotlin.jvm.internal.s.k(text, "text");
                this.icon = icon;
                this.text = text;
            }

            public static final /* synthetic */ void a(Option self, uo0.d output, to0.f serialDesc) {
                output.D(serialDesc, 0, f26730c[0], self.icon);
                output.D(serialDesc, 1, TextElement.a.f27138a, self.text);
            }
        }

        public /* synthetic */ OptionDialog(int i11, TextElement textElement, ColorElement colorElement, Option option, vo0.v1 v1Var) {
            if (7 != (i11 & 7)) {
                vo0.h1.b(i11, 7, a.f26728a.getDescriptor());
            }
            this.message = textElement;
            this.divider = colorElement;
            this.option = option;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionDialog)) {
                return false;
            }
            OptionDialog optionDialog = (OptionDialog) other;
            return p013kotlin.jvm.internal.s.f(this.message, optionDialog.message) && p013kotlin.jvm.internal.s.f(this.divider, optionDialog.divider) && p013kotlin.jvm.internal.s.f(this.option, optionDialog.option);
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + this.divider.hashCode()) * 31) + this.option.hashCode();
        }

        public String toString() {
            return "OptionDialog(message=" + this.message + ", divider=" + this.divider + ", option=" + this.option + ")";
        }

        public OptionDialog(TextElement message, ColorElement divider, Option option) {
            p013kotlin.jvm.internal.s.k(message, "message");
            p013kotlin.jvm.internal.s.k(divider, "divider");
            p013kotlin.jvm.internal.s.k(option, "option");
            this.message = message;
            this.divider = divider;
            this.option = option;
        }

        public static final /* synthetic */ void a(OptionDialog self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f26724d;
            output.D(serialDesc, 0, TextElement.a.f27138a, self.message);
            output.D(serialDesc, 1, dVarArr[1], self.divider);
            output.D(serialDesc, 2, Option.a.f26733a, self.option);
        }
    }

    public /* synthetic */ DialogElement(int i11, ColorElement colorElement, int i12, DefaultDialog defaultDialog, OptionDialog optionDialog, InstructionDialog instructionDialog, vo0.v1 v1Var) {
        if (31 != (i11 & 31)) {
            vo0.h1.b(i11, 31, a.f26713a.getDescriptor());
        }
        this.background = colorElement;
        this.radius = i12;
        this.default = defaultDialog;
        this.selector = optionDialog;
        this.instructional = instructionDialog;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ColorElement getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DefaultDialog getDefault() {
        return this.default;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InstructionDialog getInstructional() {
        return this.instructional;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogElement)) {
            return false;
        }
        DialogElement dialogElement = (DialogElement) other;
        return p013kotlin.jvm.internal.s.f(this.background, dialogElement.background) && this.radius == dialogElement.radius && p013kotlin.jvm.internal.s.f(this.default, dialogElement.default) && p013kotlin.jvm.internal.s.f(this.selector, dialogElement.selector) && p013kotlin.jvm.internal.s.f(this.instructional, dialogElement.instructional);
    }

    public int hashCode() {
        return (((((((this.background.hashCode() * 31) + Integer.hashCode(this.radius)) * 31) + this.default.hashCode()) * 31) + this.selector.hashCode()) * 31) + this.instructional.hashCode();
    }

    public String toString() {
        return "DialogElement(background=" + this.background + ", radius=" + this.radius + ", default=" + this.default + ", selector=" + this.selector + ", instructional=" + this.instructional + ")";
    }

    public DialogElement(ColorElement background, int i11, DefaultDialog defaultDialog, OptionDialog selector, InstructionDialog instructional) {
        p013kotlin.jvm.internal.s.k(background, "background");
        p013kotlin.jvm.internal.s.k(defaultDialog, "default");
        p013kotlin.jvm.internal.s.k(selector, "selector");
        p013kotlin.jvm.internal.s.k(instructional, "instructional");
        this.background = background;
        this.radius = i11;
        this.default = defaultDialog;
        this.selector = selector;
        this.instructional = instructional;
    }

    public static final /* synthetic */ void a(DialogElement self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f26707f;
        output.D(serialDesc, 0, dVarArr[0], self.background);
        output.D(serialDesc, 1, dVarArr[1], Integer.valueOf(self.radius));
        output.D(serialDesc, 2, DefaultDialog.a.f26719a, self.default);
        output.D(serialDesc, 3, OptionDialog.a.f26728a, self.selector);
        output.D(serialDesc, 4, InstructionDialog.a.f26722a, self.instructional);
    }
}
