package xz;

import ch.qos.logback.core.CoreConstants;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
final class i {
    static void a(Object obj) {
        Class<?> cls = obj.getClass();
        String strReplace = cls.getName().replace(CoreConstants.DOT, '/');
        if (c(strReplace)) {
            return;
        }
        b(cls.getClassLoader().getResourceAsStream(strReplace + ".class"));
    }

    static void b(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Bytecode not available, can't check class version");
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            try {
                dataInputStream.readInt();
                int unsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (unsignedShort != 65535) {
                    throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                }
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new IllegalStateException("I/O error, can't check class version", e11);
        }
    }

    static boolean c(String str) {
        if (!str.startsWith("com/nimbusds/jose/shaded/ow2asm/")) {
            return false;
        }
        if (str.contains("Test$")) {
            return true;
        }
        if (Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", str)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com/nimbusds/jose/shaded/ow2asm/util/Check");
        sb2.append("(Annotation|Class|Field|Method|Module|RecordComponent|Signature)");
        sb2.append("Adapter(\\$.*)?");
        return Pattern.matches(sb2.toString(), str);
    }
}
