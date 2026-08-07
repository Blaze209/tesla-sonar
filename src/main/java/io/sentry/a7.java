package io.sentry;

import com.google.android.gms.common.Scopes;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public enum a7 implements a2 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile(Scopes.PROFILE),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    public static final class a implements q1<a7> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a7 a(i3 i3Var, ILogger iLogger) {
            return a7.valueOfLabel(i3Var.O().toLowerCase(Locale.ROOT));
        }
    }

    a7(String str) {
        this.itemType = str;
    }

    public static a7 resolve(Object obj) {
        if (obj instanceof r6) {
            return ((r6) obj).C().g() == null ? Event : Feedback;
        }
        if (obj instanceof io.sentry.protocol.e0) {
            return Transaction;
        }
        if (obj instanceof f8) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    public static a7 valueOfLabel(String str) {
        for (a7 a7Var : values()) {
            if (a7Var.itemType.equals(str)) {
                return a7Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.w(this.itemType);
    }
}
