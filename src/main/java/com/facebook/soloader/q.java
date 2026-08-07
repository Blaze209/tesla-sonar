package com.facebook.soloader;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes4.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f23967b;

    q(String str, List<String> list) {
        this.f23966a = str;
        this.f23967b = Collections.unmodifiableList(list);
    }

    public static q a(DataInputStream dataInputStream) throws IOException {
        String strC = c(dataInputStream);
        int i11 = dataInputStream.readShort() & HPKE.aead_EXPORT_ONLY;
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(d(dataInputStream));
        }
        return new q(strC, arrayList);
    }

    public static q b(InputStream inputStream) {
        return a(new DataInputStream(inputStream));
    }

    private static String c(DataInputStream dataInputStream) throws IOException {
        byte b11 = dataInputStream.readByte();
        if (b11 == 1) {
            return "arm64-v8a";
        }
        if (b11 == 2) {
            return "armeabi-v7a";
        }
        if (b11 == 3) {
            return "x86_64";
        }
        if (b11 == 4) {
            return "x86";
        }
        throw new RuntimeException("Unrecognized arch id: " + ((int) b11));
    }

    private static String d(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[dataInputStream.readShort() & HPKE.aead_EXPORT_ONLY];
        dataInputStream.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
