package tk0;

import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\b\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\b\u0010\u0007\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"", "B", Gender.FEMALE, "Lok0/a;", "Ltk0/i;", "plugin", "c", "(Lok0/a;Ltk0/i;)Ljava/lang/Object;", "b", "Ldl0/a;", "Ldl0/b;", "a", "Ldl0/a;", "()Ldl0/a;", "PLUGIN_INSTALLED_LIST", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final dl0.a<dl0.b> f114703a = new dl0.a<>("ApplicationPluginRegistry");

    public static final dl0.a<dl0.b> a() {
        return f114703a;
    }

    public static final <B, F> F b(ok0.a aVar, i<? extends B, F> plugin) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(plugin, "plugin");
        F f11 = (F) c(aVar, plugin);
        if (f11 != null) {
            return f11;
        }
        throw new IllegalStateException("Plugin " + plugin + " is not installed. Consider using `install(" + plugin.getKey() + ")` in client config first.");
    }

    public static final <B, F> F c(ok0.a aVar, i<? extends B, F> plugin) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(plugin, "plugin");
        dl0.b bVar = (dl0.b) aVar.getAttributes().a(f114703a);
        if (bVar != null) {
            return (F) bVar.a(plugin.getKey());
        }
        return null;
    }
}
