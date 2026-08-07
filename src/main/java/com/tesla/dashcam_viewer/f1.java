package com.tesla.dashcam_viewer;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import ezvcard.property.Gender;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.serialization.SerializationException;
import org.webrtc.AddIceObserver;
import org.webrtc.DataChannel;
import org.webrtc.DefaultVideoDecoderFactory;
import org.webrtc.DefaultVideoEncoderFactory;
import org.webrtc.EglBase;
import org.webrtc.IceCandidate;
import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import org.webrtc.SessionDescription;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u0010\u0010*\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u0003J'\u00105\u001a\u0012\u0012\u0004\u0012\u00020302j\b\u0012\u0004\u0012\u000203`42\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\tH\u0002¢\u0006\u0004\b7\u0010'J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u0010\u0003J\u000f\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010'J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010E\u001a\u00020\u00062\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\rH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\bG\u0010\u0010J\u0017\u0010I\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\bK\u0010\u001aJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\bL\u0010\u001aJ\u0017\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\rH\u0002¢\u0006\u0004\bN\u0010\u0010J\u001f\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010\\\u001a\n Y*\u0004\u0018\u00010X0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001b\u0010r\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001c\u0010{\u001a\b\u0012\u0004\u0012\u00020x0w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010~\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u0082\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0085\u0001\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0087\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0087\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0087\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0087\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0087\u0001R)\u0010\u0097\u0001\u001a\u0012\u0012\u0004\u0012\u00020302j\b\u0012\u0004\u0012\u000203`48\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R0\u0010\u0018\u001a\u00020\r2\u0007\u0010\u009f\u0001\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010\u009d\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0005\b£\u0001\u0010\u0010R\u0018\u0010¥\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010\u0007R\u0018\u0010©\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001¨\u0006ª\u0001"}, d2 = {"Lcom/tesla/dashcam_viewer/f1;", "Lie0/m0;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "Z", "(Landroid/content/Context;)V", "", "isBackgrounded", "s0", "(Z)V", "", "eventPath", "R", "(Ljava/lang/String;)V", "", "data", "n0", "([B)V", "l0", "([B)Z", StatusResponse.PAYLOAD, "vin", "b", "([BLjava/lang/String;)V", "config", "a", "", "time", "y0", "(J)V", "", Gender.UNKNOWN, "()I", "T", "()J", "z0", "()Z", "v0", "w0", "j0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Gender.NONE, "k0", "K", "i0", "Ljava/nio/ByteBuffer;", "byteBuffer", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", Gender.OTHER, "(Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;", "a0", "P", "Q", "Lorg/webrtc/SessionDescription;", "answer", "X", "(Lorg/webrtc/SessionDescription;)V", "Lorg/webrtc/IceCandidate;", "candidate", "Y", "(Lorg/webrtc/IceCandidate;)V", "Lcom/tesla/dashcam_viewer/f1$a;", "newState", AnalyticsAttribute.Reason, "x0", "(Lcom/tesla/dashcam_viewer/f1$a;Ljava/lang/String;)V", "c0", "Lcom/tesla/dashcam_viewer/v1;", "e0", "(Lcom/tesla/dashcam_viewer/v1;)V", "f0", "h0", "msg", "q0", "connectionId", "p0", "(Ljava/lang/String;[B)Z", "Landroid/content/Context;", "appContext", "Lcom/tesla/logging/g;", "c", "Lcom/tesla/logging/g;", "logger", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/ExecutorService;", "serialQueue", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "e", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "serialDispatcher", "Lkotlinx/coroutines/Job;", "f", "Lkotlinx/coroutines/Job;", "timer", "Lorg/webrtc/PeerConnection;", "g", "Lorg/webrtc/PeerConnection;", "peerConnection", "Lorg/webrtc/DataChannel;", "h", "Lorg/webrtc/DataChannel;", "dataChannel", "Lorg/webrtc/PeerConnectionFactory;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "V", "()Lorg/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "Lorg/webrtc/PeerConnection$RTCConfiguration;", "j", "Lorg/webrtc/PeerConnection$RTCConfiguration;", "lastRtcConfig", "", "Lcom/tesla/dashcam_viewer/w1;", "k", "Ljava/util/List;", "bufferedCandidates", "l", "Lcom/tesla/dashcam_viewer/w1;", "pendingOffer", "Lcom/tesla/dashcam_viewer/y1;", "m", "Lcom/tesla/dashcam_viewer/y1;", "statsCollector", "n", "Lcom/tesla/dashcam_viewer/f1$a;", "currentState", "o", "J", "lastOfferGenTime", "p", "lastOfferSentTime", "q", "handshakeStartTime", "r", "lastPingTime", "s", "lastDataLimitReachedTime", "t", "lastStatsCheck", "u", "lastSendTime", "v", "Ljava/util/ArrayList;", "pendingPacket", "Ljn0/a0;", "w", "I", "pendingPacketTargetSize", "x", "Ljava/lang/String;", "sessionID", "value", "y", "W", "()Ljava/lang/String;", "u0", "z", "appInBackground", "Lwo0/b;", "A", "Lwo0/b;", "flexibleJson", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f1 implements ie0.m0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final wo0.b flexibleJson;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Context appContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final ExecutorService serialQueue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ExecutorCoroutineDispatcher serialDispatcher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static Job timer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static PeerConnection peerConnection;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static DataChannel dataChannel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final Lazy peerConnectionFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static PeerConnection.RTCConfiguration lastRtcConfig;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static List<WebRTCUniversalPayload> bufferedCandidates;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static WebRTCUniversalPayload pendingOffer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static y1 statsCollector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static a currentState;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static long lastOfferGenTime;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static long lastOfferSentTime;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static long handshakeStartTime;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static long lastPingTime;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static long lastDataLimitReachedTime;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static long lastStatsCheck;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static long lastSendTime;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static ArrayList<Byte> pendingPacket;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static int pendingPacketTargetSize;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static String sessionID;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static String vin;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static boolean appInBackground;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f55840a = new f1();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("DashcamViewer_WebRTC");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/dashcam_viewer/f1$a;", "", "<init>", "(Ljava/lang/String;I)V", "WAITING", "HANDSHAKING", "CONNECTED", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        WAITING,
        HANDSHAKING,
        CONNECTED;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55866a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.HANDSHAKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55866a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/tesla/dashcam_viewer/f1$c", "Lcom/tesla/dashcam_viewer/b;", "", AnalyticsAttribute.Error, "Ljn0/h0;", "onCreateFailure", "(Ljava/lang/String;)V", "Lorg/webrtc/SessionDescription;", "sdp", "onCreateSuccess", "(Lorg/webrtc/SessionDescription;)V", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.tesla.dashcam_viewer.b {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/tesla/dashcam_viewer/f1$c$a", "Lcom/tesla/dashcam_viewer/b;", "", AnalyticsAttribute.Error, "Ljn0/h0;", "onSetFailure", "(Ljava/lang/String;)V", "onSetSuccess", "()V", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.tesla.dashcam_viewer.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SessionDescription f55867a;

            a(SessionDescription sessionDescription) {
                this.f55867a = sessionDescription;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final void b(SessionDescription sessionDescription) {
                WebRTCUniversalSessionDescription x1Var = new WebRTCUniversalSessionDescription("offer", sessionDescription.description, (String) null, (Integer) null, (String) null, 28, (DefaultConstructorMarker) null);
                f1 f1Var = f1.f55840a;
                WebRTCUniversalPayload w1Var = new WebRTCUniversalPayload("webrtc:signal", f1.sessionID, (Integer) 3, x1Var, Integer.valueOf(f1Var.U()), (Boolean) null, (Boolean) (null == true ? 1 : 0), (String) (null == true ? 1 : 0), 224, (DefaultConstructorMarker) null);
                f1.lastOfferSentTime = f1Var.T();
                f1.pendingOffer = w1Var;
                try {
                    wo0.b.Companion companion = wo0.b.INSTANCE;
                    companion.getSerializersModule();
                    String strB = companion.b(WebRTCUniversalPayload.INSTANCE.serializer(), w1Var);
                    f1.logger.j("generated new offer and sent, sessionID: " + f1.sessionID);
                    f1Var.q0(strB);
                } catch (SerializationException e11) {
                    com.tesla.logging.g gVar = f1.logger;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g("error sending offer: " + e11);
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                }
            }

            @Override // com.tesla.dashcam_viewer.b, org.webrtc.SdpObserver
            public void onSetFailure(String error) {
                super.onSetFailure(error);
                com.tesla.logging.g gVar = f1.logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("error setting local description: " + error);
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                PeerConnection peerConnection = f1.peerConnection;
                if (peerConnection != null) {
                    peerConnection.close();
                }
                f1.peerConnection = null;
            }

            @Override // com.tesla.dashcam_viewer.b, org.webrtc.SdpObserver
            public void onSetSuccess() {
                super.onSetSuccess();
                ExecutorService executorService = f1.serialQueue;
                final SessionDescription sessionDescription = this.f55867a;
                executorService.submit(new Runnable() { // from class: com.tesla.dashcam_viewer.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        f1.c.a.b(sessionDescription);
                    }
                });
            }
        }

        c() {
        }

        @Override // com.tesla.dashcam_viewer.b, org.webrtc.SdpObserver
        public void onCreateFailure(String error) {
            super.onCreateFailure(error);
            com.tesla.logging.g gVar = f1.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("error creating offer sdp: " + error);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }

        @Override // com.tesla.dashcam_viewer.b, org.webrtc.SdpObserver
        public void onCreateSuccess(SessionDescription sdp) {
            super.onCreateSuccess(sdp);
            if (sdp != null) {
                f1.logger.j("setting local description: " + sdp);
                PeerConnection peerConnection = f1.peerConnection;
                if (peerConnection != null) {
                    peerConnection.setLocalDescription(new a(sdp), sdp);
                    return;
                }
                return;
            }
            com.tesla.logging.g gVar = f1.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("failed to get offer sdp");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/tesla/dashcam_viewer/f1$d", "Lorg/webrtc/DataChannel$Observer;", "Ljn0/h0;", "onStateChange", "()V", "Lorg/webrtc/DataChannel$Buffer;", "buffer", "onMessage", "(Lorg/webrtc/DataChannel$Buffer;)V", "", "p0", "onBufferedAmountChange", "(J)V", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements DataChannel.Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataChannel f55868a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f55869a;

            static {
                int[] iArr = new int[DataChannel.State.values().length];
                try {
                    iArr[DataChannel.State.CONNECTING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DataChannel.State.OPEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DataChannel.State.CLOSING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DataChannel.State.CLOSED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f55869a = iArr;
            }
        }

        d(DataChannel dataChannel) {
            this.f55868a = dataChannel;
        }

        @Override // org.webrtc.DataChannel.Observer
        public void onBufferedAmountChange(long p11) {
        }

        @Override // org.webrtc.DataChannel.Observer
        public void onMessage(DataChannel.Buffer buffer) {
            int iMin;
            p013kotlin.jvm.internal.s.k(buffer, "buffer");
            f1 f1Var = f1.f55840a;
            if (f1Var.z0()) {
                com.tesla.logging.g gVar = f1.logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("data channel onMessage: VIN mismatch");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                return;
            }
            f1.statsCollector.e();
            ByteBuffer data = buffer.data;
            p013kotlin.jvm.internal.s.j(data, "data");
            ArrayList arrayListO = f1Var.O(data);
            if (arrayListO.size() <= 37) {
                com.tesla.logging.g gVar2 = f1.logger;
                String str = "unexpected small payload: " + arrayListO.size();
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
                return;
            }
            int i11 = 36;
            List listSubList = arrayListO.subList(36, arrayListO.size());
            p013kotlin.jvm.internal.s.j(listSubList, "subList(...)");
            if (listSubList.size() == 4 && p013kotlin.jvm.internal.s.f(listSubList, p013kotlin.collections.v.p((byte) 18, (byte) 52, (byte) 86, (byte) 120))) {
                f1.logger.j("received special close packet");
                return;
            }
            if (listSubList.size() >= 5 && p013kotlin.jvm.internal.s.f(listSubList.subList(0, 5), p013kotlin.collections.v.p((byte) 112, (byte) 111, (byte) 110, (byte) 103, (byte) 58))) {
                long jT = f1Var.T();
                if (f1.lastPingTime <= 0) {
                    f1.logger.j("received pong! (no ping sent)");
                    return;
                }
                double d11 = (jT - f1.lastPingTime) / ((double) 1000000);
                f1.logger.j("received pong! " + d11 + " ms since last sent ping.");
                f1.lastPingTime = 0L;
                return;
            }
            while (i11 < arrayListO.size()) {
                if (f1.pendingPacket.size() > 5000000) {
                    f1.logger.n("pending packet size exceed max size. clearing");
                    f1.f55840a.i0();
                    return;
                }
                if (f1.pendingPacketTargetSize == 0) {
                    iMin = Math.min(9 - f1.pendingPacket.size(), arrayListO.size() - i11) + i11;
                    f1.pendingPacket.addAll(arrayListO.subList(i11, iMin));
                    if (f1.pendingPacket.size() != 9) {
                        continue;
                    } else {
                        if (!o.c(f1.pendingPacket)) {
                            f1.logger.n("invalid nal start code, dropping packet");
                            f1.f55840a.i0();
                            return;
                        }
                        f1.pendingPacketTargetSize = jn0.a0.b(o.e(f1.pendingPacket, 5, 9) + 9);
                    }
                } else {
                    iMin = Math.min(f1.pendingPacketTargetSize - f1.pendingPacket.size(), arrayListO.size() - i11) + i11;
                    f1.pendingPacket.addAll(arrayListO.subList(i11, iMin));
                    if (f1.pendingPacket.size() == f1.pendingPacketTargetSize) {
                        if (f1.pendingPacket.size() < 9) {
                            f1.logger.j("pending packet size too small, dropping");
                            f1.f55840a.i0();
                        } else {
                            o1.f55932a.o(f1.pendingPacket);
                            f1.f55840a.i0();
                        }
                    }
                }
                i11 = iMin;
            }
        }

        @Override // org.webrtc.DataChannel.Observer
        public void onStateChange() {
            DataChannel.State state = this.f55868a.state();
            int i11 = state == null ? -1 : a.f55869a[state.ordinal()];
            if (i11 == 1) {
                f1.logger.j("Data Channel state: connecting");
                return;
            }
            if (i11 == 2) {
                f1.statsCollector.d();
                f1.logger.j("Data Channel state: open");
                o1.f55932a.c();
                RNH264Stream.INSTANCE.setDashcamViewerStatus(n.CONNECTED_LOADING);
                f1 f1Var = f1.f55840a;
                byte[] bytes = "list_events\nlist_photobooth_metadata\n".getBytes(p013kotlin.text.d.UTF_8);
                p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
                f1Var.n0(bytes);
                return;
            }
            if (i11 == 3) {
                f1.logger.j("Data Channel state: closing");
                return;
            }
            if (i11 == 4) {
                f1.statsCollector.f();
                f1.logger.j("Data Channel state: closed");
                return;
            }
            com.tesla.logging.g gVar = f1.logger;
            String str = "Data Channel state: unknown - " + this.f55868a.state();
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
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/tesla/dashcam_viewer/f1$e", "Lcom/tesla/dashcam_viewer/a;", "Lorg/webrtc/PeerConnection$SignalingState;", "newState", "Ljn0/h0;", "onSignalingChange", "(Lorg/webrtc/PeerConnection$SignalingState;)V", "Lorg/webrtc/PeerConnection$IceConnectionState;", "onIceConnectionChange", "(Lorg/webrtc/PeerConnection$IceConnectionState;)V", "Lorg/webrtc/PeerConnection$PeerConnectionState;", "onConnectionChange", "(Lorg/webrtc/PeerConnection$PeerConnectionState;)V", "Lorg/webrtc/IceCandidate;", "candidate", "onIceCandidate", "(Lorg/webrtc/IceCandidate;)V", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends com.tesla.dashcam_viewer.a {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f55870a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.WAITING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.HANDSHAKING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.CONNECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f55870a = iArr;
            }
        }

        e() {
        }

        @Override // com.tesla.dashcam_viewer.a, org.webrtc.PeerConnection.Observer
        public void onConnectionChange(PeerConnection.PeerConnectionState newState) {
            p013kotlin.jvm.internal.s.k(newState, "newState");
            super.onConnectionChange(newState);
            f1.logger.j("onConnectionChange newState: " + newState);
        }

        @Override // com.tesla.dashcam_viewer.a, org.webrtc.PeerConnection.Observer
        public void onIceCandidate(IceCandidate candidate) {
            p013kotlin.jvm.internal.s.k(candidate, "candidate");
            super.onIceCandidate(candidate);
            f1.logger.j("Generated ICE Candidate: " + candidate.sdp);
            WebRTCUniversalSessionDescription x1Var = new WebRTCUniversalSessionDescription((String) null, (String) null, candidate.sdp, Integer.valueOf(candidate.sdpMLineIndex), (String) null, 19, (DefaultConstructorMarker) null);
            String str = candidate.sdpMid;
            if (str != null) {
                x1Var.f(str);
            }
            f1 f1Var = f1.f55840a;
            WebRTCUniversalPayload w1Var = new WebRTCUniversalPayload("webrtc:signal", f1.sessionID, (Integer) 7, x1Var, Integer.valueOf(f1Var.U()), (Boolean) null, (Boolean) null, (String) null, 224, (DefaultConstructorMarker) null);
            int i11 = a.f55870a[f1.currentState.ordinal()];
            if (i11 == 1) {
                f1.bufferedCandidates.add(w1Var);
                return;
            }
            if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                f1.logger.j("sending candidate");
                wo0.b.Companion companion = wo0.b.INSTANCE;
                companion.getSerializersModule();
                f1Var.q0(companion.b(WebRTCUniversalPayload.INSTANCE.serializer(), w1Var));
            } catch (SerializationException e11) {
                com.tesla.logging.g gVar = f1.logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("error sending candidate: " + e11);
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
            }
        }

        @Override // com.tesla.dashcam_viewer.a, org.webrtc.PeerConnection.Observer
        public void onIceConnectionChange(PeerConnection.IceConnectionState newState) {
            p013kotlin.jvm.internal.s.k(newState, "newState");
            super.onIceConnectionChange(newState);
            f1.logger.j("onIceConnectionChange newState: " + newState);
        }

        @Override // com.tesla.dashcam_viewer.a, org.webrtc.PeerConnection.Observer
        public void onSignalingChange(PeerConnection.SignalingState newState) {
            p013kotlin.jvm.internal.s.k(newState, "newState");
            super.onSignalingChange(newState);
            f1.logger.j("onSignalingChange newState: " + newState);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/tesla/dashcam_viewer/f1$f", "Lcom/tesla/dashcam_viewer/b;", "", AnalyticsAttribute.Error, "Ljn0/h0;", "onSetFailure", "(Ljava/lang/String;)V", "onSetSuccess", "()V", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends com.tesla.dashcam_viewer.b {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b() {
            f1.f55840a.x0(a.WAITING, "error setting remote description");
        }

        @Override // com.tesla.dashcam_viewer.b, org.webrtc.SdpObserver
        public void onSetFailure(String error) {
            super.onSetFailure(error);
            com.tesla.logging.g gVar = f1.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("failed to set remote answer: " + error);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            f1.serialQueue.execute(new Runnable() { // from class: com.tesla.dashcam_viewer.h1
                @Override // java.lang.Runnable
                public final void run() {
                    f1.f.b();
                }
            });
        }

        @Override // com.tesla.dashcam_viewer.b, org.webrtc.SdpObserver
        public void onSetSuccess() {
            super.onSetSuccess();
            f1.logger.j("remote answer onSetSuccess");
            f1.f55840a.x0(a.HANDSHAKING, "received answer");
            f1.logger.j("sending buffered candidates, count: " + f1.bufferedCandidates.size() + " ");
            for (WebRTCUniversalPayload w1Var : f1.bufferedCandidates) {
                try {
                    wo0.b.Companion companion = wo0.b.INSTANCE;
                    companion.getSerializersModule();
                    f1.f55840a.q0(companion.b(WebRTCUniversalPayload.INSTANCE.serializer(), w1Var));
                } catch (SerializationException e11) {
                    com.tesla.logging.g gVar = f1.logger;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g("error sending buffered candidate: " + e11);
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                }
            }
            f1.bufferedCandidates.clear();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/tesla/dashcam_viewer/f1$g", "Lorg/webrtc/AddIceObserver;", "", AnalyticsAttribute.Error, "Ljn0/h0;", "onAddFailure", "(Ljava/lang/String;)V", "onAddSuccess", "()V", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g implements AddIceObserver {
        g() {
        }

        @Override // org.webrtc.AddIceObserver
        public void onAddFailure(String error) {
            com.tesla.logging.g gVar = f1.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("failed to add ice candidate: " + error);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }

        @Override // org.webrtc.AddIceObserver
        public void onAddSuccess() {
            f1.logger.j("add ice candidate success");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.SelectedCarWebrtc$run1Hz$2", f = "SelectedCarWebrtc.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55871n;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f55871n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            f1.f55840a.k0();
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.SelectedCarWebrtc$startTimer$1", f = "SelectedCarWebrtc.kt", i = {0, 1}, l = {179, 180}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    static final class i extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55872n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f55873o;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            i iVar = new i(continuation);
            iVar.f55873o = obj;
            return iVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0034  */
        /* JADX WARN: Code duplicated, block: B:17:0x0041  */
        /* JADX WARN: Code duplicated, block: B:21:0x004f  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(1000, r6) == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f55872n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r6.f55873o
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                jn0.t.b(r7)
            L15:
                r7 = r1
                goto L2e
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                java.lang.Object r1 = r6.f55873o
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                jn0.t.b(r7)
                goto L42
            L27:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f55873o
                kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            L2e:
                boolean r1 = kotlinx.coroutines.CoroutineScopeKt.isActive(r7)
                if (r1 == 0) goto L4f
                com.tesla.dashcam_viewer.f1 r1 = com.tesla.dashcam_viewer.f1.f55840a
                r6.f55873o = r7
                r6.f55872n = r3
                java.lang.Object r1 = com.tesla.dashcam_viewer.f1.A(r1, r6)
                if (r1 != r0) goto L41
                goto L4e
            L41:
                r1 = r7
            L42:
                r6.f55873o = r1
                r6.f55872n = r2
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r7 != r0) goto L15
            L4e:
                return r0
            L4f:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.dashcam_viewer.f1.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static {
        ExecutorService serialQueue2 = Executors.newSingleThreadExecutor();
        serialQueue = serialQueue2;
        p013kotlin.jvm.internal.s.j(serialQueue2, "serialQueue");
        serialDispatcher = ExecutorsKt.from(serialQueue2);
        peerConnectionFactory = jn0.m.b(new wn0.a() { // from class: com.tesla.dashcam_viewer.v0
            @Override // wn0.a
            public final Object invoke() {
                return f1.b0();
            }
        });
        bufferedCandidates = new ArrayList();
        statsCollector = new y1(0, 1, null);
        currentState = a.WAITING;
        pendingPacket = new ArrayList<>(4096);
        sessionID = "";
        vin = "";
        flexibleJson = wo0.u.b(null, new wn0.l() { // from class: com.tesla.dashcam_viewer.w0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return f1.S((wo0.d) obj);
            }
        }, 1, null);
    }

    private f1() {
    }

    private final void K() {
        if (peerConnection == null) {
            logger.j("skip checkStats, no peer connection");
            return;
        }
        if (T() - lastStatsCheck < 2000000000) {
            return;
        }
        final String str = sessionID;
        if (str.length() == 0) {
            logger.j("skip checkStats, no sessionID");
            return;
        }
        lastStatsCheck = T();
        PeerConnection peerConnection2 = peerConnection;
        if (peerConnection2 != null) {
            peerConnection2.getStats(new RTCStatsCollectorCallback() { // from class: com.tesla.dashcam_viewer.d1
                @Override // org.webrtc.RTCStatsCollectorCallback
                public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                    f1.L(str, rTCStatsReport);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(final String str, RTCStatsReport report) {
        Map<String, Object> members;
        Map<String, Object> members2;
        p013kotlin.jvm.internal.s.k(report, "report");
        for (final RTCStats rTCStats : report.getStatsMap().values()) {
            if (p013kotlin.jvm.internal.s.f(rTCStats.getType(), "candidate-pair")) {
                Map<String, Object> members3 = rTCStats.getMembers();
                if (p013kotlin.jvm.internal.s.f(members3.get("state"), "succeeded")) {
                    Object obj = members3.get("currentRoundTripTime");
                    final Double d11 = obj instanceof Double ? (Double) obj : null;
                    Object obj2 = members3.get("bytesReceived");
                    final BigInteger bigInteger = obj2 instanceof BigInteger ? (BigInteger) obj2 : null;
                    Object obj3 = members3.get("bytesSent");
                    final BigInteger bigInteger2 = obj3 instanceof BigInteger ? (BigInteger) obj3 : null;
                    Object obj4 = members3.get("localCandidateId");
                    String str2 = obj4 instanceof String ? (String) obj4 : null;
                    Object obj5 = members3.get("remoteCandidateId");
                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                    RTCStats rTCStats2 = report.getStatsMap().get(str2);
                    RTCStats rTCStats3 = report.getStatsMap().get(str3);
                    Object obj6 = (rTCStats2 == null || (members2 = rTCStats2.getMembers()) == null) ? null : members2.get("candidateType");
                    String str4 = obj6 instanceof String ? (String) obj6 : null;
                    Object obj7 = (rTCStats3 == null || (members = rTCStats3.getMembers()) == null) ? null : members.get("candidateType");
                    final String str5 = obj7 instanceof String ? (String) obj7 : null;
                    Object obj8 = members3.get("responsesReceived");
                    BigInteger bigInteger3 = obj8 instanceof BigInteger ? (BigInteger) obj8 : null;
                    Object obj9 = members3.get("totalRoundTripTime");
                    final Double d12 = obj9 instanceof Double ? (Double) obj9 : null;
                    if (d11 != null && bigInteger != null && bigInteger2 != null && str2 != null && str3 != null && str4 != null && str5 != null && bigInteger3 != null && d12 != null) {
                        final BigInteger bigInteger4 = bigInteger3;
                        final String str6 = str4;
                        serialQueue.execute(new Runnable() { // from class: com.tesla.dashcam_viewer.e1
                            @Override // java.lang.Runnable
                            public final void run() {
                                f1.M(str, rTCStats, d12, bigInteger4, d11, bigInteger2, bigInteger, str6, str5);
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(String str, RTCStats rTCStats, Double d11, BigInteger bigInteger, Double d12, BigInteger bigInteger2, BigInteger bigInteger3, String str2, String str3) {
        if (!p013kotlin.jvm.internal.s.f(str, sessionID)) {
            logger.j("skip checkStats, sessionID changed");
            return;
        }
        y1 y1Var = statsCollector;
        String id2 = rTCStats.getId();
        p013kotlin.jvm.internal.s.j(id2, "getId(...)");
        y1Var.a(id2, d11.doubleValue(), bigInteger.intValue(), d12.doubleValue(), bigInteger2.longValue(), bigInteger3.longValue(), str2, str3);
    }

    private final void N() {
        statsCollector.f();
        DataChannel dataChannel2 = dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.close();
        }
        dataChannel = null;
        PeerConnection peerConnection2 = peerConnection;
        if (peerConnection2 != null) {
            peerConnection2.close();
        }
        peerConnection = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<Byte> O(ByteBuffer byteBuffer) {
        ArrayList<Byte> arrayList = new ArrayList<>(byteBuffer.remaining());
        while (byteBuffer.hasRemaining()) {
            arrayList.add(Byte.valueOf(byteBuffer.get()));
        }
        return arrayList;
    }

    private final void P() {
        pendingOffer = null;
        N();
        sessionID = "";
        if (!Q()) {
            logger.j("Failed to create PeerConnection & DataChannel");
            return;
        }
        String string = UUID.randomUUID().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        sessionID = lowerCase;
        logger.j("created sessionID: " + lowerCase);
        bufferedCandidates.clear();
        MediaConstraints mediaConstraints = new MediaConstraints();
        PeerConnection peerConnection2 = peerConnection;
        if (peerConnection2 != null) {
            peerConnection2.createOffer(new c(), mediaConstraints);
        }
    }

    private final boolean Q() {
        com.tesla.logging.g gVar = logger;
        gVar.j("start creating peer connection and data channel");
        if (lastRtcConfig == null) {
            gVar.j("failed to create peer connection, no rtc config");
            return false;
        }
        PeerConnection peerConnectionCreatePeerConnection = V().createPeerConnection(lastRtcConfig, new e());
        if (peerConnectionCreatePeerConnection == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Failed to created peer connection");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return false;
        }
        gVar.j("create peerConnection success: " + peerConnectionCreatePeerConnection);
        peerConnection = peerConnectionCreatePeerConnection;
        DataChannel.Init init = new DataChannel.Init();
        init.ordered = true;
        DataChannel dataChannelCreateDataChannel = peerConnectionCreatePeerConnection.createDataChannel("ordered", init);
        if (dataChannelCreateDataChannel != null) {
            dataChannelCreateDataChannel.registerObserver(new d(dataChannelCreateDataChannel));
            gVar.j("create dataChannel success: " + dataChannelCreateDataChannel);
            dataChannel = dataChannelCreateDataChannel;
            gVar.j("create peerConnection & dataChannel success, pc: " + peerConnection + ", dc: " + dataChannelCreateDataChannel);
            return true;
        }
        TeslaLog teslaLog2 = TeslaLog.INSTANCE;
        String tag2 = gVar.getTag();
        String strG2 = gVar.g("Failed to created data channel");
        zb0.a aVar2 = zb0.a.f128044a;
        Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
        FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry2 : mapF2.entrySet()) {
            zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
        }
        firebaseCrashlytics2.recordException(new Exception(strG2));
        TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
        vr0.a.INSTANCE.a(strG2, new Object[0]);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 S(wo0.d Json) {
        p013kotlin.jvm.internal.s.k(Json, "$this$Json");
        Json.h(true);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long T() {
        return System.nanoTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int U() {
        return x.f56132a.c() ? 3 : 2;
    }

    private final PeerConnectionFactory V() {
        Object value = peerConnectionFactory.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (PeerConnectionFactory) value;
    }

    private final void X(SessionDescription answer) {
        if (currentState != a.WAITING) {
            com.tesla.logging.g gVar = logger;
            String str = "Received answer in invalid state: " + currentState + ")";
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
            return;
        }
        PeerConnection peerConnection2 = peerConnection;
        if (peerConnection2 != null) {
            if (peerConnection2 != null) {
                peerConnection2.setRemoteDescription(new f(), answer);
                return;
            }
            return;
        }
        com.tesla.logging.g gVar2 = logger;
        String str2 = "Received answer with no peer connection in state: " + currentState;
        TeslaLog teslaLog2 = TeslaLog.INSTANCE;
        String tag2 = gVar2.getTag();
        String strG2 = gVar2.g(str2);
        zb0.a aVar2 = zb0.a.f128044a;
        Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
        FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry2 : mapF2.entrySet()) {
            zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
        }
        firebaseCrashlytics2.recordException(new Exception(strG2));
        TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
        vr0.a.INSTANCE.a(strG2, new Object[0]);
    }

    private final void Y(IceCandidate candidate) {
        PeerConnection peerConnection2 = peerConnection;
        if (peerConnection2 != null) {
            if (peerConnection2 != null) {
                peerConnection2.addIceCandidate(candidate, new g());
                return;
            }
            return;
        }
        com.tesla.logging.g gVar = logger;
        String str = "Received candidate with no peer connection in state: " + currentState;
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
    }

    private final boolean a0() {
        if (z0()) {
            return false;
        }
        PeerConnection peerConnection2 = peerConnection;
        if ((peerConnection2 != null ? peerConnection2.connectionState() : null) == PeerConnection.PeerConnectionState.CONNECTED) {
            DataChannel dataChannel2 = dataChannel;
            if ((dataChannel2 != null ? dataChannel2.state() : null) == DataChannel.State.OPEN) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PeerConnectionFactory b0() {
        Context context = appContext;
        if (context == null) {
            p013kotlin.jvm.internal.s.B("appContext");
            context = null;
        }
        PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(context).setEnableInternalTracer(true).createInitializationOptions());
        PeerConnectionFactory.Options options = new PeerConnectionFactory.Options();
        DefaultVideoEncoderFactory defaultVideoEncoderFactory = new DefaultVideoEncoderFactory(EglBase.create().getEglBaseContext(), true, true);
        return PeerConnectionFactory.builder().setOptions(options).setVideoEncoderFactory(defaultVideoEncoderFactory).setVideoDecoderFactory(new DefaultVideoDecoderFactory(EglBase.create().getEglBaseContext())).createPeerConnectionFactory();
    }

    private final void c0(String config) {
        logger.j("receiveIceConfig config: " + config);
        try {
            wo0.b bVar = flexibleJson;
            bVar.getSerializersModule();
            final WebRTCConfiguration v1Var = (WebRTCConfiguration) bVar.d(WebRTCConfiguration.INSTANCE.serializer(), config);
            serialQueue.submit(new Runnable() { // from class: com.tesla.dashcam_viewer.a1
                @Override // java.lang.Runnable
                public final void run() {
                    f1.d0(v1Var);
                }
            });
        } catch (SerializationException e11) {
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("error decoding ice config: " + e11);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(WebRTCConfiguration v1Var) {
        f55840a.e0(v1Var);
    }

    private final void e0(WebRTCConfiguration config) {
        com.tesla.logging.g gVar = logger;
        gVar.j("receiveIceConfigNotLocked, config: " + config);
        List<IceServerConfig> listB = config.b();
        if (listB == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Failed to get ice_servers from config");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IceServerConfig wVar : listB) {
            List<String> listC = wVar.c();
            if (listC != null) {
                PeerConnection.IceServer iceServerCreateIceServer = PeerConnection.IceServer.builder(listC).setUsername(wVar.getUsername()).setPassword(wVar.getCredential()).createIceServer();
                p013kotlin.jvm.internal.s.h(iceServerCreateIceServer);
                arrayList.add(iceServerCreateIceServer);
            }
        }
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        lastRtcConfig = rTCConfiguration;
        logger.j("created webrtc config: " + rTCConfiguration + " with " + arrayList.size() + " servers");
    }

    private final void f0(final byte[] payload, final String vin2) {
        serialQueue.submit(new Runnable() { // from class: com.tesla.dashcam_viewer.b1
            @Override // java.lang.Runnable
            public final void run() {
                f1.g0(payload, vin2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(byte[] bArr, String str) {
        f55840a.h0(bArr, str);
    }

    private final void h0(byte[] payload, String vin2) {
        WebRTCUniversalPayload w1Var;
        if (z0()) {
            logger.n("VIN mismatch in webrtc handshake");
            return;
        }
        if (lastRtcConfig == null) {
            logger.j("ignore webrtc handshake, no config yet");
            return;
        }
        String str = new String(payload, p013kotlin.text.d.UTF_8);
        logger.a("received message: " + str);
        try {
            wo0.b bVar = flexibleJson;
            bVar.getSerializersModule();
            w1Var = (WebRTCUniversalPayload) bVar.d(WebRTCUniversalPayload.INSTANCE.serializer(), str);
        } catch (SerializationException e11) {
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("error decoding webrtc payload: " + e11);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            w1Var = null;
        }
        if (w1Var == null) {
            com.tesla.logging.g gVar2 = logger;
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVar2.getTag();
            String strG2 = gVar2.g("failed to decode webrtc payload, msg is null");
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
            return;
        }
        if (p013kotlin.jvm.internal.s.f(w1Var.getMsg_type(), "dashcam")) {
            Boolean boolA = w1Var.getData_limit_reached();
            Boolean bool = Boolean.TRUE;
            if (p013kotlin.jvm.internal.s.f(boolA, bool)) {
                RNH264Stream.INSTANCE.setDashcamViewerStatus(n.DATA_LIMIT_REACHED);
                lastDataLimitReachedTime = T();
                return;
            }
            if (p013kotlin.jvm.internal.s.f(w1Var.getRejected(), bool)) {
                String strC = w1Var.getReason();
                if (strC != null) {
                    n nVarA = n.INSTANCE.a(strC);
                    if (nVarA == null) {
                        RNH264Stream.INSTANCE.setDashcamViewerStatus(n.UNKNOWN_ERROR);
                        return;
                    }
                    if (nVarA == n.DATA_LIMIT_REACHED) {
                        lastDataLimitReachedTime = T();
                    }
                    RNH264Stream.INSTANCE.setDashcamViewerStatus(nVarA);
                    return;
                }
                return;
            }
        }
        String strB = w1Var.getMsg_type();
        WebRTCUniversalSessionDescription x1VarE = w1Var.getSession_description();
        if (p013kotlin.jvm.internal.s.f(strB, "webrtc:signal_response")) {
            String strE = x1VarE != null ? x1VarE.getType() : null;
            if (strE == null) {
                if ((x1VarE != null ? x1VarE.getCandidate() : null) != null) {
                    strE = "candidate";
                }
            }
            if (p013kotlin.jvm.internal.s.f(strE, "answer")) {
                String strB2 = x1VarE != null ? x1VarE.getSdp() : null;
                if (strB2 == null) {
                    logger.j("unable to parse received answer");
                    return;
                } else {
                    logger.j("received answer");
                    X(new SessionDescription(SessionDescription.Type.ANSWER, strB2));
                    return;
                }
            }
            if (p013kotlin.jvm.internal.s.f(strE, "candidate")) {
                String strA = x1VarE != null ? x1VarE.getCandidate() : null;
                String strD = x1VarE != null ? x1VarE.getSdpMid() : null;
                Integer numC = x1VarE != null ? x1VarE.getSdpMLineIndex() : null;
                if (strA == null || strD == null || numC == null) {
                    logger.j("unable to parse received candidate");
                } else {
                    logger.j("received candidate");
                    Y(new IceCandidate(strD, numC.intValue(), strA));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        pendingPacket.clear();
        pendingPacketTargetSize = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j0(Continuation<? super jn0.h0> continuation) {
        if (currentState == a.WAITING) {
            if (lastSendTime <= 0) {
                logger.j("haven't sent a message, stopTimer");
                w0();
                return jn0.h0.f84049a;
            }
            if (T() - lastSendTime >= 60000000000L) {
                logger.j("haven't sent a message recently, stopTimer");
                w0();
                return jn0.h0.f84049a;
            }
        }
        Object objWithContext = BuildersKt.withContext(serialDispatcher, new h(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        a aVar = currentState;
        a aVar2 = a.WAITING;
        if (aVar == aVar2 && lastDataLimitReachedTime > 0 && T() - lastDataLimitReachedTime < 300000000000L) {
            RNH264Stream.INSTANCE.setDashcamViewerStatus(n.DATA_LIMIT_REACHED);
            logger.j("skip runStateMachine, data limit reached");
            return;
        }
        String str = (String) p013kotlin.collections.v.q0(qb0.a.INSTANCE.b().w());
        if (str == null) {
            logger.j("skip runStateMachine, no selected VIN");
            N();
            return;
        }
        if (!p013kotlin.jvm.internal.s.f(vin, str) && vin.length() > 0) {
            com.tesla.logging.g gVar = logger;
            gVar.j("VIN has changed from " + vin + " to " + str);
            N();
            gVar.j("Transitioning from " + currentState + " to waiting");
            currentState = aVar2;
            lastPingTime = 0L;
            bufferedCandidates.clear();
            handshakeStartTime = 0L;
            lastOfferGenTime = 0L;
            lastOfferSentTime = 0L;
            sessionID = "";
            lastDataLimitReachedTime = 0L;
            lastStatsCheck = 0L;
            statsCollector.i();
        }
        u0(str);
        int i11 = b.f55866a[currentState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                if (T() - handshakeStartTime >= 20000000000L) {
                    x0(aVar2, "handshake timed out");
                    return;
                } else {
                    if (a0()) {
                        x0(a.CONNECTED, "connected");
                        return;
                    }
                    return;
                }
            }
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            K();
            if (appInBackground) {
                x0(aVar2, "app in background");
                return;
            } else {
                if (a0()) {
                    return;
                }
                x0(aVar2, "disconnected");
                return;
            }
        }
        if (appInBackground || lastRtcConfig == null || lastSendTime <= 0) {
            logger.j("skip runStateMachine, app in background or no rtc config");
            N();
            return;
        }
        if (T() - lastSendTime >= 60000000000L) {
            logger.j("skip runStateMachine, no data sent in a while");
            N();
            return;
        }
        if (T() - lastOfferGenTime >= 20000000000L) {
            RNH264Stream.INSTANCE.setDashcamViewerStatus(n.CONNECTING);
            statsCollector.g();
            P();
            lastOfferGenTime = T();
            return;
        }
        if (pendingOffer == null || T() - lastOfferSentTime < 7000000000L) {
            return;
        }
        try {
            logger.j("resending offer");
            wo0.b.Companion companion = wo0.b.INSTANCE;
            WebRTCUniversalPayload w1Var = pendingOffer;
            companion.getSerializersModule();
            q0(companion.b(so0.a.p(WebRTCUniversalPayload.INSTANCE.serializer()), w1Var));
            lastOfferSentTime = T();
        } catch (SerializationException e11) {
            com.tesla.logging.g gVar2 = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar2.getTag();
            String strG = gVar2.g("error resending offer: " + e11);
            zb0.a aVar3 = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean m0(byte[] bArr) {
        return Boolean.valueOf(f55840a.p0(sessionID, bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(byte[] bArr) {
        logger.j("sendDataOverWebRTCAsync data: " + new String(bArr, p013kotlin.text.d.UTF_8));
        f55840a.p0(sessionID, bArr);
    }

    private final boolean p0(String connectionId, byte[] data) {
        y0(System.nanoTime());
        byte[] bytes = connectionId.getBytes(p013kotlin.text.d.UTF_8);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        if (connectionId.length() == 36 && bytes.length == 36) {
            if (!z0()) {
                DataChannel.Buffer buffer = new DataChannel.Buffer(ByteBuffer.wrap(p013kotlin.collections.n.G(bytes, data)), true);
                DataChannel dataChannel2 = dataChannel;
                if (dataChannel2 != null) {
                    return dataChannel2.send(buffer);
                }
                return false;
            }
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("VIN mismatch during send");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return false;
        }
        com.tesla.logging.g gVar2 = logger;
        String str = "Unable to convert UUID string to Data, connection: " + connectionId + " length: " + connectionId.length() + ", uuidBytes: " + bytes + " count: " + bytes.length;
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
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(String msg) {
        Context context = null;
        if (z0()) {
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("VIN mismatch during signaling send");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        final ic0.e eVarC0 = ob0.e.f97095a.c0(vin, ic0.f.SOURCE_APP_NATIVE, okio.k.INSTANCE.f(msg), "dashcam_webrtc");
        logger.a("sending message, msg: " + msg + ", id: " + eVarC0.getId());
        ce0.d dVar = new ce0.d() { // from class: com.tesla.dashcam_viewer.c1
            @Override // ce0.d
            public final void a(ic0.g gVar2) {
                f1.r0(eVarC0, gVar2);
            }
        };
        eb0.f.Companion companion = eb0.f.INSTANCE;
        Context context2 = appContext;
        if (context2 == null) {
            p013kotlin.jvm.internal.s.B("appContext");
        } else {
            context = context2;
        }
        companion.a(context).a(eVarC0, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(ic0.e eVar, ic0.g response) {
        p013kotlin.jvm.internal.s.k(response, "response");
        if (response.getResult() == ic0.h.RESULT_SUCCESS) {
            logger.j("sending webrtcRequest success, id: " + eVar.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(boolean z11) {
        appInBackground = z11;
    }

    private final void u0(String str) {
        if (!p013kotlin.jvm.internal.s.f(str, vin) && str.length() > 0) {
            x.f56132a.i("webrtc vin change");
        }
        vin = str;
    }

    private final void v0() {
        Job job = timer;
        if (job == null || !job.isActive()) {
            timer = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(serialDispatcher), null, null, new i(null), 3, null);
        } else {
            logger.j("timer already running");
        }
    }

    private final void w0() {
        Job job = timer;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        timer = null;
        statsCollector.i();
        logger.j("paused state machine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(a newState, String reason) {
        a aVar = currentState;
        Pair pair = new Pair(aVar, newState);
        a aVar2 = a.WAITING;
        a aVar3 = a.HANDSHAKING;
        if (p013kotlin.jvm.internal.s.f(pair, new Pair(aVar2, aVar3))) {
            handshakeStartTime = T();
            currentState = newState;
        } else {
            a aVar4 = a.CONNECTED;
            if (p013kotlin.jvm.internal.s.f(pair, new Pair(aVar3, aVar4))) {
                handshakeStartTime = 0L;
                currentState = newState;
            } else if (p013kotlin.jvm.internal.s.f(pair, new Pair(aVar3, aVar2)) || p013kotlin.jvm.internal.s.f(pair, new Pair(aVar4, aVar2))) {
                RNH264Stream.INSTANCE.setDashcamViewerStatus(n.CONNECTING);
                sessionID = "";
                handshakeStartTime = 0L;
                lastOfferGenTime = 0L;
                lastOfferSentTime = 0L;
                N();
                lastStatsCheck = 0L;
                statsCollector.i();
                i0();
                currentState = newState;
            } else {
                logger.j("Invalid transition from " + currentState + " to " + newState + " with reason: " + reason);
            }
        }
        logger.j("Transitioned from " + aVar + " to " + currentState + " with reason: " + reason);
    }

    private final void y0(long time) {
        com.tesla.logging.g gVar = logger;
        gVar.j("updateLastSendTime: " + time);
        lastSendTime = time;
        if (time <= 0) {
            gVar.j("updateLastSendTime stopping timer");
            w0();
        } else {
            gVar.j("updateLastSendTime starting timer");
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z0() {
        String strB = x.f56132a.b();
        return strB == null || vin.length() == 0 || !p013kotlin.jvm.internal.s.f(vin, strB);
    }

    public final void R(String eventPath) {
        p013kotlin.jvm.internal.s.k(eventPath, "eventPath");
        byte[] bytes = ("delete:" + eventPath + "\n").getBytes(p013kotlin.text.d.UTF_8);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        n0(bytes);
    }

    public final String W() {
        return vin;
    }

    public final void Z(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        appContext = context.getApplicationContext();
        o1 o1Var = o1.f55932a;
        Context applicationContext = context.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        o1Var.l(applicationContext);
        o1Var.k().b();
        o1Var.g().b();
    }

    @Override // ie0.m0
    public void a(String config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        c0(config);
    }

    @Override // ie0.m0
    public void b(byte[] payload, String vin2) {
        p013kotlin.jvm.internal.s.k(payload, "payload");
        p013kotlin.jvm.internal.s.k(vin2, "vin");
        f0(payload, vin2);
    }

    public final boolean l0(final byte[] data) throws ExecutionException, InterruptedException {
        p013kotlin.jvm.internal.s.k(data, "data");
        logger.j("sendDataOverWebRTC data: " + new String(data, p013kotlin.text.d.UTF_8));
        Object obj = serialQueue.submit(new Callable() { // from class: com.tesla.dashcam_viewer.z0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f1.m0(data);
            }
        }).get();
        p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    public final void n0(final byte[] data) {
        p013kotlin.jvm.internal.s.k(data, "data");
        serialQueue.execute(new Runnable() { // from class: com.tesla.dashcam_viewer.y0
            @Override // java.lang.Runnable
            public final void run() {
                f1.o0(data);
            }
        });
    }

    public final void s0(final boolean isBackgrounded) {
        serialQueue.execute(new Runnable() { // from class: com.tesla.dashcam_viewer.x0
            @Override // java.lang.Runnable
            public final void run() {
                f1.t0(isBackgrounded);
            }
        });
    }
}
