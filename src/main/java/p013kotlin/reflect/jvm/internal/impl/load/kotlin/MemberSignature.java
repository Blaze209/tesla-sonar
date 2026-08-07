package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* JADX INFO: loaded from: classes9.dex */
public final class MemberSignature {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87597a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MemberSignature fromFieldNameAndDesc(String name, String desc) {
            s.k(name, "name");
            s.k(desc, "desc");
            return new MemberSignature(name + '#' + desc, null);
        }

        public final MemberSignature fromJvmMemberSignature(JvmMemberSignature signature) {
            s.k(signature, "signature");
            if (signature instanceof JvmMemberSignature.Method) {
                JvmMemberSignature.Method method = (JvmMemberSignature.Method) signature;
                return fromMethodNameAndDesc(method.getName(), method.getDesc());
            }
            if (!(signature instanceof JvmMemberSignature.Field)) {
                throw new NoWhenBranchMatchedException();
            }
            JvmMemberSignature.Field field = (JvmMemberSignature.Field) signature;
            return fromFieldNameAndDesc(field.getName(), field.getDesc());
        }

        public final MemberSignature fromMethod(NameResolver nameResolver, JvmProtoBuf.JvmMethodSignature signature) {
            s.k(nameResolver, "nameResolver");
            s.k(signature, "signature");
            return fromMethodNameAndDesc(nameResolver.getString(signature.getName()), nameResolver.getString(signature.getDesc()));
        }

        public final MemberSignature fromMethodNameAndDesc(String name, String desc) {
            s.k(name, "name");
            s.k(desc, "desc");
            return new MemberSignature(name + desc, null);
        }

        public final MemberSignature fromMethodSignatureAndParameterIndex(MemberSignature signature, int i11) {
            s.k(signature, "signature");
            return new MemberSignature(signature.getSignature() + '@' + i11, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && s.f(this.f87597a, ((MemberSignature) obj).f87597a);
    }

    public final String getSignature() {
        return this.f87597a;
    }

    public int hashCode() {
        return this.f87597a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f87597a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private MemberSignature(String str) {
        this.f87597a = str;
    }
}
