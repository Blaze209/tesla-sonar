package com.squareup.wire;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.FIELD})
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0013BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0010R\u0011\u0010\f\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/squareup/wire/q;", "", "", "tag", "", "keyAdapter", "adapter", "Lcom/squareup/wire/q$a;", AnnotatedPrivateKey.LABEL, "", "redacted", "declaredName", "jsonName", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/squareup/wire/q$a;ZLjava/lang/String;Ljava/lang/String;)V", "()I", "()Ljava/lang/String;", "()Lcom/squareup/wire/q$a;", "()Z", "a", "wire-runtime"}, k = 1, mv = {1, 4, 0})
@Retention(RetentionPolicy.RUNTIME)
public @interface q {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/squareup/wire/q$a;", "", "<init>", "(Ljava/lang/String;I)V", "", "isRepeated", "()Z", "isPacked", "isOneOf", "REQUIRED", "OPTIONAL", "REPEATED", "ONE_OF", "PACKED", "OMIT_IDENTITY", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public enum a {
        REQUIRED,
        OPTIONAL,
        REPEATED,
        ONE_OF,
        PACKED,
        OMIT_IDENTITY;

        public final boolean isOneOf() {
            return this == ONE_OF;
        }

        public final boolean isPacked() {
            return this == PACKED;
        }

        public final boolean isRepeated() {
            return this == REPEATED || this == PACKED;
        }
    }

    String adapter();

    String declaredName() default "";

    String jsonName() default "";

    String keyAdapter() default "";

    a label() default a.OPTIONAL;

    boolean redacted() default false;

    int tag();
}
