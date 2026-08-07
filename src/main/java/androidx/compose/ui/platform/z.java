package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import g4.AccessibilityAction;
import java.util.Iterator;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\b\u001a!\u0010\u0011\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0014\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\b¨\u0006\u0015"}, d2 = {"Lb4/g0;", "Lkotlin/Function1;", "", "selector", "j", "(Lb4/g0;Lwn0/l;)Lb4/g0;", "Lg4/p;", "h", "(Lg4/p;)Z", "Lg4/l;", "oldConfig", "l", "(Lg4/p;Lg4/l;)Z", IntegerTokenConverter.CONVERTER_KEY, "Lg4/a;", "", "other", "g", "(Lg4/a;Ljava/lang/Object;)Z", "k", "isRtl", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "it", "", "a", "(Lb4/g0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<b4.g0, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6088c = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(b4.g0 g0Var) {
            boolean z11;
            g4.l lVarH = g0Var.H();
            if (lVarH != null) {
                z11 = lVarH.getIsMergingSemanticsOfDescendants() && lVarH.e(g4.s.f67271a.g());
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!p013kotlin.jvm.internal.s.f(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.a() != null || accessibilityAction2.a() == null) {
            return accessibilityAction.a() == null || accessibilityAction2.a() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(g4.p pVar) {
        return !pVar.n().e(g4.s.f67271a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(g4.p pVar) {
        g4.l unmergedConfig = pVar.getUnmergedConfig();
        g4.s sVar = g4.s.f67271a;
        if (unmergedConfig.e(sVar.g()) && !p013kotlin.jvm.internal.s.f(g4.m.a(pVar.getUnmergedConfig(), sVar.i()), Boolean.TRUE)) {
            return true;
        }
        b4.g0 g0VarJ = j(pVar.getLayoutNode(), a.f6088c);
        if (g0VarJ != null) {
            g4.l lVarH = g0VarJ.H();
            if (!(lVarH != null ? p013kotlin.jvm.internal.s.f(g4.m.a(lVarH, sVar.i()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b4.g0 j(b4.g0 g0Var, wn0.l<? super b4.g0, Boolean> lVar) {
        for (b4.g0 g0VarN0 = g0Var.n0(); g0VarN0 != null; g0VarN0 = g0VarN0.n0()) {
            if (lVar.invoke(g0VarN0).booleanValue()) {
                return g0VarN0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(g4.p pVar) {
        return pVar.p().getLayoutDirection() == w4.t.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(g4.p pVar, g4.l lVar) {
        Iterator<Map.Entry<? extends g4.x<?>, ? extends Object>> it = lVar.iterator();
        while (it.hasNext()) {
            if (!pVar.n().e(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }
}
