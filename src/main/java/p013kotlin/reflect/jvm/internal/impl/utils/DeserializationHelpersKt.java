package p013kotlin.reflect.jvm.internal.impl.utils;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;

/* JADX INFO: loaded from: classes9.dex */
public final class DeserializationHelpersKt {
    public static final JvmMetadataVersion jvmMetadataVersionOrDefault(DeserializationConfiguration deserializationConfiguration) {
        s.k(deserializationConfiguration, "<this>");
        BinaryVersion binaryVersion = deserializationConfiguration.getBinaryVersion();
        JvmMetadataVersion jvmMetadataVersion = binaryVersion instanceof JvmMetadataVersion ? (JvmMetadataVersion) binaryVersion : null;
        return jvmMetadataVersion == null ? JvmMetadataVersion.INSTANCE : jvmMetadataVersion;
    }
}
