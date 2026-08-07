package vh0;

import android.content.Context;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.MultipartBody;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import retrofit2.y;
import th0.a1;
import th0.d2;
import wn0.l;
import wn0.p;
import y20.o;
import zf0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+&B¥\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020!*\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020%2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010.R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lvh0/c;", "Ly20/o;", "Lvh0/c$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "sessionToken", "inquiryId", "Lth0/d2;", "selfieType", "", "Lth0/a1;", "selfies", "Lvh0/a;", "service", "fromStep", "fromComponent", "fieldKeySelfie", "Lai0/a;", "dataCollector", "Lmg0/a;", "fallbackModeManager", "Lgi0/a;", "imageHelper", "webRtcObjectId", "Lzf0/u;", "cameraProperties", "Leg0/a;", "cameraStatsManager", "", "startSelfieTimestamp", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lth0/d2;Ljava/util/List;Lvh0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai0/a;Lmg0/a;Lgi0/a;Ljava/lang/String;Lzf0/u;Leg0/a;J)V", "Ljn0/h0;", "s", "(Lai0/a;Ljava/util/List;)V", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Landroid/content/Context;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "e", "Lth0/d2;", "f", "Ljava/util/List;", "g", "Lvh0/a;", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "Lai0/a;", "l", "Lmg0/a;", "m", "Lgi0/a;", "n", "o", "Lzf0/u;", "p", "Leg0/a;", "q", "J", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d2 selfieType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<a1> selfies;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final vh0.a service;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String fromStep;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String fromComponent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String fieldKeySelfie;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ai0.a dataCollector;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mg0.a fallbackModeManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final gi0.a imageHelper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String webRtcObjectId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final u cameraProperties;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final eg0.a cameraStatsManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long startSelfieTimestamp;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Ju\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvh0/c$a;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "Lth0/d2;", "selfieType", "fieldKeySelfie", "", "Lth0/a1;", "selfies", "webRtcObjectId", "Lzf0/u;", "cameraProperties", "", "startSelfieTimestamp", "Lvh0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth0/d2;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lzf0/u;J)Lvh0/c;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        c a(String sessionToken, String inquiryId, String fromComponent, String fromStep, d2 selfieType, String fieldKeySelfie, List<? extends a1> selfies, String webRtcObjectId, u cameraProperties, long startSelfieTimestamp);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lvh0/c$b;", "", "<init>", "()V", "b", "a", "Lvh0/c$b$a;", "Lvh0/c$b$b;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: vh0.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvh0/c$b$a;", "Lvh0/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && s.f(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: vh0.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvh0/c$b$b;", "Lvh0/c$b;", "<init>", "()V", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2553b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2553b f119358a = new C2553b();

            private C2553b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: vh0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lvh0/c$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", i = {0, 0, 0, 0, 1, 2, 2, 3}, l = {60, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {"$this$flow", "bodyParts", "selfie", Action.FILE_ATTRIBUTE, "$this$flow", "$this$flow", "$this$onSuccess$iv", "$this$onFailure$iv"}, s = {"L$0", "L$1", "L$4", "L$5", "L$0", "L$0", "L$1", "L$0"})
    static final class C2554c extends SuspendLambda implements p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f119359n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f119360o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f119361p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f119362q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f119363r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f119364s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f119365t;

        /* JADX INFO: renamed from: vh0.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1$2", f = "SubmitVerificationWorker.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, 256}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<? extends Object>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f119367n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ c f119368o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ List<MultipartBody.Part> f119369p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, List<MultipartBody.Part> list, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f119368o = cVar;
                this.f119369p = list;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f119368o, this.f119369p, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            
                if (r6 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
            
                if (r6 == r0) goto L19;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.f119367n
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    jn0.t.b(r6)
                    goto L64
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    jn0.t.b(r6)
                    goto L44
                L1e:
                    jn0.t.b(r6)
                    vh0.c r6 = r5.f119368o
                    mg0.a r6 = vh0.c.f(r6)
                    boolean r6 = r6.b()
                    if (r6 == 0) goto L47
                    vh0.c r6 = r5.f119368o
                    mg0.a r6 = vh0.c.f(r6)
                    vh0.c r1 = r5.f119368o
                    java.lang.String r1 = vh0.c.o(r1)
                    java.util.List<okhttp3.MultipartBody$Part> r2 = r5.f119369p
                    r5.f119367n = r3
                    java.lang.Object r6 = r6.a(r1, r2, r5)
                    if (r6 != r0) goto L44
                    goto L63
                L44:
                    retrofit2.y r6 = (retrofit2.y) r6
                    return r6
                L47:
                    vh0.c r6 = r5.f119368o
                    vh0.a r6 = vh0.c.n(r6)
                    vh0.c r1 = r5.f119368o
                    java.lang.String r1 = vh0.c.o(r1)
                    vh0.c r3 = r5.f119368o
                    java.lang.String r3 = vh0.c.k(r3)
                    java.util.List<okhttp3.MultipartBody$Part> r4 = r5.f119369p
                    r5.f119367n = r2
                    java.lang.Object r6 = r6.a(r1, r3, r4, r5)
                    if (r6 != r0) goto L64
                L63:
                    return r0
                L64:
                    retrofit2.y r6 = (retrofit2.y) r6
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: vh0.c.C2554c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<? extends Object>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: vh0.c$c$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f119370a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f119371b;

            static {
                int[] iArr = new int[a1.b.values().length];
                try {
                    iArr[a1.b.Center.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a1.b.Left.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a1.b.Right.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f119370a = iArr;
                int[] iArr2 = new int[u.b.values().length];
                try {
                    iArr2[u.b.Unknown.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                f119371b = iArr2;
            }
        }

        C2554c(Continuation<? super C2554c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2554c c2554c = c.this.new C2554c(continuation);
            c2554c.f119365t = obj;
            return c2554c;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x009a  */
        /* JADX WARN: Code duplicated, block: B:46:0x01df  */
        /* JADX WARN: Code duplicated, block: B:48:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:95:0x0638  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c7 -> B:23:0x00c9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01e3 -> B:49:0x0282). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instruction units count: 1628
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vh0.c.C2554c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((C2554c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, String sessionToken, String inquiryId, d2 selfieType, List<? extends a1> selfies, vh0.a service, String fromStep, String fromComponent, String fieldKeySelfie, ai0.a dataCollector, mg0.a fallbackModeManager, gi0.a imageHelper, String str, u cameraProperties, eg0.a cameraStatsManager, long j11) {
        s.k(context, "context");
        s.k(sessionToken, "sessionToken");
        s.k(inquiryId, "inquiryId");
        s.k(selfieType, "selfieType");
        s.k(selfies, "selfies");
        s.k(service, "service");
        s.k(fromStep, "fromStep");
        s.k(fromComponent, "fromComponent");
        s.k(fieldKeySelfie, "fieldKeySelfie");
        s.k(dataCollector, "dataCollector");
        s.k(fallbackModeManager, "fallbackModeManager");
        s.k(imageHelper, "imageHelper");
        s.k(cameraProperties, "cameraProperties");
        s.k(cameraStatsManager, "cameraStatsManager");
        this.context = context;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.selfieType = selfieType;
        this.selfies = selfies;
        this.service = service;
        this.fromStep = fromStep;
        this.fromComponent = fromComponent;
        this.fieldKeySelfie = fieldKeySelfie;
        this.dataCollector = dataCollector;
        this.fallbackModeManager = fallbackModeManager;
        this.imageHelper = imageHelper;
        this.webRtcObjectId = str;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = cameraStatsManager;
        this.startSelfieTimestamp = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(ai0.a aVar, List<? extends a1> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof a1.SelfieImage) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((a1.SelfieImage) obj2).getPose(), obj2);
        }
        aVar.a(new SelfieStepData(this.fromStep, (a1) linkedHashMap.get(a1.b.Center), (a1) linkedHashMap.get(a1.b.Left), (a1) linkedHashMap.get(a1.b.Right)));
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && s.f(this.sessionToken, ((c) otherWorker).sessionToken);
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new C2554c(null));
    }
}
