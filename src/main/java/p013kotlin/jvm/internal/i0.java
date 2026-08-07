package p013kotlin.jvm.internal;

import co0.c;
import co0.m;

/* JADX INFO: loaded from: classes9.dex */
public abstract class i0 extends f implements m {
    private final boolean syntheticJavaProperty;

    public i0() {
        this.syntheticJavaProperty = false;
    }

    @Override // p013kotlin.jvm.internal.f
    public c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return getOwner().equals(i0Var.getOwner()) && getName().equals(i0Var.getName()) && getSignature().equals(i0Var.getSignature()) && s.f(getBoundReceiver(), i0Var.getBoundReceiver());
        }
        if (obj instanceof m) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // co0.m
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // co0.m
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.jvm.internal.f
    public m getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (m) super.getReflected();
    }

    public i0(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public i0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.syntheticJavaProperty = (i11 & 2) == 2;
    }
}
