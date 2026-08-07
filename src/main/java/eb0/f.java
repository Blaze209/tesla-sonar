package eb0;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tesla.command.CommandCenterBackgroundTasker;
import com.tesla.features.FeaturesConfig;
import com.tesla.oapi.OwnerApiEndpoints;
import com.tesla.oapi.SendOwnerRequest;
import com.tesla.oapi.auth.AuthRepository;
import com.tesla.oapi.auth.OwnerDataModule;
import fc0.u5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 K2\u00020\u0001:\u00011BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u00020\u0018*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010&\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)J'\u0010,\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b,\u0010-J%\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00105R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00108R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010AR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00140D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010I¨\u0006L"}, d2 = {"Leb0/f;", "Lmb0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "bluetooth", "Lfb0/m;", "hermes", "oapi", "signedOapi", "Lpa0/d;", "analyticsService", "Lbe0/e;", "getVehicleData", "Lpb0/b;", "getTransportsList", "Lkd0/e;", "monitoringService", "<init>", "(Landroid/content/Context;Lmb0/a;Lfb0/m;Lmb0/a;Lmb0/a;Lpa0/d;Lbe0/e;Lpb0/b;Lkd0/e;)V", "Lic0/e;", "", "msg", "Lcom/tesla/logging/d;", "logLevel", "Ljn0/h0;", "o", "(Lic0/e;Ljava/lang/String;Lcom/tesla/logging/d;)V", "", "dispatchers", "request", "Lce0/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkd0/i;", "trace", "", "index", "Lic0/h;", "previousTransportResult", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Lic0/e;Lce0/d;Lkd0/i;ILic0/h;)V", "n", "(Lic0/e;)Ljava/util/List;", "Lic0/g;", "response", "q", "(Lic0/e;Lic0/g;Lce0/d;)V", "Lkd0/a;", "t", "(Lic0/e;Lic0/g;)Ljava/util/List;", "a", "(Lic0/e;Lce0/d;)V", "c", "(Lic0/e;)V", "Landroid/content/Context;", "b", "Lmb0/a;", "Lfb0/m;", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lpa0/d;", "g", "Lbe0/e;", "h", "Lpb0/b;", "Lkd0/e;", "j", "Ljava/util/List;", "Ljava/util/concurrent/ConcurrentSkipListSet;", "k", "Ljava/util/concurrent/ConcurrentSkipListSet;", "onGoingCommandIds", "Lic0/q;", "()Lic0/q;", "transport", "l", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements mb0.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final com.tesla.logging.g f62365m = com.tesla.logging.g.INSTANCE.a("CC");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set<ic0.h> f62366n = d1.i(ic0.h.RESULT_SUCCESS, ic0.h.RESULT_NOMINAL_ERROR);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static mb0.a f62367o;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mb0.a bluetooth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fb0.m hermes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mb0.a oapi;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mb0.a signedOapi;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pa0.d analyticsService;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final be0.e getVehicleData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final pb0.b getTransportsList;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final kd0.e monitoringService;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<mb0.a> dispatchers;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentSkipListSet<String> onGoingCommandIds;

    /* JADX INFO: renamed from: eb0.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Leb0/f$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmb0/a;", "a", "(Landroid/content/Context;)Lmb0/a;", "", "TAG", "Ljava/lang/String;", "", "Lic0/h;", "TERMINAL_RESULTS", "Ljava/util/Set;", "", "DEFAULT_TIMEOUT_S", "J", "INSTANCE", "Lmb0/a;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mb0.a a(Context context) {
            byte[] bArrD;
            p013kotlin.jvm.internal.s.k(context, "context");
            Context applicationContext = context.getApplicationContext();
            if (f.f62367o == null) {
                SendOwnerRequest.Companion companion = SendOwnerRequest.INSTANCE;
                p013kotlin.jvm.internal.s.h(applicationContext);
                SendOwnerRequest sendOwnerRequestNewInstance = companion.newInstance(applicationContext);
                ud0.a aVar = ud0.a.f116153a;
                be0.e eVarA = be0.e.INSTANCE.a();
                tb0.e eVarB = tb0.d.f113112a.b();
                OwnerApiEndpoints companion2 = OwnerApiEndpoints.INSTANCE.getInstance(context);
                td0.m mVarJ = td0.m.j();
                ee0.a.Companion c1287a = ee0.a.INSTANCE;
                p013kotlin.jvm.internal.s.h(mVarJ);
                be0.b bVar = new be0.b(mVarJ);
                try {
                    bArrD = rb0.e.f107486a.d(context);
                } catch (Exception unused) {
                    bArrD = null;
                }
                ee0.a aVarA = c1287a.a(bVar, bArrD, rb0.e.f107486a.e(context, be0.f.f17060a.f()));
                pb0.a aVar2 = new pb0.a(eVarA);
                AuthRepository authRepository = OwnerDataModule.getAuthRepository();
                pb0.b bVarA = pb0.b.INSTANCE.a(aVar2, eVarA);
                fd0.n nVarA = fd0.n.INSTANCE.a(fd0.f.INSTANCE.a(rb0.f.INSTANCE.a(context)), fd0.j.INSTANCE.b(sendOwnerRequestNewInstance, companion2));
                FeaturesConfig featuresConfigA = com.tesla.features.a.a();
                t.Companion aVar3 = t.INSTANCE;
                ce0.h.Companion aVar4 = ce0.h.INSTANCE;
                mb0.a aVarA2 = aVar3.a(applicationContext, aVar, eVarA, sendOwnerRequestNewInstance, companion2, aVarA, aVar4.a(aVarA, ic0.q.TRANSPORT_SIGNED_OAPI), nVarA, featuresConfigA);
                mb0.a aVarD = eb0.b.INSTANCE.d(applicationContext, eVarA, aVar4.a(aVarA, ic0.q.TRANSPORT_BLUETOOTH));
                fb0.m.Companion aVar5 = fb0.m.INSTANCE;
                pa0.d dVarC = pa0.c.c();
                jb0.b bVarA2 = jb0.b.INSTANCE.a(sendOwnerRequestNewInstance, eVarB, companion2);
                jb0.d dVarA = jb0.d.INSTANCE.a(sendOwnerRequestNewInstance, pa0.c.c(), eVarB, companion2);
                ce0.h hVarA = aVar4.a(aVarA, ic0.q.TRANSPORT_HERMES);
                he0.b bVarM = he0.b.m(applicationContext);
                p013kotlin.jvm.internal.s.j(bVarM, "getInstance(...)");
                f.f62367o = new f(applicationContext, aVarD, aVar5.b(applicationContext, bVarM, aVarA, hVarA, aVar, eVarA, dVarC, bVarA2, dVarA, featuresConfigA, ie0.f.INSTANCE.a(applicationContext), nVarA, authRepository), new j(aVar, eVarA, sendOwnerRequestNewInstance, companion2, context), aVarA2, pa0.c.c(), be0.e.INSTANCE.a(), bVarA, null, 256, null);
            }
            mb0.a aVar6 = f.f62367o;
            if (aVar6 != null) {
                return aVar6;
            }
            p013kotlin.jvm.internal.s.B("INSTANCE");
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62379a;

        static {
            int[] iArr = new int[ic0.q.values().length];
            try {
                iArr[ic0.q.TRANSPORT_OWNER_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ic0.q.TRANSPORT_HERMES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ic0.q.TRANSPORT_BLUETOOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ic0.q.TRANSPORT_SIGNED_OAPI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ic0.q.TRANSPORT_NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ic0.q.TRANSPORT_REMOTE_ACCESS_V2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f62379a = iArr;
        }
    }

    public f(Context context, mb0.a bluetooth, fb0.m hermes, mb0.a oapi, mb0.a aVar, pa0.d analyticsService, be0.e getVehicleData, pb0.b getTransportsList, kd0.e monitoringService) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(bluetooth, "bluetooth");
        p013kotlin.jvm.internal.s.k(hermes, "hermes");
        p013kotlin.jvm.internal.s.k(oapi, "oapi");
        p013kotlin.jvm.internal.s.k(analyticsService, "analyticsService");
        p013kotlin.jvm.internal.s.k(getVehicleData, "getVehicleData");
        p013kotlin.jvm.internal.s.k(getTransportsList, "getTransportsList");
        p013kotlin.jvm.internal.s.k(monitoringService, "monitoringService");
        this.context = context;
        this.bluetooth = bluetooth;
        this.hermes = hermes;
        this.oapi = oapi;
        this.signedOapi = aVar;
        this.analyticsService = analyticsService;
        this.getVehicleData = getVehicleData;
        this.getTransportsList = getTransportsList;
        this.monitoringService = monitoringService;
        this.dispatchers = v.p(bluetooth, hermes, oapi);
        this.onGoingCommandIds = new ConcurrentSkipListSet<>();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[Catch: Exception -> 0x00cb, TRY_LEAVE, TryCatch #2 {Exception -> 0x00cb, blocks: (B:38:0x00c7, B:48:0x00dd), top: B:77:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0107 A[Catch: Exception -> 0x010b, TRY_LEAVE, TryCatch #1 {Exception -> 0x010b, blocks: (B:49:0x0103, B:51:0x0107), top: B:75:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00dd, please report this as an issue */
    private final void i(final List<? extends mb0.a> dispatchers, ic0.e request, final ce0.d listener, final kd0.i trace, final int index, ic0.h previousTransportResult) {
        final ic0.e eVar;
        ic0.e eVar2;
        nc0.l lVar;
        ic0.h hVar;
        final String strA = de0.b.a(request);
        try {
            if (index < 0) {
                o(request, "invalid index " + index + " for request", com.tesla.logging.d.ERROR);
                p(this, request, "notifying listener of failure due to invalid index", null, 2, null);
                ic0.q qVar = ic0.q.TRANSPORT_NONE;
                if (previousTransportResult == null) {
                    hVar = ic0.h.RESULT_INTERNAL_ERROR;
                } else {
                    hVar = previousTransportResult;
                }
                eVar2 = request;
                listener = listener;
                q(request, nb0.b.b(eVar2, qVar, hVar, null, null, null, 56, null), listener);
                kd0.a.Companion companion = kd0.a.INSTANCE;
                trace = trace;
                trace.a(v.p(companion.a("result", "no_channels_failure"), companion.a("transport", "command_center")));
                return;
            }
            try {
                if (index < dispatchers.size()) {
                    boolean z11 = index < v.o(dispatchers);
                    final mb0.a aVar = dispatchers.get(index);
                    final ic0.q qVarD = aVar.getTransport();
                    if (request.o().contains(qVarD)) {
                        eVar = request;
                        try {
                            bb0.b bVar = bb0.b.f16948a;
                            final List<cc0.f> listP = v.p(bVar.a(strA), bVar.e(qVarD), bVar.b(request));
                            this.analyticsService.b(cc0.d.SEND_COMMAND, listP);
                            kd0.e eVar3 = this.monitoringService;
                            try {
                                switch (b.f62379a[qVarD.ordinal()]) {
                                    case 1:
                                        lVar = nc0.l.OAPI_COMMAND;
                                        break;
                                    case 2:
                                        lVar = nc0.l.HERMES_COMMAND;
                                        break;
                                    case 3:
                                        lVar = nc0.l.BLUETOOTH_COMMAND;
                                        break;
                                    case 4:
                                        lVar = nc0.l.SIGNED_OAPI_COMMAND;
                                        break;
                                    case 5:
                                        throw new IllegalStateException("Cannot start trace with TRANSPORT_NONE");
                                    case 6:
                                        throw new IllegalStateException("Cannot start trace with TRANSPORT_REMOTE_ACCESS_V2 (Optimus-only)");
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                final kd0.i iVarH = eVar3.h(lVar, v.e(kd0.a.INSTANCE.a("command", ce0.c.b(request))));
                                final boolean z12 = z11;
                                try {
                                    aVar.a(request, new ce0.d() { // from class: eb0.e
                                        @Override // ce0.d
                                        public final void a(ic0.g gVar) {
                                            f.k(this.f62352a, listP, eVar, qVarD, iVarH, z12, aVar, index, strA, listener, trace, dispatchers, gVar);
                                        }
                                    });
                                    return;
                                } catch (Exception e11) {
                                    e = e11;
                                    eVar = eVar;
                                    eVar2 = eVar;
                                    f62365m.d(de0.a.c(request) + " ERROR EXCEPTION THROWN! => " + e.getMessage(), e);
                                    m(eVar2, this, dispatchers, listener, trace, index, previousTransportResult, null, 128, null);
                                }
                            } catch (Exception e12) {
                                e = e12;
                                eVar2 = eVar;
                                f62365m.d(de0.a.c(request) + " ERROR EXCEPTION THROWN! => " + e.getMessage(), e);
                                m(eVar2, this, dispatchers, listener, trace, index, previousTransportResult, null, 128, null);
                            }
                        } catch (Exception e13) {
                            e = e13;
                        }
                    } else {
                        eVar2 = request;
                        try {
                            m(eVar2, this, dispatchers, listener, trace, index, previousTransportResult, null, 128, null);
                            return;
                        } catch (Exception e14) {
                            e = e14;
                            listener = listener;
                            trace = trace;
                        }
                    }
                } else {
                    o(request, "invalid index " + index + " for request", com.tesla.logging.d.ERROR);
                    p(this, request, "notifying listener of failure due to invalid index", null, 2, null);
                    try {
                        ic0.q qVar2 = ic0.q.TRANSPORT_NONE;
                        if (previousTransportResult == null) {
                            hVar = ic0.h.RESULT_INTERNAL_ERROR;
                        } else {
                            hVar = previousTransportResult;
                        }
                        eVar2 = request;
                        try {
                            listener = listener;
                            try {
                                q(request, nb0.b.b(eVar2, qVar2, hVar, null, null, null, 56, null), listener);
                                kd0.a.Companion companion2 = kd0.a.INSTANCE;
                                trace = trace;
                                try {
                                    trace.a(v.p(companion2.a("result", "no_channels_failure"), companion2.a("transport", "command_center")));
                                    return;
                                } catch (Exception e15) {
                                    e = e15;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                trace = trace;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            listener = listener;
                            trace = trace;
                            f62365m.d(de0.a.c(request) + " ERROR EXCEPTION THROWN! => " + e.getMessage(), e);
                            m(eVar2, this, dispatchers, listener, trace, index, previousTransportResult, null, 128, null);
                        }
                    } catch (Exception e18) {
                        e = e18;
                        eVar2 = request;
                    }
                }
            } catch (Exception e19) {
                e = e19;
                eVar = request;
            }
        } catch (Exception e21) {
            e = e21;
        }
        f62365m.d(de0.a.c(request) + " ERROR EXCEPTION THROWN! => " + e.getMessage(), e);
        m(eVar2, this, dispatchers, listener, trace, index, previousTransportResult, null, 128, null);
    }

    static /* synthetic */ void j(f fVar, List list, ic0.e eVar, ce0.d dVar, kd0.i iVar, int i11, ic0.h hVar, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            i11 = 0;
        }
        int i13 = i11;
        if ((i12 & 32) != 0) {
            hVar = null;
        }
        fVar.i(list, eVar, dVar, iVar, i13, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f fVar, List list, ic0.e eVar, ic0.q qVar, kd0.i iVar, boolean z11, mb0.a aVar, int i11, String str, ce0.d dVar, kd0.i iVar2, List list2, ic0.g response) {
        ic0.e eVar2;
        ic0.h hVar;
        ic0.e eVarB;
        p013kotlin.jvm.internal.s.k(response, "response");
        ic0.h result = response.getResult();
        pa0.d dVar2 = fVar.analyticsService;
        cc0.d dVar3 = cc0.d.SEND_COMMAND_ATTEMPT;
        List list3 = list;
        bb0.b bVar = bb0.b.f16948a;
        dVar2.b(dVar3, v.P0(list3, v.p(bVar.c(response.getRequestId()), bVar.d(response.getStatusCode()), nb0.a.d(result) ? qa0.a.g() : qa0.a.b(), qa0.a.f(result))));
        p(fVar, eVar, "tesla dispatcher received " + lb0.a.b(result) + " from " + lb0.a.c(qVar), null, 2, null);
        iVar.a(fVar.t(eVar, response));
        if (!f62366n.contains(result) && z11) {
            p(fVar, eVar, "trying next dispatcher...", null, 2, null);
            if (aVar.getTransport() == ic0.q.TRANSPORT_HERMES) {
                hVar = result;
                eVarB = ic0.e.b(eVar, null, null, null, null, v0.m(x.a("X-Command-Fallback-Reason", lb0.a.b(response.getResult())), x.a("X-Command-Fallback-Origin-Txid", response.getRequestId())), false, false, null, null, 0L, false, false, false, false, false, false, 0L, 0L, 0L, 0, null, null, 4194287, null);
                eVar2 = eVar;
            } else {
                eVar2 = eVar;
                hVar = result;
                eVarB = eVar2;
            }
            l(eVar2, fVar, list2, dVar, iVar2, i11, hVar, eVarB);
            return;
        }
        if (!fVar.onGoingCommandIds.remove(str)) {
            iVar2.a(fVar.t(eVar, response));
            fVar.o(eVar, "received response but cannot do anything with it.", com.tesla.logging.d.ERROR);
            return;
        }
        fVar.o(eVar, "notifying root listener of " + lb0.a.b(result) + "!", com.tesla.logging.d.DEBUG);
        fVar.q(eVar, response, dVar);
        iVar2.a(fVar.t(eVar, response));
    }

    private static final void l(ic0.e eVar, f fVar, List<? extends mb0.a> list, ce0.d dVar, kd0.i iVar, int i11, ic0.h hVar, ic0.e eVar2) {
        fVar.i(list, eVar2, dVar, iVar, i11 + 1, hVar);
    }

    static /* synthetic */ void m(ic0.e eVar, f fVar, List list, ce0.d dVar, kd0.i iVar, int i11, ic0.h hVar, ic0.e eVar2, int i12, Object obj) {
        if ((i12 & 128) != 0) {
            eVar2 = eVar;
        }
        l(eVar, fVar, list, dVar, iVar, i11, hVar, eVar2);
    }

    private final List<mb0.a> n(ic0.e request) {
        mb0.a aVar;
        List<ic0.q> listO = request.o();
        ArrayList arrayList = new ArrayList();
        if (listO.contains(ic0.q.TRANSPORT_BLUETOOTH)) {
            arrayList.add(this.bluetooth);
        }
        if (listO.contains(ic0.q.TRANSPORT_SIGNED_OAPI) && (aVar = this.signedOapi) != null) {
            arrayList.add(aVar);
        }
        if (listO.contains(ic0.q.TRANSPORT_HERMES)) {
            arrayList.add(this.hermes);
        }
        if (listO.contains(ic0.q.TRANSPORT_OWNER_API)) {
            arrayList.add(this.oapi);
        }
        return arrayList;
    }

    private final void o(ic0.e eVar, String str, com.tesla.logging.d dVar) {
        de0.a.e(eVar, str, f62365m, dVar);
    }

    static /* synthetic */ void p(f fVar, ic0.e eVar, String str, com.tesla.logging.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = com.tesla.logging.d.INFO;
        }
        fVar.o(eVar, str, dVar);
    }

    private final void q(ic0.e request, ic0.g response, ce0.d listener) {
        CommandCenterBackgroundTasker commandCenterBackgroundTasker = CommandCenterBackgroundTasker.f55729a;
        Context context = this.context;
        ic0.c action = request.getAction();
        p013kotlin.jvm.internal.s.h(action);
        commandCenterBackgroundTasker.d(context, action, response);
        Context context2 = this.context;
        ic0.c action2 = request.getAction();
        p013kotlin.jvm.internal.s.h(action2);
        commandCenterBackgroundTasker.e(context2, action2);
        listener.a(response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence r(ic0.q it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return lb0.a.c(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(f fVar, String str, ic0.e eVar, ce0.d dVar, kd0.i iVar) {
        if (fVar.onGoingCommandIds.remove(str)) {
            p(fVar, eVar, "GLOBAL TIMEOUT", null, 2, null);
            ic0.g gVarB = nb0.b.b(eVar, ic0.q.TRANSPORT_NONE, ic0.h.RESULT_TIMEOUT, null, null, null, 56, null);
            fVar.c(eVar);
            fVar.q(eVar, gVarB, dVar);
            iVar.a(fVar.t(eVar, gVarB));
            pa0.d dVar2 = fVar.analyticsService;
            cc0.d dVar3 = cc0.d.SEND_COMMAND_ATTEMPT;
            bb0.b bVar = bb0.b.f16948a;
            dVar2.b(dVar3, v.p(bVar.a(str), bVar.b(eVar), qa0.a.b(), qa0.a.f(gVarB.getResult())));
        }
    }

    private final List<kd0.a> t(ic0.e request, ic0.g response) {
        String strValueOf;
        String strI;
        u5 u5VarD = this.getVehicleData.d(request.getVin());
        if (u5VarD != null) {
            strValueOf = String.valueOf(wb0.e.g(u5VarD));
            strI = wb0.e.i(u5VarD);
        } else {
            strValueOf = "undetermined";
            strI = "undetermined";
        }
        kd0.a.Companion companion = kd0.a.INSTANCE;
        List<kd0.a> listS = v.s(companion.a("result", lb0.a.b(response.getResult())), companion.a("car_api_version", strValueOf), companion.a("car_type", strI));
        if (response.getTransport() != ic0.q.TRANSPORT_NONE) {
            listS.add(companion.a("transport", lb0.a.c(response.getTransport())));
        }
        switch (b.f62379a[response.getTransport().ordinal()]) {
            case 2:
                listS.add(companion.a("in_whitelist", Boolean.valueOf(response.getResult() != ic0.h.RESULT_NOT_IN_WHITELIST)));
            case 1:
            case 3:
            case 5:
            case 6:
                return listS;
            case 4:
                listS.add(companion.a("in_whitelist", Boolean.valueOf(response.getResult() != ic0.h.RESULT_NOT_IN_WHITELIST)));
                return listS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // mb0.a
    @SuppressLint({"CheckResult"})
    public void a(ic0.e request, final ce0.d listener) {
        f fVar;
        List<ic0.q> listC;
        boolean z11;
        p013kotlin.jvm.internal.s.k(request, "request");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        final kd0.i iVarH = this.monitoringService.h(nc0.l.COMMAND, v.e(kd0.a.INSTANCE.a("command", ce0.c.b(request))));
        final String strA = de0.b.a(request);
        ic0.f source = request.getSource();
        if (source == ic0.f.SOURCE_NONE) {
            o(request, "ERROR! Request has no UI_SOURCE source NONE!", com.tesla.logging.d.ERROR);
        }
        String vin = request.getVin();
        if (p013kotlin.text.t.y0(vin)) {
            p(this, request, "does not contain VIN, looking up via vehicle ID...", null, 2, null);
            fVar = this;
            u5 u5VarC = fVar.getVehicleData.c(request.getVehicleId());
            vin = u5VarC != null ? wb0.e.v(u5VarC) : null;
            if (vin == null) {
                fVar.o(request, "is missing VIN, and can't find VIN via Vehicle ID lookup", com.tesla.logging.d.ERROR);
                listener.a(nb0.b.b(request, ic0.q.TRANSPORT_NONE, ic0.h.RESULT_INVALID_COMMAND_REQUEST, null, null, null, 56, null));
                return;
            }
        } else {
            fVar = this;
        }
        String str = vin;
        if (request.o().isEmpty()) {
            pb0.b bVar = fVar.getTransportsList;
            ic0.c action = request.getAction();
            if (action == null) {
                action = new ic0.c(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
            }
            listC = bVar.a(str, action);
            z11 = false;
        } else {
            pb0.b bVar2 = fVar.getTransportsList;
            ic0.c action2 = request.getAction();
            if (action2 == null) {
                action2 = new ic0.c(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
            }
            listC = bVar2.c(action2, request.o());
            z11 = true;
        }
        List<ic0.q> list = listC;
        boolean z12 = z11;
        final ic0.e eVarB = ic0.e.b(request, null, null, list, null, null, false, false, null, str, 0L, false, false, false, false, false, false, 0L, 0L, 0L, 0, null, null, 4194043, null);
        String sourceContext = eVarB.getSourceContext();
        String vin2 = eVarB.getVin();
        String str2 = z12 ? "(overridden)" : "(computed)";
        p(this, eVarB, "entered from " + source + "! sourceContext: " + sourceContext + " " + vin2 + " transports " + str2 + " [" + v.y0(eVarB.o(), null, null, null, 0, null, new wn0.l() { // from class: eb0.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return f.r((ic0.q) obj);
            }
        }, 31, null) + "] " + eVarB.getVehicleId(), null, 2, null);
        cb0.b.f19021a.b(this.context, eVarB);
        this.onGoingCommandIds.add(strA);
        CommandCenterBackgroundTasker commandCenterBackgroundTasker = CommandCenterBackgroundTasker.f55729a;
        Context context = this.context;
        ic0.c action3 = eVarB.getAction();
        p013kotlin.jvm.internal.s.h(action3);
        commandCenterBackgroundTasker.f(context, action3);
        io.reactivex.rxjava3.core.b.l(60L, TimeUnit.SECONDS).h(new cm0.a() { // from class: eb0.d
            @Override // cm0.a
            public final void run() {
                f.s(this.f62347a, strA, eVarB, listener, iVarH);
            }
        });
        List<mb0.a> listN = n(eVarB);
        if (list.contains(ic0.q.TRANSPORT_HERMES) && com.tesla.features.a.a().getHasSignedOapiTransportAndConnectHermesOnDemand()) {
            p(this, eVarB, "triggering on-demand Hermes connection", null, 2, null);
            this.hermes.c0();
        }
        j(this, listN, eVarB, listener, iVarH, 0, null, 48, null);
    }

    @Override // mb0.a
    public void c(ic0.e request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        p(this, request, "cancelling", null, 2, null);
        Iterator<T> it = this.dispatchers.iterator();
        while (it.hasNext()) {
            ((mb0.a) it.next()).c(request);
        }
    }

    @Override // mb0.a
    /* JADX INFO: renamed from: d */
    public ic0.q getTransport() {
        throw new IllegalStateException("Not a valid transport");
    }

    public /* synthetic */ f(Context context, mb0.a aVar, fb0.m mVar, mb0.a aVar2, mb0.a aVar3, pa0.d dVar, be0.e eVar, pb0.b bVar, kd0.e eVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar, mVar, aVar2, (i11 & 16) != 0 ? null : aVar3, dVar, eVar, bVar, (i11 & 256) != 0 ? kd0.e.INSTANCE.a() : eVar2);
    }
}
