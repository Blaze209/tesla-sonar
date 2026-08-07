package xh;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f123534a;

    public a(Context context) {
        this.f123534a = context;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    public String a(int i11, String str) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        if (i11 == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i11 == 1) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
        } else {
            if (i11 != 2) {
                if (i11 != 4) {
                    uri2 = null;
                } else {
                    uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
                }
                cursorQuery = this.f123534a.getContentResolver().query(uri2, null, null, null, null);
                if (cursorQuery != null) {
                    Log.d("VMS_IDLG_SDK_DB", "return cursor is null,return");
                    return null;
                }
                String string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                cursorQuery.close();
                return string;
            }
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
        }
        uri2 = uri;
        cursorQuery = this.f123534a.getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            Log.d("VMS_IDLG_SDK_DB", "return cursor is null,return");
            return null;
        }
        if (cursorQuery.moveToNext()) {
        }
        cursorQuery.close();
        return string;
    }
}
