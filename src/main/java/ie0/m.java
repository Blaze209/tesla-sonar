package ie0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lie0/m;", "", "<init>", "()V", "", "a", "()Z", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f77603a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("DebugChecker");

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.String] */
    public final boolean a() {
        logger.a("Checking TracerPid");
        try {
            FileReader fileReader = new FileReader(new File("/proc/self/status"));
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                try {
                    p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
                    while (true) {
                        ?? line = bufferedReader.readLine();
                        n0Var.f86529a = line;
                        if (line == 0) {
                            break;
                        }
                        if (line.length() > 9) {
                            String strSubstring = ((String) n0Var.f86529a).substring(0, 9);
                            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                            if (p013kotlin.text.t.M(strSubstring, "TracerPid", true)) {
                                logger.a("Found: " + n0Var.f86529a);
                                String strSubstring2 = ((String) n0Var.f86529a).substring(10);
                                p013kotlin.jvm.internal.s.j(strSubstring2, "substring(...)");
                                int length = strSubstring2.length() - 1;
                                int i11 = 0;
                                boolean z11 = false;
                                while (i11 <= length) {
                                    boolean z12 = p013kotlin.jvm.internal.s.m(strSubstring2.charAt(!z11 ? i11 : length), 32) <= 0;
                                    if (z11) {
                                        if (!z12) {
                                            break;
                                        }
                                        length--;
                                    } else if (z12) {
                                        i11++;
                                    } else {
                                        z11 = true;
                                    }
                                }
                                if (Integer.decode(strSubstring2.subSequence(i11, length + 1).toString()).intValue() <= 0) {
                                    break;
                                }
                                sn0.b.a(bufferedReader, null);
                                sn0.b.a(fileReader, null);
                                return true;
                            }
                        }
                    }
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    sn0.b.a(bufferedReader, null);
                    sn0.b.a(fileReader, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    sn0.b.a(fileReader, th4);
                    throw th5;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }
}
