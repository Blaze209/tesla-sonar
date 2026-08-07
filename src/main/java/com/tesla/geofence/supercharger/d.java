package com.tesla.geofence.supercharger;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.coroutines.tasks.TasksKt;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 Z2\u00020\u0001:\u00017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0083@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\bJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0083@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0019\u0010\bJ\u001c\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0087@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0087@¢\u0006\u0004\b\u001e\u0010\bJ*\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b&\u0010'J*\u0010)\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u000e¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020-2\u0006\u0010%\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b.\u0010'J\u0015\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0012¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0012¢\u0006\u0004\b3\u00101J\u0019\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000104¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010Q\u001a\n N*\u0004\u0018\u00010M0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006["}, d2 = {"Lcom/tesla/geofence/supercharger/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", "w", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "G", "", "Lcom/tesla/geofence/supercharger/c;", "superchargers", "", "", "p", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "x", "", "H", "()Z", "t", "userInitiated", "C", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", Gender.FEMALE, "Landroid/location/Location;", "providedLocation", "D", "(Landroid/location/Location;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "", "geofenceId", "eventType", "triggeringLocation", "v", "(Ljava/lang/String;ILandroid/location/Location;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trtId", "B", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "geofenceLocation", "A", "(ILandroid/location/Location;Landroid/location/Location;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(I)V", "", "s", "useLocal", "z", "(Z)V", "enable", "y", "", "q", "()Ljava/util/Map;", "a", "Landroid/content/Context;", "Lcom/tesla/geofence/supercharger/e;", "b", "Lcom/tesla/geofence/supercharger/e;", "state", "Lcom/tesla/geofence/supercharger/b;", "c", "Lcom/tesla/geofence/supercharger/b;", "localDatabase", "Lcom/google/android/gms/location/FusedLocationProviderClient;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedLocationClient", "Lcom/google/android/gms/location/GeofencingClient;", "e", "Lcom/google/android/gms/location/GeofencingClient;", "geofencingClient", "Lua0/b;", "f", "Lua0/b;", "graphQLHelper", "Ltd0/m;", "kotlin.jvm.PlatformType", "g", "Ltd0/m;", "realmHelper", "Lkotlinx/coroutines/sync/Mutex;", "h", "Lkotlinx/coroutines/sync/Mutex;", "monitoringMutex", "Lkotlinx/coroutines/CoroutineScope;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineScope;", "scope", "j", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.tesla.logging.g f56301k = com.tesla.logging.g.INSTANCE.a("SuperchargerGeofenceMgr");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile d f56302l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.geofence.supercharger.e state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.geofence.supercharger.b localDatabase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final FusedLocationProviderClient fusedLocationClient;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final GeofencingClient geofencingClient;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ua0.b graphQLHelper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final td0.m realmHelper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Mutex monitoringMutex;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.tesla.geofence.supercharger.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/tesla/geofence/supercharger/d$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/geofence/supercharger/d;", "a", "(Landroid/content/Context;)Lcom/tesla/geofence/supercharger/d;", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "", "GEOFENCE_RADIUS_METERS", Gender.FEMALE, "", "MAX_GEOFENCES", "I", "", "LOCATION_TIMEOUT_MS", "J", "CACHED_LOCATION_MAX_AGE_MS", "NOTIFICATION_DEBOUNCE_MS", "GEOFENCE_PREFIX", "", "NEARBY_SUPERCHARGERS_RADIUS_KM", "D", "SIGNIFICANT_DISPLACEMENT_METERS", "LOCATION_UPDATE_INTERVAL_MS", "instance", "Lcom/tesla/geofence/supercharger/d;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(Context context) {
            d dVar;
            s.k(context, "context");
            d dVar2 = d.f56302l;
            if (dVar2 != null) {
                return dVar2;
            }
            synchronized (this) {
                dVar = d.f56302l;
                if (dVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    s.j(applicationContext, "getApplicationContext(...)");
                    dVar = new d(applicationContext, null);
                    d.f56302l = dVar;
                }
            }
            return dVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager", f = "SuperchargerGeofenceManager.kt", i = {0, 0}, l = {416}, m = "addGeofences", n = {"superchargers", "geofences"}, s = {"L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f56312n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f56313o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f56314p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f56316r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f56314p = obj;
            this.f56316r |= Integer.MIN_VALUE;
            return d.this.p(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager", f = "SuperchargerGeofenceManager.kt", i = {0}, l = {342, 364}, m = "getCurrentLocationWithFallback", n = {"this"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f56317n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f56318o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f56320q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f56318o = obj;
            this.f56320q |= Integer.MIN_VALUE;
            return d.this.r(this);
        }
    }

    /* JADX INFO: renamed from: com.tesla.geofence.supercharger.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/location/Location;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager$getCurrentLocationWithFallback$fresh$1", f = "SuperchargerGeofenceManager.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
    static final class C1129d extends SuspendLambda implements p<CoroutineScope, Continuation<? super Location>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56321n;

        C1129d(Continuation<? super C1129d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new C1129d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56321n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    Task<Location> currentLocation = d.this.fusedLocationClient.getCurrentLocation(100, new CancellationTokenSource().getToken());
                    s.j(currentLocation, "getCurrentLocation(...)");
                    this.f56321n = 1;
                    obj = TasksKt.await(currentLocation, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return (Location) obj;
            } catch (Exception e11) {
                d.f56301k.d("Failed to get current location", e11);
                return null;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Location> continuation) {
            return ((C1129d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager$getDistanceToSuperchargerKm$2", f = "SuperchargerGeofenceManager.kt", i = {0}, l = {654}, m = "invokeSuspend", n = {"supercharger"}, s = {"L$0"})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super Double>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f56323n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f56324o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f56326q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f56326q = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new e(this.f56326q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NearbySupercharger nearbySupercharger;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56324o;
            if (i11 == 0) {
                t.b(obj);
                NearbySupercharger nearbySuperchargerN = d.this.localDatabase.n(this.f56326q);
                if (nearbySuperchargerN == null) {
                    throw new IllegalStateException("Supercharger with trtId " + this.f56326q + " not found in local database");
                }
                d dVar = d.this;
                this.f56323n = nearbySuperchargerN;
                this.f56324o = 1;
                Object objR = dVar.r(this);
                if (objR == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nearbySupercharger = nearbySuperchargerN;
                obj = objR;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nearbySupercharger = (NearbySupercharger) this.f56323n;
                t.b(obj);
            }
            Location location = (Location) obj;
            if (location == null) {
                throw new IllegalStateException("Current location is unavailable");
            }
            Location location2 = new Location("");
            location2.setLatitude(nearbySupercharger.getLocation().getLatitude());
            location2.setLongitude(nearbySupercharger.getLocation().getLongitude());
            Location location3 = new Location("");
            location3.setLatitude(location.getLatitude());
            location3.setLongitude(location.getLongitude());
            double dDistanceTo = ((double) location3.distanceTo(location2)) / 1000.0d;
            com.tesla.logging.g gVar = d.f56301k;
            int i12 = this.f56326q;
            String name = nearbySupercharger.getName();
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Boxing.boxDouble(dDistanceTo)}, 1));
            s.j(str, "format(...)");
            gVar.j("Distance to supercharger " + i12 + " (" + name + "): " + str + " km");
            return Boxing.boxDouble(dDistanceTo);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Double> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager$postSuperchargerNotification$1", f = "SuperchargerGeofenceManager.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56327n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f56329p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f56329p = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new f(this.f56329p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56327n;
            if (i11 == 0) {
                t.b(obj);
                ua0.b bVar = d.this.graphQLHelper;
                int i12 = this.f56329p;
                this.f56327n = 1;
                if (bVar.e(i12, "post_supercharger_geofence_notification", this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager$processGeofenceEvent$2", f = "SuperchargerGeofenceManager.kt", i = {0, 0, 1, 1}, l = {DownloaderService.STATUS_FILE_ERROR, DownloaderService.STATUS_UNHANDLED_HTTP_CODE}, m = "invokeSuspend", n = {"trtId", "currentTime", "trtId", "currentTime"}, s = {"L$0", "J$0", "L$0", "J$0"})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f56330n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f56331o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f56332p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f56333q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f56334r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ d f56335s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Location f56336t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, int i11, d dVar, Location location, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f56333q = str;
            this.f56334r = i11;
            this.f56335s = dVar;
            this.f56336t = location;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f56333q, this.f56334r, this.f56335s, this.f56336t, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v3 */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer num;
            long j11;
            Location location;
            Integer num2;
            long j12;
            Integer num3;
            long j13;
            boolean zBooleanValue;
            Integer num4;
            long j14;
            ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56332p;
            boolean z11 = false;
            ?? r11 = 2;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    d.f56301k.j("Processing geofence event: id=" + this.f56333q + ", type=" + this.f56334r);
                    Integer numX = p013kotlin.text.t.x(p013kotlin.text.t.T0(this.f56333q, "supercharger_site_"));
                    if (numX == null) {
                        d.f56301k.n("Invalid geofence ID: " + this.f56333q);
                        return h0.f84049a;
                    }
                    NearbySupercharger nearbySuperchargerN = this.f56335s.localDatabase.n(numX.intValue());
                    if (nearbySuperchargerN != null) {
                        location = new Location("geofence");
                        location.setLatitude(nearbySuperchargerN.getLocation().getLatitude());
                        location.setLongitude(nearbySuperchargerN.getLocation().getLongitude());
                    } else {
                        location = null;
                    }
                    if (nearbySuperchargerN != null ? s.f(nearbySuperchargerN.getTeslaOnly(), Boxing.boxBoolean(true)) : false) {
                        if (!this.f56335s.H()) {
                            d.f56301k.j("Site " + numX + " is Tesla-only and user has no Tesla vehicles, skipping notification");
                            return h0.f84049a;
                        }
                        d.f56301k.j("Site " + numX + " is Tesla-only and user has Tesla vehicles, proceeding with notification");
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Long lB = this.f56335s.state.b(numX.intValue());
                    if (lB != null) {
                        long jLongValue = jCurrentTimeMillis - lB.longValue();
                        if (jLongValue < 60000) {
                            d.f56301k.j("Skipping notification for site " + numX + " (debounced, last notification " + jLongValue + "ms ago)");
                            return h0.f84049a;
                        }
                    }
                    try {
                        if (location != null) {
                            d dVar = this.f56335s;
                            int iIntValue = numX.intValue();
                            Location location2 = this.f56336t;
                            this.f56330n = numX;
                            this.f56331o = jCurrentTimeMillis;
                            this.f56332p = 1;
                            Object objA = dVar.A(iIntValue, location, location2, this);
                            if (objA != coroutine_suspended) {
                                num3 = numX;
                                obj = objA;
                                j13 = jCurrentTimeMillis;
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                j14 = j13;
                                num4 = num3;
                            }
                        } else {
                            d dVar2 = this.f56335s;
                            int iIntValue2 = numX.intValue();
                            this.f56330n = numX;
                            this.f56331o = jCurrentTimeMillis;
                            this.f56332p = 2;
                            Object objB = dVar2.B(iIntValue2, this);
                            if (objB != coroutine_suspended) {
                                num2 = numX;
                                obj = objB;
                                j12 = jCurrentTimeMillis;
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                j14 = j12;
                                num4 = num2;
                            }
                        }
                        return coroutine_suspended;
                    } catch (Exception e11) {
                        r11 = numX;
                        e = e11;
                        coroutine_suspended = jCurrentTimeMillis;
                        d.f56301k.d("Failed to check if site has queue", e);
                        j11 = coroutine_suspended;
                        num = r11;
                    }
                } else if (i11 == 1) {
                    long j15 = this.f56331o;
                    Integer num5 = (Integer) this.f56330n;
                    t.b(obj);
                    j13 = j15;
                    num3 = num5;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    j14 = j13;
                    num4 = num3;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j16 = this.f56331o;
                    Integer num6 = (Integer) this.f56330n;
                    t.b(obj);
                    j12 = j16;
                    num2 = num6;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    j14 = j12;
                    num4 = num2;
                }
                z11 = zBooleanValue;
                j11 = j14;
                num = num4;
            } catch (Exception e12) {
                e = e12;
            }
            if (!z11) {
                d.f56301k.j("Site " + num + " has no queue, skipping notification");
                return h0.f84049a;
            }
            this.f56335s.u(num.intValue());
            this.f56335s.state.g(num.intValue(), j11);
            d.f56301k.j("Successfully processed geofence event for site " + num);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager$registerLocationUpdates$2", f = "SuperchargerGeofenceManager.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56337n;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56337n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    d.f56301k.j("Registering for significant location changes (3000.0m displacement, 300000ms interval)");
                    LocationRequest locationRequestBuild = new LocationRequest.Builder(102, DataPersistorKt.EXPIRATION_TIME).setMinUpdateDistanceMeters(3000.0f).setWaitForAccurateLocation(false).build();
                    s.j(locationRequestBuild, "build(...)");
                    Task<Void> taskRequestLocationUpdates = d.this.fusedLocationClient.requestLocationUpdates(locationRequestBuild, SuperchargerLocationUpdateReceiver.INSTANCE.a(d.this.context));
                    s.j(taskRequestLocationUpdates, "requestLocationUpdates(...)");
                    this.f56337n = 1;
                    if (TasksKt.await(taskRequestLocationUpdates, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                d.f56301k.j("Successfully registered for location updates");
                return h0.f84049a;
            } catch (Exception e11) {
                d.f56301k.d("Failed to register for location updates", e11);
                throw e11;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager", f = "SuperchargerGeofenceManager.kt", i = {}, l = {440}, m = "removeAllSuperchargerGeofences", n = {}, s = {})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f56339n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f56341p;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f56339n = obj;
            this.f56341p |= Integer.MIN_VALUE;
            return d.this.x(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager", f = "SuperchargerGeofenceManager.kt", i = {}, l = {520}, m = "siteHasQueue", n = {}, s = {})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f56342n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f56344p;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f56342n = obj;
            this.f56344p |= Integer.MIN_VALUE;
            return d.this.B(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager", f = "SuperchargerGeofenceManager.kt", i = {0, 0, 0}, l = {529}, m = "siteHasQueue", n = {"geofenceLocation", "triggeringLocation", "trtId"}, s = {"L$0", "L$1", "I$0"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56345n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f56346o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f56347p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f56348q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f56350s;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f56348q = obj;
            this.f56350s |= Integer.MIN_VALUE;
            return d.this.A(0, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager$start$2", f = "SuperchargerGeofenceManager.kt", i = {}, l = {158, 161}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56351n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f56352o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d f56353p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z11, d dVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f56352o = z11;
            this.f56353p = dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new l(this.f56352o, this.f56353p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00e6, code lost:
        
            if (r10.w(r9) == r0) goto L32;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.geofence.supercharger.d.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager$startMonitoring$2", f = "SuperchargerGeofenceManager.kt", i = {1, 2, 3}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, 320}, m = "invokeSuspend", n = {"location", "nearbySuperchargers", "closestSuperchargers"}, s = {"L$0", "L$0", "L$0"})
    static final class m extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f56354n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f56355o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Location f56357q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Location location, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f56357q = location;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new m(this.f56357q, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x009d A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00b2 A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00fc A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0130 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x013c A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0160 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x016f A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0197  */
        /* JADX WARN: Code duplicated, block: B:56:0x0199 A[Catch: all -> 0x0022, Exception -> 0x0041, PHI: r0 r3
          0x0199: PHI (r0v34 android.location.Location) = (r0v26 android.location.Location), (r0v37 android.location.Location) binds: [B:54:0x0195, B:20:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x0199: PHI (r3v42 java.lang.Object) = (r3v33 java.lang.Object), (r3v46 java.lang.Object) binds: [B:54:0x0195, B:20:0x003d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0041, blocks: (B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:53:0x0178), top: B:82:0x000d, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x01b2 A[Catch: all -> 0x0022, Exception -> 0x0041, LOOP:0: B:57:0x01ac->B:59:0x01b2, LOOP_END, TRY_LEAVE, TryCatch #1 {Exception -> 0x0041, blocks: (B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:53:0x0178), top: B:82:0x000d, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0233 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x0269  */
        /* JADX WARN: Code duplicated, block: B:69:0x026a A[Catch: all -> 0x0022, PHI: r0
          0x026a: PHI (r0v5 java.util.List<com.tesla.geofence.supercharger.c>) = (r0v3 java.util.List<com.tesla.geofence.supercharger.c>), (r0v39 java.util.List<com.tesla.geofence.supercharger.c>) binds: [B:67:0x0267, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x0278 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x028d A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001b, B:77:0x029b, B:16:0x0031, B:69:0x026a, B:71:0x0278, B:74:0x028d, B:19:0x003a, B:56:0x0199, B:57:0x01ac, B:59:0x01b2, B:63:0x0209, B:65:0x0233, B:66:0x025d, B:61:0x01fb, B:23:0x0044, B:38:0x0099, B:40:0x009d, B:43:0x00b2, B:45:0x00fc, B:46:0x0124, B:48:0x0130, B:50:0x013c, B:51:0x0160, B:52:0x016f, B:53:0x0178, B:29:0x0065, B:33:0x0070, B:35:0x008d), top: B:82:0x000d, inners: #1 }] */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0298, code lost:
        
            if (r3 == r2) goto L76;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:43:0x00b2, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:45:0x00fc, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:65:0x0233, please report this as an issue */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 736
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.geofence.supercharger.d.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager$stop$2", f = "SuperchargerGeofenceManager.kt", i = {}, l = {176, 179}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56358n;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new n(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r5.G(r4) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f56358n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L4a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                goto L3f
            L1e:
                jn0.t.b(r5)
                com.tesla.logging.g r5 = com.tesla.geofence.supercharger.d.g()
                java.lang.String r1 = "Stopping supercharger geofence monitoring"
                r5.j(r1)
                com.tesla.geofence.supercharger.d r5 = com.tesla.geofence.supercharger.d.this
                com.tesla.geofence.supercharger.e r5 = com.tesla.geofence.supercharger.d.i(r5)
                r1 = 0
                r5.i(r1)
                com.tesla.geofence.supercharger.d r5 = com.tesla.geofence.supercharger.d.this
                r4.f56358n = r3
                java.lang.Object r5 = com.tesla.geofence.supercharger.d.l(r5, r4)
                if (r5 != r0) goto L3f
                goto L49
            L3f:
                com.tesla.geofence.supercharger.d r5 = com.tesla.geofence.supercharger.d.this
                r4.f56358n = r2
                java.lang.Object r5 = com.tesla.geofence.supercharger.d.n(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                com.tesla.logging.g r5 = com.tesla.geofence.supercharger.d.g()
                java.lang.String r0 = "Supercharger geofence monitoring stopped successfully"
                r5.j(r0)
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.geofence.supercharger.d.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.geofence.supercharger.SuperchargerGeofenceManager$unregisterLocationUpdates$2", f = "SuperchargerGeofenceManager.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56360n;

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new o(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56360n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    d.f56301k.j("Unregistering location updates");
                    Task<Void> taskRemoveLocationUpdates = d.this.fusedLocationClient.removeLocationUpdates(SuperchargerLocationUpdateReceiver.INSTANCE.a(d.this.context));
                    s.j(taskRemoveLocationUpdates, "removeLocationUpdates(...)");
                    this.f56360n = 1;
                    if (TasksKt.await(taskRemoveLocationUpdates, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                d.f56301k.j("Successfully unregistered location updates");
            } catch (Exception e11) {
                d.f56301k.d("Failed to unregister location updates", e11);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ d(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static /* synthetic */ Object E(d dVar, Location location, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            location = null;
        }
        return dVar.D(location, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G(Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H() {
        try {
            String strH = this.realmHelper.h("persist:vehicleList");
            if (strH == null) {
                f56301k.j("Could not read vehicle list from Realm (null)");
                return false;
            }
            String strOptString = new JSONObject(strH).optString("byId");
            if (strOptString != null && strOptString.length() != 0) {
                JSONObject jSONObject = new JSONObject(strOptString);
                boolean z11 = jSONObject.length() > 0;
                f56301k.j("User has vehicles: " + z11 + " (count: " + jSONObject.length() + ")");
                return z11;
            }
            f56301k.j("Vehicle list byId is empty");
            return false;
        } catch (Exception e11) {
            f56301k.d("Error reading vehicle list from Realm, assuming no vehicles", e11);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @SuppressLint({"MissingPermission"})
    public final Object p(List<NearbySupercharger> list, Continuation<? super Set<Integer>> continuation) {
        b bVar;
        List<? extends Geofence> arrayList;
        List<NearbySupercharger> list2 = list;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f56316r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f56316r = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f56314p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f56316r;
        try {
            if (i12 == 0) {
                t.b(obj);
                if (list2.isEmpty()) {
                    return d1.d();
                }
                List<NearbySupercharger> list3 = list2;
                arrayList = new ArrayList<>(v.y(list3, 10));
                for (NearbySupercharger nearbySupercharger : list3) {
                    arrayList.add(new Geofence.Builder().setRequestId("supercharger_site_" + nearbySupercharger.getTrtId()).setCircularRegion(nearbySupercharger.getLocation().getLatitude(), nearbySupercharger.getLocation().getLongitude(), 100.0f).setExpirationDuration(-1L).setTransitionTypes(1).build());
                }
                GeofencingRequest geofencingRequestBuild = new GeofencingRequest.Builder().setInitialTrigger(0).addGeofences(arrayList).build();
                s.j(geofencingRequestBuild, "build(...)");
                Task<Void> taskAddGeofences = this.geofencingClient.addGeofences(geofencingRequestBuild, SuperchargerGeofenceBroadcastReceiver.INSTANCE.a(this.context));
                s.j(taskAddGeofences, "addGeofences(...)");
                bVar.f56312n = list2;
                bVar.f56313o = arrayList;
                bVar.f56316r = 1;
                if (TasksKt.await(taskAddGeofences, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List<? extends Geofence> list4 = (List) bVar.f56313o;
                List<NearbySupercharger> list5 = (List) bVar.f56312n;
                t.b(obj);
                arrayList = list4;
                list2 = list5;
            }
            com.tesla.logging.g gVar = f56301k;
            int size = arrayList.size();
            List<NearbySupercharger> list6 = list2;
            ArrayList arrayList2 = new ArrayList(v.y(list6, 10));
            Iterator<T> it = list6.iterator();
            while (it.hasNext()) {
                arrayList2.add(Boxing.boxInt(((NearbySupercharger) it.next()).getTrtId()));
            }
            gVar.j("Successfully added " + size + " geofences: " + arrayList2);
            List<NearbySupercharger> list7 = list2;
            ArrayList arrayList3 = new ArrayList(v.y(list7, 10));
            Iterator<T> it2 = list7.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Boxing.boxInt(((NearbySupercharger) it2.next()).getTrtId()));
            }
            return v.r1(arrayList3);
        } catch (Exception e11) {
            f56301k.d("Failed to add geofences", e11);
            return d1.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t() {
        return (androidx.core.content.b.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0) && (Build.VERSION.SDK_INT < 29 || androidx.core.content.b.checkSelfPermission(this.context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final Object w(Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new h(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(Continuation<? super h0> continuation) {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f56341p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f56341p = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.f56339n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iVar.f56341p;
        try {
            if (i12 == 0) {
                t.b(obj);
                Task<Void> taskRemoveGeofences = this.geofencingClient.removeGeofences(SuperchargerGeofenceBroadcastReceiver.INSTANCE.a(this.context));
                s.j(taskRemoveGeofences, "removeGeofences(...)");
                iVar.f56341p = 1;
                if (TasksKt.await(taskRemoveGeofences, iVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            f56301k.j("Removed all supercharger geofences");
        } catch (Exception e11) {
            f56301k.d("Failed to remove supercharger geofences", e11);
        }
        return h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object A(int i11, Location location, Location location2, Continuation<? super Boolean> continuation) {
        k kVar;
        Location location3;
        Location location4;
        int i12 = i11;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i13 = kVar.f56350s;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f56350s = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objF = kVar.f56348q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = kVar.f56350s;
        if (i14 == 0) {
            t.b(objF);
            ua0.b bVar = this.graphQLHelper;
            kVar.f56346o = location;
            kVar.f56347p = location2;
            kVar.f56345n = i12;
            kVar.f56350s = 1;
            objF = bVar.f(i12, kVar);
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
            location3 = location;
            location4 = location2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = kVar.f56345n;
            location4 = (Location) kVar.f56347p;
            location3 = (Location) kVar.f56346o;
            t.b(objF);
        }
        JSONObject jSONObject = (JSONObject) objF;
        if (!(jSONObject != null ? jSONObject.optBoolean("active_queue", false) : false)) {
            return Boxing.boxBoolean(false);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject("ignored_entry_degree") : null;
        if (jSONObjectOptJSONObject != null && location4 != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble("angle_min", 0.0d);
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("angle_max", 0.0d);
            if (ie0.s.f77618a.a(location4.getLatitude(), location4.getLongitude(), location3.getLatitude(), location3.getLongitude(), dOptDouble, dOptDouble2)) {
                f56301k.j("Site " + i12 + " entry angle is in ignored range [" + dOptDouble + ", " + dOptDouble2 + "], suppressing queue notification");
                return Boxing.boxBoolean(false);
            }
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(int i11, Continuation<? super Boolean> continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i12 = jVar.f56344p;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                jVar.f56344p = i12 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objF = jVar.f56342n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = jVar.f56344p;
        if (i13 == 0) {
            t.b(objF);
            ua0.b bVar = this.graphQLHelper;
            jVar.f56344p = 1;
            objF = bVar.f(i11, jVar);
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objF);
        }
        JSONObject jSONObject = (JSONObject) objF;
        return Boxing.boxBoolean(jSONObject != null ? jSONObject.optBoolean("active_queue", false) : false);
    }

    public final Object C(boolean z11, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new l(z11, this, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    @SuppressLint({"MissingPermission"})
    public final Object D(Location location, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new m(location, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    public final Object F(Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new n(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    public final Map<String, Object> q() {
        Pair pairA = x.a("userInitiatedGeofencing", Boolean.valueOf(this.state.e()));
        Pair pairA2 = x.a("useLocalSuperchargerDB", Boolean.valueOf(this.state.d()));
        Pair pairA3 = x.a("enableDebugUserMovementNotification", Boolean.valueOf(this.state.a()));
        Pair pairA4 = x.a("localDatabaseLoaded", Boolean.valueOf(this.localDatabase.o()));
        Pair pairA5 = x.a("localDatabaseCount", Integer.valueOf(this.localDatabase.l()));
        String strM = this.localDatabase.m();
        if (strM == null) {
            strM = PermissionsResponse.PERMISSION_EXPIRES_NEVER;
        }
        return v0.m(pairA, pairA2, pairA3, pairA4, pairA5, x.a("localDatabaseLastUpdated", strM));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (r10 == r1) goto L34;
     */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(p013kotlin.coroutines.Continuation<? super android.location.Location> r10) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.geofence.supercharger.d.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object s(int i11, Continuation<? super Double> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new e(i11, null), continuation);
    }

    public final void u(int trtId) {
        NearbySupercharger nearbySuperchargerN;
        String strC = this.state.c(trtId);
        if (strC == null) {
            strC = (!this.state.d() || (nearbySuperchargerN = this.localDatabase.n(trtId)) == null) ? null : nearbySuperchargerN.getName();
            if (strC == null) {
                strC = this.context.getString(bc0.a.V0);
                s.j(strC, "getString(...)");
            }
        }
        String str = strC;
        com.tesla.logging.g gVar = f56301k;
        gVar.j("Posting notification for supercharger " + trtId + ": " + str);
        try {
            boolean zH = H();
            String str2 = "tesla://" + (zH ? "SuperchargerJoinQueueModal" : "charging_nt_site_selection_screen/auto_join_waitlist") + "/" + trtId;
            gVar.j("Deep link: " + str2 + " (hasVehicles: " + zH + ")");
            Bundle bundle = new Bundle();
            bundle.putString("uri", str2);
            bundle.putString("trtId", String.valueOf(trtId));
            bundle.putString("alert_id", "ALERT_JOIN_SUPERCHARGER_QUEUE");
            Intent launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(335544320);
                launchIntentForPackage.putExtra("pushNotification", bundle);
            } else {
                launchIntentForPackage = null;
            }
            if (launchIntentForPackage == null) {
                gVar.j("Failed to create launch intent for notification");
                return;
            }
            PendingIntent activity = PendingIntent.getActivity(this.context, trtId, launchIntentForPackage, 201326592);
            String string = this.context.getString(bc0.a.X0);
            s.j(string, "getString(...)");
            String string2 = this.context.getString(bc0.a.W0);
            s.j(string2, "getString(...)");
            nd0.k.INSTANCE.e(this.context, string, p013kotlin.text.t.V(string2, "%siteName%", str, false, 4, null), activity, trtId);
            gVar.j("Successfully posted notification for supercharger " + trtId + " with deep link: " + str2);
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new f(trtId, null), 3, null);
        } catch (Exception e11) {
            f56301k.d("Failed to post notification for supercharger " + trtId, e11);
        }
    }

    public final Object v(String str, int i11, Location location, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new g(str, i11, this, location, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    public final void y(boolean enable) {
        this.state.f(enable);
        f56301k.j("Set enableDebugUserMovementNotification = " + enable);
    }

    public final void z(boolean useLocal) {
        this.state.h(useLocal);
        f56301k.j("Set useLocalSuperchargerDB = " + useLocal);
    }

    private d(Context context) {
        this.context = context;
        this.state = new com.tesla.geofence.supercharger.e(context);
        this.localDatabase = com.tesla.geofence.supercharger.b.INSTANCE.a(context);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        s.j(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.fusedLocationClient = fusedLocationProviderClient;
        GeofencingClient geofencingClient = LocationServices.getGeofencingClient(context);
        s.j(geofencingClient, "getGeofencingClient(...)");
        this.geofencingClient = geofencingClient;
        this.graphQLHelper = new ua0.b(context);
        this.realmHelper = td0.m.j();
        this.monitoringMutex = MutexKt.Mutex$default(false, 1, null);
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    }
}
