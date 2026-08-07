package nn0;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "start", "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", "", "name", "", "priority", "Lkotlin/Function0;", "Ljn0/h0;", "block", "Ljava/lang/Thread;", "a", "(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILwn0/a;)Ljava/lang/Thread;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: nn0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nn0/a$a", "Ljava/lang/Thread;", "Ljn0/h0;", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2031a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f95230a;

        C2031a(wn0.a<h0> aVar) {
            this.f95230a = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f95230a.invoke();
        }
    }

    public static final Thread a(boolean z11, boolean z12, ClassLoader classLoader, String str, int i11, wn0.a<h0> block) {
        s.k(block, "block");
        C2031a c2031a = new C2031a(block);
        if (z12) {
            c2031a.setDaemon(true);
        }
        if (i11 > 0) {
            c2031a.setPriority(i11);
        }
        if (str != null) {
            c2031a.setName(str);
        }
        if (classLoader != null) {
            c2031a.setContextClassLoader(classLoader);
        }
        if (z11) {
            c2031a.start();
        }
        return c2031a;
    }

    public static /* synthetic */ Thread b(boolean z11, boolean z12, ClassLoader classLoader, String str, int i11, wn0.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        if ((i12 & 4) != 0) {
            classLoader = null;
        }
        if ((i12 & 8) != 0) {
            str = null;
        }
        if ((i12 & 16) != 0) {
            i11 = -1;
        }
        int i13 = i11;
        String str2 = str;
        return a(z11, z12, classLoader, str2, i13, aVar);
    }
}
