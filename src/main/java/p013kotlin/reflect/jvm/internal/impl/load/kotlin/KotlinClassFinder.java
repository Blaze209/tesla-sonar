package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;

/* JADX INFO: loaded from: classes9.dex */
public interface KotlinClassFinder extends KotlinMetadataFinder {

    public static abstract class Result {

        public static final class ClassFileContent extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final byte[] f87589a;

            public final byte[] getContent() {
                return this.f87589a;
            }
        }

        public static final class KotlinClass extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final KotlinJvmBinaryClass f87590a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final byte[] f87591b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                s.k(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f87590a = kotlinJvmBinaryClass;
                this.f87591b = bArr;
            }

            public final KotlinJvmBinaryClass getKotlinJvmBinaryClass() {
                return this.f87590a;
            }

            public /* synthetic */ KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(kotlinJvmBinaryClass, (i11 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KotlinJvmBinaryClass toKotlinJvmBinaryClass() {
            KotlinClass kotlinClass = this instanceof KotlinClass ? (KotlinClass) this : null;
            if (kotlinClass != null) {
                return kotlinClass.getKotlinJvmBinaryClass();
            }
            return null;
        }

        private Result() {
        }
    }

    Result findKotlinClassOrContent(JavaClass javaClass, JvmMetadataVersion jvmMetadataVersion);

    Result findKotlinClassOrContent(ClassId classId, JvmMetadataVersion jvmMetadataVersion);
}
