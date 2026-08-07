package com.fourthline.core.location.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.CoreAnalytics;
import com.fourthline.core.location.Coordinate;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.SoftReference;
import java.util.Objects;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0014\u001a\u00020\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000bH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010)R\u001a\u0010,\u001a\u00020(*\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010+¨\u0006."}, d2 = {"Lcom/fourthline/core/location/internal/LocationFetcherImpl;", "Lcom/fourthline/core/location/internal/LocationFetcher;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/fourthline/core/location/internal/VpnConnectivityChecker;", "vpnConnectivityChecker", "<init>", "(Landroid/content/Context;Lcom/fourthline/core/location/internal/VpnConnectivityChecker;)V", "Landroid/location/Location;", "location", "Ljava/lang/ref/SoftReference;", "Lkotlin/Function1;", "Lcom/fourthline/core/location/Coordinate;", "Ljn0/h0;", "locationCallback", "a", "(Landroid/location/Location;Ljava/lang/ref/SoftReference;)V", "success", "", "failure", "start", "(Ljava/lang/ref/SoftReference;Lwn0/l;)V", "stop", "()V", "Landroid/content/Context;", "b", "Lcom/fourthline/core/location/internal/VpnConnectivityChecker;", "Lcom/google/android/gms/location/LocationCallback;", "c", "Lcom/google/android/gms/location/LocationCallback;", "Lcom/google/android/gms/location/FusedLocationProviderClient;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedProviderClient", "e", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "()Lcom/fourthline/core/location/Coordinate;", "setLocation", "(Lcom/fourthline/core/location/Coordinate;)V", "", "()Z", "isReducedAccuracy", "(Landroid/location/Location;)Z", "isFromMockedSource", "f", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationFetcherImpl implements LocationFetcher {

    @Deprecated
    public static final long FASTEST_INTERVAL = 200;

    @Deprecated
    public static final long INTERVAL = 500;

    @Deprecated
    public static final long MAX_WAITING_TIME = 500;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f24146f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final VpnConnectivityChecker vpnConnectivityChecker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private LocationCallback locationCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private FusedLocationProviderClient fusedProviderClient;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Coordinate location;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LocationFetcherImpl(Context context, VpnConnectivityChecker vpnConnectivityChecker) {
        s.k(context, "context");
        s.k(vpnConnectivityChecker, "vpnConnectivityChecker");
        this.context = context;
        this.vpnConnectivityChecker = vpnConnectivityChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(FusedLocationProviderClient fusedLocationProviderClient, final LocationFetcherImpl locationFetcherImpl, final SoftReference softReference, LocationAvailability locationAvailability) {
        if (locationAvailability.isLocationAvailable()) {
            Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
            final l lVar = new l() { // from class: com.fourthline.core.location.internal.f
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return LocationFetcherImpl.a(this.f24168a, softReference, (Location) obj);
                }
            };
            lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: com.fourthline.core.location.internal.g
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    LocationFetcherImpl.a(lVar, obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @Override // com.fourthline.core.location.internal.LocationFetcher
    public Coordinate getLocation() {
        return this.location;
    }

    public void setLocation(Coordinate coordinate) {
        this.location = coordinate;
    }

    @Override // com.fourthline.core.location.internal.LocationFetcher
    @SuppressLint({"MissingPermission"})
    public void start(final SoftReference<l<Coordinate, h0>> success, l<? super Throwable, h0> failure) {
        FusedLocationProviderClient fusedLocationProviderClient;
        s.k(success, "success");
        s.k(failure, "failure");
        try {
            this.fusedProviderClient = LocationServices.getFusedLocationProviderClient(this.context);
            this.locationCallback = new LocationCallback() { // from class: com.fourthline.core.location.internal.LocationFetcherImpl.start.1
                @Override // com.google.android.gms.location.LocationCallback
                public void onLocationResult(LocationResult locationResult) {
                    s.k(locationResult, "locationResult");
                    Location lastLocation = locationResult.getLastLocation();
                    if (lastLocation != null) {
                        LocationFetcherImpl.this.a(lastLocation, success);
                    }
                }
            };
            LocationRequest locationRequestCreate = LocationRequest.create();
            locationRequestCreate.setPriority(a() ? 102 : 100);
            locationRequestCreate.setMaxWaitTime(500L);
            locationRequestCreate.setInterval(500L);
            locationRequestCreate.setFastestInterval(200L);
            s.j(locationRequestCreate, "apply(...)");
            final FusedLocationProviderClient fusedLocationProviderClient2 = this.fusedProviderClient;
            if (fusedLocationProviderClient2 != null) {
                Task<LocationAvailability> locationAvailability = fusedLocationProviderClient2.getLocationAvailability();
                final l lVar = new l() { // from class: com.fourthline.core.location.internal.b
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return LocationFetcherImpl.a(fusedLocationProviderClient2, this, success, (LocationAvailability) obj);
                    }
                };
                locationAvailability.addOnSuccessListener(new OnSuccessListener() { // from class: com.fourthline.core.location.internal.c
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        LocationFetcherImpl.b(lVar, obj);
                    }
                });
            }
            LocationCallback locationCallback = this.locationCallback;
            if (locationCallback == null || (fusedLocationProviderClient = this.fusedProviderClient) == null) {
                return;
            }
            fusedLocationProviderClient.requestLocationUpdates(locationRequestCreate, locationCallback, Looper.getMainLooper());
        } catch (Exception e11) {
            stop();
            failure.invoke(e11);
        }
    }

    @Override // com.fourthline.core.location.internal.LocationFetcher
    public void stop() {
        FusedLocationProviderClient fusedLocationProviderClient;
        Task<Void> taskRemoveLocationUpdates;
        LocationCallback locationCallback = this.locationCallback;
        if (locationCallback != null && (fusedLocationProviderClient = this.fusedProviderClient) != null && (taskRemoveLocationUpdates = fusedLocationProviderClient.removeLocationUpdates(locationCallback)) != null) {
            final l lVar = new l() { // from class: com.fourthline.core.location.internal.d
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return LocationFetcherImpl.a((Void) obj);
                }
            };
            taskRemoveLocationUpdates.addOnSuccessListener(new OnSuccessListener() { // from class: com.fourthline.core.location.internal.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    LocationFetcherImpl.c(lVar, obj);
                }
            });
        }
        this.locationCallback = null;
        this.fusedProviderClient = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(LocationFetcherImpl locationFetcherImpl, SoftReference softReference, Location location) {
        if (location != null && locationFetcherImpl.locationCallback != null) {
            locationFetcherImpl.a(location, softReference);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Location location, SoftReference locationCallback) {
        l lVar = (l) locationCallback.get();
        Objects.toString(location);
        Objects.toString(lVar);
        Coordinate coordinate = new Coordinate(location.getLatitude(), location.getLongitude());
        CoreAnalytics.INSTANCE.onLocationReceived(a(location), this.vpnConnectivityChecker.isVpnEnabled(), a());
        setLocation(coordinate);
        if (lVar != null) {
            lVar.invoke(coordinate);
        }
    }

    private final boolean a() {
        return androidx.core.content.f.b(this.context, "android.permission.ACCESS_FINE_LOCATION") != 0;
    }

    private final boolean a(Location location) {
        if (location != null) {
            return Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(Void r11) {
        return h0.f84049a;
    }
}
