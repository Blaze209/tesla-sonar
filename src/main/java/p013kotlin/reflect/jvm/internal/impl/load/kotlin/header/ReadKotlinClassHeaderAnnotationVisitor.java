package p013kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* JADX INFO: loaded from: classes9.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f87623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<ClassId, KotlinClassHeader.Kind> f87624k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f87625a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f87626b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f87627c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f87628d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f87629e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f87630f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f87631g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private KotlinClassHeader.Kind f87632h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f87633i = null;

    private static abstract class b implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f87634a = new ArrayList();

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i11 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i11 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i11 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i11 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        protected abstract void b(String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visit(Object obj) {
            if (obj instanceof String) {
                this.f87634a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId) {
            if (classId != null) {
                return null;
            }
            a(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitClassLiteral(ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                a(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnd() {
            b((String[]) this.f87634a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnum(ClassId classId, Name name) {
            if (classId == null) {
                a(0);
            }
            if (name == null) {
                a(1);
            }
        }
    }

    private class c implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        class a extends b {
            a() {
            }

            private static /* synthetic */ void a(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.b
            protected void b(String[] strArr) {
                if (strArr == null) {
                    a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f87629e = strArr;
            }
        }

        class b extends b {
            b() {
            }

            private static /* synthetic */ void a(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.b
            protected void b(String[] strArr) {
                if (strArr == null) {
                    a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f87630f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "enumClassId";
            } else if (i11 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i11 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "visitEnum";
            } else if (i11 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor b() {
            return new a();
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor c() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
            if (name == null) {
                return;
            }
            String strAsString = name.asString();
            if ("k".equals(strAsString)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f87632h = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strAsString)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f87625a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strAsString)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    ReadKotlinClassHeaderAnnotationVisitor.this.f87626b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strAsString)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f87627c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strAsString) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f87628d = str2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId != null) {
                return null;
            }
            a(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            String strAsString = name != null ? name.asString() : null;
            if ("d1".equals(strAsString)) {
                return b();
            }
            if ("d2".equals(strAsString)) {
                return c();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                a(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                a(1);
            }
            if (name2 == null) {
                a(2);
            }
        }
    }

    private class d implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        class a extends b {
            a() {
            }

            private static /* synthetic */ void a(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.b
            protected void b(String[] strArr) {
                if (strArr == null) {
                    a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f87633i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "enumClassId";
            } else if (i11 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i11 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "visitEnum";
            } else if (i11 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor b() {
            return new a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId != null) {
                return null;
            }
            a(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            if ("b".equals(name != null ? name.asString() : null)) {
                return b();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                a(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                a(1);
            }
            if (name2 == null) {
                a(2);
            }
        }
    }

    private class e implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        class a extends b {
            a() {
            }

            private static /* synthetic */ void a(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.b
            protected void b(String[] strArr) {
                if (strArr == null) {
                    a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f87629e = strArr;
            }
        }

        class b extends b {
            b() {
            }

            private static /* synthetic */ void a(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.b
            protected void b(String[] strArr) {
                if (strArr == null) {
                    a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f87630f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "enumClassId";
            } else if (i11 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i11 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "visitEnum";
            } else if (i11 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor b() {
            return new a();
        }

        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor c() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
            if (name == null) {
                return;
            }
            String strAsString = name.asString();
            if ("version".equals(strAsString)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f87625a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strAsString)) {
                ReadKotlinClassHeaderAnnotationVisitor.this.f87626b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId != null) {
                return null;
            }
            a(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            String strAsString = name != null ? name.asString() : null;
            if ("data".equals(strAsString) || "filePartClassNames".equals(strAsString)) {
                return b();
            }
            if ("strings".equals(strAsString)) {
                return c();
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                a(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                a(1);
            }
            if (name2 == null) {
                a(2);
            }
        }
    }

    static {
        try {
            f87623j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f87623j = false;
        }
        HashMap map = new HashMap();
        f87624k = map;
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void a(int i11) {
        Object[] objArr = new Object[3];
        if (i11 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean j() {
        KotlinClassHeader.Kind kind = this.f87632h;
        return kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
    }

    public KotlinClassHeader createHeader(JvmMetadataVersion jvmMetadataVersion) {
        if (this.f87632h == null || this.f87625a == null) {
            return null;
        }
        JvmMetadataVersion jvmMetadataVersion2 = new JvmMetadataVersion(this.f87625a, (this.f87627c & 8) != 0);
        if (!jvmMetadataVersion2.isCompatible(jvmMetadataVersion)) {
            this.f87631g = this.f87629e;
            this.f87629e = null;
        } else if (j() && this.f87629e == null) {
            return null;
        }
        String[] strArr = this.f87633i;
        return new KotlinClassHeader(this.f87632h, jvmMetadataVersion2, this.f87629e, this.f87631g, this.f87630f, this.f87626b, this.f87627c, this.f87628d, strArr != null ? BitEncoding.decodeBytes(strArr) : null);
    }

    public KotlinClassHeader createHeaderWithDefaultMetadataVersion() {
        return createHeader(JvmMetadataVersion.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            a(0);
        }
        if (sourceElement == null) {
            a(1);
        }
        FqName fqNameAsSingleFqName = classId.asSingleFqName();
        if (fqNameAsSingleFqName.equals(JvmAnnotationNames.METADATA_FQ_NAME)) {
            return new c();
        }
        if (fqNameAsSingleFqName.equals(JvmAnnotationNames.SERIALIZED_IR_FQ_NAME)) {
            return new d();
        }
        if (f87623j || this.f87632h != null || (kind = f87624k.get(classId)) == null) {
            return null;
        }
        this.f87632h = kind;
        return new e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }
}
