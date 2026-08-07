package p013kotlin.jvm.internal;

import co0.c;
import co0.g;
import co0.l;
import co0.q;
import co0.r;
import co0.u;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f implements c, Serializable {
    public static final Object NO_RECEIVER = a.f86513a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient c reflected;
    private final String signature;

    private static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f86513a = new a();

        private a() {
        }
    }

    public f() {
        this(NO_RECEIVER);
    }

    @Override // co0.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // co0.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public c compute() {
        c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    protected abstract c computeReflected();

    @Override // co0.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // co0.c
    public String getName() {
        return this.name;
    }

    public g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? o0.c(cls) : o0.b(cls);
    }

    @Override // co0.c
    public List<l> getParameters() {
        return getReflected().getParameters();
    }

    protected c getReflected() {
        c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new vn0.c();
    }

    @Override // co0.c
    public q getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // co0.c
    public List<r> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // co0.c
    public u getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // co0.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // co0.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // co0.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // co0.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected f(Object obj) {
        this(obj, null, null, null, false);
    }

    protected f(Object obj, Class cls, String str, String str2, boolean z11) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z11;
    }
}
