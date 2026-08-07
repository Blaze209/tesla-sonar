package androidx.media3.datasource.cache;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
final class i extends w7.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f9253g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f9254h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f9255i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private i(String str, long j11, long j12, long j13, File file) {
        super(str, j11, j12, j13, file);
    }

    public static i e(File file, long j11, long j12, f fVar) {
        String strI;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            file = j(file, fVar);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = f9255i.matcher(name);
        if (!matcher.matches() || (strI = fVar.i(Integer.parseInt((String) s7.a.f(matcher.group(1))))) == null) {
            return null;
        }
        if (j11 == -1) {
            j11 = file2.length();
        }
        long j13 = j11;
        if (j13 == 0) {
            return null;
        }
        return new i(strI, Long.parseLong((String) s7.a.f(matcher.group(2))), j13, j12 == -9223372036854775807L ? Long.parseLong((String) s7.a.f(matcher.group(3))) : j12, file2);
    }

    public static i f(File file, long j11, f fVar) {
        return e(file, j11, -9223372036854775807L, fVar);
    }

    public static i g(String str, long j11, long j12) {
        return new i(str, j11, j12, -9223372036854775807L, null);
    }

    public static i h(String str, long j11) {
        return new i(str, j11, -1L, -9223372036854775807L, null);
    }

    public static File i(File file, int i11, long j11, long j12) {
        return new File(file, i11 + "." + j11 + "." + j12 + ".v3.exo");
    }

    private static File j(File file, f fVar) {
        String strN1;
        String name = file.getName();
        Matcher matcher = f9254h.matcher(name);
        if (matcher.matches()) {
            strN1 = q0.N1((String) s7.a.f(matcher.group(1)));
        } else {
            matcher = f9253g.matcher(name);
            strN1 = matcher.matches() ? (String) s7.a.f(matcher.group(1)) : null;
        }
        if (strN1 == null) {
            return null;
        }
        File fileI = i((File) s7.a.j(file.getParentFile()), fVar.e(strN1), Long.parseLong((String) s7.a.f(matcher.group(2))), Long.parseLong((String) s7.a.f(matcher.group(3))));
        if (file.renameTo(fileI)) {
            return fileI;
        }
        return null;
    }

    public i d(File file, long j11) {
        s7.a.h(this.f121095d);
        return new i(this.f121092a, this.f121093b, this.f121094c, j11, file);
    }
}
