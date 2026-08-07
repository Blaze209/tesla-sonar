package com.plaid.internal.core.crashreporting.internal.models;

import ax.c;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.C4571x;
import java.util.Date;
import java.util.Map;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002&'BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb;", "", "type", "Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb$Type;", "timestamp", "Ljava/util/Date;", "level", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "message", "", "category", "data", "", "(Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb$Type;Ljava/util/Date;Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCategory", "()Ljava/lang/String;", "getData", "()Ljava/util/Map;", "getLevel", "()Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "getMessage", "getTimestamp", "()Ljava/util/Date;", "getType", "()Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Level", "Type", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Breadcrumb {

    @c("category")
    private final String category;

    @c("data")
    private final Map<String, String> data;

    @c("level")
    private final CrashLogLevel level;

    @c("message")
    private final String message;

    @c("timestamp")
    private final Date timestamp;

    @c("type")
    private final Type type;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb$Level;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEBUG", "INFO", "WARNING", "ERROR", "CRITICAL", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Level {
        DEBUG("debug"),
        INFO("info"),
        WARNING("warning"),
        ERROR(AnalyticsAttribute.Error),
        CRITICAL("critical");

        private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

        @c("value")
        private final String value;

        Level(String str) {
            this.value = str;
        }

        public static EnumEntries<Level> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEFAULT", "HTTP", "NAVIGATION", "USER", "USER_ACTION", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Type {
        DEFAULT("default"),
        HTTP("http"),
        NAVIGATION("navigation"),
        USER("user"),
        USER_ACTION("user_action");

        private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

        @c("value")
        private final String value;

        Type(String str) {
            this.value = str;
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public Breadcrumb() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Breadcrumb copy$default(Breadcrumb breadcrumb, Type type, Date date, CrashLogLevel crashLogLevel, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            type = breadcrumb.type;
        }
        if ((i11 & 2) != 0) {
            date = breadcrumb.timestamp;
        }
        if ((i11 & 4) != 0) {
            crashLogLevel = breadcrumb.level;
        }
        if ((i11 & 8) != 0) {
            str = breadcrumb.message;
        }
        if ((i11 & 16) != 0) {
            str2 = breadcrumb.category;
        }
        if ((i11 & 32) != 0) {
            map = breadcrumb.data;
        }
        String str3 = str2;
        Map map2 = map;
        return breadcrumb.copy(type, date, crashLogLevel, str, str3, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CrashLogLevel getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final Map<String, String> component6() {
        return this.data;
    }

    public final Breadcrumb copy(Type type, Date timestamp, CrashLogLevel level, String message, String category, Map<String, String> data) {
        s.k(timestamp, "timestamp");
        s.k(level, "level");
        s.k(message, "message");
        s.k(category, "category");
        s.k(data, "data");
        return new Breadcrumb(type, timestamp, level, message, category, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Breadcrumb)) {
            return false;
        }
        Breadcrumb breadcrumb = (Breadcrumb) other;
        return this.type == breadcrumb.type && s.f(this.timestamp, breadcrumb.timestamp) && this.level == breadcrumb.level && s.f(this.message, breadcrumb.message) && s.f(this.category, breadcrumb.category) && s.f(this.data, breadcrumb.data);
    }

    public final String getCategory() {
        return this.category;
    }

    public final Map<String, String> getData() {
        return this.data;
    }

    public final CrashLogLevel getLevel() {
        return this.level;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        Type type = this.type;
        return this.data.hashCode() + C4571x.a(this.category, C4571x.a(this.message, (this.level.hashCode() + ((this.timestamp.hashCode() + ((type == null ? 0 : type.hashCode()) * 31)) * 31)) * 31, 31), 31);
    }

    public String toString() {
        return "Breadcrumb(type=" + this.type + ", timestamp=" + this.timestamp + ", level=" + this.level + ", message=" + this.message + ", category=" + this.category + ", data=" + this.data + ")";
    }

    public Breadcrumb(Type type, Date timestamp, CrashLogLevel level, String message, String category, Map<String, String> data) {
        s.k(timestamp, "timestamp");
        s.k(level, "level");
        s.k(message, "message");
        s.k(category, "category");
        s.k(data, "data");
        this.type = type;
        this.timestamp = timestamp;
        this.level = level;
        this.message = message;
        this.category = category;
        this.data = data;
    }

    public /* synthetic */ Breadcrumb(Type type, Date date, CrashLogLevel crashLogLevel, String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : type, (i11 & 2) != 0 ? new Date() : date, (i11 & 4) != 0 ? CrashLogLevel.INFO : crashLogLevel, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? "" : str2, (i11 & 32) != 0 ? v0.i() : map);
    }
}
