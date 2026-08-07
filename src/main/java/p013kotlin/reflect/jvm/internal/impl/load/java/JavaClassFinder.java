package p013kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Set;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public interface JavaClassFinder {
    JavaClass findClass(Request request);

    JavaPackage findPackage(FqName fqName, boolean z11);

    Set<String> knownClassNamesInPackage(FqName fqName);

    public static final class Request {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClassId f87075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f87076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JavaClass f87077c;

        public Request(ClassId classId, byte[] bArr, JavaClass javaClass) {
            s.k(classId, "classId");
            this.f87075a = classId;
            this.f87076b = bArr;
            this.f87077c = javaClass;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return s.f(this.f87075a, request.f87075a) && s.f(this.f87076b, request.f87076b) && s.f(this.f87077c, request.f87077c);
        }

        public final ClassId getClassId() {
            return this.f87075a;
        }

        public int hashCode() {
            int iHashCode = this.f87075a.hashCode() * 31;
            byte[] bArr = this.f87076b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.f87077c;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f87075a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f87076b) + ", outerClass=" + this.f87077c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Request(ClassId classId, byte[] bArr, JavaClass javaClass, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i11 & 2) != 0 ? null : bArr, (i11 & 4) != 0 ? null : javaClass);
        }
    }
}
