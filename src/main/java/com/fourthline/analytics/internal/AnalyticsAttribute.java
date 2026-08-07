package com.fourthline.analytics.internal;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/fourthline/analytics/internal/AnalyticsAttribute;", "", "<init>", "()V", "Name", "", "Value", "Intent", "Error", "Reason", "ElapsedTime", "DocumentCountry", "DocumentType", "NotAvailable", "Environment", "WorkflowId", "BusinessPartner", "PluginType", "PluginPlatformVersion", "Vision", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnalyticsAttribute {
    public static final String BusinessPartner = "business_partner";
    public static final String DocumentCountry = "document_country";
    public static final String DocumentType = "document_type";
    public static final String ElapsedTime = "elapsed_time";
    public static final String Environment = "environment";
    public static final String Error = "error";
    public static final AnalyticsAttribute INSTANCE = new AnalyticsAttribute();
    public static final String Intent = "intent";
    public static final String Name = "name";
    public static final String NotAvailable = "n/a";
    public static final String PluginPlatformVersion = "plugin_platform_version";
    public static final String PluginType = "plugin_type";
    public static final String Reason = "reason";
    public static final String Value = "value";
    public static final String WorkflowId = "workflow_id";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/fourthline/analytics/internal/AnalyticsAttribute$Vision;", "", "<init>", "()V", "VideoDurationTarget", "", "VideoResolution", "VideoResolutionTarget", "VideoCodec", "VideoBitrateTarget", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Vision {
        public static final Vision INSTANCE = new Vision();
        public static final String VideoBitrateTarget = "video_bitrate_target";
        public static final String VideoCodec = "video_codec";
        public static final String VideoDurationTarget = "video_duration_target";
        public static final String VideoResolution = "video_resolution";
        public static final String VideoResolutionTarget = "video_resolution_target";

        private Vision() {
        }
    }

    private AnalyticsAttribute() {
    }
}
