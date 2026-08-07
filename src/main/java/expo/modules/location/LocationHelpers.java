package expo.modules.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.location.records.LocationLastKnownOptions;
import expo.modules.location.records.LocationOptions;
import expo.modules.location.records.LocationResponse;
import expo.modules.location.records.PermissionRequestResponse;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/location/LocationHelpers;", "", "<init>", "()V", "Companion", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationHelpers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0015\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001f\u0010 J%\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)J-\u0010-\u001a\u00020'2\u0006\u0010+\u001a\u00020*2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\t2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b/\u0010\u0019J,\u00108\u001a\u0002052\u0006\u00101\u001a\u0002002\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020302\"\u000203H\u0080@¢\u0006\u0004\b6\u00107J,\u0010;\u001a\u0002092\u0006\u00101\u001a\u0002002\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020302\"\u000203H\u0080@¢\u0006\u0004\b:\u00107¨\u0006<"}, d2 = {"Lexpo/modules/location/LocationHelpers$Companion;", "", "<init>", "()V", "Lexpo/modules/location/records/LocationOptions;", "options", "Lexpo/modules/location/LocationParams;", "mapOptionsToLocationParams", "(Lexpo/modules/location/records/LocationOptions;)Lexpo/modules/location/LocationParams;", "", "accuracy", "mapAccuracyToPriority", "(I)I", "buildLocationParamsForAccuracy", "(I)Lexpo/modules/location/LocationParams;", "Landroid/location/Location;", "location", "Lexpo/modules/location/records/LocationLastKnownOptions;", "", "isLocationValid$expo_location_release", "(Landroid/location/Location;Lexpo/modules/location/records/LocationLastKnownOptions;)Z", "isLocationValid", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "hasNetworkProviderEnabled", "(Landroid/content/Context;)Z", "Lcom/google/android/gms/location/LocationRequest;", "prepareLocationRequest$expo_location_release", "(Lexpo/modules/location/records/LocationOptions;)Lcom/google/android/gms/location/LocationRequest;", "prepareLocationRequest", "Lcom/google/android/gms/location/CurrentLocationRequest;", "prepareCurrentLocationRequest$expo_location_release", "(Lexpo/modules/location/records/LocationOptions;)Lcom/google/android/gms/location/CurrentLocationRequest;", "prepareCurrentLocationRequest", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationProvider", "locationRequest", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "requestSingleLocation", "(Lcom/google/android/gms/location/FusedLocationProviderClient;Lcom/google/android/gms/location/CurrentLocationRequest;Lexpo/modules/kotlin/Promise;)V", "Lexpo/modules/location/LocationModule;", "locationModule", "watchId", "requestContinuousUpdates", "(Lexpo/modules/location/LocationModule;Lcom/google/android/gms/location/LocationRequest;ILexpo/modules/kotlin/Promise;)V", "isAnyProviderAvailable", "Lexpo/modules/interfaces/permissions/Permissions;", "contextPermissions", "", "", "permissionStrings", "Lexpo/modules/location/records/PermissionRequestResponse;", "getPermissionsWithPermissionsManager$expo_location_release", "(Lexpo/modules/interfaces/permissions/Permissions;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPermissionsWithPermissionsManager", "Landroid/os/Bundle;", "askForPermissionsWithPermissionsManager$expo_location_release", "askForPermissionsWithPermissionsManager", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final LocationParams buildLocationParamsForAccuracy(int accuracy) {
            switch (accuracy) {
                case 1:
                    return new LocationParams(LocationAccuracy.LOWEST, 3000.0f, 10000L);
                case 2:
                    return new LocationParams(LocationAccuracy.LOW, 1000.0f, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
                case 3:
                    return new LocationParams(LocationAccuracy.MEDIUM, 100.0f, 3000L);
                case 4:
                    return new LocationParams(LocationAccuracy.HIGH, 50.0f, 2000L);
                case 5:
                    return new LocationParams(LocationAccuracy.HIGH, 25.0f, 1000L);
                case 6:
                    return new LocationParams(LocationAccuracy.HIGH, BitmapDescriptorFactory.HUE_RED, 500L);
                default:
                    return new LocationParams(LocationAccuracy.MEDIUM, 100.0f, 3000L);
            }
        }

        private final int mapAccuracyToPriority(int accuracy) {
            switch (accuracy) {
                case 1:
                    return 104;
                case 2:
                case 3:
                    return 102;
                case 4:
                case 5:
                case 6:
                    return 100;
                default:
                    return 102;
            }
        }

        private final LocationParams mapOptionsToLocationParams(LocationOptions options) {
            LocationParams locationParamsBuildLocationParamsForAccuracy = buildLocationParamsForAccuracy(options.getAccuracy());
            Long timeInterval = options.getTimeInterval();
            if (timeInterval != null) {
                locationParamsBuildLocationParamsForAccuracy.setInterval(timeInterval.longValue());
            }
            Integer distanceInterval = options.getDistanceInterval();
            if (distanceInterval != null) {
                locationParamsBuildLocationParamsForAccuracy.setDistance(distanceInterval.intValue());
            }
            return locationParamsBuildLocationParamsForAccuracy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 requestSingleLocation$lambda$1(Promise promise, Location location) {
            if (location == null) {
                promise.reject(new CurrentLocationIsUnavailableException());
                return h0.f84049a;
            }
            promise.resolve(new LocationResponse(location));
            return h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void requestSingleLocation$lambda$3(Promise promise, Exception it) {
            s.k(it, "it");
            promise.reject(new LocationRequestRejectedException(it));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void requestSingleLocation$lambda$4(Promise promise) {
            promise.reject(new LocationRequestCancelledException());
        }

        public final Object askForPermissionsWithPermissionsManager$expo_location_release(Permissions permissions, String[] strArr, Continuation<? super Bundle> continuation) {
            final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
            Permissions.askForPermissionsWithPermissionsManager(permissions, new Promise() { // from class: expo.modules.location.LocationHelpers$Companion$askForPermissionsWithPermissionsManager$2$1
                @Override // expo.modules.kotlin.Promise
                public void reject(CodedException codedException) {
                    Promise.DefaultImpls.reject(this, codedException);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve() {
                    Promise.DefaultImpls.resolve(this);
                }

                @Override // expo.modules.kotlin.Promise
                public void reject(String code, String message, Throwable cause) {
                    s.k(code, "code");
                    Continuation<Bundle> continuation2 = safeContinuation;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    continuation2.resumeWith(jn0.s.b(t.a(new CodedException(code, message, cause))));
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(double d11) {
                    Promise.DefaultImpls.resolve(this, d11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(float f11) {
                    Promise.DefaultImpls.resolve((Promise) this, f11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(int i11) {
                    Promise.DefaultImpls.resolve((Promise) this, i11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(String str) {
                    Promise.DefaultImpls.resolve(this, str);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(Collection<? extends Object> collection) {
                    Promise.DefaultImpls.resolve(this, collection);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(Map<String, ? extends Object> map) {
                    Promise.DefaultImpls.resolve(this, map);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(boolean z11) {
                    Promise.DefaultImpls.resolve(this, z11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(Object value) throws ConversionException {
                    Continuation<Bundle> continuation2 = safeContinuation;
                    Bundle bundle = value instanceof Bundle ? (Bundle) value : null;
                    if (bundle != null) {
                        continuation2.resumeWith(jn0.s.b(bundle));
                        return;
                    }
                    throw new ConversionException(Object.class, Bundle.class, "value returned by the permission promise is not a Bundle");
                }
            }, (String[]) Arrays.copyOf(strArr, strArr.length));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return orThrow;
        }

        public final Object getPermissionsWithPermissionsManager$expo_location_release(Permissions permissions, String[] strArr, Continuation<? super PermissionRequestResponse> continuation) {
            final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
            Permissions.getPermissionsWithPermissionsManager(permissions, new Promise() { // from class: expo.modules.location.LocationHelpers$Companion$getPermissionsWithPermissionsManager$2$1
                @Override // expo.modules.kotlin.Promise
                public void reject(CodedException codedException) {
                    Promise.DefaultImpls.reject(this, codedException);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve() {
                    Promise.DefaultImpls.resolve(this);
                }

                @Override // expo.modules.kotlin.Promise
                public void reject(String code, String message, Throwable cause) {
                    s.k(code, "code");
                    Continuation<PermissionRequestResponse> continuation2 = safeContinuation;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    continuation2.resumeWith(jn0.s.b(t.a(new CodedException(code, message, cause))));
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(double d11) {
                    Promise.DefaultImpls.resolve(this, d11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(float f11) {
                    Promise.DefaultImpls.resolve((Promise) this, f11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(int i11) {
                    Promise.DefaultImpls.resolve((Promise) this, i11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(String str) {
                    Promise.DefaultImpls.resolve(this, str);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(Collection<? extends Object> collection) {
                    Promise.DefaultImpls.resolve(this, collection);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(Map<String, ? extends Object> map) {
                    Promise.DefaultImpls.resolve(this, map);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(boolean z11) {
                    Promise.DefaultImpls.resolve(this, z11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(Object value) throws ConversionException {
                    Bundle bundle = value instanceof Bundle ? (Bundle) value : null;
                    if (bundle != null) {
                        Continuation<PermissionRequestResponse> continuation2 = safeContinuation;
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        continuation2.resumeWith(jn0.s.b(new PermissionRequestResponse(bundle)));
                        return;
                    }
                    throw new ConversionException(Object.class, Bundle.class, "value returned by the permission promise is not a Bundle");
                }
            }, (String[]) Arrays.copyOf(strArr, strArr.length));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return orThrow;
        }

        public final boolean hasNetworkProviderEnabled(Context context) {
            if (context == null) {
                return false;
            }
            Object systemService = context.getSystemService("location");
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            return locationManager != null && locationManager.isProviderEnabled("network");
        }

        public final boolean isAnyProviderAvailable(Context context) {
            Object systemService = context != null ? context.getSystemService("location") : null;
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            if (locationManager == null) {
                return false;
            }
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        }

        public final boolean isLocationValid$expo_location_release(Location location, LocationLastKnownOptions options) {
            s.k(options, "options");
            if (location == null) {
                return false;
            }
            Double maxAge = options.getMaxAge();
            double dDoubleValue = maxAge != null ? maxAge.doubleValue() : Double.MAX_VALUE;
            Double requiredAccuracy = options.getRequiredAccuracy();
            return ((double) (System.currentTimeMillis() - location.getTime())) <= dDoubleValue && ((double) location.getAccuracy()) <= (requiredAccuracy != null ? requiredAccuracy.doubleValue() : Double.MAX_VALUE);
        }

        public final CurrentLocationRequest prepareCurrentLocationRequest$expo_location_release(LocationOptions options) {
            s.k(options, "options");
            LocationParams locationParamsMapOptionsToLocationParams = mapOptionsToLocationParams(options);
            CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
            builder.setGranularity(0);
            builder.setPriority(LocationHelpers.INSTANCE.mapAccuracyToPriority(options.getAccuracy()));
            builder.setMaxUpdateAgeMillis(locationParamsMapOptionsToLocationParams.getInterval());
            CurrentLocationRequest currentLocationRequestBuild = builder.build();
            s.j(currentLocationRequestBuild, "build(...)");
            return currentLocationRequestBuild;
        }

        public final LocationRequest prepareLocationRequest$expo_location_release(LocationOptions options) {
            s.k(options, "options");
            LocationParams locationParamsMapOptionsToLocationParams = mapOptionsToLocationParams(options);
            LocationRequest locationRequestBuild = new LocationRequest.Builder(locationParamsMapOptionsToLocationParams.getInterval()).setMinUpdateIntervalMillis(locationParamsMapOptionsToLocationParams.getInterval()).setMaxUpdateDelayMillis(locationParamsMapOptionsToLocationParams.getInterval()).setMinUpdateDistanceMeters(locationParamsMapOptionsToLocationParams.getDistance()).setPriority(mapAccuracyToPriority(options.getAccuracy())).build();
            s.j(locationRequestBuild, "build(...)");
            return locationRequestBuild;
        }

        public final void requestContinuousUpdates(final LocationModule locationModule, LocationRequest locationRequest, final int watchId, final Promise promise) {
            s.k(locationModule, "locationModule");
            s.k(locationRequest, "locationRequest");
            s.k(promise, "promise");
            locationModule.requestLocationUpdates(locationRequest, Integer.valueOf(watchId), new LocationRequestCallbacks() { // from class: expo.modules.location.LocationHelpers$Companion$requestContinuousUpdates$1
                @Override // expo.modules.location.LocationRequestCallbacks
                public void onLocationChanged(Location location) {
                    s.k(location, "location");
                    locationModule.sendLocationResponse$expo_location_release(watchId, new LocationResponse(location));
                }

                @Override // expo.modules.location.LocationRequestCallbacks
                public void onLocationError(CodedException codedException) {
                    LocationRequestCallbacks.DefaultImpls.onLocationError(this, codedException);
                }

                @Override // expo.modules.location.LocationRequestCallbacks
                public void onRequestFailed(CodedException cause) {
                    s.k(cause, "cause");
                    promise.reject(cause);
                }

                @Override // expo.modules.location.LocationRequestCallbacks
                public void onRequestSuccess() {
                    promise.resolve((Object) null);
                }
            });
        }

        public final void requestSingleLocation(FusedLocationProviderClient locationProvider, CurrentLocationRequest locationRequest, final Promise promise) {
            s.k(locationProvider, "locationProvider");
            s.k(locationRequest, "locationRequest");
            s.k(promise, "promise");
            try {
                Task<Location> currentLocation = locationProvider.getCurrentLocation(locationRequest, (CancellationToken) null);
                final l lVar = new l() { // from class: expo.modules.location.a
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return LocationHelpers.Companion.requestSingleLocation$lambda$1(promise, (Location) obj);
                    }
                };
                currentLocation.addOnSuccessListener(new OnSuccessListener() { // from class: expo.modules.location.b
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        lVar.invoke(obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: expo.modules.location.c
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        LocationHelpers.Companion.requestSingleLocation$lambda$3(promise, exc);
                    }
                }).addOnCanceledListener(new OnCanceledListener() { // from class: expo.modules.location.d
                    @Override // com.google.android.gms.tasks.OnCanceledListener
                    public final void onCanceled() {
                        LocationHelpers.Companion.requestSingleLocation$lambda$4(promise);
                    }
                });
            } catch (SecurityException e11) {
                promise.reject(new LocationRequestRejectedException(e11));
            }
        }

        private Companion() {
        }
    }
}
