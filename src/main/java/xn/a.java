package xn;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jn0.e;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\b\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lxn/a;", "", "", "name", "", "canOverrideExistingModule", "needsEagerInit", "hasConstants", "isCxxModule", "<init>", "(Ljava/lang/String;ZZZZ)V", "()Ljava/lang/String;", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public @interface a {
    boolean canOverrideExistingModule() default false;

    @e
    boolean hasConstants() default true;

    boolean isCxxModule() default false;

    String name();

    boolean needsEagerInit() default false;
}
