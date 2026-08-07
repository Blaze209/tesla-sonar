package p013kotlin.jvm.internal;

import co0.c;
import co0.h;

/* JADX INFO: loaded from: classes9.dex */
public class o extends f implements n, h {
    private final int arity;
    private final int flags;

    public o(int i11) {
        this(i11, f.NO_RECEIVER, null, null, null, 0);
    }

    @Override // p013kotlin.jvm.internal.f
    protected c computeReflected() {
        return o0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return getName().equals(oVar.getName()) && getSignature().equals(oVar.getSignature()) && this.flags == oVar.flags && this.arity == oVar.arity && s.f(getBoundReceiver(), oVar.getBoundReceiver()) && s.f(getOwner(), oVar.getOwner());
        }
        if (obj instanceof h) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p013kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // co0.h
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // co0.h
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // co0.h
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // co0.h
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p013kotlin.jvm.internal.f, co0.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public o(int i11, Object obj) {
        this(i11, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.jvm.internal.f
    public h getReflected() {
        return (h) super.getReflected();
    }

    public o(int i11, Object obj, Class cls, String str, String str2, int i12) {
        super(obj, cls, str, str2, (i12 & 1) == 1);
        this.arity = i11;
        this.flags = i12 >> 1;
    }
}
