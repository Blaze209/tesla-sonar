package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.core.VideoDuration;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.w8, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b&\b\u0081\b\u0018\u0000 X2\u00020\u0001:\u0002(:Bx\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001b\u0010\u0017\u001a\u0017\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00160\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aB\u008b\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u0019\u0010!J'\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0089\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001d\b\u0002\u0010\u0017\u001a\u0017\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00160\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b(\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b<\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u0010I\u001a\u0004\bE\u0010JR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bC\u0010K\u001a\u0004\b>\u0010LR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010OR,\u0010\u0017\u001a\u0017\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00160\u00128\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bR\u0010?\u001a\u0004\bP\u0010AR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010T\u001a\u0004\bU\u0010V\"\u0004\b(\u0010W¨\u0006Y"}, d2 = {"Lcom/fourthline/orca/internal/w8;", "Lcom/fourthline/orca/internal/Rf;", "Lcom/fourthline/orca/internal/lg;", "documentStrategy", "Lcom/fourthline/orca/internal/M3;", "cameraX", "", "tiltedStepsEnabled", "Lcom/fourthline/orca/internal/v9;", "imageCapture", "Lcom/fourthline/orca/internal/Dc;", MediaStreamTrack.VIDEO_TRACK_KIND, "Lcom/fourthline/orca/internal/K7;", "confirmation", "Lcom/fourthline/orca/internal/S6;", AnalyticsContext.Analysis, "Lcom/fourthline/orca/internal/X9;", "nfc", "", "Lcom/fourthline/core/CountryNetworkModel;", "Lro0/p;", "with", "Lcom/fourthline/orca/internal/N5;", "supportedDocuments", "skipIntro", "<init>", "(Lcom/fourthline/orca/internal/lg;Lcom/fourthline/orca/internal/M3;ZLcom/fourthline/orca/internal/v9;Lcom/fourthline/orca/internal/Dc;Lcom/fourthline/orca/internal/K7;Lcom/fourthline/orca/internal/S6;Lcom/fourthline/orca/internal/X9;Ljava/util/List;Z)V", "", "seen0", "Lcom/fourthline/core/VideoDuration;", "videoDuration", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/lg;Lcom/fourthline/orca/internal/M3;ZLcom/fourthline/orca/internal/v9;Lcom/fourthline/orca/internal/Dc;Lcom/fourthline/orca/internal/K7;Lcom/fourthline/orca/internal/S6;Lcom/fourthline/orca/internal/X9;Ljava/util/List;ZLcom/fourthline/core/VideoDuration;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/w8;Luo0/d;Lto0/f;)V", "Lcom/fourthline/orca/internal/pb;", "m", "()Lcom/fourthline/orca/internal/pb;", "(Lcom/fourthline/orca/internal/lg;Lcom/fourthline/orca/internal/M3;ZLcom/fourthline/orca/internal/v9;Lcom/fourthline/orca/internal/Dc;Lcom/fourthline/orca/internal/K7;Lcom/fourthline/orca/internal/S6;Lcom/fourthline/orca/internal/X9;Ljava/util/List;Z)Lcom/fourthline/orca/internal/w8;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/lg;", "f", "()Lcom/fourthline/orca/internal/lg;", "b", "Lcom/fourthline/orca/internal/M3;", DateTokenConverter.CONVERTER_KEY, "()Lcom/fourthline/orca/internal/M3;", "c", "Z", "k", "()Z", "Lcom/fourthline/orca/internal/v9;", "g", "()Lcom/fourthline/orca/internal/v9;", "e", "Lcom/fourthline/orca/internal/Dc;", "l", "()Lcom/fourthline/orca/internal/Dc;", "Lcom/fourthline/orca/internal/K7;", "()Lcom/fourthline/orca/internal/K7;", "Lcom/fourthline/orca/internal/S6;", "()Lcom/fourthline/orca/internal/S6;", "h", "Lcom/fourthline/orca/internal/X9;", "()Lcom/fourthline/orca/internal/X9;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/fourthline/core/VideoDuration;", "getVideoDuration", "()Lcom/fourthline/core/VideoDuration;", "(Lcom/fourthline/core/VideoDuration;)V", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DocumentFlowConfig implements Rf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f36350l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ro0.d[] f36351m = {null, null, null, null, null, null, null, null, new vo0.e(new N5()), null, new ro0.h(p013kotlin.jvm.internal.o0.b(VideoDuration.class), new Annotation[0])};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FlowStrategyConfig documentStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CameraX cameraX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tiltedStepsEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentImageCaptureConfig imageCapture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentVideoCaptureConfig video;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentConfirmationConfig confirmation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentAnalysisConfig analysis;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentNfcConfig nfc;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List supportedDocuments;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean skipIntro;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private VideoDuration videoDuration;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.w8$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f36364b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f36363a = aVar;
            f36364b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.kyc.internal.flow.document.DocumentFlowConfig", aVar, 11);
            m1Var.o("documentStrategy", true);
            m1Var.o("cameraX", true);
            m1Var.o("tiltedStepsEnabled", false);
            m1Var.o("imageCapture", true);
            m1Var.o(MediaStreamTrack.VIDEO_TRACK_KIND, true);
            m1Var.o("confirmation", true);
            m1Var.o(AnalyticsContext.Analysis, false);
            m1Var.o("nfc", false);
            m1Var.o("supportedDocuments", false);
            m1Var.o("skipIntro", true);
            m1Var.o("videoDuration", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentFlowConfig deserialize(uo0.e decoder) {
            boolean z11;
            VideoDuration videoDuration;
            List list;
            DocumentNfcConfig x11;
            DocumentConfirmationConfig k11;
            DocumentAnalysisConfig s11;
            DocumentVideoCaptureConfig c2856Dc;
            CameraX m11;
            FlowStrategyConfig c3516lg;
            DocumentImageCaptureConfig c3932v9;
            int i11;
            boolean z12;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = DocumentFlowConfig.f36351m;
            int i12 = 9;
            int i13 = 10;
            int i14 = 8;
            int i15 = 0;
            if (cVarB.i()) {
                FlowStrategyConfig c3516lg2 = (FlowStrategyConfig) cVarB.n(fVar, 0, FlowStrategyConfig.a.f33316a, null);
                CameraX m12 = (CameraX) cVarB.n(fVar, 1, CameraX.a.f26887a, null);
                boolean zW = cVarB.w(fVar, 2);
                DocumentImageCaptureConfig c3932v10 = (DocumentImageCaptureConfig) cVarB.n(fVar, 3, DocumentImageCaptureConfig.a.f36045a, null);
                DocumentVideoCaptureConfig c2856Dc2 = (DocumentVideoCaptureConfig) cVarB.n(fVar, 4, DocumentVideoCaptureConfig.a.f25455a, null);
                DocumentConfirmationConfig k12 = (DocumentConfirmationConfig) cVarB.n(fVar, 5, DocumentConfirmationConfig.a.f26551a, null);
                DocumentAnalysisConfig s12 = (DocumentAnalysisConfig) cVarB.n(fVar, 6, DocumentAnalysisConfig.a.f27720a, null);
                DocumentNfcConfig x12 = (DocumentNfcConfig) cVarB.n(fVar, 7, DocumentNfcConfig.a.f29704a, null);
                List list2 = (List) cVarB.n(fVar, 8, dVarArr[8], null);
                boolean zW2 = cVarB.w(fVar, 9);
                videoDuration = (VideoDuration) cVarB.n(fVar, 10, dVarArr[10], null);
                c3516lg = c3516lg2;
                z11 = zW2;
                x11 = x12;
                s11 = s12;
                k11 = k12;
                c3932v9 = c3932v10;
                c2856Dc = c2856Dc2;
                z12 = zW;
                i11 = 2047;
                list = list2;
                m11 = m12;
            } else {
                boolean z13 = true;
                boolean zW3 = false;
                VideoDuration videoDuration2 = null;
                List list3 = null;
                DocumentNfcConfig x13 = null;
                DocumentConfirmationConfig k13 = null;
                DocumentAnalysisConfig s13 = null;
                DocumentVideoCaptureConfig c2856Dc3 = null;
                DocumentImageCaptureConfig c3932v11 = null;
                FlowStrategyConfig c3516lg3 = null;
                CameraX m13 = null;
                boolean zW4 = false;
                while (z13) {
                    int i16 = i14;
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            z13 = false;
                            i13 = 10;
                            i14 = 8;
                            dVarArr = dVarArr;
                            break;
                        case 0:
                            c3516lg3 = (FlowStrategyConfig) cVarB.n(fVar, 0, FlowStrategyConfig.a.f33316a, c3516lg3);
                            i15 |= 1;
                            dVarArr = dVarArr;
                            i12 = 9;
                            i13 = 10;
                            i14 = 8;
                            break;
                        case 1:
                            i15 |= 2;
                            m13 = (CameraX) cVarB.n(fVar, 1, CameraX.a.f26887a, m13);
                            i12 = 9;
                            i13 = 10;
                            i14 = 8;
                            break;
                        case 2:
                            zW4 = cVarB.w(fVar, 2);
                            i15 |= 4;
                            i12 = 9;
                            i14 = 8;
                            break;
                        case 3:
                            c3932v11 = (DocumentImageCaptureConfig) cVarB.n(fVar, 3, DocumentImageCaptureConfig.a.f36045a, c3932v11);
                            i15 |= 8;
                            i12 = 9;
                            i14 = 8;
                            break;
                        case 4:
                            c2856Dc3 = (DocumentVideoCaptureConfig) cVarB.n(fVar, 4, DocumentVideoCaptureConfig.a.f25455a, c2856Dc3);
                            i15 |= 16;
                            i12 = 9;
                            i14 = 8;
                            break;
                        case 5:
                            k13 = (DocumentConfirmationConfig) cVarB.n(fVar, 5, DocumentConfirmationConfig.a.f26551a, k13);
                            i15 |= 32;
                            i12 = 9;
                            i14 = 8;
                            break;
                        case 6:
                            s13 = (DocumentAnalysisConfig) cVarB.n(fVar, 6, DocumentAnalysisConfig.a.f27720a, s13);
                            i15 |= 64;
                            i12 = 9;
                            i14 = 8;
                            break;
                        case 7:
                            x13 = (DocumentNfcConfig) cVarB.n(fVar, 7, DocumentNfcConfig.a.f29704a, x13);
                            i15 |= 128;
                            i12 = 9;
                            i14 = 8;
                            break;
                        case 8:
                            list3 = (List) cVarB.n(fVar, i16, dVarArr[i16], list3);
                            i15 |= 256;
                            i14 = i16;
                            i12 = 9;
                            break;
                        case 9:
                            zW3 = cVarB.w(fVar, i12);
                            i15 |= 512;
                            i14 = i16;
                            break;
                        case 10:
                            videoDuration2 = (VideoDuration) cVarB.n(fVar, i13, dVarArr[i13], videoDuration2);
                            i15 |= 1024;
                            i14 = i16;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                z11 = zW3;
                videoDuration = videoDuration2;
                list = list3;
                x11 = x13;
                k11 = k13;
                s11 = s13;
                c2856Dc = c2856Dc3;
                m11 = m13;
                c3516lg = c3516lg3;
                c3932v9 = c3932v11;
                i11 = i15;
                z12 = zW4;
            }
            cVarB.c(fVar);
            return new DocumentFlowConfig(i11, c3516lg, m11, z12, c3932v9, c2856Dc, k11, s11, x11, list, z11, videoDuration, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = DocumentFlowConfig.f36351m;
            ro0.d dVar = dVarArr[8];
            ro0.d dVar2 = dVarArr[10];
            vo0.h hVar = vo0.h.f119620a;
            return new ro0.d[]{FlowStrategyConfig.a.f33316a, CameraX.a.f26887a, hVar, DocumentImageCaptureConfig.a.f36045a, DocumentVideoCaptureConfig.a.f25455a, DocumentConfirmationConfig.a.f26551a, DocumentAnalysisConfig.a.f27720a, DocumentNfcConfig.a.f29704a, dVar, hVar, dVar2};
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
        public final void serialize(uo0.f encoder, DocumentFlowConfig value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DocumentFlowConfig.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.w8$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DocumentFlowConfig> serializer() {
            return a.f36363a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ DocumentFlowConfig(int i11, FlowStrategyConfig c3516lg, CameraX m11, boolean z11, DocumentImageCaptureConfig c3932v9, DocumentVideoCaptureConfig c2856Dc, DocumentConfirmationConfig k11, DocumentAnalysisConfig s11, DocumentNfcConfig x11, List list, boolean z12, VideoDuration videoDuration, vo0.v1 v1Var) {
        if (452 != (i11 & 452)) {
            vo0.h1.b(i11, 452, a.f36363a.getDescriptor());
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.documentStrategy = (i11 & 1) == 0 ? new FlowStrategyConfig((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : c3516lg;
        boolean z13 = false;
        if ((i11 & 2) == 0) {
            this.cameraX = new CameraX(z13, (CameraX.ExtensionsApi) (objArr2 == true ? 1 : 0), 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.cameraX = m11;
        }
        this.tiltedStepsEnabled = z11;
        if ((i11 & 8) == 0) {
            this.imageCapture = new DocumentImageCaptureConfig(false, 0.8d);
        } else {
            this.imageCapture = c3932v9;
        }
        if ((i11 & 16) == 0) {
            this.video = new DocumentVideoCaptureConfig(true, 10000L, (Integer) null, (String) null, 12, (DefaultConstructorMarker) null);
        } else {
            this.video = c2856Dc;
        }
        this.confirmation = (i11 & 32) == 0 ? new DocumentConfirmationConfig(true) : k11;
        this.analysis = s11;
        this.nfc = x11;
        this.supportedDocuments = list;
        if ((i11 & 512) == 0) {
            this.skipIntro = false;
        } else {
            this.skipIntro = z12;
        }
        this.videoDuration = (i11 & 1024) == 0 ? VideoDuration.DEFAULT.INSTANCE : videoDuration;
    }

    public final DocumentFlowConfig a(FlowStrategyConfig documentStrategy, CameraX cameraX, boolean tiltedStepsEnabled, DocumentImageCaptureConfig imageCapture, DocumentVideoCaptureConfig video, DocumentConfirmationConfig confirmation, DocumentAnalysisConfig analysis, DocumentNfcConfig nfc, List supportedDocuments, boolean skipIntro) {
        p013kotlin.jvm.internal.s.k(documentStrategy, "documentStrategy");
        p013kotlin.jvm.internal.s.k(cameraX, "cameraX");
        p013kotlin.jvm.internal.s.k(imageCapture, "imageCapture");
        p013kotlin.jvm.internal.s.k(video, "video");
        p013kotlin.jvm.internal.s.k(confirmation, "confirmation");
        p013kotlin.jvm.internal.s.k(analysis, "analysis");
        p013kotlin.jvm.internal.s.k(nfc, "nfc");
        p013kotlin.jvm.internal.s.k(supportedDocuments, "supportedDocuments");
        return new DocumentFlowConfig(documentStrategy, cameraX, tiltedStepsEnabled, imageCapture, video, confirmation, analysis, nfc, supportedDocuments, skipIntro);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DocumentAnalysisConfig getAnalysis() {
        return this.analysis;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CameraX getCameraX() {
        return this.cameraX;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DocumentConfirmationConfig getConfirmation() {
        return this.confirmation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentFlowConfig)) {
            return false;
        }
        DocumentFlowConfig documentFlowConfig = (DocumentFlowConfig) other;
        return p013kotlin.jvm.internal.s.f(this.documentStrategy, documentFlowConfig.documentStrategy) && p013kotlin.jvm.internal.s.f(this.cameraX, documentFlowConfig.cameraX) && this.tiltedStepsEnabled == documentFlowConfig.tiltedStepsEnabled && p013kotlin.jvm.internal.s.f(this.imageCapture, documentFlowConfig.imageCapture) && p013kotlin.jvm.internal.s.f(this.video, documentFlowConfig.video) && p013kotlin.jvm.internal.s.f(this.confirmation, documentFlowConfig.confirmation) && p013kotlin.jvm.internal.s.f(this.analysis, documentFlowConfig.analysis) && p013kotlin.jvm.internal.s.f(this.nfc, documentFlowConfig.nfc) && p013kotlin.jvm.internal.s.f(this.supportedDocuments, documentFlowConfig.supportedDocuments) && this.skipIntro == documentFlowConfig.skipIntro;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final FlowStrategyConfig getDocumentStrategy() {
        return this.documentStrategy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DocumentImageCaptureConfig getImageCapture() {
        return this.imageCapture;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final DocumentNfcConfig getNfc() {
        return this.nfc;
    }

    public int hashCode() {
        return (((((((((((((((((this.documentStrategy.hashCode() * 31) + this.cameraX.hashCode()) * 31) + Boolean.hashCode(this.tiltedStepsEnabled)) * 31) + this.imageCapture.hashCode()) * 31) + this.video.hashCode()) * 31) + this.confirmation.hashCode()) * 31) + this.analysis.hashCode()) * 31) + this.nfc.hashCode()) * 31) + this.supportedDocuments.hashCode()) * 31) + Boolean.hashCode(this.skipIntro);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getSkipIntro() {
        return this.skipIntro;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getSupportedDocuments() {
        return this.supportedDocuments;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getTiltedStepsEnabled() {
        return this.tiltedStepsEnabled;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final DocumentVideoCaptureConfig getVideo() {
        return this.video;
    }

    @Override // com.fourthline.orca.internal.Rf
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3683pb a() {
        return new C3683pb(this);
    }

    public String toString() {
        return "DocumentFlowConfig(documentStrategy=" + this.documentStrategy + ", cameraX=" + this.cameraX + ", tiltedStepsEnabled=" + this.tiltedStepsEnabled + ", imageCapture=" + this.imageCapture + ", video=" + this.video + ", confirmation=" + this.confirmation + ", analysis=" + this.analysis + ", nfc=" + this.nfc + ", supportedDocuments=" + this.supportedDocuments + ", skipIntro=" + this.skipIntro + ")";
    }

    public static /* synthetic */ DocumentFlowConfig a(DocumentFlowConfig documentFlowConfig, FlowStrategyConfig c3516lg, CameraX m11, boolean z11, DocumentImageCaptureConfig c3932v9, DocumentVideoCaptureConfig c2856Dc, DocumentConfirmationConfig k11, DocumentAnalysisConfig s11, DocumentNfcConfig x11, List list, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c3516lg = documentFlowConfig.documentStrategy;
        }
        if ((i11 & 2) != 0) {
            m11 = documentFlowConfig.cameraX;
        }
        if ((i11 & 4) != 0) {
            z11 = documentFlowConfig.tiltedStepsEnabled;
        }
        if ((i11 & 8) != 0) {
            c3932v9 = documentFlowConfig.imageCapture;
        }
        if ((i11 & 16) != 0) {
            c2856Dc = documentFlowConfig.video;
        }
        if ((i11 & 32) != 0) {
            k11 = documentFlowConfig.confirmation;
        }
        if ((i11 & 64) != 0) {
            s11 = documentFlowConfig.analysis;
        }
        if ((i11 & 128) != 0) {
            x11 = documentFlowConfig.nfc;
        }
        if ((i11 & 256) != 0) {
            list = documentFlowConfig.supportedDocuments;
        }
        if ((i11 & 512) != 0) {
            z12 = documentFlowConfig.skipIntro;
        }
        List list2 = list;
        boolean z13 = z12;
        DocumentAnalysisConfig s12 = s11;
        DocumentNfcConfig x12 = x11;
        DocumentVideoCaptureConfig c2856Dc2 = c2856Dc;
        DocumentConfirmationConfig k12 = k11;
        return documentFlowConfig.a(c3516lg, m11, z11, c3932v9, c2856Dc2, k12, s12, x12, list2, z13);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void a(DocumentFlowConfig self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f36351m;
        boolean z11 = false;
        int i11 = 1;
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.documentStrategy, new FlowStrategyConfig(list, i11, (DefaultConstructorMarker) (objArr3 == true ? 1 : 0)))) {
            output.D(serialDesc, 0, FlowStrategyConfig.a.f33316a, self.documentStrategy);
        }
        int i12 = 2;
        if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.cameraX, new CameraX(z11, (CameraX.ExtensionsApi) (objArr2 == true ? 1 : 0), i12, (DefaultConstructorMarker) (objArr == true ? 1 : 0)))) {
            output.D(serialDesc, 1, CameraX.a.f26887a, self.cameraX);
        }
        output.A(serialDesc, 2, self.tiltedStepsEnabled);
        if (output.G(serialDesc, 3) || !p013kotlin.jvm.internal.s.f(self.imageCapture, new DocumentImageCaptureConfig(false, 0.8d))) {
            output.D(serialDesc, 3, DocumentImageCaptureConfig.a.f36045a, self.imageCapture);
        }
        if (output.G(serialDesc, 4)) {
            output.D(serialDesc, 4, DocumentVideoCaptureConfig.a.f25455a, self.video);
        } else {
            if (!p013kotlin.jvm.internal.s.f(self.video, new DocumentVideoCaptureConfig(true, 10000L, (Integer) null, (String) null, 12, (DefaultConstructorMarker) null))) {
                output.D(serialDesc, 4, DocumentVideoCaptureConfig.a.f25455a, self.video);
            }
        }
        if (output.G(serialDesc, 5) || !p013kotlin.jvm.internal.s.f(self.confirmation, new DocumentConfirmationConfig(true))) {
            output.D(serialDesc, 5, DocumentConfirmationConfig.a.f26551a, self.confirmation);
        }
        output.D(serialDesc, 6, DocumentAnalysisConfig.a.f27720a, self.analysis);
        output.D(serialDesc, 7, DocumentNfcConfig.a.f29704a, self.nfc);
        output.D(serialDesc, 8, dVarArr[8], self.supportedDocuments);
        if (output.G(serialDesc, 9) || self.skipIntro) {
            output.A(serialDesc, 9, self.skipIntro);
        }
        if (!output.G(serialDesc, 10) && p013kotlin.jvm.internal.s.f(self.videoDuration, VideoDuration.DEFAULT.INSTANCE)) {
            return;
        }
        output.D(serialDesc, 10, dVarArr[10], self.videoDuration);
    }

    public DocumentFlowConfig(FlowStrategyConfig documentStrategy, CameraX cameraX, boolean z11, DocumentImageCaptureConfig imageCapture, DocumentVideoCaptureConfig video, DocumentConfirmationConfig confirmation, DocumentAnalysisConfig analysis, DocumentNfcConfig nfc, List supportedDocuments, boolean z12) {
        p013kotlin.jvm.internal.s.k(documentStrategy, "documentStrategy");
        p013kotlin.jvm.internal.s.k(cameraX, "cameraX");
        p013kotlin.jvm.internal.s.k(imageCapture, "imageCapture");
        p013kotlin.jvm.internal.s.k(video, "video");
        p013kotlin.jvm.internal.s.k(confirmation, "confirmation");
        p013kotlin.jvm.internal.s.k(analysis, "analysis");
        p013kotlin.jvm.internal.s.k(nfc, "nfc");
        p013kotlin.jvm.internal.s.k(supportedDocuments, "supportedDocuments");
        this.documentStrategy = documentStrategy;
        this.cameraX = cameraX;
        this.tiltedStepsEnabled = z11;
        this.imageCapture = imageCapture;
        this.video = video;
        this.confirmation = confirmation;
        this.analysis = analysis;
        this.nfc = nfc;
        this.supportedDocuments = supportedDocuments;
        this.skipIntro = z12;
        this.videoDuration = VideoDuration.DEFAULT.INSTANCE;
    }

    public final void a(VideoDuration videoDuration) {
        p013kotlin.jvm.internal.s.k(videoDuration, "<set-?>");
        this.videoDuration = videoDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ DocumentFlowConfig(FlowStrategyConfig c3516lg, CameraX m11, boolean z11, DocumentImageCaptureConfig c3932v9, DocumentVideoCaptureConfig c2856Dc, DocumentConfirmationConfig k11, DocumentAnalysisConfig s11, DocumentNfcConfig x11, List list, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        FlowStrategyConfig c3516lg2;
        CameraX m12;
        List list2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i12 = 1;
        if ((i11 & 1) != 0) {
            c3516lg2 = new FlowStrategyConfig(list2, i12, (DefaultConstructorMarker) (objArr3 == true ? 1 : 0));
        } else {
            c3516lg2 = c3516lg;
        }
        boolean z13 = false;
        if ((i11 & 2) != 0) {
            m12 = new CameraX(z13, (CameraX.ExtensionsApi) (objArr2 == true ? 1 : 0), 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            m12 = m11;
        }
        this(c3516lg2, m12, z11, (i11 & 8) != 0 ? new DocumentImageCaptureConfig(false, 0.8d) : c3932v9, (i11 & 16) != 0 ? new DocumentVideoCaptureConfig(true, 10000L, (Integer) null, (String) null, 12, (DefaultConstructorMarker) null) : c2856Dc, (i11 & 32) != 0 ? new DocumentConfirmationConfig(true) : k11, s11, x11, list, (i11 & 512) != 0 ? false : z12);
    }
}
