package expo.modules.core.utilities;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public class FileUtilities {
    public static File ensureDirExists(File file) throws IOException {
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        throw new IOException("Couldn't create directory '" + file + "'");
    }

    public static String generateOutputPath(File file, String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file);
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(str);
        File file2 = new File(sb2.toString());
        ensureDirExists(file2);
        String string = UUID.randomUUID().toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(file2);
        sb3.append(str3);
        sb3.append(string);
        if (!str2.startsWith(".")) {
            str2 = "." + str2;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
