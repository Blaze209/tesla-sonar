package io.sentry;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.Scopes;

/* JADX INFO: loaded from: classes9.dex */
public enum k {
    All("__all__"),
    Default("default"),
    Error(AnalyticsAttribute.Error),
    Feedback("feedback"),
    Session("session"),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    TraceMetric("trace_metric"),
    Monitor("monitor"),
    Profile(Scopes.PROFILE),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    k(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
