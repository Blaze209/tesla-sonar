package il0;

import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.q;
import java.lang.reflect.Type;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: il0.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lil0/a;", "", "Lco0/d;", "type", "Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "Lco0/q;", "kotlinType", "<init>", "(Lco0/d;Ljava/lang/reflect/Type;Lco0/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco0/d;", "()Lco0/d;", "b", "Ljava/lang/reflect/Type;", "getReifiedType", "()Ljava/lang/reflect/Type;", "c", "Lco0/q;", "getKotlinType", "()Lco0/q;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TypeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d<?> type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Type reifiedType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q kotlinType;

    public TypeInfo(d<?> type, Type reifiedType, q qVar) {
        s.k(type, "type");
        s.k(reifiedType, "reifiedType");
        this.type = type;
        this.reifiedType = reifiedType;
        this.kotlinType = qVar;
    }

    public final d<?> a() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypeInfo)) {
            return false;
        }
        TypeInfo typeInfo = (TypeInfo) other;
        return s.f(this.type, typeInfo.type) && s.f(this.reifiedType, typeInfo.reifiedType) && s.f(this.kotlinType, typeInfo.kotlinType);
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.reifiedType.hashCode()) * 31;
        q qVar = this.kotlinType;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public String toString() {
        return "TypeInfo(type=" + this.type + ", reifiedType=" + this.reifiedType + ", kotlinType=" + this.kotlinType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
