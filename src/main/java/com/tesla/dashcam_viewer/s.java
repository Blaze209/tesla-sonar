package com.tesla.dashcam_viewer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import android.view.View;
import android.widget.LinearLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.plaid.internal.EnumC4419g;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.tesla.logging.TeslaLog;
import ezvcard.property.Gender;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import sb0.SEIMetadataProcessed;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0014\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 \u0087\u00012\u00020\u0001:\u0003>\u001f@B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0'2\u0006\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)J)\u0010,\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b,\u0010-J1\u0010/\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010#2\u0006\u0010.\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b¢\u0006\u0004\b3\u00104J5\u00105\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b<\u0010\u001aJ\r\u0010=\u001a\u00020\u0011¢\u0006\u0004\b=\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010?R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010AR\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010CR\u0014\u0010E\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010?R\u001b\u0010I\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010K\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bJ\u0010HR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010OR\u0016\u0010Q\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010?R\u0016\u0010R\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010?R\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010TR\u0018\u0010X\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\u0016\u0010[\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010?R\u0016\u0010\\\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010?R\u0016\u0010^\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010?R\u0016\u0010_\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010?R\u0016\u0010b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR \u0010k\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010n\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010q\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010aR\u0018\u0010u\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010OR\u0016\u0010w\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010?R\u0016\u0010y\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010?R\u0018\u0010|\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010?R\u0018\u0010\u0084\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010?R\u0017\u0010\u0085\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010?R\u0017\u0010\u0086\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010?¨\u0006\u0088\u0001"}, d2 = {"Lcom/tesla/dashcam_viewer/s;", "", "", "videoWidth", "videoHeight", "fps", "bitrate", "Landroid/widget/LinearLayout;", "seiView", "<init>", "(IIIILandroid/widget/LinearLayout;)V", "", "nalUnit", "", "presentationTimeUs", "", "isKeyFrame", "Ljn0/h0;", "s", "([BJZ)V", IntegerTokenConverter.CONVERTER_KEY, "()V", "j", "", "Lcom/tesla/dashcam_viewer/s$b;", "h", "()Ljava/util/List;", "decodedData", "Lsb0/c;", "seiMetadata", "Ljava/nio/ByteBuffer;", "c", "([BLsb0/c;J)Ljava/nio/ByteBuffer;", Snapshot.WIDTH, Snapshot.HEIGHT, "Landroid/graphics/Bitmap;", "g", "(IILsb0/c;J)Landroid/graphics/Bitmap;", "codecConfig", "Lkotlin/Pair;", "u", "([B)Lkotlin/Pair;", "outputData", "barBitmapScaled", "e", "([B[BLandroid/graphics/Bitmap;)I", "startOffset", DateTokenConverter.CONVERTER_KEY, "([B[BLandroid/graphics/Bitmap;I)I", "sps", "pps", "p", "([B[B)Z", "r", "([BJZLsb0/c;)Ljava/util/List;", "o", "()Z", "Landroid/media/MediaFormat;", "l", "()Landroid/media/MediaFormat;", "k", "f", "a", "I", "b", "Landroid/widget/LinearLayout;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "alignedWidth", "Lkotlin/Lazy;", "n", "()I", "scaledMetadataBarHeight", "m", "outputHeight", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "bitmapPaint", "Landroid/graphics/Bitmap;", "cachedScaledBarBitmap", "cachedScaledBarWidth", "cachedScaledBarHeight", "Landroid/media/MediaCodec;", "Landroid/media/MediaCodec;", "decoder", "encoder", "Landroid/media/MediaFormat;", "decoderInputFormat", "q", "encoderOutputFormat", "decoderStride", "decoderSliceHeight", "t", "encoderInputStride", "encoderInputSliceHeight", "v", "Z", "hasCodecConfig", "Lkotlin/collections/m;", "Lcom/tesla/dashcam_viewer/s$c;", "w", "Lkotlin/collections/m;", "pendingFrames", "", "x", "Ljava/util/Map;", "metadataByTimestamp", "y", "Lsb0/c;", "currentSEIMetadata", "z", "J", "currentPresentationTimeUs", "A", "isInitialized", "B", "cachedBarBitmap", "C", "cachedBarWidth", "D", "cachedBarHeight", "E", "[B", "outputBuffer", "", Gender.FEMALE, "[I", "pixelBuffer", "G", "decoderInputCount", "H", "decoderOutputCount", "encoderInputCount", "encoderOutputCount", "K", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean isInitialized;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private Bitmap cachedBarBitmap;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int cachedBarWidth;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int cachedBarHeight;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private byte[] outputBuffer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int[] pixelBuffer;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int decoderInputCount;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private int decoderOutputCount;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private int encoderInputCount;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private int encoderOutputCount;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int videoWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int videoHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int fps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bitrate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final LinearLayout seiView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int alignedWidth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy scaledMetadataBarHeight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy outputHeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Paint bitmapPaint;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Bitmap cachedScaledBarBitmap;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int cachedScaledBarWidth;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int cachedScaledBarHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private MediaCodec decoder;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private MediaCodec encoder;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private MediaFormat decoderInputFormat;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private MediaFormat encoderOutputFormat;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int decoderStride;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int decoderSliceHeight;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int encoderInputStride;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int encoderInputSliceHeight;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean hasCodecConfig;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.collections.m<PendingFrame> pendingFrames;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Map<Long, SEIMetadataProcessed> metadataByTimestamp;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private SEIMetadataProcessed currentSEIMetadata;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long currentPresentationTimeUs;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lcom/tesla/dashcam_viewer/s$a;", "", "<init>", "()V", "", "value", "alignment", "a", "(II)I", "", "VIDEO_MIME_TYPE", "Ljava/lang/String;", "", "CODEC_TIMEOUT_US", "J", "", "YUV_Y_R", "D", "YUV_Y_G", "YUV_Y_B", "YUV_U_R", "YUV_U_G", "YUV_U_B", "YUV_V_R", "YUV_V_G", "YUV_V_B", "YUV_UV_OFFSET", "I", "Y_MIN", "Y_RANGE", "UV_RANGE", "MACROBLOCK_SIZE", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int value, int alignment) {
            return (((value + alignment) - 1) / alignment) * alignment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.s$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tesla/dashcam_viewer/s$b;", "", "", "data", "", "presentationTimeUs", "", "flags", "<init>", "([BJI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "()[B", "b", "J", "c", "()J", "I", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EncodedFrame {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final byte[] data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long presentationTimeUs;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int flags;

        public EncodedFrame(byte[] data, long j11, int i11) {
            p013kotlin.jvm.internal.s.k(data, "data");
            this.data = data;
            this.presentationTimeUs = j11;
            this.flags = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte[] getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getPresentationTimeUs() {
            return this.presentationTimeUs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EncodedFrame)) {
                return false;
            }
            EncodedFrame encodedFrame = (EncodedFrame) other;
            return p013kotlin.jvm.internal.s.f(this.data, encodedFrame.data) && this.presentationTimeUs == encodedFrame.presentationTimeUs && this.flags == encodedFrame.flags;
        }

        public int hashCode() {
            return (((Arrays.hashCode(this.data) * 31) + Long.hashCode(this.presentationTimeUs)) * 31) + Integer.hashCode(this.flags);
        }

        public String toString() {
            return "EncodedFrame(data=" + Arrays.toString(this.data) + ", presentationTimeUs=" + this.presentationTimeUs + ", flags=" + this.flags + ")";
        }
    }

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.s$c, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/tesla/dashcam_viewer/s$c;", "", "Ljava/nio/ByteBuffer;", "yuvBuffer", "", "presentationTimeUs", "", "isKeyFrame", "Lsb0/c;", "seiMetadata", "<init>", "(Ljava/nio/ByteBuffer;JZLsb0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/nio/ByteBuffer;", "b", "()Ljava/nio/ByteBuffer;", "J", "()J", "c", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "Lsb0/c;", "getSeiMetadata", "()Lsb0/c;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class PendingFrame {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ByteBuffer yuvBuffer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long presentationTimeUs;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isKeyFrame;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final SEIMetadataProcessed seiMetadata;

        public PendingFrame(ByteBuffer yuvBuffer, long j11, boolean z11, SEIMetadataProcessed seiMetadata) {
            p013kotlin.jvm.internal.s.k(yuvBuffer, "yuvBuffer");
            p013kotlin.jvm.internal.s.k(seiMetadata, "seiMetadata");
            this.yuvBuffer = yuvBuffer;
            this.presentationTimeUs = j11;
            this.isKeyFrame = z11;
            this.seiMetadata = seiMetadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getPresentationTimeUs() {
            return this.presentationTimeUs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ByteBuffer getYuvBuffer() {
            return this.yuvBuffer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsKeyFrame() {
            return this.isKeyFrame;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingFrame)) {
                return false;
            }
            PendingFrame pendingFrame = (PendingFrame) other;
            return p013kotlin.jvm.internal.s.f(this.yuvBuffer, pendingFrame.yuvBuffer) && this.presentationTimeUs == pendingFrame.presentationTimeUs && this.isKeyFrame == pendingFrame.isKeyFrame && p013kotlin.jvm.internal.s.f(this.seiMetadata, pendingFrame.seiMetadata);
        }

        public int hashCode() {
            return (((((this.yuvBuffer.hashCode() * 31) + Long.hashCode(this.presentationTimeUs)) * 31) + Boolean.hashCode(this.isKeyFrame)) * 31) + this.seiMetadata.hashCode();
        }

        public String toString() {
            return "PendingFrame(yuvBuffer=" + this.yuvBuffer + ", presentationTimeUs=" + this.presentationTimeUs + ", isKeyFrame=" + this.isKeyFrame + ", seiMetadata=" + this.seiMetadata + ")";
        }
    }

    public s(int i11, int i12, int i13, int i14, LinearLayout seiView) {
        p013kotlin.jvm.internal.s.k(seiView, "seiView");
        this.videoWidth = i11;
        this.videoHeight = i12;
        this.fps = i13;
        this.bitrate = i14;
        this.seiView = seiView;
        this.logger = com.tesla.logging.g.INSTANCE.a("DashcamViewer_FrameProcessor");
        int iA = INSTANCE.a(i11, 16);
        this.alignedWidth = iA;
        this.scaledMetadataBarHeight = jn0.m.b(new wn0.a() { // from class: com.tesla.dashcam_viewer.q
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(s.t(this.f55964a));
            }
        });
        this.outputHeight = jn0.m.b(new wn0.a() { // from class: com.tesla.dashcam_viewer.r
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(s.q(this.f55967a));
            }
        });
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.bitmapPaint = paint;
        this.decoderStride = i11;
        this.decoderSliceHeight = i12;
        this.encoderInputStride = iA;
        this.encoderInputSliceHeight = m();
        this.pendingFrames = new p013kotlin.collections.m<>();
        this.metadataByTimestamp = new LinkedHashMap();
        this.currentSEIMetadata = SEIMetadataProcessed.INSTANCE.a();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x002a, please report this as an issue */
    private final ByteBuffer c(byte[] decodedData, SEIMetadataProcessed seiMetadata, long presentationTimeUs) {
        int i11 = this.encoderInputStride;
        int i12 = this.encoderInputSliceHeight;
        int measuredWidth = this.seiView.getMeasuredWidth();
        int measuredHeight = this.seiView.getMeasuredHeight();
        int iN = n();
        int i13 = this.videoHeight;
        int i14 = i13 + iN;
        if (i12 < i14) {
            throw new IllegalArgumentException(("Encoder buffer too small: bufferHeight=" + i12 + " < required=" + i14 + " (videoHeight=" + i13 + " + scaledBarHeight=" + iN + ")").toString());
        }
        int i15 = i11 * i12;
        int i16 = (i11 * (i12 / 2)) + i15;
        byte[] bArr = this.outputBuffer;
        if (bArr != null) {
            p013kotlin.jvm.internal.s.h(bArr);
            if (bArr.length != i16) {
                this.outputBuffer = new byte[i16];
                this.logger.j("Allocated reusable output buffer: " + (i16 / 1024) + "KB");
            }
        } else {
            this.outputBuffer = new byte[i16];
            this.logger.j("Allocated reusable output buffer: " + (i16 / 1024) + "KB");
        }
        byte[] bArr2 = this.outputBuffer;
        p013kotlin.jvm.internal.s.h(bArr2);
        Bitmap bitmap = null;
        if (seiMetadata.getHasData()) {
            Bitmap bitmapG = g(measuredWidth, measuredHeight, seiMetadata, presentationTimeUs);
            Bitmap bitmap2 = this.cachedScaledBarBitmap;
            if (bitmap2 == null || this.cachedScaledBarWidth != this.videoWidth || this.cachedScaledBarHeight != iN) {
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.cachedScaledBarBitmap = Bitmap.createBitmap(this.videoWidth, iN, Bitmap.Config.ARGB_8888);
                int i17 = this.videoWidth;
                this.cachedScaledBarWidth = i17;
                this.cachedScaledBarHeight = iN;
                this.logger.j("Allocated cached scaled bitmap: " + i17 + "x" + iN);
            }
            Bitmap bitmap3 = this.cachedScaledBarBitmap;
            p013kotlin.jvm.internal.s.h(bitmap3);
            new Canvas(bitmap3).drawBitmap(bitmapG, (Rect) null, new Rect(0, 0, this.videoWidth, iN), this.bitmapPaint);
            bitmap = this.cachedScaledBarBitmap;
        }
        e(decodedData, bArr2, bitmap);
        d(decodedData, bArr2, bitmap, i15);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        p013kotlin.jvm.internal.s.j(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    private final int d(byte[] decodedData, byte[] outputData, Bitmap barBitmapScaled, int startOffset) {
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16 = this.encoderInputStride;
        int i17 = this.encoderInputSliceHeight;
        int iN = n();
        int i18 = this.decoderStride;
        int i19 = this.decoderSliceHeight * i18;
        int i21 = this.videoHeight / 2;
        int i22 = (i18 * i21) + i19;
        if (i22 > decodedData.length) {
            throw new IllegalStateException("Decoded UV plane buffer too small: decodedData.size=" + decodedData.length + " < expected=" + i22 + " (inputUVStart=" + i19 + " + chromaHeight=" + i21 + " × decoderStride=" + this.decoderStride + ")");
        }
        int i23 = startOffset;
        for (int i24 = 0; i24 < i21; i24++) {
            int i25 = (this.decoderStride * i24) + i19;
            int i26 = this.videoWidth;
            int i27 = i25 + i26;
            if (i27 > decodedData.length) {
                com.tesla.logging.g gVar = this.logger;
                String str = "UV plane copy would exceed buffer: inputRowEnd=" + i27 + " > decodedData.size=" + decodedData.length + ", row=" + i24;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g(str);
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                throw new ArrayIndexOutOfBoundsException("UV plane row " + i24 + " exceeds buffer bounds: " + i27 + " > " + decodedData.length);
            }
            System.arraycopy(decodedData, i25, outputData, i23, i26);
            int i28 = this.videoWidth;
            i23 += i28;
            int i29 = i16 - i28;
            if (i29 > 0) {
                int i31 = i29 + i23;
                Arrays.fill(outputData, i23, i31, (byte) -128);
                i23 = i31;
            }
        }
        int i32 = iN / 2;
        if (barBitmapScaled != null) {
            int[] iArr2 = this.pixelBuffer;
            p013kotlin.jvm.internal.s.h(iArr2);
            int i33 = 0;
            while (i33 < i32) {
                int i34 = i33 * 2;
                bo0.h hVarU = bo0.n.u(bo0.n.w(0, this.videoWidth), 2);
                int first = hVarU.getFirst();
                int last = hVarU.getLast();
                int step = hVarU.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        int i35 = (this.videoWidth * i34) + first;
                        i13 = i16;
                        if (i35 >= iArr2.length) {
                            com.tesla.logging.g gVar2 = this.logger;
                            iArr = iArr2;
                            String str2 = "UV chroma: pixelIndex=" + i35 + " exceeds pixels.size=" + iArr2.length + " (yRow=" + i34 + ", chromaCol=" + first + ", scaledBarHeight=" + iN + ")";
                            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                            String tag2 = gVar2.getTag();
                            String strG2 = gVar2.g(str2);
                            zb0.a aVar2 = zb0.a.f128044a;
                            Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                            Iterator it = mapF2.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it.next();
                                Iterator it2 = it;
                                int i36 = iN;
                                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                                i34 = i34;
                                iN = i36;
                                it = it2;
                            }
                            i14 = iN;
                            i15 = i34;
                            firebaseCrashlytics2.recordException(new Exception(strG2));
                            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                            vr0.a.INSTANCE.a(strG2, new Object[0]);
                            int i37 = i23 + 1;
                            outputData[i23] = -128;
                            i23 += 2;
                            outputData[i37] = -128;
                        } else {
                            i14 = iN;
                            iArr = iArr2;
                            i15 = i34;
                            int i38 = iArr[i35];
                            double d11 = (i38 >> 16) & 255;
                            double d12 = (i38 >> 8) & 255;
                            double d13 = i38 & 255;
                            double d14 = ((-0.169d) * d11) + ((-0.331d) * d12) + (d13 * 0.5d);
                            double d15 = (d11 * 0.5d) + (d12 * (-0.419d)) + (d13 * (-0.081d));
                            double d16 = 224;
                            double d17 = 128;
                            byte bN = (byte) bo0.n.n((int) (((d14 * d16) / 255.0d) + d17), 16, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                            byte bN2 = (byte) bo0.n.n((int) (((d15 * d16) / 255.0d) + d17), 16, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                            int i39 = i23 + 1;
                            outputData[i23] = bN;
                            i23 += 2;
                            outputData[i39] = bN2;
                        }
                        if (first == last) {
                            break;
                        }
                        first += step;
                        iArr2 = iArr;
                        i33 = i33;
                        i16 = i13;
                        i17 = i17;
                        i34 = i15;
                        iN = i14;
                    }
                } else {
                    i13 = i16;
                    i17 = i17;
                    i14 = iN;
                    iArr = iArr2;
                    i33 = i33;
                }
                int i41 = i13 - this.videoWidth;
                int i42 = 0;
                while (i42 < i41) {
                    outputData[i23] = -128;
                    i42++;
                    i23++;
                }
                i33++;
                iArr2 = iArr;
                i16 = i13;
                i17 = i17;
                iN = i14;
            }
            i11 = i16;
            i12 = i17;
        } else {
            i11 = i16;
            i12 = i17;
            for (int i43 = 0; i43 < i32; i43++) {
                int i44 = this.videoWidth / 2;
                for (int i45 = 0; i45 < i44; i45++) {
                    int i46 = i23 + 1;
                    outputData[i23] = -128;
                    i23 += 2;
                    outputData[i46] = -128;
                }
                byte b11 = -128;
                int i47 = i11 - this.videoWidth;
                int i48 = 0;
                while (i48 < i47) {
                    outputData[i23] = b11;
                    i48++;
                    i23++;
                    b11 = -128;
                }
            }
        }
        int i49 = i21 + i32;
        int i51 = i12 / 2;
        int i52 = i51 - i49;
        if (i52 >= 0) {
            int i53 = i52 * i11;
            if (i53 <= 0) {
                return i23;
            }
            int i54 = i53 + i23;
            Arrays.fill(outputData, i23, i54, (byte) -128);
            return i54;
        }
        throw new IllegalStateException(("UV plane padding cannot be negative: paddingUVRows=" + i52 + " (bufferHeight/2=" + i51 + ", totalUVRows=" + i49 + ")").toString());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e7  */
    private final int e(byte[] decodedData, byte[] outputData, Bitmap barBitmapScaled) {
        byte[] bArr = outputData;
        int i11 = this.encoderInputStride;
        int i12 = this.encoderInputSliceHeight;
        int iN = n();
        int i13 = this.videoHeight;
        int i14 = this.decoderStride * i13;
        if (i14 > decodedData.length) {
            throw new IllegalStateException("Decoded Y plane buffer too small: decodedData.size=" + decodedData.length + " < expected=" + i14 + " (videoHeight=" + this.videoHeight + " × decoderStride=" + this.decoderStride + ")");
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = this.decoderStride * i17;
            int i19 = this.videoWidth;
            int i21 = i18 + i19;
            if (i21 > decodedData.length) {
                com.tesla.logging.g gVar = this.logger;
                String str = "Y plane copy would exceed buffer: inputRowEnd=" + i21 + " > decodedData.size=" + decodedData.length + ", row=" + i17;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g(str);
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                throw new ArrayIndexOutOfBoundsException("Y plane row " + i17 + " exceeds buffer bounds: " + i21 + " > " + decodedData.length);
            }
            System.arraycopy(decodedData, i18, bArr, i16, i19);
            int i22 = this.videoWidth;
            i16 += i22;
            int i23 = i11 - i22;
            if (i23 > 0) {
                int i24 = i23 + i16;
                Arrays.fill(bArr, i16, i24, (byte) 0);
                i16 = i24;
            }
        }
        if (barBitmapScaled != null) {
            int i25 = this.videoWidth * iN;
            int[] iArr = this.pixelBuffer;
            if (iArr != null) {
                p013kotlin.jvm.internal.s.h(iArr);
                if (iArr.length < i25) {
                    this.pixelBuffer = new int[i25];
                }
            } else {
                this.pixelBuffer = new int[i25];
            }
            int[] iArr2 = this.pixelBuffer;
            p013kotlin.jvm.internal.s.h(iArr2);
            int i26 = this.videoWidth;
            barBitmapScaled.getPixels(iArr2, 0, i26, 0, 0, i26, iN);
            int i27 = 0;
            int i28 = 0;
            while (i27 < iN) {
                int i29 = this.videoWidth;
                int i31 = i15;
                while (i31 < i29) {
                    int i32 = i28 + 1;
                    int i33 = iArr2[i28];
                    outputData[i16] = (byte) bo0.n.n((int) (((((double) EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE) * (((((double) ((i33 >> 16) & 255)) * 0.299d) + (((double) ((i33 >> 8) & 255)) * 0.587d)) + (((double) (i33 & 255)) * 0.114d))) / 255.0d) + ((double) 16)), 16, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
                    i31++;
                    i16++;
                    i28 = i32;
                }
                int i34 = i11 - this.videoWidth;
                if (i34 > 0) {
                    int i35 = i34 + i16;
                    bArr = outputData;
                    Arrays.fill(bArr, i16, i35, (byte) 0);
                    i16 = i35;
                } else {
                    bArr = outputData;
                }
                i27++;
                i15 = 0;
            }
        } else {
            for (int i36 = 0; i36 < iN; i36++) {
                int i37 = this.videoWidth;
                int i38 = 0;
                while (i38 < i37) {
                    bArr[i16] = Tnaf.POW_2_WIDTH;
                    i38++;
                    i16++;
                }
                int i39 = i11 - this.videoWidth;
                if (i39 > 0) {
                    int i41 = i39 + i16;
                    Arrays.fill(bArr, i16, i41, (byte) 0);
                    i16 = i41;
                }
            }
        }
        int i42 = this.videoHeight + iN;
        int i43 = i12 - i42;
        if (i43 >= 0) {
            int i44 = i43 * i11;
            if (i44 <= 0) {
                return i16;
            }
            int i45 = i44 + i16;
            Arrays.fill(bArr, i16, i45, (byte) 0);
            return i45;
        }
        throw new IllegalStateException(("Y plane padding cannot be negative: paddingYRows=" + i43 + " (bufferHeight=" + i12 + ", totalYRows=" + i42 + ")").toString());
    }

    private final Bitmap g(int width, int height, SEIMetadataProcessed seiMetadata, long presentationTimeUs) {
        LinearLayout linearLayout = this.seiView;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        linearLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        linearLayout.layout(0, 0, width, height);
        if (seiMetadata.getHasData()) {
            linearLayout.setVisibility(0);
            sb0.f.f111040a.e(linearLayout, seiMetadata, true, presentationTimeUs);
        } else {
            linearLayout.setVisibility(4);
        }
        linearLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        linearLayout.layout(0, 0, width, height);
        Bitmap bitmap = this.cachedBarBitmap;
        if (bitmap == null || this.cachedBarWidth != width || this.cachedBarHeight != height) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.cachedBarBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.cachedBarWidth = width;
            this.cachedBarHeight = height;
        }
        Bitmap bitmap2 = this.cachedBarBitmap;
        p013kotlin.jvm.internal.s.h(bitmap2);
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawColor(-16777216);
        linearLayout.draw(canvas);
        return bitmap2;
    }

    private final List<EncodedFrame> h() {
        int i11;
        MediaCodec mediaCodec = this.encoder;
        if (mediaCodec == null) {
            return p013kotlin.collections.v.m();
        }
        ArrayList arrayList = new ArrayList();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            long j11 = 100000;
            while (true) {
                int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j11);
                if (iDequeueOutputBuffer < 0) {
                    if (iDequeueOutputBuffer != -2) {
                        break;
                    }
                    this.encoderOutputFormat = mediaCodec.getOutputFormat();
                    j11 = 0;
                } else {
                    ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                    if (outputBuffer == null || (i11 = bufferInfo.size) <= 0) {
                        try {
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        } catch (IllegalStateException unused) {
                            this.logger.n("Encoder stopped while releasing empty buffer");
                        }
                    } else if ((bufferInfo.flags & 2) != 0) {
                        byte[] bArr = new byte[i11];
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        outputBuffer.get(bArr);
                        try {
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            Pair<byte[], byte[]> pairU = u(bArr);
                            byte[] bArrA = pairU.a();
                            byte[] bArrB = pairU.b();
                            if (bArrA == null || bArrB == null) {
                                com.tesla.logging.g gVar = this.logger;
                                TeslaLog teslaLog = TeslaLog.INSTANCE;
                                String tag = gVar.getTag();
                                String strG = gVar.g("Failed to parse SPS/PPS from codec config");
                                zb0.a aVar = zb0.a.f128044a;
                                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                for (Map.Entry entry : mapF.entrySet()) {
                                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                                }
                                firebaseCrashlytics.recordException(new Exception(strG));
                                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                                vr0.a.INSTANCE.a(strG, new Object[0]);
                            } else {
                                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                                p013kotlin.jvm.internal.s.j(outputFormat, "getOutputFormat(...)");
                                String string = outputFormat.getString("mime");
                                if (string == null) {
                                    string = "video/avc";
                                }
                                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(string, outputFormat.getInteger(Snapshot.WIDTH), outputFormat.getInteger(Snapshot.HEIGHT));
                                p013kotlin.jvm.internal.s.j(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
                                mediaFormatCreateVideoFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArrA));
                                mediaFormatCreateVideoFormat.setByteBuffer("csd-1", ByteBuffer.wrap(bArrB));
                                if (outputFormat.containsKey("color-format")) {
                                    mediaFormatCreateVideoFormat.setInteger("color-format", outputFormat.getInteger("color-format"));
                                }
                                if (outputFormat.containsKey("bitrate")) {
                                    mediaFormatCreateVideoFormat.setInteger("bitrate", outputFormat.getInteger("bitrate"));
                                }
                                if (outputFormat.containsKey("frame-rate")) {
                                    mediaFormatCreateVideoFormat.setInteger("frame-rate", outputFormat.getInteger("frame-rate"));
                                }
                                this.encoderOutputFormat = mediaFormatCreateVideoFormat;
                                this.hasCodecConfig = true;
                                this.logger.j("Updated encoder output format with SPS (" + bArrA.length + " bytes) and PPS (" + bArrB.length + " bytes)");
                            }
                        } catch (IllegalStateException unused2) {
                            this.logger.n("Encoder stopped while releasing codec config buffer");
                        }
                    } else {
                        byte[] bArr2 = new byte[i11];
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        outputBuffer.get(bArr2);
                        try {
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            this.encoderOutputCount++;
                            arrayList.add(new EncodedFrame(bArr2, bufferInfo.presentationTimeUs, bufferInfo.flags));
                        } catch (IllegalStateException unused3) {
                            this.logger.n("Encoder stopped while releasing output buffer");
                        }
                    }
                    j11 = 0;
                }
            }
        } catch (Exception e11) {
            this.logger.d("drainAllEncoderOutput: exception", e11);
        }
        return arrayList;
    }

    private final void i() {
        int i11;
        ByteBuffer byteBufferC;
        MediaCodec mediaCodec = this.decoder;
        if (mediaCodec == null) {
            return;
        }
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            while (true) {
                if (iDequeueOutputBuffer < 0 && iDequeueOutputBuffer != -2) {
                    return;
                }
                if (iDequeueOutputBuffer >= 0) {
                    ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                    if (outputBuffer != null && (i11 = bufferInfo.size) > 0) {
                        byte[] bArr = new byte[i11];
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        outputBuffer.get(bArr);
                        SEIMetadataProcessed sEIMetadataProcessedA = this.metadataByTimestamp.get(Long.valueOf(bufferInfo.presentationTimeUs));
                        if (sEIMetadataProcessedA == null) {
                            sEIMetadataProcessedA = SEIMetadataProcessed.INSTANCE.a();
                        }
                        try {
                            byteBufferC = c(bArr, sEIMetadataProcessedA, bufferInfo.presentationTimeUs);
                        } catch (Exception e11) {
                            this.logger.d("assembleFrameWithMetadataBar exception: " + e11.getMessage(), e11);
                            byteBufferC = null;
                        }
                        this.metadataByTimestamp.remove(Long.valueOf(bufferInfo.presentationTimeUs));
                        if (byteBufferC == null) {
                            com.tesla.logging.g gVar = this.logger;
                            TeslaLog teslaLog = TeslaLog.INSTANCE;
                            String tag = gVar.getTag();
                            String strG = gVar.g("assembleFrameWithMetadataBar returned null, skipping frame");
                            zb0.a aVar = zb0.a.f128044a;
                            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                            for (Map.Entry entry : mapF.entrySet()) {
                                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                            }
                            firebaseCrashlytics.recordException(new Exception(strG));
                            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                            vr0.a.INSTANCE.a(strG, new Object[0]);
                            try {
                                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                return;
                            } catch (IllegalStateException unused) {
                                this.logger.n("Decoder stopped while releasing buffer (expected during cleanup)");
                                return;
                            }
                        }
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBufferC.remaining());
                        byteBufferAllocateDirect.put(byteBufferC);
                        byteBufferAllocateDirect.flip();
                        boolean z11 = (bufferInfo.flags & 1) != 0;
                        p013kotlin.collections.m<PendingFrame> mVar = this.pendingFrames;
                        p013kotlin.jvm.internal.s.h(byteBufferAllocateDirect);
                        mVar.add(new PendingFrame(byteBufferAllocateDirect, bufferInfo.presentationTimeUs, z11, this.currentSEIMetadata));
                        this.decoderOutputCount++;
                        this.logger.d("drainDecoder: exception", e);
                    }
                    try {
                        mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    } catch (IllegalStateException unused2) {
                        this.logger.n("Decoder stopped while releasing buffer (expected during cleanup)");
                        return;
                    }
                } else {
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    p013kotlin.jvm.internal.s.j(outputFormat, "getOutputFormat(...)");
                    this.decoderStride = outputFormat.containsKey("stride") ? outputFormat.getInteger("stride") : this.videoWidth;
                    this.decoderSliceHeight = outputFormat.containsKey("slice-height") ? outputFormat.getInteger("slice-height") : this.videoHeight;
                    int integer = outputFormat.containsKey("color-format") ? outputFormat.getInteger("color-format") : -1;
                    this.logger.j("Decoder format: stride=" + this.decoderStride + ", sliceHeight=" + this.decoderSliceHeight + ", colorFormat=" + integer);
                }
                iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            }
        } catch (Exception e12) {
            this.logger.d("drainDecoder: exception", e12);
        }
    }

    private final void j() {
        int iDequeueInputBuffer;
        MediaCodec mediaCodec = this.encoder;
        if (mediaCodec == null) {
            return;
        }
        while (!this.pendingFrames.isEmpty() && (iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L)) >= 0) {
            try {
                PendingFrame pendingFrameRemoveFirst = this.pendingFrames.removeFirst();
                int iRemaining = pendingFrameRemoveFirst.getYuvBuffer().remaining();
                ByteBuffer inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                int iCapacity = inputBuffer != null ? inputBuffer.capacity() : 0;
                int iMin = Math.min(iRemaining, iCapacity);
                if (iRemaining > iCapacity) {
                    pendingFrameRemoveFirst.getYuvBuffer().limit(iCapacity);
                    if (this.encoderInputCount == 0) {
                        this.logger.n("feedEncoder: Truncating " + (iRemaining - iCapacity) + " bytes (buffer=" + iRemaining + ", encoder capacity=" + iCapacity + ")");
                    }
                }
                if (inputBuffer != null) {
                    inputBuffer.clear();
                }
                if (inputBuffer != null) {
                    inputBuffer.put(pendingFrameRemoveFirst.getYuvBuffer());
                }
                mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, iMin, pendingFrameRemoveFirst.getPresentationTimeUs(), pendingFrameRemoveFirst.getIsKeyFrame() ? 1 : 0);
                this.encoderInputCount++;
            } catch (Exception e11) {
                this.logger.d("feedEncoder: exception", e11);
                return;
            }
        }
    }

    private final int m() {
        return ((Number) this.outputHeight.getValue()).intValue();
    }

    private final int n() {
        return ((Number) this.scaledMetadataBarHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(s sVar) {
        return INSTANCE.a(sVar.videoHeight + sVar.n(), 16);
    }

    private final void s(byte[] nalUnit, long presentationTimeUs, boolean isKeyFrame) {
        MediaCodec mediaCodec = this.decoder;
        if (mediaCodec == null) {
            return;
        }
        try {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(100000L);
            if (iDequeueInputBuffer < 0) {
                this.logger.n("queueToDecoder: input buffer not available (index=" + iDequeueInputBuffer + ")");
                return;
            }
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
            if (inputBuffer != null) {
                inputBuffer.clear();
            }
            if (inputBuffer != null) {
                inputBuffer.put(nalUnit);
            }
            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, nalUnit.length, presentationTimeUs, isKeyFrame ? 1 : 0);
            this.decoderInputCount++;
        } catch (Exception e11) {
            this.logger.d("queueToDecoder: exception", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(s sVar) {
        int measuredWidth = sVar.seiView.getMeasuredWidth();
        int measuredHeight = sVar.seiView.getMeasuredHeight();
        if (measuredWidth > 0) {
            return (measuredHeight * sVar.videoWidth) / measuredWidth;
        }
        throw new IllegalArgumentException(("SEI view not yet measured: measuredWidth=" + measuredWidth + " (must call measure() before accessing scaledMetadataBarHeight)").toString());
    }

    private final Pair<byte[], byte[]> u(byte[] codecConfig) {
        try {
            byte[] bArr = {0, 0, 0, 1};
            ArrayList arrayList = new ArrayList();
            int length = codecConfig.length - 4;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    if (codecConfig[i11] == bArr[0] && codecConfig[i11 + 1] == bArr[1] && codecConfig[i11 + 2] == bArr[2] && codecConfig[i11 + 3] == bArr[3]) {
                        arrayList.add(Integer.valueOf(i11));
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            if (arrayList.size() >= 2) {
                return new Pair<>(p013kotlin.collections.n.u(codecConfig, ((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue()), p013kotlin.collections.n.u(codecConfig, ((Number) arrayList.get(1)).intValue(), codecConfig.length));
            }
            com.tesla.logging.g gVar = this.logger;
            String str = "splitSPSandPPS: Expected 2 start codes, found " + arrayList.size();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return new Pair<>(null, null);
        } catch (Exception e11) {
            this.logger.d("splitSPSandPPS: exception", e11);
            return new Pair<>(null, null);
        }
    }

    public final void f() {
        try {
            MediaCodec mediaCodec = this.decoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (IllegalStateException unused) {
            this.logger.n("Decoder was never started, skipping stop()");
        } catch (Exception e11) {
            this.logger.d("Error stopping decoder", e11);
        }
        try {
            MediaCodec mediaCodec2 = this.decoder;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
        } catch (Exception e12) {
            this.logger.d("Error releasing decoder", e12);
        }
        this.decoder = null;
        try {
            MediaCodec mediaCodec3 = this.encoder;
            if (mediaCodec3 != null) {
                mediaCodec3.stop();
            }
        } catch (IllegalStateException unused2) {
            this.logger.n("Encoder was never started, skipping stop()");
        } catch (Exception e13) {
            this.logger.d("Error stopping encoder", e13);
        }
        try {
            MediaCodec mediaCodec4 = this.encoder;
            if (mediaCodec4 != null) {
                mediaCodec4.release();
            }
        } catch (Exception e14) {
            this.logger.d("Error releasing encoder", e14);
        }
        this.encoder = null;
        try {
            Bitmap bitmap = this.cachedBarBitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.cachedBarBitmap = null;
            Bitmap bitmap2 = this.cachedScaledBarBitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.cachedScaledBarBitmap = null;
            this.outputBuffer = null;
            this.pixelBuffer = null;
            this.metadataByTimestamp.clear();
            this.pendingFrames.clear();
            this.isInitialized = false;
            this.logger.j("FrameProcessor cleaned up");
        } catch (Exception e15) {
            this.logger.d("Error cleaning up cached resources", e15);
        }
    }

    public final List<EncodedFrame> k() {
        int i11;
        ArrayList arrayList = new ArrayList();
        try {
            this.logger.j("finish() called, draining encoder pipeline. pending=" + this.pendingFrames.size());
            j();
            MediaCodec mediaCodec = this.encoder;
            if (mediaCodec != null) {
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(100000L);
                if (iDequeueInputBuffer >= 0) {
                    mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                }
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                boolean z11 = false;
                while (!z11) {
                    int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
                    if (iDequeueOutputBuffer >= 0) {
                        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                        if (outputBuffer != null && (i11 = bufferInfo.size) > 0) {
                            byte[] bArr = new byte[i11];
                            outputBuffer.position(bufferInfo.offset);
                            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                            outputBuffer.get(bArr);
                            arrayList.add(new EncodedFrame(bArr, bufferInfo.presentationTimeUs, bufferInfo.flags));
                            this.encoderOutputCount++;
                        }
                        if ((bufferInfo.flags & 4) != 0) {
                            z11 = true;
                        }
                        try {
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        } catch (IllegalStateException unused) {
                            this.logger.n("Encoder stopped during finish() - cleanup likely called concurrently");
                            this.logger.j("finish() complete: drained " + arrayList.size() + " frames, total encoded=" + this.encoderOutputCount);
                            return arrayList;
                        }
                    } else if (iDequeueOutputBuffer != -2) {
                        break;
                    }
                    return arrayList;
                }
            }
            this.logger.j("finish() complete: drained " + arrayList.size() + " frames, total encoded=" + this.encoderOutputCount);
        } catch (Exception e11) {
            this.logger.d("Error in finish()", e11);
        }
        return arrayList;
    }

    public final MediaFormat l() {
        MediaFormat outputFormat = this.encoderOutputFormat;
        if (outputFormat == null) {
            MediaCodec mediaCodec = this.encoder;
            outputFormat = mediaCodec != null ? mediaCodec.getOutputFormat() : null;
        }
        boolean z11 = outputFormat != null && outputFormat.containsKey("csd-0");
        boolean z12 = outputFormat != null && outputFormat.containsKey("csd-1");
        if (z11 && z12) {
            return outputFormat;
        }
        com.tesla.logging.g gVar = this.logger;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("WARNING: Output format missing SPS/PPS! Encoder hasn't output codec config yet!");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        return outputFormat;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getHasCodecConfig() {
        return this.hasCodecConfig;
    }

    public final boolean p(byte[] sps, byte[] pps) {
        MediaCodecInfo mediaCodecInfo;
        int[] iArr;
        MediaCodecInfo mediaCodecInfo2;
        int[] iArr2;
        p013kotlin.jvm.internal.s.k(sps, "sps");
        p013kotlin.jvm.internal.s.k(pps, "pps");
        try {
            MediaCodecList mediaCodecList = new MediaCodecList(0);
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.videoWidth, this.videoHeight);
            p013kotlin.jvm.internal.s.j(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
            String strFindDecoderForFormat = mediaCodecList.findDecoderForFormat(mediaFormatCreateVideoFormat);
            MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
            p013kotlin.jvm.internal.s.j(codecInfos, "getCodecInfos(...)");
            int length = codecInfos.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    mediaCodecInfo = null;
                    break;
                }
                MediaCodecInfo mediaCodecInfo3 = codecInfos[i11];
                if (p013kotlin.jvm.internal.s.f(mediaCodecInfo3.getName(), strFindDecoderForFormat)) {
                    mediaCodecInfo = mediaCodecInfo3;
                    break;
                }
                i11++;
            }
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo != null ? mediaCodecInfo.getCapabilitiesForType("video/avc") : null;
            if (capabilitiesForType == null || (iArr = capabilitiesForType.colorFormats) == null) {
                iArr = new int[0];
            }
            MediaFormat mediaFormatCreateVideoFormat2 = MediaFormat.createVideoFormat("video/avc", this.alignedWidth, m());
            p013kotlin.jvm.internal.s.j(mediaFormatCreateVideoFormat2, "createVideoFormat(...)");
            String strFindEncoderForFormat = mediaCodecList.findEncoderForFormat(mediaFormatCreateVideoFormat2);
            MediaCodecInfo[] codecInfos2 = mediaCodecList.getCodecInfos();
            p013kotlin.jvm.internal.s.j(codecInfos2, "getCodecInfos(...)");
            int length2 = codecInfos2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    mediaCodecInfo2 = null;
                    break;
                }
                mediaCodecInfo2 = codecInfos2[i12];
                if (p013kotlin.jvm.internal.s.f(mediaCodecInfo2.getName(), strFindEncoderForFormat)) {
                    break;
                }
                i12++;
            }
            MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo2 != null ? mediaCodecInfo2.getCapabilitiesForType("video/avc") : null;
            if (capabilitiesForType2 == null || (iArr2 = capabilitiesForType2.colorFormats) == null) {
                iArr2 = new int[0];
            }
            if (p013kotlin.collections.n.c0(iArr, 21) && p013kotlin.collections.n.c0(iArr2, 21)) {
                this.logger.j("Using NV12 (COLOR_FormatYUV420SemiPlanar) for decoder and encoder");
                mediaFormatCreateVideoFormat.setByteBuffer("csd-0", ByteBuffer.wrap(sps));
                mediaFormatCreateVideoFormat.setByteBuffer("csd-1", ByteBuffer.wrap(pps));
                mediaFormatCreateVideoFormat.setInteger("color-format", 21);
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType("video/avc");
                this.decoder = mediaCodecCreateDecoderByType;
                if (mediaCodecCreateDecoderByType != null) {
                    mediaCodecCreateDecoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 0);
                }
                MediaCodec mediaCodec = this.decoder;
                if (mediaCodec != null) {
                    mediaCodec.start();
                }
                this.decoderInputFormat = mediaFormatCreateVideoFormat;
                this.logger.j("Decoder initialized successfully with NV12 format");
                mediaFormatCreateVideoFormat2.setInteger("bitrate", this.bitrate);
                mediaFormatCreateVideoFormat2.setInteger("frame-rate", this.fps);
                mediaFormatCreateVideoFormat2.setInteger("i-frame-interval", 1);
                mediaFormatCreateVideoFormat2.setInteger("color-format", 21);
                MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
                this.encoder = mediaCodecCreateEncoderByType;
                if (mediaCodecCreateEncoderByType != null) {
                    mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat2, (Surface) null, (MediaCrypto) null, 1);
                }
                MediaCodec mediaCodec2 = this.encoder;
                if (mediaCodec2 != null) {
                    mediaCodec2.start();
                }
                MediaCodec mediaCodec3 = this.encoder;
                this.encoderOutputFormat = mediaCodec3 != null ? mediaCodec3.getOutputFormat() : null;
                MediaCodec mediaCodec4 = this.encoder;
                MediaFormat inputFormat = mediaCodec4 != null ? mediaCodec4.getInputFormat() : null;
                int integer = (inputFormat == null || !inputFormat.containsKey("stride")) ? this.alignedWidth : inputFormat.getInteger("stride");
                this.encoderInputStride = integer;
                int iM = (inputFormat == null || !inputFormat.containsKey("slice-height")) ? m() : inputFormat.getInteger("slice-height");
                this.encoderInputSliceHeight = iM;
                this.logger.j("Encoder initialized: stride=" + this.encoderInputStride + ", sliceHeight=" + iM + " (video=" + this.videoWidth + "x" + this.videoHeight + ", aligned=" + this.alignedWidth + ")");
                this.isInitialized = true;
                return true;
            }
            com.tesla.logging.g gVar = this.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("NV12 format not supported by both decoder and encoder!");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            com.tesla.logging.g gVar2 = this.logger;
            String str = "Decoder formats: " + p013kotlin.collections.n.S0(iArr, null, null, null, 0, null, null, 63, null);
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVar2.getTag();
            String strG2 = gVar2.g(str);
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
            com.tesla.logging.g gVar3 = this.logger;
            String str2 = "Encoder formats: " + p013kotlin.collections.n.S0(iArr2, null, null, null, 0, null, null, 63, null);
            TeslaLog teslaLog3 = TeslaLog.INSTANCE;
            String tag3 = gVar3.getTag();
            String strG3 = gVar3.g(str2);
            zb0.a aVar3 = zb0.a.f128044a;
            Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
            FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry3 : mapF3.entrySet()) {
                zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
            }
            firebaseCrashlytics3.recordException(new Exception(strG3));
            TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
            vr0.a.INSTANCE.a(strG3, new Object[0]);
            throw new IllegalStateException("NV12 (COLOR_FormatYUV420SemiPlanar) required but not supported by decoder/encoder");
        } catch (Exception e11) {
            this.logger.d("Failed to initialize FrameProcessor: " + e11.getClass().getSimpleName() + ": " + e11.getMessage(), e11);
            e11.printStackTrace();
            f();
            return false;
        }
    }

    public final List<EncodedFrame> r(byte[] nalUnit, long presentationTimeUs, boolean isKeyFrame, SEIMetadataProcessed seiMetadata) {
        p013kotlin.jvm.internal.s.k(nalUnit, "nalUnit");
        p013kotlin.jvm.internal.s.k(seiMetadata, "seiMetadata");
        if (this.isInitialized) {
            this.metadataByTimestamp.put(Long.valueOf(presentationTimeUs), seiMetadata);
            this.currentSEIMetadata = seiMetadata;
            this.currentPresentationTimeUs = presentationTimeUs;
            try {
                s(nalUnit, presentationTimeUs, isKeyFrame);
                i();
                j();
                return h();
            } catch (Exception e11) {
                this.logger.d("processFrame: exception", e11);
                return p013kotlin.collections.v.m();
            }
        }
        com.tesla.logging.g gVar = this.logger;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("processFrame: not initialized");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        return p013kotlin.collections.v.m();
    }
}
