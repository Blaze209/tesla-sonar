package p020r2;

import androidx.collection.k0;
import androidx.collection.l0;
import androidx.collection.w0;
import androidx.compose.runtime.ComposeRuntimeError;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a-\u0010\u0018\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0000\u0010\u001a\"\b\b\u0001\u0010\u001b*\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001e\u001a!\u0010\"\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a!\u0010$\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a3\u0010(\u001a\u00020\t*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b(\u0010)\u001a+\u0010,\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010-\u001a#\u0010.\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010/\u001a)\u00100\u001a\u00020\t*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u00101\u001a/\u00102\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b4\u00105\u001a\u0013\u00106\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107\u001a#\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160;*\u0002082\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=\u001a#\u0010@\u001a\u00020\u0003*\u00020>2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010A\u001a+\u0010E\u001a\u00020\u0003*\u00020>2\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010D\u001a\u00020\u0003H\u0002¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0000H\u0000¢\u0006\u0004\bH\u0010I\u001a\u0017\u0010L\u001a\u00020K2\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bL\u0010M\u001a\u0017\u0010N\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bN\u0010O\" \u0010T\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bB\u0010P\u0012\u0004\bS\u0010\r\u001a\u0004\bQ\u0010R\" \u0010W\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bC\u0010P\u0012\u0004\bV\u0010\r\u001a\u0004\bU\u0010R\" \u0010[\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bX\u0010P\u0012\u0004\bZ\u0010\r\u001a\u0004\bY\u0010R\" \u0010_\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\\\u0010P\u0012\u0004\b^\u0010\r\u001a\u0004\b]\u0010R\" \u0010c\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b`\u0010P\u0012\u0004\bb\u0010\r\u001a\u0004\ba\u0010R\" \u0010g\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bd\u0010P\u0012\u0004\bf\u0010\r\u001a\u0004\be\u0010R\"\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020 0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j\"\u0018\u0010n\u001a\u00020\u0000*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m\"\u0018\u0010n\u001a\u00020\u0000*\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\"\u0018\u0010t\u001a\u00020\u0016*\u00020q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006u"}, d2 = {"", "J", "()Z", "", Action.KEY_ATTRIBUTE, "dirty1", "dirty2", "", "info", "Ljn0/h0;", "S", "(IIILjava/lang/String;)V", "R", "()V", "Lr2/d3;", "Lr2/q2;", "rememberManager", Gender.MALE, "(Lr2/d3;Lr2/q2;)V", "u", Kind.GROUP, "index", "", "data", Gender.NONE, "(Lr2/d3;IILjava/lang/Object;)V", "K", "V", "initialCapacity", "Lr2/o1;", "(I)Landroidx/collection/k0;", "", "Lr2/w0;", "location", "y", "(Ljava/util/List;I)I", "x", "Lr2/j2;", "scope", "instance", "G", "(Ljava/util/List;ILr2/j2;Ljava/lang/Object;)V", "start", "end", "z", "(Ljava/util/List;II)Lr2/w0;", Gender.OTHER, "(Ljava/util/List;I)Lr2/w0;", "P", "(Ljava/util/List;II)V", "w", "(Ljava/util/List;II)Ljava/util/List;", "p", "(Z)I", "o", "(I)Z", "Lr2/a3;", "Lr2/d;", "anchor", "", "q", "(Lr2/a3;Lr2/d;)Ljava/util/List;", "Lr2/z2;", "root", "v", "(Lr2/z2;II)I", "a", "b", "common", "L", "(Lr2/z2;III)I", "value", "Q", "(Z)V", "message", "", "t", "(Ljava/lang/String;)Ljava/lang/Void;", "s", "(Ljava/lang/String;)V", "Ljava/lang/Object;", "B", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "D", "getProvider$annotations", "provider", "c", "A", "getCompositionLocalMap$annotations", "compositionLocalMap", DateTokenConverter.CONVERTER_KEY, "getProviderValues", "getProviderValues$annotations", "providerValues", "e", "E", "getProviderMaps$annotations", "providerMaps", "f", Gender.FEMALE, "getReference$annotations", "reference", "Ljava/util/Comparator;", "g", "Ljava/util/Comparator;", "InvalidationLocationAscending", "I", "(Lr2/d3;)Z", "isAfterFirstChild", "H", "(Lr2/z2;)Z", "Lr2/z0;", "C", "(Lr2/z0;)Ljava/lang/Object;", "joinedKey", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f106733a = new OpaqueKey("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f106734b = new OpaqueKey("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f106735c = new OpaqueKey("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f106736d = new OpaqueKey("providerValues");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f106737e = new OpaqueKey("providers");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f106738f = new OpaqueKey("reference");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator<w0> f106739g = new Comparator() { // from class: r2.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return o.b((w0) obj, (w0) obj2);
        }
    };

    public static final Object A() {
        return f106735c;
    }

    public static final Object B() {
        return f106733a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object C(z0 z0Var) {
        return z0Var.getObjectKey() != null ? new JoinedKey(Integer.valueOf(z0Var.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String()), z0Var.getObjectKey()) : Integer.valueOf(z0Var.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String());
    }

    public static final Object D() {
        return f106734b;
    }

    public static final Object E() {
        return f106737e;
    }

    public static final Object F() {
        return f106738f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(List<w0> list, int i11, j2 j2Var, Object obj) {
        int iY = y(list, i11);
        if (iY < 0) {
            int i12 = -(iY + 1);
            if (!(obj instanceof h0)) {
                obj = null;
            }
            list.add(i12, new w0(j2Var, i11, obj));
            return;
        }
        w0 w0Var = list.get(iY);
        if (!(obj instanceof h0)) {
            w0Var.e(null);
            return;
        }
        Object objA = w0Var.getInstances();
        if (objA == null) {
            w0Var.e(obj);
        } else if (objA instanceof l0) {
            ((l0) objA).h(obj);
        } else {
            w0Var.e(w0.b(objA, obj));
        }
    }

    public static final boolean H(SlotReader z2Var) {
        return z2Var.getCurrent() > z2Var.getParent() + 1;
    }

    public static final boolean I(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    public static final boolean J() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> k0<K, Object> K(int i11) {
        return o1.b(new k0(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int L(SlotReader z2Var, int i11, int i12, int i13) {
        if (i11 != i12) {
            if (i11 == i13 || i12 == i13) {
                return i13;
            }
            if (z2Var.P(i11) == i12) {
                return i12;
            }
            if (z2Var.P(i12) != i11) {
                if (z2Var.P(i11) == z2Var.P(i12)) {
                    return z2Var.P(i11);
                }
                int iV = v(z2Var, i11, i13);
                int iV2 = v(z2Var, i12, i13);
                int i14 = iV - iV2;
                for (int i15 = 0; i15 < i14; i15++) {
                    i11 = z2Var.P(i11);
                }
                int i16 = iV2 - iV;
                for (int i17 = 0; i17 < i16; i17++) {
                    i12 = z2Var.P(i12);
                }
                while (i11 != i12) {
                    i11 = z2Var.P(i11);
                    i12 = z2Var.P(i12);
                }
                return i11;
            }
        }
        return i11;
    }

    public static final void M(SlotWriter slotWriter, q2 q2Var) {
        int iG0;
        int iQ = slotWriter.Q(slotWriter.groups, slotWriter.j0(slotWriter.getCurrentGroup() + slotWriter.m0(slotWriter.getCurrentGroup())));
        for (int iQ2 = slotWriter.Q(slotWriter.groups, slotWriter.j0(slotWriter.getCurrentGroup())); iQ2 < iQ; iQ2++) {
            Object obj = slotWriter.slots[slotWriter.R(iQ2)];
            int iF = -1;
            if (obj instanceof k) {
                q2Var.c((k) obj, slotWriter.g0() - iQ2, -1, -1);
            }
            if (obj instanceof s2) {
                int iG1 = slotWriter.g0() - iQ2;
                s2 s2Var = (s2) obj;
                d after = s2Var.getAfter();
                if (after == null || !after.b()) {
                    iG0 = -1;
                } else {
                    iF = slotWriter.F(after);
                    iG0 = slotWriter.g0() - slotWriter.e1(iF);
                }
                q2Var.a(s2Var.getWrapped(), iG1, iF, iG0);
            }
            if (obj instanceof j2) {
                ((j2) obj).x();
            }
        }
        slotWriter.O0();
    }

    private static final void N(SlotWriter slotWriter, int i11, int i12, Object obj) {
        if (obj == slotWriter.U0(i11, i12, l.INSTANCE.a())) {
            return;
        }
        s("Slot table is out of sync");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0 O(List<w0> list, int i11) {
        int iY = y(list, i11);
        if (iY >= 0) {
            return list.remove(iY);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(List<w0> list, int i11, int i12) {
        int iX = x(list, i11);
        while (iX < list.size() && list.get(iX).getLocation() < i12) {
            list.remove(iX);
        }
    }

    public static final void Q(boolean z11) {
        if (z11) {
            return;
        }
        s("Check failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(w0 w0Var, w0 w0Var2) {
        return s.m(w0Var.getLocation(), w0Var2.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(int i11) {
        return i11 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> q(a3 a3Var, d dVar) {
        ArrayList arrayList = new ArrayList();
        SlotReader z2VarV = a3Var.v();
        try {
            r(z2VarV, arrayList, a3Var.d(dVar));
            h0 h0Var = h0.f84049a;
            return arrayList;
        } finally {
            z2VarV.d();
        }
    }

    private static final void r(SlotReader z2Var, List<Object> list, int i11) {
        if (z2Var.J(i11)) {
            list.add(z2Var.L(i11));
            return;
        }
        int iE = i11 + 1;
        int iE2 = i11 + z2Var.E(i11);
        while (iE < iE2) {
            r(z2Var, list, iE);
            iE += z2Var.E(iE);
        }
    }

    public static final void s(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void t(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void u(SlotWriter slotWriter, q2 q2Var) {
        int iF;
        int iG0;
        int currentGroup = slotWriter.getCurrentGroup();
        int currentGroupEnd = slotWriter.getCurrentGroupEnd();
        while (currentGroup < currentGroupEnd) {
            Object objD0 = slotWriter.D0(currentGroup);
            if (objD0 instanceof k) {
                q2Var.b((k) objD0, slotWriter.g0() - slotWriter.g1(currentGroup), -1, -1);
            }
            int iC1 = slotWriter.c1(slotWriter.groups, slotWriter.j0(currentGroup));
            int i11 = currentGroup + 1;
            int iQ = slotWriter.Q(slotWriter.groups, slotWriter.j0(i11));
            for (int i12 = iC1; i12 < iQ; i12++) {
                int i13 = i12 - iC1;
                Object obj = slotWriter.slots[slotWriter.R(i12)];
                if (obj instanceof s2) {
                    s2 s2Var = (s2) obj;
                    r2 wrapped = s2Var.getWrapped();
                    if (!(wrapped instanceof u2)) {
                        N(slotWriter, currentGroup, i13, obj);
                        int iG1 = slotWriter.g0() - i13;
                        d after = s2Var.getAfter();
                        if (after == null || !after.b()) {
                            iF = -1;
                            iG0 = -1;
                        } else {
                            iF = slotWriter.F(after);
                            iG0 = slotWriter.g0() - slotWriter.e1(iF);
                        }
                        q2Var.a(wrapped, iG1, iF, iG0);
                    }
                } else if (obj instanceof j2) {
                    N(slotWriter, currentGroup, i13, obj);
                    ((j2) obj).x();
                }
            }
            currentGroup = i11;
        }
    }

    private static final int v(SlotReader z2Var, int i11, int i12) {
        int i13 = 0;
        while (i11 > 0 && i11 != i12) {
            i11 = z2Var.P(i11);
            i13++;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<w0> w(List<w0> list, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        for (int iX = x(list, i11); iX < list.size(); iX++) {
            w0 w0Var = list.get(iX);
            if (w0Var.getLocation() >= i12) {
                break;
            }
            arrayList.add(w0Var);
        }
        return arrayList;
    }

    private static final int x(List<w0> list, int i11) {
        int iY = y(list, i11);
        return iY < 0 ? -(iY + 1) : iY;
    }

    private static final int y(List<w0> list, int i11) {
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int iM = s.m(list.get(i13).getLocation(), i11);
            if (iM < 0) {
                i12 = i13 + 1;
            } else {
                if (iM <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0 z(List<w0> list, int i11, int i12) {
        int iX = x(list, i11);
        if (iX >= list.size()) {
            return null;
        }
        w0 w0Var = list.get(iX);
        if (w0Var.getLocation() < i12) {
            return w0Var;
        }
        return null;
    }

    public static final void R() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(boolean z11) {
        return z11 ? 1 : 0;
    }

    public static final void S(int i11, int i12, int i13, String str) {
    }
}
