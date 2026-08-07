package z10;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u0097\u00012\u00020\u0001:\u00013BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\n¢\u0006\u0004\b-\u0010\u000fJ\r\u0010.\u001a\u00020\n¢\u0006\u0004\b.\u0010\u000fJ\r\u0010/\u001a\u00020\n¢\u0006\u0004\b/\u0010\u000fJ\u0015\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020$¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u00109\u001a\n 7*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104R\u0016\u0010;\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010>R\u0016\u0010A\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010BR\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u00104R\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR*\u0010P\u001a\u00020H2\u0006\u0010I\u001a\u00020H8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR.\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010Q8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010_\u001a\u00020D2\u0006\u0010Y\u001a\u00020D8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010F\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R.\u0010a\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010g\u001a\u0004\bh\u0010iR(\u0010q\u001a\b\u0012\u0004\u0012\u00020k0j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010t\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010F\u001a\u0004\br\u0010\\\"\u0004\bs\u0010^R\"\u0010w\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010F\u001a\u0004\bu\u0010\\\"\u0004\bv\u0010^R\"\u0010{\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010F\u001a\u0004\by\u0010\\\"\u0004\bz\u0010^R#\u0010\u0080\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010]\u001a\u0004\b}\u0010~\"\u0004\b|\u0010\u007fR&\u0010\u0083\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010]\u001a\u0005\b\u0082\u0001\u0010~\"\u0005\b\u0081\u0001\u0010\u007fR0\u0010\u0018\u001a\u00020\u00172\u0007\u0010\u0084\u0001\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\be\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R2\u0010\u0090\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\bW\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0005\bx\u0010\u008f\u0001R4\u0010\u0099\u0001\u001a\u00030\u0091\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R6\u0010\u009a\u0001\u001a\u0004\u0018\u00010D2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010D8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R3\u0010¡\u0001\u001a\u0004\u0018\u00010\u00022\t\u0010¡\u0001\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0004\bz\u00104\u001a\u0005\b¢\u0001\u00106\"\u0006\b\u0093\u0001\u0010£\u0001R\u001e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010¥\u0001R0\u0010§\u0001\u001a\u00020\u001e2\u0007\u0010§\u0001\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\b\u0088\u0001\u0010:\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0005\bF\u0010ª\u0001R+\u0010\u00ad\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u001e0«\u00010¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010¥\u0001R&\u0010¯\u0001\u001a\u0011\u0012\f\u0012\n 7*\u0004\u0018\u00010\u001e0\u001e0¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¥\u0001RP\u0010°\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010«\u00012\u0016\u0010°\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010«\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R&\u0010¹\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b·\u0001\u0010]\u001a\u0005\b¸\u0001\u0010~\"\u0005\b®\u0001\u0010\u007fR0\u0010¼\u0001\u001a\u00030º\u00018\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0015\n\u0005\bµ\u0001\u0010]\u001a\u0005\b»\u0001\u0010~\"\u0005\b¬\u0001\u0010\u007fR,\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\b·\u0001\u0010Â\u0001R+\u0010\u0011\u001a\u0004\u0018\u00010\u00102\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bS\u0010Ä\u0001\"\u0005\b±\u0001\u0010\u0013RG\u0010Å\u0001\u001a\u0011\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u001e\u0018\u00010«\u00012\u0016\u0010Ã\u0001\u001a\u0011\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u001e\u0018\u00010«\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bJ\u0010´\u0001\"\u0006\b\u009b\u0001\u0010¶\u0001R)\u0010Ç\u0001\u001a\u00020\u001e2\u0007\u0010Ã\u0001\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bZ\u0010©\u0001\"\u0006\bÆ\u0001\u0010ª\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006È\u0001"}, d2 = {"Lz10/c;", "", "", "namespace", "Lm20/c;", "eventStore", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "collectorUri", "Lkotlin/Function1;", "Ljn0/h0;", "builder", "<init>", "(Ljava/lang/String;Lm20/c;Landroid/content/Context;Ljava/lang/String;Lwn0/l;)V", "q", "()V", "Lq20/d;", "networkConnection", "f", "(Lq20/d;)V", "", "Lm20/b;", "events", "Lq20/c;", "httpMethod", "Lq20/h;", "g", "(Ljava/util/List;Lq20/c;)Ljava/util/List;", "Lr20/a;", StatusResponse.PAYLOAD, "", "o", "(Lr20/a;Lq20/c;)Z", "previousPayloads", "n", "(Lr20/a;Ljava/util/List;Lq20/c;)Z", "", "byteLimit", "m", "(Lr20/a;JLjava/util/List;)Z", "timestamp", "e", "(Lr20/a;Ljava/lang/String;)V", "c", "(Lr20/a;)V", "h", "p", "K", "timeout", "L", "(J)Z", "a", "Ljava/lang/String;", "getNamespace", "()Ljava/lang/String;", "kotlin.jvm.PlatformType", "b", "TAG", "Z", "builderFinished", "Ljava/util/concurrent/atomic/AtomicBoolean;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRunning", "isEmittingPaused", "isCustomNetworkConnection", "Landroid/content/Context;", "uri", "", IntegerTokenConverter.CONVERTER_KEY, "I", "emptyCount", "Ljava/util/concurrent/TimeUnit;", "unit", "j", "Ljava/util/concurrent/TimeUnit;", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "setTimeUnit", "(Ljava/util/concurrent/TimeUnit;)V", "timeUnit", "Lokhttp3/CookieJar;", "cookieJar", "k", "Lokhttp3/CookieJar;", "getCookieJar", "()Lokhttp3/CookieJar;", "v", "(Lokhttp3/CookieJar;)V", "poolSize", "l", "getThreadPoolSize", "()I", "J", "(I)V", "threadPoolSize", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "u", "(Lokhttp3/OkHttpClient;)V", "Lm20/c;", "getEventStore", "()Lm20/c;", "Ljava/util/EnumSet;", "Lz10/j;", "Ljava/util/EnumSet;", "getTlsVersions", "()Ljava/util/EnumSet;", "setTlsVersions", "(Ljava/util/EnumSet;)V", "tlsVersions", "getEmitterTick", "setEmitterTick", "emitterTick", "getEmptyLimit", "setEmptyLimit", "emptyLimit", "r", "getEmitRange", "y", "emitRange", "s", "getByteLimitGet", "()J", "(J)V", "byteLimitGet", "t", "getByteLimitPost", "byteLimitPost", "method", "Lq20/c;", "getHttpMethod", "()Lq20/c;", "A", "(Lq20/c;)V", "Lm20/a;", "option", "Lm20/a;", "getBufferOption", "()Lm20/a;", "(Lm20/a;)V", "bufferOption", "Lq20/g;", "security", "w", "Lq20/g;", "getRequestSecurity", "()Lq20/g;", "G", "(Lq20/g;)V", "requestSecurity", "emitTimeout", "x", "Ljava/lang/Integer;", "getEmitTimeout", "()Ljava/lang/Integer;", "z", "(Ljava/lang/Integer;)V", "customPostPath", "getCustomPostPath", "(Ljava/lang/String;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "_networkConnection", "serverAnonymisation", "getServerAnonymisation", "()Z", "(Z)V", "", "B", "_customRetryForStatusCodes", "C", "_retryFailedRequests", "requestHeaders", "D", "Ljava/util/Map;", "getRequestHeaders", "()Ljava/util/Map;", Gender.FEMALE, "(Ljava/util/Map;)V", "E", "getMaxEventStoreSize", "maxEventStoreSize", "Lio0/b;", "getMaxEventStoreAge-UwyO8pc", "maxEventStoreAge", "Lq20/i;", "requestCallback", "Lq20/i;", "getRequestCallback", "()Lq20/i;", "(Lq20/i;)V", "value", "()Lq20/d;", "customRetryForStatusCodes", "H", "retryFailedRequests", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean serverAnonymisation;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final AtomicReference<Map<Integer, Boolean>> _customRetryForStatusCodes;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final AtomicReference<Boolean> _retryFailedRequests;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private Map<String, String> requestHeaders;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private long maxEventStoreSize;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long maxEventStoreAge;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String namespace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean builderFinished;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isRunning;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isEmittingPaused;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isCustomNetworkConnection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String uri;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int emptyCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private TimeUnit timeUnit;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private CookieJar cookieJar;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int threadPoolSize;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private OkHttpClient client;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final m20.c eventStore;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private EnumSet<j> tlsVersions;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int emitterTick;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int emptyLimit;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int emitRange;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long byteLimitGet;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long byteLimitPost;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private q20.c httpMethod;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private m20.a bufferOption;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private q20.g requestSecurity;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private Integer emitTimeout;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private String customPostPath;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<q20.d> _networkConnection;

    public c(String namespace, m20.c cVar, Context context, String collectorUri, l<? super c, h0> lVar) {
        s.k(namespace, "namespace");
        s.k(context, "context");
        s.k(collectorUri, "collectorUri");
        this.namespace = namespace;
        String TAG = c.class.getSimpleName();
        this.TAG = TAG;
        this.isRunning = new AtomicBoolean(false);
        this.isEmittingPaused = new AtomicBoolean(false);
        d dVar = d.f126471a;
        this.timeUnit = dVar.o();
        this.threadPoolSize = dVar.n();
        this.eventStore = cVar == null ? new a20.c(context, namespace) : cVar;
        this.tlsVersions = dVar.p();
        this.emitterTick = dVar.f();
        this.emptyLimit = dVar.g();
        this.emitRange = dVar.d();
        this.byteLimitGet = dVar.b();
        this.byteLimitPost = dVar.c();
        this.httpMethod = dVar.h();
        this.bufferOption = dVar.a();
        this.requestSecurity = dVar.i();
        this.emitTimeout = Integer.valueOf(dVar.e());
        this._networkConnection = new AtomicReference<>();
        this.serverAnonymisation = dVar.m();
        this._customRetryForStatusCodes = new AtomicReference<>();
        this._retryFailedRequests = new AtomicReference<>(Boolean.valueOf(dVar.l()));
        this.maxEventStoreSize = dVar.k();
        this.maxEventStoreAge = dVar.j();
        this.context = context;
        if (lVar != null) {
            lVar.invoke(this);
        }
        if (k() == null) {
            this.isCustomNetworkConnection = false;
            if (!t.b0(collectorUri, "http", false, 2, null)) {
                collectorUri = (this.requestSecurity == q20.g.HTTPS ? "https://" : "http://") + collectorUri;
            }
            this.uri = collectorUri;
            Integer num = this.emitTimeout;
            D(num != null ? new q20.f.b(collectorUri, context).p(this.httpMethod).s(this.tlsVersions).e(num.intValue()).d(this.customPostPath).b(this.client).c(this.cookieJar).r(this.serverAnonymisation).q(this.requestHeaders).a() : null);
        } else {
            this.isCustomNetworkConnection = true;
        }
        int i11 = this.threadPoolSize;
        if (i11 > 2) {
            g.j(i11);
        }
        this.builderFinished = true;
        s.j(TAG, "TAG");
        h20.g.j(TAG, "Emitter created successfully!", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(c this$0, r20.a payload) {
        s.k(this$0, "this$0");
        s.k(payload, "$payload");
        this$0.eventStore.a(payload);
        if (this$0.eventStore.size() < this$0.bufferOption.getCode() || !this$0.isRunning.compareAndSet(false, true)) {
            return;
        }
        try {
            this$0.q();
            this$0.f(this$0.k());
        } catch (Throwable th2) {
            this$0.isRunning.set(false);
            String TAG = this$0.TAG;
            s.j(TAG, "TAG");
            h20.g.b(TAG, "Received error during emission process: %s", th2);
        }
    }

    private final void e(r20.a payload, String timestamp) {
        payload.d("stm", timestamp);
    }

    private final void f(q20.d networkConnection) {
        if (this.isEmittingPaused.get()) {
            String TAG = this.TAG;
            s.j(TAG, "TAG");
            h20.g.a(TAG, "Emitter paused.", new Object[0]);
            this.isRunning.compareAndSet(true, false);
            return;
        }
        if (!i20.c.j(this.context)) {
            String TAG2 = this.TAG;
            s.j(TAG2, "TAG");
            h20.g.a(TAG2, "Emitter loop stopping: emitter offline.", new Object[0]);
            this.isRunning.compareAndSet(true, false);
            return;
        }
        if (networkConnection == null) {
            String TAG3 = this.TAG;
            s.j(TAG3, "TAG");
            h20.g.a(TAG3, "No networkConnection set.", new Object[0]);
            this.isRunning.compareAndSet(true, false);
            return;
        }
        if (this.eventStore.size() <= 0) {
            int i11 = this.emptyCount;
            if (i11 >= this.emptyLimit) {
                String TAG4 = this.TAG;
                s.j(TAG4, "TAG");
                h20.g.a(TAG4, "Emitter loop stopping: empty limit reached.", new Object[0]);
                this.isRunning.compareAndSet(true, false);
                return;
            }
            this.emptyCount = i11 + 1;
            String TAG5 = this.TAG;
            s.j(TAG5, "TAG");
            h20.g.b(TAG5, "Emitter database empty: " + this.emptyCount, new Object[0]);
            try {
                this.timeUnit.sleep(this.emitterTick);
            } catch (InterruptedException e11) {
                String TAG6 = this.TAG;
                s.j(TAG6, "TAG");
                h20.g.b(TAG6, "Emitter thread sleep interrupted: " + e11, new Object[0]);
            }
            f(networkConnection);
            return;
        }
        this.emptyCount = 0;
        List<q20.j> listB = networkConnection.b(g(this.eventStore.b(this.emitRange), networkConnection.getHttpMethod()));
        String TAG7 = this.TAG;
        s.j(TAG7, "TAG");
        h20.g.j(TAG7, "Processing emitter results.", new Object[0]);
        ArrayList arrayList = new ArrayList();
        int size = 0;
        int size2 = 0;
        int size3 = 0;
        for (q20.j jVar : listB) {
            if (jVar.c()) {
                arrayList.addAll(jVar.a());
                size3 += jVar.a().size();
            } else if (jVar.d(j(), l())) {
                size += jVar.a().size();
                String TAG8 = this.TAG;
                s.j(TAG8, "TAG");
                h20.g.b(TAG8, "Request sending failed but we will retry later.", new Object[0]);
            } else {
                size2 += jVar.a().size();
                arrayList.addAll(jVar.a());
                String TAG9 = this.TAG;
                s.j(TAG9, "TAG");
                t0 t0Var = t0.f86535a;
                String str = String.format("Sending events to Collector failed with status %d. Events will be dropped.", Arrays.copyOf(new Object[]{Integer.valueOf(jVar.getStatusCode())}, 1));
                s.j(str, "format(format, *args)");
                h20.g.b(TAG9, str, new Object[0]);
            }
        }
        this.eventStore.d(arrayList);
        String TAG10 = this.TAG;
        s.j(TAG10, "TAG");
        h20.g.a(TAG10, "Success Count: %s", Integer.valueOf(size3));
        String TAG11 = this.TAG;
        s.j(TAG11, "TAG");
        h20.g.a(TAG11, "Failure Count: %s", Integer.valueOf(size2 + size));
        if (size <= 0 || size3 != 0) {
            f(networkConnection);
            return;
        }
        if (i20.c.j(this.context)) {
            String TAG12 = this.TAG;
            s.j(TAG12, "TAG");
            h20.g.b(TAG12, "Ensure collector path is valid: %s", networkConnection.getUri());
        }
        String TAG13 = this.TAG;
        s.j(TAG13, "TAG");
        h20.g.b(TAG13, "Emitter loop stopping: failures.", new Object[0]);
        this.isRunning.compareAndSet(true, false);
    }

    private final List<q20.h> g(List<m20.b> events, q20.c httpMethod) {
        ArrayList arrayList = new ArrayList();
        String strP = i20.c.p();
        if (httpMethod == q20.c.GET) {
            Iterator<m20.b> it = events.iterator();
            while (it.hasNext()) {
                m20.b next = it.next();
                r20.a aVar = next != null ? next.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String() : null;
                if (aVar != null) {
                    e(aVar, strP);
                    arrayList.add(new q20.h(aVar, next.getEventId(), o(aVar, httpMethod)));
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (m20.b bVar : events) {
                if (bVar != null) {
                    r20.a aVar2 = bVar.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String();
                    long eventId = bVar.getEventId();
                    e(aVar2, strP);
                    if (o(aVar2, httpMethod)) {
                        arrayList.add(new q20.h(aVar2, eventId, true));
                    } else if (n(aVar2, arrayList3, httpMethod)) {
                        arrayList.add(new q20.h(arrayList3, arrayList2));
                        arrayList3 = new ArrayList();
                        arrayList2 = new ArrayList();
                        arrayList3.add(aVar2);
                        arrayList2.add(Long.valueOf(eventId));
                    } else {
                        arrayList3.add(aVar2);
                        arrayList2.add(Long.valueOf(eventId));
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(new q20.h(arrayList3, arrayList2));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(c this$0) {
        s.k(this$0, "this$0");
        if (this$0.isRunning.compareAndSet(false, true)) {
            try {
                this$0.q();
                this$0.f(this$0.k());
            } catch (Throwable th2) {
                this$0.isRunning.set(false);
                String TAG = this$0.TAG;
                s.j(TAG, "TAG");
                h20.g.b(TAG, "Received error during emission process: %s", th2);
            }
        }
    }

    private final boolean m(r20.a payload, long byteLimit, List<? extends r20.a> previousPayloads) {
        long jB = payload.b();
        Iterator<? extends r20.a> it = previousPayloads.iterator();
        while (it.hasNext()) {
            jB += it.next().b();
        }
        return jB + ((long) (!previousPayloads.isEmpty() ? previousPayloads.size() + 88 : 0)) > byteLimit;
    }

    private final boolean n(r20.a payload, List<? extends r20.a> previousPayloads, q20.c httpMethod) {
        return m(payload, httpMethod == q20.c.GET ? this.byteLimitGet : this.byteLimitPost, previousPayloads);
    }

    private final boolean o(r20.a payload, q20.c httpMethod) {
        return n(payload, new ArrayList(), httpMethod);
    }

    private final void q() {
        this.eventStore.c(this.maxEventStoreSize, this.maxEventStoreAge);
    }

    public final void A(q20.c method) {
        s.k(method, "method");
        this.httpMethod = method;
        if (this.isCustomNetworkConnection || !this.builderFinished) {
            return;
        }
        Integer num = this.emitTimeout;
        q20.f fVarA = null;
        String str = null;
        if (num != null) {
            int iIntValue = num.intValue();
            String str2 = this.uri;
            if (str2 == null) {
                s.B("uri");
            } else {
                str = str2;
            }
            fVarA = new q20.f.b(str, this.context).p(this.httpMethod).s(this.tlsVersions).e(iIntValue).d(this.customPostPath).b(this.client).c(this.cookieJar).r(this.serverAnonymisation).q(this.requestHeaders).a();
        }
        D(fVarA);
    }

    public final void B(long j11) {
        this.maxEventStoreAge = j11;
    }

    public final void C(long j11) {
        this.maxEventStoreSize = j11;
    }

    public final void D(q20.d dVar) {
        this._networkConnection.set(dVar);
    }

    public final void F(Map<String, String> map) {
        this.requestHeaders = map;
        if (this.isCustomNetworkConnection || !this.builderFinished) {
            return;
        }
        Integer num = this.emitTimeout;
        q20.f fVarA = null;
        String str = null;
        if (num != null) {
            int iIntValue = num.intValue();
            String str2 = this.uri;
            if (str2 == null) {
                s.B("uri");
            } else {
                str = str2;
            }
            fVarA = new q20.f.b(str, this.context).p(this.httpMethod).s(this.tlsVersions).e(iIntValue).d(this.customPostPath).b(this.client).c(this.cookieJar).r(this.serverAnonymisation).q(map).a();
        }
        D(fVarA);
    }

    public final void G(q20.g security) {
        s.k(security, "security");
        this.requestSecurity = security;
        if (this.isCustomNetworkConnection || !this.builderFinished) {
            return;
        }
        Integer num = this.emitTimeout;
        q20.f fVarA = null;
        String str = null;
        if (num != null) {
            int iIntValue = num.intValue();
            String str2 = this.uri;
            if (str2 == null) {
                s.B("uri");
            } else {
                str = str2;
            }
            fVarA = new q20.f.b(str, this.context).p(this.httpMethod).s(this.tlsVersions).e(iIntValue).d(this.customPostPath).b(this.client).c(this.cookieJar).r(this.serverAnonymisation).q(this.requestHeaders).a();
        }
        D(fVarA);
    }

    public final void H(boolean z11) {
        this._retryFailedRequests.set(Boolean.valueOf(z11));
    }

    public final void I(boolean z11) {
        this.serverAnonymisation = z11;
        if (this.isCustomNetworkConnection || !this.builderFinished) {
            return;
        }
        Integer num = this.emitTimeout;
        q20.f fVarA = null;
        String str = null;
        if (num != null) {
            int iIntValue = num.intValue();
            String str2 = this.uri;
            if (str2 == null) {
                s.B("uri");
            } else {
                str = str2;
            }
            fVarA = new q20.f.b(str, this.context).p(this.httpMethod).s(this.tlsVersions).e(iIntValue).d(this.customPostPath).b(this.client).c(this.cookieJar).r(z11).q(this.requestHeaders).a();
        }
        D(fVarA);
    }

    public final void J(int i11) {
        if (this.builderFinished) {
            return;
        }
        this.threadPoolSize = i11;
    }

    public final void K() {
        L(0L);
    }

    public final boolean L(long timeout) {
        String TAG = this.TAG;
        s.j(TAG, "TAG");
        h20.g.a(TAG, "Shutting down emitter.", new Object[0]);
        this.isRunning.compareAndSet(true, false);
        ExecutorService executorServiceK = g.k();
        if (executorServiceK == null || timeout <= 0) {
            return true;
        }
        try {
            boolean zAwaitTermination = executorServiceK.awaitTermination(timeout, TimeUnit.SECONDS);
            String TAG2 = this.TAG;
            s.j(TAG2, "TAG");
            h20.g.a(TAG2, "Executor is terminated: " + zAwaitTermination, new Object[0]);
            return zAwaitTermination;
        } catch (InterruptedException e11) {
            String TAG3 = this.TAG;
            s.j(TAG3, "TAG");
            h20.g.b(TAG3, "Executor termination is interrupted: " + e11.getMessage(), new Object[0]);
            return false;
        }
    }

    public final void c(final r20.a payload) {
        s.k(payload, "payload");
        g.d(this.TAG, new Runnable() { // from class: z10.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(this.f126443a, payload);
            }
        });
    }

    public final void h() {
        g.d(this.TAG, new Runnable() { // from class: z10.a
            @Override // java.lang.Runnable
            public final void run() {
                c.i(this.f126442a);
            }
        });
    }

    public final Map<Integer, Boolean> j() {
        return this._customRetryForStatusCodes.get();
    }

    public final q20.d k() {
        return this._networkConnection.get();
    }

    public final boolean l() {
        Boolean bool = this._retryFailedRequests.get();
        s.j(bool, "_retryFailedRequests.get()");
        return bool.booleanValue();
    }

    public final void p() {
        this.isEmittingPaused.set(true);
    }

    public final void r(m20.a option) {
        s.k(option, "option");
        if (this.isRunning.get()) {
            return;
        }
        this.bufferOption = option;
    }

    public final void s(long j11) {
        this.byteLimitGet = j11;
    }

    public final void t(long j11) {
        this.byteLimitPost = j11;
    }

    public final void u(OkHttpClient okHttpClient) {
        if (this.builderFinished) {
            return;
        }
        this.client = okHttpClient;
    }

    public final void v(CookieJar cookieJar) {
        if (this.builderFinished) {
            return;
        }
        this.cookieJar = cookieJar;
    }

    public final void w(String str) {
        this.customPostPath = str;
        if (this.isCustomNetworkConnection || !this.builderFinished) {
            return;
        }
        Integer num = this.emitTimeout;
        q20.f fVarA = null;
        String str2 = null;
        if (num != null) {
            int iIntValue = num.intValue();
            String str3 = this.uri;
            if (str3 == null) {
                s.B("uri");
            } else {
                str2 = str3;
            }
            fVarA = new q20.f.b(str2, this.context).p(this.httpMethod).s(this.tlsVersions).e(iIntValue).d(str).b(this.client).c(this.cookieJar).r(this.serverAnonymisation).q(this.requestHeaders).a();
        }
        D(fVarA);
    }

    public final void x(Map<Integer, Boolean> map) {
        AtomicReference<Map<Integer, Boolean>> atomicReference = this._customRetryForStatusCodes;
        if (map == null) {
            map = new HashMap<>();
        }
        atomicReference.set(map);
    }

    public final void y(int i11) {
        this.emitRange = i11;
    }

    public final void z(Integer num) {
        if (num != null) {
            this.emitTimeout = num;
            if (this.isCustomNetworkConnection || !this.builderFinished) {
                return;
            }
            String str = this.uri;
            if (str == null) {
                s.B("uri");
                str = null;
            }
            D(new q20.f.b(str, this.context).p(this.httpMethod).s(this.tlsVersions).e(num.intValue()).d(this.customPostPath).b(this.client).c(this.cookieJar).r(this.serverAnonymisation).q(this.requestHeaders).a());
        }
    }

    public final void E(q20.i iVar) {
    }
}
