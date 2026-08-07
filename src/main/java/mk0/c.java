package mk0;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes8.dex */
final class c implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f92284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f92285b;

    c(String str, String str2) {
        this.f92284a = str;
        this.f92285b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f92284a, this.f92285b);
    }
}
