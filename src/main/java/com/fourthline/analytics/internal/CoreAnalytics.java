package com.fourthline.analytics.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/fourthline/analytics/internal/CoreAnalytics;", "", "<init>", "()V", "", AnalyticsAttribute.Error, "Ljn0/h0;", "onCreateFourthlineFolderFail", "(Ljava/lang/Throwable;)V", "onEnterDeleteFourthlineFolder", "onDeleteFourthlineFolderSuccess", "onDeleteFourthlineFolderFail", "", "isFromMockedSource", "isVpnEnabled", "isReducedAccuracy", "onLocationReceived", "(ZZZ)V", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoreAnalytics {
    public static final CoreAnalytics INSTANCE = new CoreAnalytics();

    private CoreAnalytics() {
    }

    public final void onCreateFourthlineFolderFail(Throwable error) {
        s.k(error, "error");
        FourthlineAnalytics.e$default(FourthlineAnalytics.INSTANCE, "filesystem_create_fourthline_folder_fail", error, null, 4, null);
    }

    public final void onDeleteFourthlineFolderFail(Throwable error) {
        s.k(error, "error");
        FourthlineAnalytics.e$default(FourthlineAnalytics.INSTANCE, "filesystem_delete_fourthline_folder_fail", error, null, 4, null);
    }

    public final void onDeleteFourthlineFolderSuccess() {
        FourthlineAnalytics.i$default(FourthlineAnalytics.INSTANCE, "filesystem_delete_fourthline_folder_success", null, null, 6, null);
    }

    public final void onEnterDeleteFourthlineFolder() {
        FourthlineAnalytics.i$default(FourthlineAnalytics.INSTANCE, "filesystem_delete_fourthline_folder_enter", null, null, 6, null);
    }

    public final void onLocationReceived(boolean isFromMockedSource, boolean isVpnEnabled, boolean isReducedAccuracy) {
        FourthlineAnalytics.i$default(FourthlineAnalytics.INSTANCE, "location_scan_did_retrieve_location", null, v0.m(x.a("is_from_mocked_source", Boolean.valueOf(isFromMockedSource)), x.a("is_vpn_enabled", Boolean.valueOf(isVpnEnabled)), x.a("location_accuracy", isReducedAccuracy ? "REDUCED" : "FULL")), 2, null);
    }
}
