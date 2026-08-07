package p013kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes9.dex */
public interface CustomTypeParameter {
    boolean isTypeParameter();

    KotlinType substitutionResult(KotlinType kotlinType);
}
