package wp;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
final class d implements b.InterfaceC2624b {
    d() {
    }

    @Override // wp.b.InterfaceC2624b
    public String a(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // wp.b.InterfaceC2624b
    public String[] b() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !e.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // wp.b.InterfaceC2624b
    public void c(String str) {
        System.load(str);
    }

    @Override // wp.b.InterfaceC2624b
    public void d(String str) {
        System.loadLibrary(str);
    }

    @Override // wp.b.InterfaceC2624b
    public String e(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
