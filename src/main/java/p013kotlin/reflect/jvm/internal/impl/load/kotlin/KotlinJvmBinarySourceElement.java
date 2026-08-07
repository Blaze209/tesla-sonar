package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* JADX INFO: loaded from: classes9.dex */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinJvmBinaryClass f87593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IncompatibleVersionErrorData<JvmMetadataVersion> f87594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DeserializedContainerAbiStability f87596d;

    public KotlinJvmBinarySourceElement(KotlinJvmBinaryClass binaryClass, IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z11, DeserializedContainerAbiStability abiStability) {
        s.k(binaryClass, "binaryClass");
        s.k(abiStability, "abiStability");
        this.f87593a = binaryClass;
        this.f87594b = incompatibleVersionErrorData;
        this.f87595c = z11;
        this.f87596d = abiStability;
    }

    public final KotlinJvmBinaryClass getBinaryClass() {
        return this.f87593a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        s.j(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public String getPresentableString() {
        return "Class '" + this.f87593a.getClassId().asSingleFqName().asString() + CoreConstants.SINGLE_QUOTE_CHAR;
    }

    public String toString() {
        return KotlinJvmBinarySourceElement.class.getSimpleName() + ": " + this.f87593a;
    }
}
