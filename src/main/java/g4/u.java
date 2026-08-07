package g4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljn0/i;", "", "T", "Lg4/a;", "parentValue", "childValue", "a", "(Lg4/a;Lg4/a;)Lg4/a;"}, k = 3, mv = {1, 8, 0})
public final class u extends p013kotlin.jvm.internal.u implements wn0.p<AccessibilityAction<jn0.i<? extends Boolean>>, AccessibilityAction<jn0.i<? extends Boolean>>, AccessibilityAction<jn0.i<? extends Boolean>>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f67312c = new u();

    public u() {
        super(2);
    }

    @Override // wn0.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AccessibilityAction<jn0.i<? extends Boolean>> invoke(AccessibilityAction<jn0.i<? extends Boolean>> accessibilityAction, AccessibilityAction<jn0.i<? extends Boolean>> accessibilityAction2) {
        String label;
        jn0.i iVarA;
        if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
            label = accessibilityAction2.getLabel();
        }
        if (accessibilityAction == null || (iVarA = accessibilityAction.a()) == null) {
            iVarA = accessibilityAction2.a();
        }
        return new AccessibilityAction<>(label, iVarA);
    }
}
