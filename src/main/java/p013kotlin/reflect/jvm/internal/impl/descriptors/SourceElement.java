package p013kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes9.dex */
public interface SourceElement {
    public static final SourceElement NO_SOURCE = new a();

    static class a implements SourceElement {
        a() {
        }

        private static /* synthetic */ void a(int i11) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        public SourceFile getContainingFile() {
            SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
            if (sourceFile == null) {
                a(0);
            }
            return sourceFile;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    SourceFile getContainingFile();
}
