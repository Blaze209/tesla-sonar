package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Parser f88720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ByteArrayInputStream f88721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ DeserializedMemberScope f88722c;

    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(Parser parser, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        this.f88720a = parser;
        this.f88721b = byteArrayInputStream;
        this.f88722c = deserializedMemberScope;
    }

    @Override // wn0.a
    public final MessageLite invoke() {
        return (MessageLite) this.f88720a.parseDelimitedFrom(this.f88721b, this.f88722c.l().getComponents().getExtensionRegistryLite());
    }
}
