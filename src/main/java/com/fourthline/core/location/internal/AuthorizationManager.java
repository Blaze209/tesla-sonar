package com.fourthline.core.location.internal;

import com.fourthline.core.location.LocationProvider;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00060\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/fourthline/core/location/internal/AuthorizationManager;", "", "Lkotlin/Function1;", "", "", "", "Ljn0/h0;", "callback", "requestAuthorization", "(Lwn0/l;)V", "Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "getAuthorizationStatus", "()Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "getAuthorizationAccuracy", "()Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AuthorizationManager {
    LocationProvider.AccuracyAuthorization getAuthorizationAccuracy();

    LocationProvider.AuthorizationStatus getAuthorizationStatus();

    void requestAuthorization(l<? super Map<String, Boolean>, h0> callback);
}
