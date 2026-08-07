package ua0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.oapi.HttpMethodType;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import com.tesla.oapi.TeslaURLConfig;
import com.tesla.oapi.auth.AuthRepository;
import com.tesla.oapi.auth.OwnerDataModule;
import com.tesla.oapi.auth.TokenResult;
import ga0.GetNearbyChargingSitesLiteQuery;
import ia0.ChargingNearbySitesLiteFragment;
import j$.util.DesugarTimeZone;
import ja0.EnergySvcCoordinateInputType;
import ja0.GetNearbyChargingSitesLiteRequestType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ji.i;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import si.f;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0002\f\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d¨\u0006 "}, d2 = {"Lua0/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lua0/a;", "location", "", "radius", "", "Lua0/d;", "b", "(Lua0/a;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "trtId", "Lorg/json/JSONObject;", "f", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "eventType", "Ljn0/h0;", "e", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "()Landroid/content/Context;", "Lhi/b;", "Lhi/b;", "apolloClient", "c", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f116048d = g.INSTANCE.a("GraphQLHelper");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hi.b apolloClient;

    /* JADX INFO: renamed from: ua0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lua0/b$b;", "Lsi/e;", "<init>", "()V", "Lji/g;", "request", "Lsi/f;", "chain", "Lji/i;", "a", "(Lji/g;Lsi/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljava/lang/String;", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "accessToken", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2500b implements si.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String accessToken;

        public C2500b() {
            this.accessToken = "";
            Object objB = AuthRepository.DefaultImpls.getToken$default(OwnerDataModule.getAuthRepository(), null, false, 2, null).b();
            s.j(objB, "blockingGet(...)");
            TokenResult tokenResult = (TokenResult) objB;
            if (tokenResult instanceof TokenResult.RemoteSuccess) {
                this.accessToken = ((TokenResult.RemoteSuccess) tokenResult).getToken();
                return;
            }
            if (tokenResult instanceof TokenResult.LocalSuccess) {
                this.accessToken = ((TokenResult.LocalSuccess) tokenResult).getToken();
                return;
            }
            if (tokenResult instanceof TokenResult.LocalFailure) {
                g gVar = b.f116048d;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("Error getting access token locally");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                return;
            }
            if (!(tokenResult instanceof TokenResult.RemoteFailure)) {
                throw new NoWhenBranchMatchedException();
            }
            g gVar2 = b.f116048d;
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVar2.getTag();
            String strG2 = gVar2.g("Error getting access token remotely");
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = v0.f(x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
        }

        @Override // si.e
        public Object a(ji.g gVar, f fVar, Continuation<? super i> continuation) {
            return fVar.a(ji.g.f(gVar, null, null, 3, null).a("Authorization", "Bearer " + this.accessToken).a("x-tesla-user-agent", qb0.a.INSTANCE.b().c()).d(), continuation);
        }

        @Override // si.e
        public void dispose() {
            si.e.a.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.app.utils.GraphQLHelper", f = "GraphQLHelper.kt", i = {}, l = {100}, m = "fetchNearbyChargingSitesLite", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f116052n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f116054p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f116052n = obj;
            this.f116054p |= Integer.MIN_VALUE;
            return b.this.b(null, 0.0d, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.app.utils.GraphQLHelper", f = "GraphQLHelper.kt", i = {0}, l = {141}, m = "siteHasQueue", n = {"trtId"}, s = {"I$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f116055n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f116056o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f116058q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f116056o = obj;
            this.f116058q |= Integer.MIN_VALUE;
            return b.this.f(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/tesla/oapi/OwnerResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/tesla/oapi/OwnerResponse;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.app.utils.GraphQLHelper$siteHasQueue$response$1", f = "GraphQLHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super OwnerResponse>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f116059n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f116061p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f116061p = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new e(this.f116061p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f116059n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return SendOwnerRequest.DefaultImpls.execute$default(SendOwnerRequest.INSTANCE.newInstance(b.this.getContext()), HttpMethodType.GET, "api/1/charging/queue", v0.m(x.a("trt_id", String.valueOf(this.f116061p)), x.a("ignore_if_already_in_queue", "true")), null, true, false, 8, null).b();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OwnerResponse> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(Context context) {
        s.k(context, "context");
        this.context = context;
        this.apolloClient = new hi.b.a().j(TeslaURLConfig.INSTANCE.getChargingBaseURL() + "graphql").a(new C2500b()).b();
    }

    public static /* synthetic */ Object c(b bVar, Coordinates coordinates, double d11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            d11 = 0.5d;
        }
        return bVar.b(coordinates, d11, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(Coordinates coordinates, double d11, Continuation<? super List<NearbySupercharger>> continuation) {
        c cVar;
        GetNearbyChargingSitesLiteQuery.Charging charging;
        GetNearbyChargingSitesLiteQuery.NearbySitesLite nearbySitesLite;
        List<GetNearbyChargingSitesLiteQuery.SitesAndDistance> listA;
        ChargingNearbySitesLiteFragment.TrtId trtId;
        ChargingNearbySitesLiteFragment.Centroid centroid;
        Double latitude;
        String value;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f116054p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f116054p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objA = cVar.f116052n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f116054p;
        if (i12 == 0) {
            t.b(objA);
            hi.b bVar = this.apolloClient;
            ii.x.Companion companion = ii.x.INSTANCE;
            hi.a aVarH = bVar.H(new GetNearbyChargingSitesLiteQuery(new GetNearbyChargingSitesLiteRequestType(new EnergySvcCoordinateInputType(companion.a(Boxing.boxDouble(coordinates.getLatitude() + d11)), companion.a(Boxing.boxDouble(coordinates.getLongitude() - d11))), new EnergySvcCoordinateInputType(companion.a(Boxing.boxDouble(coordinates.getLatitude() - d11)), companion.a(Boxing.boxDouble(coordinates.getLongitude() + d11))), new EnergySvcCoordinateInputType(companion.a(Boxing.boxDouble(coordinates.getLatitude())), companion.a(Boxing.boxDouble(coordinates.getLongitude()))), ua0.c.b(this.context), ua0.c.a(this.context), "", null, 64, null)));
            cVar.f116054p = 1;
            objA = aVarH.a(cVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objA);
        }
        ii.g gVar = (ii.g) objA;
        ArrayList arrayList = new ArrayList();
        if (gVar.a()) {
            f116048d.j("Error fetching nearby sites " + gVar.errors);
            return arrayList;
        }
        GetNearbyChargingSitesLiteQuery.Data data = (GetNearbyChargingSitesLiteQuery.Data) gVar.data;
        if (data != null && (charging = data.getCharging()) != null && (nearbySitesLite = charging.getNearbySitesLite()) != null && (listA = nearbySitesLite.a()) != null) {
            for (GetNearbyChargingSitesLiteQuery.SitesAndDistance sitesAndDistance : listA) {
                if (sitesAndDistance != null && (trtId = sitesAndDistance.getChargingNearbySitesLiteFragment().getTrtId()) != null && (centroid = sitesAndDistance.getChargingNearbySitesLiteFragment().getCentroid()) != null && (latitude = centroid.getEnergySvcCoordinateTypeFields().getLatitude()) != null) {
                    double dDoubleValue = latitude.doubleValue();
                    Double longitude = centroid.getEnergySvcCoordinateTypeFields().getLongitude();
                    if (longitude != null) {
                        double dDoubleValue2 = longitude.doubleValue();
                        int value2 = trtId.getValue();
                        Coordinates coordinates2 = new Coordinates(dDoubleValue, dDoubleValue2);
                        ChargingNearbySitesLiteFragment.LocalizedSiteName localizedSiteName = sitesAndDistance.getChargingNearbySitesLiteFragment().getLocalizedSiteName();
                        if (localizedSiteName == null || (value = localizedSiteName.getValue()) == null) {
                            value = "";
                        }
                        arrayList.add(new NearbySupercharger(value2, coordinates2, value, sitesAndDistance.getChargingNearbySitesLiteFragment().getChargingAccessibility() == ja0.c.TESLA_ONLY));
                    }
                }
            }
        }
        f116048d.j("Found " + arrayList.size() + " nearby superchargers");
        return arrayList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final Object e(int i11, String str, Continuation<? super h0> continuation) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            Object objB = SendOwnerRequest.DefaultImpls.execute$default(SendOwnerRequest.INSTANCE.newInstance(this.context), HttpMethodType.POST, "api/1/energy_sites/energy_event", (Map) null, v0.f(x.a("event", v0.m(x.a("type", str), x.a("timestamp", simpleDateFormat.format(new Date())), x.a("value", "{\"trtId\":" + i11 + "}")))), (Map) null, (Map) null, (Integer) null, true, false, 372, (Object) null).b();
            s.j(objB, "blockingGet(...)");
            OwnerResponse ownerResponse = (OwnerResponse) objB;
            if (ownerResponse.isSuccessful()) {
                f116048d.j("Successfully logged geofence event '" + str + "' for trtId=" + i11);
            } else {
                f116048d.n("Failed to log geofence event '" + str + "' for trtId=" + i11 + ": statusCode=" + ownerResponse.getCode());
            }
        } catch (Exception e11) {
            f116048d.d("Error logging geofence event '" + str + "' for trtId=" + i11, e11);
        }
        return h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(int i11, Continuation<? super JSONObject> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f116058q;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f116058q = i12 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objWithContext = dVar.f116056o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = dVar.f116058q;
        try {
            if (i13 == 0) {
                t.b(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                e eVar = new e(i11, null);
                dVar.f116055n = i11;
                dVar.f116058q = 1;
                objWithContext = BuildersKt.withContext(io2, eVar, dVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = dVar.f116055n;
                t.b(objWithContext);
            }
            s.j(objWithContext, "withContext(...)");
            OwnerResponse ownerResponse = (OwnerResponse) objWithContext;
            g gVar = f116048d;
            gVar.j("siteHasQueue check response for trtId=" + i11 + ": statusCode=" + ownerResponse.getCode() + ", response=" + ownerResponse.getResponse());
            if (!ownerResponse.isSuccessful()) {
                gVar.n("siteHasQueue failed with status code: " + ownerResponse.getCode());
                return null;
            }
            JSONObject response = ownerResponse.getResponse();
            JSONObject jSONObjectOptJSONObject = response != null ? response.optJSONObject("response") : null;
            gVar.j("Site " + i11 + " has active queue: " + (jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("active_queue", false) : false));
            return jSONObjectOptJSONObject;
        } catch (Exception e11) {
            f116048d.d("Failed to check if site has queue for trtId=" + i11, e11);
            return null;
        }
    }
}
