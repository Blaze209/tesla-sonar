package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExtensionRegistryLite f88268b = new ExtensionRegistryLite(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, GeneratedMessageLite.GeneratedExtension<?, ?>> f88269a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f88270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f88271b;

        a(Object obj, int i11) {
            this.f88270a = obj;
            this.f88271b = i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f88270a == aVar.f88270a && this.f88271b == aVar.f88271b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f88270a) * 65535) + this.f88271b;
        }
    }

    ExtensionRegistryLite() {
        this.f88269a = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        return f88268b;
    }

    public static ExtensionRegistryLite newInstance() {
        return new ExtensionRegistryLite();
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f88269a.put(new a(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i11) {
        return (GeneratedMessageLite.GeneratedExtension) this.f88269a.get(new a(containingtype, i11));
    }

    private ExtensionRegistryLite(boolean z11) {
        this.f88269a = Collections.EMPTY_MAP;
    }
}
