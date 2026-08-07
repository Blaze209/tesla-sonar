package io.realm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ym0.a;

/* JADX INFO: loaded from: classes9.dex */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RealmModule {
    boolean allClasses() default false;

    a classNamingPolicy() default a.NO_POLICY;

    Class<?>[] classes() default {};

    a fieldNamingPolicy() default a.NO_POLICY;

    boolean library() default false;
}
