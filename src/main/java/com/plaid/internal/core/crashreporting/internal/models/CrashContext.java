package com.plaid.internal.core.crashreporting.internal.models;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;", "", "", "breadcrumbLimit", "Ljava/util/UUID;", "lastEventId", "", "Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb;", "breadcrumbs", "Lcom/plaid/internal/core/crashreporting/internal/models/User;", "user", "", "", "tags", "<init>", "(ILjava/util/UUID;Ljava/util/List;Lcom/plaid/internal/core/crashreporting/internal/models/User;Ljava/util/Map;)V", "Ljn0/h0;", "clear", "()V", "I", "Ljava/util/UUID;", "getLastEventId", "()Ljava/util/UUID;", "setLastEventId", "(Ljava/util/UUID;)V", "Ljava/util/List;", "Lcom/plaid/internal/core/crashreporting/internal/models/User;", "getUser", "()Lcom/plaid/internal/core/crashreporting/internal/models/User;", "setUser", "(Lcom/plaid/internal/core/crashreporting/internal/models/User;)V", "Ljava/util/Map;", "getTags$crash_reporting_release", "()Ljava/util/Map;", "setTags$crash_reporting_release", "(Ljava/util/Map;)V", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CrashContext {
    public static final int DEFAULT_BREADCRUMB_LIMIT = 50;
    private final int breadcrumbLimit;
    private volatile List<Breadcrumb> breadcrumbs;
    private volatile UUID lastEventId;
    private volatile Map<String, String> tags;
    private volatile User user;

    public CrashContext() {
        this(0, null, null, null, null, 31, null);
    }

    public final synchronized void clear() {
        try {
            this.lastEventId = null;
            List<Breadcrumb> list = this.breadcrumbs;
            if (list != null) {
                list.clear();
            }
            this.user = null;
            Map<String, String> map = this.tags;
            if (map != null) {
                map.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final UUID getLastEventId() {
        return this.lastEventId;
    }

    public final Map<String, String> getTags$crash_reporting_release() {
        return this.tags;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setLastEventId(UUID uuid) {
        this.lastEventId = uuid;
    }

    public final void setTags$crash_reporting_release(Map<String, String> map) {
        this.tags = map;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public CrashContext(int i11, UUID uuid, List<Breadcrumb> list, User user, Map<String, String> map) {
        this.breadcrumbLimit = i11;
        this.lastEventId = uuid;
        this.breadcrumbs = list;
        this.user = user;
        this.tags = map;
    }

    public /* synthetic */ CrashContext(int i11, UUID uuid, List list, User user, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 50 : i11, (i12 & 2) != 0 ? null : uuid, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? null : user, (i12 & 16) != 0 ? null : map);
    }
}
