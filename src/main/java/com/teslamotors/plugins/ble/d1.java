package com.teslamotors.plugins.ble;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d1 {
    public static /* synthetic */ String a(Object[] objArr, Class cls, String str) {
        String[] strArrSplit = str.length() == 0 ? new String[0] : str.split(";");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls.getSimpleName());
        sb2.append("[");
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            sb2.append(strArrSplit[i11]);
            sb2.append("=");
            sb2.append(objArr[i11]);
            if (i11 != strArrSplit.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
