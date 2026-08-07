package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.analytics.internal.AnalyticsContext;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mp, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b-\b\u0081\b\u0018\u0000 ]2\u00020\u0001:\t7@HNDB>)5Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u009d\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010F\u001a\u0004\bB\u0010GR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bH\u0010JR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bD\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bP\u0010R\u001a\u0004\b7\u0010SR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b<\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b9\u0010W\u001a\u0004\b>\u0010XR \u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010Y\u0012\u0004\b[\u0010\\\u001a\u0004\bN\u0010Z¨\u0006^"}, d2 = {"Lcom/fourthline/orca/internal/mp;", "", "Lcom/fourthline/orca/internal/mp$b;", "button", "Lcom/fourthline/orca/internal/mp$f;", AnalyticsContext.Screen, "Lcom/fourthline/orca/internal/mp$i;", AnalyticsContext.Scanner, "Lcom/fourthline/orca/internal/mp$e;", "graphic", "Lcom/fourthline/orca/internal/qz;", "input", "Lcom/fourthline/orca/internal/L6;", "dialog", "Lcom/fourthline/orca/internal/ah;", "hint", "Lcom/fourthline/orca/internal/Us;", "spinner", "Lcom/fourthline/orca/internal/pz;", "radio", "Lcom/fourthline/orca/internal/f0;", "agreements", "Lcom/fourthline/orca/internal/c;", "accordion", "Lcom/fourthline/orca/internal/mz;", "checkbox", "Lcom/fourthline/orca/internal/oz;", "linkButton", "<init>", "(Lcom/fourthline/orca/internal/mp$b;Lcom/fourthline/orca/internal/mp$f;Lcom/fourthline/orca/internal/mp$i;Lcom/fourthline/orca/internal/mp$e;Lcom/fourthline/orca/internal/qz;Lcom/fourthline/orca/internal/L6;Lcom/fourthline/orca/internal/ah;Lcom/fourthline/orca/internal/Us;Lcom/fourthline/orca/internal/pz;Lcom/fourthline/orca/internal/f0;Lcom/fourthline/orca/internal/c;Lcom/fourthline/orca/internal/mz;Lcom/fourthline/orca/internal/oz;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/mp$b;Lcom/fourthline/orca/internal/mp$f;Lcom/fourthline/orca/internal/mp$i;Lcom/fourthline/orca/internal/mp$e;Lcom/fourthline/orca/internal/qz;Lcom/fourthline/orca/internal/L6;Lcom/fourthline/orca/internal/ah;Lcom/fourthline/orca/internal/Us;Lcom/fourthline/orca/internal/pz;Lcom/fourthline/orca/internal/f0;Lcom/fourthline/orca/internal/c;Lcom/fourthline/orca/internal/mz;Lcom/fourthline/orca/internal/oz;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mp;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/mp$b;", "c", "()Lcom/fourthline/orca/internal/mp$b;", "b", "Lcom/fourthline/orca/internal/mp$f;", "l", "()Lcom/fourthline/orca/internal/mp$f;", "Lcom/fourthline/orca/internal/mp$i;", "k", "()Lcom/fourthline/orca/internal/mp$i;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/mp$e;", "f", "()Lcom/fourthline/orca/internal/mp$e;", "e", "Lcom/fourthline/orca/internal/qz;", "h", "()Lcom/fourthline/orca/internal/qz;", "Lcom/fourthline/orca/internal/L6;", "()Lcom/fourthline/orca/internal/L6;", "g", "Lcom/fourthline/orca/internal/ah;", "()Lcom/fourthline/orca/internal/ah;", "Lcom/fourthline/orca/internal/Us;", "m", "()Lcom/fourthline/orca/internal/Us;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/pz;", "j", "()Lcom/fourthline/orca/internal/pz;", "Lcom/fourthline/orca/internal/f0;", "()Lcom/fourthline/orca/internal/f0;", "Lcom/fourthline/orca/internal/c;", "getAccordion", "()Lcom/fourthline/orca/internal/c;", "Lcom/fourthline/orca/internal/mz;", "()Lcom/fourthline/orca/internal/mz;", "Lcom/fourthline/orca/internal/oz;", "()Lcom/fourthline/orca/internal/oz;", "getLinkButton$annotations", "()V", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class OrcaStylingElements {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ro0.d[] f33633n = {null, null, null, null, StatefulTextInputElement.INSTANCE.serializer(), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonGroupElement button;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PageElement screen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScannerPageElement scanner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final GraphicGroupElement graphic;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final StatefulTextInputElement input;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final DialogElement dialog;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final HintElementVariants hint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProgressElement spinner;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final StatefulRadioCellElement radio;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final AgreementsElement agreements;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccordionElement accordion;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final StatefulCheckboxElement checkbox;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final StatefulLinkButtonElement linkButton;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33648b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f33647a = aVar;
            f33648b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.OrcaStylingElements", aVar, 13);
            m1Var.o("button", false);
            m1Var.o(AnalyticsContext.Screen, false);
            m1Var.o(AnalyticsContext.Scanner, false);
            m1Var.o("graphic", false);
            m1Var.o("input", false);
            m1Var.o("dialog", false);
            m1Var.o("hint", false);
            m1Var.o("spinner", false);
            m1Var.o("radio", false);
            m1Var.o("agreements", false);
            m1Var.o("accordion", false);
            m1Var.o("checkbox", false);
            m1Var.o("text_with_link", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrcaStylingElements deserialize(uo0.e decoder) {
            int i11;
            ButtonGroupElement buttonGroupElement;
            StatefulCheckboxElement c3578mz;
            AccordionElement c3109c;
            StatefulRadioCellElement c3707pz;
            ProgressElement us2;
            HintElementVariants c3048ah;
            StatefulTextInputElement c3750qz;
            AgreementsElement c3238f0;
            GraphicGroupElement graphicGroupElement;
            DialogElement l11;
            ScannerPageElement scannerPageElement;
            PageElement pageElement;
            StatefulLinkButtonElement c3664oz;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = OrcaStylingElements.f33633n;
            if (cVarB.i()) {
                ButtonGroupElement buttonGroupElement2 = (ButtonGroupElement) cVarB.n(fVar, 0, ButtonGroupElement.a.f33653a, null);
                PageElement pageElement2 = (PageElement) cVarB.n(fVar, 1, PageElement.a.f33672a, null);
                ScannerPageElement scannerPageElement2 = (ScannerPageElement) cVarB.n(fVar, 2, ScannerPageElement.a.f33690a, null);
                GraphicGroupElement graphicGroupElement2 = (GraphicGroupElement) cVarB.n(fVar, 3, GraphicGroupElement.a.f33663a, null);
                StatefulTextInputElement c3750qz2 = (StatefulTextInputElement) cVarB.n(fVar, 4, dVarArr[4], null);
                DialogElement l12 = (DialogElement) cVarB.n(fVar, 5, DialogElement.a.f26713a, null);
                HintElementVariants c3048ah2 = (HintElementVariants) cVarB.n(fVar, 6, HintElementVariants.a.f30415a, null);
                ProgressElement us3 = (ProgressElement) cVarB.n(fVar, 7, ProgressElement.a.f28850a, null);
                StatefulRadioCellElement c3707pz2 = (StatefulRadioCellElement) cVarB.n(fVar, 8, StatefulRadioCellElement.a.f34669a, null);
                AgreementsElement c3238f1 = (AgreementsElement) cVarB.n(fVar, 9, AgreementsElement.a.f31568a, null);
                AccordionElement c3109c2 = (AccordionElement) cVarB.n(fVar, 10, AccordionElement.a.f30746a, null);
                StatefulCheckboxElement c3578mz2 = (StatefulCheckboxElement) cVarB.n(fVar, 11, StatefulCheckboxElement.a.f33740a, null);
                i11 = 8191;
                c3664oz = (StatefulLinkButtonElement) cVarB.n(fVar, 12, StatefulLinkButtonElement.a.f34400a, null);
                buttonGroupElement = buttonGroupElement2;
                pageElement = pageElement2;
                c3109c = c3109c2;
                c3238f0 = c3238f1;
                us2 = us3;
                c3048ah = c3048ah2;
                l11 = l12;
                graphicGroupElement = graphicGroupElement2;
                c3707pz = c3707pz2;
                scannerPageElement = scannerPageElement2;
                c3578mz = c3578mz2;
                c3750qz = c3750qz2;
            } else {
                StatefulLinkButtonElement c3664oz2 = null;
                ButtonGroupElement buttonGroupElement3 = null;
                StatefulCheckboxElement c3578mz3 = null;
                AccordionElement c3109c3 = null;
                StatefulRadioCellElement c3707pz3 = null;
                ProgressElement us4 = null;
                HintElementVariants c3048ah3 = null;
                StatefulTextInputElement c3750qz3 = null;
                AgreementsElement c3238f2 = null;
                GraphicGroupElement graphicGroupElement3 = null;
                int i12 = 4;
                boolean z11 = true;
                i11 = 0;
                PageElement pageElement3 = null;
                DialogElement l13 = null;
                ScannerPageElement scannerPageElement3 = null;
                while (z11) {
                    ButtonGroupElement buttonGroupElement4 = buttonGroupElement3;
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            buttonGroupElement3 = buttonGroupElement4;
                            z11 = false;
                            pageElement3 = pageElement3;
                            c3664oz2 = c3664oz2;
                            i12 = 4;
                            break;
                        case 0:
                            buttonGroupElement3 = (ButtonGroupElement) cVarB.n(fVar, 0, ButtonGroupElement.a.f33653a, buttonGroupElement4);
                            i11 |= 1;
                            pageElement3 = pageElement3;
                            c3664oz2 = c3664oz2;
                            i12 = 4;
                            break;
                        case 1:
                            pageElement3 = (PageElement) cVarB.n(fVar, 1, PageElement.a.f33672a, pageElement3);
                            i11 |= 2;
                            c3664oz2 = c3664oz2;
                            buttonGroupElement3 = buttonGroupElement4;
                            i12 = 4;
                            break;
                        case 2:
                            scannerPageElement3 = (ScannerPageElement) cVarB.n(fVar, 2, ScannerPageElement.a.f33690a, scannerPageElement3);
                            i11 |= 4;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            i12 = 4;
                            break;
                        case 3:
                            graphicGroupElement3 = (GraphicGroupElement) cVarB.n(fVar, 3, GraphicGroupElement.a.f33663a, graphicGroupElement3);
                            i11 |= 8;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            i12 = 4;
                            break;
                        case 4:
                            c3750qz3 = (StatefulTextInputElement) cVarB.n(fVar, i12, dVarArr[i12], c3750qz3);
                            i11 |= 16;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            break;
                        case 5:
                            l13 = (DialogElement) cVarB.n(fVar, 5, DialogElement.a.f26713a, l13);
                            i11 |= 32;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            break;
                        case 6:
                            c3048ah3 = (HintElementVariants) cVarB.n(fVar, 6, HintElementVariants.a.f30415a, c3048ah3);
                            i11 |= 64;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            break;
                        case 7:
                            us4 = (ProgressElement) cVarB.n(fVar, 7, ProgressElement.a.f28850a, us4);
                            i11 |= 128;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            break;
                        case 8:
                            c3707pz3 = (StatefulRadioCellElement) cVarB.n(fVar, 8, StatefulRadioCellElement.a.f34669a, c3707pz3);
                            i11 |= 256;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            break;
                        case 9:
                            c3238f2 = (AgreementsElement) cVarB.n(fVar, 9, AgreementsElement.a.f31568a, c3238f2);
                            i11 |= 512;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            break;
                        case 10:
                            c3109c3 = (AccordionElement) cVarB.n(fVar, 10, AccordionElement.a.f30746a, c3109c3);
                            i11 |= 1024;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            break;
                        case 11:
                            c3578mz3 = (StatefulCheckboxElement) cVarB.n(fVar, 11, StatefulCheckboxElement.a.f33740a, c3578mz3);
                            i11 |= 2048;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            break;
                        case 12:
                            c3664oz2 = (StatefulLinkButtonElement) cVarB.n(fVar, 12, StatefulLinkButtonElement.a.f34400a, c3664oz2);
                            i11 |= 4096;
                            buttonGroupElement3 = buttonGroupElement4;
                            pageElement3 = pageElement3;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                buttonGroupElement = buttonGroupElement3;
                c3578mz = c3578mz3;
                c3109c = c3109c3;
                c3707pz = c3707pz3;
                us2 = us4;
                c3048ah = c3048ah3;
                c3750qz = c3750qz3;
                c3238f0 = c3238f2;
                graphicGroupElement = graphicGroupElement3;
                l11 = l13;
                scannerPageElement = scannerPageElement3;
                pageElement = pageElement3;
                c3664oz = c3664oz2;
            }
            int i13 = i11;
            cVarB.c(fVar);
            return new OrcaStylingElements(i13, buttonGroupElement, pageElement, scannerPageElement, graphicGroupElement, c3750qz, l11, c3048ah, us2, c3707pz, c3238f0, c3109c, c3578mz, c3664oz, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{ButtonGroupElement.a.f33653a, PageElement.a.f33672a, ScannerPageElement.a.f33690a, GraphicGroupElement.a.f33663a, OrcaStylingElements.f33633n[4], DialogElement.a.f26713a, HintElementVariants.a.f30415a, ProgressElement.a.f28850a, StatefulRadioCellElement.a.f34669a, AgreementsElement.a.f31568a, AccordionElement.a.f30746a, StatefulCheckboxElement.a.f33740a, StatefulLinkButtonElement.a.f34400a};
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
        public final void serialize(uo0.f encoder, OrcaStylingElements value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            OrcaStylingElements.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$b, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u0013\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lcom/fourthline/orca/internal/mp$b;", "", "Lcom/fourthline/orca/internal/kz;", "primary", "secondary", "tertiary", "<init>", "(Lcom/fourthline/orca/internal/kz;Lcom/fourthline/orca/internal/kz;Lcom/fourthline/orca/internal/kz;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/kz;Lcom/fourthline/orca/internal/kz;Lcom/fourthline/orca/internal/kz;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mp$b;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/kz;", "b", "()Lcom/fourthline/orca/internal/kz;", "c", DateTokenConverter.CONVERTER_KEY, "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class ButtonGroupElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ro0.d[] f33649d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatefulButtonElement primary;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatefulButtonElement secondary;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatefulButtonElement tertiary;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$b$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33653a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33654b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33653a = aVar;
                f33654b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.OrcaStylingElements.ButtonGroupElement", aVar, 3);
                m1Var.o("primary", false);
                m1Var.o("secondary", false);
                m1Var.o("tertiary", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ButtonGroupElement deserialize(uo0.e decoder) {
                int i11;
                StatefulButtonElement c3492kz;
                StatefulButtonElement c3492kz2;
                StatefulButtonElement c3492kz3;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = ButtonGroupElement.f33649d;
                StatefulButtonElement c3492kz4 = null;
                if (cVarB.i()) {
                    StatefulButtonElement c3492kz5 = (StatefulButtonElement) cVarB.n(fVar, 0, dVarArr[0], null);
                    StatefulButtonElement c3492kz6 = (StatefulButtonElement) cVarB.n(fVar, 1, dVarArr[1], null);
                    c3492kz3 = (StatefulButtonElement) cVarB.n(fVar, 2, dVarArr[2], null);
                    c3492kz = c3492kz5;
                    i11 = 7;
                    c3492kz2 = c3492kz6;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    StatefulButtonElement c3492kz7 = null;
                    StatefulButtonElement c3492kz8 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            c3492kz4 = (StatefulButtonElement) cVarB.n(fVar, 0, dVarArr[0], c3492kz4);
                            i12 |= 1;
                        } else if (iA == 1) {
                            c3492kz7 = (StatefulButtonElement) cVarB.n(fVar, 1, dVarArr[1], c3492kz7);
                            i12 |= 2;
                        } else {
                            if (iA != 2) {
                                throw new UnknownFieldException(iA);
                            }
                            c3492kz8 = (StatefulButtonElement) cVarB.n(fVar, 2, dVarArr[2], c3492kz8);
                            i12 |= 4;
                        }
                    }
                    i11 = i12;
                    c3492kz = c3492kz4;
                    c3492kz2 = c3492kz7;
                    c3492kz3 = c3492kz8;
                }
                cVarB.c(fVar);
                return new ButtonGroupElement(i11, c3492kz, c3492kz2, c3492kz3, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = ButtonGroupElement.f33649d;
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
            public final void serialize(uo0.f encoder, ButtonGroupElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                ButtonGroupElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<ButtonGroupElement> serializer() {
                return a.f33653a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            StatefulButtonElement.Companion aVar = StatefulButtonElement.INSTANCE;
            f33649d = new ro0.d[]{aVar.serializer(), aVar.serializer(), aVar.serializer()};
        }

        public /* synthetic */ ButtonGroupElement(int i11, StatefulButtonElement c3492kz, StatefulButtonElement c3492kz2, StatefulButtonElement c3492kz3, vo0.v1 v1Var) {
            if (7 != (i11 & 7)) {
                vo0.h1.b(i11, 7, a.f33653a.getDescriptor());
            }
            this.primary = c3492kz;
            this.secondary = c3492kz2;
            this.tertiary = c3492kz3;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final StatefulButtonElement getPrimary() {
            return this.primary;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final StatefulButtonElement getSecondary() {
            return this.secondary;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final StatefulButtonElement getTertiary() {
            return this.tertiary;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonGroupElement)) {
                return false;
            }
            ButtonGroupElement buttonGroupElement = (ButtonGroupElement) other;
            return p013kotlin.jvm.internal.s.f(this.primary, buttonGroupElement.primary) && p013kotlin.jvm.internal.s.f(this.secondary, buttonGroupElement.secondary) && p013kotlin.jvm.internal.s.f(this.tertiary, buttonGroupElement.tertiary);
        }

        public int hashCode() {
            return (((this.primary.hashCode() * 31) + this.secondary.hashCode()) * 31) + this.tertiary.hashCode();
        }

        public String toString() {
            return "ButtonGroupElement(primary=" + this.primary + ", secondary=" + this.secondary + ", tertiary=" + this.tertiary + ")";
        }

        public ButtonGroupElement(StatefulButtonElement primary, StatefulButtonElement secondary, StatefulButtonElement tertiary) {
            p013kotlin.jvm.internal.s.k(primary, "primary");
            p013kotlin.jvm.internal.s.k(secondary, "secondary");
            p013kotlin.jvm.internal.s.k(tertiary, "tertiary");
            this.primary = primary;
            this.secondary = secondary;
            this.tertiary = tertiary;
        }

        public static final /* synthetic */ void a(ButtonGroupElement self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f33649d;
            output.D(serialDesc, 0, dVarArr[0], self.primary);
            output.D(serialDesc, 1, dVarArr[1], self.secondary);
            output.D(serialDesc, 2, dVarArr[2], self.tertiary);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<OrcaStylingElements> serializer() {
            return a.f33647a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$d, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\u0012 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006\""}, d2 = {"Lcom/fourthline/orca/internal/mp$d;", "", "Lcom/fourthline/orca/internal/g4;", "highlight", AppStateModule.APP_STATE_BACKGROUND, "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/g4;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mp$d;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "c", "()Lcom/fourthline/orca/internal/g4;", "b", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class GraphicElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ro0.d[] f33655c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement highlight;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement background;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$d$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33658a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33659b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33658a = aVar;
                f33659b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.OrcaStylingElements.GraphicElement", aVar, 2);
                m1Var.o("highlight", false);
                m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GraphicElement deserialize(uo0.e decoder) {
                ColorElement c3285g4;
                ColorElement c3285g5;
                int i11;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = GraphicElement.f33655c;
                vo0.v1 v1Var = null;
                if (cVarB.i()) {
                    c3285g5 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                    c3285g4 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], null);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    ColorElement c3285g6 = null;
                    ColorElement c3285g7 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            c3285g7 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], c3285g7);
                            i12 |= 1;
                        } else {
                            if (iA != 1) {
                                throw new UnknownFieldException(iA);
                            }
                            c3285g6 = (ColorElement) cVarB.n(fVar, 1, dVarArr[1], c3285g6);
                            i12 |= 2;
                        }
                    }
                    c3285g4 = c3285g6;
                    c3285g5 = c3285g7;
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new GraphicElement(i11, c3285g5, c3285g4, v1Var);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = GraphicElement.f33655c;
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
            public final void serialize(uo0.f encoder, GraphicElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                GraphicElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<GraphicElement> serializer() {
                return a.f33658a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            ColorElement.Companion aVar = ColorElement.INSTANCE;
            f33655c = new ro0.d[]{aVar.serializer(), aVar.serializer()};
        }

        public /* synthetic */ GraphicElement(int i11, ColorElement c3285g4, ColorElement c3285g5, vo0.v1 v1Var) {
            if (3 != (i11 & 3)) {
                vo0.h1.b(i11, 3, a.f33658a.getDescriptor());
            }
            this.highlight = c3285g4;
            this.background = c3285g5;
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
            if (!(other instanceof GraphicElement)) {
                return false;
            }
            GraphicElement graphicElement = (GraphicElement) other;
            return p013kotlin.jvm.internal.s.f(this.highlight, graphicElement.highlight) && p013kotlin.jvm.internal.s.f(this.background, graphicElement.background);
        }

        public int hashCode() {
            return (this.highlight.hashCode() * 31) + this.background.hashCode();
        }

        public String toString() {
            return "GraphicElement(highlight=" + this.highlight + ", background=" + this.background + ")";
        }

        public GraphicElement(ColorElement highlight, ColorElement background) {
            p013kotlin.jvm.internal.s.k(highlight, "highlight");
            p013kotlin.jvm.internal.s.k(background, "background");
            this.highlight = highlight;
            this.background = background;
        }

        public static final /* synthetic */ void a(GraphicElement self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f33655c;
            output.D(serialDesc, 0, dVarArr[0], self.highlight);
            output.D(serialDesc, 1, dVarArr[1], self.background);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$e, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002\u0013 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u0013\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u001f¨\u0006%"}, d2 = {"Lcom/fourthline/orca/internal/mp$e;", "", "Lcom/fourthline/orca/internal/mp$d;", "info", "danger", "success", "<init>", "(Lcom/fourthline/orca/internal/mp$d;Lcom/fourthline/orca/internal/mp$d;Lcom/fourthline/orca/internal/mp$d;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/mp$d;Lcom/fourthline/orca/internal/mp$d;Lcom/fourthline/orca/internal/mp$d;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mp$e;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/mp$d;", "()Lcom/fourthline/orca/internal/mp$d;", "b", "getDanger", "c", "getSuccess", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class GraphicGroupElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final GraphicElement info;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final GraphicElement danger;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final GraphicElement success;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$e$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33663a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33664b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33663a = aVar;
                f33664b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.OrcaStylingElements.GraphicGroupElement", aVar, 3);
                m1Var.o("info", false);
                m1Var.o("danger", false);
                m1Var.o("success", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GraphicGroupElement deserialize(uo0.e decoder) {
                int i11;
                GraphicElement graphicElement;
                GraphicElement graphicElement2;
                GraphicElement graphicElement3;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                GraphicElement graphicElement4 = null;
                if (cVarB.i()) {
                    GraphicElement.a aVar = GraphicElement.a.f33658a;
                    GraphicElement graphicElement5 = (GraphicElement) cVarB.n(fVar, 0, aVar, null);
                    GraphicElement graphicElement6 = (GraphicElement) cVarB.n(fVar, 1, aVar, null);
                    graphicElement3 = (GraphicElement) cVarB.n(fVar, 2, aVar, null);
                    i11 = 7;
                    graphicElement2 = graphicElement6;
                    graphicElement = graphicElement5;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    GraphicElement graphicElement7 = null;
                    GraphicElement graphicElement8 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            graphicElement4 = (GraphicElement) cVarB.n(fVar, 0, GraphicElement.a.f33658a, graphicElement4);
                            i12 |= 1;
                        } else if (iA == 1) {
                            graphicElement7 = (GraphicElement) cVarB.n(fVar, 1, GraphicElement.a.f33658a, graphicElement7);
                            i12 |= 2;
                        } else {
                            if (iA != 2) {
                                throw new UnknownFieldException(iA);
                            }
                            graphicElement8 = (GraphicElement) cVarB.n(fVar, 2, GraphicElement.a.f33658a, graphicElement8);
                            i12 |= 4;
                        }
                    }
                    i11 = i12;
                    graphicElement = graphicElement4;
                    graphicElement2 = graphicElement7;
                    graphicElement3 = graphicElement8;
                }
                cVarB.c(fVar);
                return new GraphicGroupElement(i11, graphicElement, graphicElement2, graphicElement3, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                GraphicElement.a aVar = GraphicElement.a.f33658a;
                return new ro0.d[]{aVar, aVar, aVar};
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
            public final void serialize(uo0.f encoder, GraphicGroupElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                GraphicGroupElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<GraphicGroupElement> serializer() {
                return a.f33663a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ GraphicGroupElement(int i11, GraphicElement graphicElement, GraphicElement graphicElement2, GraphicElement graphicElement3, vo0.v1 v1Var) {
            if (7 != (i11 & 7)) {
                vo0.h1.b(i11, 7, a.f33663a.getDescriptor());
            }
            this.info = graphicElement;
            this.danger = graphicElement2;
            this.success = graphicElement3;
        }

        public static final /* synthetic */ void a(GraphicGroupElement self, uo0.d output, to0.f serialDesc) {
            GraphicElement.a aVar = GraphicElement.a.f33658a;
            output.D(serialDesc, 0, aVar, self.info);
            output.D(serialDesc, 1, aVar, self.danger);
            output.D(serialDesc, 2, aVar, self.success);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GraphicGroupElement)) {
                return false;
            }
            GraphicGroupElement graphicGroupElement = (GraphicGroupElement) other;
            return p013kotlin.jvm.internal.s.f(this.info, graphicGroupElement.info) && p013kotlin.jvm.internal.s.f(this.danger, graphicGroupElement.danger) && p013kotlin.jvm.internal.s.f(this.success, graphicGroupElement.success);
        }

        public int hashCode() {
            return (((this.info.hashCode() * 31) + this.danger.hashCode()) * 31) + this.success.hashCode();
        }

        public String toString() {
            return "GraphicGroupElement(info=" + this.info + ", danger=" + this.danger + ", success=" + this.success + ")";
        }

        public GraphicGroupElement(GraphicElement info, GraphicElement danger, GraphicElement success) {
            p013kotlin.jvm.internal.s.k(info, "info");
            p013kotlin.jvm.internal.s.k(danger, "danger");
            p013kotlin.jvm.internal.s.k(success, "success");
            this.info = info;
            this.danger = danger;
            this.success = success;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GraphicElement getInfo() {
            return this.info;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$f, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 22\u00020\u0001:\u0002\u0019%B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b*\u00101¨\u00063"}, d2 = {"Lcom/fourthline/orca/internal/mp$f;", "", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/fourthline/orca/internal/OA;", "header", "title", "message", "Lcom/fourthline/orca/internal/Wh;", "instructions", "Lcom/fourthline/orca/internal/mp$g;", "graphicContainer", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/Wh;Lcom/fourthline/orca/internal/mp$g;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/Wh;Lcom/fourthline/orca/internal/mp$g;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mp$f;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "b", "()Lcom/fourthline/orca/internal/g4;", "Lcom/fourthline/orca/internal/OA;", DateTokenConverter.CONVERTER_KEY, "()Lcom/fourthline/orca/internal/OA;", "c", "f", "e", "Lcom/fourthline/orca/internal/Wh;", "getInstructions", "()Lcom/fourthline/orca/internal/Wh;", "Lcom/fourthline/orca/internal/mp$g;", "()Lcom/fourthline/orca/internal/mp$g;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class PageElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final ro0.d[] f33665g = {ColorElement.INSTANCE.serializer(), null, null, null, null, null};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement header;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement title;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement message;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstructionBoxElement instructions;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final PageGraphicContainerElement graphicContainer;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$f$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33672a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33673b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33672a = aVar;
                f33673b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.OrcaStylingElements.PageElement", aVar, 6);
                m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
                m1Var.o("header", false);
                m1Var.o("title", false);
                m1Var.o("message", false);
                m1Var.o("instructions", false);
                m1Var.o("graphicContainer", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PageElement deserialize(uo0.e decoder) {
                int i11;
                ColorElement c3285g4;
                TextElement oa2;
                TextElement oa3;
                TextElement oa4;
                InstructionBoxElement wh2;
                PageGraphicContainerElement pageGraphicContainerElement;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = PageElement.f33665g;
                int i12 = 5;
                int i13 = 0;
                ColorElement c3285g5 = null;
                if (cVarB.i()) {
                    ColorElement c3285g6 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                    TextElement.a aVar = TextElement.a.f27138a;
                    TextElement oa5 = (TextElement) cVarB.n(fVar, 1, aVar, null);
                    TextElement oa6 = (TextElement) cVarB.n(fVar, 2, aVar, null);
                    TextElement oa7 = (TextElement) cVarB.n(fVar, 3, aVar, null);
                    InstructionBoxElement wh3 = (InstructionBoxElement) cVarB.n(fVar, 4, InstructionBoxElement.a.f29558a, null);
                    c3285g4 = c3285g6;
                    oa4 = oa7;
                    pageGraphicContainerElement = (PageGraphicContainerElement) cVarB.n(fVar, 5, PageGraphicContainerElement.a.f33677a, null);
                    wh2 = wh3;
                    i11 = 63;
                    oa3 = oa6;
                    oa2 = oa5;
                } else {
                    int i14 = 1;
                    int i15 = 0;
                    TextElement oa8 = null;
                    TextElement oa9 = null;
                    TextElement oa10 = null;
                    InstructionBoxElement wh4 = null;
                    PageGraphicContainerElement pageGraphicContainerElement2 = null;
                    while (i14 != 0) {
                        int i16 = i13;
                        int iA = cVarB.A(fVar);
                        switch (iA) {
                            case -1:
                                i13 = i16;
                                i14 = i13;
                                i12 = 5;
                                break;
                            case 0:
                                c3285g5 = (ColorElement) cVarB.n(fVar, i16, dVarArr[i16], c3285g5);
                                i15 |= 1;
                                i13 = i16;
                                i12 = 5;
                                break;
                            case 1:
                                oa8 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, oa8);
                                i15 |= 2;
                                i13 = i16;
                                break;
                            case 2:
                                oa9 = (TextElement) cVarB.n(fVar, 2, TextElement.a.f27138a, oa9);
                                i15 |= 4;
                                i13 = i16;
                                break;
                            case 3:
                                oa10 = (TextElement) cVarB.n(fVar, 3, TextElement.a.f27138a, oa10);
                                i15 |= 8;
                                i13 = i16;
                                break;
                            case 4:
                                wh4 = (InstructionBoxElement) cVarB.n(fVar, 4, InstructionBoxElement.a.f29558a, wh4);
                                i15 |= 16;
                                i13 = i16;
                                break;
                            case 5:
                                pageGraphicContainerElement2 = (PageGraphicContainerElement) cVarB.n(fVar, i12, PageGraphicContainerElement.a.f33677a, pageGraphicContainerElement2);
                                i15 |= 32;
                                i13 = i16;
                                break;
                            default:
                                throw new UnknownFieldException(iA);
                        }
                    }
                    i11 = i15;
                    c3285g4 = c3285g5;
                    oa2 = oa8;
                    oa3 = oa9;
                    oa4 = oa10;
                    wh2 = wh4;
                    pageGraphicContainerElement = pageGraphicContainerElement2;
                }
                cVarB.c(fVar);
                return new PageElement(i11, c3285g4, oa2, oa3, oa4, wh2, pageGraphicContainerElement, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                TextElement.a aVar = TextElement.a.f27138a;
                return new ro0.d[]{PageElement.f33665g[0], aVar, aVar, aVar, InstructionBoxElement.a.f29558a, PageGraphicContainerElement.a.f33677a};
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
            public final void serialize(uo0.f encoder, PageElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                PageElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$f$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<PageElement> serializer() {
                return a.f33672a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PageElement(int i11, ColorElement c3285g4, TextElement oa2, TextElement oa3, TextElement oa4, InstructionBoxElement wh2, PageGraphicContainerElement pageGraphicContainerElement, vo0.v1 v1Var) {
            if (63 != (i11 & 63)) {
                vo0.h1.b(i11, 63, a.f33672a.getDescriptor());
            }
            this.background = c3285g4;
            this.header = oa2;
            this.title = oa3;
            this.message = oa4;
            this.instructions = wh2;
            this.graphicContainer = pageGraphicContainerElement;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColorElement getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final PageGraphicContainerElement getGraphicContainer() {
            return this.graphicContainer;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextElement getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextElement getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageElement)) {
                return false;
            }
            PageElement pageElement = (PageElement) other;
            return p013kotlin.jvm.internal.s.f(this.background, pageElement.background) && p013kotlin.jvm.internal.s.f(this.header, pageElement.header) && p013kotlin.jvm.internal.s.f(this.title, pageElement.title) && p013kotlin.jvm.internal.s.f(this.message, pageElement.message) && p013kotlin.jvm.internal.s.f(this.instructions, pageElement.instructions) && p013kotlin.jvm.internal.s.f(this.graphicContainer, pageElement.graphicContainer);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextElement getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((((this.background.hashCode() * 31) + this.header.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.instructions.hashCode()) * 31) + this.graphicContainer.hashCode();
        }

        public String toString() {
            return "PageElement(background=" + this.background + ", header=" + this.header + ", title=" + this.title + ", message=" + this.message + ", instructions=" + this.instructions + ", graphicContainer=" + this.graphicContainer + ")";
        }

        public PageElement(ColorElement background, TextElement header, TextElement title, TextElement message, InstructionBoxElement instructions, PageGraphicContainerElement graphicContainer) {
            p013kotlin.jvm.internal.s.k(background, "background");
            p013kotlin.jvm.internal.s.k(header, "header");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(message, "message");
            p013kotlin.jvm.internal.s.k(instructions, "instructions");
            p013kotlin.jvm.internal.s.k(graphicContainer, "graphicContainer");
            this.background = background;
            this.header = header;
            this.title = title;
            this.message = message;
            this.instructions = instructions;
            this.graphicContainer = graphicContainer;
        }

        public static final /* synthetic */ void a(PageElement self, uo0.d output, to0.f serialDesc) {
            output.D(serialDesc, 0, f33665g[0], self.background);
            TextElement.a aVar = TextElement.a.f27138a;
            output.D(serialDesc, 1, aVar, self.header);
            output.D(serialDesc, 2, aVar, self.title);
            output.D(serialDesc, 3, aVar, self.message);
            output.D(serialDesc, 4, InstructionBoxElement.a.f29558a, self.instructions);
            output.D(serialDesc, 5, PageGraphicContainerElement.a.f33677a, self.graphicContainer);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$g, reason: from toString */
    @ro0.o("graphic_container")
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002\u0016\"B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012*\b\u0002\u0010\t\u001a$0\u0004j\u0011`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\n\u0010\u000bB-\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R9\u0010\t\u001a$0\u0004j\u0011`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010\u001c¨\u0006'"}, d2 = {"Lcom/fourthline/orca/internal/mp$g;", "", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/zw;", "radius", "<init>", "(Lcom/fourthline/orca/internal/g4;I)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mp$g;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "b", "()Lcom/fourthline/orca/internal/g4;", "I", "c", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class PageGraphicContainerElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ro0.d[] f33674c = {ColorElement.INSTANCE.serializer(), new C4134zw()};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int radius;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$g$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33677a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33678b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33677a = aVar;
                f33678b = 8;
                vo0.m1 m1Var = new vo0.m1("graphic_container", aVar, 2);
                m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
                m1Var.o("radius", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PageGraphicContainerElement deserialize(uo0.e decoder) {
                int iIntValue;
                ColorElement c3285g4;
                int i11;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = PageGraphicContainerElement.f33674c;
                vo0.v1 v1Var = null;
                if (cVarB.i()) {
                    c3285g4 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                    iIntValue = ((Number) cVarB.n(fVar, 1, dVarArr[1], 0)).intValue();
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int iIntValue2 = 0;
                    int i12 = 0;
                    ColorElement c3285g5 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            c3285g5 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], c3285g5);
                            i12 |= 1;
                        } else {
                            if (iA != 1) {
                                throw new UnknownFieldException(iA);
                            }
                            iIntValue2 = ((Number) cVarB.n(fVar, 1, dVarArr[1], Integer.valueOf(iIntValue2))).intValue();
                            i12 |= 2;
                        }
                    }
                    iIntValue = iIntValue2;
                    c3285g4 = c3285g5;
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new PageGraphicContainerElement(i11, c3285g4, iIntValue, v1Var);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = PageGraphicContainerElement.f33674c;
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
            public final void serialize(uo0.f encoder, PageGraphicContainerElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                PageGraphicContainerElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$g$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<PageGraphicContainerElement> serializer() {
                return a.f33677a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ PageGraphicContainerElement(int i11, ColorElement c3285g4, int i12, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f33677a.getDescriptor());
            }
            this.background = c3285g4;
            if ((i11 & 2) == 0) {
                this.radius = 4;
            } else {
                this.radius = i12;
            }
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColorElement getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getRadius() {
            return this.radius;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageGraphicContainerElement)) {
                return false;
            }
            PageGraphicContainerElement pageGraphicContainerElement = (PageGraphicContainerElement) other;
            return p013kotlin.jvm.internal.s.f(this.background, pageGraphicContainerElement.background) && this.radius == pageGraphicContainerElement.radius;
        }

        public int hashCode() {
            return (this.background.hashCode() * 31) + Integer.hashCode(this.radius);
        }

        public String toString() {
            return "PageGraphicContainerElement(background=" + this.background + ", radius=" + this.radius + ")";
        }

        public PageGraphicContainerElement(ColorElement background, int i11) {
            p013kotlin.jvm.internal.s.k(background, "background");
            this.background = background;
            this.radius = i11;
        }

        public static final /* synthetic */ void a(PageGraphicContainerElement self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f33674c;
            output.D(serialDesc, 0, dVarArr[0], self.background);
            if (!output.G(serialDesc, 1) && self.radius == 4) {
                return;
            }
            output.D(serialDesc, 1, dVarArr[1], Integer.valueOf(self.radius));
        }

        public /* synthetic */ PageGraphicContainerElement(ColorElement c3285g4, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(c3285g4, (i12 & 2) != 0 ? 4 : i11);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$h, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 02\u00020\u0001:\u0002\u0018$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b,\u0010/¨\u00061"}, d2 = {"Lcom/fourthline/orca/internal/mp$h;", "", "Lcom/fourthline/orca/internal/g4;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/fourthline/orca/internal/OA;", "header", "Lcom/fourthline/orca/internal/kz;", "primary", "secondary", "Lcom/fourthline/orca/internal/Wh;", "instructions", "<init>", "(Lcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/kz;Lcom/fourthline/orca/internal/kz;Lcom/fourthline/orca/internal/Wh;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/g4;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/kz;Lcom/fourthline/orca/internal/kz;Lcom/fourthline/orca/internal/Wh;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mp$h;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/g4;", "b", "()Lcom/fourthline/orca/internal/g4;", "Lcom/fourthline/orca/internal/OA;", "c", "()Lcom/fourthline/orca/internal/OA;", "Lcom/fourthline/orca/internal/kz;", "e", "()Lcom/fourthline/orca/internal/kz;", DateTokenConverter.CONVERTER_KEY, "f", "Lcom/fourthline/orca/internal/Wh;", "()Lcom/fourthline/orca/internal/Wh;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class ScannerConfirmationElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ro0.d[] f33679f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorElement background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement header;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatefulButtonElement primary;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatefulButtonElement secondary;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstructionBoxElement instructions;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$h$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33685a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33686b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33685a = aVar;
                f33686b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.OrcaStylingElements.ScannerConfirmationElement", aVar, 5);
                m1Var.o(AppStateModule.APP_STATE_BACKGROUND, false);
                m1Var.o("header", false);
                m1Var.o("primary", false);
                m1Var.o("secondary", false);
                m1Var.o("instructions", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ScannerConfirmationElement deserialize(uo0.e decoder) {
                int i11;
                ColorElement c3285g4;
                TextElement oa2;
                StatefulButtonElement c3492kz;
                StatefulButtonElement c3492kz2;
                InstructionBoxElement wh2;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = ScannerConfirmationElement.f33679f;
                int i12 = 0;
                ColorElement c3285g5 = null;
                if (cVarB.i()) {
                    ColorElement c3285g6 = (ColorElement) cVarB.n(fVar, 0, dVarArr[0], null);
                    TextElement oa3 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, null);
                    StatefulButtonElement c3492kz3 = (StatefulButtonElement) cVarB.n(fVar, 2, dVarArr[2], null);
                    c3492kz2 = (StatefulButtonElement) cVarB.n(fVar, 3, dVarArr[3], null);
                    c3285g4 = c3285g6;
                    wh2 = (InstructionBoxElement) cVarB.n(fVar, 4, InstructionBoxElement.a.f29558a, null);
                    i11 = 31;
                    c3492kz = c3492kz3;
                    oa2 = oa3;
                } else {
                    int i13 = 1;
                    int i14 = 0;
                    TextElement oa4 = null;
                    StatefulButtonElement c3492kz4 = null;
                    StatefulButtonElement c3492kz5 = null;
                    InstructionBoxElement wh3 = null;
                    while (i13 != 0) {
                        int iA = cVarB.A(fVar);
                        int i15 = i12;
                        if (iA == -1) {
                            i12 = i15;
                            i13 = i12;
                        } else if (iA != 0) {
                            if (iA == 1) {
                                oa4 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, oa4);
                                i14 |= 2;
                            } else if (iA == 2) {
                                c3492kz4 = (StatefulButtonElement) cVarB.n(fVar, 2, dVarArr[2], c3492kz4);
                                i14 |= 4;
                            } else if (iA == 3) {
                                c3492kz5 = (StatefulButtonElement) cVarB.n(fVar, 3, dVarArr[3], c3492kz5);
                                i14 |= 8;
                            } else {
                                if (iA != 4) {
                                    throw new UnknownFieldException(iA);
                                }
                                wh3 = (InstructionBoxElement) cVarB.n(fVar, 4, InstructionBoxElement.a.f29558a, wh3);
                                i14 |= 16;
                            }
                            i12 = i15;
                        } else {
                            c3285g5 = (ColorElement) cVarB.n(fVar, i15, dVarArr[i15], c3285g5);
                            i14 |= 1;
                            i12 = i15;
                        }
                    }
                    i11 = i14;
                    c3285g4 = c3285g5;
                    oa2 = oa4;
                    c3492kz = c3492kz4;
                    c3492kz2 = c3492kz5;
                    wh2 = wh3;
                }
                cVarB.c(fVar);
                return new ScannerConfirmationElement(i11, c3285g4, oa2, c3492kz, c3492kz2, wh2, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                ro0.d[] dVarArr = ScannerConfirmationElement.f33679f;
                return new ro0.d[]{dVarArr[0], TextElement.a.f27138a, dVarArr[2], dVarArr[3], InstructionBoxElement.a.f29558a};
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
            public final void serialize(uo0.f encoder, ScannerConfirmationElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                ScannerConfirmationElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$h$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<ScannerConfirmationElement> serializer() {
                return a.f33685a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            ro0.d<ColorElement> dVarSerializer = ColorElement.INSTANCE.serializer();
            StatefulButtonElement.Companion aVar = StatefulButtonElement.INSTANCE;
            f33679f = new ro0.d[]{dVarSerializer, null, aVar.serializer(), aVar.serializer(), null};
        }

        public /* synthetic */ ScannerConfirmationElement(int i11, ColorElement c3285g4, TextElement oa2, StatefulButtonElement c3492kz, StatefulButtonElement c3492kz2, InstructionBoxElement wh2, vo0.v1 v1Var) {
            if (31 != (i11 & 31)) {
                vo0.h1.b(i11, 31, a.f33685a.getDescriptor());
            }
            this.background = c3285g4;
            this.header = oa2;
            this.primary = c3492kz;
            this.secondary = c3492kz2;
            this.instructions = wh2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ColorElement getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextElement getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InstructionBoxElement getInstructions() {
            return this.instructions;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final StatefulButtonElement getPrimary() {
            return this.primary;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScannerConfirmationElement)) {
                return false;
            }
            ScannerConfirmationElement scannerConfirmationElement = (ScannerConfirmationElement) other;
            return p013kotlin.jvm.internal.s.f(this.background, scannerConfirmationElement.background) && p013kotlin.jvm.internal.s.f(this.header, scannerConfirmationElement.header) && p013kotlin.jvm.internal.s.f(this.primary, scannerConfirmationElement.primary) && p013kotlin.jvm.internal.s.f(this.secondary, scannerConfirmationElement.secondary) && p013kotlin.jvm.internal.s.f(this.instructions, scannerConfirmationElement.instructions);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final StatefulButtonElement getSecondary() {
            return this.secondary;
        }

        public int hashCode() {
            return (((((((this.background.hashCode() * 31) + this.header.hashCode()) * 31) + this.primary.hashCode()) * 31) + this.secondary.hashCode()) * 31) + this.instructions.hashCode();
        }

        public String toString() {
            return "ScannerConfirmationElement(background=" + this.background + ", header=" + this.header + ", primary=" + this.primary + ", secondary=" + this.secondary + ", instructions=" + this.instructions + ")";
        }

        public ScannerConfirmationElement(ColorElement background, TextElement header, StatefulButtonElement primary, StatefulButtonElement secondary, InstructionBoxElement instructions) {
            p013kotlin.jvm.internal.s.k(background, "background");
            p013kotlin.jvm.internal.s.k(header, "header");
            p013kotlin.jvm.internal.s.k(primary, "primary");
            p013kotlin.jvm.internal.s.k(secondary, "secondary");
            p013kotlin.jvm.internal.s.k(instructions, "instructions");
            this.background = background;
            this.header = header;
            this.primary = primary;
            this.secondary = secondary;
            this.instructions = instructions;
        }

        public static final /* synthetic */ void a(ScannerConfirmationElement self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f33679f;
            output.D(serialDesc, 0, dVarArr[0], self.background);
            output.D(serialDesc, 1, TextElement.a.f27138a, self.header);
            output.D(serialDesc, 2, dVarArr[2], self.primary);
            output.D(serialDesc, 3, dVarArr[3], self.secondary);
            output.D(serialDesc, 4, InstructionBoxElement.a.f29558a, self.instructions);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$i, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002\u0014 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0014\u0010$¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/mp$i;", "", "Lcom/fourthline/orca/internal/OA;", "header", "message", "Lcom/fourthline/orca/internal/mp$h;", "confirmation", "<init>", "(Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/mp$h;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/mp$h;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/mp$i;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/OA;", "b", "()Lcom/fourthline/orca/internal/OA;", "c", "Lcom/fourthline/orca/internal/mp$h;", "()Lcom/fourthline/orca/internal/mp$h;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class ScannerPageElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement header;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ScannerConfirmationElement confirmation;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$i$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f33690a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f33691b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f33690a = aVar;
                f33691b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.OrcaStylingElements.ScannerPageElement", aVar, 3);
                m1Var.o("header", false);
                m1Var.o("message", false);
                m1Var.o("confirmation", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ScannerPageElement deserialize(uo0.e decoder) {
                int i11;
                TextElement oa2;
                TextElement oa3;
                ScannerConfirmationElement scannerConfirmationElement;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                TextElement oa4 = null;
                if (cVarB.i()) {
                    TextElement.a aVar = TextElement.a.f27138a;
                    TextElement oa5 = (TextElement) cVarB.n(fVar, 0, aVar, null);
                    oa3 = (TextElement) cVarB.n(fVar, 1, aVar, null);
                    scannerConfirmationElement = (ScannerConfirmationElement) cVarB.n(fVar, 2, ScannerConfirmationElement.a.f33685a, null);
                    i11 = 7;
                    oa2 = oa5;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    TextElement oa6 = null;
                    ScannerConfirmationElement scannerConfirmationElement2 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            oa4 = (TextElement) cVarB.n(fVar, 0, TextElement.a.f27138a, oa4);
                            i12 |= 1;
                        } else if (iA == 1) {
                            oa6 = (TextElement) cVarB.n(fVar, 1, TextElement.a.f27138a, oa6);
                            i12 |= 2;
                        } else {
                            if (iA != 2) {
                                throw new UnknownFieldException(iA);
                            }
                            scannerConfirmationElement2 = (ScannerConfirmationElement) cVarB.n(fVar, 2, ScannerConfirmationElement.a.f33685a, scannerConfirmationElement2);
                            i12 |= 4;
                        }
                    }
                    i11 = i12;
                    oa2 = oa4;
                    oa3 = oa6;
                    scannerConfirmationElement = scannerConfirmationElement2;
                }
                cVarB.c(fVar);
                return new ScannerPageElement(i11, oa2, oa3, scannerConfirmationElement, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                TextElement.a aVar = TextElement.a.f27138a;
                return new ro0.d[]{aVar, aVar, ScannerConfirmationElement.a.f33685a};
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
            public final void serialize(uo0.f encoder, ScannerPageElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                ScannerPageElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mp$i$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<ScannerPageElement> serializer() {
                return a.f33690a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ScannerPageElement(int i11, TextElement oa2, TextElement oa3, ScannerConfirmationElement scannerConfirmationElement, vo0.v1 v1Var) {
            if (7 != (i11 & 7)) {
                vo0.h1.b(i11, 7, a.f33690a.getDescriptor());
            }
            this.header = oa2;
            this.message = oa3;
            this.confirmation = scannerConfirmationElement;
        }

        public static final /* synthetic */ void a(ScannerPageElement self, uo0.d output, to0.f serialDesc) {
            TextElement.a aVar = TextElement.a.f27138a;
            output.D(serialDesc, 0, aVar, self.header);
            output.D(serialDesc, 1, aVar, self.message);
            output.D(serialDesc, 2, ScannerConfirmationElement.a.f33685a, self.confirmation);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextElement getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextElement getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScannerPageElement)) {
                return false;
            }
            ScannerPageElement scannerPageElement = (ScannerPageElement) other;
            return p013kotlin.jvm.internal.s.f(this.header, scannerPageElement.header) && p013kotlin.jvm.internal.s.f(this.message, scannerPageElement.message) && p013kotlin.jvm.internal.s.f(this.confirmation, scannerPageElement.confirmation);
        }

        public int hashCode() {
            return (((this.header.hashCode() * 31) + this.message.hashCode()) * 31) + this.confirmation.hashCode();
        }

        public String toString() {
            return "ScannerPageElement(header=" + this.header + ", message=" + this.message + ", confirmation=" + this.confirmation + ")";
        }

        public ScannerPageElement(TextElement header, TextElement message, ScannerConfirmationElement confirmation) {
            p013kotlin.jvm.internal.s.k(header, "header");
            p013kotlin.jvm.internal.s.k(message, "message");
            p013kotlin.jvm.internal.s.k(confirmation, "confirmation");
            this.header = header;
            this.message = message;
            this.confirmation = confirmation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ScannerConfirmationElement getConfirmation() {
            return this.confirmation;
        }
    }

    public /* synthetic */ OrcaStylingElements(int i11, ButtonGroupElement buttonGroupElement, PageElement pageElement, ScannerPageElement scannerPageElement, GraphicGroupElement graphicGroupElement, StatefulTextInputElement c3750qz, DialogElement l11, HintElementVariants c3048ah, ProgressElement us2, StatefulRadioCellElement c3707pz, AgreementsElement c3238f0, AccordionElement c3109c, StatefulCheckboxElement c3578mz, StatefulLinkButtonElement c3664oz, vo0.v1 v1Var) {
        if (8191 != (i11 & 8191)) {
            vo0.h1.b(i11, 8191, a.f33647a.getDescriptor());
        }
        this.button = buttonGroupElement;
        this.screen = pageElement;
        this.scanner = scannerPageElement;
        this.graphic = graphicGroupElement;
        this.input = c3750qz;
        this.dialog = l11;
        this.hint = c3048ah;
        this.spinner = us2;
        this.radio = c3707pz;
        this.agreements = c3238f0;
        this.accordion = c3109c;
        this.checkbox = c3578mz;
        this.linkButton = c3664oz;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AgreementsElement getAgreements() {
        return this.agreements;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ButtonGroupElement getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final StatefulCheckboxElement getCheckbox() {
        return this.checkbox;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DialogElement getDialog() {
        return this.dialog;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaStylingElements)) {
            return false;
        }
        OrcaStylingElements orcaStylingElements = (OrcaStylingElements) other;
        return p013kotlin.jvm.internal.s.f(this.button, orcaStylingElements.button) && p013kotlin.jvm.internal.s.f(this.screen, orcaStylingElements.screen) && p013kotlin.jvm.internal.s.f(this.scanner, orcaStylingElements.scanner) && p013kotlin.jvm.internal.s.f(this.graphic, orcaStylingElements.graphic) && p013kotlin.jvm.internal.s.f(this.input, orcaStylingElements.input) && p013kotlin.jvm.internal.s.f(this.dialog, orcaStylingElements.dialog) && p013kotlin.jvm.internal.s.f(this.hint, orcaStylingElements.hint) && p013kotlin.jvm.internal.s.f(this.spinner, orcaStylingElements.spinner) && p013kotlin.jvm.internal.s.f(this.radio, orcaStylingElements.radio) && p013kotlin.jvm.internal.s.f(this.agreements, orcaStylingElements.agreements) && p013kotlin.jvm.internal.s.f(this.accordion, orcaStylingElements.accordion) && p013kotlin.jvm.internal.s.f(this.checkbox, orcaStylingElements.checkbox) && p013kotlin.jvm.internal.s.f(this.linkButton, orcaStylingElements.linkButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final GraphicGroupElement getGraphic() {
        return this.graphic;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final HintElementVariants getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final StatefulTextInputElement getInput() {
        return this.input;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.button.hashCode() * 31) + this.screen.hashCode()) * 31) + this.scanner.hashCode()) * 31) + this.graphic.hashCode()) * 31) + this.input.hashCode()) * 31) + this.dialog.hashCode()) * 31) + this.hint.hashCode()) * 31) + this.spinner.hashCode()) * 31) + this.radio.hashCode()) * 31) + this.agreements.hashCode()) * 31) + this.accordion.hashCode()) * 31) + this.checkbox.hashCode()) * 31) + this.linkButton.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final StatefulLinkButtonElement getLinkButton() {
        return this.linkButton;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final StatefulRadioCellElement getRadio() {
        return this.radio;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final ScannerPageElement getScanner() {
        return this.scanner;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final PageElement getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final ProgressElement getSpinner() {
        return this.spinner;
    }

    public String toString() {
        return "OrcaStylingElements(button=" + this.button + ", screen=" + this.screen + ", scanner=" + this.scanner + ", graphic=" + this.graphic + ", input=" + this.input + ", dialog=" + this.dialog + ", hint=" + this.hint + ", spinner=" + this.spinner + ", radio=" + this.radio + ", agreements=" + this.agreements + ", accordion=" + this.accordion + ", checkbox=" + this.checkbox + ", linkButton=" + this.linkButton + ")";
    }

    public OrcaStylingElements(ButtonGroupElement button, PageElement screen, ScannerPageElement scanner, GraphicGroupElement graphic, StatefulTextInputElement input, DialogElement dialog, HintElementVariants hint, ProgressElement spinner, StatefulRadioCellElement radio, AgreementsElement agreements, AccordionElement accordion, StatefulCheckboxElement checkbox, StatefulLinkButtonElement linkButton) {
        p013kotlin.jvm.internal.s.k(button, "button");
        p013kotlin.jvm.internal.s.k(screen, "screen");
        p013kotlin.jvm.internal.s.k(scanner, "scanner");
        p013kotlin.jvm.internal.s.k(graphic, "graphic");
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(dialog, "dialog");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(spinner, "spinner");
        p013kotlin.jvm.internal.s.k(radio, "radio");
        p013kotlin.jvm.internal.s.k(agreements, "agreements");
        p013kotlin.jvm.internal.s.k(accordion, "accordion");
        p013kotlin.jvm.internal.s.k(checkbox, "checkbox");
        p013kotlin.jvm.internal.s.k(linkButton, "linkButton");
        this.button = button;
        this.screen = screen;
        this.scanner = scanner;
        this.graphic = graphic;
        this.input = input;
        this.dialog = dialog;
        this.hint = hint;
        this.spinner = spinner;
        this.radio = radio;
        this.agreements = agreements;
        this.accordion = accordion;
        this.checkbox = checkbox;
        this.linkButton = linkButton;
    }

    public static final /* synthetic */ void a(OrcaStylingElements self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f33633n;
        output.D(serialDesc, 0, ButtonGroupElement.a.f33653a, self.button);
        output.D(serialDesc, 1, PageElement.a.f33672a, self.screen);
        output.D(serialDesc, 2, ScannerPageElement.a.f33690a, self.scanner);
        output.D(serialDesc, 3, GraphicGroupElement.a.f33663a, self.graphic);
        output.D(serialDesc, 4, dVarArr[4], self.input);
        output.D(serialDesc, 5, DialogElement.a.f26713a, self.dialog);
        output.D(serialDesc, 6, HintElementVariants.a.f30415a, self.hint);
        output.D(serialDesc, 7, ProgressElement.a.f28850a, self.spinner);
        output.D(serialDesc, 8, StatefulRadioCellElement.a.f34669a, self.radio);
        output.D(serialDesc, 9, AgreementsElement.a.f31568a, self.agreements);
        output.D(serialDesc, 10, AccordionElement.a.f30746a, self.accordion);
        output.D(serialDesc, 11, StatefulCheckboxElement.a.f33740a, self.checkbox);
        output.D(serialDesc, 12, StatefulLinkButtonElement.a.f34400a, self.linkButton);
    }
}
