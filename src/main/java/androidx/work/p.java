package androidx.work;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/work/p;", "", "<init>", "()V", "", "className", "Landroidx/work/o;", "a", "(Ljava/lang/String;)Landroidx/work/o;", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class p {
    public abstract o a(String className);

    public final o b(String className) {
        p013kotlin.jvm.internal.s.k(className, "className");
        o oVarA = a(className);
        return oVarA == null ? q.a(className) : oVarA;
    }
}
