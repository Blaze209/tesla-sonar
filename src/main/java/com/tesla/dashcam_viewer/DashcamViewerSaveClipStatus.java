package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.m, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001a\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/tesla/dashcam_viewer/m;", "", "", PermissionsResponse.STATUS_KEY, "", "downloadPercentage", "", "startEpochMs", "endEpochMs", "errorKey", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/lang/Double;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Double;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DashcamViewerSaveClipStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer downloadPercentage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double startEpochMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double endEpochMs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorKey;

    public DashcamViewerSaveClipStatus(String status, Integer num, Double d11, Double d12, String str) {
        p013kotlin.jvm.internal.s.k(status, "status");
        this.status = status;
        this.downloadPercentage = num;
        this.startEpochMs = d11;
        this.endEpochMs = d12;
        this.errorKey = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getDownloadPercentage() {
        return this.downloadPercentage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getEndEpochMs() {
        return this.endEpochMs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getErrorKey() {
        return this.errorKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getStartEpochMs() {
        return this.startEpochMs;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashcamViewerSaveClipStatus)) {
            return false;
        }
        DashcamViewerSaveClipStatus dashcamViewerSaveClipStatus = (DashcamViewerSaveClipStatus) other;
        return p013kotlin.jvm.internal.s.f(this.status, dashcamViewerSaveClipStatus.status) && p013kotlin.jvm.internal.s.f(this.downloadPercentage, dashcamViewerSaveClipStatus.downloadPercentage) && p013kotlin.jvm.internal.s.f(this.startEpochMs, dashcamViewerSaveClipStatus.startEpochMs) && p013kotlin.jvm.internal.s.f(this.endEpochMs, dashcamViewerSaveClipStatus.endEpochMs) && p013kotlin.jvm.internal.s.f(this.errorKey, dashcamViewerSaveClipStatus.errorKey);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Integer num = this.downloadPercentage;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d11 = this.startEpochMs;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.endEpochMs;
        int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str = this.errorKey;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DashcamViewerSaveClipStatus(status=" + this.status + ", downloadPercentage=" + this.downloadPercentage + ", startEpochMs=" + this.startEpochMs + ", endEpochMs=" + this.endEpochMs + ", errorKey=" + this.errorKey + ")";
    }

    public /* synthetic */ DashcamViewerSaveClipStatus(String str, Integer num, Double d11, Double d12, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : d11, (i11 & 8) != 0 ? null : d12, (i11 & 16) != 0 ? null : str2);
    }
}
