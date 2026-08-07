package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import jn0.h0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public interface SupertypeLoopChecker {

    public static final class EMPTY implements SupertypeLoopChecker {
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        public Collection<KotlinType> findLoopsInSupertypesAndDisconnect(TypeConstructor currentTypeConstructor, Collection<? extends KotlinType> superTypes, l<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> neighbors, l<? super KotlinType, h0> reportLoop) {
            s.k(currentTypeConstructor, "currentTypeConstructor");
            s.k(superTypes, "superTypes");
            s.k(neighbors, "neighbors");
            s.k(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    Collection<KotlinType> findLoopsInSupertypesAndDisconnect(TypeConstructor typeConstructor, Collection<? extends KotlinType> collection, l<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> lVar, l<? super KotlinType, h0> lVar2);
}
