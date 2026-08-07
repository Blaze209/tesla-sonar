package p013kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes9.dex */
public interface SourceFile {
    public static final SourceFile NO_SOURCE_FILE = new a();

    static class a implements SourceFile {
        a() {
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.SourceFile
        public String getName() {
            return null;
        }
    }

    String getName();
}
