package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Gender;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\u0018\u0000 J2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0004/'+\"Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020!2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b/\u00107R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00106\u001a\u0004\b8\u00107R\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b+\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b9\u0010FR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b=\u0010I¨\u0006K"}, d2 = {"Lcom/facebook/imagepipeline/producers/q;", "Lcom/facebook/imagepipeline/producers/z0;", "Ltk/a;", "Lum/e;", "Lsk/a;", "byteArrayPool", "Ljava/util/concurrent/Executor;", "executor", "Lsm/b;", "imageDecoder", "Lsm/d;", "progressiveJpegConfig", "Lpm/n;", "downsampleMode", "", "downsampleEnabledForNetwork", "decodeCancellationEnabled", "Lum/k;", "inputProducer", "", "maxBitmapDimension", "Lpm/a;", "closeableReferenceFactory", "Ljava/lang/Runnable;", "reclaimMemoryRunnable", "Lpk/n;", "recoverFromDecoderOOM", "<init>", "(Lsk/a;Ljava/util/concurrent/Executor;Lsm/b;Lsm/d;Lpm/n;ZZLcom/facebook/imagepipeline/producers/z0;ILpm/a;Ljava/lang/Runnable;Lpk/n;)V", "Lcom/facebook/imagepipeline/producers/n;", "consumer", "Lcom/facebook/imagepipeline/producers/a1;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "a", "(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/a1;)V", "Lsk/a;", "getByteArrayPool", "()Lsk/a;", "b", "Ljava/util/concurrent/Executor;", "f", "()Ljava/util/concurrent/Executor;", "c", "Lsm/b;", "g", "()Lsm/b;", DateTokenConverter.CONVERTER_KEY, "Lsm/d;", "getProgressiveJpegConfig", "()Lsm/d;", "e", "Lpm/n;", "()Lpm/n;", "Z", "()Z", "getDecodeCancellationEnabled", "h", "Lcom/facebook/imagepipeline/producers/z0;", "getInputProducer", "()Lcom/facebook/imagepipeline/producers/z0;", IntegerTokenConverter.CONVERTER_KEY, "I", "getMaxBitmapDimension", "()I", "j", "Lpm/a;", "()Lpm/a;", "k", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "l", "Lpk/n;", "()Lpk/n;", "m", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q implements z0<tk.a<um.e>> {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sk.a byteArrayPool;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sm.b imageDecoder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sm.d progressiveJpegConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final pm.n downsampleMode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean downsampleEnabledForNetwork;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean decodeCancellationEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final z0<um.k> inputProducer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int maxBitmapDimension;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final pm.a closeableReferenceFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Runnable reclaimMemoryRunnable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final pk.n<Boolean> recoverFromDecoderOOM;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/facebook/imagepipeline/producers/q$a;", "", "<init>", "()V", "Lum/k;", "encodedImage", "Lom/c;", "imageDecodeOptions", "", "b", "(Lum/k;Lom/c;)Z", "", "PRODUCER_NAME", "Ljava/lang/String;", "", "DECODE_EXCEPTION_MESSAGE_NUM_HEADER_BYTES", "I", "MAX_BITMAP_SIZE", "EXTRA_BITMAP_SIZE", "EXTRA_HAS_GOOD_QUALITY", "EXTRA_IS_FINAL", "EXTRA_IMAGE_FORMAT_NAME", "EXTRA_BITMAP_BYTES", "ENCODED_IMAGE_SIZE", "REQUESTED_IMAGE_SIZE", "SAMPLE_SIZE", "NON_FATAL_DECODE_ERROR", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(um.k encodedImage, om.c imageDecodeOptions) {
            return (((long) encodedImage.getWidth()) * ((long) encodedImage.getHeight())) * ((long) fn.c.h(imageDecodeOptions.f98030h)) > 104857600;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/imagepipeline/producers/q$b;", "Lcom/facebook/imagepipeline/producers/q$d;", "Lcom/facebook/imagepipeline/producers/q;", "Lcom/facebook/imagepipeline/producers/n;", "Ltk/a;", "Lum/e;", "consumer", "Lcom/facebook/imagepipeline/producers/a1;", "producerContext", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/q;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/a1;ZI)V", "Lum/k;", "encodedImage", PermissionsResponse.STATUS_KEY, "I", "(Lum/k;I)Z", "w", "(Lum/k;)I", "Lum/p;", "y", "()Lum/p;", "qualityInfo", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class b extends d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ q f21940k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, n<tk.a<um.e>> consumer, a1 producerContext, boolean z11, int i11) {
            super(qVar, consumer, producerContext, z11, i11);
            p013kotlin.jvm.internal.s.k(consumer, "consumer");
            p013kotlin.jvm.internal.s.k(producerContext, "producerContext");
            this.f21940k = qVar;
        }

        @Override // com.facebook.imagepipeline.producers.q.d
        protected synchronized boolean I(um.k encodedImage, int status) {
            return com.facebook.imagepipeline.producers.c.e(status) ? false : super.I(encodedImage, status);
        }

        @Override // com.facebook.imagepipeline.producers.q.d
        protected int w(um.k encodedImage) {
            p013kotlin.jvm.internal.s.k(encodedImage, "encodedImage");
            return encodedImage.c0();
        }

        @Override // com.facebook.imagepipeline.producers.q.d
        protected um.p y() {
            um.p pVarD = um.o.d(0, false, false);
            p013kotlin.jvm.internal.s.j(pVarD, "of(...)");
            return pVarD;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002BC\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/facebook/imagepipeline/producers/q$c;", "Lcom/facebook/imagepipeline/producers/q$d;", "Lcom/facebook/imagepipeline/producers/q;", "Lcom/facebook/imagepipeline/producers/n;", "Ltk/a;", "Lum/e;", "consumer", "Lcom/facebook/imagepipeline/producers/a1;", "producerContext", "Lsm/e;", "progressiveJpegParser", "Lsm/d;", "progressiveJpegConfig", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/q;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/a1;Lsm/e;Lsm/d;ZI)V", "Lum/k;", "encodedImage", PermissionsResponse.STATUS_KEY, "I", "(Lum/k;I)Z", "w", "(Lum/k;)I", "k", "Lsm/e;", "getProgressiveJpegParser", "()Lsm/e;", "l", "Lsm/d;", "getProgressiveJpegConfig", "()Lsm/d;", "Lum/p;", "y", "()Lum/p;", "qualityInfo", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class c extends d {

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final sm.e progressiveJpegParser;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final sm.d progressiveJpegConfig;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ q f21943m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q qVar, n<tk.a<um.e>> consumer, a1 producerContext, sm.e progressiveJpegParser, sm.d progressiveJpegConfig, boolean z11, int i11) {
            super(qVar, consumer, producerContext, z11, i11);
            p013kotlin.jvm.internal.s.k(consumer, "consumer");
            p013kotlin.jvm.internal.s.k(producerContext, "producerContext");
            p013kotlin.jvm.internal.s.k(progressiveJpegParser, "progressiveJpegParser");
            p013kotlin.jvm.internal.s.k(progressiveJpegConfig, "progressiveJpegConfig");
            this.f21943m = qVar;
            this.progressiveJpegParser = progressiveJpegParser;
            this.progressiveJpegConfig = progressiveJpegConfig;
            H(0);
        }

        @Override // com.facebook.imagepipeline.producers.q.d
        protected synchronized boolean I(um.k encodedImage, int status) {
            if (encodedImage == null) {
                return false;
            }
            try {
                boolean zI = super.I(encodedImage, status);
                if (com.facebook.imagepipeline.producers.c.e(status) || com.facebook.imagepipeline.producers.c.m(status, 8)) {
                    if (!com.facebook.imagepipeline.producers.c.m(status, 4) && um.k.u0(encodedImage) && encodedImage.I() == gm.b.JPEG) {
                        if (!this.progressiveJpegParser.g(encodedImage)) {
                            return false;
                        }
                        int iD = this.progressiveJpegParser.d();
                        if (iD <= getLastScheduledScanNumber()) {
                            return false;
                        }
                        if (iD < this.progressiveJpegConfig.a(getLastScheduledScanNumber()) && !this.progressiveJpegParser.e()) {
                            return false;
                        }
                        H(iD);
                    }
                }
                return zI;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.facebook.imagepipeline.producers.q.d
        protected int w(um.k encodedImage) {
            p013kotlin.jvm.internal.s.k(encodedImage, "encodedImage");
            return this.progressiveJpegParser.c();
        }

        @Override // com.facebook.imagepipeline.producers.q.d
        protected um.p y() {
            um.p pVarB = this.progressiveJpegConfig.b(this.progressiveJpegParser.d());
            p013kotlin.jvm.internal.s.j(pVarB, "getQualityInfo(...)");
            return pVarB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b¢\u0004\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ_\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00102\u0006\u0010:\u001a\u000209H\u0014¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b=\u00103J\u000f\u0010>\u001a\u00020\u0010H\u0016¢\u0006\u0004\b>\u00105J!\u0010@\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H$¢\u0006\u0004\bB\u0010CR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010NR\u0016\u0010Q\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010\u0014\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b;\u0010@\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lcom/facebook/imagepipeline/producers/q$d;", "Lcom/facebook/imagepipeline/producers/u;", "Lum/k;", "Ltk/a;", "Lum/e;", "Lcom/facebook/imagepipeline/producers/n;", "consumer", "Lcom/facebook/imagepipeline/producers/a1;", "producerContext", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/q;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/a1;ZI)V", "encodedImage", "Ljn0/h0;", "E", "(Lum/k;)V", PermissionsResponse.STATUS_KEY, "lastScheduledScanNumber", "u", "(Lum/k;II)V", "length", "Lum/p;", "quality", "C", "(Lum/k;ILum/p;)Lum/e;", "image", "G", "(Lum/k;Lum/e;I)V", "", "queueTime", "isFinal", "", "imageFormatName", "encodedImageSize", "requestImageSize", "sampleSize", "", "v", "(Lum/e;JLum/p;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "shouldFinish", "D", "(Z)V", "decodedImage", "B", "(Lum/e;I)V", "", "t", "A", "(Ljava/lang/Throwable;)V", "z", "()V", "newResult", Gender.FEMALE, "(Lum/k;I)V", "", ReactProgressBarViewManager.PROP_PROGRESS, IntegerTokenConverter.CONVERTER_KEY, "(F)V", "g", "f", ActionConst.REF_ATTRIBUTE, "I", "(Lum/k;I)Z", "w", "(Lum/k;)I", "c", "Lcom/facebook/imagepipeline/producers/a1;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "TAG", "Lcom/facebook/imagepipeline/producers/c1;", "e", "Lcom/facebook/imagepipeline/producers/c1;", "producerListener", "Lom/c;", "Lom/c;", "imageDecodeOptions", "Z", "isFinished", "Lcom/facebook/imagepipeline/producers/g0;", "h", "Lcom/facebook/imagepipeline/producers/g0;", "jobScheduler", "x", "()I", "H", "(I)V", "y", "()Lum/p;", "qualityInfo", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    abstract class d extends u<um.k, tk.a<um.e>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final a1 producerContext;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String TAG;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final c1 producerListener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final om.c imageDecodeOptions;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean isFinished;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final g0 jobScheduler;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int lastScheduledScanNumber;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q f21951j;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/facebook/imagepipeline/producers/q$d$a", "Lcom/facebook/imagepipeline/producers/f;", "Ljn0/h0;", "a", "()V", "b", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f21953b;

            a(boolean z11) {
                this.f21953b = z11;
            }

            @Override // com.facebook.imagepipeline.producers.f, com.facebook.imagepipeline.producers.b1
            public void a() {
                if (d.this.producerContext.b0()) {
                    d.this.jobScheduler.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.b1
            public void b() {
                if (this.f21953b) {
                    d.this.z();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final q qVar, n<tk.a<um.e>> consumer, a1 producerContext, boolean z11, final int i11) {
            super(consumer);
            p013kotlin.jvm.internal.s.k(consumer, "consumer");
            p013kotlin.jvm.internal.s.k(producerContext, "producerContext");
            this.f21951j = qVar;
            this.producerContext = producerContext;
            this.TAG = "ProgressiveDecoder";
            this.producerListener = producerContext.p();
            om.c cVarH = producerContext.B().h();
            p013kotlin.jvm.internal.s.j(cVarH, "getImageDecodeOptions(...)");
            this.imageDecodeOptions = cVarH;
            this.jobScheduler = new g0(qVar.getExecutor(), new g0.d() { // from class: com.facebook.imagepipeline.producers.r
                @Override // com.facebook.imagepipeline.producers.g0.d
                public final void a(um.k kVar, int i12) throws Throwable {
                    q.d.q(this.f21970a, qVar, i11, kVar, i12);
                }
            }, cVarH.f98023a);
            producerContext.H(new a(z11));
        }

        private final void A(Throwable t11) {
            D(true);
            o().onFailure(t11);
        }

        private final void B(um.e decodedImage, int status) {
            tk.a<um.e> aVarB = this.f21951j.getCloseableReferenceFactory().b(decodedImage);
            try {
                D(com.facebook.imagepipeline.producers.c.d(status));
                o().b(aVarB, status);
            } finally {
                tk.a.C(aVarB);
            }
        }

        private final um.e C(um.k encodedImage, int length, um.p quality) {
            boolean z11 = this.f21951j.getReclaimMemoryRunnable() != null && this.f21951j.i().get().booleanValue();
            try {
                return this.f21951j.getImageDecoder().a(encodedImage, length, quality, this.imageDecodeOptions);
            } catch (OutOfMemoryError e11) {
                if (!z11) {
                    throw e11;
                }
                Runnable reclaimMemoryRunnable = this.f21951j.getReclaimMemoryRunnable();
                if (reclaimMemoryRunnable != null) {
                    reclaimMemoryRunnable.run();
                }
                System.gc();
                return this.f21951j.getImageDecoder().a(encodedImage, length, quality, this.imageDecodeOptions);
            }
        }

        private final void D(boolean shouldFinish) {
            synchronized (this) {
                if (shouldFinish) {
                    if (!this.isFinished) {
                        o().c(1.0f);
                        this.isFinished = true;
                        jn0.h0 h0Var = jn0.h0.f84049a;
                        this.jobScheduler.c();
                    }
                }
            }
        }

        private final void E(um.k encodedImage) {
            if (encodedImage.I() != gm.b.JPEG) {
                return;
            }
            encodedImage.P0(cn.a.c(encodedImage, fn.c.h(this.imageDecodeOptions.f98030h), 104857600));
        }

        private final void G(um.k encodedImage, um.e image, int lastScheduledScanNumber) {
            this.producerContext.o("encoded_width", Integer.valueOf(encodedImage.getWidth()));
            this.producerContext.o("encoded_height", Integer.valueOf(encodedImage.getHeight()));
            this.producerContext.o("encoded_size", Integer.valueOf(encodedImage.c0()));
            this.producerContext.o("image_color_space", encodedImage.C());
            if (image instanceof um.d) {
                this.producerContext.o("bitmap_config", String.valueOf(((um.d) image).t3().getConfig()));
            }
            if (image != null) {
                image.C(this.producerContext.getExtras());
            }
            this.producerContext.o("last_scan_num", Integer.valueOf(lastScheduledScanNumber));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(d this$0, q this$1, int i11, um.k kVar, int i12) throws Throwable {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            p013kotlin.jvm.internal.s.k(this$1, "this$1");
            if (kVar != null) {
                com.facebook.imagepipeline.request.a aVarB = this$0.producerContext.B();
                this$0.producerContext.o("image_format", kVar.I().getName());
                Uri uriV = aVarB.v();
                kVar.T0(uriV != null ? uriV.toString() : null);
                pm.n nVarG = aVarB.g();
                if (nVarG == null) {
                    nVarG = this$1.getDownsampleMode();
                }
                boolean zM = com.facebook.imagepipeline.producers.c.m(i12, 16);
                if ((nVarG == pm.n.ALWAYS || (nVarG == pm.n.AUTO && !zM)) && (this$1.getDownsampleEnabledForNetwork() || !xk.e.o(aVarB.v()))) {
                    om.g gVarT = aVarB.t();
                    p013kotlin.jvm.internal.s.j(gVarT, "getRotationOptions(...)");
                    kVar.P0(cn.a.b(gVarT, aVarB.r(), kVar, i11));
                }
                if (this$0.producerContext.n().getExperiments().getDownsampleIfLargeBitmap()) {
                    this$0.E(kVar);
                }
                this$0.u(kVar, i12, this$0.lastScheduledScanNumber);
            }
        }

        private final void u(um.k encodedImage, int status, int lastScheduledScanNumber) throws Throwable {
            um.e eVarC;
            int i11 = status;
            if ((encodedImage.I() != gm.b.JPEG && com.facebook.imagepipeline.producers.c.e(i11)) || this.isFinished || !um.k.u0(encodedImage)) {
                return;
            }
            if (p013kotlin.jvm.internal.s.f(encodedImage.I(), gm.b.GIF) && q.INSTANCE.b(encodedImage, this.imageDecodeOptions)) {
                IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + encodedImage.getWidth() + ", h = " + encodedImage.getHeight() + ", pixel config = " + this.imageDecodeOptions.f98030h + ", max bitmap size = 104857600");
                this.producerListener.k(this.producerContext, "DecodeProducer", illegalStateException, null);
                A(illegalStateException);
                return;
            }
            gm.c cVarI = encodedImage.I();
            p013kotlin.jvm.internal.s.j(cVarI, "getImageFormat(...)");
            String name = cVarI.getName();
            String str = "unknown";
            String str2 = name == null ? "unknown" : name;
            String str3 = encodedImage.getWidth() + "x" + encodedImage.getHeight();
            String strValueOf = String.valueOf(encodedImage.b0());
            boolean zD = com.facebook.imagepipeline.producers.c.d(i11);
            boolean z11 = zD && !com.facebook.imagepipeline.producers.c.m(i11, 8);
            boolean zM = com.facebook.imagepipeline.producers.c.m(i11, 4);
            om.f fVarR = this.producerContext.B().r();
            if (fVarR != null) {
                str = fVarR.com.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String + "x" + fVarR.com.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String;
            }
            try {
                long jF = this.jobScheduler.f();
                String string = this.producerContext.B().v().toString();
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                int iC0 = (z11 || zM) ? encodedImage.c0() : w(encodedImage);
                um.p pVarY = (z11 || zM) ? um.o.f116468d : y();
                this.producerListener.b(this.producerContext, "DecodeProducer");
                try {
                    p013kotlin.jvm.internal.s.h(pVarY);
                    eVarC = C(encodedImage, iC0, pVarY);
                    try {
                        if (encodedImage.b0() != 1) {
                            i11 |= 16;
                        }
                        this.producerListener.j(this.producerContext, "DecodeProducer", v(eVarC, jF, pVarY, zD, str2, str3, str, strValueOf));
                        G(encodedImage, eVarC, lastScheduledScanNumber);
                        B(eVarC, i11);
                        um.k.o(encodedImage);
                    } catch (Exception e11) {
                        e = e11;
                        pVarY = pVarY;
                        str = str;
                        jF = jF;
                        p013kotlin.jvm.internal.s.h(pVarY);
                        this.producerListener.k(this.producerContext, "DecodeProducer", e, v(eVarC, jF, pVarY, zD, str2, str3, str, strValueOf));
                        A(e);
                        um.k.o(encodedImage);
                    }
                } catch (DecodeException e12) {
                    try {
                        try {
                            um.k encodedImage2 = e12.getEncodedImage();
                            qk.a.K(this.TAG, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e12.getMessage(), string, encodedImage2.H(10), Integer.valueOf(encodedImage2.c0()));
                            throw e12;
                        } catch (Exception e13) {
                            e = e13;
                            eVarC = null;
                            p013kotlin.jvm.internal.s.h(pVarY);
                            this.producerListener.k(this.producerContext, "DecodeProducer", e, v(eVarC, jF, pVarY, zD, str2, str3, str, strValueOf));
                            A(e);
                            um.k.o(encodedImage);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        um.k.o(encodedImage);
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                    eVarC = null;
                    p013kotlin.jvm.internal.s.h(pVarY);
                    this.producerListener.k(this.producerContext, "DecodeProducer", e, v(eVarC, jF, pVarY, zD, str2, str3, str, strValueOf));
                    A(e);
                    um.k.o(encodedImage);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private final Map<String, String> v(um.e image, long queueTime, um.p quality, boolean isFinal, String imageFormatName, String encodedImageSize, String requestImageSize, String sampleSize) {
            Map<String, Object> extras;
            Object obj;
            String string = null;
            if (!this.producerListener.f(this.producerContext, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(queueTime);
            String strValueOf2 = String.valueOf(quality.b());
            String strValueOf3 = String.valueOf(isFinal);
            if (image != null && (extras = image.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            if (!(image instanceof um.f)) {
                String str = string;
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", encodedImageSize);
                map.put("imageFormat", imageFormatName);
                map.put("requestedImageSize", requestImageSize);
                map.put("sampleSize", sampleSize);
                if (str != null) {
                    map.put("non_fatal_decode_error", str);
                }
                return pk.g.b(map);
            }
            String str2 = string;
            Bitmap bitmapT3 = ((um.f) image).t3();
            p013kotlin.jvm.internal.s.j(bitmapT3, "getUnderlyingBitmap(...)");
            String str3 = bitmapT3.getWidth() + "x" + bitmapT3.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str3);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", encodedImageSize);
            map2.put("imageFormat", imageFormatName);
            map2.put("requestedImageSize", requestImageSize);
            map2.put("sampleSize", sampleSize);
            int byteCount = bitmapT3.getByteCount();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(byteCount);
            map2.put("byteCount", sb2.toString());
            if (str2 != null) {
                map2.put("non_fatal_decode_error", str2);
            }
            return pk.g.b(map2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void z() {
            D(true);
            o().a();
        }

        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void h(um.k newResult, int status) {
            if (!bn.b.d()) {
                boolean zD = com.facebook.imagepipeline.producers.c.d(status);
                if (zD) {
                    if (newResult == null) {
                        boolean zF = p013kotlin.jvm.internal.s.f(this.producerContext.e0("cached_value_found"), Boolean.TRUE);
                        if (!this.producerContext.n().getExperiments().getCancelDecodeOnCacheMiss() || this.producerContext.k0() == com.facebook.imagepipeline.request.a.c.FULL_FETCH || zF) {
                            A(new ExceptionWithNoStacktrace("Encoded image is null."));
                            return;
                        }
                    } else if (!newResult.t0()) {
                        A(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (I(newResult, status)) {
                    boolean zM = com.facebook.imagepipeline.producers.c.m(status, 4);
                    if (zD || zM || this.producerContext.b0()) {
                        this.jobScheduler.h();
                        return;
                    }
                    return;
                }
                return;
            }
            bn.b.a("DecodeProducer#onNewResultImpl");
            try {
                boolean zD2 = com.facebook.imagepipeline.producers.c.d(status);
                if (zD2) {
                    if (newResult == null) {
                        boolean zF2 = p013kotlin.jvm.internal.s.f(this.producerContext.e0("cached_value_found"), Boolean.TRUE);
                        if (this.producerContext.n().getExperiments().getCancelDecodeOnCacheMiss()) {
                            if (this.producerContext.k0() != com.facebook.imagepipeline.request.a.c.FULL_FETCH) {
                                if (zF2) {
                                }
                            }
                        }
                        A(new ExceptionWithNoStacktrace("Encoded image is null."));
                        return;
                    }
                    if (!newResult.t0()) {
                        A(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (I(newResult, status)) {
                    boolean zM2 = com.facebook.imagepipeline.producers.c.m(status, 4);
                    if (zD2 || zM2 || this.producerContext.b0()) {
                        this.jobScheduler.h();
                    }
                    jn0.h0 h0Var = jn0.h0.f84049a;
                }
            } finally {
                bn.b.b();
            }
        }

        protected final void H(int i11) {
            this.lastScheduledScanNumber = i11;
        }

        protected boolean I(um.k ref, int status) {
            return this.jobScheduler.k(ref, status);
        }

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        public void f() {
            z();
        }

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        public void g(Throwable t11) {
            p013kotlin.jvm.internal.s.k(t11, "t");
            A(t11);
        }

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        protected void i(float progress) {
            super.i(progress * 0.99f);
        }

        protected abstract int w(um.k encodedImage);

        /* JADX INFO: renamed from: x, reason: from getter */
        protected final int getLastScheduledScanNumber() {
            return this.lastScheduledScanNumber;
        }

        protected abstract um.p y();
    }

    public q(sk.a byteArrayPool, Executor executor, sm.b imageDecoder, sm.d progressiveJpegConfig, pm.n downsampleMode, boolean z11, boolean z12, z0<um.k> inputProducer, int i11, pm.a closeableReferenceFactory, Runnable runnable, pk.n<Boolean> recoverFromDecoderOOM) {
        p013kotlin.jvm.internal.s.k(byteArrayPool, "byteArrayPool");
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(imageDecoder, "imageDecoder");
        p013kotlin.jvm.internal.s.k(progressiveJpegConfig, "progressiveJpegConfig");
        p013kotlin.jvm.internal.s.k(downsampleMode, "downsampleMode");
        p013kotlin.jvm.internal.s.k(inputProducer, "inputProducer");
        p013kotlin.jvm.internal.s.k(closeableReferenceFactory, "closeableReferenceFactory");
        p013kotlin.jvm.internal.s.k(recoverFromDecoderOOM, "recoverFromDecoderOOM");
        this.byteArrayPool = byteArrayPool;
        this.executor = executor;
        this.imageDecoder = imageDecoder;
        this.progressiveJpegConfig = progressiveJpegConfig;
        this.downsampleMode = downsampleMode;
        this.downsampleEnabledForNetwork = z11;
        this.decodeCancellationEnabled = z12;
        this.inputProducer = inputProducer;
        this.maxBitmapDimension = i11;
        this.closeableReferenceFactory = closeableReferenceFactory;
        this.reclaimMemoryRunnable = runnable;
        this.recoverFromDecoderOOM = recoverFromDecoderOOM;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<tk.a<um.e>> consumer, a1 context) {
        q qVar;
        a1 a1Var;
        n<um.k> cVar;
        p013kotlin.jvm.internal.s.k(consumer, "consumer");
        p013kotlin.jvm.internal.s.k(context, "context");
        if (bn.b.d()) {
            bn.b.a("DecodeProducer#produceResults");
            try {
                com.facebook.imagepipeline.request.a aVarB = context.B();
                this.inputProducer.a((xk.e.o(aVarB.v()) || ImageRequestBuilder.s(aVarB.v())) ? new c(this, consumer, context, new sm.e(this.byteArrayPool), this.progressiveJpegConfig, this.decodeCancellationEnabled, this.maxBitmapDimension) : new b(this, consumer, context, this.decodeCancellationEnabled, this.maxBitmapDimension), context);
                jn0.h0 h0Var = jn0.h0.f84049a;
                return;
            } finally {
                bn.b.b();
            }
        }
        com.facebook.imagepipeline.request.a aVarB2 = context.B();
        if (xk.e.o(aVarB2.v()) || ImageRequestBuilder.s(aVarB2.v())) {
            qVar = this;
            a1Var = context;
            cVar = new c(qVar, consumer, a1Var, new sm.e(qVar.byteArrayPool), qVar.progressiveJpegConfig, qVar.decodeCancellationEnabled, qVar.maxBitmapDimension);
        } else {
            cVar = new b(this, consumer, context, this.decodeCancellationEnabled, this.maxBitmapDimension);
            qVar = this;
            a1Var = context;
        }
        qVar.inputProducer.a(cVar, a1Var);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final pm.a getCloseableReferenceFactory() {
        return this.closeableReferenceFactory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDownsampleEnabledForNetwork() {
        return this.downsampleEnabledForNetwork;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final pm.n getDownsampleMode() {
        return this.downsampleMode;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final sm.b getImageDecoder() {
        return this.imageDecoder;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Runnable getReclaimMemoryRunnable() {
        return this.reclaimMemoryRunnable;
    }

    public final pk.n<Boolean> i() {
        return this.recoverFromDecoderOOM;
    }
}
