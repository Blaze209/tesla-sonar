package okio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\n\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u0013\u0010&\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u00100\u001a\u0004\u0018\u00010-8G¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u00104\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b3\u0010 R\u0013\u00106\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b5\u0010%¨\u00067"}, d2 = {"Lokio/i0;", "", "Lokio/k;", "bytes", "<init>", "(Lokio/k;)V", "", "child", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Lokio/i0;", "", "normalize", "j", "(Lokio/i0;Z)Lokio/i0;", "other", "h", "(Lokio/i0;)Lokio/i0;", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "Ljava/nio/file/Path;", "l", "()Ljava/nio/file/Path;", "", "a", "(Lokio/i0;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lokio/k;", "b", "()Lokio/k;", "c", "()Lokio/i0;", "root", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "segmentsBytes", "isAbsolute", "()Z", "", "m", "()Ljava/lang/Character;", "volumeLetter", "f", "nameBytes", "e", "name", "g", "parent", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 implements Comparable<i0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f97934c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k bytes;

    /* JADX INFO: renamed from: okio.i0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0007*\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokio/i0$a;", "", "<init>", "()V", "", "", "normalize", "Lokio/i0;", "b", "(Ljava/lang/String;Z)Lokio/i0;", "Ljava/io/File;", "a", "(Ljava/io/File;Z)Lokio/i0;", "Ljava/nio/file/Path;", "c", "(Ljava/nio/file/Path;Z)Lokio/i0;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ i0 d(Companion companion, File file, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return companion.a(file, z11);
        }

        public static /* synthetic */ i0 e(Companion companion, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return companion.b(str, z11);
        }

        public static /* synthetic */ i0 f(Companion companion, Path path, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return companion.c(path, z11);
        }

        public final i0 a(File file, boolean z11) {
            p013kotlin.jvm.internal.s.k(file, "<this>");
            String string = file.toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            return b(string, z11);
        }

        public final i0 b(String str, boolean z11) {
            p013kotlin.jvm.internal.s.k(str, "<this>");
            return ip0.e.k(str, z11);
        }

        public final i0 c(Path path, boolean z11) {
            p013kotlin.jvm.internal.s.k(path, "<this>");
            return b(path.toString(), z11);
        }

        private Companion() {
        }
    }

    static {
        String separator = File.separator;
        p013kotlin.jvm.internal.s.j(separator, "separator");
        f97934c = separator;
    }

    public i0(k bytes) {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        this.bytes = bytes;
    }

    public static /* synthetic */ i0 k(i0 i0Var, i0 i0Var2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return i0Var.j(i0Var2, z11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i0 other) {
        p013kotlin.jvm.internal.s.k(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getBytes() {
        return this.bytes;
    }

    public final i0 c() {
        int iO = ip0.e.o(this);
        if (iO == -1) {
            return null;
        }
        return new i0(getBytes().G(0, iO));
    }

    public final List<k> d() {
        ArrayList arrayList = new ArrayList();
        int iO = ip0.e.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < getBytes().D() && getBytes().h(iO) == 92) {
            iO++;
        }
        int iD = getBytes().D();
        int i11 = iO;
        while (iO < iD) {
            if (getBytes().h(iO) == 47 || getBytes().h(iO) == 92) {
                arrayList.add(getBytes().G(i11, iO));
                i11 = iO + 1;
            }
            iO++;
        }
        if (i11 < getBytes().D()) {
            arrayList.add(getBytes().G(i11, getBytes().D()));
        }
        return arrayList;
    }

    public final String e() {
        return f().K();
    }

    public boolean equals(Object other) {
        return (other instanceof i0) && p013kotlin.jvm.internal.s.f(((i0) other).getBytes(), getBytes());
    }

    public final k f() {
        int iL = ip0.e.l(this);
        if (iL != -1) {
            return k.H(getBytes(), iL + 1, 0, 2, null);
        }
        return (m() == null || getBytes().D() != 2) ? getBytes() : k.f97943e;
    }

    public final i0 g() {
        if (p013kotlin.jvm.internal.s.f(getBytes(), ip0.e.f81707d) || p013kotlin.jvm.internal.s.f(getBytes(), ip0.e.f81704a) || p013kotlin.jvm.internal.s.f(getBytes(), ip0.e.f81705b) || ip0.e.n(this)) {
            return null;
        }
        int iL = ip0.e.l(this);
        if (iL == 2 && m() != null) {
            if (getBytes().D() == 3) {
                return null;
            }
            return new i0(k.H(getBytes(), 0, 3, 1, null));
        }
        if (iL == 1 && getBytes().E(ip0.e.f81705b)) {
            return null;
        }
        if (iL != -1 || m() == null) {
            if (iL == -1) {
                return new i0(ip0.e.f81707d);
            }
            return iL == 0 ? new i0(k.H(getBytes(), 0, 1, 1, null)) : new i0(k.H(getBytes(), 0, iL, 1, null));
        }
        if (getBytes().D() == 2) {
            return null;
        }
        return new i0(k.H(getBytes(), 0, 2, 1, null));
    }

    public final i0 h(i0 other) {
        p013kotlin.jvm.internal.s.k(other, "other");
        if (!p013kotlin.jvm.internal.s.f(c(), other.c())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<k> listD = d();
        List<k> listD2 = other.d();
        int iMin = Math.min(listD.size(), listD2.size());
        int i11 = 0;
        while (i11 < iMin && p013kotlin.jvm.internal.s.f(listD.get(i11), listD2.get(i11))) {
            i11++;
        }
        if (i11 == iMin && getBytes().D() == other.getBytes().D()) {
            return Companion.e(INSTANCE, ".", false, 1, null);
        }
        if (listD2.subList(i11, listD2.size()).indexOf(ip0.e.f81708e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (p013kotlin.jvm.internal.s.f(other.getBytes(), ip0.e.f81707d)) {
            return this;
        }
        h hVar = new h();
        k kVarM = ip0.e.m(other);
        if (kVarM == null && (kVarM = ip0.e.m(this)) == null) {
            kVarM = ip0.e.s(f97934c);
        }
        int size = listD2.size();
        for (int i12 = i11; i12 < size; i12++) {
            hVar.A1(ip0.e.f81708e);
            hVar.A1(kVarM);
        }
        int size2 = listD.size();
        while (i11 < size2) {
            hVar.A1(listD.get(i11));
            hVar.A1(kVarM);
            i11++;
        }
        return ip0.e.q(hVar, false);
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final i0 i(String child) {
        p013kotlin.jvm.internal.s.k(child, "child");
        return ip0.e.j(this, ip0.e.q(new h().l2(child), false), false);
    }

    public final boolean isAbsolute() {
        return ip0.e.o(this) != -1;
    }

    public final i0 j(i0 child, boolean normalize) {
        p013kotlin.jvm.internal.s.k(child, "child");
        return ip0.e.j(this, child, normalize);
    }

    public final Path l() {
        Path path = Paths.get(toString(), new String[0]);
        p013kotlin.jvm.internal.s.j(path, "get(...)");
        return path;
    }

    public final Character m() {
        if (k.p(getBytes(), ip0.e.f81704a, 0, 2, null) != -1 || getBytes().D() < 2 || getBytes().h(1) != 58) {
            return null;
        }
        char cH = (char) getBytes().h(0);
        if (('a' > cH || cH >= '{') && ('A' > cH || cH >= '[')) {
            return null;
        }
        return Character.valueOf(cH);
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return getBytes().K();
    }
}
