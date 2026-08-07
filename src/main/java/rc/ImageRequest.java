package rc;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ec.Extras;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u0;
import sc.Size;
import yc.f0;

/* JADX INFO: renamed from: rc.g, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bD\u0018\u00002\u00020\u0001:\u0004HE76Bµ\u0002\b\u0002\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001c\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b7\u00105J\u001d\u00109\u001a\u0002082\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010CR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b6\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b7\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bH\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010CR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010CR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R-\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bX\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bS\u0010bR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bg\u0010d\u001a\u0004\bg\u0010fR\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b^\u0010d\u001a\u0004\bP\u0010fR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b[\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010\u001d\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\be\u0010h\u001a\u0004\b`\u0010jR\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bN\u0010h\u001a\u0004\bk\u0010jR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bR\u0010l\u001a\u0004\bm\u0010nR%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bU\u0010o\u001a\u0004\bp\u0010qR%\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bi\u0010o\u001a\u0004\br\u0010qR%\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bk\u0010o\u001a\u0004\bs\u0010qR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bm\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\by\u0010{\u001a\u0004\bw\u0010|R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bu\u0010}\u001a\u0004\bc\u0010~R\u0018\u0010/\u001a\u00020.8\u0006¢\u0006\r\n\u0004\bK\u0010\u007f\u001a\u0005\bY\u0010\u0080\u0001R\u0019\u00101\u001a\u0002008\u0006¢\u0006\u000e\n\u0005\b9\u0010\u0081\u0001\u001a\u0005\bW\u0010\u0082\u0001¨\u0006\u0083\u0001"}, d2 = {"Lrc/g;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "data", "Lvc/c;", "target", "Lrc/g$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "memoryCacheKey", "", "memoryCacheKeyExtras", "diskCacheKey", "Lokio/o;", "fileSystem", "Lkotlin/Pair;", "Lic/j$a;", "Lco0/d;", "fetcherFactory", "Lgc/k$a;", "decoderFactory", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lrc/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lmc/d$b;", "placeholderMemoryCacheKey", "Lkotlin/Function1;", "Lec/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lsc/i;", "sizeResolver", "Lsc/f;", "scale", "Lsc/c;", "precision", "Lec/l;", "extras", "Lrc/g$c;", "defined", "Lrc/g$b;", "defaults", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lvc/c;Lrc/g$d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lokio/o;Lkotlin/Pair;Lgc/k$a;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lrc/c;Lrc/c;Lrc/c;Lmc/d$b;Lwn0/l;Lwn0/l;Lwn0/l;Lsc/i;Lsc/f;Lsc/c;Lec/l;Lrc/g$c;Lrc/g$b;)V", "B", "()Lec/n;", "a", "b", "Lrc/g$a;", "z", "(Landroid/content/Context;)Lrc/g$a;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "Lvc/c;", "y", "()Lvc/c;", "Lrc/g$d;", "p", "()Lrc/g$d;", "e", "Ljava/lang/String;", "q", "f", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "g", IntegerTokenConverter.CONVERTER_KEY, "h", "Lokio/o;", "n", "()Lokio/o;", "Lkotlin/Pair;", "m", "()Lkotlin/Pair;", "j", "Lgc/k$a;", "()Lgc/k$a;", "k", "Lkotlin/coroutines/CoroutineContext;", "o", "()Lkotlin/coroutines/CoroutineContext;", "l", "Lrc/c;", "s", "()Lrc/c;", "t", "Lmc/d$b;", "u", "()Lmc/d$b;", "Lwn0/l;", "getPlaceholderFactory", "()Lwn0/l;", "getErrorFactory", "getFallbackFactory", "Lsc/i;", "x", "()Lsc/i;", "v", "Lsc/f;", "w", "()Lsc/f;", "Lsc/c;", "()Lsc/c;", "Lec/l;", "()Lec/l;", "Lrc/g$c;", "()Lrc/g$c;", "Lrc/g$b;", "()Lrc/g$b;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final vc.c target;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String memoryCacheKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> memoryCacheKeyExtras;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String diskCacheKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final okio.o fileSystem;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pair<ic.j.a<?>, co0.d<?>> fetcherFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final gc.k.a decoderFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final CoroutineContext interceptorCoroutineContext;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final CoroutineContext fetcherCoroutineContext;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final CoroutineContext decoderCoroutineContext;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final c memoryCachePolicy;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final c diskCachePolicy;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final c networkCachePolicy;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final mc.d.Key placeholderMemoryCacheKey;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.l<ImageRequest, ec.n> placeholderFactory;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.l<ImageRequest, ec.n> errorFactory;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.l<ImageRequest, ec.n> fallbackFactory;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final sc.i sizeResolver;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final sc.f scale;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final sc.c precision;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final Extras extras;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final Defined defined;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final Defaults defaults;

    /* JADX INFO: renamed from: rc.g$c, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b$\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b(\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b2\u00101R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b4\u00105R'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b,\u00105R'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b.\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b6\u0010>¨\u0006?"}, d2 = {"Lrc/g$c;", "", "Lokio/o;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lrc/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lrc/g;", "Lec/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lsc/i;", "sizeResolver", "Lsc/f;", "scale", "Lsc/c;", "precision", "<init>", "(Lokio/o;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lrc/c;Lrc/c;Lrc/c;Lwn0/l;Lwn0/l;Lwn0/l;Lsc/i;Lsc/f;Lsc/c;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "Lokio/o;", "f", "()Lokio/o;", "b", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "c", "e", DateTokenConverter.CONVERTER_KEY, "Lrc/c;", "h", "()Lrc/c;", IntegerTokenConverter.CONVERTER_KEY, "Lwn0/l;", "j", "()Lwn0/l;", "k", "Lsc/i;", "m", "()Lsc/i;", "l", "Lsc/f;", "()Lsc/f;", "Lsc/c;", "()Lsc/c;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Defined {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final okio.o fileSystem;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CoroutineContext interceptorCoroutineContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CoroutineContext fetcherCoroutineContext;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CoroutineContext decoderCoroutineContext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c memoryCachePolicy;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final c diskCachePolicy;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final c networkCachePolicy;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.l<ImageRequest, ec.n> placeholderFactory;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.l<ImageRequest, ec.n> errorFactory;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.l<ImageRequest, ec.n> fallbackFactory;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final sc.i sizeResolver;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final sc.f scale;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final sc.c precision;

        /* JADX WARN: Multi-variable type inference failed */
        public Defined(okio.o oVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, c cVar, c cVar2, c cVar3, wn0.l<? super ImageRequest, ? extends ec.n> lVar, wn0.l<? super ImageRequest, ? extends ec.n> lVar2, wn0.l<? super ImageRequest, ? extends ec.n> lVar3, sc.i iVar, sc.f fVar, sc.c cVar4) {
            this.fileSystem = oVar;
            this.interceptorCoroutineContext = coroutineContext;
            this.fetcherCoroutineContext = coroutineContext2;
            this.decoderCoroutineContext = coroutineContext3;
            this.memoryCachePolicy = cVar;
            this.diskCachePolicy = cVar2;
            this.networkCachePolicy = cVar3;
            this.placeholderFactory = lVar;
            this.errorFactory = lVar2;
            this.fallbackFactory = lVar3;
            this.sizeResolver = iVar;
            this.scale = fVar;
            this.precision = cVar4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CoroutineContext getDecoderCoroutineContext() {
            return this.decoderCoroutineContext;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getDiskCachePolicy() {
            return this.diskCachePolicy;
        }

        public final wn0.l<ImageRequest, ec.n> c() {
            return this.errorFactory;
        }

        public final wn0.l<ImageRequest, ec.n> d() {
            return this.fallbackFactory;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final CoroutineContext getFetcherCoroutineContext() {
            return this.fetcherCoroutineContext;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Defined)) {
                return false;
            }
            Defined defined = (Defined) other;
            return p013kotlin.jvm.internal.s.f(this.fileSystem, defined.fileSystem) && p013kotlin.jvm.internal.s.f(this.interceptorCoroutineContext, defined.interceptorCoroutineContext) && p013kotlin.jvm.internal.s.f(this.fetcherCoroutineContext, defined.fetcherCoroutineContext) && p013kotlin.jvm.internal.s.f(this.decoderCoroutineContext, defined.decoderCoroutineContext) && this.memoryCachePolicy == defined.memoryCachePolicy && this.diskCachePolicy == defined.diskCachePolicy && this.networkCachePolicy == defined.networkCachePolicy && p013kotlin.jvm.internal.s.f(this.placeholderFactory, defined.placeholderFactory) && p013kotlin.jvm.internal.s.f(this.errorFactory, defined.errorFactory) && p013kotlin.jvm.internal.s.f(this.fallbackFactory, defined.fallbackFactory) && p013kotlin.jvm.internal.s.f(this.sizeResolver, defined.sizeResolver) && this.scale == defined.scale && this.precision == defined.precision;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final okio.o getFileSystem() {
            return this.fileSystem;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final CoroutineContext getInterceptorCoroutineContext() {
            return this.interceptorCoroutineContext;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final c getMemoryCachePolicy() {
            return this.memoryCachePolicy;
        }

        public int hashCode() {
            okio.o oVar = this.fileSystem;
            int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
            CoroutineContext coroutineContext = this.interceptorCoroutineContext;
            int iHashCode2 = (iHashCode + (coroutineContext == null ? 0 : coroutineContext.hashCode())) * 31;
            CoroutineContext coroutineContext2 = this.fetcherCoroutineContext;
            int iHashCode3 = (iHashCode2 + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.decoderCoroutineContext;
            int iHashCode4 = (iHashCode3 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
            c cVar = this.memoryCachePolicy;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            c cVar2 = this.diskCachePolicy;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            c cVar3 = this.networkCachePolicy;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            wn0.l<ImageRequest, ec.n> lVar = this.placeholderFactory;
            int iHashCode8 = (iHashCode7 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            wn0.l<ImageRequest, ec.n> lVar2 = this.errorFactory;
            int iHashCode9 = (iHashCode8 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
            wn0.l<ImageRequest, ec.n> lVar3 = this.fallbackFactory;
            int iHashCode10 = (iHashCode9 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
            sc.i iVar = this.sizeResolver;
            int iHashCode11 = (iHashCode10 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            sc.f fVar = this.scale;
            int iHashCode12 = (iHashCode11 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            sc.c cVar4 = this.precision;
            return iHashCode12 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final c getNetworkCachePolicy() {
            return this.networkCachePolicy;
        }

        public final wn0.l<ImageRequest, ec.n> j() {
            return this.placeholderFactory;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final sc.c getPrecision() {
            return this.precision;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final sc.f getScale() {
            return this.scale;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final sc.i getSizeResolver() {
            return this.sizeResolver;
        }

        public String toString() {
            return "Defined(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ ImageRequest(Context context, Object obj, vc.c cVar, d dVar, String str, Map map, String str2, okio.o oVar, Pair pair, gc.k.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, c cVar2, c cVar3, c cVar4, mc.d.Key key, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, sc.i iVar, sc.f fVar, sc.c cVar5, Extras lVar4, Defined defined, Defaults defaults, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cVar, dVar, str, map, str2, oVar, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, cVar2, cVar3, cVar4, key, lVar, lVar2, lVar3, iVar, fVar, cVar5, lVar4, defined, defaults);
    }

    public static /* synthetic */ a A(ImageRequest imageRequest, Context context, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = imageRequest.context;
        }
        return imageRequest.z(context);
    }

    public final ec.n B() {
        ec.n nVarInvoke = this.placeholderFactory.invoke(this);
        return nVarInvoke == null ? this.defaults.m().invoke(this) : nVarInvoke;
    }

    public final ec.n a() {
        ec.n nVarInvoke = this.errorFactory.invoke(this);
        return nVarInvoke == null ? this.defaults.e().invoke(this) : nVarInvoke;
    }

    public final ec.n b() {
        ec.n nVarInvoke = this.fallbackFactory.invoke(this);
        return nVarInvoke == null ? this.defaults.g().invoke(this) : nVarInvoke;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final CoroutineContext getDecoderCoroutineContext() {
        return this.decoderCoroutineContext;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) other;
        return p013kotlin.jvm.internal.s.f(this.context, imageRequest.context) && p013kotlin.jvm.internal.s.f(this.data, imageRequest.data) && p013kotlin.jvm.internal.s.f(this.target, imageRequest.target) && p013kotlin.jvm.internal.s.f(this.listener, imageRequest.listener) && p013kotlin.jvm.internal.s.f(this.memoryCacheKey, imageRequest.memoryCacheKey) && p013kotlin.jvm.internal.s.f(this.memoryCacheKeyExtras, imageRequest.memoryCacheKeyExtras) && p013kotlin.jvm.internal.s.f(this.diskCacheKey, imageRequest.diskCacheKey) && p013kotlin.jvm.internal.s.f(this.fileSystem, imageRequest.fileSystem) && p013kotlin.jvm.internal.s.f(this.fetcherFactory, imageRequest.fetcherFactory) && p013kotlin.jvm.internal.s.f(this.decoderFactory, imageRequest.decoderFactory) && p013kotlin.jvm.internal.s.f(this.interceptorCoroutineContext, imageRequest.interceptorCoroutineContext) && p013kotlin.jvm.internal.s.f(this.fetcherCoroutineContext, imageRequest.fetcherCoroutineContext) && p013kotlin.jvm.internal.s.f(this.decoderCoroutineContext, imageRequest.decoderCoroutineContext) && this.memoryCachePolicy == imageRequest.memoryCachePolicy && this.diskCachePolicy == imageRequest.diskCachePolicy && this.networkCachePolicy == imageRequest.networkCachePolicy && p013kotlin.jvm.internal.s.f(this.placeholderMemoryCacheKey, imageRequest.placeholderMemoryCacheKey) && p013kotlin.jvm.internal.s.f(this.placeholderFactory, imageRequest.placeholderFactory) && p013kotlin.jvm.internal.s.f(this.errorFactory, imageRequest.errorFactory) && p013kotlin.jvm.internal.s.f(this.fallbackFactory, imageRequest.fallbackFactory) && p013kotlin.jvm.internal.s.f(this.sizeResolver, imageRequest.sizeResolver) && this.scale == imageRequest.scale && this.precision == imageRequest.precision && p013kotlin.jvm.internal.s.f(this.extras, imageRequest.extras) && p013kotlin.jvm.internal.s.f(this.defined, imageRequest.defined) && p013kotlin.jvm.internal.s.f(this.defaults, imageRequest.defaults);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final gc.k.a getDecoderFactory() {
        return this.decoderFactory;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Defaults getDefaults() {
        return this.defaults;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Defined getDefined() {
        return this.defined;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.data.hashCode()) * 31;
        vc.c cVar = this.target;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.listener;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.memoryCacheKey;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.memoryCacheKeyExtras.hashCode()) * 31;
        String str2 = this.diskCacheKey;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.fileSystem.hashCode()) * 31;
        Pair<ic.j.a<?>, co0.d<?>> pair = this.fetcherFactory;
        int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
        gc.k.a aVar = this.decoderFactory;
        int iHashCode7 = (((((((((((((iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.interceptorCoroutineContext.hashCode()) * 31) + this.fetcherCoroutineContext.hashCode()) * 31) + this.decoderCoroutineContext.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31;
        mc.d.Key key = this.placeholderMemoryCacheKey;
        return ((((((((((((((((((iHashCode7 + (key != null ? key.hashCode() : 0)) * 31) + this.placeholderFactory.hashCode()) * 31) + this.errorFactory.hashCode()) * 31) + this.fallbackFactory.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.extras.hashCode()) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final c getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Extras getExtras() {
        return this.extras;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final CoroutineContext getFetcherCoroutineContext() {
        return this.fetcherCoroutineContext;
    }

    public final Pair<ic.j.a<?>, co0.d<?>> m() {
        return this.fetcherFactory;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final okio.o getFileSystem() {
        return this.fileSystem;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final CoroutineContext getInterceptorCoroutineContext() {
        return this.interceptorCoroutineContext;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final d getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    public final Map<String, String> r() {
        return this.memoryCacheKeyExtras;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final c getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final c getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public String toString() {
        return "ImageRequest(context=" + this.context + ", data=" + this.data + ", target=" + this.target + ", listener=" + this.listener + ", memoryCacheKey=" + this.memoryCacheKey + ", memoryCacheKeyExtras=" + this.memoryCacheKeyExtras + ", diskCacheKey=" + this.diskCacheKey + ", fileSystem=" + this.fileSystem + ", fetcherFactory=" + this.fetcherFactory + ", decoderFactory=" + this.decoderFactory + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderMemoryCacheKey=" + this.placeholderMemoryCacheKey + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ", defined=" + this.defined + ", defaults=" + this.defaults + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final mc.d.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final sc.c getPrecision() {
        return this.precision;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final sc.f getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final sc.i getSizeResolver() {
        return this.sizeResolver;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final vc.c getTarget() {
        return this.target;
    }

    public final a z(Context context) {
        return new a(this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImageRequest(Context context, Object obj, vc.c cVar, d dVar, String str, Map<String, String> map, String str2, okio.o oVar, Pair<? extends ic.j.a<?>, ? extends co0.d<?>> pair, gc.k.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, c cVar2, c cVar3, c cVar4, mc.d.Key key, wn0.l<? super ImageRequest, ? extends ec.n> lVar, wn0.l<? super ImageRequest, ? extends ec.n> lVar2, wn0.l<? super ImageRequest, ? extends ec.n> lVar3, sc.i iVar, sc.f fVar, sc.c cVar5, Extras lVar4, Defined defined, Defaults defaults) {
        this.context = context;
        this.data = obj;
        this.target = cVar;
        this.listener = dVar;
        this.memoryCacheKey = str;
        this.memoryCacheKeyExtras = map;
        this.diskCacheKey = str2;
        this.fileSystem = oVar;
        this.fetcherFactory = pair;
        this.decoderFactory = aVar;
        this.interceptorCoroutineContext = coroutineContext;
        this.fetcherCoroutineContext = coroutineContext2;
        this.decoderCoroutineContext = coroutineContext3;
        this.memoryCachePolicy = cVar2;
        this.diskCachePolicy = cVar3;
        this.networkCachePolicy = cVar4;
        this.placeholderMemoryCacheKey = key;
        this.placeholderFactory = lVar;
        this.errorFactory = lVar2;
        this.fallbackFactory = lVar3;
        this.sizeResolver = iVar;
        this.scale = fVar;
        this.precision = cVar5;
        this.extras = lVar4;
        this.defined = defined;
        this.defaults = defaults;
    }

    /* JADX INFO: renamed from: rc.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u0000 @2\u00020\u0001:\u0001\u001cB½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJÃ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b1\u00105R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b:\u0010;R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\b2\u0010;R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b7\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b:\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bC\u0010E\u001a\u0004\b6\u0010F¨\u0006G"}, d2 = {"Lrc/g$b;", "", "Lokio/o;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lrc/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lrc/g;", "Lec/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lsc/i;", "sizeResolver", "Lsc/f;", "scale", "Lsc/c;", "precision", "Lec/l;", "extras", "<init>", "(Lokio/o;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lrc/c;Lrc/c;Lrc/c;Lwn0/l;Lwn0/l;Lwn0/l;Lsc/i;Lsc/f;Lsc/c;Lec/l;)V", "a", "(Lokio/o;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lrc/c;Lrc/c;Lrc/c;Lwn0/l;Lwn0/l;Lwn0/l;Lsc/i;Lsc/f;Lsc/c;Lec/l;)Lrc/g$b;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Lokio/o;", IntegerTokenConverter.CONVERTER_KEY, "()Lokio/o;", "b", "Lkotlin/coroutines/CoroutineContext;", "j", "()Lkotlin/coroutines/CoroutineContext;", "c", "h", DateTokenConverter.CONVERTER_KEY, "e", "Lrc/c;", "k", "()Lrc/c;", "f", "g", "l", "Lwn0/l;", "m", "()Lwn0/l;", "Lsc/i;", "p", "()Lsc/i;", "Lsc/f;", "o", "()Lsc/f;", "Lsc/c;", "n", "()Lsc/c;", "Lec/l;", "()Lec/l;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Defaults {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Defaults f107567p = new Defaults(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final okio.o fileSystem;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CoroutineContext interceptorCoroutineContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CoroutineContext fetcherCoroutineContext;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CoroutineContext decoderCoroutineContext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c memoryCachePolicy;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final c diskCachePolicy;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final c networkCachePolicy;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.l<ImageRequest, ec.n> placeholderFactory;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.l<ImageRequest, ec.n> errorFactory;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn0.l<ImageRequest, ec.n> fallbackFactory;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final sc.i sizeResolver;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final sc.f scale;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final sc.c precision;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Extras extras;

        /* JADX WARN: Multi-variable type inference failed */
        public Defaults(okio.o oVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, c cVar, c cVar2, c cVar3, wn0.l<? super ImageRequest, ? extends ec.n> lVar, wn0.l<? super ImageRequest, ? extends ec.n> lVar2, wn0.l<? super ImageRequest, ? extends ec.n> lVar3, sc.i iVar, sc.f fVar, sc.c cVar4, Extras lVar4) {
            this.fileSystem = oVar;
            this.interceptorCoroutineContext = coroutineContext;
            this.fetcherCoroutineContext = coroutineContext2;
            this.decoderCoroutineContext = coroutineContext3;
            this.memoryCachePolicy = cVar;
            this.diskCachePolicy = cVar2;
            this.networkCachePolicy = cVar3;
            this.placeholderFactory = lVar;
            this.errorFactory = lVar2;
            this.fallbackFactory = lVar3;
            this.sizeResolver = iVar;
            this.scale = fVar;
            this.precision = cVar4;
            this.extras = lVar4;
        }

        public final Defaults a(okio.o fileSystem, CoroutineContext interceptorCoroutineContext, CoroutineContext fetcherCoroutineContext, CoroutineContext decoderCoroutineContext, c memoryCachePolicy, c diskCachePolicy, c networkCachePolicy, wn0.l<? super ImageRequest, ? extends ec.n> placeholderFactory, wn0.l<? super ImageRequest, ? extends ec.n> errorFactory, wn0.l<? super ImageRequest, ? extends ec.n> fallbackFactory, sc.i sizeResolver, sc.f scale, sc.c precision, Extras extras) {
            return new Defaults(fileSystem, interceptorCoroutineContext, fetcherCoroutineContext, decoderCoroutineContext, memoryCachePolicy, diskCachePolicy, networkCachePolicy, placeholderFactory, errorFactory, fallbackFactory, sizeResolver, scale, precision, extras);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CoroutineContext getDecoderCoroutineContext() {
            return this.decoderCoroutineContext;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getDiskCachePolicy() {
            return this.diskCachePolicy;
        }

        public final wn0.l<ImageRequest, ec.n> e() {
            return this.errorFactory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Defaults)) {
                return false;
            }
            Defaults defaults = (Defaults) other;
            return p013kotlin.jvm.internal.s.f(this.fileSystem, defaults.fileSystem) && p013kotlin.jvm.internal.s.f(this.interceptorCoroutineContext, defaults.interceptorCoroutineContext) && p013kotlin.jvm.internal.s.f(this.fetcherCoroutineContext, defaults.fetcherCoroutineContext) && p013kotlin.jvm.internal.s.f(this.decoderCoroutineContext, defaults.decoderCoroutineContext) && this.memoryCachePolicy == defaults.memoryCachePolicy && this.diskCachePolicy == defaults.diskCachePolicy && this.networkCachePolicy == defaults.networkCachePolicy && p013kotlin.jvm.internal.s.f(this.placeholderFactory, defaults.placeholderFactory) && p013kotlin.jvm.internal.s.f(this.errorFactory, defaults.errorFactory) && p013kotlin.jvm.internal.s.f(this.fallbackFactory, defaults.fallbackFactory) && p013kotlin.jvm.internal.s.f(this.sizeResolver, defaults.sizeResolver) && this.scale == defaults.scale && this.precision == defaults.precision && p013kotlin.jvm.internal.s.f(this.extras, defaults.extras);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Extras getExtras() {
            return this.extras;
        }

        public final wn0.l<ImageRequest, ec.n> g() {
            return this.fallbackFactory;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final CoroutineContext getFetcherCoroutineContext() {
            return this.fetcherCoroutineContext;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.fileSystem.hashCode() * 31) + this.interceptorCoroutineContext.hashCode()) * 31) + this.fetcherCoroutineContext.hashCode()) * 31) + this.decoderCoroutineContext.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.placeholderFactory.hashCode()) * 31) + this.errorFactory.hashCode()) * 31) + this.fallbackFactory.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.extras.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final okio.o getFileSystem() {
            return this.fileSystem;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final CoroutineContext getInterceptorCoroutineContext() {
            return this.interceptorCoroutineContext;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final c getMemoryCachePolicy() {
            return this.memoryCachePolicy;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final c getNetworkCachePolicy() {
            return this.networkCachePolicy;
        }

        public final wn0.l<ImageRequest, ec.n> m() {
            return this.placeholderFactory;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final sc.c getPrecision() {
            return this.precision;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final sc.f getScale() {
            return this.scale;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final sc.i getSizeResolver() {
            return this.sizeResolver;
        }

        public String toString() {
            return "Defaults(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Defaults(okio.o oVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, c cVar, c cVar2, c cVar3, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, sc.i iVar, sc.f fVar, sc.c cVar4, Extras lVar4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? yc.m.a() : oVar, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i11 & 4) != 0 ? yc.f.a() : coroutineContext2, (i11 & 8) != 0 ? yc.f.a() : coroutineContext3, (i11 & 16) != 0 ? c.ENABLED : cVar, (i11 & 32) != 0 ? c.ENABLED : cVar2, (i11 & 64) != 0 ? c.ENABLED : cVar3, (i11 & 128) != 0 ? f0.k() : lVar, (i11 & 256) != 0 ? f0.k() : lVar2, (i11 & 512) != 0 ? f0.k() : lVar3, (i11 & 1024) != 0 ? sc.i.f111066b : iVar, (i11 & 2048) != 0 ? sc.f.FIT : fVar, (i11 & 4096) != 0 ? sc.c.EXACT : cVar4, (i11 & PKIFailureInfo.certRevoked) != 0 ? Extras.f62497c : lVar4);
        }
    }

    /* JADX INFO: renamed from: rc.g$a */
    @Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020\u00002\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010.02¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0007¢\u0006\u0004\b9\u0010:R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010=R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010GR\u0016\u0010I\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010>R\u0018\u0010J\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010DR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR,\u0010S\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030P\u0012\b\u0012\u0006\u0012\u0002\b\u00030Q\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010WR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010\\R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR&\u0010h\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR&\u0010j\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010gR&\u0010l\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010gR\u0018\u0010o\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010u\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010>R\u0011\u0010x\u001a\u00020v8F¢\u0006\u0006\u001a\u0004\bC\u0010w¨\u0006y"}, d2 = {"Lrc/g$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lrc/g;", "request", "(Lrc/g;Landroid/content/Context;)V", "data", "c", "(Ljava/lang/Object;)Lrc/g$a;", "Lvc/c;", "target", "p", "(Lvc/c;)Lrc/g$a;", "", Action.KEY_ATTRIBUTE, "g", "(Ljava/lang/String;)Lrc/g$a;", "", Snapshot.WIDTH, Snapshot.HEIGHT, "m", "(II)Lrc/g$a;", "Lsc/g;", "size", "n", "(Lsc/g;)Lrc/g$a;", "Lsc/i;", "resolver", "o", "(Lsc/i;)Lrc/g$a;", "Lsc/f;", "scale", "l", "(Lsc/f;)Lrc/g$a;", "Lsc/c;", "precision", "k", "(Lsc/c;)Lrc/g$a;", "Lgc/k$a;", "factory", DateTokenConverter.CONVERTER_KEY, "(Lgc/k$a;)Lrc/g$a;", "Lec/n;", "image", "h", "(Lec/n;)Lrc/g$a;", "Lkotlin/Function1;", IntegerTokenConverter.CONVERTER_KEY, "(Lwn0/l;)Lrc/g$a;", "Lrc/g$b;", "defaults", "e", "(Lrc/g$b;)Lrc/g$a;", "b", "()Lrc/g;", "a", "Landroid/content/Context;", "Lrc/g$b;", "Ljava/lang/Object;", "Lvc/c;", "Lrc/g$d;", "Lrc/g$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "f", "Ljava/lang/String;", "memoryCacheKey", "", "Z", "memoryCacheKeyExtrasAreMutable", "lazyMemoryCacheKeyExtras", "diskCacheKey", "Lokio/o;", "j", "Lokio/o;", "fileSystem", "Lkotlin/Pair;", "Lic/j$a;", "Lco0/d;", "Lkotlin/Pair;", "fetcherFactory", "Lgc/k$a;", "decoderFactory", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lrc/c;", "Lrc/c;", "memoryCachePolicy", "q", "diskCachePolicy", "r", "networkCachePolicy", "Lmc/d$b;", "s", "Lmc/d$b;", "placeholderMemoryCacheKey", "t", "Lwn0/l;", "placeholderFactory", "u", "errorFactory", "v", "fallbackFactory", "w", "Lsc/i;", "sizeResolver", "x", "Lsc/f;", "y", "Lsc/c;", "z", "lazyExtras", "Lec/l$a;", "()Lec/l$a;", "extras", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Defaults defaults;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Object data;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private vc.c target;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private d listener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private String memoryCacheKey;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean memoryCacheKeyExtrasAreMutable;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Object lazyMemoryCacheKeyExtras;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private String diskCacheKey;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private okio.o fileSystem;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Pair<? extends ic.j.a<?>, ? extends co0.d<?>> fetcherFactory;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private gc.k.a decoderFactory;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private CoroutineContext interceptorCoroutineContext;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private CoroutineContext fetcherCoroutineContext;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private CoroutineContext decoderCoroutineContext;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private c memoryCachePolicy;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private c diskCachePolicy;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private c networkCachePolicy;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private mc.d.Key placeholderMemoryCacheKey;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private wn0.l<? super ImageRequest, ? extends ec.n> placeholderFactory;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private wn0.l<? super ImageRequest, ? extends ec.n> errorFactory;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private wn0.l<? super ImageRequest, ? extends ec.n> fallbackFactory;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private sc.i sizeResolver;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private sc.f scale;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private sc.c precision;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private Object lazyExtras;

        public a(Context context) {
            this.context = context;
            this.defaults = Defaults.f107567p;
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.lazyMemoryCacheKeyExtras = v0.i();
            this.diskCacheKey = null;
            this.fileSystem = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.interceptorCoroutineContext = null;
            this.fetcherCoroutineContext = null;
            this.decoderCoroutineContext = null;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderFactory = f0.k();
            this.errorFactory = f0.k();
            this.fallbackFactory = f0.k();
            this.sizeResolver = null;
            this.scale = null;
            this.precision = null;
            this.lazyExtras = Extras.f62497c;
        }

        public final ImageRequest b() {
            Map mapD;
            Extras lVarA;
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = l.f107608a;
            }
            Object obj2 = obj;
            vc.c cVar = this.target;
            d dVar = this.listener;
            String str = this.memoryCacheKey;
            Object obj3 = this.lazyMemoryCacheKeyExtras;
            if (p013kotlin.jvm.internal.s.f(obj3, Boolean.valueOf(this.memoryCacheKeyExtrasAreMutable))) {
                p013kotlin.jvm.internal.s.i(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                mapD = yc.d.d(u0.d(obj3));
            } else {
                if (!(obj3 instanceof Map)) {
                    throw new AssertionError();
                }
                mapD = (Map) obj3;
            }
            Map map = mapD;
            p013kotlin.jvm.internal.s.i(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            String str2 = this.diskCacheKey;
            okio.o fileSystem = this.fileSystem;
            if (fileSystem == null) {
                fileSystem = this.defaults.getFileSystem();
            }
            okio.o oVar = fileSystem;
            Pair<? extends ic.j.a<?>, ? extends co0.d<?>> pair = this.fetcherFactory;
            gc.k.a aVar = this.decoderFactory;
            c memoryCachePolicy = this.memoryCachePolicy;
            if (memoryCachePolicy == null) {
                memoryCachePolicy = this.defaults.getMemoryCachePolicy();
            }
            c cVar2 = memoryCachePolicy;
            c diskCachePolicy = this.diskCachePolicy;
            if (diskCachePolicy == null) {
                diskCachePolicy = this.defaults.getDiskCachePolicy();
            }
            c cVar3 = diskCachePolicy;
            c networkCachePolicy = this.networkCachePolicy;
            if (networkCachePolicy == null) {
                networkCachePolicy = this.defaults.getNetworkCachePolicy();
            }
            c cVar4 = networkCachePolicy;
            CoroutineContext interceptorCoroutineContext = this.interceptorCoroutineContext;
            if (interceptorCoroutineContext == null) {
                interceptorCoroutineContext = this.defaults.getInterceptorCoroutineContext();
            }
            CoroutineContext coroutineContext = interceptorCoroutineContext;
            CoroutineContext fetcherCoroutineContext = this.fetcherCoroutineContext;
            if (fetcherCoroutineContext == null) {
                fetcherCoroutineContext = this.defaults.getFetcherCoroutineContext();
            }
            CoroutineContext coroutineContext2 = fetcherCoroutineContext;
            CoroutineContext decoderCoroutineContext = this.decoderCoroutineContext;
            if (decoderCoroutineContext == null) {
                decoderCoroutineContext = this.defaults.getDecoderCoroutineContext();
            }
            CoroutineContext coroutineContext3 = decoderCoroutineContext;
            mc.d.Key key = this.placeholderMemoryCacheKey;
            wn0.l lVarM = this.placeholderFactory;
            if (lVarM == null) {
                lVarM = this.defaults.m();
            }
            wn0.l lVar = lVarM;
            wn0.l lVarE = this.errorFactory;
            if (lVarE == null) {
                lVarE = this.defaults.e();
            }
            wn0.l lVar2 = lVarE;
            wn0.l lVarG = this.fallbackFactory;
            if (lVarG == null) {
                lVarG = this.defaults.g();
            }
            wn0.l lVar3 = lVarG;
            sc.i sizeResolver = this.sizeResolver;
            if (sizeResolver == null) {
                sizeResolver = this.defaults.getSizeResolver();
            }
            sc.i iVar = sizeResolver;
            sc.f scale = this.scale;
            if (scale == null) {
                scale = this.defaults.getScale();
            }
            sc.f fVar = scale;
            sc.c precision = this.precision;
            if (precision == null) {
                precision = this.defaults.getPrecision();
            }
            sc.c cVar5 = precision;
            Object obj4 = this.lazyExtras;
            if (obj4 instanceof Extras.a) {
                lVarA = ((Extras.a) obj4).a();
            } else {
                if (!(obj4 instanceof Extras)) {
                    throw new AssertionError();
                }
                lVarA = (Extras) obj4;
            }
            return new ImageRequest(context, obj2, cVar, dVar, str, map, str2, oVar, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, cVar2, cVar3, cVar4, key, lVar, lVar2, lVar3, iVar, fVar, cVar5, lVarA, new Defined(this.fileSystem, this.interceptorCoroutineContext, this.fetcherCoroutineContext, this.decoderCoroutineContext, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy, this.placeholderFactory, this.errorFactory, this.fallbackFactory, this.sizeResolver, this.scale, this.precision), this.defaults, null);
        }

        public final a c(Object data) {
            this.data = data;
            return this;
        }

        public final a d(gc.k.a factory) {
            this.decoderFactory = factory;
            return this;
        }

        public final a e(Defaults defaults) {
            this.defaults = defaults;
            return this;
        }

        public final Extras.a f() {
            Object obj = this.lazyExtras;
            if (obj instanceof Extras.a) {
                return (Extras.a) obj;
            }
            if (!(obj instanceof Extras)) {
                throw new AssertionError();
            }
            Extras.a aVarD = ((Extras) obj).d();
            this.lazyExtras = aVarD;
            return aVarD;
        }

        public final a g(String key) {
            this.memoryCacheKey = key;
            return this;
        }

        public final a h(final ec.n image) {
            return i(new wn0.l() { // from class: rc.f
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return ImageRequest.a.j(image, (ImageRequest) obj);
                }
            });
        }

        public final a i(wn0.l<? super ImageRequest, ? extends ec.n> factory) {
            this.placeholderFactory = factory;
            return this;
        }

        public final a k(sc.c precision) {
            this.precision = precision;
            return this;
        }

        public final a l(sc.f scale) {
            this.scale = scale;
            return this;
        }

        public final a m(int width, int height) {
            return n(sc.h.a(width, height));
        }

        public final a n(Size size) {
            return o(sc.j.a(size));
        }

        public final a o(sc.i resolver) {
            this.sizeResolver = resolver;
            return this;
        }

        public final a p(vc.c target) {
            this.target = target;
            return this;
        }

        public a(ImageRequest imageRequest, Context context) {
            this.context = context;
            this.defaults = imageRequest.getDefaults();
            this.data = imageRequest.getData();
            this.target = imageRequest.getTarget();
            this.listener = imageRequest.getListener();
            this.memoryCacheKey = imageRequest.getMemoryCacheKey();
            this.lazyMemoryCacheKeyExtras = imageRequest.r();
            this.diskCacheKey = imageRequest.getDiskCacheKey();
            this.fileSystem = imageRequest.getDefined().getFileSystem();
            this.fetcherFactory = imageRequest.m();
            this.decoderFactory = imageRequest.getDecoderFactory();
            this.interceptorCoroutineContext = imageRequest.getDefined().getInterceptorCoroutineContext();
            this.fetcherCoroutineContext = imageRequest.getDefined().getFetcherCoroutineContext();
            this.decoderCoroutineContext = imageRequest.getDefined().getDecoderCoroutineContext();
            this.memoryCachePolicy = imageRequest.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = imageRequest.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = imageRequest.getDefined().getNetworkCachePolicy();
            this.placeholderMemoryCacheKey = imageRequest.getPlaceholderMemoryCacheKey();
            this.placeholderFactory = imageRequest.getDefined().j();
            this.errorFactory = imageRequest.getDefined().c();
            this.fallbackFactory = imageRequest.getDefined().d();
            this.sizeResolver = imageRequest.getDefined().getSizeResolver();
            this.scale = imageRequest.getDefined().getScale();
            this.precision = imageRequest.getDefined().getPrecision();
            this.lazyExtras = imageRequest.getExtras();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ec.n j(ec.n nVar, ImageRequest imageRequest) {
            return nVar;
        }
    }

    /* JADX INFO: renamed from: rc.g$d */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lrc/g$d;", "", "Lrc/g;", "request", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lrc/g;)V", "c", "Lrc/e;", "result", "b", "(Lrc/g;Lrc/e;)V", "Lrc/r;", "a", "(Lrc/g;Lrc/r;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface d {
        default void c(ImageRequest request) {
        }

        default void d(ImageRequest request) {
        }

        default void a(ImageRequest request, SuccessResult result) {
        }

        default void b(ImageRequest request, ErrorResult result) {
        }
    }
}
