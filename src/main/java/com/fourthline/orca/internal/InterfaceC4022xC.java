package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4022xC extends Eh {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xC$a */
    public static final class a {
        public static wn0.l a(InterfaceC4022xC interfaceC4022xC, final boolean z11) {
            return new wn0.l() { // from class: com.fourthline.orca.internal.xh1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return InterfaceC4022xC.a.a(z11, (C3721qC) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C3721qC a(boolean z11, C3721qC c3721qC) {
            p013kotlin.jvm.internal.s.k(c3721qC, "<this>");
            boolean z12 = !z11;
            return C3721qC.a(c3721qC, null, null, null, null, null, c3721qC.s().a(z12, z11), c3721qC.t().a(z12), 31, null);
        }

        public static wn0.l a(InterfaceC4022xC interfaceC4022xC, final Object type) {
            p013kotlin.jvm.internal.s.k(type, "type");
            return new wn0.l() { // from class: com.fourthline.orca.internal.yh1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return InterfaceC4022xC.a.a(type, (C3721qC) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C3721qC a(Object obj, C3721qC c3721qC) {
            p013kotlin.jvm.internal.s.k(c3721qC, "<this>");
            List<C3721qC.b> listR = c3721qC.r();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listR, 10));
            for (C3721qC.b bVarA : listR) {
                int i11 = b.$EnumSwitchMapping$0[bVarA.d().ordinal()];
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVarA = C3721qC.b.a(bVarA, p013kotlin.jvm.internal.s.f(obj, bVarA.f()) ? C3721qC.d.CHECKED : C3721qC.d.UNCHECKED, null, null, null, null, null, 62, null);
                }
                arrayList.add(bVarA);
            }
            return C3721qC.a(c3721qC, null, null, arrayList, null, null, c3721qC.s().b(true), null, 91, null);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xC$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C3721qC.d.values().length];
            try {
                iArr[C3721qC.d.NOT_ACCEPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3721qC.d.CHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3721qC.d.UNCHECKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    wn0.l a(Object obj);

    wn0.l a(boolean z11);
}
