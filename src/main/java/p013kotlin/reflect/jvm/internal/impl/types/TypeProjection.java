package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;

/* JADX INFO: loaded from: classes9.dex */
public interface TypeProjection extends TypeArgumentMarker {
    Variance getProjectionKind();

    KotlinType getType();

    boolean isStarProjection();

    TypeProjection refine(KotlinTypeRefiner kotlinTypeRefiner);
}
