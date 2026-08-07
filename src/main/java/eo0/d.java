package eo0;

import co0.g;
import co0.h;
import fo0.h1;
import fo0.i3;
import fo0.k;
import jn0.i;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"R", "Ljn0/i;", "Lco0/h;", "a", "(Ljn0/i;)Lco0/h;", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends o implements p<MemberDeserializer, ProtoBuf.Function, SimpleFunctionDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f63110a = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleFunctionDescriptor invoke(MemberDeserializer p11, ProtoBuf.Function p12) {
            s.k(p11, "p0");
            s.k(p12, "p1");
            return p11.loadFunction(p12);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "loadFunction";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(MemberDeserializer.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }
    }

    public static final <R> h<R> a(i<? extends R> iVar) {
        s.k(iVar, "<this>");
        Metadata metadata = (Metadata) iVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        Pair<JvmNameResolver, ProtoBuf.Function> functionDataFrom = JvmProtoBufUtil.readFunctionDataFrom(strArrD1, metadata.d2());
        JvmNameResolver jvmNameResolverA = functionDataFrom.a();
        ProtoBuf.Function functionB = functionDataFrom.b();
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = iVar.getClass();
        ProtoBuf.TypeTable typeTable = functionB.getTypeTable();
        s.j(typeTable, "getTypeTable(...)");
        return new h1(k.f66175d, (SimpleFunctionDescriptor) i3.h(cls, functionB, jvmNameResolverA, new TypeTable(typeTable), jvmMetadataVersion, a.f63110a));
    }
}
