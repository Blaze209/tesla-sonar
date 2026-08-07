package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface zzcr extends IInterface {
    void beginAdUnitExposure(String str, long j11);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j11);

    void endAdUnitExposure(String str, long j11);

    void generateEventId(zzcu zzcuVar);

    void getAppInstanceId(zzcu zzcuVar);

    void getCachedAppInstanceId(zzcu zzcuVar);

    void getConditionalUserProperties(String str, String str2, zzcu zzcuVar);

    void getCurrentScreenClass(zzcu zzcuVar);

    void getCurrentScreenName(zzcu zzcuVar);

    void getGmpAppId(zzcu zzcuVar);

    void getMaxUserProperties(String str, zzcu zzcuVar);

    void getSessionId(zzcu zzcuVar);

    void getTestFlag(zzcu zzcuVar, int i11);

    void getUserProperties(String str, String str2, boolean z11, zzcu zzcuVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j11);

    void isDataCollectionEnabled(zzcu zzcuVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j11);

    void logHealthData(int i11, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j11);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j11);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j11);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j11);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j11);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j11);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j11);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j11);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcu zzcuVar, long j11);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j11);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j11);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j11);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j11);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j11);

    void performAction(Bundle bundle, zzcu zzcuVar, long j11);

    void registerOnMeasurementEventListener(zzda zzdaVar);

    void resetAnalyticsData(long j11);

    void retrieveAndUploadBatches(zzcx zzcxVar);

    void setConditionalUserProperty(Bundle bundle, long j11);

    void setConsent(Bundle bundle, long j11);

    void setConsentThirdParty(Bundle bundle, long j11);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j11);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j11);

    void setDataCollectionEnabled(boolean z11);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzda zzdaVar);

    void setInstanceIdProvider(zzdc zzdcVar);

    void setMeasurementEnabled(boolean z11, long j11);

    void setMinimumSessionDuration(long j11);

    void setSessionTimeoutDuration(long j11);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j11);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z11, long j11);

    void unregisterOnMeasurementEventListener(zzda zzdaVar);
}
