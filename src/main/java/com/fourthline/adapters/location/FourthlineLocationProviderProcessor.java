package com.fourthline.adapters.location;

import android.content.Context;
import androidx.appcompat.app.c;
import com.fourthline.adapters.errors.LocationProviderJSONError;
import com.fourthline.adapters.location.FourthlineLocationProviderProcessor;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.FourthlineLocationHelper;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.location.LocationProviderError;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import wn0.a;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0003R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/fourthline/adapters/location/FourthlineLocationProviderProcessor;", "", "<init>", "()V", "Lcom/fourthline/core/location/LocationProviderError;", AnalyticsAttribute.Error, "Lkotlin/Function2;", "", "", "Ljn0/h0;", "failure", "sendError", "(Lcom/fourthline/core/location/LocationProviderError;Lwn0/p;)V", "Landroidx/appcompat/app/c;", "activity", "Lkotlin/Function1;", "Lcom/fourthline/core/location/Coordinate;", "onSuccess", "onFailure", "requestLocation", "(Landroidx/appcompat/app/c;Lwn0/l;Lwn0/p;)V", "requestAuthorizationAndLocation", "cancelLocationRequest", "Lcom/fourthline/core/location/LocationProvider;", "locationProvider", "Lcom/fourthline/core/location/LocationProvider;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FourthlineLocationProviderProcessor {
    public static final FourthlineLocationProviderProcessor INSTANCE = new FourthlineLocationProviderProcessor();
    private static LocationProvider locationProvider;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocationProvider.AccuracyAuthorization.values().length];
            try {
                iArr[LocationProvider.AccuracyAuthorization.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationProvider.AccuracyAuthorization.REDUCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FourthlineLocationProviderProcessor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$7(final LocationProvider locationProvider2, final l lVar, final p pVar, LocationProvider.AuthorizationStatus it) {
        s.k(it, "it");
        final a aVar = new a() { // from class: lp.b
            @Override // wn0.a
            public final Object invoke() {
                return FourthlineLocationProviderProcessor.requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$7$lambda$4(locationProvider2, lVar, pVar);
            }
        };
        int i11 = WhenMappings.$EnumSwitchMapping$0[locationProvider2.getAccuracyAuthorization().ordinal()];
        if (i11 == 1) {
            aVar.invoke();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            locationProvider2.requestFullAccuracy(new l() { // from class: lp.c
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return FourthlineLocationProviderProcessor.requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$7$lambda$5(aVar, (LocationProvider.AccuracyAuthorization) obj);
                }
            }, new l() { // from class: lp.d
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return FourthlineLocationProviderProcessor.requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$7$lambda$6(pVar, (LocationProviderError) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$7$lambda$4(LocationProvider locationProvider2, l lVar, final p pVar) {
        locationProvider2.requestLocation(lVar, new l() { // from class: lp.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return FourthlineLocationProviderProcessor.requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$7$lambda$4$lambda$3(pVar, (LocationProviderError) obj);
            }
        });
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$7$lambda$4$lambda$3(p pVar, LocationProviderError it) {
        s.k(it, "it");
        INSTANCE.sendError(it, pVar);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$7$lambda$5(a aVar, LocationProvider.AccuracyAuthorization it) {
        s.k(it, "it");
        aVar.invoke();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$7$lambda$6(p pVar, LocationProviderError it) {
        s.k(it, "it");
        INSTANCE.sendError(it, pVar);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$8(p pVar, LocationProviderError it) {
        s.k(it, "it");
        INSTANCE.sendError(it, pVar);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 requestLocation$lambda$1(p pVar, LocationProviderError it) {
        s.k(it, "it");
        INSTANCE.sendError(it, pVar);
        return h0.f84049a;
    }

    private final void sendError(LocationProviderError error, p<? super Integer, ? super String, h0> failure) {
        if (error instanceof LocationProviderError.LocationServicesNotEnabled) {
            LocationProviderJSONError locationProviderJSONError = LocationProviderJSONError.LOCATION_SERVICES_NOT_ENABLED;
            failure.invoke(Integer.valueOf(locationProviderJSONError.getErrorCode()), locationProviderJSONError.getErrorDescription());
            return;
        }
        if (error instanceof LocationProviderError.LocationPermissionsNotGranted) {
            LocationProviderJSONError locationProviderJSONError2 = LocationProviderJSONError.LOCATION_PERMISSIONS_NOT_GRANTED;
            failure.invoke(Integer.valueOf(locationProviderJSONError2.getErrorCode()), locationProviderJSONError2.getErrorDescription());
        } else if (error instanceof LocationProviderError.AnotherRequestInProgress) {
            LocationProviderJSONError locationProviderJSONError3 = LocationProviderJSONError.ANOTHER_REQUEST_IS_IN_PROGRESS;
            failure.invoke(Integer.valueOf(locationProviderJSONError3.getErrorCode()), locationProviderJSONError3.getErrorDescription());
        } else {
            if (!(error instanceof LocationProviderError.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            LocationProviderJSONError locationProviderJSONError4 = LocationProviderJSONError.UNKNOWN;
            failure.invoke(Integer.valueOf(locationProviderJSONError4.getErrorCode()), locationProviderJSONError4.getErrorDescription());
        }
    }

    public final void cancelLocationRequest() {
        LocationProvider locationProvider2 = locationProvider;
        if (locationProvider2 != null) {
            locationProvider2.cancelLocationRequest();
        }
        locationProvider = null;
    }

    public final void requestAuthorizationAndLocation(c activity, final l<? super Coordinate, h0> onSuccess, final p<? super Integer, ? super String, h0> onFailure) {
        s.k(activity, "activity");
        s.k(onSuccess, "onSuccess");
        s.k(onFailure, "onFailure");
        if (locationProvider == null) {
            Context applicationContext = activity.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            locationProvider = FourthlineLocationHelper.getLocationProvider(applicationContext, activity.getActivityResultRegistry());
        }
        final LocationProvider locationProvider2 = locationProvider;
        if (locationProvider2 != null) {
            locationProvider2.requestAuthorization(new l() { // from class: lp.e
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return FourthlineLocationProviderProcessor.requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$7(locationProvider2, onSuccess, onFailure, (LocationProvider.AuthorizationStatus) obj);
                }
            }, new l() { // from class: lp.f
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return FourthlineLocationProviderProcessor.requestAuthorizationAndLocation$lambda$10$lambda$9$lambda$8(onFailure, (LocationProviderError) obj);
                }
            });
        }
    }

    public final void requestLocation(c activity, l<? super Coordinate, h0> onSuccess, final p<? super Integer, ? super String, h0> onFailure) {
        s.k(activity, "activity");
        s.k(onSuccess, "onSuccess");
        s.k(onFailure, "onFailure");
        if (locationProvider == null) {
            Context applicationContext = activity.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            locationProvider = FourthlineLocationHelper.getLocationProvider(applicationContext, activity.getActivityResultRegistry());
        }
        LocationProvider locationProvider2 = locationProvider;
        if (locationProvider2 != null) {
            locationProvider2.requestLocation(onSuccess, new l() { // from class: lp.g
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return FourthlineLocationProviderProcessor.requestLocation$lambda$1(onFailure, (LocationProviderError) obj);
                }
            });
        }
    }
}
