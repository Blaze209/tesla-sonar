package expo.modules.kotlin.records;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/records/BindUsing;", "", "Lco0/d;", "binder", "<init>", "(Lco0/d;)V", "()Ljava/lang/Class;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public @interface BindUsing {
    Class<?> binder();
}
