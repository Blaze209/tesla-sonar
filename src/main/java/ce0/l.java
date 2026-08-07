package ce0;

import android.util.LruCache;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.oapi.CommandActionsKt;
import ic0.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.w0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u000e*\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010 J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010 J\u0017\u0010*\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\fJ\u0019\u0010/\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010&J\u001f\u00105\u001a\u0002042\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u0002042\u0006\u00108\u001a\u0002072\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b9\u0010:J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ!\u0010C\u001a\u0004\u0018\u0001042\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR&\u0010I\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010HR&\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010HR&\u0010K\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010HR,\u0010L\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\b0\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010HR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010HR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010HR \u0010R\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010Q¨\u0006S"}, d2 = {"Lce0/l;", "Lce0/h;", "Lee0/a;", "sessionInfoManager", "Lic0/q;", "transport", "<init>", "(Lee0/a;Lic0/q;)V", "", "commandId", "", "u", "(Ljava/lang/String;)Z", "requestId", "Ljn0/h0;", "y", "(Ljava/lang/String;)V", "Lsc0/b;", "domain", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lce0/j;", "r", "(Lsc0/b;)Ljava/util/concurrent/ConcurrentHashMap;", "vin", "s", "(Lsc0/b;Ljava/lang/String;)Ljava/util/concurrent/ConcurrentLinkedDeque;", "type", "request", "v", "(Ljava/lang/String;Ljava/lang/String;Lce0/j;)V", "w", "(Lce0/j;)V", "", "sourcePublicKey", "z", "(Lsc0/b;Ljava/lang/String;[B)Ljava/util/concurrent/ConcurrentLinkedDeque;", "g", "(Ljava/lang/String;)Lce0/j;", DateTokenConverter.CONVERTER_KEY, "n", "m", "t", "(Ljava/lang/String;)Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)Lce0/j;", "j", "k", "Lkc0/c;", "commandMessage", "Lcom/tesla/logging/g;", "logger", "Lce0/h$b;", "e", "(Lkc0/c;Lcom/tesla/logging/g;)Lce0/h$b;", "Lsc0/h;", "routable", "l", "(Lsc0/h;Lcom/tesla/logging/g;)Lce0/h$b;", "", "Lce0/a;", "a", "(Lsc0/b;)Ljava/util/List;", "", "counter", "f", "(Lce0/j;J)V", "b", "(Ljava/lang/String;J)Lce0/h$b;", "Lee0/a;", "c", "Lic0/q;", "Ljava/util/concurrent/ConcurrentHashMap;", "vinToVCSECRequests", "vinToCarApiRequests", "vinToAuthDRequests", "vinToCounterToRequestId", "h", "requestIdToRequest", "commandIdToRequest", "Landroid/util/LruCache;", "Landroid/util/LruCache;", "removedRequestIds", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements h {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final com.tesla.logging.g f19141l = com.tesla.logging.g.INSTANCE.a("TeslaRequestManager");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final LruCache<String, String> f19142m = new LruCache<>(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ee0.a sessionInfoManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q transport;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, ConcurrentLinkedDeque<TeslaCommandRequest>> vinToVCSECRequests;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, ConcurrentLinkedDeque<TeslaCommandRequest>> vinToCarApiRequests;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, ConcurrentLinkedDeque<TeslaCommandRequest>> vinToAuthDRequests;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, ConcurrentHashMap<Long, String>> vinToCounterToRequestId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, TeslaCommandRequest> requestIdToRequest;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, TeslaCommandRequest> commandIdToRequest;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final LruCache<String, Boolean> removedRequestIds;

    /* JADX INFO: renamed from: ce0.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lce0/l$a;", "", "<init>", "()V", "Lcom/tesla/logging/g;", "b", "()Lcom/tesla/logging/g;", "threadedLogger", "", "TAG", "Ljava/lang/String;", "logger", "Lcom/tesla/logging/g;", "Landroid/util/LruCache;", "requestIdToVin", "Landroid/util/LruCache;", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.tesla.logging.g b() {
            com.tesla.logging.g gVar = l.f19141l;
            String name = Thread.currentThread().getName();
            s.j(name, "getName(...)");
            return gVar.p(name);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19152a;

        static {
            int[] iArr = new int[sc0.b.values().length];
            try {
                iArr[sc0.b.DOMAIN_VEHICLE_SECURITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sc0.b.DOMAIN_INFOTAINMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sc0.b.DOMAIN_AUTHD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sc0.b.DOMAIN_BROADCAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[sc0.b.DOMAIN_ENERGY_DEVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[sc0.b.DOMAIN_ENERGY_DEVICE_AUTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f19152a = iArr;
        }
    }

    public l(ee0.a sessionInfoManager, q transport) {
        s.k(sessionInfoManager, "sessionInfoManager");
        s.k(transport, "transport");
        this.sessionInfoManager = sessionInfoManager;
        this.transport = transport;
        this.vinToVCSECRequests = new ConcurrentHashMap<>();
        this.vinToCarApiRequests = new ConcurrentHashMap<>();
        this.vinToAuthDRequests = new ConcurrentHashMap<>();
        this.vinToCounterToRequestId = new ConcurrentHashMap<>();
        this.requestIdToRequest = new ConcurrentHashMap<>();
        this.commandIdToRequest = new ConcurrentHashMap<>();
        this.removedRequestIds = new LruCache<>(25);
    }

    private static final h.Request q(l lVar, String str) {
        TeslaCommandRequest teslaCommandRequestD = lVar.d(str);
        lVar.v("request_txid", str, teslaCommandRequestD);
        return new h.Request(str, teslaCommandRequestD);
    }

    private final ConcurrentHashMap<String, ConcurrentLinkedDeque<TeslaCommandRequest>> r(sc0.b domain) {
        switch (b.f19152a[domain.ordinal()]) {
            case 1:
                return this.vinToVCSECRequests;
            case 2:
                return this.vinToCarApiRequests;
            case 3:
                return this.vinToAuthDRequests;
            case 4:
            case 5:
            case 6:
                throw new IllegalArgumentException(domain + " not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final ConcurrentLinkedDeque<TeslaCommandRequest> s(sc0.b domain, String vin) {
        ConcurrentLinkedDeque<TeslaCommandRequest> concurrentLinkedDequePutIfAbsent;
        ConcurrentLinkedDeque<TeslaCommandRequest> concurrentLinkedDequePutIfAbsent2;
        ConcurrentLinkedDeque<TeslaCommandRequest> concurrentLinkedDequePutIfAbsent3;
        switch (b.f19152a[domain.ordinal()]) {
            case 1:
                ConcurrentHashMap<String, ConcurrentLinkedDeque<TeslaCommandRequest>> concurrentHashMap = this.vinToVCSECRequests;
                ConcurrentLinkedDeque<TeslaCommandRequest> concurrentLinkedDeque = concurrentHashMap.get(vin);
                if (concurrentLinkedDeque == null && (concurrentLinkedDequePutIfAbsent = concurrentHashMap.putIfAbsent(vin, (concurrentLinkedDeque = new ConcurrentLinkedDeque<>()))) != null) {
                    concurrentLinkedDeque = concurrentLinkedDequePutIfAbsent;
                }
                s.h(concurrentLinkedDeque);
                return concurrentLinkedDeque;
            case 2:
                ConcurrentHashMap<String, ConcurrentLinkedDeque<TeslaCommandRequest>> concurrentHashMap2 = this.vinToCarApiRequests;
                ConcurrentLinkedDeque<TeslaCommandRequest> concurrentLinkedDeque2 = concurrentHashMap2.get(vin);
                if (concurrentLinkedDeque2 == null && (concurrentLinkedDequePutIfAbsent2 = concurrentHashMap2.putIfAbsent(vin, (concurrentLinkedDeque2 = new ConcurrentLinkedDeque<>()))) != null) {
                    concurrentLinkedDeque2 = concurrentLinkedDequePutIfAbsent2;
                }
                s.h(concurrentLinkedDeque2);
                return concurrentLinkedDeque2;
            case 3:
                ConcurrentHashMap<String, ConcurrentLinkedDeque<TeslaCommandRequest>> concurrentHashMap3 = this.vinToAuthDRequests;
                ConcurrentLinkedDeque<TeslaCommandRequest> concurrentLinkedDeque3 = concurrentHashMap3.get(vin);
                if (concurrentLinkedDeque3 == null && (concurrentLinkedDequePutIfAbsent3 = concurrentHashMap3.putIfAbsent(vin, (concurrentLinkedDeque3 = new ConcurrentLinkedDeque<>()))) != null) {
                    concurrentLinkedDeque3 = concurrentLinkedDequePutIfAbsent3;
                }
                s.h(concurrentLinkedDeque3);
                return concurrentLinkedDeque3;
            case 4:
            case 5:
            case 6:
                throw new IllegalArgumentException(domain + " not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean u(String commandId) {
        TeslaCommandRequest teslaCommandRequest = this.commandIdToRequest.get(commandId);
        if (teslaCommandRequest != null) {
            return (CommandActionsKt.isDataSubscription(teslaCommandRequest.l()) || teslaCommandRequest.l0()) ? false : true;
        }
        return true;
    }

    private final void v(String type, String requestId, TeslaCommandRequest request) {
        if (request != null || j(requestId) || requestId.length() <= 0) {
            return;
        }
        com.tesla.logging.g gVar = f19141l;
        String str = type + " " + requestId + " not associated with any request";
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g(str);
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
    }

    private final void w(TeslaCommandRequest teslaCommandRequest) {
        teslaCommandRequest.y0(true);
        teslaCommandRequest.w0(ic0.j.FETCHING_SESSION_INFO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence x(TeslaCommandRequest teslaCommandRequest) {
        return c.b(teslaCommandRequest.getRequest());
    }

    private final void y(String requestId) {
        if (this.requestIdToRequest.remove(requestId) != null) {
            synchronized (this.removedRequestIds) {
                this.removedRequestIds.put(requestId, Boolean.TRUE);
            }
        }
    }

    @Override // ce0.h
    public List<a> a(sc0.b domain) {
        sc0.b domain2 = domain;
        s.k(domain2, "domain");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ConcurrentLinkedDeque<TeslaCommandRequest>> entry : r(domain).entrySet()) {
            String key = entry.getKey();
            Iterator<TeslaCommandRequest> it = entry.getValue().iterator();
            s.j(it, "iterator(...)");
            while (it.hasNext()) {
                TeslaCommandRequest next = it.next();
                if (!next.getFinished()) {
                    if (next.M() && !this.sessionInfoManager.l(domain2, next.getSourcePublicKey(), key) && !s.f(next.getIsLegacyBle(), Boolean.TRUE)) {
                        if (this.sessionInfoManager.c(key, next.getSourcePublicKey(), domain2, this.transport)) {
                            INSTANCE.b().a("not sending requests while fetching session info");
                        } else {
                            ic0.e request = next.getRequest();
                            arrayList.add(new a.SessionInfoRequest(domain2, key, request.getSource(), request.getLetSleep(), next, next.getSourcePublicKey()));
                            s.h(next);
                            w(next);
                            while (it.hasNext()) {
                                TeslaCommandRequest next2 = it.next();
                                s.j(next2, "next(...)");
                                w(next2);
                            }
                            INSTANCE.b().a("session info required before we can continue");
                        }
                        domain2 = domain;
                        break;
                    }
                    key = key;
                    if (next.M()) {
                        boolean zI = this.sessionInfoManager.i(key, next.getSourcePublicKey(), domain, this.transport, next.q());
                        domain2 = domain;
                        if (!zI) {
                            INSTANCE.b().a("gated: waiting for in-flight signed command response");
                            break;
                        }
                    } else {
                        domain2 = domain;
                    }
                    it.remove();
                    s.h(next);
                    arrayList.add(new a.Request(next));
                } else {
                    INSTANCE.b().a("dropping finished request " + next.o());
                    it.remove();
                }
            }
        }
        com.tesla.logging.g gVarB = INSTANCE.b();
        ConcurrentHashMap<String, ConcurrentLinkedDeque<TeslaCommandRequest>> concurrentHashMapR = r(domain);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<String, ConcurrentLinkedDeque<TeslaCommandRequest>>> it2 = concurrentHashMapR.entrySet().iterator();
        while (it2.hasNext()) {
            v.E(arrayList2, it2.next().getValue());
        }
        gVarB.a("internal requests remaining " + domain2 + ": " + v.y0(arrayList2, null, null, null, 0, null, new wn0.l() { // from class: ce0.k
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return l.x((TeslaCommandRequest) obj);
            }
        }, 31, null));
        return arrayList;
    }

    @Override // ce0.h
    public h.Request b(String vin, long counter) {
        String str;
        s.k(vin, "vin");
        ConcurrentHashMap<Long, String> concurrentHashMap = this.vinToCounterToRequestId.get(vin);
        if (concurrentHashMap == null || (str = concurrentHashMap.get(Long.valueOf(counter))) == null) {
            return null;
        }
        return new h.Request(str, d(str));
    }

    @Override // ce0.h
    public TeslaCommandRequest d(String requestId) {
        s.k(requestId, "requestId");
        return this.requestIdToRequest.get(requestId);
    }

    @Override // ce0.h
    public h.Request e(kc0.c commandMessage, com.tesla.logging.g logger) {
        okio.k protobuf_message_as_bytes;
        s.k(commandMessage, "commandMessage");
        s.k(logger, "logger");
        kc0.a aVarA = kc0.a.INSTANCE.a(commandMessage.getCommand_type());
        kc0.g gVarA = kc0.g.INSTANCE.a(commandMessage.getStatus_code());
        String strK = commandMessage.getRequest_txid().K();
        if (s.f(commandMessage.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String(), okio.k.f97943e)) {
            if (gVarA != kc0.g.STATUS_CODE_APPLICATION_OK) {
                return q(this, strK);
            }
            logger.a("empty payload && APPLICATION_OK, returning null request");
            return new h.Request(null, null);
        }
        if (aVarA == kc0.a.COMMAND_TYPE_SIGNED_COMMAND_RESPONSE && gVarA == kc0.g.STATUS_CODE_APPLICATION_OK) {
            try {
                sc0.h hVarDecode = sc0.h.f111089m.decode(commandMessage.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String());
                h.Request requestL = l(hVarDecode, logger);
                if (requestL.c() == null) {
                    sc0.a from_destination = hVarDecode.getFrom_destination();
                    if ((from_destination != null ? from_destination.getDomain() : null) == sc0.b.DOMAIN_VEHICLE_SECURITY && (protobuf_message_as_bytes = hVarDecode.getProtobuf_message_as_bytes()) != null && w0.f118956z.decode(protobuf_message_as_bytes).getWhitelistInfo() != null) {
                        return q(this, strK);
                    }
                }
                return requestL;
            } catch (Exception e11) {
                logger.d("Error processing signed command response", e11);
            }
        }
        return q(this, strK);
    }

    @Override // ce0.h
    public void f(TeslaCommandRequest request, long counter) {
        ConcurrentHashMap<Long, String> concurrentHashMapPutIfAbsent;
        s.k(request, "request");
        ConcurrentHashMap<String, ConcurrentHashMap<Long, String>> concurrentHashMap = this.vinToCounterToRequestId;
        String vin = request.getVin();
        ConcurrentHashMap<Long, String> concurrentHashMap2 = concurrentHashMap.get(vin);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(vin, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap2.put(Long.valueOf(counter), request.I());
    }

    @Override // ce0.h
    public TeslaCommandRequest g(String commandId) {
        s.k(commandId, "commandId");
        return this.commandIdToRequest.get(commandId);
    }

    @Override // ce0.h
    public TeslaCommandRequest i(String requestId, String commandId) {
        s.k(requestId, "requestId");
        s.k(commandId, "commandId");
        if (!u(commandId)) {
            return null;
        }
        TeslaCommandRequest teslaCommandRequestRemove = this.commandIdToRequest.remove(commandId);
        y(requestId);
        return teslaCommandRequestRemove;
    }

    @Override // ce0.h
    public boolean j(String requestId) {
        boolean zF;
        s.k(requestId, "requestId");
        synchronized (this.removedRequestIds) {
            zF = s.f(this.removedRequestIds.get(requestId), Boolean.TRUE);
        }
        return zF;
    }

    @Override // ce0.h
    public TeslaCommandRequest k(String commandId) {
        String strI;
        s.k(commandId, "commandId");
        if (!u(commandId)) {
            return null;
        }
        TeslaCommandRequest teslaCommandRequestRemove = this.commandIdToRequest.remove(commandId);
        if (teslaCommandRequestRemove != null && (strI = teslaCommandRequestRemove.I()) != null) {
            y(strI);
        }
        return teslaCommandRequestRemove;
    }

    @Override // ce0.h
    public h.Request l(sc0.h routable, com.tesla.logging.g logger) {
        s.k(routable, "routable");
        s.k(logger, "logger");
        String strB = id0.d.b(routable, logger, false, 2, null);
        TeslaCommandRequest teslaCommandRequestD = d(strB);
        v("request_uuid", strB, teslaCommandRequestD);
        return new h.Request(strB, teslaCommandRequestD);
    }

    @Override // ce0.h
    public void m(TeslaCommandRequest request) {
        s.k(request, "request");
        INSTANCE.b().j("associating request " + request.I() + " with " + request.o());
        this.commandIdToRequest.put(request.q(), request);
        this.requestIdToRequest.put(request.I(), request);
        LruCache<String, String> lruCache = f19142m;
        synchronized (lruCache) {
            lruCache.put(request.I(), request.getVin());
        }
    }

    @Override // ce0.h
    public void n(TeslaCommandRequest request) {
        Object next;
        s.k(request, "request");
        ConcurrentLinkedDeque<TeslaCommandRequest> concurrentLinkedDequeS = s(CommandActionsKt.getDomain(request.l()), request.getVin());
        Iterator<T> it = concurrentLinkedDequeS.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((TeslaCommandRequest) next).I(), request.I()));
        if (next == null) {
            m(request);
            if (request.o0()) {
                concurrentLinkedDequeS.addFirst(request);
                return;
            } else {
                concurrentLinkedDequeS.addLast(request);
                return;
            }
        }
        com.tesla.logging.g gVarB = INSTANCE.b();
        String str = "request `" + c.b(request.getRequest()) + "` already exists in manager, ignoring...";
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVarB.getTag();
        String strG = gVarB.g(str);
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
    }

    public final String t(String requestId) {
        String str;
        s.k(requestId, "requestId");
        LruCache<String, String> lruCache = f19142m;
        synchronized (lruCache) {
            str = lruCache.get(requestId);
        }
        return str;
    }

    @Override // ce0.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public ConcurrentLinkedDeque<TeslaCommandRequest> c(sc0.b domain, String vin, byte[] sourcePublicKey) {
        s.k(domain, "domain");
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        ConcurrentLinkedDeque<TeslaCommandRequest> concurrentLinkedDeque = r(domain).get(vin);
        ConcurrentLinkedDeque<TeslaCommandRequest> concurrentLinkedDeque2 = new ConcurrentLinkedDeque<>();
        Iterator<TeslaCommandRequest> it = concurrentLinkedDeque != null ? concurrentLinkedDeque.iterator() : null;
        while (it != null && it.hasNext()) {
            TeslaCommandRequest next = it.next();
            if (Arrays.equals(next.getSourcePublicKey(), sourcePublicKey)) {
                concurrentLinkedDeque2.add(next);
                it.remove();
            }
        }
        return concurrentLinkedDeque2;
    }
}
