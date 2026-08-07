package com.fourthline.analytics.internal;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR#\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016j\u0002`\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/fourthline/analytics/internal/AnalyticsContext;", "", "", "name", "<init>", "(Ljava/lang/String;)V", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "clear", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "_mutableData", "Ljava/util/Map;", "getIdentifier", "identifier", "getSchema", "schema", "", "Lcom/fourthline/analytics/internal/AnalyticsAttributes;", "getData", "()Ljava/util/Map;", "data", "Companion", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AnalyticsContext {
    public static final String Analysis = "analysis";
    public static final String Features = "features";
    public static final String Flow = "flow";
    public static final String Scanner = "scanner";
    public static final String Screen = "screen";
    public static final String Workflow = "workflow";
    private final Map<String, Object> _mutableData;
    private final String name;

    public AnalyticsContext(String name) {
        s.k(name, "name");
        this.name = name;
        this._mutableData = v0.o(x.a("name", name));
    }

    public final void clear(String key) {
        s.k(key, "key");
        this._mutableData.remove(key);
    }

    public final Map<String, Object> getData() {
        return this._mutableData;
    }

    public abstract String getIdentifier();

    public final String getName() {
        return this.name;
    }

    public abstract String getSchema();

    public final void set(String key, Object value) {
        s.k(key, "key");
        this._mutableData.put(key, value);
    }
}
