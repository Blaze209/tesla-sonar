package p013kotlin.reflect.jvm.internal.impl.load.java;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
public final class BuiltinSpecialPropertiesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName a(FqName fqName, String str) {
        FqName fqNameChild = fqName.child(Name.identifier(str));
        s.j(fqNameChild, "child(...)");
        return fqNameChild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName b(FqNameUnsafe fqNameUnsafe, String str) {
        FqName safe = fqNameUnsafe.child(Name.identifier(str)).toSafe();
        s.j(safe, "toSafe(...)");
        return safe;
    }
}
