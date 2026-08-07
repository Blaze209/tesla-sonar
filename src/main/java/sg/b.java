package sg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:23:0x0041 A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:13:0x002f, B:23:0x0041), top: B:30:0x0006 }] */
    public static String a(String str, String str2) throws Throwable {
        Throwable th2;
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                File file = new File(str, str2);
                if (!file.exists()) {
                    return null;
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return sb2.toString();
                    } catch (Throwable th3) {
                        th2 = th3;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader == null) {
                            throw th2;
                        }
                        try {
                            bufferedReader.close();
                            throw th2;
                        } catch (Throwable unused2) {
                            throw th2;
                        }
                    }
                }
                bufferedReader2.close();
                return sb2.toString();
            } catch (Throwable unused3) {
            }
        } catch (IOException unused4) {
        } catch (Throwable th4) {
            th2 = th4;
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        return sb2.toString();
    }
}
