package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;

/* JADX INFO: loaded from: classes9.dex */
public interface ContractDeserializer {
    public static final Companion Companion = Companion.f88594a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f88594a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ContractDeserializer f88595b = new ContractDeserializer() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer$Companion$DEFAULT$1
            @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer
            public Pair deserializeContractFromFunction(ProtoBuf.Function proto, FunctionDescriptor ownerFunction, TypeTable typeTable, TypeDeserializer typeDeserializer) {
                s.k(proto, "proto");
                s.k(ownerFunction, "ownerFunction");
                s.k(typeTable, "typeTable");
                s.k(typeDeserializer, "typeDeserializer");
                return null;
            }
        };

        private Companion() {
        }

        public final ContractDeserializer getDEFAULT() {
            return f88595b;
        }
    }

    Pair<CallableDescriptor.UserDataKey<?>, Object> deserializeContractFromFunction(ProtoBuf.Function function, FunctionDescriptor functionDescriptor, TypeTable typeTable, TypeDeserializer typeDeserializer);
}
