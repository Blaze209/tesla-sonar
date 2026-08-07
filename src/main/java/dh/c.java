package dh;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f60613d;

    public c(String str) {
        this.f60613d = str;
    }

    @Override // dh.b
    public void a() throws UnsupportedEncodingException {
        this.f60610a = (byte) 1;
        byte[] bytes = this.f60613d.getBytes("UTF-8");
        this.f60612c = bytes;
        this.f60611b = (byte) bytes.length;
    }
}
