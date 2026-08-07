package com.fourthline.core.location;

import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.location.LocationProviderError;
import jn0.h0;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001:\u0002\u001d\u001eJ7\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u000b\u0010\tJ;\u0010\r\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/fourthline/core/location/LocationProvider;", "", "Lkotlin/Function1;", "Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "Ljn0/h0;", "success", "Lcom/fourthline/core/location/LocationProviderError;", "failure", "requestAuthorization", "(Lwn0/l;Lwn0/l;)V", "Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "requestFullAccuracy", "Lcom/fourthline/core/location/Coordinate;", "requestLocation", "cancelLocationRequest", "()V", "", "getLocationServicesEnabled", "()Z", "locationServicesEnabled", "getAuthorizationStatus", "()Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "authorizationStatus", "getAccuracyAuthorization", "()Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "accuracyAuthorization", "getLocation", "()Lcom/fourthline/core/location/Coordinate;", "location", "AccuracyAuthorization", "AuthorizationStatus", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LocationProvider {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "REDUCED", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum AccuracyAuthorization {
        FULL,
        REDUCED;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24136b = a.a(a());

        public static EnumEntries<AccuracyAuthorization> getEntries() {
            return f24136b;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_DETERMINED", "AUTHORIZED", "DENIED", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum AuthorizationStatus {
        NOT_DETERMINED,
        AUTHORIZED,
        DENIED;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24138b = a.a(a());

        public static EnumEntries<AuthorizationStatus> getEntries() {
            return f24138b;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: Access modifiers changed from: private */
        public static h0 a(Coordinate it) {
            s.k(it, "it");
            return h0.f84049a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void requestLocation$default(LocationProvider locationProvider, l lVar, l lVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestLocation");
            }
            if ((i11 & 1) != 0) {
                lVar = new l() { // from class: np.a
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return LocationProvider.DefaultImpls.a((Coordinate) obj2);
                    }
                };
            }
            if ((i11 & 2) != 0) {
                lVar2 = new l() { // from class: np.b
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return LocationProvider.DefaultImpls.a((LocationProviderError) obj2);
                    }
                };
            }
            locationProvider.requestLocation(lVar, lVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static h0 a(LocationProviderError it) {
            s.k(it, "it");
            return h0.f84049a;
        }
    }

    void cancelLocationRequest();

    AccuracyAuthorization getAccuracyAuthorization();

    AuthorizationStatus getAuthorizationStatus();

    Coordinate getLocation();

    boolean getLocationServicesEnabled();

    void requestAuthorization(l<? super AuthorizationStatus, h0> success, l<? super LocationProviderError, h0> failure);

    void requestFullAccuracy(l<? super AccuracyAuthorization, h0> success, l<? super LocationProviderError, h0> failure);

    void requestLocation(l<? super Coordinate, h0> success, l<? super LocationProviderError, h0> failure);
}
