package v00;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.reactnativecompressor.CompressorModule;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import u00.b;
import wn0.p;
import x00.c;
import y00.Result;
import y00.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J?\u0010/\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100JZ\u0010:\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b:\u0010;R\"\u0010=\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lv00/a;", "", "<init>", "()V", "", "id", "newWidth", "newHeight", "", "destination", "newBitrate", "streamableFile", "", "disableAudio", "Landroid/media/MediaExtractor;", "extractor", "Lu00/b;", "compressionProgressListener", "", "duration", "rotation", "Ly00/f;", "h", "(IIILjava/lang/String;ILjava/lang/String;ZLandroid/media/MediaExtractor;Lu00/b;JI)Ly00/f;", "Ly00/b;", "mediaMuxer", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "Ljn0/h0;", "f", "(Ly00/b;Landroid/media/MediaCodec$BufferInfo;ZLandroid/media/MediaExtractor;)V", "Landroid/media/MediaFormat;", "outputFormat", "hasQTI", "Landroid/media/MediaCodec;", "e", "(Landroid/media/MediaFormat;Z)Landroid/media/MediaCodec;", "inputFormat", "Ly00/e;", "outputSurface", DateTokenConverter.CONVERTER_KEY, "(Landroid/media/MediaFormat;Ly00/e;)Landroid/media/MediaCodec;", "videoIndex", "decoder", "encoder", "Ly00/a;", "inputSurface", "c", "(ILandroid/media/MediaCodec;Landroid/media/MediaCodec;Ly00/a;Ly00/e;Landroid/media/MediaExtractor;)V", "index", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/Uri;", "srcUri", "outputWidth", "outputHeight", "outputBitrate", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "b", "(ILandroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIILu00/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Z", "isRunning", "()Z", "g", "(Z)V", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f117427a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean isRunning = true;

    /* JADX INFO: renamed from: v00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly00/f;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly00/f;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativecompressor.Video.VideoCompressor.compressor.Compressor$compressVideo$2", f = "Compressor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C2519a extends SuspendLambda implements p<CoroutineScope, Continuation<? super Result>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f117429n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f117430o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f117431p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Uri f117432q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f117433r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f117434s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f117435t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f117436u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f117437v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ String f117438w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ b f117439x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2519a(Context context, Uri uri, int i11, int i12, int i13, int i14, String str, String str2, b bVar, Continuation<? super C2519a> continuation) {
            super(2, continuation);
            this.f117431p = context;
            this.f117432q = uri;
            this.f117433r = i11;
            this.f117434s = i12;
            this.f117435t = i13;
            this.f117436u = i14;
            this.f117437v = str;
            this.f117438w = str2;
            this.f117439x = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2519a c2519a = new C2519a(this.f117431p, this.f117432q, this.f117433r, this.f117434s, this.f117435t, this.f117436u, this.f117437v, this.f117438w, this.f117439x, continuation);
            c2519a.f117430o = obj;
            return c2519a;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11;
            int i12;
            int i13;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f117429n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            MediaExtractor mediaExtractor = new MediaExtractor();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.f117431p, this.f117432q);
                Context context = this.f117431p;
                Uri uri = this.f117432q;
                try {
                    s.Companion companion = s.INSTANCE;
                    mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
                    s.b(h0.f84049a);
                } catch (Throwable th2) {
                    s.Companion companion2 = s.INSTANCE;
                    s.b(t.a(th2));
                }
                x00.a aVar = x00.a.f122514a;
                aVar.h(mediaMetadataRetriever);
                aVar.i(mediaMetadataRetriever);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                if (strExtractMetadata == null || strExtractMetadata.length() == 0 || strExtractMetadata2 == null || strExtractMetadata2.length() == 0 || strExtractMetadata3 == null || strExtractMetadata3.length() == 0) {
                    return new Result(this.f117433r, false, "Failed to extract video metadata, please try again", 0L, null, 24, null);
                }
                int i14 = Integer.parseInt(strExtractMetadata);
                long j11 = Long.parseLong(strExtractMetadata3) * ((long) 1000);
                int i15 = this.f117434s;
                Pair pair = new Pair(Boxing.boxInt(this.f117435t), Boxing.boxInt(this.f117436u));
                int iIntValue = ((Number) pair.a()).intValue();
                int iIntValue2 = ((Number) pair.b()).intValue();
                if (i14 == 90) {
                    i11 = iIntValue2;
                    i12 = 0;
                    i13 = iIntValue;
                } else if (i14 == 180) {
                    i11 = iIntValue;
                    i12 = 0;
                    i13 = iIntValue2;
                } else if (i14 != 270) {
                    i13 = iIntValue2;
                    i12 = i14;
                    i11 = iIntValue;
                } else {
                    i11 = iIntValue2;
                    i12 = 0;
                    i13 = iIntValue;
                }
                return a.f117427a.h(this.f117433r, i11, i13, this.f117437v, i15, this.f117438w, false, mediaExtractor, this.f117439x, j11, i12);
            } catch (IllegalArgumentException e11) {
                x00.a.f122514a.j(e11);
                return new Result(this.f117433r, false, String.valueOf(e11.getMessage()), 0L, null, 24, null);
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result> continuation) {
            return ((C2519a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private a() {
    }

    private final void c(int videoIndex, MediaCodec decoder, MediaCodec encoder, y00.a inputSurface, e outputSurface, MediaExtractor extractor) {
        extractor.unselectTrack(videoIndex);
        decoder.stop();
        decoder.release();
        encoder.stop();
        encoder.release();
        inputSurface.d();
        outputSurface.d();
    }

    private final MediaCodec d(MediaFormat inputFormat, e outputSurface) throws IOException {
        String string = inputFormat.getString("mime");
        p013kotlin.jvm.internal.s.h(string);
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
        p013kotlin.jvm.internal.s.j(mediaCodecCreateDecoderByType, "createDecoderByType(...)");
        mediaCodecCreateDecoderByType.configure(inputFormat, outputSurface.getMSurface(), (MediaCrypto) null, 0);
        return mediaCodecCreateDecoderByType;
    }

    private final MediaCodec e(MediaFormat outputFormat, boolean hasQTI) {
        MediaCodec mediaCodecCreateByCodecName = hasQTI ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType("video/avc");
        p013kotlin.jvm.internal.s.h(mediaCodecCreateByCodecName);
        mediaCodecCreateByCodecName.configure(outputFormat, (Surface) null, (MediaCrypto) null, 1);
        return mediaCodecCreateByCodecName;
    }

    private final void f(y00.b mediaMuxer, MediaCodec.BufferInfo bufferInfo, boolean disableAudio, MediaExtractor extractor) throws IOException {
        int iA = x00.a.f122514a.a(extractor, false);
        if (iA < 0 || disableAudio) {
            return;
        }
        extractor.selectTrack(iA);
        MediaFormat trackFormat = extractor.getTrackFormat(iA);
        p013kotlin.jvm.internal.s.j(trackFormat, "getTrackFormat(...)");
        int iA2 = mediaMuxer.a(trackFormat, true);
        int integer = trackFormat.getInteger("max-input-size");
        if (integer <= 0) {
            integer = 65536;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(integer);
        p013kotlin.jvm.internal.s.j(byteBufferAllocateDirect, "allocateDirect(...)");
        if (Build.VERSION.SDK_INT >= 28) {
            long sampleSize = extractor.getSampleSize();
            if (sampleSize > integer) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) (sampleSize + ((long) 1024)));
            }
        }
        extractor.seekTo(0L, 0);
        boolean z11 = false;
        while (!z11) {
            int sampleTrackIndex = extractor.getSampleTrackIndex();
            if (sampleTrackIndex == iA) {
                int sampleData = extractor.readSampleData(byteBufferAllocateDirect, 0);
                bufferInfo.size = sampleData;
                if (sampleData >= 0) {
                    bufferInfo.presentationTimeUs = extractor.getSampleTime();
                    bufferInfo.offset = 0;
                    bufferInfo.flags = 1;
                    mediaMuxer.q(iA2, byteBufferAllocateDirect, bufferInfo, true);
                    extractor.advance();
                } else {
                    bufferInfo.size = 0;
                    z11 = true;
                }
            } else if (sampleTrackIndex == -1) {
                z11 = true;
            }
        }
        extractor.unselectTrack(iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:154:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0148 A[Catch: Exception -> 0x00b2, TryCatch #7 {Exception -> 0x00b2, blocks: (B:11:0x0082, B:13:0x0088, B:15:0x0092, B:17:0x00a0, B:35:0x0100, B:37:0x0104, B:44:0x0134, B:75:0x01cf, B:84:0x01f0, B:88:0x01f7, B:91:0x01ff, B:98:0x0230, B:100:0x0236, B:93:0x021e, B:96:0x022a, B:101:0x024a, B:102:0x0260, B:48:0x0148, B:50:0x0154, B:55:0x016c, B:57:0x0172, B:59:0x0179, B:61:0x017f, B:62:0x0183, B:67:0x018e, B:69:0x0197, B:70:0x01b2, B:71:0x01b3, B:72:0x01c9, B:21:0x00b7, B:26:0x00d7, B:28:0x00df, B:90:0x01fc), top: B:150:0x0082, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0154 A[Catch: Exception -> 0x00b2, TryCatch #7 {Exception -> 0x00b2, blocks: (B:11:0x0082, B:13:0x0088, B:15:0x0092, B:17:0x00a0, B:35:0x0100, B:37:0x0104, B:44:0x0134, B:75:0x01cf, B:84:0x01f0, B:88:0x01f7, B:91:0x01ff, B:98:0x0230, B:100:0x0236, B:93:0x021e, B:96:0x022a, B:101:0x024a, B:102:0x0260, B:48:0x0148, B:50:0x0154, B:55:0x016c, B:57:0x0172, B:59:0x0179, B:61:0x017f, B:62:0x0183, B:67:0x018e, B:69:0x0197, B:70:0x01b2, B:71:0x01b3, B:72:0x01c9, B:21:0x00b7, B:26:0x00d7, B:28:0x00df, B:90:0x01fc), top: B:150:0x0082, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0167  */
    /* JADX WARN: Code duplicated, block: B:54:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x016c A[Catch: Exception -> 0x00b2, TryCatch #7 {Exception -> 0x00b2, blocks: (B:11:0x0082, B:13:0x0088, B:15:0x0092, B:17:0x00a0, B:35:0x0100, B:37:0x0104, B:44:0x0134, B:75:0x01cf, B:84:0x01f0, B:88:0x01f7, B:91:0x01ff, B:98:0x0230, B:100:0x0236, B:93:0x021e, B:96:0x022a, B:101:0x024a, B:102:0x0260, B:48:0x0148, B:50:0x0154, B:55:0x016c, B:57:0x0172, B:59:0x0179, B:61:0x017f, B:62:0x0183, B:67:0x018e, B:69:0x0197, B:70:0x01b2, B:71:0x01b3, B:72:0x01c9, B:21:0x00b7, B:26:0x00d7, B:28:0x00df, B:90:0x01fc), top: B:150:0x0082, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0172 A[Catch: Exception -> 0x00b2, TryCatch #7 {Exception -> 0x00b2, blocks: (B:11:0x0082, B:13:0x0088, B:15:0x0092, B:17:0x00a0, B:35:0x0100, B:37:0x0104, B:44:0x0134, B:75:0x01cf, B:84:0x01f0, B:88:0x01f7, B:91:0x01ff, B:98:0x0230, B:100:0x0236, B:93:0x021e, B:96:0x022a, B:101:0x024a, B:102:0x0260, B:48:0x0148, B:50:0x0154, B:55:0x016c, B:57:0x0172, B:59:0x0179, B:61:0x017f, B:62:0x0183, B:67:0x018e, B:69:0x0197, B:70:0x01b2, B:71:0x01b3, B:72:0x01c9, B:21:0x00b7, B:26:0x00d7, B:28:0x00df, B:90:0x01fc), top: B:150:0x0082, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cf A[Catch: Exception -> 0x00b2, TryCatch #7 {Exception -> 0x00b2, blocks: (B:11:0x0082, B:13:0x0088, B:15:0x0092, B:17:0x00a0, B:35:0x0100, B:37:0x0104, B:44:0x0134, B:75:0x01cf, B:84:0x01f0, B:88:0x01f7, B:91:0x01ff, B:98:0x0230, B:100:0x0236, B:93:0x021e, B:96:0x022a, B:101:0x024a, B:102:0x0260, B:48:0x0148, B:50:0x0154, B:55:0x016c, B:57:0x0172, B:59:0x0179, B:61:0x017f, B:62:0x0183, B:67:0x018e, B:69:0x0197, B:70:0x01b2, B:71:0x01b3, B:72:0x01c9, B:21:0x00b7, B:26:0x00d7, B:28:0x00df, B:90:0x01fc), top: B:150:0x0082, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e8  */
    public final Result h(int id2, int newWidth, int newHeight, String destination, int newBitrate, String streamableFile, boolean disableAudio, MediaExtractor extractor, b compressionProgressListener, long duration, int rotation) throws Throwable {
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        int iDequeueInputBuffer;
        MediaCodec mediaCodec3;
        boolean z11;
        boolean z12;
        MediaCodec mediaCodec4;
        int iDequeueOutputBuffer;
        ByteBuffer outputBuffer;
        boolean z13;
        boolean z14;
        int i11;
        MediaFormat outputFormat;
        int iDequeueOutputBuffer2;
        a aVar = this;
        extractor = extractor;
        if (newWidth == 0 || newHeight == 0) {
            return new Result(id2, false, "Something went wrong, please try again", 0L, null, 24, null);
        }
        File file = new File(destination);
        try {
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                x00.a aVar2 = x00.a.f122514a;
                y00.b bVarC = new y00.b().c(aVar2.l(rotation, file));
                int iA = aVar2.a(extractor, true);
                extractor.selectTrack(iA);
                extractor.seekTo(0L, 0);
                MediaFormat trackFormat = extractor.getTrackFormat(iA);
                p013kotlin.jvm.internal.s.j(trackFormat, "getTrackFormat(...)");
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", newWidth, newHeight);
                p013kotlin.jvm.internal.s.j(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
                aVar2.k(trackFormat, mediaFormatCreateVideoFormat, newBitrate);
                MediaCodec mediaCodecE = aVar.e(mediaFormatCreateVideoFormat, aVar2.g());
                try {
                    y00.a aVar3 = new y00.a(mediaCodecE.createInputSurface());
                    aVar3.c();
                    mediaCodecE.start();
                    e eVar = new e();
                    MediaCodec mediaCodecD = aVar.d(trackFormat, eVar);
                    mediaCodecD.start();
                    boolean z15 = false;
                    boolean z16 = false;
                    int iA2 = -5;
                    while (!z15) {
                        if (z16) {
                            mediaCodec = mediaCodecE;
                        } else {
                            try {
                                int sampleTrackIndex = extractor.getSampleTrackIndex();
                                if (sampleTrackIndex == iA) {
                                    mediaCodec = mediaCodecE;
                                    int iDequeueInputBuffer2 = mediaCodecD.dequeueInputBuffer(100L);
                                    if (iDequeueInputBuffer2 >= 0) {
                                        ByteBuffer inputBuffer = mediaCodecD.getInputBuffer(iDequeueInputBuffer2);
                                        p013kotlin.jvm.internal.s.h(inputBuffer);
                                        int sampleData = extractor.readSampleData(inputBuffer, 0);
                                        if (sampleData < 0) {
                                            mediaCodec3 = mediaCodecD;
                                            mediaCodec3.queueInputBuffer(iDequeueInputBuffer2, 0, 0, 0L, 4);
                                            z16 = true;
                                        } else {
                                            MediaCodec mediaCodec5 = mediaCodecD;
                                            mediaCodec5.queueInputBuffer(iDequeueInputBuffer2, 0, sampleData, extractor.getSampleTime(), 0);
                                            mediaCodec2 = mediaCodec5;
                                            extractor.advance();
                                            mediaCodec3 = mediaCodec2;
                                        }
                                    }
                                } else {
                                    mediaCodec = mediaCodecE;
                                    mediaCodec2 = mediaCodecD;
                                    if (sampleTrackIndex != -1 || (iDequeueInputBuffer = mediaCodec2.dequeueInputBuffer(100L)) < 0) {
                                        mediaCodec3 = mediaCodec2;
                                    } else {
                                        mediaCodec3 = mediaCodec2;
                                        mediaCodec3.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                        z16 = true;
                                    }
                                }
                                z11 = true;
                                z12 = true;
                                while (true) {
                                    if (!z11 && !z12) {
                                        break;
                                    }
                                    if (!isRunning) {
                                        c(iA, mediaCodec3, mediaCodec, aVar3, eVar, extractor);
                                        compressionProgressListener.a(id2);
                                        try {
                                            return new Result(id2, false, "The compression has stopped!", 0L, null, 24, null);
                                        } catch (Exception e11) {
                                            e = e11;
                                            x00.a.f122514a.j(e);
                                            return new Result(id2, false, e.getMessage(), 0L, null, 24, null);
                                        }
                                    }
                                    int i12 = iA;
                                    mediaCodec4 = mediaCodec;
                                    iA = i12;
                                    z15 = z15;
                                    aVar3 = aVar3;
                                    mediaCodec3 = mediaCodec3;
                                    iA2 = iA2;
                                    iDequeueOutputBuffer = mediaCodec4.dequeueOutputBuffer(bufferInfo, 100L);
                                    if (iDequeueOutputBuffer == -1) {
                                        iA2 = iA2;
                                        i11 = -1;
                                        eVar = eVar;
                                        z14 = false;
                                        z12 = false;
                                    } else {
                                        if (iDequeueOutputBuffer == -2) {
                                            outputFormat = mediaCodec4.getOutputFormat();
                                            p013kotlin.jvm.internal.s.j(outputFormat, "getOutputFormat(...)");
                                            if (iA2 == -5) {
                                                iA2 = bVarC.a(outputFormat, false);
                                                eVar = eVar;
                                                z14 = false;
                                                i11 = -1;
                                            }
                                        } else {
                                            if (iDequeueOutputBuffer != -3) {
                                                if (iDequeueOutputBuffer >= 0) {
                                                    throw new RuntimeException("unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                                                }
                                                outputBuffer = mediaCodec4.getOutputBuffer(iDequeueOutputBuffer);
                                                if (outputBuffer != null) {
                                                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                                                }
                                                if (bufferInfo.size > 1 && (bufferInfo.flags & 2) == 0) {
                                                    bVarC.q(iA2, outputBuffer, bufferInfo, false);
                                                }
                                                if ((bufferInfo.flags & 4) != 0) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                z14 = false;
                                                mediaCodec4.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                z15 = z13;
                                            }
                                            i11 = -1;
                                        }
                                        z14 = false;
                                        i11 = -1;
                                    }
                                    if (iDequeueOutputBuffer != i11) {
                                        iDequeueOutputBuffer2 = mediaCodec3.dequeueOutputBuffer(bufferInfo, 100L);
                                        if (iDequeueOutputBuffer2 == i11) {
                                            mediaCodec = mediaCodec4;
                                            z11 = z14;
                                        } else if (iDequeueOutputBuffer2 == -3 && iDequeueOutputBuffer2 != -2) {
                                            if (iDequeueOutputBuffer2 < 0) {
                                                throw new RuntimeException("unexpected result from decoder.dequeueOutputBuffer: " + iDequeueOutputBuffer2);
                                            }
                                            boolean z17 = bufferInfo.size != 0;
                                            mediaCodec3.releaseOutputBuffer(iDequeueOutputBuffer2, z17);
                                            if (z17) {
                                                try {
                                                    eVar.a();
                                                    eVar.b();
                                                    aVar3.e(bufferInfo.presentationTimeUs * ((long) 1000));
                                                    compressionProgressListener.b(id2, (bufferInfo.presentationTimeUs / duration) * 100);
                                                    aVar3.f();
                                                } catch (Exception e12) {
                                                    String message = e12.getMessage();
                                                    if (message == null) {
                                                        message = "Compression failed at swapping buffer";
                                                    }
                                                    Log.e(CompressorModule.NAME, message);
                                                }
                                            }
                                            if ((bufferInfo.flags & 4) != 0) {
                                                mediaCodec4.signalEndOfInputStream();
                                                iA = iA;
                                                mediaCodec = mediaCodec4;
                                                extractor = extractor;
                                                z11 = false;
                                            } else {
                                                mediaCodec = mediaCodec4;
                                            }
                                        }
                                    }
                                    mediaCodec = mediaCodec4;
                                }
                                aVar = this;
                                mediaCodecE = mediaCodec;
                                mediaCodecD = mediaCodec3;
                            } catch (Exception e13) {
                                e = e13;
                                x00.a.f122514a.j(e);
                                return new Result(id2, false, e.getMessage(), 0L, null, 24, null);
                            }
                        }
                        mediaCodec3 = mediaCodecD;
                        z11 = true;
                        z12 = true;
                        while (true) {
                            if (!z11) {
                            }
                            if (!isRunning) {
                                c(iA, mediaCodec3, mediaCodec, aVar3, eVar, extractor);
                                compressionProgressListener.a(id2);
                                return new Result(id2, false, "The compression has stopped!", 0L, null, 24, null);
                            }
                            int i13 = iA;
                            mediaCodec4 = mediaCodec;
                            iA = i13;
                            z15 = z15;
                            aVar3 = aVar3;
                            mediaCodec3 = mediaCodec3;
                            iA2 = iA2;
                            iDequeueOutputBuffer = mediaCodec4.dequeueOutputBuffer(bufferInfo, 100L);
                            if (iDequeueOutputBuffer == -1) {
                                iA2 = iA2;
                                i11 = -1;
                                eVar = eVar;
                                z14 = false;
                                z12 = false;
                            } else {
                                if (iDequeueOutputBuffer == -2) {
                                    outputFormat = mediaCodec4.getOutputFormat();
                                    p013kotlin.jvm.internal.s.j(outputFormat, "getOutputFormat(...)");
                                    if (iA2 == -5) {
                                        iA2 = bVarC.a(outputFormat, false);
                                        eVar = eVar;
                                        z14 = false;
                                        i11 = -1;
                                    }
                                } else {
                                    if (iDequeueOutputBuffer != -3) {
                                        if (iDequeueOutputBuffer >= 0) {
                                            throw new RuntimeException("unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                                        }
                                        outputBuffer = mediaCodec4.getOutputBuffer(iDequeueOutputBuffer);
                                        if (outputBuffer != null) {
                                            throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                                        }
                                        if (bufferInfo.size > 1) {
                                            bVarC.q(iA2, outputBuffer, bufferInfo, false);
                                        }
                                        if ((bufferInfo.flags & 4) != 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z14 = false;
                                        mediaCodec4.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                        z15 = z13;
                                    }
                                    i11 = -1;
                                }
                                z14 = false;
                                i11 = -1;
                            }
                            if (iDequeueOutputBuffer != i11) {
                                iDequeueOutputBuffer2 = mediaCodec3.dequeueOutputBuffer(bufferInfo, 100L);
                                if (iDequeueOutputBuffer2 == i11) {
                                    mediaCodec = mediaCodec4;
                                    z11 = z14;
                                } else if (iDequeueOutputBuffer2 == -3) {
                                }
                            }
                            mediaCodec = mediaCodec4;
                        }
                        aVar = this;
                        mediaCodecE = mediaCodec;
                        mediaCodecD = mediaCodec3;
                    }
                    aVar.c(iA, mediaCodecD, mediaCodecE, aVar3, eVar, extractor);
                    aVar.f(bVarC, bufferInfo, disableAudio, extractor);
                    extractor.release();
                    try {
                        bVarC.m();
                    } catch (Exception e14) {
                        x00.a.f122514a.j(e14);
                    }
                    if (streamableFile != null) {
                        try {
                            boolean zE = c.f122515a.e(file, new File(streamableFile));
                            File file2 = new File(streamableFile);
                            if (zE) {
                                try {
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    file = file2;
                                    x00.a.f122514a.j(e);
                                }
                            }
                            file = file2;
                        } catch (Exception e16) {
                            e = e16;
                        }
                    }
                    return new Result(id2, true, null, file.length(), file.getPath());
                } catch (Exception e17) {
                    e = e17;
                }
            } catch (Exception e18) {
                e = e18;
                x00.a.f122514a.j(e);
            }
        } catch (Exception e19) {
            e = e19;
            x00.a.f122514a.j(e);
        }
    }

    public final Object b(int i11, Context context, Uri uri, String str, String str2, int i12, int i13, int i14, b bVar, Continuation<? super Result> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new C2519a(context, uri, i11, i14, i12, i13, str, str2, bVar, null), continuation);
    }

    public final void g(boolean z11) {
        isRunning = z11;
    }
}
