package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmBuiltInsCustomizerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Name f86661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Name f86662b;

    static {
        Name nameIdentifier = Name.identifier("getFirst");
        s.j(nameIdentifier, "identifier(...)");
        f86661a = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("getLast");
        s.j(nameIdentifier2, "identifier(...)");
        f86662b = nameIdentifier2;
    }
}
