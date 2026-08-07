package kk0;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes8.dex */
final class a implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f86278a;

    a(String str) {
        this.f86278a = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f86278a, null);
    }
}
