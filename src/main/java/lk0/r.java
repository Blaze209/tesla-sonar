package lk0;

import freemarker.template.utility.NullArgumentException;

/* JADX INFO: loaded from: classes8.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f90076a = a.B.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90077b = a.C.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f90078c = a.D.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90079d = a.E.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90080e = a.F.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f90081f = a.G.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f90082g = q.d(2, 4, 0);

    public static void a(q qVar) {
        NullArgumentException.a("incompatibleImprovements", qVar);
        int iC = qVar.c();
        if (iC <= a.g().c()) {
            if (iC < f90076a) {
                throw new IllegalArgumentException("\"incompatibleImprovements\" must be at least 2.3.0.");
            }
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("The FreeMarker version requested by \"incompatibleImprovements\" was ");
        stringBuffer.append(qVar);
        stringBuffer.append(", but the installed FreeMarker version is only ");
        stringBuffer.append(a.g());
        stringBuffer.append(". You may need to upgrade FreeMarker in your project.");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static boolean b(q qVar) {
        return a.c(qVar);
    }

    public static o c(q qVar) {
        return a.e(qVar);
    }
}
