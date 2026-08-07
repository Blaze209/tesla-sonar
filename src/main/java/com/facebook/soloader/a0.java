package com.facebook.soloader;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class a0 extends b0 {
    public a0(String str, String str2) {
        super(str, str2);
    }

    public static a0 b(String str, Context context, d0[] d0VarArr) {
        StringBuilder sb2 = new StringBuilder("couldn't find DSO to load: ");
        sb2.append(str);
        sb2.append("\n\texisting SO sources: ");
        for (int i11 = 0; i11 < d0VarArr.length; i11++) {
            sb2.append("\n\t\tSoSource ");
            sb2.append(i11);
            sb2.append(": ");
            sb2.append(d0VarArr[i11].toString());
        }
        if (context != null) {
            sb2.append("\n\tNative lib dir: ");
            sb2.append(context.getApplicationInfo().nativeLibraryDir);
            sb2.append("\n");
        }
        return new a0(str, sb2.toString());
    }
}
