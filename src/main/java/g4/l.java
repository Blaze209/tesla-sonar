package g4;

import androidx.compose.ui.platform.t1;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R&\u00100\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00105\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00101\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u00104R\"\u00109\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u00104¨\u0006:"}, d2 = {"Lg4/l;", "Lg4/y;", "", "", "Lg4/x;", "", "<init>", "()V", "T", Action.KEY_ATTRIBUTE, "j", "(Lg4/x;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "k", "(Lg4/x;Lwn0/a;)Ljava/lang/Object;", "l", "", "iterator", "()Ljava/util/Iterator;", "value", "Ljn0/h0;", "b", "(Lg4/x;Ljava/lang/Object;)V", "", "e", "(Lg4/x;)Z", "h", "()Z", "child", "o", "(Lg4/l;)V", "peer", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "()Lg4/l;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/Map;", "props", "Z", "n", "q", "(Z)V", "isMergingSemanticsOfDescendants", "c", "m", "p", "isClearingSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements y, Iterable<Map.Entry<? extends x<?>, ? extends Object>>, xn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<x<?>, Object> props = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isMergingSemanticsOfDescendants;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g4.y
    public <T> void b(x<T> key, T value) {
        if (!(value instanceof AccessibilityAction) || !e(key)) {
            this.props.put(key, value);
            return;
        }
        Object obj = this.props.get(key);
        p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        Map<x<?>, Object> map = this.props;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) value;
        String label = accessibilityAction2.getLabel();
        if (label == null) {
            label = accessibilityAction.getLabel();
        }
        jn0.i iVarA = accessibilityAction2.a();
        if (iVarA == null) {
            iVarA = accessibilityAction.a();
        }
        map.put(key, new AccessibilityAction(label, iVarA));
    }

    public final void d(l peer) {
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry<x<?>, Object> entry : peer.props.entrySet()) {
            x<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.props.containsKey(key)) {
                this.props.put(key, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = this.props.get(key);
                p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                Map<x<?>, Object> map = this.props;
                String label = accessibilityAction.getLabel();
                if (label == null) {
                    label = ((AccessibilityAction) value).getLabel();
                }
                jn0.i iVarA = accessibilityAction.a();
                if (iVarA == null) {
                    iVarA = ((AccessibilityAction) value).a();
                }
                map.put(key, new AccessibilityAction(label, iVarA));
            }
        }
    }

    public final <T> boolean e(x<T> key) {
        return this.props.containsKey(key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return p013kotlin.jvm.internal.s.f(this.props, lVar.props) && this.isMergingSemanticsOfDescendants == lVar.isMergingSemanticsOfDescendants && this.isClearingSemantics == lVar.isClearingSemantics;
    }

    public final boolean h() {
        Set<x<?>> setKeySet = this.props.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((x) it.next()).getIsImportantForAccessibility()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    public final l i() {
        l lVar = new l();
        lVar.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        lVar.isClearingSemantics = this.isClearingSemantics;
        lVar.props.putAll(this.props);
        return lVar;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends x<?>, ? extends Object>> iterator() {
        return this.props.entrySet().iterator();
    }

    public final <T> T j(x<T> key) {
        T t11 = (T) this.props.get(key);
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public final <T> T k(x<T> key, wn0.a<? extends T> defaultValue) {
        T t11 = (T) this.props.get(key);
        return t11 == null ? defaultValue.invoke() : t11;
    }

    public final <T> T l(x<T> key, wn0.a<? extends T> defaultValue) {
        T t11 = (T) this.props.get(key);
        return t11 == null ? defaultValue.invoke() : t11;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void o(l child) {
        for (Map.Entry<x<?>, Object> entry : child.props.entrySet()) {
            x<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.props.get(key);
            p013kotlin.jvm.internal.s.i(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objC = key.c(obj, value);
            if (objC != null) {
                this.props.put(key, objC);
            }
        }
    }

    public final void p(boolean z11) {
        this.isClearingSemantics = z11;
    }

    public final void q(boolean z11) {
        this.isMergingSemanticsOfDescendants = z11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<x<?>, Object> entry : this.props.entrySet()) {
            x<?> key = entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(key.getName());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return t1.a(this, null) + "{ " + ((Object) sb2) + " }";
    }
}
