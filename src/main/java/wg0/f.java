package wg0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import pg0.Frame;
import pg0.d0;
import retrofit2.y;
import wn0.l;
import wn0.p;
import y20.o;
import zf0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002(#B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001f\u001a\u00020\u001e*\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u00020\"2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lwg0/f;", "Ly20/o;", "Lwg0/f$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "service", "Lwg0/c;", "governmentIdRequestArguments", "Lai0/a;", "dataCollector", "Lmg0/a;", "fallbackModeManager", "Lgi0/a;", "imageHelper", "webRtcObjectId", "Lzf0/u;", "cameraProperties", "Leg0/a;", "cameraStatsManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/a;Lwg0/c;Lai0/a;Lmg0/a;Lgi0/a;Ljava/lang/String;Lzf0/u;Leg0/a;)V", "", "Lokhttp3/MultipartBody$Part;", "body", "Ljn0/h0;", "l", "(Lwg0/c;Ljava/util/List;Lzf0/u;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Landroid/content/Context;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "h", "Lwg0/c;", IntegerTokenConverter.CONVERTER_KEY, "Lai0/a;", "j", "Lmg0/a;", "k", "Lgi0/a;", "m", "Lzf0/u;", "n", "Leg0/a;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String fromStep;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fromComponent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.governmentid.network.a service;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final GovernmentIdRequestArguments governmentIdRequestArguments;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ai0.a dataCollector;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mg0.a fallbackModeManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final gi0.a imageHelper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String webRtcObjectId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final u cameraProperties;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final eg0.a cameraStatsManager;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JW\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwg0/f$a;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "Lwg0/c;", "governmentIdRequestArguments", "webRtcObjectId", "Lzf0/u;", "cameraProperties", "Lwg0/f;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwg0/c;Ljava/lang/String;Lzf0/u;)Lwg0/f;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        f a(String sessionToken, String inquiryId, String fromComponent, String fromStep, GovernmentIdRequestArguments governmentIdRequestArguments, String webRtcObjectId, u cameraProperties);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lwg0/f$b;", "", "<init>", "()V", "c", "b", "a", "Lwg0/f$b$a;", "Lwg0/f$b$b;", "Lwg0/f$b$c;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lwg0/f$b$a;", "Lwg0/f$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final InternalErrorInfo.NetworkErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InternalErrorInfo.NetworkErrorInfo cause) {
                super(null);
                s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo.NetworkErrorInfo getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: wg0.f$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lwg0/f$b$b;", "Lwg0/f$b;", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2618b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2618b(GenericFileUploadErrorResponse.DocumentErrorResponse cause) {
                super(null);
                s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final GenericFileUploadErrorResponse.DocumentErrorResponse getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwg0/f$b$c;", "Lwg0/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f121830a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1775834809;
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f121832b;

        static {
            int[] iArr = new int[u.b.values().length];
            try {
                iArr[u.b.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f121831a = iArr;
            int[] iArr2 = new int[d0.d.values().length];
            try {
                iArr2[d0.d.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[d0.d.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d0.d.FRONT_AND_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f121832b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker", f = "SubmitVerificationWorker.kt", i = {0, 0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m = "addToForm", n = {"this", "$this$addToForm", "body", "governmentId"}, s = {"L$0", "L$1", "L$2", "L$4"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f121833n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f121834o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f121835p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f121836q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f121837r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f121838s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f121839t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f121841v;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f121839t = obj;
            this.f121841v |= Integer.MIN_VALUE;
            return f.this.l(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lwg0/f$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", i = {0, 0, 1, 2, 2, 3, 4, 5}, l = {64, 66, 88, 106, 108, 115}, m = "invokeSuspend", n = {"$this$flow", "body", "$this$flow", "$this$flow", "$this$onSuccess$iv", "$this$onFailure$iv", "$this$onFailure$iv", "$this$onFailure$iv"}, s = {"L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$0", "L$0"})
    static final class e extends SuspendLambda implements p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f121842n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f121843o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f121844p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1$1", f = "SubmitVerificationWorker.kt", i = {}, l = {68, 73}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<? extends Object>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f121846n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ f f121847o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ List<MultipartBody.Part> f121848p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, List<MultipartBody.Part> list, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f121847o = fVar;
                this.f121848p = list;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f121847o, this.f121848p, continuation);
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
                    int r1 = r5.f121846n
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
                    wg0.f r6 = r5.f121847o
                    mg0.a r6 = wg0.f.e(r6)
                    boolean r6 = r6.b()
                    if (r6 == 0) goto L47
                    wg0.f r6 = r5.f121847o
                    mg0.a r6 = wg0.f.e(r6)
                    wg0.f r1 = r5.f121847o
                    java.lang.String r1 = wg0.f.k(r1)
                    java.util.List<okhttp3.MultipartBody$Part> r2 = r5.f121848p
                    r5.f121846n = r3
                    java.lang.Object r6 = r6.a(r1, r2, r5)
                    if (r6 != r0) goto L44
                    goto L63
                L44:
                    retrofit2.y r6 = (retrofit2.y) r6
                    return r6
                L47:
                    wg0.f r6 = r5.f121847o
                    com.withpersona.sdk2.inquiry.governmentid.network.a r6 = wg0.f.j(r6)
                    wg0.f r1 = r5.f121847o
                    java.lang.String r1 = wg0.f.k(r1)
                    wg0.f r3 = r5.f121847o
                    java.lang.String r3 = wg0.f.i(r3)
                    java.util.List<okhttp3.MultipartBody$Part> r4 = r5.f121848p
                    r5.f121846n = r2
                    java.lang.Object r6 = r6.b(r1, r3, r4, r5)
                    if (r6 != r0) goto L64
                L63:
                    return r0
                L64:
                    retrofit2.y r6 = (retrofit2.y) r6
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: wg0.f.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<? extends Object>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = f.this.new e(continuation);
            eVar.f121844p = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0099 A[PHI: r1 r3
          0x0099: PHI (r1v5 java.util.List) = (r1v4 java.util.List), (r1v4 java.util.List), (r1v8 java.util.List) binds: [B:11:0x0082, B:13:0x0095, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]
          0x0099: PHI (r3v2 kotlinx.coroutines.flow.FlowCollector) = 
          (r3v1 kotlinx.coroutines.flow.FlowCollector)
          (r3v1 kotlinx.coroutines.flow.FlowCollector)
          (r3v4 kotlinx.coroutines.flow.FlowCollector)
         binds: [B:11:0x0082, B:13:0x0095, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x00af A[PHI: r3 r11
          0x00af: PHI (r3v5 kotlinx.coroutines.flow.FlowCollector) = (r3v2 kotlinx.coroutines.flow.FlowCollector), (r3v6 kotlinx.coroutines.flow.FlowCollector) binds: [B:16:0x00ab, B:8:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x00af: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v0 java.lang.Object) binds: [B:16:0x00ab, B:8:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:22:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f6 A[LOOP:1: B:30:0x00f0->B:32:0x00f6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:38:0x011e  */
        /* JADX WARN: Code duplicated, block: B:40:0x012b  */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0186, code lost:
        
            if (r3.emit(r4, r10) == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x01a3, code lost:
        
            if (r3.emit(r11, r10) == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01b6, code lost:
        
            if (r3.emit(r4, r10) == r0) goto L56;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wg0.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public f(Context context, String sessionToken, String inquiryId, String fromStep, String fromComponent, com.withpersona.sdk2.inquiry.governmentid.network.a service, GovernmentIdRequestArguments governmentIdRequestArguments, ai0.a dataCollector, mg0.a fallbackModeManager, gi0.a imageHelper, String str, u cameraProperties, eg0.a cameraStatsManager) {
        s.k(context, "context");
        s.k(sessionToken, "sessionToken");
        s.k(inquiryId, "inquiryId");
        s.k(fromStep, "fromStep");
        s.k(fromComponent, "fromComponent");
        s.k(service, "service");
        s.k(dataCollector, "dataCollector");
        s.k(fallbackModeManager, "fallbackModeManager");
        s.k(imageHelper, "imageHelper");
        s.k(cameraProperties, "cameraProperties");
        s.k(cameraStatsManager, "cameraStatsManager");
        this.context = context;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.fromStep = fromStep;
        this.fromComponent = fromComponent;
        this.service = service;
        this.governmentIdRequestArguments = governmentIdRequestArguments;
        this.dataCollector = dataCollector;
        this.fallbackModeManager = fallbackModeManager;
        this.imageHelper = imageHelper;
        this.webRtcObjectId = str;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = cameraStatsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x0304  */
    /* JADX WARN: Code duplicated, block: B:50:0x0321  */
    /* JADX WARN: Code duplicated, block: B:52:0x0341 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0342  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x02e6 -> B:46:0x02fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x031f -> B:55:0x0352). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0342 -> B:54:0x034a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(wg0.GovernmentIdRequestArguments r30, java.util.List<okhttp3.MultipartBody.Part> r31, zf0.u r32, p013kotlin.coroutines.Continuation<? super jn0.h0> r33) {
        /*
            Method dump skipped, instruction units count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wg0.f.l(wg0.c, java.util.List, zf0.u, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final List<MultipartBody.Part> m(GovernmentIdRequestArguments governmentIdRequestArguments, List<Frame> list) {
        ArrayList arrayList = new ArrayList();
        for (Frame frame : list) {
            v.E(arrayList, v.e(MultipartBody.Part.INSTANCE.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][frames][]", new File(frame.getAbsoluteFilePath()).getName(), RequestBody.INSTANCE.create(new File(frame.getAbsoluteFilePath()), MediaType.INSTANCE.parse(frame.getMimeType())))));
        }
        return arrayList;
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof f) && s.f(this.sessionToken, ((f) otherWorker).sessionToken);
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new e(null));
    }
}
