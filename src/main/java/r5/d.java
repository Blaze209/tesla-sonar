package r5;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.x;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.contacts.Columns;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x<c, ProviderInfo> f106989a = new x<>(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator<byte[]> f106990b = new Comparator() { // from class: r5.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f106991a;

        b(Context context, Uri uri) {
            this.f106991a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // r5.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f106991a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e11) {
                Log.w("FontsProvider", "Unable to query the content provider", e11);
                return null;
            }
        }

        @Override // r5.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f106991a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f106992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f106993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<List<byte[]>> f106994c;

        c(String str, String str2, List<List<byte[]>> list) {
            this.f106992a = str;
            this.f106993b = str2;
            this.f106994c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f106992a, cVar.f106992a) && Objects.equals(this.f106993b, cVar.f106993b) && Objects.equals(this.f106994c, cVar.f106994c);
        }

        public int hashCode() {
            return Objects.hash(this.f106992a, this.f106993b, this.f106994c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            byte b12 = bArr2[i11];
            if (b11 != b12) {
                return b11 - b12;
            }
        }
        return 0;
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!Arrays.equals(list.get(i11), list2.get(i11))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : j5.e.c(resources, eVar.c());
    }

    static g.a e(Context context, List<e> list, CancellationSignal cancellationSignal) {
        eb.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < list.size(); i11++) {
                e eVar = list.get(i11);
                ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
                if (providerInfoF == null) {
                    return g.a.b(1, null);
                }
                arrayList.add(g(context, eVar, providerInfoF.authority, cancellationSignal));
            }
            return g.a.a(0, arrayList);
        } finally {
            eb.a.f();
        }
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        eb.a.c("FontProvider.getProvider");
        try {
            List<List<byte[]>> listD = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), listD);
            ProviderInfo providerInfo = f106989a.get(cVar);
            if (providerInfo != null) {
                eb.a.f();
                return providerInfo;
            }
            String strE = eVar.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
            }
            List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, f106990b);
            for (int i11 = 0; i11 < listD.size(); i11++) {
                ArrayList arrayList = new ArrayList(listD.get(i11));
                Collections.sort(arrayList, f106990b);
                if (c(listB, arrayList)) {
                    f106989a.put(cVar, providerInfoResolveContentProvider);
                    eb.a.f();
                    return providerInfoResolveContentProvider;
                }
            }
            eb.a.f();
            return null;
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [r5.d$a] */
    /* JADX WARN: Type inference failed for: r16v7 */
    static g.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        boolean z11;
        eb.a.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath(Action.FILE_ATTRIBUTE).build();
            a aVarA = a.a(context, uriBuild);
            Cursor cursorB = null;
            try {
                String[] strArr = {Columns.ID, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                eb.a.c("ContentQueryWrapper.query");
                try {
                    try {
                        cursorB = aVarA.b(uriBuild, strArr, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
                        eb.a.f();
                        if (cursorB == null || cursorB.getCount() <= 0) {
                            aVar = aVarA;
                        } else {
                            int columnIndex = cursorB.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorB.getColumnIndex(Columns.ID);
                            int columnIndex3 = cursorB.getColumnIndex("file_id");
                            int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorB.getColumnIndex("font_weight");
                            int columnIndex6 = cursorB.getColumnIndex("font_italic");
                            while (cursorB.moveToNext()) {
                                int i11 = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                                int i12 = columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0;
                                Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3));
                                int i13 = columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z11 = true;
                                    if (cursorB.getInt(columnIndex6) != 1) {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = false;
                                }
                                arrayList2.add(g.b.a(uriWithAppendedId, i12, i13, z11, i11));
                                aVarA = aVarA;
                            }
                            aVar = aVarA;
                            arrayList = arrayList2;
                        }
                        if (cursorB != null) {
                            cursorB.close();
                        }
                        aVar.close();
                        return (g.b[]) arrayList.toArray(new g.b[0]);
                    } finally {
                        eb.a.f();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r16 = context;
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r16 = aVarA;
            }
        } catch (Throwable th4) {
            eb.a.f();
            throw th4;
        }
    }
}
