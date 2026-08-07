package p013kotlin.reflect.jvm.internal.impl.load.java;

import p013kotlin.collections.v0;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public interface NullabilityAnnotationStates<T> {
    public static final Companion Companion = Companion.f87137a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f87137a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final NullabilityAnnotationStates f87138b = new NullabilityAnnotationStatesImpl(v0.i());

        private Companion() {
        }

        public final NullabilityAnnotationStates getEMPTY() {
            return f87138b;
        }
    }

    T get(FqName fqName);
}
