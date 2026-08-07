package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f88796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MessageLite f88797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AnnotatedCallableKind f88798c;

    public g(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.f88796a = memberDeserializer;
        this.f88797b = messageLite;
        this.f88798c = annotatedCallableKind;
    }

    @Override // wn0.a
    public Object invoke() {
        return MemberDeserializer.k(this.f88796a, this.f88797b, this.f88798c);
    }
}
