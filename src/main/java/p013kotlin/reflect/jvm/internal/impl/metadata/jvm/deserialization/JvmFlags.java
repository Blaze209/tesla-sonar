package p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmFlags {
    public static final JvmFlags INSTANCE = new JvmFlags();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Flags.BooleanFlagField f88147a = Flags.FlagField.booleanFirst();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Flags.BooleanFlagField f88148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Flags.BooleanFlagField f88149c;

    static {
        Flags.BooleanFlagField booleanFlagFieldBooleanFirst = Flags.FlagField.booleanFirst();
        f88148b = booleanFlagFieldBooleanFirst;
        f88149c = Flags.FlagField.booleanAfter(booleanFlagFieldBooleanFirst);
    }

    private JvmFlags() {
    }

    public final Flags.BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return f88147a;
    }
}
