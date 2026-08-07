package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0016\u001a\u00060\bj\u0002`\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\f\b\u0002\u0010\u0007\u001a\u00060\bj\u0002`\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0007\u001a\u00060\bj\u0002`\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/tesla/oapi/ShareCommandRequestBody;", "", "type", "", "value", "Lcom/tesla/oapi/ShareCommandRequestBody$Value;", "locale", "timestamp", "", "Lcom/tesla/oapi/MillisecondsSince1970;", "<init>", "(Ljava/lang/String;Lcom/tesla/oapi/ShareCommandRequestBody$Value;Ljava/lang/String;J)V", "getType", "()Ljava/lang/String;", "getValue", "()Lcom/tesla/oapi/ShareCommandRequestBody$Value;", "getLocale", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Value", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShareCommandRequestBody {
    public static final String CN_FAKE_BAIDU_MAP_URL = "http://j.map.baidu.com/placeholder";

    @g(name = "locale")
    private final String locale;

    @g(name = "timestamp")
    private final long timestamp;

    @g(name = "type")
    private final String type;

    @g(name = "value")
    private final Value value;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/tesla/oapi/ShareCommandRequestBody$Value;", "", "type", "", "action", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getAction", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Value {

        @g(name = "android.intent.ACTION")
        private final String action;

        @g(name = "android.intent.extra.TEXT")
        private final String text;

        @g(name = "android.intent.TYPE")
        private final String type;

        public Value(String type, String action, String text) {
            s.k(type, "type");
            s.k(action, "action");
            s.k(text, "text");
            this.type = type;
            this.action = action;
            this.text = text;
        }

        public static /* synthetic */ Value copy$default(Value value, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = value.type;
            }
            if ((i11 & 2) != 0) {
                str2 = value.action;
            }
            if ((i11 & 4) != 0) {
                str3 = value.text;
            }
            return value.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Value copy(String type, String action, String text) {
            s.k(type, "type");
            s.k(action, "action");
            s.k(text, "text");
            return new Value(type, action, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return s.f(this.type, value.type) && s.f(this.action, value.action) && s.f(this.text, value.text);
        }

        public final String getAction() {
            return this.action;
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.type.hashCode() * 31) + this.action.hashCode()) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "Value(type=" + this.type + ", action=" + this.action + ", text=" + this.text + ")";
        }
    }

    public ShareCommandRequestBody(String type, Value value, String locale, long j11) {
        s.k(type, "type");
        s.k(value, "value");
        s.k(locale, "locale");
        this.type = type;
        this.value = value;
        this.locale = locale;
        this.timestamp = j11;
    }

    public static /* synthetic */ ShareCommandRequestBody copy$default(ShareCommandRequestBody shareCommandRequestBody, String str, Value value, String str2, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shareCommandRequestBody.type;
        }
        if ((i11 & 2) != 0) {
            value = shareCommandRequestBody.value;
        }
        if ((i11 & 4) != 0) {
            str2 = shareCommandRequestBody.locale;
        }
        if ((i11 & 8) != 0) {
            j11 = shareCommandRequestBody.timestamp;
        }
        String str3 = str2;
        return shareCommandRequestBody.copy(str, value, str3, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Value getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ShareCommandRequestBody copy(String type, Value value, String locale, long timestamp) {
        s.k(type, "type");
        s.k(value, "value");
        s.k(locale, "locale");
        return new ShareCommandRequestBody(type, value, locale, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareCommandRequestBody)) {
            return false;
        }
        ShareCommandRequestBody shareCommandRequestBody = (ShareCommandRequestBody) other;
        return s.f(this.type, shareCommandRequestBody.type) && s.f(this.value, shareCommandRequestBody.value) && s.f(this.locale, shareCommandRequestBody.locale) && this.timestamp == shareCommandRequestBody.timestamp;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.value.hashCode()) * 31) + this.locale.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "ShareCommandRequestBody(type=" + this.type + ", value=" + this.value + ", locale=" + this.locale + ", timestamp=" + this.timestamp + ")";
    }
}
