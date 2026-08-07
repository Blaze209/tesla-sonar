package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: loaded from: classes9.dex */
public interface EnumEntriesDeserializationSupport {

    public static final class Default implements EnumEntriesDeserializationSupport {
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport
        public Boolean canSynthesizeEnumEntries() {
            return null;
        }
    }

    Boolean canSynthesizeEnumEntries();
}
