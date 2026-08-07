package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmEnumEntriesDeserializationSupport implements EnumEntriesDeserializationSupport {
    public static final JvmEnumEntriesDeserializationSupport INSTANCE = new JvmEnumEntriesDeserializationSupport();

    private JvmEnumEntriesDeserializationSupport() {
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport
    public Boolean canSynthesizeEnumEntries() {
        return Boolean.TRUE;
    }
}
