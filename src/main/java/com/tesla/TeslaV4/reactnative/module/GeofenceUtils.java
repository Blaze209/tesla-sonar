package com.tesla.TeslaV4.reactnative.module;

import android.location.Location;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import ua0.Coordinates;
import ua0.NearbySupercharger;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b#\u0010\u001cJ\u001f\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b(\u0010&J/\u0010*\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b,\u0010\u001fJ\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b-\u0010\u001cJ\u001f\u0010.\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b.\u0010\u001fR\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/GeofenceUtils;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "trtId", "", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "", "name", "", "teslaOnly", "Lcom/facebook/react/bridge/WritableMap;", "superchargerSiteToMap", "(IDDLjava/lang/String;Ljava/lang/Boolean;)Lcom/facebook/react/bridge/WritableMap;", "getName", "()Ljava/lang/String;", "lat", "lng", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "fetchNearbySuperchargerSitesLite", "(DDLcom/facebook/react/bridge/Promise;)V", "startSuperchargerGeofenceMonitoring", "(Lcom/facebook/react/bridge/Promise;)V", "stopSuperchargerGeofenceMonitoring", "siteHasQueue", "(ILcom/facebook/react/bridge/Promise;)V", ImagesContract.URL, "downloadSuperchargerDB", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getSuperchargerGeofenceManagerConfig", "useLocal", "setUseLocalSuperchargerDB", "(ZLcom/facebook/react/bridge/Promise;)V", "enable", "setEnableDebugUserMovementNotification", "radiusKm", "findNearbySuperchargers", "(DDDLcom/facebook/react/bridge/Promise;)V", "postSuperchargerNotification", "getCurrentLocation", "getDistanceToSuperchargerKm", "Lua0/b;", "graphQLHelper", "Lua0/b;", "getGraphQLHelper", "()Lua0/b;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeofenceUtils extends ReactContextBaseJavaModule {
    private final ua0.b graphQLHelper;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.GeofenceUtils$downloadSuperchargerDB$1", f = "GeofenceUtils.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55611n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f55613p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f55614q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Promise promise, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f55613p = str;
            this.f55614q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return GeofenceUtils.this.new a(this.f55613p, this.f55614q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f55611n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    com.tesla.geofence.supercharger.b.Companion companion = com.tesla.geofence.supercharger.b.INSTANCE;
                    ReactApplicationContext reactApplicationContext = GeofenceUtils.this.getReactApplicationContext();
                    p013kotlin.jvm.internal.s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    com.tesla.geofence.supercharger.b bVarA = companion.a(reactApplicationContext);
                    String str = this.f55613p;
                    this.f55611n = 1;
                    if (bVarA.i(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                this.f55614q.resolve(null);
            } catch (Exception e11) {
                this.f55614q.reject("DOWNLOAD_DB_ERROR", e11.getLocalizedMessage(), e11);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.GeofenceUtils$fetchNearbySuperchargerSitesLite$1", f = "GeofenceUtils.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55615n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ double f55617p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ double f55618q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Promise f55619r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(double d11, double d12, Promise promise, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f55617p = d11;
            this.f55618q = d12;
            this.f55619r = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return GeofenceUtils.this.new b(this.f55617p, this.f55618q, this.f55619r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objC;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f55615n;
            if (i11 == 0) {
                jn0.t.b(obj);
                ua0.b graphQLHelper = GeofenceUtils.this.getGraphQLHelper();
                Coordinates coordinates = new Coordinates(this.f55617p, this.f55618q);
                this.f55615n = 1;
                objC = ua0.b.c(graphQLHelper, coordinates, 0.0d, this, 2, null);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objC = obj;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            GeofenceUtils geofenceUtils = GeofenceUtils.this;
            for (NearbySupercharger nearbySupercharger : (List) objC) {
                writableArrayCreateArray.pushMap(geofenceUtils.superchargerSiteToMap(nearbySupercharger.getTrtID(), nearbySupercharger.getLocation().getLatitude(), nearbySupercharger.getLocation().getLongitude(), nearbySupercharger.getName(), Boxing.boxBoolean(nearbySupercharger.getTeslaOnly())));
            }
            this.f55619r.resolve(writableArrayCreateArray);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.GeofenceUtils$findNearbySuperchargers$1", f = "GeofenceUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55620n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ double f55622p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ double f55623q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ double f55624r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Promise f55625s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(double d11, double d12, double d13, Promise promise, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f55622p = d11;
            this.f55623q = d12;
            this.f55624r = d13;
            this.f55625s = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return GeofenceUtils.this.new c(this.f55622p, this.f55623q, this.f55624r, this.f55625s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f55620n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            try {
                com.tesla.geofence.supercharger.b.Companion companion = com.tesla.geofence.supercharger.b.INSTANCE;
                ReactApplicationContext reactApplicationContext = GeofenceUtils.this.getReactApplicationContext();
                p013kotlin.jvm.internal.s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                List<com.tesla.geofence.supercharger.NearbySupercharger> listJ = companion.a(reactApplicationContext).j(new com.tesla.geofence.supercharger.Coordinates(this.f55622p, this.f55623q), this.f55624r);
                WritableArray writableArrayCreateArray = Arguments.createArray();
                GeofenceUtils geofenceUtils = GeofenceUtils.this;
                for (com.tesla.geofence.supercharger.NearbySupercharger nearbySupercharger : listJ) {
                    writableArrayCreateArray.pushMap(geofenceUtils.superchargerSiteToMap(nearbySupercharger.getTrtId(), nearbySupercharger.getLocation().getLatitude(), nearbySupercharger.getLocation().getLongitude(), nearbySupercharger.getName(), nearbySupercharger.getTeslaOnly()));
                }
                this.f55625s.resolve(writableArrayCreateArray);
            } catch (Exception e11) {
                this.f55625s.reject("FIND_NEARBY_ERROR", e11.getLocalizedMessage(), e11);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.GeofenceUtils$getCurrentLocation$1", f = "GeofenceUtils.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55626n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Promise f55628p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Promise promise, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f55628p = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return GeofenceUtils.this.new d(this.f55628p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f55626n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    com.tesla.geofence.supercharger.d.Companion companion = com.tesla.geofence.supercharger.d.INSTANCE;
                    ReactApplicationContext reactApplicationContext = GeofenceUtils.this.getReactApplicationContext();
                    p013kotlin.jvm.internal.s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    com.tesla.geofence.supercharger.d dVarA = companion.a(reactApplicationContext);
                    this.f55626n = 1;
                    obj = dVarA.r(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                Location location = (Location) obj;
                if (location == null) {
                    this.f55628p.resolve(null);
                    return jn0.h0.f84049a;
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble(OrcaKeys.LATITUDE, location.getLatitude());
                writableMapCreateMap.putDouble(OrcaKeys.LONGITUDE, location.getLongitude());
                writableMapCreateMap.putDouble("accuracy", location.getAccuracy());
                writableMapCreateMap.putDouble("ageMs", System.currentTimeMillis() - location.getTime());
                this.f55628p.resolve(writableMapCreateMap);
                return jn0.h0.f84049a;
            } catch (Exception e11) {
                this.f55628p.reject("GET_LOCATION_ERROR", e11.getLocalizedMessage(), e11);
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.GeofenceUtils$getDistanceToSuperchargerKm$1", f = "GeofenceUtils.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55629n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f55631p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f55632q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, Promise promise, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f55631p = i11;
            this.f55632q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return GeofenceUtils.this.new e(this.f55631p, this.f55632q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f55629n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    com.tesla.geofence.supercharger.d.Companion companion = com.tesla.geofence.supercharger.d.INSTANCE;
                    ReactApplicationContext reactApplicationContext = GeofenceUtils.this.getReactApplicationContext();
                    p013kotlin.jvm.internal.s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    com.tesla.geofence.supercharger.d dVarA = companion.a(reactApplicationContext);
                    int i12 = this.f55631p;
                    this.f55629n = 1;
                    obj = dVarA.s(i12, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                this.f55632q.resolve(Boxing.boxDouble(((Number) obj).doubleValue()));
            } catch (Exception e11) {
                this.f55632q.reject("GET_DISTANCE_ERROR", e11.getLocalizedMessage(), e11);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.GeofenceUtils$siteHasQueue$1", f = "GeofenceUtils.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55633n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f55635p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f55636q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11, Promise promise, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f55635p = i11;
            this.f55636q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return GeofenceUtils.this.new f(this.f55635p, this.f55636q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f55633n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    com.tesla.geofence.supercharger.d.Companion companion = com.tesla.geofence.supercharger.d.INSTANCE;
                    ReactApplicationContext reactApplicationContext = GeofenceUtils.this.getReactApplicationContext();
                    p013kotlin.jvm.internal.s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    com.tesla.geofence.supercharger.d dVarA = companion.a(reactApplicationContext);
                    int i12 = this.f55635p;
                    this.f55633n = 1;
                    obj = dVarA.B(i12, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                this.f55636q.resolve(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
            } catch (Exception e11) {
                this.f55636q.reject("SITE_HAS_QUEUE_ERROR", e11.getLocalizedMessage(), e11);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.GeofenceUtils$startSuperchargerGeofenceMonitoring$1", f = "GeofenceUtils.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55637n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Promise f55639p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Promise promise, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f55639p = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return GeofenceUtils.this.new g(this.f55639p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f55637n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    com.tesla.geofence.supercharger.d.Companion companion = com.tesla.geofence.supercharger.d.INSTANCE;
                    ReactApplicationContext reactApplicationContext = GeofenceUtils.this.getReactApplicationContext();
                    p013kotlin.jvm.internal.s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    com.tesla.geofence.supercharger.d dVarA = companion.a(reactApplicationContext);
                    this.f55637n = 1;
                    if (dVarA.C(true, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                this.f55639p.resolve(null);
            } catch (Exception e11) {
                this.f55639p.reject("START_GEOFENCE_ERROR", e11.getLocalizedMessage(), e11);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.GeofenceUtils$stopSuperchargerGeofenceMonitoring$1", f = "GeofenceUtils.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55640n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Promise f55642p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Promise promise, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f55642p = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return GeofenceUtils.this.new h(this.f55642p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f55640n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    com.tesla.geofence.supercharger.d.Companion companion = com.tesla.geofence.supercharger.d.INSTANCE;
                    ReactApplicationContext reactApplicationContext = GeofenceUtils.this.getReactApplicationContext();
                    p013kotlin.jvm.internal.s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    com.tesla.geofence.supercharger.d dVarA = companion.a(reactApplicationContext);
                    this.f55640n = 1;
                    if (dVarA.F(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                this.f55642p.resolve(null);
            } catch (Exception e11) {
                this.f55642p.reject("STOP_GEOFENCE_ERROR", e11.getLocalizedMessage(), e11);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofenceUtils(ReactApplicationContext reactContext) {
        super(reactContext);
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.graphQLHelper = new ua0.b(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableMap superchargerSiteToMap(int trtId, double latitude, double longitude, String name, Boolean teslaOnly) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("trtId", trtId);
        writableMapCreateMap.putDouble(OrcaKeys.LATITUDE, latitude);
        writableMapCreateMap.putDouble(OrcaKeys.LONGITUDE, longitude);
        writableMapCreateMap.putString("name", name);
        if (teslaOnly != null) {
            writableMapCreateMap.putBoolean("teslaOnly", teslaOnly.booleanValue());
        }
        p013kotlin.jvm.internal.s.j(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    @ReactMethod
    public final void downloadSuperchargerDB(String url, Promise promise) {
        p013kotlin.jvm.internal.s.k(url, "url");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(url, promise, null), 3, null);
    }

    @ReactMethod
    public final void fetchNearbySuperchargerSitesLite(double lat, double lng, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__BuildersKt.runBlocking$default(null, new b(lat, lng, promise, null), 1, null);
    }

    @ReactMethod
    public final void findNearbySuperchargers(double latitude, double longitude, double radiusKm, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new c(latitude, longitude, radiusKm, promise, null), 3, null);
    }

    @ReactMethod
    public final void getCurrentLocation(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new d(promise, null), 3, null);
    }

    @ReactMethod
    public final void getDistanceToSuperchargerKm(int trtId, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new e(trtId, promise, null), 3, null);
    }

    public final ua0.b getGraphQLHelper() {
        return this.graphQLHelper;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "GeofenceUtils";
    }

    @ReactMethod
    public final void getSuperchargerGeofenceManagerConfig(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        try {
            com.tesla.geofence.supercharger.d.Companion companion = com.tesla.geofence.supercharger.d.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
            Map<String, Object> mapQ = companion.a(reactApplicationContext).q();
            WritableMap writableMapCreateMap = Arguments.createMap();
            for (Map.Entry<String, Object> entry : mapQ.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    writableMapCreateMap.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    writableMapCreateMap.putInt(key, ((Number) value).intValue());
                } else if (value instanceof Double) {
                    writableMapCreateMap.putDouble(key, ((Number) value).doubleValue());
                } else if (value instanceof String) {
                    writableMapCreateMap.putString(key, (String) value);
                } else {
                    writableMapCreateMap.putString(key, value.toString());
                }
            }
            promise.resolve(writableMapCreateMap);
        } catch (Exception e11) {
            promise.reject("GET_CONFIG_ERROR", e11.getLocalizedMessage(), e11);
        }
    }

    @ReactMethod
    public final void postSuperchargerNotification(int trtId, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        try {
            com.tesla.geofence.supercharger.d.Companion companion = com.tesla.geofence.supercharger.d.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
            companion.a(reactApplicationContext).u(trtId);
            promise.resolve(null);
        } catch (Exception e11) {
            promise.reject("POST_NOTIFICATION_ERROR", e11.getLocalizedMessage(), e11);
        }
    }

    @ReactMethod
    public final void setEnableDebugUserMovementNotification(boolean enable, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        com.tesla.geofence.supercharger.d.Companion companion = com.tesla.geofence.supercharger.d.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
        companion.a(reactApplicationContext).y(enable);
        promise.resolve(null);
    }

    @ReactMethod
    public final void setUseLocalSuperchargerDB(boolean useLocal, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        com.tesla.geofence.supercharger.d.Companion companion = com.tesla.geofence.supercharger.d.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
        companion.a(reactApplicationContext).z(useLocal);
        promise.resolve(null);
    }

    @ReactMethod
    public final void siteHasQueue(int trtId, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new f(trtId, promise, null), 3, null);
    }

    @ReactMethod
    public final void startSuperchargerGeofenceMonitoring(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new g(promise, null), 3, null);
    }

    @ReactMethod
    public final void stopSuperchargerGeofenceMonitoring(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new h(promise, null), 3, null);
    }
}
