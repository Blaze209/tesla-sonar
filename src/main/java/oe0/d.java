package oe0;

import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import cm0.h;
import com.tesla.oapi.OwnerAPIError;
import com.tesla.oapi.OwnerApiEndpoint;
import com.tesla.oapi.OwnerApiEndpoints;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import com.tesla.oapi.auth.AuthRepository;
import com.tesla.widget.data.OwnerApiErrorException;
import fc0.u5;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jn0.h0;
import jn0.x;
import kotlinx.coroutines.rx3.RxAwaitKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u0004\u0018\u00010\f*\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J \u00102\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00101\u001a\u00020 H\u0096@¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b4\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0096@¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b8\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010<R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020-0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010>¨\u0006@"}, d2 = {"Loe0/d;", "Loe0/e;", "Ltd0/m;", "realmHelper", "Lcom/tesla/oapi/auth/AuthRepository;", "authRepository", "Lcom/tesla/oapi/OwnerApiEndpoints;", "ownerApiEndpoints", "Lcom/tesla/oapi/SendOwnerRequest;", "ownerApiSender", "<init>", "(Ltd0/m;Lcom/tesla/oapi/auth/AuthRepository;Lcom/tesla/oapi/OwnerApiEndpoints;Lcom/tesla/oapi/SendOwnerRequest;)V", "Lxc0/a;", "q", "(Lxc0/a;)Lxc0/a;", "", "vin", "cachedVehicle", "r", "(Ljava/lang/String;Lxc0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/tesla/oapi/OwnerResponse;", "p", "(Lcom/tesla/oapi/OwnerResponse;Ljava/lang/String;)Lxc0/a;", "", "appWidgetId", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/String;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(ILjava/lang/String;)V", "f", "(I)V", "", "c", "()Z", "b", "()I", "", "Lne0/c;", "g", "(Ljava/lang/String;)Ljava/util/List;", "", "appWidgetIds", "j", "(Ljava/lang/String;[I)I", "Lxc0/b;", "bleStatus", "a", "(Ljava/lang/String;Lxc0/b;)V", "withCache", "h", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "Ltd0/m;", "Lcom/tesla/oapi/auth/AuthRepository;", "Lcom/tesla/oapi/OwnerApiEndpoints;", "Lcom/tesla/oapi/SendOwnerRequest;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "vehicleBleCaches", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements oe0.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<ne0.c> f97216g = v.p(ne0.c.LOCK, ne0.c.CLIMATE_TOGGLE, ne0.c.CHARGE_PORT, ne0.c.FRUNK);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m realmHelper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AuthRepository authRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final OwnerApiEndpoints ownerApiEndpoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SendOwnerRequest ownerApiSender;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, xc0.b> vehicleBleCaches;

    /* JADX INFO: renamed from: oe0.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Loe0/d$a;", "", "<init>", "()V", "", "Lne0/c;", "DEFAULT_WIDGET_COMMANDS", "Ljava/util/List;", "a", "()Ljava/util/List;", "", "KEY_WIDGET_COMMAND_LAYOUT", "Ljava/lang/String;", "KEY_QUICK_CONTROL_LAYOUT", "", "WIDGET_BUTTON_NUMBER", "I", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<ne0.c> a() {
            return d.f97216g;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.widget.data.TeslaVehicleRepository", f = "TeslaVehicleRepository.kt", i = {0, 0, 0}, l = {108, 110, 112}, m = "getVehicle", n = {"this", "vin", "withCache"}, s = {"L$0", "L$1", "Z$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f97222n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f97223o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f97224p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f97225q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f97227s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97225q = obj;
            this.f97227s |= Integer.MIN_VALUE;
            return d.this.h(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T, R> implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f97229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ xc0.a f97230c;

        c(String str, xc0.a aVar) {
            this.f97229b = str;
            this.f97230c = aVar;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xc0.a apply(OwnerResponse response) throws OwnerApiErrorException {
            s.k(response, "response");
            OwnerAPIError error = response.getError();
            if (error != null) {
                throw new OwnerApiErrorException(error);
            }
            xc0.a aVarP = d.this.p(response, this.f97229b);
            if (aVarP != null) {
                xc0.a aVar = this.f97230c;
                if (aVar != null) {
                    aVarP = xc0.a.b(aVarP, null, aVar.getSnapshot_hash(), false, null, null, null, null, false, null, null, null, null, 4093, null);
                }
            } else {
                aVarP = null;
            }
            s.h(aVarP);
            return aVarP;
        }
    }

    /* JADX INFO: renamed from: oe0.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class C2082d<T, R> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xc0.a f97231a;

        C2082d(xc0.a aVar) {
            this.f97231a = aVar;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y<? extends xc0.a> apply(Throwable error) {
            u uVarM;
            s.k(error, "error");
            if (error instanceof OwnerApiErrorException) {
                u uVarI = u.i(error);
                s.h(uVarI);
                return uVarI;
            }
            xc0.a aVar = this.f97231a;
            if (aVar != null && (uVarM = u.m(aVar)) != null) {
                return uVarM;
            }
            u uVarI2 = u.i(new RuntimeException("No cachedVehicle"));
            s.j(uVarI2, "error(...)");
            return uVarI2;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e<T> implements cm0.f {
        e() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(xc0.a it) {
            s.k(it, "it");
            oe0.c.f(d.this.realmHelper, it);
        }
    }

    public d(m realmHelper, AuthRepository authRepository, OwnerApiEndpoints ownerApiEndpoints, SendOwnerRequest ownerApiSender) {
        s.k(realmHelper, "realmHelper");
        s.k(authRepository, "authRepository");
        s.k(ownerApiEndpoints, "ownerApiEndpoints");
        s.k(ownerApiSender, "ownerApiSender");
        this.realmHelper = realmHelper;
        this.authRepository = authRepository;
        this.ownerApiEndpoints = ownerApiEndpoints;
        this.ownerApiSender = ownerApiSender;
        f.f97233a.a(realmHelper);
        this.vehicleBleCaches = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xc0.a p(OwnerResponse ownerResponse, String str) throws OwnerApiErrorException {
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        OwnerAPIError error = ownerResponse.getError();
        if (error != null) {
            throw new OwnerApiErrorException(error);
        }
        JSONObject response = ownerResponse.getResponse();
        if (response == null || (jSONObjectOptJSONObject = response.optJSONObject("response")) == null) {
            return null;
        }
        xc0.a aVarB = a.f97213a.b(jSONObjectOptJSONObject, str);
        if (aVarB == null || (strOptString = aVarB.getVin()) == null) {
            strOptString = jSONObjectOptJSONObject.optString("vin");
        }
        m mVar = this.realmHelper;
        s.h(strOptString);
        xc0.a aVarB2 = oe0.c.b(mVar, strOptString);
        u5 vehicle_data = aVarB2 != null ? aVarB2.getVehicle_data() : null;
        if (vehicle_data != null) {
            if (wb0.e.N(vehicle_data, aVarB != null ? aVarB.getVehicle_data() : null, false, 2, null)) {
                me0.c.a().j("Local cached data fresher");
                return aVarB2;
            }
        }
        me0.c.a().j("OAPI data fresher");
        return aVarB;
    }

    private final xc0.a q(xc0.a aVar) {
        xc0.b bVar = this.vehicleBleCaches.get(aVar.getVin());
        return bVar == null ? aVar : xc0.a.b(aVar, null, null, false, null, null, bVar, null, false, null, null, null, null, 4063, null);
    }

    private final Object r(String str, xc0.a aVar, Continuation<? super xc0.a> continuation) {
        OwnerApiEndpoint endpoint = this.ownerApiEndpoints.getEndpoint("VEHICLE_DATA");
        s.h(endpoint);
        u uVarF = SendOwnerRequest.DefaultImpls.execute$default(this.ownerApiSender, endpoint.getMethod(), endpoint.getUri(), v0.f(x.a("vin", str)), new JSONObject(), v0.m(x.a("endpoints", "vehicle_config;vehicle_state;climate_state;charge_state;gui_settings;drive_state;vehicle_data_combo"), x.a("let_sleep", Boxing.boxBoolean(true))), (Map) null, (Integer) null, endpoint.isAuthenticated(), false, 352, (Object) null).n(new c(str, aVar)).p(new C2082d(aVar)).f(new e());
        s.j(uVarF, "doOnSuccess(...)");
        return RxAwaitKt.await(uVarF, continuation);
    }

    @Override // oe0.e
    public void a(String vin, xc0.b bleStatus) {
        s.k(vin, "vin");
        s.k(bleStatus, "bleStatus");
        this.vehicleBleCaches.put(vin, bleStatus);
    }

    @Override // oe0.e
    public int b() {
        return oe0.c.d(this.realmHelper, true).size();
    }

    @Override // oe0.e
    public boolean c() {
        return this.authRepository.getToken() != null;
    }

    @Override // oe0.e
    public void d(int appWidgetId, String vin) {
        s.k(vin, "vin");
        oe0.b.f(this.realmHelper, appWidgetId, vin);
    }

    @Override // oe0.e
    public Object e(Continuation<? super List<xc0.a>> continuation) {
        List<xc0.a> listE = oe0.c.e(this.realmHelper, false, 1, null);
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        for (xc0.a aVarB : listE) {
            String strH = this.realmHelper.h("V_" + aVarB.getVehicle_id());
            if (strH != null) {
                String strOptString = new JSONObject(strH).optString("snapshotConfigHash");
                if (!TextUtils.isEmpty(strOptString)) {
                    s.h(strOptString);
                    aVarB = xc0.a.b(aVarB, null, strOptString, false, null, null, null, null, false, null, null, null, null, 4093, null);
                }
            }
            arrayList.add(aVarB);
        }
        return arrayList;
    }

    @Override // oe0.e
    public void f(int appWidgetId) {
        oe0.b.b(this.realmHelper, appWidgetId);
    }

    @Override // oe0.e
    public List<ne0.c> g(String vin) {
        s.k(vin, "vin");
        try {
            String strN = be0.e.INSTANCE.a().n(vin);
            if (strN == null) {
                return f97216g;
            }
            String strH = this.realmHelper.h("persist:vehiclePresentation");
            if (strH == null) {
                return f97216g;
            }
            JSONArray jSONArray = new JSONObject(new JSONObject(strH).getString("quickControlsLayout")).getJSONArray(strN);
            if (jSONArray.length() < 4) {
                return f97216g;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String string = jSONArray.getString(i11);
                s.j(string, "getString(...)");
                ne0.c cVarE = ne0.d.e(string);
                if (cVarE == null) {
                    return f97216g;
                }
                arrayList.add(cVarE);
            }
            return arrayList;
        } catch (Exception unused) {
            return f97216g;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r10 == r1) goto L31;
     */
    @Override // oe0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r8, boolean r9, p013kotlin.coroutines.Continuation<? super xc0.a> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof oe0.d.b
            if (r0 == 0) goto L13
            r0 = r10
            oe0.d$b r0 = (oe0.d.b) r0
            int r1 = r0.f97227s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97227s = r1
            goto L18
        L13:
            oe0.d$b r0 = new oe0.d$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f97225q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f97227s
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L57
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.f97222n
            oe0.d r8 = (oe0.d) r8
            jn0.t.b(r10)
            goto L92
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.f97222n
            oe0.d r8 = (oe0.d) r8
            jn0.t.b(r10)
            goto L81
        L44:
            boolean r9 = r0.f97224p
            java.lang.Object r8 = r0.f97223o
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.f97222n
            oe0.d r2 = (oe0.d) r2
            jn0.t.b(r10)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r10
            r10 = r6
            goto L6d
        L57:
            jn0.t.b(r10)
            r0.f97222n = r7
            r0.f97223o = r8
            r0.f97224p = r9
            r0.f97227s = r5
            java.lang.Object r10 = r7.l(r8, r0)
            if (r10 != r1) goto L69
            goto L91
        L69:
            r2 = r10
            r10 = r9
            r9 = r8
            r8 = r7
        L6d:
            xc0.a r2 = (xc0.a) r2
            r5 = 0
            if (r10 == 0) goto L85
            if (r2 != 0) goto L95
            r0.f97222n = r8
            r0.f97223o = r5
            r0.f97227s = r4
            java.lang.Object r10 = r8.r(r9, r2, r0)
            if (r10 != r1) goto L81
            goto L91
        L81:
            r2 = r10
            xc0.a r2 = (xc0.a) r2
            goto L95
        L85:
            r0.f97222n = r8
            r0.f97223o = r5
            r0.f97227s = r3
            java.lang.Object r10 = r8.r(r9, r2, r0)
            if (r10 != r1) goto L92
        L91:
            return r1
        L92:
            r2 = r10
            xc0.a r2 = (xc0.a) r2
        L95:
            xc0.a r8 = r8.q(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oe0.d.h(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // oe0.e
    public String i(int appWidgetId) {
        return oe0.b.d(this.realmHelper, appWidgetId);
    }

    @Override // oe0.e
    public int j(String vin, int[] appWidgetIds) {
        Object obj;
        Integer numValueOf;
        s.k(vin, "vin");
        s.k(appWidgetIds, "appWidgetIds");
        int length = appWidgetIds.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                numValueOf = null;
                break;
            }
            int i12 = appWidgetIds[i11];
            if (s.f(i(i12), vin)) {
                numValueOf = Integer.valueOf(i12);
                break;
            }
            i11++;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (iIntValue == 0) {
            return 0;
        }
        for (Object obj2 : oe0.c.d(this.realmHelper, true)) {
            if (s.f(((xc0.a) obj2).getVin(), vin)) {
                obj = obj2;
                break;
            }
        }
        if (((xc0.a) obj) == null) {
            return 0;
        }
        return iIntValue;
    }

    @Override // oe0.e
    public Object k(Continuation<? super h0> continuation) {
        oe0.c.a(this.realmHelper);
        return h0.f84049a;
    }

    @Override // oe0.e
    public Object l(String str, Continuation<? super xc0.a> continuation) {
        xc0.a aVarB = oe0.c.b(this.realmHelper, str);
        if (aVarB != null) {
            return q(aVarB);
        }
        return null;
    }
}
