package xh;

import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class c extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f123550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f123551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f123552c;

    public c(b bVar, int i11, String str) {
        super(null);
        this.f123552c = bVar;
        this.f123551b = i11;
        this.f123550a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11) {
        b bVar = this.f123552c;
        if (bVar != null) {
            bVar.e(this.f123551b, this.f123550a);
        } else {
            Log.e("VMS_IDLG_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}
