package p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class JvmMemberSignature {

    public static final class Field extends JvmMemberSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f88150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f88151b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(String name, String desc) {
            super(null);
            s.k(name, "name");
            s.k(desc, "desc");
            this.f88150a = name;
            this.f88151b = desc;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public String asString() {
            return getName() + CoreConstants.COLON_CHAR + getDesc();
        }

        public final String component1() {
            return this.f88150a;
        }

        public final String component2() {
            return this.f88151b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return s.f(this.f88150a, field.f88150a) && s.f(this.f88151b, field.f88151b);
        }

        public String getDesc() {
            return this.f88151b;
        }

        public String getName() {
            return this.f88150a;
        }

        public int hashCode() {
            return (this.f88150a.hashCode() * 31) + this.f88151b.hashCode();
        }
    }

    public static final class Method extends JvmMemberSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f88152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f88153b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(String name, String desc) {
            super(null);
            s.k(name, "name");
            s.k(desc, "desc");
            this.f88152a = name;
            this.f88153b = desc;
        }

        public static /* synthetic */ Method copy$default(Method method, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = method.f88152a;
            }
            if ((i11 & 2) != 0) {
                str2 = method.f88153b;
            }
            return method.copy(str, str2);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public String asString() {
            return getName() + getDesc();
        }

        public final Method copy(String name, String desc) {
            s.k(name, "name");
            s.k(desc, "desc");
            return new Method(name, desc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return s.f(this.f88152a, method.f88152a) && s.f(this.f88153b, method.f88153b);
        }

        public String getDesc() {
            return this.f88153b;
        }

        public String getName() {
            return this.f88152a;
        }

        public int hashCode() {
            return (this.f88152a.hashCode() * 31) + this.f88153b.hashCode();
        }
    }

    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String asString();

    public final String toString() {
        return asString();
    }

    private JvmMemberSignature() {
    }
}
