package l40;

import android.app.Application;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import jn0.t;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import wo0.b;
import wo0.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Ll40/a;", "", "Landroid/app/Application;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/app/Application;)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "a", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "()Ljava/lang/Boolean;", "overriddenNative", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public a(Application context) {
        s.k(context, "context");
        this.sharedPreferences = context.getSharedPreferences("FINANCIAL_CONNECTIONS_DEBUG", 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    public final Boolean a() {
        Object objB;
        Boolean bool;
        JsonPrimitive jsonPrimitiveP;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            String string = this.sharedPreferences.getString("json", null);
            if (string != null) {
                b.Companion companion2 = b.INSTANCE;
                d<JsonObject> dVarSerializer = JsonObject.INSTANCE.serializer();
                s.h(string);
                JsonElement jsonElement = (JsonElement) ((JsonObject) companion2.d(dVarSerializer, string)).get("financial_connections_override_native");
                String strH = (jsonElement == null || (jsonPrimitiveP = j.p(jsonElement)) == null) ? null : j.h(jsonPrimitiveP);
                if (s.f(strH, "native")) {
                    bool = Boolean.TRUE;
                } else if (s.f(strH, "web")) {
                    bool = Boolean.FALSE;
                } else {
                    bool = null;
                }
            } else {
                bool = null;
            }
            objB = jn0.s.b(bool);
        } catch (Throwable th2) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        return (Boolean) (jn0.s.g(objB) ? null : objB);
    }
}
