package xo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Lxo0/l;", "", "<init>", "()V", "", "size", "", "b", "(I)[C", "array", "Ljn0/h0;", "a", "([C)V", "Lkotlin/collections/m;", "Lkotlin/collections/m;", "arrays", "I", "charsTotal", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.collections.m<char[]> arrays = new p013kotlin.collections.m<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int charsTotal;

    protected final void a(char[] array) {
        p013kotlin.jvm.internal.s.k(array, "array");
        synchronized (this) {
            try {
                if (this.charsTotal + array.length < j.f123845a) {
                    this.charsTotal += array.length;
                    this.arrays.addLast(array);
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final char[] b(int size) {
        char[] cArrS;
        synchronized (this) {
            cArrS = this.arrays.s();
            if (cArrS != null) {
                this.charsTotal -= cArrS.length;
            } else {
                cArrS = null;
            }
        }
        return cArrS == null ? new char[size] : cArrS;
    }
}
