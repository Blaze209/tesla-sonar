package ip0;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.EOFException;
import java.util.ArrayList;
import jn0.h0;
import okio.i0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0003\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lokio/i0;", "", "o", "(Lokio/i0;)I", "", "n", "(Lokio/i0;)Z", "child", "normalize", "j", "(Lokio/i0;Lokio/i0;Z)Lokio/i0;", "", "k", "(Ljava/lang/String;Z)Lokio/i0;", "Lokio/h;", "q", "(Lokio/h;Z)Lokio/i0;", "Lokio/k;", "s", "(Ljava/lang/String;)Lokio/k;", "", "r", "(B)Lokio/k;", "slash", "p", "(Lokio/h;Lokio/k;)Z", "a", "Lokio/k;", "SLASH", "b", "BACKSLASH", "c", "ANY_SLASH", DateTokenConverter.CONVERTER_KEY, "DOT", "e", "DOT_DOT", "l", "indexOfLastSlash", "m", "(Lokio/i0;)Lokio/k;", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final okio.k f81704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final okio.k f81705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final okio.k f81706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final okio.k f81707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final okio.k f81708e;

    static {
        okio.k.Companion companion = okio.k.INSTANCE;
        f81704a = companion.f("/");
        f81705b = companion.f("\\");
        f81706c = companion.f("/\\");
        f81707d = companion.f(".");
        f81708e = companion.f(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
    }

    public static final i0 j(i0 i0Var, i0 child, boolean z11) {
        s.k(i0Var, "<this>");
        s.k(child, "child");
        if (child.isAbsolute() || child.m() != null) {
            return child;
        }
        okio.k kVarM = m(i0Var);
        if (kVarM == null && (kVarM = m(child)) == null) {
            kVarM = s(i0.f97934c);
        }
        okio.h hVar = new okio.h();
        hVar.A1(i0Var.getBytes());
        if (hVar.getSize() > 0) {
            hVar.A1(kVarM);
        }
        hVar.A1(child.getBytes());
        return q(hVar, z11);
    }

    public static final i0 k(String str, boolean z11) {
        s.k(str, "<this>");
        return q(new okio.h().l2(str), z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(i0 i0Var) {
        int iU = okio.k.u(i0Var.getBytes(), f81704a, 0, 2, null);
        return iU != -1 ? iU : okio.k.u(i0Var.getBytes(), f81705b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okio.k m(i0 i0Var) {
        okio.k bytes = i0Var.getBytes();
        okio.k kVar = f81704a;
        if (okio.k.p(bytes, kVar, 0, 2, null) != -1) {
            return kVar;
        }
        okio.k bytes2 = i0Var.getBytes();
        okio.k kVar2 = f81705b;
        if (okio.k.p(bytes2, kVar2, 0, 2, null) != -1) {
            return kVar2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(i0 i0Var) {
        return i0Var.getBytes().g(f81708e) && (i0Var.getBytes().D() == 2 || i0Var.getBytes().x(i0Var.getBytes().D() + (-3), f81704a, 0, 1) || i0Var.getBytes().x(i0Var.getBytes().D() + (-3), f81705b, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(i0 i0Var) {
        if (i0Var.getBytes().D() == 0) {
            return -1;
        }
        if (i0Var.getBytes().h(0) == 47) {
            return 1;
        }
        if (i0Var.getBytes().h(0) == 92) {
            if (i0Var.getBytes().D() <= 2 || i0Var.getBytes().h(1) != 92) {
                return 1;
            }
            int iN = i0Var.getBytes().n(f81705b, 2);
            return iN == -1 ? i0Var.getBytes().D() : iN;
        }
        if (i0Var.getBytes().D() > 2 && i0Var.getBytes().h(1) == 58 && i0Var.getBytes().h(2) == 92) {
            char cH = (char) i0Var.getBytes().h(0);
            if ('a' <= cH && cH < '{') {
                return 3;
            }
            if ('A' <= cH && cH < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(okio.h hVar, okio.k kVar) {
        if (!s.f(kVar, f81705b) || hVar.getSize() < 2 || hVar.H(1L) != 58) {
            return false;
        }
        char cH = (char) hVar.H(0L);
        if ('a' > cH || cH >= '{') {
            return 'A' <= cH && cH < '[';
        }
        return true;
    }

    public static final i0 q(okio.h hVar, boolean z11) throws EOFException {
        okio.k kVar;
        okio.k kVarQ0;
        s.k(hVar, "<this>");
        okio.h hVar2 = new okio.h();
        okio.k kVarR = null;
        int i11 = 0;
        while (true) {
            if (!hVar.l0(0L, f81704a)) {
                kVar = f81705b;
                if (!hVar.l0(0L, kVar)) {
                    break;
                }
            }
            byte b11 = hVar.readByte();
            if (kVarR == null) {
                kVarR = r(b11);
            }
            i11++;
        }
        boolean z12 = i11 >= 2 && s.f(kVarR, kVar);
        if (z12) {
            s.h(kVarR);
            hVar2.A1(kVarR);
            hVar2.A1(kVarR);
        } else if (i11 > 0) {
            s.h(kVarR);
            hVar2.A1(kVarR);
        } else {
            long jD0 = hVar.d0(f81706c);
            if (kVarR == null) {
                kVarR = jD0 == -1 ? s(i0.f97934c) : r(hVar.H(jD0));
            }
            if (p(hVar, kVarR)) {
                if (jD0 == 2) {
                    hVar2.write(hVar, 3L);
                } else {
                    hVar2.write(hVar, 2L);
                }
            }
            h0 h0Var = h0.f84049a;
        }
        boolean z13 = hVar2.getSize() > 0;
        ArrayList arrayList = new ArrayList();
        while (!hVar.T2()) {
            long jD1 = hVar.d0(f81706c);
            if (jD1 == -1) {
                kVarQ0 = hVar.m1();
            } else {
                kVarQ0 = hVar.Q0(jD1);
                hVar.readByte();
            }
            okio.k kVar2 = f81708e;
            if (s.f(kVarQ0, kVar2)) {
                if (!z13 || !arrayList.isEmpty()) {
                    if (!z11 || (!z13 && (arrayList.isEmpty() || s.f(v.A0(arrayList), kVar2)))) {
                        arrayList.add(kVarQ0);
                    } else if (!z12 || arrayList.size() != 1) {
                        v.P(arrayList);
                    }
                }
            } else if (!s.f(kVarQ0, f81707d) && !s.f(kVarQ0, okio.k.f97943e)) {
                arrayList.add(kVarQ0);
            }
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 > 0) {
                hVar2.A1(kVarR);
            }
            hVar2.A1((okio.k) arrayList.get(i12));
        }
        if (hVar2.getSize() == 0) {
            hVar2.A1(f81707d);
        }
        return new i0(hVar2.m1());
    }

    private static final okio.k r(byte b11) {
        if (b11 == 47) {
            return f81704a;
        }
        if (b11 == 92) {
            return f81705b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okio.k s(String str) {
        if (s.f(str, "/")) {
            return f81704a;
        }
        if (s.f(str, "\\")) {
            return f81705b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
