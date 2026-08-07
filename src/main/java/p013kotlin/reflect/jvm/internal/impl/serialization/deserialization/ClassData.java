package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;

/* JADX INFO: loaded from: classes9.dex */
public final class ClassData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NameResolver f88585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Class f88586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BinaryVersion f88587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SourceElement f88588d;

    public ClassData(NameResolver nameResolver, ProtoBuf.Class classProto, BinaryVersion metadataVersion, SourceElement sourceElement) {
        s.k(nameResolver, "nameResolver");
        s.k(classProto, "classProto");
        s.k(metadataVersion, "metadataVersion");
        s.k(sourceElement, "sourceElement");
        this.f88585a = nameResolver;
        this.f88586b = classProto;
        this.f88587c = metadataVersion;
        this.f88588d = sourceElement;
    }

    public final NameResolver component1() {
        return this.f88585a;
    }

    public final ProtoBuf.Class component2() {
        return this.f88586b;
    }

    public final BinaryVersion component3() {
        return this.f88587c;
    }

    public final SourceElement component4() {
        return this.f88588d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return s.f(this.f88585a, classData.f88585a) && s.f(this.f88586b, classData.f88586b) && s.f(this.f88587c, classData.f88587c) && s.f(this.f88588d, classData.f88588d);
    }

    public int hashCode() {
        return (((((this.f88585a.hashCode() * 31) + this.f88586b.hashCode()) * 31) + this.f88587c.hashCode()) * 31) + this.f88588d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f88585a + ", classProto=" + this.f88586b + ", metadataVersion=" + this.f88587c + ", sourceElement=" + this.f88588d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
