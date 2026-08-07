package yx;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d implements Parcelable {

    public static abstract class a implements Parcelable {
        @NonNull
        public abstract Uri a();

        public abstract String b();
    }

    public static abstract class b implements Parcelable {
        public abstract int a();

        @NonNull
        public abstract Uri b();
    }

    public static d a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (d) intent.getParcelableExtra("extra_scanning_result");
    }

    @NonNull
    public static d d(List list, List list2, Uri uri, int i11) {
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            zzn.zza(list2.size() == list.size(), "Error: imageHashes and imageUris size mismatch.");
            for (int i12 = 0; i12 < list2.size(); i12++) {
                arrayList.add(new k((Uri) list.get(i12), (String) list2.get(i12)));
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new k((Uri) it.next(), null));
            }
        }
        return new i(arrayList, uri != null ? new m(uri, i11) : null);
    }

    public abstract List<a> b();

    public abstract b c();
}
