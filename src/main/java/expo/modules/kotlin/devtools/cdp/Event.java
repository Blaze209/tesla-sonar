package expo.modules.kotlin.devtools.cdp;

import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\r\u0010\u000f\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/devtools/cdp/Event;", "", "method", "", "params", "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", "Lexpo/modules/kotlin/devtools/cdp/EventParams;", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;)V", "getMethod", "()Ljava/lang/String;", "getParams", "()Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;", "toJson", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Event {
    private final String method;
    private final JsonSerializable params;

    public Event(String method, JsonSerializable params) {
        s.k(method, "method");
        s.k(params, "params");
        this.method = method;
        this.params = params;
    }

    public static /* synthetic */ Event copy$default(Event event, String str, JsonSerializable jsonSerializable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = event.method;
        }
        if ((i11 & 2) != 0) {
            jsonSerializable = event.params;
        }
        return event.copy(str, jsonSerializable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonSerializable getParams() {
        return this.params;
    }

    public final Event copy(String method, JsonSerializable params) {
        s.k(method, "method");
        s.k(params, "params");
        return new Event(method, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return s.f(this.method, event.method) && s.f(this.params, event.params);
    }

    public final String getMethod() {
        return this.method;
    }

    public final JsonSerializable getParams() {
        return this.params;
    }

    public int hashCode() {
        return (this.method.hashCode() * 31) + this.params.hashCode();
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", this.method);
        jSONObject.put("params", this.params.toJSONObject());
        String string = jSONObject.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public String toString() {
        return "Event(method=" + this.method + ", params=" + this.params + ")";
    }
}
