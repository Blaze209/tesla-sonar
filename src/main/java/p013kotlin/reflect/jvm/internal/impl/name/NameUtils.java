package p013kotlin.reflect.jvm.internal.impl.name;

import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes9.dex */
public final class NameUtils {
    public static final NameUtils INSTANCE = new NameUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f88184a = new q("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f88185b = "$context_receiver";

    private NameUtils() {
    }

    public static final Name contextReceiverName(int i11) {
        Name nameIdentifier = Name.identifier(f88185b + '_' + i11);
        s.j(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    public static final String sanitizeAsJavaIdentifier(String name) {
        s.k(name, "name");
        return f88184a.j(name, "_");
    }
}
