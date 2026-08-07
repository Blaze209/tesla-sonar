package p013kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class ExcludedTypeAnnotations {
    public static final ExcludedTypeAnnotations INSTANCE = new ExcludedTypeAnnotations();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<FqName> f88394a = d1.i(new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact"));

    private ExcludedTypeAnnotations() {
    }

    public final Set<FqName> getInternalAnnotationsForResolve() {
        return f88394a;
    }
}
